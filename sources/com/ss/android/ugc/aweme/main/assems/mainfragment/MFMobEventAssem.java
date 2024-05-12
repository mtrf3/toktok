package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C3SZ;
import X.C54067LJv;
import X.C78866UxK;
import X.C78880UxY;
import X.C8W0;
import X.InterfaceC54151LNb;
import X.InterfaceC54152LNc;
import Y.AObserverS77S0100000_9;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFMobEventAssem extends C8W0 implements InterfaceC54152LNc, InterfaceC54151LNb {
    @Override // X.InterfaceC54151LNb
    public final void LLJJJJJIL(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLILI(Bundle bundle) {
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        C3SZ.LIZ(LIZ).LJLLLLLL.observe(this, new AObserverS77S0100000_9(this, 105));
    }

    @Override // X.InterfaceC54151LNb
    public final void y(int i, boolean z) {
        String str;
        HomeViewPagerAbility LJJJJIZL;
        int Eh;
        if (z) {
            return;
        }
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJJJJIZL = C78880UxY.LJJJJIZL(LJJLIIIJJIZ)) != null && (Eh = LJJJJIZL.Eh()) != 0) {
            if (Eh != 1) {
                return;
            } else {
                str = "homepage_follow";
            }
        } else {
            str = "homepage_hot";
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C3SZ.LIZ(LIZ).LJLLLLLL.postValue(new C54067LJv(str, "click_top_icon"));
        }
    }
}
