package com.ss.android.ugc.aweme.feed.bottom;

import X.AKT;
import X.AKW;
import X.ActivityC45651qj;
import X.C208158Ex;
import X.C47959Irz;
import X.C61447O9r;
import X.C73098SmU;
import X.C76800UCe;
import X.C7MY;
import X.InterfaceC88472Yns;
import Y.ARunnableS20S0200000_1;
import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomToastVM extends ViewModel {
    public AKT LJLIL;
    public C208158Ex LJLILLLLZI;
    public final int LJLJI = C7MY.LIZIZ(C61447O9r.LJIIJJI);
    public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL = null;
    }

    public final AKT hv0() {
        AKT akt = this.LJLIL;
        if (akt != null) {
            akt.LIZ();
            C208158Ex c208158Ex = this.LJLILLLLZI;
            if (c208158Ex != null) {
                int i = c208158Ex.LJLJL;
                AKW baseBundle = c208158Ex.LJLIL;
                int i2 = c208158Ex.LJLILLLLZI;
                InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns = c208158Ex.LJLJI;
                int i3 = c208158Ex.LJLJJI;
                InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns2 = c208158Ex.LJLJJL;
                String str = c208158Ex.LJLJJLL;
                View.OnClickListener onClickListener = c208158Ex.LJLJLJ;
                View view = c208158Ex.LJLJLLL;
                o.LJIIIZ(baseBundle, "baseBundle");
                akt.LIZ = new C208158Ex(baseBundle, i2, interfaceC88472Yns, i3, interfaceC88472Yns2, str, i, onClickListener, view);
                return akt;
            }
            return akt;
        }
        return null;
    }

    public final void gv0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (this.LJLIL == null) {
            this.LJLIL = new AKT(fragment);
        }
        this.LJLILLLLZI = new C208158Ex(0);
        View view = fragment.getView();
        if (view != null) {
            view.post(new ARunnableS20S0200000_1(this, fragment, 9));
        }
    }

    public final void iv0(Fragment fragment) {
        int i;
        Window window;
        View decorView;
        if (fragment == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect LIZJ = C73098SmU.LIZJ(decorView);
            int i2 = LIZJ.bottom;
            decorView.findViewById(R.id.content).getGlobalVisibleRect(LIZJ);
            i = i2 - LIZJ.bottom;
        } else {
            i = 0;
        }
        C208158Ex c208158Ex = this.LJLILLLLZI;
        if (c208158Ex == null) {
            return;
        }
        c208158Ex.LJLJL = C47959Irz.LIZJ(12, Math.max(i, 0) + this.LJLJI);
    }
}
