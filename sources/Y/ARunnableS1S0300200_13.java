package Y;

import X.AnonymousClass629;
import X.C28509BGv;
import X.C76757UAn;
import X.C76758UAo;
import X.C76762UAs;
import X.C76786UBq;
import X.C77119UOl;
import X.EnumC76760UAq;
import X.U66;
import X.U94;
import X.UAS;
import X.UC0;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.avframework.livestreamv2.core.interact.Client;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS1S0300200_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, (JSONObject) this.l2, "join_channel", UC0.LJIIZILJ(7, null, null), this.j3, this.j4);
        }
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "join_channel", UC0.LJIIZILJ(7, null, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$1() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, (JSONObject) this.l2, "pause_rtc", UC0.LJIIZILJ(6, 0L, null), this.j3, this.j4);
        }
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "pause_rtc", UC0.LJIIZILJ(6, 0L, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$2() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, (JSONObject) this.l2, "resume_rtc", UC0.LJIIZILJ(6, 0L, null), this.j3, this.j4);
        }
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "resume_rtc", UC0.LJIIZILJ(6, 0L, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$3() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, (JSONObject) this.l2, "rtc_push_stream", UC0.LJIIZILJ(6, 0L, null), this.j3, this.j4);
        }
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "rtc_push_stream", UC0.LJIIZILJ(6, 0L, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$4() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            C77119UOl.LJJI(c76762UAs.LIZJ, LIZ, (JSONObject) this.l2, "change_max_position", UC0.LJIIZILJ(7, null, null), this.j3, this.j4);
        }
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "change_max_position", UC0.LJIIZILJ(7, null, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public final void LIZ$5() {
        C76758UAo LIZ = ((C76762UAs) this.l0).LIZ.LIZ((U66) this.l1);
        if (LIZ != null) {
            C76762UAs c76762UAs = (C76762UAs) this.l0;
            long j = this.j3;
            long j2 = this.j4;
            JSONObject jSONObject = (JSONObject) this.l2;
            C76786UBq c76786UBq = c76762UAs.LIZJ;
            String u94 = LIZ.LJLJI.toString();
            EnumC76760UAq enumC76760UAq = EnumC76760UAq.ROOM;
            c76786UBq.LJ(j, j2, u94, enumC76760UAq.toString(), LIZ.LJLIL, "rtc_stop_forward_stream", UC0.LJIIZILJ(4, 0L, ""));
            c76786UBq.LJII(LIZ.LJLJI.toString(), enumC76760UAq.toString(), LIZ.LJLIL, jSONObject);
        }
        List<UAS> LIZLLL = ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1);
        C76762UAs c76762UAs2 = (C76762UAs) this.l0;
        JSONObject jSONObject2 = (JSONObject) this.l2;
        long j3 = this.j3;
        long j4 = this.j4;
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            UAS uas = (UAS) it.next();
            C76786UBq c76786UBq2 = c76762UAs2.LIZJ;
            UC0.LJJLIIIJJI(jSONObject2, uas);
            C77119UOl.LJJIFFI(c76786UBq2, uas, jSONObject2, "rtc_stop_forward_stream", UC0.LJIIZILJ(4, 0L, ""), j3, j4);
            j3 = j3;
        }
    }

    public final void LIZ$6() {
        String str;
        LiveMode streamType;
        C76757UAn c76757UAn = ((C76762UAs) this.l0).LIZ;
        U66 linker = (U66) this.l1;
        c76757UAn.getClass();
        o.LJIIIZ(linker, "linker");
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        WeakReference weakReference = new WeakReference(linker);
        U94 LJIILIIL = UC0.LJIILIIL(linker.getScene());
        Room LIZJ = linker.LIZJ();
        if (LIZJ != null && (streamType = LIZJ.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = "";
        }
        C76758UAo c76758UAo = new C76758UAo(LIZ, weakReference, LJIILIIL, str, c76757UAn.LIZ);
        ((ArrayList) c76757UAn.LIZIZ).add(c76758UAo);
        C76786UBq c76786UBq = ((C76762UAs) this.l0).LIZJ;
        JSONObject recordExtra = (JSONObject) this.l2;
        long j = this.j3;
        long j2 = this.j4;
        o.LJIIIZ(c76786UBq, "<this>");
        o.LJIIIZ(recordExtra, "recordExtra");
        C76786UBq.LJFF(c76786UBq, c76758UAo.LJLJI.toString(), EnumC76760UAq.ROOM.toString(), c76758UAo.LJLJJI, c76758UAo.LJLIL, recordExtra, j, j2);
        C77119UOl.LJJI(c76786UBq, c76758UAo, (JSONObject) this.l2, "create_channel", UC0.LJIIZILJ(7, null, null), this.j3, this.j4);
        UC0.LJJJJJL((U66) this.l1, this.j3, this.j4, (JSONObject) this.l2, "create_channel", UC0.LJIIZILJ(7, null, null), ((C76762UAs) this.l0).LIZIZ.LIZLLL((U66) this.l1), ((C76762UAs) this.l0).LIZJ);
    }

    public static final void run$0(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS1S0300200_13.l0);
            C76762UAs c76762UAs = (C76762UAs) aRunnableS1S0300200_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S0400200_13(c76762UAs, (U66) aRunnableS1S0300200_13.l0, LJIJI, (List) aRunnableS1S0300200_13.l2, aRunnableS1S0300200_13.j3, aRunnableS1S0300200_13.j4, 3));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS1S0300200_13 aRunnableS1S0300200_13) {
        boolean LIZ;
        try {
            aRunnableS1S0300200_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS1S0300200_13(long r2, long r4, X.U66 r6, X.C76762UAs r7, org.json.JSONObject r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L14;
                case 1: goto L14;
                case 2: goto L14;
                case 3: goto L14;
                case 4: goto L14;
                case 5: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r7
            r0.l1 = r6
            r0.l2 = r8
            r0.j3 = r2
            r0.j4 = r4
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l0 = r7
            r0.l1 = r6
            r0.j3 = r2
            r0.j4 = r4
            r0.l2 = r8
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S0300200_13.<init>(long, long, X.U66, X.UAs, org.json.JSONObject, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:long), (r0 I:Y.ARunnableS1S0300200_13) (LINE:100728841) Y.ARunnableS1S0300200_13.j4 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.Object), (r0 I:Y.ARunnableS1S0300200_13) (LINE:100728843) Y.ARunnableS1S0300200_13.l2 java.lang.Object, block:B:1:0x0000 */
    public ARunnableS1S0300200_13(U66 u66, U66 u662, C76762UAs c76762UAs, long j, long j2, List<? extends Client.ForwardRoomInfo> list) {
        long j3;
        Object obj;
        this.$t = list;
        this.l0 = u66;
        this.l1 = u662;
        this.j3 = c76762UAs;
        this.j4 = j3;
        this.l2 = obj;
    }
}
