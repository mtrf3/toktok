package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQ1 {
    public static final IDetailPageAbility LIZ(Fragment fragment) {
        DetailComponentFragment detailComponentFragment;
        if (fragment == null) {
            return null;
        }
        if (KQ5.LIZ()) {
            InterfaceC55235Lm3 LJFF = KR8.LJFF(fragment);
            if (LJFF == null) {
                return null;
            }
            C2K0 LIZ = C55096Ljo.LIZ(LJFF, IFeedFragmentAbility.class, null);
            if (!(LIZ instanceof IDetailPageAbility)) {
                LIZ = null;
            }
            IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) LIZ;
            if (iDetailPageAbility == null) {
                return null;
            }
            KQ2 function = KQ2.LJLIL;
            o.LJIIIZ(function, "function");
            return iDetailPageAbility;
        }
        if ((fragment instanceof DetailComponentFragment) && (detailComponentFragment = (DetailComponentFragment) fragment) != null) {
            Object wl = detailComponentFragment.wl();
            if (!(wl instanceof IDetailPageAbility)) {
                return null;
            }
            return (IDetailPageAbility) wl;
        }
        C60392Yp.LIZIZ("LComponent", "getLegacyDetailAbility null");
        return null;
    }
}
