package com.ss.android.ugc.aweme.notification;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C213788aE;
import X.C213798aF;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.InterfaceC61213O0r;
import Y.ACListenerS23S0100000_3;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class SystemNotificationUnsubscribeSettingFragment extends AmeBaseFragment {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C213788aE.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 555));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            view2.setPadding(0, C63081OpJ.LJJJJLI(requireActivity), 0, 0);
        }
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJII(R.attr.cl);
        LIZIZ.LJ(R.attr.cl);
        LIZIZ.LIZ(true);
        LIZIZ.LIZJ();
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.aei), new ACListenerS23S0100000_3(this, 323));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isf);
        final int LIZIZ2 = C7MY.LIZIZ(12);
        recyclerView2.LJII(new AbstractC030309z(LIZIZ2) { // from class: X.8aD
            public final int LJLIL;

            {
                this.LJLIL = LIZIZ2;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view3, RecyclerView recyclerView3, C0AC c0ac) {
                T28.LJ(rect, "outRect", view3, "view", recyclerView3, "parent", c0ac, "state");
                rect.bottom = this.LJLIL;
            }
        }, -1);
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter((AbstractC029409q) this.LJLILLLLZI.getValue());
        C213798aF c213798aF = (C213798aF) this.LJLILLLLZI.getValue();
        List<GroupUnsubscribeSetting> data = (List) this.LJLIL.getValue();
        c213798aF.getClass();
        o.LJIIIZ(data, "data");
        c213798aF.LJLILLLLZI = data;
        c213798aF.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.u1, viewGroup, false);
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
