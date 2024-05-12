package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4NK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NK {
    public static final /* synthetic */ int LIZ = 0;

    public static OOS LIZ(Activity activity, SharePackage sharePackage, C4NN c4nn, java.util.Set set, boolean z, C4NQ c4nq, boolean z2, C107124Ii c107124Ii, boolean z3, Boolean bool, boolean z4, int i) {
        boolean z5;
        boolean LIZIZ;
        boolean z6 = z4;
        boolean z7 = z3;
        C107124Ii c107124Ii2 = c107124Ii;
        C4NN c4nn2 = c4nn;
        boolean z8 = z;
        java.util.Set set2 = set;
        C4NQ c4nq2 = c4nq;
        boolean z9 = z2;
        Boolean bool2 = null;
        if ((i & 4) != 0) {
            c4nn2 = null;
        }
        if ((i & 8) != 0) {
            set2 = null;
        }
        if ((i & 16) != 0) {
            z8 = false;
        }
        if ((i & 32) != 0) {
            c4nq2 = null;
        }
        if ((i & 64) != 0) {
            z9 = false;
        }
        if ((i & 128) != 0) {
            c107124Ii2 = null;
        }
        if ((i & 256) != 0) {
            z7 = false;
        }
        if ((i & 512) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 1024) == 0) {
            bool2 = bool;
        }
        if ((i & 2048) != 0) {
            z6 = false;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return new C4NU(activity);
        }
        if (bool2 != null) {
            LIZIZ = bool2.booleanValue();
        } else {
            LIZIZ = C92333jp.LIZIZ();
        }
        return new C4NG(activity, set2, z8, c4nq2, z9, sharePackage, null, null, null, c107124Ii2, c4nn2, LIZIZ, z7, z5, false, z6, 37312);
    }
}
