package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C10A;
import X.C132805Jc;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import Y.ARunnableS13S0300000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class TTResourcePanelFragment<VM extends ViewModel> extends DTResourcePanelFragment<VM> {
    public View LJLLL;
    public View LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int vl() {
        return R.layout.ast;
    }

    public final void MJ() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c62);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(8);
    }

    public final VideoPublishEditModel em() {
        if (isAdded()) {
            return C132805Jc.LIZIZ(EditModelProvider.Companion);
        }
        return null;
    }

    public final int fm() {
        View findViewById;
        View findViewById2;
        View findViewById3;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (findViewById = mo49getActivity.findViewById(R.id.cjj)) == null || (findViewById2 = mo49getActivity.findViewById(R.id.lj2)) == null || (findViewById3 = mo49getActivity.findViewById(R.id.cjk)) == null) {
            return 0;
        }
        return findViewById3.getMeasuredHeight() + findViewById2.getMeasuredHeight() + findViewById.getMeasuredHeight();
    }

    public final void km() {
        View findViewById;
        View findViewById2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (findViewById = mo49getActivity.findViewById(R.id.lj2)) == null || (findViewById2 = mo49getActivity.findViewById(R.id.cjk)) == null) {
            return;
        }
        if (findViewById.getMeasuredHeight() == 0 || findViewById2.getMeasuredHeight() == 0) {
            findViewById2.post(new ARunnableS13S0300000_2(findViewById, findViewById2, this, 12));
        } else {
            hm(findViewById2.getMeasuredHeight() + findViewById.getMeasuredHeight());
        }
    }

    public final void hm(int i) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LJLLL;
        if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
            layoutParams3.height = i;
            View view2 = this.LJLLL;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams3);
            }
        }
        View view3 = this.LJLLLL;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            View view4 = this.LJLLLL;
            if (view4 != null) {
                layoutParams4 = view4.getLayoutParams();
            }
            if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
                View view5 = this.LJLLLL;
                if (view5 == null) {
                    return;
                }
                view5.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final ViewGroup wl(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.c60);
        }
        return null;
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (onCreateView != null) {
            view = onCreateView.findViewById(R.id.c5z);
        } else {
            view = null;
        }
        this.LJLLL = view;
        if (onCreateView != null) {
            view2 = onCreateView.findViewById(R.id.c60);
        } else {
            view2 = null;
        }
        this.LJLLLL = view2;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
