package com.ss.android.ugc.trill.setting;

import X.ActivityC45651qj;
import X.C1B3;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class PreferredLanguageSettingPage extends BasePage {
    public PreferredLanguageSettingFragment LJLJI;
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
        return R.layout.clb;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        PreferredLanguageSettingFragment preferredLanguageSettingFragment;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            Fragment LJJJIL = supportFragmentManager.LJJJIL("preferred_language_fragment");
            if (!(LJJJIL instanceof PreferredLanguageSettingFragment) || (preferredLanguageSettingFragment = (PreferredLanguageSettingFragment) LJJJIL) == null) {
                preferredLanguageSettingFragment = new PreferredLanguageSettingFragment();
            }
            this.LJLJI = preferredLanguageSettingFragment;
            preferredLanguageSettingFragment.setArguments(getArguments());
            PreferredLanguageSettingFragment preferredLanguageSettingFragment2 = this.LJLJI;
            if (preferredLanguageSettingFragment2 != null) {
                if (!preferredLanguageSettingFragment2.isAdded()) {
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    PreferredLanguageSettingFragment preferredLanguageSettingFragment3 = this.LJLJI;
                    if (preferredLanguageSettingFragment3 != null) {
                        c1b3.LJIIIIZZ(R.id.dm7, 1, preferredLanguageSettingFragment3, "preferred_language_fragment");
                        c1b3.LJ(null);
                        c1b3.LJI();
                        return;
                    }
                    o.LJIJI("preferredLanguageFragment");
                    throw null;
                }
                return;
            }
            o.LJIJI("preferredLanguageFragment");
            throw null;
        }
    }
}
