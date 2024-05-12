package com.ss.android.ugc.aweme.setting.page.about;

import X.AD3;
import X.AD4;
import X.AE8;
import X.C2068389v;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C39532FfM;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C7MY;
import X.EF7;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class AboutPage extends BasePage {
    public AD4 LJLJJI;
    public TextView LJLJJL;
    public AE8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 799));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cjm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLJJL = (TextView) C7MY.LIZLLL(view, "view", R.id.n3_, "view.findViewById(R.id.version)");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, "", new AqS154S0100000_4(this, 798));
        c252709vu.setNavActions(c235119Kp);
        TextView textView = this.LJLJJL;
        C2068389v c2068389v = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (textView != null) {
            StringBuilder sb = new StringBuilder("v");
            String LIZLLL = EF7.LIZLLL();
            if (TextUtils.isEmpty(LIZLLL)) {
                LIZLLL = "1.0";
            }
            sb.append(LIZLLL);
            sb.append(" Build ");
            sb.append(EF7.LJIILIIL);
            sb.append("_");
            sb.append(C39532FfM.LIZJ(getContext()).LIZIZ("release_build", ""));
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "sb.toString()");
            textView.setText(sb2);
            C25851ACp c25851ACp = (C25851ACp) this.LJLJI.getValue();
            String string = getString(R.string.trj);
            String string2 = getString(R.string.j8h);
            o.LJIIIIZZ(string, "getString(R.string.visit_website_prompt)");
            int i = 130542;
            AD4 ad4 = new AD4(new AD3("", string, c2068389v, string2, objArr3 == true ? 1 : 0, i));
            this.LJLJJI = ad4;
            c25851ACp.LIZ(ad4);
            C25851ACp c25851ACp2 = (C25851ACp) this.LJLJI.getValue();
            String string3 = getString(R.string.j8f);
            String string4 = getString(R.string.g1p);
            String string5 = getString(R.string.dfr);
            o.LJIIIIZZ(string5, "getString(R.string.click_to_copy)");
            o.LJIIIIZZ(string3, "getString(R.string.official_email_prompt)");
            c25851ACp2.LIZ(new AD4(new AD3(string5, string3, objArr2 == true ? 1 : 0, string4, objArr == true ? 1 : 0, i)));
            AD4 ad42 = this.LJLJJI;
            if (ad42 != null) {
                ad42.LJIIJ(new AqS170S0100000_4(this, 985));
                return;
            } else {
                o.LJIJI("visitWebSiteUnit");
                throw null;
            }
        }
        o.LJIJI("mVersionView");
        throw null;
    }
}
