package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import X.ActivityC45651qj;
import X.AnonymousClass435;
import X.C10A;
import X.C111024Xi;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C34B;
import X.C3C5;
import X.C4YG;
import X.C76800UCe;
import X.C7EW;
import X.C90903hW;
import X.InterfaceC105124Aq;
import X.InterfaceC110994Xf;
import X.InterfaceC111014Xh;
import X.InterfaceC182577En;
import X.LFH;
import X.ViewOnClickListenerC13880ga;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class BaseInputFragment extends BaseDialogFragment implements InterfaceC182577En, InterfaceC111014Xh, View.OnClickListener {
    public C111024Xi LJLJI;
    public ViewGroup LJLJJI;
    public C4YG LJLJJL;
    public TuxIconView LJLJJLL;
    public View LJLJL;
    public InterfaceC105124Aq LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC110994Xf LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    public abstract void Dl();

    public abstract BaseInputView Gl();

    @Override // X.InterfaceC111014Xh
    public final void LLILII() {
        vl(3);
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract int wl();

    public final C111024Xi Al() {
        C111024Xi c111024Xi = this.LJLJI;
        if (c111024Xi != null) {
            return c111024Xi;
        }
        o.LJIJI("rootContainer");
        throw null;
    }

    public final C4YG xl() {
        C4YG c4yg = this.LJLJJL;
        if (c4yg != null) {
            return c4yg;
        }
        o.LJIJI("msgEditText");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        View view;
        xl().setCursorVisible(false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.cow);
        } else {
            view = null;
        }
        AnonymousClass435.LIZ(mo49getActivity, view);
        InterfaceC110994Xf interfaceC110994Xf = this.LJLL;
        if (interfaceC110994Xf != null) {
            interfaceC110994Xf.Wb(String.valueOf(xl().getText()));
        }
        this.LJLJLLL = false;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLL = null;
        Lifecycle lifecycle = getLifecycle();
        InterfaceC105124Aq interfaceC105124Aq = this.LJLJLJ;
        if (interfaceC105124Aq != null) {
            lifecycle.removeObserver(interfaceC105124Aq);
        } else {
            o.LJIJI("inputView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        List<InterfaceC182577En> list = Al().getKeyBoardObservable().LIZLLL;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
        if (this.LJLJLLL) {
            vl(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Al().getKeyBoardObservable().LIZJ(this);
        Al().setAlpha(0.0f);
        Al().animate().alpha(1.0f).setDuration(130L).setStartDelay(200L);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.LJLJLLL) {
            vl(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        ViewStub viewStub;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null && (viewStub = (ViewStub) view.findViewById(R.id.kmj)) != null) {
            viewStub.inflate();
        }
        Dl();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Al().setKeyBoardObservable(new C7EW());
        C4YG xl = xl();
        xl.setMaxLines(1);
        xl.setEllipsize(TextUtils.TruncateAt.END);
        TuxIconView tuxIconView = this.LJLJJLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            view2.setVisibility(0);
            BaseInputView Gl = Gl();
            o.LJIIIZ(Gl, "<set-?>");
            this.LJLJLJ = Gl;
            Lifecycle lifecycle = getLifecycle();
            InterfaceC105124Aq interfaceC105124Aq = this.LJLJLJ;
            if (interfaceC105124Aq != null) {
                lifecycle.addObserver(interfaceC105124Aq);
                Al().setOnClickListener(new ViewOnClickListenerC13880ga(this));
                xl().setKeyImeChangeListener(this);
                if (bundle != null) {
                    InterfaceC110994Xf interfaceC110994Xf = this.LJLL;
                    if (interfaceC110994Xf != null) {
                        interfaceC110994Xf.Wb("");
                    }
                    try {
                        super.dismiss();
                        return;
                    } catch (IllegalStateException unused) {
                        super.dismissAllowingStateLoss();
                        return;
                    }
                }
                return;
            }
            o.LJIJI("inputView");
            throw null;
        }
        o.LJIJI("sendBtn");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (o.LJ(view, Al())) {
            vl(1);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Al().LIZ(newConfig.orientation, LFH.LIZIZ.LIZLLL().block().LJI());
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.a8g);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    public final void vl(int i) {
        dismiss();
    }

    @Override // X.InterfaceC182577En
    public final void LLILLL(int i, boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LJLJJI;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                o.LJIJI("pageContainer");
                throw null;
            }
        }
        ViewGroup viewGroup2 = this.LJLJJI;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        } else {
            o.LJIJI("pageContainer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        if (isAdded()) {
            if (str == null) {
                str = "BaseInputFragment";
            }
            C34B.LJII(str, "Fragment is already added");
        } else if (isStateSaved()) {
            if (str == null) {
                str = "BaseInputFragment";
            }
            C34B.LJI(str, "Fragment state is already saved");
        } else {
            super.show(manager, str);
            InterfaceC110994Xf interfaceC110994Xf = this.LJLL;
            if (interfaceC110994Xf != null) {
                interfaceC110994Xf.ob();
            }
            this.LJLJLLL = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, wl(), viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
