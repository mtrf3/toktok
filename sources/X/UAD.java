package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAD implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ OSZ<Long, String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public UAD(C76762UAs c76762UAs, U66 u66, OSZ<Long, String> osz, String str, long j, long j2, JSONObject jSONObject, String str2) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = osz;
        this.LJLJJI = str;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = jSONObject;
        this.LJLJLJ = str2;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            C76762UAs c76762UAs = this.LJLIL;
            OSZ<Long, String> osz = this.LJLJI;
            String str = this.LJLJJI;
            long j = this.LJLJJL;
            long j2 = this.LJLJJLL;
            JSONObject jSONObject = this.LJLJL;
            String str2 = this.LJLJLJ;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str3 = LIZ.LJLIL;
            JSONObject LJIILLIIL = UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str);
            LJIILLIIL.put("source", str2);
            c76786UBq.LIZIZ(j, j2, u94, enumC76760UAq2, str3, "recharge_group_change", LJIILLIIL);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        List<UAS> LIZLLL = this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI);
        C76762UAs c76762UAs2 = this.LJLIL;
        JSONObject jSONObject2 = this.LJLJL;
        OSZ<Long, String> osz2 = this.LJLJI;
        String str4 = this.LJLJJI;
        long j3 = this.LJLJJL;
        long j4 = this.LJLJJLL;
        String str5 = this.LJLJLJ;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            UAS uas = (UAS) it.next();
            C76786UBq c76786UBq2 = c76762UAs2.LIZJ;
            UC0.LJJLIIIJJI(jSONObject2, uas);
            JSONObject LJIILLIIL2 = UC0.LJIILLIIL(osz2.getFirst(), osz2.getSecond(), str4);
            LJIILLIIL2.put("source", str5);
            C77119UOl.LJIJJLI(c76786UBq2, uas, jSONObject2, "recharge_group_change", LJIILLIIL2, j3, j4);
            j3 = j3;
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
