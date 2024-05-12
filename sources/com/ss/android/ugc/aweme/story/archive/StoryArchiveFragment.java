package com.ss.android.ugc.aweme.story.archive;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C187227Wk;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C42625Go9;
import X.C55723Ltv;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7F6;
import X.C7N3;
import X.C7N4;
import X.C7N5;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.GET;
import X.InterfaceC184277Lb;
import X.InterfaceC61213O0r;
import X.QD3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class StoryArchiveFragment extends BaseFragment {
    public final C214378bB LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C7N4.LJLIL, "enter_from", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    public StoryArchiveFragment() {
        AqS60S0110000_3 LJJ;
        C7N5 c7n5 = C7N5.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryArchListViewModel.class);
        C7N3 c7n3 = C7N3.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, c7n5, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c7n3, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C42625Go9.LIZJ(this);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GET.LJLIL);
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk privateModelEvent) {
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        Aweme aweme = privateModelEvent.LJLILLLLZI;
        if (aweme != null && (!aweme.getIsTikTokStory())) {
            BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) this.LJLILLLLZI.getValue();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            baseDetailShareVM.deleteItemByAid(aid);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.rqm)) == null) {
            str = "Stories archive";
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1625));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZJ = str;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 418));
        C42625Go9.LIZIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        o.LJIIIZ(inflater, "inflater");
        InterfaceC184277Lb LJIIIIZZ = C55723Ltv.LIZIZ.LJIIIIZZ();
        C29S c29s = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View LIZ = C7F6.LIZ(LJIIIIZZ, "story_fragment_archive", context, R.layout.co2, inflater, viewGroup, false, 32);
        if (!(LIZ instanceof View)) {
            LIZ = null;
        }
        if (LIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZ, this);
                C10A.LIZIZ(LIZ, this);
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
        return LIZ;
    }
}
