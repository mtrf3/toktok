package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.C188727au;
import X.C234529Ii;
import X.C252709vu;
import X.C72041SPd;
import X.C78928UyK;
import X.FMX;
import X.InterfaceC61213O0r;
import X.SNL;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class BasePrivacySettingFragmentSug extends BasePrivacySettingFragment {
    public int LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public String LJLJLJ = "privacy_setting";
    public String LJLJLLL = "";

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.LJLJLJ;
        String str2 = this.LJLJLLL;
        int i = this.LJLL;
        C188727au LIZ = C78928UyK.LIZ(str, "enterFrom", str2, "previousPage");
        LIZ.LJIIIZ("enter_from", str);
        LIZ.LJIIIZ("previous_page", str2);
        LIZ.LIZLLL(i, "is_rec");
        FMX.LJIIL("enter_suggest_accounts", LIZ.LIZ);
        SNL.LIZIZ().getClass();
        PrivacySettingsRestrictionItem LJFF = C72041SPd.LJFF(0, "sug_to_mutual_connections");
        if (LJFF == null || LJFF.getShowType() != 2 || LJFF.getResType() != 12) {
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_info_circle;
            LIZJ.LIZIZ(new AqS153S0100000_3(this, 174));
            c252709vu.LIZIZ(LIZJ);
        }
    }
}
