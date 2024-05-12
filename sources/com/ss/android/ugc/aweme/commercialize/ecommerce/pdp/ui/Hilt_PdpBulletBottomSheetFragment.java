package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui;

import X.C16880lQ;
import X.C78866UxK;
import X.C81244Vua;
import X.C87440YTk;
import X.InterfaceC87465YUj;
import X.YU5;
import X.YU8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public abstract class Hilt_PdpBulletBottomSheetFragment extends DialogFragment implements YU5<Object> {
    public C81244Vua LJLIL;
    public volatile YU8 LJLILLLLZI;
    public final Object LJLJI = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLILLLLZI == null) {
            synchronized (this.LJLJI) {
                if (this.LJLILLLLZI == null) {
                    this.LJLILLLLZI = new YU8(this);
                }
            }
        }
        return this.LJLILLLLZI.generatedComponent();
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
        return this.LJLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        C81244Vua c81244Vua = this.LJLIL;
        if (c81244Vua == null || YU8.LIZIZ(c81244Vua) == activity) {
            z = true;
        } else {
            z = false;
        }
        C78866UxK.LJIL("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", z, new Object[0]);
        if (this.LJLIL == null) {
            this.LJLIL = new C81244Vua(super.getContext(), this);
            ((InterfaceC87465YUj) generatedComponent()).LJIIIIZZ((PdpBulletBottomSheetFragment) this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return C16880lQ.LLZIL(new C81244Vua(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.LJLIL == null) {
            this.LJLIL = new C81244Vua(super.getContext(), this);
            ((InterfaceC87465YUj) generatedComponent()).LJIIIIZZ((PdpBulletBottomSheetFragment) this);
        }
    }
}
