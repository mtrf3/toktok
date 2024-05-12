package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class PerceptionDialogInfo {

    @InterfaceC65349Pkn("advice_action_text")
    public Text adviceActionText;

    @InterfaceC65349Pkn("count_down_time")
    public long countDownTime;

    @InterfaceC65349Pkn("default_action_text")
    public Text defaultActionText;

    @InterfaceC65349Pkn("icon_type")
    public long iconType;

    @InterfaceC65349Pkn("policy_tip")
    public long policyTip;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("show_feedback")
    public boolean showFeedback;

    @InterfaceC65349Pkn("sub_title")
    public Text subTitle;

    @InterfaceC65349Pkn("target_room_id")
    public long targetRoomId;

    @InterfaceC65349Pkn("target_user_id")
    public long targetUserId;

    @InterfaceC65349Pkn("title")
    public Text title;

    @InterfaceC65349Pkn("violation_detail_url")
    public String violationDetailUrl = "";

    @InterfaceC65349Pkn("feedback_options")
    public List<PerceptionFeedbackOption> feedbackOptions = new ArrayList();
}
