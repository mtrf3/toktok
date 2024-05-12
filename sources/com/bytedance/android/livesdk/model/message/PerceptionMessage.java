package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class PerceptionMessage extends CR6 {

    @InterfaceC65349Pkn("dialog")
    public PerceptionDialogInfo dialog;

    @InterfaceC65349Pkn("end_time")
    public int endTime;

    @InterfaceC65349Pkn("float_style")
    public int floatStyle;

    @InterfaceC65349Pkn("float_text")
    public Text floatText;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo publicEventInfo;

    @InterfaceC65349Pkn("show_violation_warning")
    public Boolean showViolation;

    @InterfaceC65349Pkn("toast")
    public Text toast;

    public PerceptionMessage() {
        this.type = EnumC31509CYf.PERCEPTION_MESSAGE;
    }
}
