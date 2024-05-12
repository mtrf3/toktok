package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class KaraokeSwitchMessage extends CR6 {

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("type")
    public int type;

    public KaraokeSwitchMessage() {
        super.type = EnumC31509CYf.KARAOKE_SWITCH_MESSAGE;
    }
}
