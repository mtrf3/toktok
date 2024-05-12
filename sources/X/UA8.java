package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UA8 implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;
    public final /* synthetic */ C76762UAs LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public UA8(U66 u66, long j, long j2, JSONObject jSONObject, C76762UAs c76762UAs, long j3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = jSONObject;
        this.LJLJJL = c76762UAs;
        this.LJLJJLL = j3;
    }

    public final void LIZ() {
        U66 u66 = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        JSONObject jSONObject = this.LJLJJI;
        JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ.put("msg_id", this.LJLJJLL);
        UC0.LJJJJJL(u66, j, j2, jSONObject, "create_channel_message", LJIIZILJ, this.LJLJJL.LIZIZ.LIZLLL(this.LJLIL), this.LJLJJL.LIZJ);
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
