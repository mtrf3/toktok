package Y;

import X.C145995oB;
import X.C42318GjC;
import X.C44298Ha2;
import X.C45623HvP;
import X.C76800UCe;
import X.G8G;
import X.InterfaceC65784Pro;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class AObjectS4S0100200_7 implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS4S0100200_7 aObjectS4S0100200_7) {
        C145995oB c145995oB = (C145995oB) aObjectS4S0100200_7.l0;
        long j = aObjectS4S0100200_7.j1;
        long j2 = aObjectS4S0100200_7.j2;
        C42318GjC.LIZIZ("tool_performance_record_first_frame", c145995oB.LIZ);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.getClass();
        if (C45623HvP.LIZ()) {
            HashMap hashMap = new HashMap();
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZIZ(j - j2, "effect_first_frame_duration");
            hashMap.put("tool_performance_record_first_frame", c145995oB2.LIZ);
            if (C44298Ha2.LIZ()) {
                c44298Ha2.LJLJI.post(new IDRunnableS0S0201000(4, c44298Ha2, hashMap, 5));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS4S0100200_7 aObjectS4S0100200_7) {
        C145995oB c145995oB = (C145995oB) aObjectS4S0100200_7.l0;
        long j = aObjectS4S0100200_7.j1;
        long j2 = aObjectS4S0100200_7.j2;
        C42318GjC.LIZIZ("tool_performance_record_first_frame", c145995oB.LIZ);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.getClass();
        if (C45623HvP.LIZ()) {
            HashMap hashMap = new HashMap();
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZIZ(j - j2, "effect_first_frame_duration");
            hashMap.put("tool_performance_record_first_frame", c145995oB2.LIZ);
            if (C44298Ha2.LIZ()) {
                c44298Ha2.LJLJI.post(new IDRunnableS0S0201000(4, c44298Ha2, hashMap, 5));
            }
        }
        return C76800UCe.LIZ;
    }

    public AObjectS4S0100200_7(C145995oB c145995oB, long j, long j2, int i) {
        this.$t = i;
        this.l0 = c145995oB;
        this.j1 = j;
        this.j2 = j2;
    }
}
