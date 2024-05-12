package com.ss.android.ugc.aweme.tag;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78920UyC;
import X.C78926UyI;
import X.C7DJ;
import X.C7DK;
import X.C7DM;
import X.C7DS;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.GEV;
import X.HG3;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.RBX;
import X.T16;
import Y.ACListenerS23S0100000_3;
import Y.AfS15S1200000_3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.api.VideoTagApi;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.SocialVideoTagShareVM;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedTaggedListFragment extends BaseFragment {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public ArrayList<User> LJLJI;
    public Aweme LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    public FeedTaggedListFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1031);
        C65776Prg LIZ = C65352Pkq.LIZ(FeedTaggedListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ, 1029);
        C7DK c7dk = C7DK.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), aqS153S0100000_3, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7dk, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS153S0100000_3, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7dk, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1030));
        this.LJLJJL = C7DM.LJLIL;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (((FeedTaggedListViewModel) this.LJLIL.getValue()).LJLJI) {
            ((FeedTaggedListViewModel) this.LJLIL.getValue()).LJLJI = false;
            SocialVideoTagShareVM socialVideoTagShareVM = (SocialVideoTagShareVM) this.LJLILLLLZI.getValue();
            Aweme aweme = this.LJLJJI;
            socialVideoTagShareVM.getClass();
            if (aweme != null) {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                VideoTagApi.LIZ.getClass();
                VideoTagApi LIZ = C7DJ.LIZ();
                String LIZ2 = C78920UyC.LIZ('[', curUserId, ']');
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aid");
                LIZ.tagUpdate("", LIZ2, CastLongProtector.parseLong(aid)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS15S1200000_3(aweme, socialVideoTagShareVM, curUserId, 1), new InterfaceC64592gB() { // from class: X.7DL
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
            }
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GEV.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Serializable serializable2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("tagged_users");
        } else {
            serializable = null;
        }
        this.LJLJI = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("aweme");
        }
        this.LJLJJI = (Aweme) serializable2;
        Bundle arguments3 = getArguments();
        String str2 = "";
        if (arguments3 == null || (str = arguments3.getString("enter_from")) == null) {
            str = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("anchor_type")) != null) {
            str2 = string;
        }
        C8VV.LIZ(this, false, new AqS13S2100000_3(this, str, str2, 5));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.bfc), new ACListenerS23S0100000_3(this, 159));
        C7DS.LIZIZ("show_in_this_video_bottom_sheet", new AqS169S0100000_3((FeedTaggedListViewModel) this.LJLIL.getValue(), 742));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bsa, viewGroup, false);
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
