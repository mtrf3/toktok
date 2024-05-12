package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.abg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94108abg<T> implements InterfaceC93663aUV<T> {
    public final /* synthetic */ XJL LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception("download model fail"));
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    public C94108abg(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(T t) {
        if (t != null) {
            XJL xjl = this.LIZ;
            C3C5.m7constructorimpl(t);
            xjl.resumeWith(t);
        } else {
            XJL xjl2 = this.LIZ;
            C3C4 LIZ = C141335gf.LIZ(new Exception("download model fail"));
            C3C5.m7constructorimpl(LIZ);
            xjl2.resumeWith(LIZ);
        }
    }
}
