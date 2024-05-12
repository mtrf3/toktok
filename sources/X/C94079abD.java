package X;

import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;

/* renamed from: X.abD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94079abD implements InterfaceC93942aZ0 {
    public final /* synthetic */ XJL LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        IMain LIZ;
        if (this.LIZIZ && (LIZ = C93723aVT.LIZ()) != null) {
            LIZ.mainLoading(false);
        }
        XJL xjl = this.LIZ;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    public C94079abD(XKS xks, boolean z) {
        this.LIZ = xks;
        this.LIZIZ = z;
    }
}
