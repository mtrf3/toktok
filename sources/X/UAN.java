package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAN implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    public UAN(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, int i, String str, long j3, boolean z) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = i;
        this.LJLJL = str;
        this.LJLJLJ = j3;
        this.LJLJLLL = z;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            int i = this.LJLJJLL;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, jSONObject, "rtc_join_channel_failed", UC0.LJIIZILJ(4, Long.valueOf(i), this.LJLJL), this.LJLJI, this.LJLJJI);
        }
        UC0.LJJJJJL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, "rtc_join_channel_failed", UC0.LJIIZILJ(4, Long.valueOf(this.LJLJJLL), this.LJLJL), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        U66 u66 = this.LJLILLLLZI;
        UC0.LJJJJJ(u66, 2, this.LJLIL.LIZIZ.LIZLLL(u66), this.LJLIL.LIZJ);
        UC0.LJJJJL("rtc_join_channel", null, this.LJLJJLL, this.LJLJI - this.LJLJLJ, this.LJLILLLLZI, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI));
        UC0.LJJJJLI("rtc_join_channel", null, this.LJLJJLL, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLJI, this.LJLJLLL);
        this.LJLIL.LIZIZ.LJ(this.LJLILLLLZI);
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
