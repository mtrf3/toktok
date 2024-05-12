package com.ss.android.ugc.aweme.search.pages.result.bot.ui.feedback;

import X.ActivityC45651qj;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C3X7;
import X.C72865Sij;
import X.C76800UCe;
import X.C78496UrM;
import X.C79043V0l;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.O6R;
import X.SY4;
import X.T5T;
import Y.ACListenerS27S0100000_7;
import Y.IDLListenerS59S0200000_7;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes8.dex */
public final class TakoFeedbackSheetFragment extends Fragment implements InterfaceC219588ja {
    public static boolean LJLJL;
    public static Map<String, String> LJLJLJ;
    public View LJLILLLLZI;
    public IDLListenerS59S0200000_7 LJLJI;
    public String LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public boolean LJLIL = true;
    public int LJLJJL = -1;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.cnn);
        o.LJIIIIZZ(string, "getString(R.string.chatGPT_feedback_pannel_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 166));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LJLJL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            View view = this.LJLILLLLZI;
            if (view != null) {
                IDLListenerS59S0200000_7 iDLListenerS59S0200000_7 = this.LJLJI;
                if (iDLListenerS59S0200000_7 != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS59S0200000_7);
                }
                h0.LJJIII(view);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            T5T t5t = (T5T) _$_findCachedViewById(R.id.cz_);
            if (t5t != null) {
                t5t.requestFocus();
            }
            View view = this.LJLILLLLZI;
            if (view != null) {
                IDLListenerS59S0200000_7 iDLListenerS59S0200000_7 = this.LJLJI;
                if (iDLListenerS59S0200000_7 != null) {
                    view.getViewTreeObserver().addOnGlobalLayoutListener(iDLListenerS59S0200000_7);
                }
                h0.LJJIII(view);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        DialogFragment dialogFragment;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_is_satisfied");
        } else {
            z = true;
        }
        this.LJLIL = z;
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.cz_);
            if (textView != null) {
                textView.setHint(getString(R.string.cnm));
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.aub);
            if (_$_findCachedViewById != null) {
                C79043V0l.LJJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), _$_findCachedViewById);
            }
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.cz_);
            if (textView2 != null) {
                textView2.setHint(getString(R.string.cnl));
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j9d);
            if (recyclerView != null) {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
                flexboxLayoutManager.LLIZLLLIL(1);
                flexboxLayoutManager.LLIZ(0);
                flexboxLayoutManager.LLILZLL(4);
                flexboxLayoutManager.LLJ(0);
                recyclerView.setLayoutManager(flexboxLayoutManager);
                Context context = getContext();
                if (context != null) {
                    C72865Sij c72865Sij = new C72865Sij(context);
                    Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.c21);
                    if (LIZIZ != null) {
                        c72865Sij.LJLIL = LIZIZ;
                        c72865Sij.LJLILLLLZI = 3;
                        recyclerView.LJII(c72865Sij, -1);
                    } else {
                        throw new IllegalArgumentException("Drawable cannot be null.");
                    }
                }
                recyclerView.setAdapter(new C3X7(getContext(), new AqS173S0100000_7(this, 302)));
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.aub);
            if (_$_findCachedViewById2 != null) {
                C79043V0l.LJJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), _$_findCachedViewById2);
            }
        }
        _$_findCachedViewById(R.id.aub);
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.aub);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(this, 97));
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null) {
            if (Build.VERSION.SDK_INT < 30) {
                this.LJLJI = new IDLListenerS59S0200000_7(this, view, 0);
            }
            Dialog dialog = dialogFragment.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(5);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.cz_);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setFocusable(true);
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.cz_);
            if (_$_findCachedViewById4 == null) {
                return;
            }
            _$_findCachedViewById4.setFocusableInTouchMode(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cg9, viewGroup, false, "v");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
