package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;

/* loaded from: classes10.dex */
public final class MH2 {
    public static final MH2 LIZ = new MH2();
    public static final int LIZIZ = 15000;
    public static final C0M6<String, MH3> LIZJ = new C0M6<>(16);
    public static final C0M6<String, C80433Dr> LIZLLL = new C0M6<>(16);

    public static ChallengeDetail LIZIZ(int i, String str, boolean z) {
        C0M6<String, MH3> c0m6 = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('&');
        LIZ2.append(i);
        LIZ2.append('&');
        LIZ2.append(z);
        MH3 LIZIZ2 = c0m6.LIZIZ(X1D.LIZIZ(LIZ2));
        if (LIZIZ2 != null && System.currentTimeMillis() - LIZIZ2.LIZIZ < LIZIZ) {
            return LIZIZ2.LIZ;
        }
        return null;
    }

    public static void LIZJ(String str, int i, boolean z, ChallengeDetail challengeDetail) {
        C0M6<String, MH3> c0m6 = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append('&');
        LIZ2.append(i);
        LIZ2.append('&');
        LIZ2.append(z);
        c0m6.LIZJ(X1D.LIZIZ(LIZ2), new MH3(challengeDetail, System.currentTimeMillis()));
    }

    public static void LIZ(int i, String str, String str2, String str3, boolean z, long j) {
        if (j == 0) {
            C0M6<String, C80433Dr> c0m6 = LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('&');
            LIZ2.append(j);
            LIZ2.append('&');
            LIZ2.append(20);
            LIZ2.append('&');
            LIZ2.append(i);
            LIZ2.append('&');
            LIZ2.append(z);
            LIZ2.append('&');
            LIZ2.append(str2);
            LIZ2.append('&');
            LIZ2.append(str3);
            LIZ2.append('&');
            LIZ2.append((String) null);
            if (c0m6.LIZIZ(X1D.LIZIZ(LIZ2)) != null) {
                System.currentTimeMillis();
            }
        }
    }
}
