package X;

/* loaded from: classes19.dex */
public class ZUS extends ZUM {
    public final /* synthetic */ ZTV LJLILLLLZI;

    public ZUS(ZTV ztv) {
        this.LJLILLLLZI = ztv;
    }

    @Override // X.ZU3
    public final void LLZLLLL(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("info: ");
        LIZ.append(i);
        LIZ.append(",msg: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("ByteBenchServiceManager");
        ZU6 zu6 = this.LJLILLLLZI.LJ;
        if (zu6 != null) {
            ((ZUR) zu6).LIZIZ(i, str);
        }
    }

    @Override // X.ZU3
    public final void onEvent(String str, String str2) {
        C38891fp.LJJIII(str, str2);
    }

    @Override // X.ZU3
    public final void onError(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error: ");
        LIZ.append(i);
        LIZ.append(",ret: ");
        LIZ.append(i2);
        LIZ.append(",msg: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("ByteBenchServiceManager");
        ZU6 zu6 = this.LJLILLLLZI.LJ;
        if (zu6 != null) {
            ((ZUR) zu6).LIZ(i, i2, str);
        }
    }
}
