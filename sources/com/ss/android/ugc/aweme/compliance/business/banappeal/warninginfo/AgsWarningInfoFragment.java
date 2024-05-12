package com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78897Uxp;
import X.C90903hW;
import X.C99W;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AgsWarningInfoFragment extends Fragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("warningInfo");
        } else {
            serializable = null;
        }
        o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo");
        AgsWarningInfo agsWarningInfo = (AgsWarningInfo) serializable;
        ((TextView) _$_findCachedViewById(R.id.title)).setText(agsWarningInfo.getWarningTitle());
        ((TextView) _$_findCachedViewById(R.id.bst)).setText(agsWarningInfo.getWarningDesc());
        ((TextView) _$_findCachedViewById(R.id.br1)).setText(agsWarningInfo.getButtonDetailText());
        if (C99W.LIZ) {
            _$_findCachedViewById(R.id.br1).getClass();
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.br1), new ACListenerS39S0200000_4(this, agsWarningInfo, 9));
        ((TextView) _$_findCachedViewById(R.id.bfj)).setText(agsWarningInfo.getButtonCloseText());
        View close_button = _$_findCachedViewById(R.id.bfj);
        o.LJIIIIZZ(close_button, "close_button");
        C78897Uxp.LJJJJLI(close_button, null);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.bfj), new ACListenerS24S0100000_4(this, 36));
        View close = _$_findCachedViewById(R.id.bf7);
        o.LJIIIIZZ(close, "close");
        C78897Uxp.LJJJJLI(close, null);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.bf7), new ACListenerS24S0100000_4(this, 37));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahr, viewGroup, false);
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
