package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIN {
    public static void LIZ(MIM questionDetailTimeTracker, String str, String str2) {
        o.LJIIIZ(questionDetailTimeTracker, "questionDetailTimeTracker");
        questionDetailTimeTracker.LIZLLL = true;
        Long l = questionDetailTimeTracker.LIZ;
        Long l2 = null;
        if (l != null) {
            Long valueOf = Long.valueOf(((System.currentTimeMillis() - l.longValue()) - questionDetailTimeTracker.LIZJ) - questionDetailTimeTracker.LJ);
            if (valueOf != null) {
                C188727au LJ = C169696lJ.LJ(valueOf.longValue(), "stay_duration");
                LJ.LJIIIZ("exit_method", str);
                LJ.LJIIIZ("qa_detail_enter_from", str2);
                try {
                    String str3 = questionDetailTimeTracker.LIZIZ;
                    if (str3 != null) {
                        l2 = Long.valueOf(CastLongProtector.parseLong(str3));
                    }
                } catch (Exception unused) {
                }
                LJ.LJFF(l2, "qa_detail_enter_group_id");
                FMX.LJIIL("exit_qa_detail_page", LJ.LIZ);
            }
        }
    }
}
