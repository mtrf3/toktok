package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UA7 implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public UA7(U66 u66, String str, JSONObject jSONObject, long j, long j2, boolean z) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = z;
    }

    public final void LIZ() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ(this.LJLIL, this.LJLILLLLZI, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = this.LJLJI;
            long j = this.LJLJJI;
            long j2 = this.LJLJJL;
            boolean z = this.LJLJJLL;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("mute", z);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "rtc_mute_all", LJIIZILJ, j, j2);
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
