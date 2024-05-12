package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.HrW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45382HrW {
    public static final C45382HrW LIZ = new C45382HrW();
    public static int LIZIZ = 1;
    public static int LIZJ;
    public static Aweme LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static Bundle LJI;

    public static final C45382HrW LIZIZ(int i, Aweme aweme, int i2, String downloadFrom, Bundle bundle) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(downloadFrom, "downloadFrom");
        C45382HrW c45382HrW = LIZ;
        LIZIZ = i;
        LIZJ = i2;
        LIZLLL = aweme;
        LJ = false;
        LJFF = 0;
        LJI = bundle;
        return c45382HrW;
    }

    public static C45382HrW LIZ(int i, Aweme aweme, int i2, int i3, Bundle bundle, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 16) != 0) {
            bundle = null;
        }
        C45382HrW c45382HrW = LIZ;
        LIZIZ = i;
        LIZJ = i2;
        LIZLLL = aweme;
        LJ = true;
        LJFF = i3;
        LJI = bundle;
        return c45382HrW;
    }

    public static /* synthetic */ C45382HrW LIZJ(int i, Aweme aweme, int i2, String str, Bundle bundle, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            str = "";
        }
        if ((i3 & 16) != 0) {
            bundle = null;
        }
        return LIZIZ(i, aweme, i2, str, bundle);
    }
}
