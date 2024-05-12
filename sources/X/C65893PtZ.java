package X;

/* renamed from: X.PtZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65893PtZ implements R47 {
    public final /* synthetic */ C65889PtV LIZ;
    public final /* synthetic */ String LIZIZ;

    public C65893PtZ(C65889PtV c65889PtV, String str) {
        this.LIZ = c65889PtV;
        this.LIZIZ = str;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        C65889PtV c65889PtV = this.LIZ;
        String str = this.LIZIZ;
        if (i == 1 && i2 == 1) {
            C2U8.LIZ(new QX2(str));
        }
        c65889PtV.LIZJ.set(false);
    }
}
