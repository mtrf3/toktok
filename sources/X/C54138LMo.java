package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.LMo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54138LMo implements LLE {
    public static final C54138LMo LJLIL = new C54138LMo();

    public static void LIZ(ActivityC45651qj activityC45651qj, String str, String str2) {
        LifecycleCoroutineScope lifecycleScope;
        if (o.LJ("Following", str2)) {
            MainPageFragmentImpl.LJI().LIZJ(activityC45651qj);
            if (C59522Vg.LIZ()) {
                ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
                if (LIZLLL != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZLLL)) != null) {
                    XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C70762q8(null), 2);
                }
            } else {
                ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
                if ((LIZLLL2 instanceof Context) && LIZLLL2 != null) {
                    C77266UUc c77266UUc = C77266UUc.LIZIZ;
                    C54149LMz.LIZ(c77266UUc, c77266UUc.LJJIJIIJIL(3, false), "homepage_follow", LIZLLL2, null, 48);
                }
            }
        }
        if (o.LJ("Following", str)) {
            MainPageFragmentImpl.LJI().LJFF(activityC45651qj);
        }
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        LIZ(LIZLLL, str2, str);
    }
}
