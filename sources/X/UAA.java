package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMetricsCancelImNotRemoveBugFixSetting;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAA implements Runnable {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ List<Long> LJLILLLLZI;
    public final /* synthetic */ U66 LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ OSZ<Long, String> LJLJL;
    public final /* synthetic */ JSONObject LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ boolean LJLL;

    public UAA(List list, List list2, U7F u7f, long j, long j2, String str, OSZ osz, JSONObject jSONObject, boolean z, boolean z2) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = u7f;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = str;
        this.LJLJL = osz;
        this.LJLJLJ = jSONObject;
        this.LJLJLLL = z;
        this.LJLL = z2;
    }

    public final void LIZ() {
        List<Long> list = this.LJLIL;
        U66 u66 = this.LJLJI;
        long j = this.LJLJJI;
        long j2 = this.LJLJJL;
        String str = this.LJLJJLL;
        OSZ<Long, String> osz = this.LJLJL;
        JSONObject jSONObject = this.LJLJLJ;
        boolean z = this.LJLJLLL;
        boolean z2 = this.LJLL;
        for (Long l : list) {
            if (l != null) {
                UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(l.longValue()), U85.INVITER);
                if (LIZJ != null) {
                    UAR.LIZIZ(LIZJ, "multi_cancel", j - j2, str, osz.getFirst().longValue());
                    C76786UBq LJ = UA9.LJ();
                    UC0.LJJLIIIJJI(jSONObject, LIZJ);
                    C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "multi_cancel", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str), j2, j);
                    if (z) {
                        C77119UOl.LJJ(UA9.LJ(), LIZJ, 2);
                        UAR.LJFF(osz.getFirst().longValue(), j, LIZJ, "multi_cancel", null, z2);
                        if (LinkMicMetricsCancelImNotRemoveBugFixSetting.INSTANCE.getValue()) {
                            UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
                        }
                    }
                }
            }
        }
        List<Long> list2 = this.LJLILLLLZI;
        U66 u662 = this.LJLJI;
        long j3 = this.LJLJJI;
        long j4 = this.LJLJJL;
        String str2 = this.LJLJJLL;
        OSZ<Long, String> osz2 = this.LJLJL;
        JSONObject jSONObject2 = this.LJLJLJ;
        boolean z3 = this.LJLJLLL;
        boolean z4 = this.LJLL;
        for (Long l2 : list2) {
            if (l2 != null) {
                UAS LIZJ2 = UA9.LIZLLL().LIZJ(u662, String.valueOf(l2.longValue()), U85.HANDLER);
                if (LIZJ2 != null) {
                    UAR.LIZIZ(LIZJ2, "multi_cancel", j3 - j4, str2, osz2.getFirst().longValue());
                    C76786UBq LJ2 = UA9.LJ();
                    UC0.LJJLIIIJJI(jSONObject2, LIZJ2);
                    C77119UOl.LJIJJLI(LJ2, LIZJ2, jSONObject2, "multi_cancel", UC0.LJIILLIIL(osz2.getFirst(), osz2.getSecond(), str2), j4, j3);
                    if (z3) {
                        C77119UOl.LJJ(UA9.LJ(), LIZJ2, 2);
                        UAR.LJFF(osz2.getFirst().longValue(), j3, LIZJ2, "multi_cancel", null, z4);
                        if (LinkMicMetricsCancelImNotRemoveBugFixSetting.INSTANCE.getValue()) {
                            UA9.LIZLLL().LJFF(LIZJ2.LIZIZ());
                        }
                    }
                }
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
