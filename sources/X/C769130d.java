package X;

import Y.ARunnableS0S1401000_1;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.30d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769130d {
    public static long LIZ = -1;
    public static final /* synthetic */ int LIZIZ = 0;

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    public static void LIZ(AbstractC55082Lja abstractC55082Lja, C80796VnM c80796VnM, Context context, String str, int i) {
        ?? r0;
        if ((((Number) C769230e.LIZ.getValue()).intValue() & 1) == 1 && LIZ > 0) {
            C68322mC c68322mC = new C68322mC();
            C68322mC c68322mC2 = new C68322mC();
            C76732zl c76732zl = new C76732zl();
            if (abstractC55082Lja != null) {
                List<Aweme> LJJIL = abstractC55082Lja.LJJIL();
                if (LJJIL.size() > 0) {
                    if (c80796VnM != null) {
                        r0 = abstractC55082Lja.getItem(c80796VnM.getCurrentItem());
                    } else {
                        r0 = 0;
                    }
                    c68322mC2.element = r0;
                    int LJJI = C78996UzQ.LJJI(r0, LJJIL);
                    if (LJJI >= 0 && LJJI < LJJIL.size()) {
                        int i2 = LJJI + 1;
                        if (i2 < LJJIL.size()) {
                            c68322mC.element = ListProtector.get(LJJIL, i2);
                        }
                        int i3 = LJJI;
                        while (i3 > LJJI - 10) {
                            Aweme aweme = (Aweme) ListProtector.get(LJJIL, i3);
                            if (aweme != null && aweme.getAwemeType() != 0) {
                                c76732zl.element++;
                            }
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
            FMX.LIZIZ().execute(new ARunnableS0S1401000_1(str, c68322mC, c68322mC2, context, c76732zl, i, 1));
        }
    }
}
