package com.ss.android.ugc.aweme.profile.ui.v2;

import X.C16880lQ;
import X.C78866UxK;
import X.C81244Vua;
import X.C87440YTk;
import X.InterfaceC87462YUg;
import X.YU5;
import X.YU8;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;

/* loaded from: classes16.dex */
public abstract class Hilt_I18nUserProfileFragmentV2 extends I18nAbsProfileFragmentV2 implements YU5<Object> {
    public ContextWrapper LLD;
    public volatile YU8 LLF;
    public final Object LLFF = new Object();

    private void initializeComponentContext() {
        if (this.LLD == null) {
            this.LLD = new C81244Vua(super.getContext(), this);
            inject();
        }
    }

    public final YU8 componentManager() {
        if (this.LLF == null) {
            synchronized (this.LLFF) {
                if (this.LLF == null) {
                    this.LLF = createComponentManager();
                }
            }
        }
        return this.LLF;
    }

    public YU8 createComponentManager() {
        return new YU8(this);
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZLLL = C87440YTk.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        return new ViewModelProvider.NewInstanceFactory();
    }

    public void inject() {
        ((InterfaceC87462YUg) generatedComponent()).LJIILIIL();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.LLD;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.LLD;
        if (contextWrapper == null || YU8.LIZIZ(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C78866UxK.LJIL("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", z, new Object[0]);
        initializeComponentContext();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return C16880lQ.LLZIL(new C81244Vua(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
    }
}
