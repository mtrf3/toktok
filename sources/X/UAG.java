package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAG implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ long LJLL;

    public UAG(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, OSZ<Long, String> osz, String str, boolean z, boolean z2, long j3, long j4) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = osz;
        this.LJLJL = str;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = j4;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            OSZ<Long, String> osz = this.LJLJJLL;
            String str = this.LJLJL;
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            long j3 = this.LJLL;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIILLIIL = UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str);
            LJIILLIIL.put("retry_count", j3);
            C77119UOl.LJIJJ(c76786UBq, LIZ, jSONObject, "join_channel", LJIILLIIL, j, j2);
        }
        U66 u66 = this.LJLILLLLZI;
        long j4 = this.LJLJI;
        long j5 = this.LJLJJI;
        JSONObject jSONObject2 = this.LJLJJL;
        JSONObject LJIILLIIL2 = UC0.LJIILLIIL(this.LJLJJLL.getFirst(), this.LJLJJLL.getSecond(), this.LJLJL);
        LJIILLIIL2.put("retry_count", this.LJLL);
        UC0.LJJJJIZL(u66, j4, j5, jSONObject2, "join_channel", LJIILLIIL2, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        String str2 = this.LJLJL;
        long longValue = this.LJLJJLL.getFirst().longValue();
        long j6 = this.LJLJJI - this.LJLJI;
        U66 u662 = this.LJLILLLLZI;
        UC0.LJJJJL("join_channel", str2, longValue, j6, u662, this.LJLIL.LIZIZ.LIZLLL(u662));
        if (!this.LJLJLJ) {
            U66 u663 = this.LJLILLLLZI;
            UC0.LJJJJJ(u663, 2, this.LJLIL.LIZIZ.LIZLLL(u663), this.LJLIL.LIZJ);
            UC0.LJJJJLI("join_channel", null, this.LJLJJLL.getFirst().longValue(), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLJJI, this.LJLJLLL);
            this.LJLIL.LIZIZ.LJ(this.LJLILLLLZI);
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
