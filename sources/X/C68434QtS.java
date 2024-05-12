package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QtS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68434QtS implements InterfaceC67679QhH {
    public final /* synthetic */ InterfaceC67679QhH LJLIL;

    public C68434QtS(C68433QtR c68433QtR) {
        this.LJLIL = c68433QtR;
    }

    @Override // X.InterfaceC67679QhH
    public final void onFailure(Exception e) {
        o.LJIIIZ(e, "e");
        InterfaceC67679QhH interfaceC67679QhH = this.LJLIL;
        if (interfaceC67679QhH != null) {
            interfaceC67679QhH.onFailure(e);
        }
    }
}
