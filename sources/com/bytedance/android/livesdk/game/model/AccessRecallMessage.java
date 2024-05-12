package com.bytedance.android.livesdk.game.model;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class AccessRecallMessage extends CR6 {

    @InterfaceC65349Pkn("content")
    public Text content;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("notice")
    public Text notice;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("status")
    public int status;

    public AccessRecallMessage() {
        this.type = EnumC31509CYf.ACCESS_RECALL_MESSAGE;
        this.scene = "";
    }
}
