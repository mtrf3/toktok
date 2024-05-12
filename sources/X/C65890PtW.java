package X;

/* renamed from: X.PtW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65890PtW extends QNA {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C65889PtV LIZIZ;

    @Override // X.QNA
    public final void LIZ() {
        this.LIZIZ.LIZJ.set(false);
    }

    public C65890PtW(C65889PtV c65889PtV, String str) {
        this.LIZ = str;
        this.LIZIZ = c65889PtV;
    }

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        if (z) {
            C2U8.LIZ(new QX2(this.LIZ));
        }
        this.LIZIZ.LIZJ.set(false);
    }
}
