package X;

import org.json.JSONObject;

/* renamed from: X.UAb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76745UAb implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;

    public RunnableC76745UAb(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, String str, int i) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = str;
        this.LJLJL = i;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            String str = this.LJLJJLL;
            int i = this.LJLJL;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("leave_source", str);
            LJIIZILJ.put("leave_reason", i);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "leave_channel", LJIIZILJ, j, j2);
        }
        U66 u66 = this.LJLILLLLZI;
        long j3 = this.LJLJI;
        long j4 = this.LJLJJI;
        JSONObject jSONObject2 = this.LJLJJL;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(7, null, null);
        String str2 = this.LJLJJLL;
        int i2 = this.LJLJL;
        LJIIZILJ2.put("leave_source", str2);
        LJIIZILJ2.put("leave_reason", i2);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "leave_channel", LJIIZILJ2, this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
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
