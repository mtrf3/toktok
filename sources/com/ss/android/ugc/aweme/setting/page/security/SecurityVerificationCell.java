package com.ss.android.ugc.aweme.setting.page.security;

import X.AIF;
import X.C221108m2;
import X.C253569xI;
import X.C253619xN;
import X.C62822Ol8;
import X.C78920UyC;
import X.FMX;
import X.HG3;
import Y.AObserverS72S0100000_4;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityVerificationCell extends RightTextCell<C253619xN> {
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 809));

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        String str;
        int i;
        o.LJIIIZ(v, "v");
        AIF aif = this.LJLJI;
        if (aif != null) {
            CharSequence LJIIJJI = aif.LJIIJJI();
            Activity activity = this.LJLIL;
            String str2 = null;
            if (activity != null) {
                str = activity.getString(R.string.rn0);
            } else {
                str = null;
            }
            if (o.LJ(LJIIJJI, str)) {
                i = 1;
            } else {
                Activity activity2 = this.LJLIL;
                if (activity2 != null) {
                    str2 = activity2.getString(R.string.rmy);
                }
                if (o.LJ(LJIIJJI, str2)) {
                    i = 0;
                } else {
                    i = -1;
                }
            }
            FMX.LJIIL("click_2_step_authentication", C78920UyC.LIZJ(i, "state").LIZ);
            this.LJLJJI.getValue();
            Activity activity3 = this.LJLIL;
            if (activity3 != null) {
                HG3.LJIIL();
                HG3.LJLJL.LJIIL().openTwoStepVerificationManageActivity(activity3, "settings_security");
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        SecurityViewModel securityViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        super.onItemViewCreated();
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationItem");
        setItem((C253569xI) obj);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null && (securityViewModel = (SecurityViewModel) this.LJLJJI.getValue()) != null && (mutableLiveData = securityViewModel.LJLIL) != null) {
            mutableLiveData.observe(currentLifecycleOwner, new AObserverS72S0100000_4(this, 15));
        }
    }
}
