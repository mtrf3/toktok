package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fl5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39887Fl5 implements InterfaceC61488OBg {
    public String LIZ = "hybridkit_default_bid";

    @Override // X.InterfaceC61488OBg
    public void onUnRegister() {
    }

    public final String getBid() {
        return this.LIZ;
    }

    @Override // X.InterfaceC61488OBg
    public final void onRegister(String bid) {
        o.LJIIJ(bid, "bid");
        this.LIZ = bid;
    }
}
