package Y;

import X.C76758UAo;
import X.C76762UAs;
import X.C76763UAt;
import X.C76764UAu;
import X.C76786UBq;
import X.C77119UOl;
import X.EnumC76760UAq;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.U66;
import X.U85;
import X.UA9;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S0400200_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long j;
        List<Long> list = (List) this.l0;
        U66 u66 = (U66) this.l2;
        JSONObject jSONObject = (JSONObject) this.l3;
        long j2 = this.j4;
        long j3 = this.j5;
        for (Long l : list) {
            if (l != null) {
                UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(l.longValue()), U85.INVITER);
                if (LIZJ != null) {
                    C76786UBq LJ = UA9.LJ();
                    UC0.LJJLIIIJJI(jSONObject, LIZJ);
                    C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "multi_cancel", UC0.LJIIZILJ(7, null, null), j2, j3);
                }
            }
        }
        List<Long> list2 = (List) this.l1;
        U66 u662 = (U66) this.l2;
        JSONObject jSONObject2 = (JSONObject) this.l3;
        long j4 = this.j4;
        long j5 = this.j5;
        for (Long l2 : list2) {
            if (l2 != null) {
                UAS LIZJ2 = UA9.LIZLLL().LIZJ(u662, String.valueOf(l2.longValue()), U85.HANDLER);
                if (LIZJ2 != null) {
                    C76786UBq LJ2 = UA9.LJ();
                    UC0.LJJLIIIJJI(jSONObject2, LIZJ2);
                    j = j4;
                    C77119UOl.LJJIFFI(LJ2, LIZJ2, jSONObject2, "multi_cancel", UC0.LJIIZILJ(7, null, null), j4, j5);
                    j4 = j;
                }
            }
            j = j4;
            j4 = j;
        }
    }

    public final void LIZ$1() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            long j = this.j4;
            long j2 = this.j5;
            JSONObject jSONObject = (JSONObject) this.l2;
            LayoutInfo layoutInfo = (LayoutInfo) this.l3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str = LIZ.LJLIL;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("layout_id", layoutInfo.getLayoutId());
            LJIIZILJ.put("scene_version", layoutInfo.getVersion());
            LJIIZILJ.put("rtc_business_id", layoutInfo.getBusinessId());
            c76786UBq.LJ(j, j2, u94, enumC76760UAq2, str, "change_layout", LJIIZILJ);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        U66 u66 = (U66) this.l1;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        LayoutInfo layoutInfo2 = (LayoutInfo) this.l3;
        LJIIZILJ2.put("layout_id", layoutInfo2.getLayoutId());
        LJIIZILJ2.put("scene_version", layoutInfo2.getVersion());
        LJIIZILJ2.put("rtc_business_id", layoutInfo2.getBusinessId());
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "change_layout", LJIIZILJ2, ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$2() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            long j = this.j4;
            long j2 = this.j5;
            JSONObject jSONObject = (JSONObject) this.l2;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str = LIZ.LJLIL;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            interfaceC88472Yns.invoke(LJIIZILJ);
            c76786UBq.LJ(j, j2, u94, enumC76760UAq2, str, "state_update", LJIIZILJ);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        U66 u66 = (U66) this.l1;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        ((InterfaceC88472Yns) this.l3).invoke(LJIIZILJ2);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "state_update", LJIIZILJ2, ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$3() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            long j = this.j4;
            long j2 = this.j5;
            JSONObject jSONObject = (JSONObject) this.l2;
            List list = (List) this.l3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str = LIZ.LJLIL;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("rtc_rooms", ORZ.LLD(list, null, null, null, C76763UAt.LJLIL, 31));
            c76786UBq.LJ(j, j2, u94, enumC76760UAq2, str, "rtc_update_forward_stream", LJIIZILJ);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        List<UAS> LIZLLL = ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1);
        C76762UAs c76762UAs2 = (C76762UAs) this.l0;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        long j3 = this.j4;
        long j4 = this.j5;
        List list2 = (List) this.l3;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            UAS uas = (UAS) it.next();
            C76786UBq c76786UBq2 = c76762UAs2.LIZJ;
            UC0.LJJLIIIJJI(jSONObject2, uas);
            JSONObject LJIIZILJ2 = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ2.put("rtc_rooms", ORZ.LLD(list2, null, null, null, C76764UAu.LJLIL, 31));
            C77119UOl.LJJIFFI(c76786UBq2, uas, jSONObject2, "rtc_update_forward_stream", LJIIZILJ2, j3, j4);
            j3 = j3;
        }
    }

    public static final void run$0(ARunnableS0S0400200_13 aRunnableS0S0400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0400200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0400200_13 aRunnableS0S0400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0400200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0400200_13 aRunnableS0S0400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0400200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S0400200_13 aRunnableS0S0400200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0400200_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0000: IPUT (r10 I:int), (r1 I:Y.ARunnableS0S0400200_13) (LINE:117440512) Y.ARunnableS0S0400200_13.$t int, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000d: IPUT (r8 I:long), (r0 I:Y.ARunnableS0S0400200_13) (LINE:117440525) Y.ARunnableS0S0400200_13.j5 long, block:B:1:0x0000 */
    public ARunnableS0S0400200_13(Object obj, List<Long> list, List<Long> list2, U66 u66, JSONObject jSONObject, long j, long j2) {
        int i;
        long j3;
        this.$t = i;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = u66;
        this.j4 = jSONObject;
        this.j5 = j3;
    }
}
