package com.bytedance.android.livesdk.model.message.redenvelope;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class RedEnvelopMessage extends CR6 {
    public boolean LJLIL;

    @InterfaceC65349Pkn("display")
    public int display;

    @InterfaceC65349Pkn("envelope_info")
    public MessageRedEnvelopInfo envelopeInfo;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.display == 1 && this.LJLIL) {
            return true;
        }
        return false;
    }

    public RedEnvelopMessage() {
        this.type = EnumC31509CYf.RED_ENVELOPE_MESSAGE;
        this.LJLIL = true;
    }
}
