package X;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAY implements Runnable {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public UAY(List<Long> list, U66 u66, JSONObject jSONObject, long j, long j2, long j3, long j4, String str) {
        this.LJLIL = list;
        this.LJLILLLLZI = u66;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = j4;
        this.LJLJLJ = str;
    }

    public final void LIZ() {
        List<Long> list = this.LJLIL;
        U66 u66 = this.LJLILLLLZI;
        JSONObject jSONObject = this.LJLJI;
        long j = this.LJLJJI;
        long j2 = this.LJLJJL;
        long j3 = this.LJLJJLL;
        long j4 = this.LJLJL;
        String str = this.LJLJLJ;
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(it.next().longValue()), null);
            if (LIZJ != null) {
                C76786UBq LJ = UA9.LJ();
                UC0.LJJLIIIJJI(jSONObject, LIZJ);
                JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
                LJIIZILJ.put("leave_group_channel_id", j3);
                LJIIZILJ.put("stay_group_channel_id", j4);
                LJIIZILJ.put("leave_reason", str);
                C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "leave_channel", LJIIZILJ, j, j2);
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
