package Y;

import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.U66;
import X.UC0;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1311200_13 implements Runnable {
    public final int $t;
    public int i5;
    public long j6;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject = (JSONObject) this.l3;
            int i = this.i5;
            String str = this.s0;
            long j = this.j6;
            long j2 = this.j7;
            if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt")) {
                C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, jSONObject, "rtc_init_error", UC0.LJIIZILJ(4, Long.valueOf(i), str), j, j2);
            } else {
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "rtc_init_error", UC0.LJIIZILJ(4, Long.valueOf(i), str), j, j2);
                C77119UOl.LJIL(c76786UBq, LIZ, 2);
                ((ArrayList) c76762UAs.LIZ.LIZIZ).remove(LIZ);
            }
        }
        UC0.LJJJJJL((U66) this.l2, this.j6, this.j7, (JSONObject) this.l3, "rtc_init_error", UC0.LJIIZILJ(4, Long.valueOf(this.i5), this.s0), ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
        U66 u66 = (U66) this.l2;
        UC0.LJJJJJ(u66, 2, ((C76762UAs) this.l1).LIZIZ.LIZLLL(u66), ((C76762UAs) this.l1).LIZJ);
        UC0.LJJJJLI("rtc_init_error", null, this.i5, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), this.j6, this.z4);
        ((C76762UAs) this.l1).LIZIZ.LJ((U66) this.l2);
    }

    public final void LIZ$1() {
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject = (JSONObject) this.l3;
            int i = this.i5;
            String str = this.s0;
            long j = this.j6;
            long j2 = this.j7;
            if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt")) {
                C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, jSONObject, "rtc_error", UC0.LJIIZILJ(4, Long.valueOf(i), str), j, j2);
            } else {
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "rtc_error", UC0.LJIIZILJ(4, Long.valueOf(i), str), j, j2);
                C77119UOl.LJIL(c76786UBq, LIZ, 2);
                ((ArrayList) c76762UAs.LIZ.LIZIZ).remove(LIZ);
            }
        }
        UC0.LJJJJJL((U66) this.l2, this.j6, this.j7, (JSONObject) this.l3, "rtc_error", UC0.LJIIZILJ(4, Long.valueOf(this.i5), this.s0), ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
        U66 u66 = (U66) this.l2;
        UC0.LJJJJJ(u66, 2, ((C76762UAs) this.l1).LIZIZ.LIZLLL(u66), ((C76762UAs) this.l1).LIZJ);
        UC0.LJJJJLI("rtc_error", null, this.i5, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), this.j6, this.z4);
        ((C76762UAs) this.l1).LIZIZ.LJ((U66) this.l2);
    }

    public static final void run$0(ARunnableS0S1311200_13 aRunnableS0S1311200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1311200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1311200_13 aRunnableS0S1311200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1311200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1311200_13(C76762UAs c76762UAs, U66 u66, long j, long j2, JSONObject jSONObject, int i, String str, boolean z, int i2) {
        this.$t = i2;
        this.l1 = c76762UAs;
        this.l2 = u66;
        this.j6 = j;
        this.j7 = j2;
        this.l3 = jSONObject;
        this.i5 = i;
        this.s0 = str;
        this.z4 = z;
    }
}
