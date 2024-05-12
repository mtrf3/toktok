package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1B3;
import X.HG3;
import X.InterfaceC61213O0r;
import X.RBX;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class PushSettingManagerPage extends BasePage {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.ck8;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Intent intent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        Fragment LJJJIL = fragmentManager.LJJJIL("FRAGMENT_PUSH_MANAGER_LIST");
        if (LJJJIL == null) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                LJJJIL = new PushSettingManagerLogoutFragment();
                LJJJIL.setArguments(new Bundle());
            } else if (e1.LIZ(31744, "push_dynamic_setting_enabled", true, false)) {
                LJJJIL = new PushSettingFragmentDynamicUIVersion();
                LJJJIL.setArguments(new Bundle());
            } else if (Build.VERSION.SDK_INT >= 26) {
                LJJJIL = new PushSettingManagerFragmentSecondVersion();
                LJJJIL.setArguments(new Bundle());
            } else {
                LJJJIL = new PushSettingManagerFragment();
                LJJJIL.setArguments(new Bundle());
            }
        }
        Bundle bundle2 = new Bundle();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str = null;
        }
        bundle2.putString("enter_from", str);
        LJJJIL.setArguments(bundle2);
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJ(LJJJIL, "FRAGMENT_PUSH_MANAGER_LIST", R.id.dm7);
        c1b3.LJI();
    }
}
