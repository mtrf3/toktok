package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.page;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C28871Bj;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C72037SOz;
import X.C76800UCe;
import X.C79146V4k;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.SKL;
import X.SPI;
import X.SPJ;
import X.Z89;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoVisibilitySelectFragment extends Fragment implements InterfaceC219588ja {
    public C72037SOz LJLILLLLZI;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 188));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 186));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 187));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 185));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new SPJ(this));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new SPI(this));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public final BaseVisibilityViewModel vl() {
        return (BaseVisibilityViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String string;
        if (C79146V4k.LJJJJJ(vl().nv0()) || C54838Lfe.LJJI(vl().nv0()) || Z89.LIZIZ.LIZIZ(vl().nv0())) {
            string = getString(R.string.p6e);
            o.LJIIIIZZ(string, "{\n            getString(…e_who_can_view)\n        }");
        } else {
            string = getString(R.string.sdz);
            o.LJIIIIZZ(string, "{\n            getString(…e_view_control)\n        }");
        }
        if (((Boolean) this.LJLJL.getValue()).booleanValue()) {
            String string2 = getString(R.string.p_8);
            o.LJIIIIZZ(string2, "getString(R.string.privacy_settings_btn)");
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS162S0100000_12(this, 1027));
            c235119Kp.LIZIZ(LIZJ);
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string2;
            c235119Kp.LIZJ = c9kf;
            c235119Kp.LIZLLL = true;
            return c235119Kp;
        }
        C235119Kp c235119Kp2 = new C235119Kp();
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark_small;
        LIZJ2.LIZIZ(new AqS162S0100000_12(this, 184));
        c235119Kp2.LIZIZ(LIZJ2);
        C9KF c9kf2 = new C9KF();
        c9kf2.LIZJ = string;
        c235119Kp2.LIZJ = c9kf2;
        c235119Kp2.LIZLLL = true;
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ3.LIZIZ(new AqS162S0100000_12(this, 183));
        c235119Kp2.LIZLLL(LIZJ3);
        return c235119Kp2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        BaseVisibilityViewModel vl = vl();
        String enterFrom = (String) this.LJLJJL.getValue();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String imprId = (String) this.LJLJI.getValue();
        o.LJIIIIZZ(imprId, "imprId");
        String tabName = (String) this.LJLJJI.getValue();
        o.LJIIIIZZ(tabName, "tabName");
        this.LJLILLLLZI = new C72037SOz(vl, this, enterFrom, imprId, tabName);
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
        C72037SOz c72037SOz = this.LJLILLLLZI;
        if (c72037SOz != null) {
            recyclerView.setAdapter(new C28871Bj((List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>>) C47261Igj.LJJIJ(c72037SOz)));
            if (!Z89.LIZIZ.LIZIZ(vl().nv0())) {
                _$_findCachedViewById(R.id.i4q).setVisibility(8);
            }
            vl().LJLJLJ = new WeakReference<>(mo49getActivity());
            vl().mv0(new SKL(this));
            return;
        }
        o.LJIJI("visibilitySelectAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aho, viewGroup, false);
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
