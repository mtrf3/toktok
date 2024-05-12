package com.lingo.caption.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C61145NzB;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC61155NzL;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CaptionFragment extends Fragment implements InterfaceC61155NzL {
    public C61145NzB LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.InterfaceC61155NzL
    public final void Yi() {
        C61145NzB c61145NzB = this.LJLIL;
        if (c61145NzB != null) {
            c61145NzB.Yi();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View LIZIZ;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context == null) {
            LIZIZ = null;
        } else {
            Lifecycle lifecycle = getLifecycle();
            o.LJIIIIZZ(lifecycle, "lifecycle");
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments != null) {
                str = arguments.getString("unique_id", "");
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            C61145NzB c61145NzB = new C61145NzB(context, lifecycle, str2);
            this.LJLIL = c61145NzB;
            LIZIZ = c61145NzB.LIZIZ();
        }
        if (!(LIZIZ instanceof View)) {
            LIZIZ = null;
        }
        if (LIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZIZ, this);
                C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }
}
