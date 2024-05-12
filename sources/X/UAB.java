package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMetricsCancelImNotRemoveBugFixSetting;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAB implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ long LJLJLJ;

    public UAB(U66 u66, String str, JSONObject jSONObject, long j, long j2, String str2, boolean z, long j3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = str2;
        this.LJLJL = z;
        this.LJLJLJ = j3;
    }

    public final void LIZ() {
        UAS LIZJ = UA9.LIZLLL().LIZJ(this.LJLIL, this.LJLILLLLZI, null);
        if (LIZJ != null) {
            JSONObject jSONObject = this.LJLJI;
            long j = this.LJLJJI;
            long j2 = this.LJLJJL;
            String str = this.LJLJJLL;
            boolean z = this.LJLJL;
            long j3 = this.LJLJLJ;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("source", str);
            LJIIZILJ.put("msg_id", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "kick_out_message", LJIIZILJ, j, j2);
            C77119UOl.LJJ(LJ, LIZJ, 1);
            UAR.LJFF(0L, j, LIZJ, "kick_out_message", str, z);
            if (LinkMicMetricsCancelImNotRemoveBugFixSetting.INSTANCE.getValue()) {
                UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
            }
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
