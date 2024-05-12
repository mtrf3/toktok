package com.ss.android.ugc.aweme.profile.ui.multiaccount;

import X.ASQ;
import X.ASX;
import X.AV9;
import X.AVH;
import X.AVK;
import X.AVL;
import X.AVW;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C68989R5t;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC219588ja;
import X.ND2;
import Y.AObserverS68S0200000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.viewmodel.CheckMultiAccountViewModel;
import com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CheckAccountBottomSheetFragment extends Fragment implements InterfaceC219588ja, AVH {
    public static final /* synthetic */ int LJLJJLL = 0;
    public AVL LJLIL;
    public CheckMultiAccountViewModel LJLILLLLZI;
    public List<SignificantUserInfo> LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 700));

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.ia6);
        o.LJIIIIZZ(string, "getString(R.string.multiaccount_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 699));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AVH
    public final void Sa(Boolean bool) {
        Bundle bundle;
        Intent buildIntent;
        String str;
        if (bool != null) {
            List<SignificantUserInfo> list = this.LJLJI;
            if (list != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJFF(AVW.LIZ(list), "detail_info");
                c188727au.LIZLLL(list.size(), "account_cnt");
                c188727au.LJIIIZ("enter_method", "auto");
                if (o.LJ(bool, Boolean.TRUE)) {
                    str = "add_account_mine";
                } else {
                    str = "add_account_someone_else";
                }
                c188727au.LJIIIZ("exit_method", str);
                c188727au.LJIIIZ("enter_from", "login_page");
                FMX.LJIIL("account_list_submit", c188727au.LIZ);
            }
            if (mo49getActivity() != null && (mo49getActivity() instanceof I18nSignUpActivity)) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity");
                I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) mo49getActivity;
                Intent intent = i18nSignUpActivity.LJLJJI;
                SignupViewModel signupViewModel = i18nSignUpActivity.LJLJLJ;
                if (signupViewModel != null) {
                    boolean z = false;
                    if (signupViewModel.nv0().getBoolean("is_multi_account", false) && AVK.LIZIZ()) {
                        z = true;
                    }
                    if (intent != null) {
                        if (z) {
                            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                            if (LLJJIJI == null) {
                                LLJJIJI = new Bundle();
                            }
                            LLJJIJI.putBoolean("is_multi_account_same_user", z);
                            intent.putExtras(LLJJIJI);
                        }
                        C68989R5t.LIZIZ(i18nSignUpActivity, intent);
                    } else {
                        if (z) {
                            SmartRoute smartRoute = i18nSignUpActivity.LJLJJL;
                            if (smartRoute == null || (buildIntent = smartRoute.buildIntent()) == null || (bundle = C16880lQ.LLJJIJI(buildIntent)) == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("is_multi_account_same_user", z);
                            SmartRoute smartRoute2 = i18nSignUpActivity.LJLJJL;
                            if (smartRoute2 != null) {
                                smartRoute2.withParam(bundle);
                            }
                        }
                        SmartRoute smartRoute3 = i18nSignUpActivity.LJLJJL;
                        if (smartRoute3 != null) {
                            smartRoute3.open();
                        }
                    }
                } else {
                    o.LJIJI("dependencies");
                    throw null;
                }
            }
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLILLLLZI = (CheckMultiAccountViewModel) ViewModelProviders.of(mo49getActivity).get(CheckMultiAccountViewModel.class);
            ViewModelProviders.of(mo49getActivity).get(MultiProfilesViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        o.LJI(context);
        C29S c29s = null;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLIL = new AVL(new WeakReference(this), (AV9) this.LJLJJI.getValue(), mo49getActivity);
            CheckMultiAccountViewModel checkMultiAccountViewModel = this.LJLILLLLZI;
            if (checkMultiAccountViewModel != null) {
                LiveData map = Transformations.map(checkMultiAccountViewModel.LJLIL, ND2.LJLILLLLZI);
                o.LJIIIIZZ(map, "map(currentUserLiveData)…otNull { list -> list } }");
                map.observe(getViewLifecycleOwner(), new AObserverS68S0200000_4(recyclerView, this, 1));
            } else {
                o.LJIJI("checkMultiAccountViewModel");
                throw null;
            }
        }
        try {
            ViewTreeLifecycleOwner.set(recyclerView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(recyclerView, this);
            C10A.LIZIZ(recyclerView, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return recyclerView;
    }
}
