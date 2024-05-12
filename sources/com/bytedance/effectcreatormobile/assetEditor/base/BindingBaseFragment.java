package com.bytedance.effectcreatormobile.assetEditor.base;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C93807aWp;
import X.C94034aaU;
import X.InterfaceC06750Oh;
import X.X1D;
import Y.IDCListenerS249S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import kotlin.jvm.internal.IDqS34S0300000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public abstract class BindingBaseFragment<B extends InterfaceC06750Oh> extends BottomDrawerFragment {
    public B LJLILLLLZI;

    public abstract InterfaceC06750Oh Al(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment
    public void _$_clearFindViewByIdCache() {
    }

    public abstract void wl(View view, Bundle bundle);

    public final B xl() {
        B b = this.LJLILLLLZI;
        if (b != null) {
            return b;
        }
        IMonitor LIZ = C93807aWp.LIZ();
        if (LIZ != null) {
            LIZ.ensureNotReachHere(new Exception("binding get must not be null!"), "binding get null!");
        }
        return null;
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            view.addOnAttachStateChangeListener(new IDCListenerS249S0100000_42(this, 0));
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        CKEffectEditorContext.LIZJ(viewLifecycleOwner, new IDqS34S0300000_42(this, view, bundle, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getClass().getName());
        LIZ.append("--onCreateView");
        C94034aaU.LIZ("BindingBaseFragment", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI = (B) Al(inflater, viewGroup);
        B xl = xl();
        C29S c29s = null;
        if (xl != null) {
            view = xl.getRoot();
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
