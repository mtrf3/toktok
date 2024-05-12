package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;

/* loaded from: classes6.dex */
public class LinkMicSignalMessage extends CR6 {
    public LinkMicSignal LJLIL;

    @InterfaceC65349Pkn("content")
    public String signal;

    public final LinkMicSignal LIZ() {
        LinkMicSignal linkMicSignal = this.LJLIL;
        if (linkMicSignal != null) {
            return linkMicSignal;
        }
        String str = this.signal;
        if (str != null) {
            try {
                LinkMicSignal linkMicSignal2 = (LinkMicSignal) new Gson().LJI(str.replaceAll("\\\\", ""), LinkMicSignal.class);
                this.LJLIL = linkMicSignal2;
                return linkMicSignal2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public LinkMicSignalMessage() {
        this.type = EnumC31509CYf.LINK_MIC_SIGNAL;
    }
}
