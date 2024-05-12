package X;

/* renamed from: X.XAv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84409XAv extends XCZ {
    public final /* synthetic */ C84393XAf LJI;
    public final /* synthetic */ String[] LJII;
    public final /* synthetic */ java.util.Map LJIIIIZZ;
    public final /* synthetic */ XDR LJIIIZ;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    @Override // X.XCZ
    public final void LIZ() {
        try {
            this.LJI.LIZJ().LIZJ(ORY.LJJZZIII(this.LJII), this.LJIIIIZZ);
            XDR xdr = this.LJIIIZ;
            if (xdr != null) {
                xdr.onSuccess(Long.valueOf(this.LJI.LIZLLL().getEffectHandle()));
            }
        } catch (Exception e) {
            XDR xdr2 = this.LJIIIZ;
            if (xdr2 != null) {
                xdr2.onFail(null, new C84418XBe(e));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84409XAv(C84393XAf c84393XAf, String[] strArr, java.util.Map map, XDR xdr, String str) {
        super(str, null);
        this.LJI = c84393XAf;
        this.LJII = strArr;
        this.LJIIIIZZ = map;
        this.LJIIIZ = xdr;
    }
}
