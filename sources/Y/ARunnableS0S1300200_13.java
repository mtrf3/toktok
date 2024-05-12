package Y;

import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.EnumC76760UAq;
import X.OSZ;
import X.U4R;
import X.U66;
import X.UA9;
import X.UAK;
import X.UAS;
import X.UC0;
import X.UC7;
import X.X1D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1300200_13 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    public final void LIZ$5() {
        JSONObject jSONObject;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("monitorRtcUserJoined enter runOnWorkingThread(), remoteLinkMicId=");
        LIZ.append(this.s0);
        U4R.LIZLLL("LinkLayerRoomMonitor", X1D.LIZIZ(LIZ));
        UAS LIZIZ = ((C76762UAs) this.l1).LIZIZ.LIZIZ((U66) this.l2, this.s0, null);
        if (LIZIZ != null) {
            String str = this.s0;
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject2 = (JSONObject) this.l3;
            long j = this.j4;
            long j2 = this.j5;
            if (o.LJ(LIZIZ.LIZ, str)) {
                C76786UBq c76786UBq = c76762UAs.LIZJ;
                JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ.put("remote_linkmic_id", str);
                jSONObject = jSONObject2;
                C77119UOl.LJJIFFI(c76786UBq, LIZIZ, jSONObject2, "rtc_user_joined_self", LJIIZILJ, j, j2);
            } else {
                jSONObject = jSONObject2;
                C76786UBq c76786UBq2 = c76762UAs.LIZJ;
                JSONObject LJIIZILJ2 = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ2.put("remote_linkmic_id", str);
                C77119UOl.LJJIFFI(c76786UBq2, LIZIZ, jSONObject, "rtc_user_joined_remote", LJIIZILJ2, j, j2);
            }
            UC7.LJ("monitorRtcUserJoined enter getInfoRecordByLinkMicId(), remoteLinkMicId=", str, "LinkLayerRoomMonitor");
            if (!o.LJ(LIZIZ.LIZ, str)) {
                UC7.LJ("monitorRtcUserJoined getInfoRecordByLinkMicId() -> reportStartEvent(), remoteLinkMicId=", str, "LinkLayerRoomMonitor");
                C76786UBq c76786UBq3 = c76762UAs.LIZJ;
                JSONObject LJIIZILJ3 = UC0.LJIIZILJ(6, 0L, null);
                LJIIZILJ3.put("remote_linkmic_id", str);
                C77119UOl.LJJIFFI(c76786UBq3, LIZIZ, jSONObject, "rtc_user_joined", LJIIZILJ3, j, j2);
            }
        }
        C76758UAo LIZ2 = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ2 != null) {
            String str2 = this.s0;
            C76762UAs c76762UAs2 = (C76762UAs) this.l1;
            JSONObject jSONObject3 = (JSONObject) this.l3;
            long j3 = this.j4;
            long j4 = this.j5;
            UC7.LJ("monitorRtcUserJoined getChannelRecord() -> reportStartEvent(), remoteLinkMicId=", str2, "LinkLayerRoomMonitor");
            C76786UBq c76786UBq4 = c76762UAs2.LIZJ;
            JSONObject LJIIZILJ4 = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ4.put("remote_linkmic_id", str2);
            C77119UOl.LJJI(c76786UBq4, LIZ2, jSONObject3, "rtc_user_joined", LJIIZILJ4, j3, j4);
        }
    }

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
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
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
            long j = this.j4;
            long j2 = this.j5;
            String str = this.s0;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("destroy_source", str);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "destroy_channel", LJIIZILJ, j, j2);
        }
        UC0.LJJJJJL((U66) this.l2, this.j4, this.j5, (JSONObject) this.l3, "destroy_channel", UC0.LJIIZILJ(7, null, null), ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
    }

    public final void LIZ$1() {
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            JSONObject jSONObject = (JSONObject) this.l3;
            long j = this.j4;
            long j2 = this.j5;
            String str = this.s0;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("source", str);
            C77119UOl.LJJI(c76786UBq, LIZ, jSONObject, "rtc_join_channel_start", LJIIZILJ, j, j2);
        }
        U66 u66 = (U66) this.l2;
        long j3 = this.j4;
        long j4 = this.j5;
        JSONObject jSONObject2 = (JSONObject) this.l3;
        JSONObject LJIIZILJ2 = UC0.LJIIZILJ(7, null, null);
        LJIIZILJ2.put("source", this.s0);
        UC0.LJJJJJL(u66, j3, j4, jSONObject2, "rtc_join_channel_start", LJIIZILJ2, ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2), ((C76762UAs) this.l1).LIZJ);
    }

    public final void LIZ$4() {
        C76758UAo LIZ = ((C76762UAs) this.l1).LIZ.LIZ((U66) this.l2);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l1;
            long j = this.j4;
            long j2 = this.j5;
            JSONObject jSONObject = (JSONObject) this.l3;
            String str = this.s0;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            String enumC76760UAq2 = enumC76760UAq.toString();
            String str2 = LIZ.LJLIL;
            JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ.put("source", str);
            c76786UBq.LJ(j, j2, u94, enumC76760UAq2, str2, "recharge_group_change", LJIIZILJ);
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        List<UAS> LIZLLL = ((C76762UAs) this.l1).LIZIZ.LIZLLL((U66) this.l2);
        C76762UAs c76762UAs2 = (C76762UAs) this.l1;
        JSONObject jSONObject2 = (JSONObject) this.l3;
        long j3 = this.j4;
        long j4 = this.j5;
        String str3 = this.s0;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            UAS uas = (UAS) it.next();
            C76786UBq c76786UBq2 = c76762UAs2.LIZJ;
            UC0.LJJLIIIJJI(jSONObject2, uas);
            JSONObject LJIIZILJ2 = UC0.LJIIZILJ(4, 0L, "");
            LJIIZILJ2.put("source", str3);
            C77119UOl.LJJIFFI(c76786UBq2, uas, jSONObject2, "recharge_group_change", LJIIZILJ2, j3, j4);
            j3 = j3;
        }
    }

    public final void LIZ$2() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            Boolean bool = (Boolean) this.l3;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("mute", bool);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "remote_mute_audio", LJIIZILJ, j, j2);
        }
    }

    public final void LIZ$3() {
        UAS LIZIZ = UA9.LIZLLL().LIZIZ((U66) this.l1, this.s0, null);
        if (LIZIZ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j4;
            long j2 = this.j5;
            Boolean bool = (Boolean) this.l3;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZIZ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(6, 0L, null);
            LJIIZILJ.put("mute", bool);
            C77119UOl.LJJIFFI(LJ, LIZIZ, jSONObject, "remote_mute_video", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S1300200_13.l1);
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS0S1300200_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new UAK(c76762UAs, (U66) aRunnableS0S1300200_13.l1, aRunnableS0S1300200_13.j4, aRunnableS0S1300200_13.j5, LJIJI, (OSZ) aRunnableS0S1300200_13.l3, aRunnableS0S1300200_13.s0, currentTimeMillis));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS0S1300200_13 aRunnableS0S1300200_13) {
        boolean LIZ;
        try {
            aRunnableS0S1300200_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S1300200_13(long r2, long r4, X.U66 r6, X.C76762UAs r7, java.lang.String r8, org.json.JSONObject r9, int r10) {
        /*
            r1 = this;
            r1.$t = r10
            switch(r10) {
                case 0: goto L16;
                case 1: goto L16;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L16;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r8
            r0.l1 = r7
            r0.l2 = r6
            r0.l3 = r9
            r0.j4 = r2
            r0.j5 = r4
        L12:
            r0.<init>()
            return
        L16:
            r0 = r1
            r0.l1 = r7
            r0.l2 = r6
            r0.j4 = r2
            r0.j5 = r4
            r0.l3 = r9
            r0.s0 = r8
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S1300200_13.<init>(long, long, X.U66, X.UAs, java.lang.String, org.json.JSONObject, int):void");
    }

    public ARunnableS0S1300200_13(Object obj, String str, Object obj2, long j, long j2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.j4 = j;
        this.j5 = j2;
        this.l3 = obj3;
    }
}
