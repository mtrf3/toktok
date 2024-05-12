package com.ss.android.ugc.aweme.assem;

import X.ActivityC45651qj;
import X.C1JD;
import X.C212428Vi;
import X.C2MA;
import X.C2U8;
import X.C54060LJo;
import X.C55096Ljo;
import X.C78866UxK;
import X.C9CI;
import X.LHM;
import android.os.Bundle;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsMainPageFragmentAssem extends BaseMainPageFragmentAssem {
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        C2MA Fi;
        Aweme currentAweme;
        MainActivityScope LJJLIIIJJI;
        MainBusinessAbility LJIJJLI;
        MainPageSocialAbility mainPageSocialAbility;
        String str4;
        if (LHM.LIZIZ.LIZ().shouldShowFriendsTab()) {
            Aweme aweme = null;
            if (o.LJ("HOME", str) && (mainPageSocialAbility = (MainPageSocialAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainPageSocialAbility.class, null)) != null && mainPageSocialAbility.cg0() != null) {
                MainPageSocialAbility mainPageSocialAbility2 = (MainPageSocialAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainPageSocialAbility.class, null);
                if (mainPageSocialAbility2 != null) {
                    str4 = mainPageSocialAbility2.cg0();
                } else {
                    str4 = null;
                }
                C2U8.LIZ(new C54060LJo(str4));
            } else if (o.LJ("FRIENDS_TAB", str)) {
                C2U8.LIZ(new C54060LJo("homepage_friends"));
            }
            MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainPageBusinessAbility.class, null);
            if (mainPageBusinessAbility != null && (Fi = mainPageBusinessAbility.Fi()) != null && (currentAweme = Fi.getCurrentAweme()) != null) {
                if (o.LJ("HOME", str) || o.LJ("FRIENDS_TAB", str)) {
                    ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                    if (LIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZ)) != null && (LJIJJLI = C1JD.LJIJJLI(LJJLIIIJJI)) != null) {
                        aweme = LJIJJLI.getCurrentAweme();
                    }
                    if (!o.LJ(currentAweme, aweme)) {
                        C2U8.LIZ(new C9CI(currentAweme));
                    }
                }
            }
        }
    }
}
