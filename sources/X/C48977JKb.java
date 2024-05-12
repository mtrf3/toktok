package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48977JKb implements InterfaceC48983JKh {
    public final InterfaceC48980JKe LIZ;

    @Override // X.InterfaceC48983JKh
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC48983JKh
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC48983JKh
    public final void onPause() {
    }

    @Override // X.InterfaceC48983JKh
    public final void LIZ() {
        this.LIZ.c();
    }

    public C48977JKb(C49187JSd playCompleteListener) {
        o.LJIIIZ(playCompleteListener, "playCompleteListener");
        this.LIZ = playCompleteListener;
    }
}
