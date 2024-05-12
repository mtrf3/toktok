package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAJ implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ int LJLL;

    public UAJ(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, OSZ<Long, String> osz, String str, String str2, boolean z, long j3, int i) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = osz;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = z;
        this.LJLL = i;
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
            String str2 = this.LJLJLJ;
            int i = this.LJLL;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIILLIIL = UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str);
            LJIILLIIL.put("leave_source", str2);
            LJIILLIIL.put("leave_reason", i);
            C77119UOl.LJIJJ(c76786UBq, LIZ, jSONObject, "leave_channel", LJIILLIIL, j, j2);
        }
        U66 u66 = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        long j4 = this.LJLJJI;
        JSONObject jSONObject2 = this.LJLJJL;
        JSONObject LJIILLIIL2 = UC0.LJIILLIIL(this.LJLJJLL.getFirst(), this.LJLJJLL.getSecond(), this.LJLJL);
        String str3 = this.LJLJLJ;
        int i2 = this.LJLL;
        LJIILLIIL2.put("leave_source", str3);
        LJIILLIIL2.put("leave_reason", i2);
        UC0.LJJJJIZL(u66, j3, j4, jSONObject2, "leave_channel", LJIILLIIL2, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        U66 u662 = this.LJLILLLLZI;
        UC0.LJJJJJ(u662, 2, this.LJLIL.LIZIZ.LIZLLL(u662), this.LJLIL.LIZJ);
        String str4 = this.LJLJL;
        long longValue = this.LJLJJLL.getFirst().longValue();
        long j5 = this.LJLJJI - this.LJLJI;
        U66 u663 = this.LJLILLLLZI;
        UC0.LJJJJL("leave_channel", str4, longValue, j5, u663, this.LJLIL.LIZIZ.LIZLLL(u663));
        UC0.LJJJJLI("leave_channel", this.LJLJLJ, this.LJLJJLL.getFirst().longValue(), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLJJI, this.LJLJLLL);
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
