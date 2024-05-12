package X;

import java.util.List;

/* renamed from: X.XAx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84411XAx extends XCZ {
    public final /* synthetic */ C84393XAf LJI;
    public final /* synthetic */ List LJII;
    public final /* synthetic */ XDR LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        try {
            this.LJI.LIZJ().LIZJ(this.LJII, null);
            XDR xdr = this.LJIIIIZZ;
            if (xdr != null) {
                Object[] array = this.LJII.toArray(new String[0]);
                if (array != null) {
                    xdr.onSuccess(array);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } catch (Exception e) {
            XDR xdr2 = this.LJIIIIZZ;
            if (xdr2 != null) {
                xdr2.onFail(null, new C84418XBe(e));
            }
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84411XAx(C84393XAf c84393XAf, List list, XDR xdr, String str) {
        super(str, null);
        this.LJI = c84393XAf;
        this.LJII = list;
        this.LJIIIIZZ = xdr;
    }
}
