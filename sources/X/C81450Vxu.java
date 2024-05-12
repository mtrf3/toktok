package X;

/* renamed from: X.Vxu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81450Vxu<T> implements InterfaceC15040iS {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C81449Vxt LIZIZ;

    public C81450Vxu(boolean z, C81449Vxt c81449Vxt) {
        this.LIZ = z;
        this.LIZIZ = c81449Vxt;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        if (this.LIZ) {
            this.LIZIZ.LLJJI().s2();
            this.LIZIZ.LLJJ();
            return;
        }
        C81449Vxt c81449Vxt = this.LIZIZ;
        WMH wmh = (WMH) c81449Vxt.mParentScene;
        if (wmh == null) {
            return;
        }
        wmh.hide(c81449Vxt);
    }
}
