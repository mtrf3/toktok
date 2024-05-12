package X;

/* loaded from: classes5.dex */
public final class A0I<T> implements InterfaceC04760Gq {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ boolean LIZIZ = true;

    public A0I(C29701Eo c29701Eo) {
        this.LIZ = c29701Eo;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        C0GY c0gy = (C0GY) obj;
        if (c0gy != null) {
            this.LIZ.setComposition(c0gy);
            if (this.LIZIZ) {
                this.LIZ.playAnimation();
            }
        }
    }
}
