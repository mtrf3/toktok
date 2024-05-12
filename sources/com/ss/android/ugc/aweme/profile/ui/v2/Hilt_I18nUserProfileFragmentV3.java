package com.ss.android.ugc.aweme.profile.ui.v2;

import X.C16880lQ;
import X.C78866UxK;
import X.C81244Vua;
import X.C87440YTk;
import X.InterfaceC87463YUh;
import X.YU5;
import X.YU8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;

/* loaded from: classes16.dex */
public abstract class Hilt_I18nUserProfileFragmentV3 extends I18nAbsProfileFragmentV2 implements YU5<Object> {
    public C81244Vua LLD;
    public volatile YU8 LLF;
    public final Object LLFF = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LLF == null) {
            synchronized (this.LLFF) {
                if (this.LLF == null) {
                    this.LLF = new YU8(this);
                }
            }
        }
        return this.LLF.generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZLLL = C87440YTk.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        return new ViewModelProvider.NewInstanceFactory();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        return this.LLD;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        C81244Vua c81244Vua = this.LLD;
        if (c81244Vua == null || YU8.LIZIZ(c81244Vua) == activity) {
            z = true;
        } else {
            z = false;
        }
        C78866UxK.LJIL("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", z, new Object[0]);
        if (this.LLD == null) {
            this.LLD = new C81244Vua(super.getContext(), this);
            ((InterfaceC87463YUh) generatedComponent()).LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return C16880lQ.LLZIL(new C81244Vua(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.LLD == null) {
            this.LLD = new C81244Vua(super.getContext(), this);
            ((InterfaceC87463YUh) generatedComponent()).LJIIJJI();
        }
    }
}
