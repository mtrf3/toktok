package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike;

import X.ActivityC45651qj;
import X.C188727au;
import X.C252709vu;
import X.C47261Igj;
import X.C5H3;
import X.C63025OoP;
import X.C71937SLd;
import X.C71938SLe;
import X.C71939SLf;
import X.C71945SLl;
import X.C9KF;
import X.FMX;
import X.InterfaceC61213O0r;
import X.SKL;
import X.SLJ;
import X.SNL;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.keva.Keva;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class CommentFilterDislikeFragment extends SimplePrivacySettingFragment {
    public final boolean LJLJJI;
    public PermissionSettingItemViewModel LJLJJL;
    public PermissionSettingItemViewModel LJLJJLL;
    public PermissionSettingItemViewModel LJLJL;
    public C71939SLf LJLJLJ;
    public final SKL LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public CommentFilterDislikeFragment() {
        Keva keva = C63025OoP.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_dislike_filter_disable_automatic_level_");
        LIZ.append(C71945SLl.LIZIZ());
        this.LJLJJI = keva.getBoolean(X1D.LIZIZ(LIZ), false);
        this.LJLJLLL = new SKL(this);
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLL = routeArgExtension.optionalArg(this, C71937SLd.LJLIL, "enter_from", String.class);
        this.LJLLI = routeArgExtension.optionalArg(this, C71938SLe.LJLIL, "enter_method", String.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment
    public final List<SLJ> vl() {
        C71939SLf c71939SLf = this.LJLJLJ;
        if (c71939SLf != null) {
            return C47261Igj.LJJIJ(c71939SLf);
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SNL.LIZ.LIZ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            mo49getActivity = this;
        }
        PermissionSettingViewModel permissionSettingViewModel = (PermissionSettingViewModel) new ViewModelProvider(mo49getActivity).get(PermissionSettingViewModel.class);
        PermissionSettingItemViewModel permissionSettingItemViewModel = permissionSettingViewModel.LJLIL;
        permissionSettingItemViewModel.mv0(this.LJLJLLL);
        this.LJLJJL = permissionSettingItemViewModel;
        PermissionSettingItemViewModel permissionSettingItemViewModel2 = permissionSettingViewModel.LJLILLLLZI;
        permissionSettingItemViewModel2.mv0(this.LJLJLLL);
        this.LJLJJLL = permissionSettingItemViewModel2;
        PermissionSettingItemViewModel permissionSettingItemViewModel3 = permissionSettingViewModel.LJLJI;
        permissionSettingItemViewModel3.mv0(this.LJLJLLL);
        this.LJLJL = permissionSettingItemViewModel3;
        this.LJLJLJ = new C71939SLf(this);
        String str = (String) this.LJLL.getValue();
        String str2 = (String) this.LJLLI.getValue();
        C188727au c188727au = new C188727au();
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL("filter_selected_comment_types_load", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter.SimplePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String string = getString(R.string.dij);
        o.LJIIIIZZ(string, "getString(titleRes)");
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        c252709vu.LJIILLIIL(c9kf);
    }
}
