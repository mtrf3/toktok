package X;

/* renamed from: X.U4u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76608U4u extends UF5 {
    public final /* synthetic */ U5C LIZ;

    public C76608U4u(U5C u5c) {
        this.LIZ = u5c;
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        this.LIZ.LJI = true;
        C0NB.LJIIIZ("WindowMaskDrawable", "preload image success");
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        C0NB.LJIIIZ("WindowMaskDrawable", "preload image fail");
    }
}
