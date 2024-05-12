package X;

/* renamed from: X.Qo2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68098Qo2 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ BinderC68232QqC LJLJJL;

    public RunnableC68098Qo2(BinderC68232QqC binderC68232QqC, String str, String str2, String str3, long j) {
        this.LJLJJL = binderC68232QqC;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = j;
    }

    public final void LIZ() {
        ((InterfaceC68146Qoo) C68177QpJ.LJLILLLLZI.LJLIL.zza()).zza();
        if (this.LJLJJL.LJLIL.LJJIJIL().LJIILJJIL(null, C68555QvP.LJJLJ)) {
            String str = this.LJLIL;
            if (str == null) {
                C68241QqL c68241QqL = this.LJLJJL.LJLIL;
                String str2 = this.LJLILLLLZI;
                c68241QqL.LIZIZ().LJFF();
                String str3 = c68241QqL.LJJIIJZLJL;
                if (str3 != null && !str3.equals(str2)) {
                    return;
                }
                c68241QqL.LJJIIJZLJL = str2;
                c68241QqL.LJJIIJ = null;
                return;
            }
            C68132Qoa c68132Qoa = new C68132Qoa(this.LJLJI, str, this.LJLJJI);
            C68241QqL c68241QqL2 = this.LJLJJL.LJLIL;
            String str4 = this.LJLILLLLZI;
            c68241QqL2.LIZIZ().LJFF();
            String str5 = c68241QqL2.LJJIIJZLJL;
            if (str5 != null) {
                str5.equals(str4);
            }
            c68241QqL2.LJJIIJZLJL = str4;
            c68241QqL2.LJJIIJ = c68132Qoa;
            return;
        }
        if (this.LJLIL == null) {
            this.LJLJJL.LJLIL.LJIIJJI.LJIJI().LJIILL(this.LJLILLLLZI, null);
            return;
        }
        C68084Qno LJIJI = this.LJLJJL.LJLIL.LJIIJJI.LJIJI();
        String str6 = this.LJLILLLLZI;
        LJIJI.LJFF();
        synchronized (LJIJI) {
            String str7 = LJIJI.LJIIL;
            if (str7 != null) {
                str7.equals(str6);
            }
            LJIJI.LJIIL = str6;
        }
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
