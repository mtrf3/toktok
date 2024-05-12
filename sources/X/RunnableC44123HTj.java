package X;

/* renamed from: X.HTj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44123HTj implements Runnable {
    public final /* synthetic */ C44125HTl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ HTE LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC44123HTj(C44125HTl c44125HTl, String str, String str2, HTE hte, String str3) {
        this.LJLIL = c44125HTl;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = hte;
        this.LJLJJL = str3;
    }

    public final void LIZ() {
        C44125HTl c44125HTl = this.LJLIL;
        if (c44125HTl.LLFII) {
            return;
        }
        C44108HSu.LIZJ(c44125HTl.getShortVideoContext(), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLIL.LJLLILLLL(System.currentTimeMillis()), "");
        this.LJLIL.LJJLIIIJILLIZJL(this.LJLJJL, new C44124HTk(false, true, true), null);
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
