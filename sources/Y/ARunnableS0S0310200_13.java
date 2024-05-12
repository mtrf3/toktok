package Y;

import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.EnumC76760UAq;
import X.U66;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S0310200_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("enabled", z);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "enable_local_audio", LJIIZILJ, j, j2);
        }
        U66 u66 = (U66) this.l1;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ2.put("enabled", this.z3);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "enable_local_audio", LJIIZILJ2, ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$1() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            long j = this.j4;
            long j2 = this.j5;
            JSONObject jSONObject = (JSONObject) this.l2;
            boolean z = this.z3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str = LIZ.LJLIL;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("video_muted", z);
            c76786UBq.LJ(j, j2, u94, enumC76760UAq2, str, "mute_rtc_push_video_stream", LJIIZILJ);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        U66 u66 = (U66) this.l1;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ2.put("video_muted", this.z3);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "mute_rtc_push_video_stream", LJIIZILJ2, ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$2() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            boolean z = this.z3;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("enabled", z);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "switch_audio", LJIIZILJ, j, j2);
        }
        U66 u66 = (U66) this.l1;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ2.put("enabled", this.z3);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "switch_audio", LJIIZILJ2, ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public static final void run$0(ARunnableS0S0310200_13 aRunnableS0S0310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0310200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0310200_13 aRunnableS0S0310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0310200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0310200_13 aRunnableS0S0310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0310200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0310200_13(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, boolean z, int i) {
        this.$t = i;
        this.l0 = c76762UAs;
        this.l1 = u66;
        this.j4 = j;
        this.j5 = j2;
        this.l2 = jSONObject;
        this.z3 = z;
    }
}
