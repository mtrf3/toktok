package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AbstractC70866Rra;
import X.ActivityC45651qj;
import X.C024607u;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DD;
import X.C1DJ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C40161hs;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70714Rp8;
import X.C70734RpS;
import X.C70750Rpi;
import X.C70753Rpl;
import X.C70754Rpm;
import X.C70845RrF;
import X.C70846RrG;
import X.C73156SnQ;
import X.C73181Snp;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC35450Dvi;
import X.IHK;
import X.LTF;
import X.SQU;
import X.TBT;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewGalleryBottomInfoStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewGalleryFragment extends ECBaseJediFragment {
    public volatile int LJLLL;
    public volatile int LJLLLL;
    public final lifecycleAwareLazy LJLZ;
    public final C70753Rpl LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 465));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 468));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 467));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 300));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 469));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 301));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 298));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 299));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 466));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 470));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 464));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 473));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 472));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C70734RpS.LJLIL);

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "review_photo";
    }

    public ReviewGalleryFragment() {
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 79);
        C65776Prg LIZ = C65352Pkq.LIZ(ReviewGalleryViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 471);
        this.LJLZ = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, aqS194S0100000_12, 10));
        this.LJZ = new C70753Rpl(this);
    }

    public final ReviewGalleryViewModel wl() {
        return (ReviewGalleryViewModel) this.LJLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((RecyclerView) _$_findCachedViewById(R.id.nd2)).LJJLL(this.LJZ);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        withState(wl(), new AqS178S0100000_12(this, 161));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReviewGalleryViewModel wl = wl();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        wl.LJLLJ = new C70714Rp8(requireContext);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ReviewGalleryViewModel wl = wl();
        C73156SnQ.LJIIIIZZ(this, wl, new TBT() { // from class: X.Rpb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((ReviewGalleryState) obj).getIndex());
            }
        }, new AqS194S0100000_12(this, 253));
        C73156SnQ.LJIIIIZZ(this, wl, new TBT() { // from class: X.Rpc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ReviewGalleryState) obj).getShowOtherInfo());
            }
        }, new AqS194S0100000_12(this, 254));
        C73156SnQ.LJIIIIZZ(this, wl, new TBT() { // from class: X.Rpd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ReviewGalleryState) obj).getCurReviewItem();
            }
        }, new AqS194S0100000_12(this, 255));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.nd2);
        new C40161hs().LIZIZ(recyclerView);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.LJIIJJI(this.LJZ);
        C70846RrG LIZ = C70845RrF.LIZ(this, wl().LJLLILLLL);
        SQU.LIZ(LIZ, IHK.LJLIL, C70750Rpi.LJLIL);
        C73181Snp LJJIZ = C1DJ.LJJIZ(LIZ);
        LJJIZ.LIZ = 241;
        LJJIZ.LJIIJ = wl();
        LJJIZ.LJI = new AqS178S0100000_12(this, 654);
        LJJIZ.LIZ(recyclerView);
        View preview_back = _$_findCachedViewById(R.id.i1x);
        o.LJIIIIZZ(preview_back, "preview_back");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 105, 42), preview_back);
        View findViewById = view.findViewById(R.id.j0y);
        ((AbstractC70866Rra) C024607u.LIZ.LIZIZ(ViewDataBinding.LIZIZ(null), findViewById, R.layout.a6k)).LJIILLIIL((IReviewGalleryBottomInfoStyle) this.LJLLLLLL.getValue());
        ((LTF) _$_findCachedViewById(R.id.inq)).setStarSize(((IReviewGalleryBottomInfoStyle) this.LJLLLLLL.getValue()).getStarSize());
        View avatar_view = _$_findCachedViewById(R.id.ad0);
        o.LJIIIIZZ(avatar_view, "avatar_view");
        ViewGroup.LayoutParams layoutParams = avatar_view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.LayoutParams) || layoutParams == null) {
            return;
        }
        layoutParams.width = ((IReviewGalleryBottomInfoStyle) this.LJLLLLLL.getValue()).getAvatarWidth();
        layoutParams.height = ((IReviewGalleryBottomInfoStyle) this.LJLLLLLL.getValue()).getAvatarHeight();
        avatar_view.setLayoutParams(layoutParams);
    }

    public static void vl(View view, EnumC35450Dvi enumC35450Dvi, boolean z) {
        float f;
        float f2;
        if (z) {
            if (view.getVisibility() == 0) {
                return;
            }
        } else if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(0);
        float height = view.getHeight();
        float f3 = 1.0f;
        if (z) {
            f3 = 0.0f;
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (enumC35450Dvi == EnumC35450Dvi.UPWARD) {
            if (z) {
                f2 = -height;
                height = 0.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f3, f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", f2, height);
                AnimatorSet LIZ = C1DD.LIZ(150L);
                LIZ.setInterpolator(new LinearInterpolator());
                LIZ.addListener(new C70754Rpm(z, view, LIZ));
                LIZ.playTogether(ofFloat, ofFloat2);
                LIZ.start();
            }
            f2 = 0.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", f3, f);
            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(view, "translationY", f2, height);
            AnimatorSet LIZ2 = C1DD.LIZ(150L);
            LIZ2.setInterpolator(new LinearInterpolator());
            LIZ2.addListener(new C70754Rpm(z, view, LIZ2));
            LIZ2.playTogether(ofFloat3, ofFloat22);
            LIZ2.start();
        }
        if (z) {
            f2 = height;
            height = 0.0f;
            ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(view, "alpha", f3, f);
            ObjectAnimator ofFloat222 = ObjectAnimator.ofFloat(view, "translationY", f2, height);
            AnimatorSet LIZ22 = C1DD.LIZ(150L);
            LIZ22.setInterpolator(new LinearInterpolator());
            LIZ22.addListener(new C70754Rpm(z, view, LIZ22));
            LIZ22.playTogether(ofFloat32, ofFloat222);
            LIZ22.start();
        }
        f2 = 0.0f;
        height = -height;
        ObjectAnimator ofFloat322 = ObjectAnimator.ofFloat(view, "alpha", f3, f);
        ObjectAnimator ofFloat2222 = ObjectAnimator.ofFloat(view, "translationY", f2, height);
        AnimatorSet LIZ222 = C1DD.LIZ(150L);
        LIZ222.setInterpolator(new LinearInterpolator());
        LIZ222.addListener(new C70754Rpm(z, view, LIZ222));
        LIZ222.playTogether(ofFloat322, ofFloat2222);
        LIZ222.start();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a6m, viewGroup, false);
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
