package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAF implements Runnable {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    public UAF(List<Long> list, U66 u66, JSONObject jSONObject, long j, long j2, String str, boolean z, long j3, long j4) {
        this.LJLIL = list;
        this.LJLILLLLZI = u66;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = str;
        this.LJLJL = z;
        this.LJLJLJ = j3;
        this.LJLJLLL = j4;
    }

    public final void LIZ() {
        List<Long> list = this.LJLIL;
        U66 u66 = this.LJLILLLLZI;
        JSONObject jSONObject = this.LJLJI;
        long j = this.LJLJJI;
        long j2 = this.LJLJJL;
        String str = this.LJLJJLL;
        boolean z = this.LJLJL;
        long j3 = this.LJLJLJ;
        long j4 = this.LJLJLLL;
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(it.next().longValue()), null);
            if (LIZJ != null) {
                C76786UBq LJ = UA9.LJ();
                UC0.LJJLIIIJJI(jSONObject, LIZJ);
                JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
                LJIIZILJ.put("msg_id", j3);
                LJIIZILJ.put("group_channel_id", j4);
                LJIIZILJ.put("leave_reason", str);
                C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "leave_message", LJIIZILJ, j, j2);
                C77119UOl.LJJ(UA9.LJ(), LIZJ, 1);
                UAR.LJFF(0L, j, LIZJ, "leave_message", str, z);
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
