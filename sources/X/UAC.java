package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAC implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ Long LJLJLJ;

    public UAC(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, boolean z, long j3, Long l) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = z;
        this.LJLJL = j3;
        this.LJLJLJ = l;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            long j3 = this.LJLJL;
            Long l = this.LJLJLJ;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("msg_id", j3);
            LJIIZILJ.put("reason", l);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "destroy_channel_message", LJIIZILJ, j, j2);
        }
        UC0.LJJJJJL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, "destroy_channel_message", UC0.LJIIZILJ(6, 0L, null), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        U66 u66 = this.LJLILLLLZI;
        UC0.LJJJJJ(u66, 2, this.LJLIL.LIZIZ.LIZLLL(u66), this.LJLIL.LIZJ);
        UC0.LJJJJLI("destroy_channel_message", null, 0L, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLJI, this.LJLJJLL);
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
