package com.ss.android.ugc.aweme.notification.creator;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C2L4;
import X.C3C5;
import X.C56812MRk;
import X.C56815MRn;
import X.C61712OJw;
import X.C61713OJx;
import X.C76800UCe;
import X.C76965UIn;
import X.C78897Uxp;
import X.C79045V0n;
import X.C8VV;
import X.C90903hW;
import X.MNH;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNotificationFragment extends AmeBaseFragment implements C2L4 {
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

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CreatorNoticeTabScope.class);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MNH.LIZ.LIZIZ();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78897Uxp.LJII(this, C56815MRn.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        if (context != null) {
            C56812MRk.LIZ = C56812MRk.LIZJ(context);
        }
        Context context2 = getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(R.attr.cl, context2)) != null) {
            view.setBackgroundColor(LJI.intValue());
        }
        ((TextView) _$_findCachedViewById(R.id.p5)).setText(getResources().getQuantityText(R.plurals.gr, 2));
        ((ImageView) _$_findCachedViewById(R.id.aei)).setVisibility(0);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.aei), new ACListenerS29S0100000_9(this, 84));
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJII(R.attr.cl);
        LIZIZ.LJ(R.attr.cl);
        LIZIZ.LIZ(true);
        LIZIZ.LIZJ();
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 151));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rn, viewGroup, false);
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
