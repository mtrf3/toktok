package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X99 {
    public static final boolean LIZIZ(Effect effect) {
        int i;
        o.LJIIJ(effect, "effect");
        List<String> requirements_sec = effect.getRequirements_sec();
        if (requirements_sec == null || requirements_sec.isEmpty()) {
            return false;
        }
        List<String> requirements = effect.getRequirements();
        if ((requirements instanceof Collection) && requirements.isEmpty()) {
            i = 0;
        } else {
            Iterator<String> it = requirements.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((!ujb.o.LJJJJJL(it.next())) && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        List<String> requirements_sec2 = effect.getRequirements_sec();
        if (requirements_sec2 != null && !requirements_sec2.isEmpty()) {
            Iterator<String> it2 = requirements_sec2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if ((!ujb.o.LJJJJJL(it2.next())) && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
            if (i2 != 0 && i2 != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String[] LIZ(com.ss.ugc.effectplatform.model.Effect r12, X.G0J r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X99.LIZ(com.ss.ugc.effectplatform.model.Effect, X.G0J):java.lang.String[]");
    }
}
