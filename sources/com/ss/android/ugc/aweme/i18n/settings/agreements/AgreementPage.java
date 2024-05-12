package com.ss.android.ugc.aweme.i18n.settings.agreements;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C235119Kp;
import X.C252709vu;
import X.C59791NdL;
import X.C78840Uwu;
import X.InterfaceC61213O0r;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes11.dex */
public final class AgreementPage extends BasePage implements View.OnClickListener {
    public WebView LJLJI;
    public TextView LJLJJI;
    public View LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cjo;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.LJLJI;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.LJLJI;
        if (webView != null) {
            webView.onResume();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vl();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        Bundle LLJJIJI;
        String string;
        WebSettings settings;
        o.LJIIIZ(view, "view");
        this.LJLJI = (WebView) view.findViewById(R.id.gpv);
        this.LJLJJI = (TextView) view.findViewById(R.id.ze);
        this.LJLJJL = view.findViewById(R.id.g8u);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (intent = mo49getActivity.getIntent()) == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
            vl();
            return;
        }
        int i = 0;
        String str = "";
        if (LLJJIJI.getBoolean("HIDE_TITLE_BAR", false) || (string = LLJJIJI.getString("FIELD_TITLE")) == null) {
            string = "";
        }
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS160S0100000_10(this, 243));
        c252709vu.setNavActions(c235119Kp);
        boolean z = LLJJIJI.getBoolean("FIELD_SHOW_AGREE_BUTTON", false);
        String string2 = LLJJIJI.getString("URL_FIELD");
        if (string2 != null) {
            str = string2;
        }
        TextView textView = this.LJLJJI;
        if (textView != null) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, this);
        }
        if (!TextUtils.isEmpty(str)) {
            WebView webView = this.LJLJI;
            if (webView != null) {
                C16880lQ.LLZZ(webView, str);
            }
            WebView webView2 = this.LJLJI;
            if (webView2 != null) {
                C16880lQ.LLZLI(webView2, new C59791NdL(this));
            }
            WebView webView3 = this.LJLJI;
            if (webView3 == null || (settings = webView3.getSettings()) == null) {
                return;
            }
            settings.setJavaScriptEnabled(true);
        }
    }
}
