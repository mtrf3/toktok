package com.ss.android.ugc.aweme.ui.fragment;

import X.AWU;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16970lZ;
import X.C1807677o;
import X.C184077Kh;
import X.C1B3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C90903hW;
import X.RBY;
import Y.AObserverS71S0100000_3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeProfileWrapperFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeProfileWrapperFragment extends CommonPageFragment {
    public final C214378bB LJLJI;
    public I18nUserProfileFragmentV2 LJLJJI;
    public I18nMyProfileFragmentV2 LJLJJL;
    public Aweme LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1150));

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PostModeProfileWrapperFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((Fragment) this, 1671);
        C1807677o c1807677o = C1807677o.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJI = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c1807677o, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        User user;
        RBY rby;
        boolean z;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((PostModeContainerViewModel) this.LJLILLLLZI.getValue()).LJLJJI.observe(this, new AObserverS71S0100000_3(this, 33));
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getParcelable("POST_DETAIL_PARAMS");
        }
        this.LJLJJLL = ((PhotoSharedViewModel) this.LJLJI.getValue()).LJLILLLLZI;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("author");
        } else {
            serializable = null;
        }
        if (serializable instanceof User) {
            user = (User) serializable;
        } else {
            user = null;
        }
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null) {
            rby = LJIJ.LJFF();
        } else {
            rby = null;
        }
        if (user == null || user.getUid() == null) {
            z = false;
        } else {
            String uid = user.getUid();
            if (rby != null) {
                str = rby.getCurUserId();
            } else {
                str = null;
            }
            z = o.LJ(uid, str);
        }
        if (z) {
            I18nMyProfileFragmentV2 i18nMyProfileFragmentV2 = new I18nMyProfileFragmentV2();
            i18nMyProfileFragmentV2.z1(new AWU() { // from class: X.7uv
                @Override // X.AWU
                public final void LJI() {
                    ((PostModeContainerViewModel) PostModeProfileWrapperFragment.this.LJLILLLLZI.getValue()).LJLJLLL.setValue(C76800UCe.LIZ);
                }
            });
            Aweme aweme = this.LJLJJLL;
            if (aweme != null) {
                i18nMyProfileFragmentV2.LLIFFJFJJ(aweme);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.putBoolean("delay_profile_loading", true);
            }
            i18nMyProfileFragmentV2.setArguments(arguments3);
            this.LJLJJL = i18nMyProfileFragmentV2;
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(i18nMyProfileFragmentV2, null, R.id.hz6);
            c1b3.LJIILJJIL();
            return;
        }
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = new I18nUserProfileFragmentV2();
        i18nUserProfileFragmentV2.Hi(new AWU() { // from class: X.7uw
            @Override // X.AWU
            public final void LJI() {
                ((PostModeContainerViewModel) PostModeProfileWrapperFragment.this.LJLILLLLZI.getValue()).LJLJLLL.setValue(C76800UCe.LIZ);
            }
        });
        Aweme aweme2 = this.LJLJJLL;
        if (aweme2 != null) {
            i18nUserProfileFragmentV2.LLJI(aweme2.getAid());
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.putBoolean("delay_profile_loading", true);
            arguments4.putString("profile_from", "post_mode");
        }
        i18nUserProfileFragmentV2.setArguments(getArguments());
        this.LJLJJI = i18nUserProfileFragmentV2;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        childFragmentManager2.getClass();
        C1B3 c1b32 = new C1B3(childFragmentManager2);
        c1b32.LJIIJ(i18nUserProfileFragmentV2, null, R.id.hz6);
        c1b32.LJIILJJIL();
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV22 = this.LJLJJI;
        if (i18nUserProfileFragmentV22 == null) {
            return;
        }
        i18nUserProfileFragmentV22.bg(user, -1);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(R.layout.c1i, mo49getActivity(), viewGroup, false);
        o.LJIIIIZZ(LIZJ, "inflate(this.activity, R…layout, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZJ, this);
            C10A.LIZIZ(LIZJ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZJ;
    }
}
