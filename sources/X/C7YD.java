package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardRootAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7YD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YD {
    public static boolean LIZ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        if (c8w0 instanceof NowPostCardRootAssem) {
            return true;
        }
        LifecycleOwner parent = c8w0.getParent();
        if (!(parent instanceof C8W0)) {
            return false;
        }
        return LIZ((C8W0) parent);
    }
}
