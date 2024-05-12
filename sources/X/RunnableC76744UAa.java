package X;

import org.json.JSONObject;

/* renamed from: X.UAa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76744UAa implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC76744UAa(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, long j3, String str) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = j3;
        this.LJLJL = str;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            String str = this.LJLJL;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("rtc_business_id", str);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "rtc_join_channel_succeed", LJIIZILJ, j, j2);
        }
        U66 u66 = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        long j4 = this.LJLJJI;
        JSONObject jSONObject2 = this.LJLJJL;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ2.put("rtc_business_id", this.LJLJL);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "rtc_join_channel_succeed", LJIIZILJ2, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        UC0.LJJJJL("rtc_join_channel", null, 0L, this.LJLJI - this.LJLJJLL, this.LJLILLLLZI, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI));
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
