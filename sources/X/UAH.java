package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAH implements Runnable {
    public final /* synthetic */ C76762UAs LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ OSZ<Long, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    public UAH(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, OSZ<Long, String> osz, String str, boolean z, boolean z2, long j3) {
        this.LJLIL = c76762UAs;
        this.LJLILLLLZI = u66;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = osz;
        this.LJLJL = str;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
    }

    public final void LIZ() {
        C76758UAo LIZ = this.LJLIL.LIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            boolean z = this.LJLJLJ;
            U66 u66 = this.LJLILLLLZI;
            C76762UAs c76762UAs = this.LJLIL;
            JSONObject jSONObject = this.LJLJJL;
            OSZ<Long, String> osz = this.LJLJJLL;
            String str = this.LJLJL;
            long j = this.LJLJI;
            long j2 = this.LJLJJI;
            if (z) {
                String updatedRecordId = String.valueOf(u66.LJJLI());
                o.LJIIIZ(updatedRecordId, "updatedRecordId");
                if (!o.LJ(LIZ.LJLIL, updatedRecordId)) {
                    LIZ.LJLJJL.LJI(LIZ.LJLJI.toString(), EnumC76760UAq.ROOM.toString(), LIZ.LJLIL, updatedRecordId);
                    LIZ.LJLIL = updatedRecordId;
                }
            }
            C77119UOl.LJIJJ(c76762UAs.LIZJ, LIZ, jSONObject, "create_channel", UC0.LJIILLIIL(osz.getFirst(), osz.getSecond(), str), j, j2);
            if (!z) {
                C77119UOl.LJIL(c76762UAs.LIZJ, LIZ, 2);
                ((ArrayList) c76762UAs.LIZ.LIZIZ).remove(LIZ);
            }
        }
        UC0.LJJJJIZL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, "create_channel", UC0.LJIILLIIL(this.LJLJJLL.getFirst(), this.LJLJJLL.getSecond(), this.LJLJL), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLIL.LIZJ);
        String str2 = this.LJLJL;
        long longValue = this.LJLJJLL.getFirst().longValue();
        long j3 = this.LJLJJI - this.LJLJI;
        U66 u662 = this.LJLILLLLZI;
        UC0.LJJJJL("create_channel", str2, longValue, j3, u662, this.LJLIL.LIZIZ.LIZLLL(u662));
        if (!this.LJLJLJ) {
            U66 u663 = this.LJLILLLLZI;
            UC0.LJJJJJ(u663, 2, this.LJLIL.LIZIZ.LIZLLL(u663), this.LJLIL.LIZJ);
            UC0.LJJJJLI("create_channel", null, this.LJLJJLL.getFirst().longValue(), this.LJLIL.LIZIZ.LIZLLL(this.LJLILLLLZI), this.LJLJJI, this.LJLJLLL);
            this.LJLIL.LIZIZ.LJ(this.LJLILLLLZI);
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
