package X;

/* renamed from: X.IFs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC46316IFs implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ double LJLJJI;

    public RunnableC46316IFs(String str, String str2, String str3, double d) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = d;
    }

    public final void LIZ() {
        double LJII = C47636Imm.LJII(2);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLIL);
        c188727au.LJIIIZ("to_status", this.LJLILLLLZI);
        c188727au.LJIIIZ("group_id", this.LJLJI);
        c188727au.LIZLLL(IG3.LIZLLL() ? 1 : 0, "earphone_status");
        c188727au.LIZJ("from_volume_value", this.LJLJJI);
        c188727au.LIZJ("from_volume_pct", this.LJLJJI);
        c188727au.LIZJ("to_volume_value", LJII);
        c188727au.LIZJ("to_volume_pct", LJII);
        FMX.LJIIL("adjust_volumn", c188727au.LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
