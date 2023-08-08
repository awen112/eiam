/*
 * eiam-console - Employee Identity and Access Management
 * Copyright © 2022-Present Jinan Yuanchuang Network Technology Co., Ltd. (support@topiam.cn)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.topiam.employee.console.pojo.result.setting;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 安全策略
 *
 * @author TopIAM
 * Created by support@topiam.cn on 2023-03-09
 */
@Schema(description = "获取安全策略")
@Data
public class SecurityDefensePolicyConfigResult implements Serializable {

    @Serial
    private static final long serialVersionUID = 2578080414501381617L;

    /**
     * 连续登录失败持续时间
     */
    @Parameter(description = "连续登录失败持续时间")
    private Integer           loginFailureDuration;

    /**
     * 连续登录失败次数
     */
    @Parameter(description = "连续登录失败次数")
    private Integer           loginFailureCount;

    /**
     * 自动解锁时间（分）
     */
    @Parameter(description = "自动解锁时间（分）")
    private Integer           autoUnlockTime;

    /**
     * 内容安全策略
     */
    @Parameter(description = "内容安全策略")
    private String            contentSecurityPolicy;
}
