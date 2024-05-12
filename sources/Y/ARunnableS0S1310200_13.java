package Y;

import X.C2NU;
import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.CN1;
import X.OSZ;
import X.U66;
import X.U7T;
import X.UAH;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1310200_13 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
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
        List<UAS> LIZLLL = ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2);
        boolean z = this.z4;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            ((UAS) it.next()).LJIL = z;
        }
        if (!LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
            if (LIZ != null) {
                C76762UAs c76762UAs = (C76762UAs) this.l1;
                JSONObject jSONObject = (JSONObject) this.l3;
                long j = this.j5;
                long j2 = this.j6;
                boolean z2 = this.z4;
                String str = this.s0;
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ.put("mute", z2);
                LJIIZILJ.put("source", str);
                C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "mute_audio", LJIIZILJ, j, j2);
            }
            U66 u66 = (U66) this.l2;
            long j3 = this.j5;
            long j4 = this.j6;
            JSONObject jSONObject2 = (JSONObject) this.l3;
            JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
            boolean z3 = this.z4;
            String str2 = this.s0;
            LJIIZILJ2.put("mute", z3);
            LJIIZILJ2.put("source", str2);
            UC0.LJJJJJL(u66, j3, j4, jSONObject2, "mute_audio", LJIIZILJ2, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
        }
    }

    public final void LIZ$1() {
        List<UAS> LIZLLL = ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2);
        boolean z = this.z4;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            ((UAS) it.next()).LJIJJLI = z;
        }
        if (!LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
            if (LIZ != null) {
                C76762UAs c76762UAs = (C76762UAs) this.l1;
                JSONObject jSONObject = (JSONObject) this.l3;
                long j = this.j5;
                long j2 = this.j6;
                boolean z2 = this.z4;
                String str = this.s0;
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ.put("mute", z2);
                LJIIZILJ.put("source", str);
                C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "mute_video", LJIIZILJ, j, j2);
            }
            U66 u66 = (U66) this.l2;
            long j3 = this.j5;
            long j4 = this.j6;
            JSONObject jSONObject2 = (JSONObject) this.l3;
            JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
            boolean z3 = this.z4;
            String str2 = this.s0;
            LJIIZILJ2.put("mute", z3);
            LJIIZILJ2.put("source", str2);
            UC0.LJJJJJL(u66, j3, j4, jSONObject2, "mute_video", LJIIZILJ2, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
        }
    }

    public final void LIZ$2() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new UAH(c76762UAs, (U66) this.l1, this.j5, this.j6, LJIJI, (OSZ) this.l3, this.s0, this.z4, z, currentTimeMillis));
    }

    public final void LIZ$3() {
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject = (JSONObject) this.l3;
            long j = this.j5;
            long j2 = this.j6;
            String str = this.s0;
            if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt")) {
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ.put("source", str);
                C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "stop_rtc", LJIIZILJ, j, j2);
            } else {
                C76786UBq c76786UBq2 = c76762UAs.LIZJ;
                JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ2.put("source", str);
                C77119UOl.LJJI(c76786UBq2, LIZ, jSONObject, "stop_rtc", LJIIZILJ2, j, j2);
                C77119UOl.LJIL(c76786UBq2, LIZ, 1);
                ((ArrayList) c76762UAs.LIZ.LIZIZ).remove(LIZ);
            }
        }
        U66 u66 = (U66) this.l2;
        long j3 = this.j5;
        long j4 = this.j6;
        JSONObject jSONObject2 = (JSONObject) this.l3;
        JSONObject LJIIZILJ3 = UC0.LJIIZILJ(6, 0L, null);
        LJIIZILJ3.put("source", this.s0);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "stop_rtc", LJIIZILJ3, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
        if (LiveAbLabelSetting.INSTANCE.getBooleanValue("is_enable_linkmic_enter_and_leave_room_opt")) {
            if (!o.LJ(this.s0, "auto_finish")) {
                U66 u662 = (U66) this.l2;
                UC0.LJJJJJ(u662, 1, ((C76762UAs) this.l1).LIZIZ.LIZLLL(u662), ((C76762UAs) this.l1).LIZJ);
                UC0.LJJJJLI("stop_rtc", null, 0L, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), this.j5, this.z4);
                ((C76762UAs) this.l1).LIZIZ.LJ((U66) this.l2);
                return;
            }
            return;
        }
        U66 u663 = (U66) this.l2;
        UC0.LJJJJJ(u663, 1, ((C76762UAs) this.l1).LIZIZ.LIZLLL(u663), ((C76762UAs) this.l1).LIZJ);
        UC0.LJJJJLI("stop_rtc", null, 0L, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), this.j5, this.z4);
        ((C76762UAs) this.l1).LIZIZ.LJ((U66) this.l2);
    }

    public static final void run$0(ARunnableS0S1310200_13 aRunnableS0S1310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1310200_13 aRunnableS0S1310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1310200_13 aRunnableS0S1310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S1310200_13 aRunnableS0S1310200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1310200_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S1310200_13(long r2, long r4, X.U66 r6, X.C76762UAs r7, java.lang.String r8, org.json.JSONObject r9, boolean r10, int r11) {
        /*
            r1 = this;
            r1.$t = r11
            switch(r11) {
                case 0: goto L18;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r7
            r0.l2 = r6
            r0.j5 = r2
            r0.j6 = r4
            r0.l3 = r9
            r0.s0 = r8
            r0.z4 = r10
        L14:
            r0.<init>()
            return
        L18:
            r0 = r1
            r0.l1 = r7
            r0.l2 = r6
            r0.j5 = r2
            r0.j6 = r4
            r0.l3 = r9
            r0.z4 = r10
            r0.s0 = r8
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S1310200_13.<init>(long, long, X.U66, X.UAs, java.lang.String, org.json.JSONObject, boolean, int):void");
    }

    public ARunnableS0S1310200_13(U7T u7t, C76762UAs c76762UAs, long j, long j2, OSZ osz, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = u7t;
        this.l2 = c76762UAs;
        this.j5 = j;
        this.j6 = j2;
        this.l3 = osz;
        this.s0 = str;
        this.z4 = z;
    }
}
