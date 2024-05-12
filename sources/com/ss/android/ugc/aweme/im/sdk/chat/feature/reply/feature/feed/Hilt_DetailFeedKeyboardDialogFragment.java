package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C16880lQ;
import X.C78866UxK;
import X.C81244Vua;
import X.C87440YTk;
import X.InterfaceC87471YUp;
import X.YU5;
import X.YU8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment;

/* loaded from: classes16.dex */
public abstract class Hilt_DetailFeedKeyboardDialogFragment extends BaseInputFragment implements YU5<Object> {
    public C81244Vua LJLLILLLL;
    public volatile YU8 LJLLJ;
    public final Object LJLLL = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLLJ == null) {
            synchronized (this.LJLLL) {
                if (this.LJLLJ == null) {
                    this.LJLLJ = new YU8(this);
                }
            }
        }
        return this.LJLLJ.generatedComponent();
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
        return this.LJLLILLLL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        C81244Vua c81244Vua = this.LJLLILLLL;
        if (c81244Vua == null || YU8.LIZIZ(c81244Vua) == activity) {
            z = true;
        } else {
            z = false;
        }
        C78866UxK.LJIL("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", z, new Object[0]);
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new C81244Vua(super.getContext(), this);
            ((InterfaceC87471YUp) generatedComponent()).LJIIL();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return C16880lQ.LLZIL(new C81244Vua(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new C81244Vua(super.getContext(), this);
            ((InterfaceC87471YUp) generatedComponent()).LJIIL();
        }
    }
}
