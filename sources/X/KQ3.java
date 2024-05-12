package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQ3 {
    public static final IDetailBaseAbility LIZ(Fragment fragment) {
        DetailComponentFragment detailComponentFragment;
        o.LJIIIZ(fragment, "<this>");
        if (KQ5.LIZ()) {
            InterfaceC55235Lm3 LJFF = KR8.LJFF(fragment);
            if (LJFF == null) {
                return null;
            }
            C2K0 LIZ = C55096Ljo.LIZ(LJFF, IFeedFragmentAbility.class, null);
            if (!(LIZ instanceof IDetailBaseAbility)) {
                LIZ = null;
            }
            IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) LIZ;
            if (iDetailBaseAbility == null) {
                return null;
            }
            KQ4 function = KQ4.LJLIL;
            o.LJIIIZ(function, "function");
            return iDetailBaseAbility;
        }
        if ((fragment instanceof DetailComponentFragment) && (detailComponentFragment = (DetailComponentFragment) fragment) != null) {
            Object wl = detailComponentFragment.wl();
            if (!(wl instanceof IDetailBaseAbility)) {
                return null;
            }
            return (IDetailBaseAbility) wl;
        }
        C60392Yp.LIZIZ("LComponent", "getLegacyDetailAbility null");
        return null;
    }
}
