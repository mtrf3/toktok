package com.ss.android.ugc.aweme.viewModel;

import X.C53247Kv5;
import X.C72637Sf3;
import X.InterfaceC61312at;
import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AqS172S0100000_6;

/* loaded from: classes13.dex */
public final class ProfileNaviOnboardingViewModel extends BaseJediViewModel<ProfileNaviOnboardingState> {
    public final long LJLJJLL = 1500;
    public final Handler LJLJL = new Handler();
    public SharedPreferences LJLJLJ;

    public final void Mv0() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        setState(C72637Sf3.LJLIL);
        C53247Kv5.LIZ.getClass();
        if (!C53247Kv5.LIZIZ && (sharedPreferences = this.LJLJLJ) != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean("profile_navi_onboarding_tutorial_shown", true)) != null) {
            putBoolean.apply();
        }
        withState(new AqS172S0100000_6(this, 71));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProfileNaviOnboardingState(null, null, null, null, false, false, false, 127, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJL.removeCallbacksAndMessages(null);
    }
}
