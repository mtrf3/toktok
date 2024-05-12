package X;

import org.json.JSONObject;

/* renamed from: X.UAe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76748UAe implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    public RunnableC76748UAe(U66 u66, long j, long j2, long j3, String str, OSZ<Long, String> osz, JSONObject jSONObject, String str2, String str3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = str;
        this.LJLJJLL = osz;
        this.LJLJL = jSONObject;
        this.LJLJLJ = str2;
        this.LJLJLLL = str3;
    }

    public final void LIZ() {
        boolean z;
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, String.valueOf(this.LJLILLLLZI), U85.INVITER);
        if (LIZJ != null) {
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            String str = this.LJLJJL;
            OSZ<Long, String> osz = this.LJLJJLL;
            JSONObject jSONObject = this.LJLJL;
            String str2 = this.LJLJLJ;
            String str3 = this.LJLJLLL;
            if (str2 != null) {
                LIZJ.LIZJ(str2);
            }
            if (str3 != null) {
                LIZJ.LIZLLL(str3);
            }
            long j3 = j - j2;
            UAR.LIZIZ(LIZJ, "invite", j3, str, osz.getFirst().longValue());
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "invite", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str), j2, j);
            if (osz.getFirst().longValue() == 0) {
                z = true;
            } else {
                z = false;
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 2);
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
            UAR.LJ(LIZJ, z, j3);
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
