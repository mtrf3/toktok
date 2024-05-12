package com.ss.android.ugc.aweme.notification.widget;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C56766MPq;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC53896LDg;
import X.MQC;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class WidgetFragment extends AmeBaseFragment implements InterfaceC53896LDg {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(MQC.LJLIL);

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    public final Map<Class<? extends C56766MPq>, C56766MPq> vl() {
        return (Map) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJ();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        vl().clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJII();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ();
        }
    }

    public List<C56766MPq> wl() {
        return C61878OQg.INSTANCE;
    }

    public void LLLLILI(Bundle bundle) {
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJFF();
        }
    }

    public void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        for (C56766MPq c56766MPq : wl()) {
            c56766MPq.getClass();
            c56766MPq.LJLIL = this;
            vl().put(c56766MPq.getClass(), c56766MPq);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LIZJ(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(view, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<C56766MPq> it = vl().values().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
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
