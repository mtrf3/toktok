package com.ss.android.ugc.trill.setting;

import X.ActivityC45651qj;
import X.C04330Ez;
import X.C1B3;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class DisplaySettingPage extends BasePage {
    public ViewGroup LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.ck_;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(view, "view");
        this.LJLJI = (ViewGroup) view.findViewById(R.id.j71);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(C04330Ez.LIZIZ(viewGroup.getContext(), R.color.ar));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            Fragment LJJJIL = supportFragmentManager.LJJJIL("language_app_fragment");
            if (!(LJJJIL instanceof AppLanguageListFragment) || LJJJIL == null) {
                LJJJIL = new AppLanguageListFragment();
            }
            if (!LJJJIL.isAdded()) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(R.id.dm7, 1, LJJJIL, "language_app_fragment");
                c1b3.LJ(null);
                c1b3.LJI();
            }
        }
        ViewModelProviders.of(this).get(AppLanguageViewModel.class);
    }
}
