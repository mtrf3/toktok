package com.bytedance.touchpoint.data.request;

import X.AbstractC73672Svk;
import X.C10K;
import X.C76L;
import X.E8L;
import X.E8M;
import X.InterfaceC195747mE;
import X.InterfaceC36228EJs;
import X.InterfaceC36332ENs;
import X.InterfaceC64986Pew;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.core.model.ReferralWidgetResponse;
import com.bytedance.touchpoint.core.model.TaskDoneReponse;
import com.bytedance.touchpoint.core.model.TouchPointsResponse;
import java.util.Map;

/* loaded from: classes5.dex */
public interface INetworkApi {
    @E8M("/tiktok/incentive/v1/notification/click_from_reflow")
    AbstractC73672Svk<Object> clickFromReflow(@InterfaceC64986Pew("invite_code") String str, @InterfaceC64986Pew("mentor_uid") String str2);

    @E8M
    C10K<String> confirmAgeGate(@InterfaceC195747mE String str);

    @E8M("/tiktok/incentive/v1/coin/client_task_done")
    C76L<TaskDoneReponse> getCoinTaskAwardByTaskId(@InterfaceC64986Pew("task_key") String str, @InterfaceC64986Pew("task_time") int i, @InterfaceC64986Pew("watch_time") long j);

    @E8L("/tiktok/touchpoint/user/widget/launchplan/get")
    C76L<ReferralWidgetResponse> getReferralAppWidgetInfo();

    @E8M("/luckycat/tiktokm/v1/task/done/{task_id}")
    C76L<TaskDoneReponse> getTaskAwardByTaskId(@InterfaceC36332ENs("task_id") String str, @InterfaceC64986Pew("task_time") int i);

    @E8M("/tiktok/incentive/v1/task/done/{task_id}")
    C76L<TaskDoneReponse> getTaskAwardByTaskIdWithNewPath(@InterfaceC36332ENs("task_id") String str, @InterfaceC64986Pew("task_time") int i);

    @E8L("/tiktok/touchpoint/user/launchplan/get/v1/")
    C76L<TouchPointsResponse> getTouchPoint(@InterfaceC64986Pew("request_type") Integer num);

    @E8L("/tiktok/touchpoint/user/launchplan/get/v1/")
    C76L<TouchPointsResponse> getTouchPointById(@InterfaceC64986Pew("touchpoint_id") int i, @InterfaceC64986Pew("mentor_uid") String str, @InterfaceC64986Pew("onboarded") String str2, @InterfaceC64986Pew("installed") String str3);

    @E8L("/tiktok/touchpoint/user/launchplan/preview/v1/")
    C76L<String> getTouchPointPreview(@InterfaceC36228EJs(encode = false) Map<String, String> map);

    @E8M("/tiktok/incentive/v1/ttn/task/done/post_invite_code")
    C76L<InviteCodeResponse> postInviterCode(@InterfaceC64986Pew("inviter_code") String str);

    @E8M("/tiktok/incentive/v1/notification/action")
    C10K<String> requestOnNotificationAction(@InterfaceC64986Pew("notification_id") String str, @InterfaceC64986Pew("notification_action_type") int i, @InterfaceC64986Pew("notification_classification") String str2, @InterfaceC64986Pew("notification_material_id") String str3, @InterfaceC64986Pew("notification_multi_show_count") int i2, @InterfaceC64986Pew("notification_is_auto") Integer num);

    @E8M("/tiktok/incentive/v1/inapp_push/click ")
    C10K<String> requestOnPopupClick(@InterfaceC64986Pew("inapp_push_id") int i, @InterfaceC64986Pew("inapp_push_click_type") int i2);

    @E8M("/tiktok/touchpoint/platform/touchpoint/click/v1/")
    C10K<String> requestTouchPointClick(@InterfaceC64986Pew("touchpoint_id") int i, @InterfaceC64986Pew("action") int i2, @InterfaceC64986Pew("launch_plan_id") int i3);

    @E8M("/tiktok/touchpoint/platform/touchpoint/show/v1/")
    C10K<String> requestTouchPointShow(@InterfaceC64986Pew("touchpoint_id") int i, @InterfaceC64986Pew("launch_plan_id") int i2);

    @E8M("/tiktok/incentive/v1/inviter_code/update")
    C10K<String> updateInviterCode(@InterfaceC64986Pew("inviter_code") String str);
}
