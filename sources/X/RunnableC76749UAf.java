package X;

import org.json.JSONObject;

/* renamed from: X.UAf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76749UAf implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ long LJLJLJ;

    public RunnableC76749UAf(U66 u66, String str, JSONObject jSONObject, long j, long j2, long j3, boolean z, long j4) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = z;
        this.LJLJLJ = j4;
    }

    public final void LIZ() {
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, this.LJLILLLLZI, null);
        if (LIZJ != null) {
            JSONObject jSONObject = this.LJLJI;
            long j = this.LJLJJI;
            long j2 = this.LJLJJL;
            long j3 = this.LJLJJLL;
            boolean z = this.LJLJL;
            long j4 = this.LJLJLJ;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("msg_id", j4);
            LJIIZILJ.put("reason", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "leave_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(LJ, LIZJ, 2);
            UAR.LJFF(0L, j, LIZJ, "leave_message", String.valueOf(j3), z);
            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
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
