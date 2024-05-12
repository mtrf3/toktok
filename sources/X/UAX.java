package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAX implements Runnable {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ long LJLLI;

    public UAX(List<Long> list, U66 u66, long j, long j2, String str, OSZ<Long, String> osz, JSONObject jSONObject, String str2, boolean z, long j3, long j4) {
        this.LJLIL = list;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
        this.LJLJJLL = osz;
        this.LJLJL = jSONObject;
        this.LJLJLJ = str2;
        this.LJLJLLL = z;
        this.LJLL = j3;
        this.LJLLI = j4;
    }

    public final void LIZ() {
        List<Long> list = this.LJLIL;
        U66 u66 = this.LJLILLLLZI;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        String str = this.LJLJJL;
        OSZ<Long, String> osz = this.LJLJJLL;
        JSONObject jSONObject = this.LJLJL;
        String str2 = this.LJLJLJ;
        boolean z = this.LJLJLLL;
        long j3 = this.LJLL;
        long j4 = this.LJLLI;
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(it.next().longValue()), null);
            if (LIZJ != null) {
                UAR.LIZIZ(LIZJ, "leave_channel", j - j2, str, osz.getFirst().longValue());
                C76786UBq LJ = UA9.LJ();
                UC0.LJJLIIIJJI(jSONObject, LIZJ);
                JSONObject LJIILLIIL = UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str);
                LJIILLIIL.put("leave_group_channel_id", j3);
                LJIILLIIL.put("stay_group_channel_id", j4);
                LJIILLIIL.put("leave_reason", str2);
                C77119UOl.LJIJJLI(LJ, LIZJ, jSONObject, "leave_channel", LJIILLIIL, j2, j);
                if (osz.getFirst().longValue() == 0) {
                    C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                    UAR.LJFF(osz.getFirst().longValue(), j, LIZJ, "leave_channel", str2, z);
                    UA9.LIZLLL().LJFF(LIZJ.LIZIZ());
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
