package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances;

import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C235479Lz;
import X.C65352Pkq;
import X.C78926UyI;
import X.C9M5;
import X.C9M6;
import X.C9M7;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MafRedPointDismissHelper implements IMafRedPointDismissHelper {
    @Override // com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C9M7 c9m7 = C9M7.LJLIL;
        ProfileMafRedPointsVM profileMafRedPointsVM = (ProfileMafRedPointsVM) new C214378bB(C65352Pkq.LIZ(ProfileMafRedPointsVM.class), c9m7, C214528bQ.LJLIL, C78926UyI.LJJII(lifecycleOwner, false), C184077Kh.LJLIL, C9M6.INSTANCE, null, null).getValue();
        C235479Lz c235479Lz = profileMafRedPointsVM.LJLIL;
        c235479Lz.LIZ.erase("show_maf_point_not_click_times");
        c235479Lz.LIZ.erase("maf_red_point_quit_times");
        c235479Lz.LIZ.erase("random_maf_count");
        profileMafRedPointsVM.setState(C9M5.LJLIL);
    }
}
