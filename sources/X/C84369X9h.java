package X;

import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.ContinuousTimeCalculator;
import kotlin.jvm.internal.o;

/* renamed from: X.X9h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84369X9h {
    public static int LIZ() {
        if (ContinuousTimeCalculator.sCheckGap == null) {
            ContinuousTimeCalculator.sCheckGap = 5000;
        }
        Integer num = ContinuousTimeCalculator.sCheckGap;
        o.LJI(num);
        return num.intValue();
    }

    public static ContinuousTimeCalculator LIZIZ() {
        if (ContinuousTimeCalculator.mInstance == null) {
            ContinuousTimeCalculator.mInstance = new ContinuousTimeCalculator();
        }
        return ContinuousTimeCalculator.mInstance;
    }
}
