package com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing;

import X.ActivityC86117Xqz;
import X.AnonymousClass021;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C59749Ncf;
import X.C62822Ol8;
import X.C63006Oo6;
import X.C63007Oo7;
import X.C63008Oo8;
import X.C63010OoA;
import X.C65803Ps7;
import X.C71897SJp;
import X.FMX;
import X.SY4;
import X.ViewOnTouchListenerC63009Oo9;
import Y.ACListenerS30S0100000_10;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class KRExistingUserTermsConsentDialog extends ActivityC86117Xqz {
    public boolean LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C63010OoA.LJLIL);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final TermsConsentInfo LLFII() {
        return (TermsConsentInfo) this.LJLILLLLZI.getValue();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String str2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ag8);
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.mn9);
        TermsConsentInfo LLFII = LLFII();
        String str3 = null;
        if (LLFII != null) {
            str = LLFII.getTitle();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = getString(R.string.dqz);
        }
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.mn8);
        TermsConsentInfo LLFII2 = LLFII();
        if (LLFII2 == null || (string = LLFII2.getDescription()) == null || string.length() == 0) {
            string = getString(R.string.hos);
        }
        textView2.setText(string);
        _$_findCachedViewById(R.id.mn8).setBackground(new ColorDrawable(-1));
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.mn5);
        TermsConsentInfo LLFII3 = LLFII();
        if (LLFII3 == null || (string2 = LLFII3.getCheckboxAll()) == null || string2.length() == 0) {
            string2 = getString(R.string.dqu);
        }
        textView3.setText(string2);
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.mn7);
        TermsConsentInfo LLFII4 = LLFII();
        if (LLFII4 == null || (string3 = LLFII4.getCheckboxTerms()) == null || string3.length() == 0) {
            string3 = getString(R.string.du4);
        }
        textView4.setText(string3);
        TextView textView5 = (TextView) _$_findCachedViewById(R.id.mn6);
        TermsConsentInfo LLFII5 = LLFII();
        if (LLFII5 == null || (string4 = LLFII5.getCheckboxPP()) == null || string4.length() == 0) {
            string4 = getString(R.string.dty);
        }
        textView5.setText(string4);
        ((TextView) _$_findCachedViewById(R.id.azp)).setText(getString(R.string.hot));
        ((SY4) _$_findCachedViewById(R.id.azp)).setSupportClickWhenDisable(true);
        C71897SJp cb_terms_pp_select_all = (C71897SJp) _$_findCachedViewById(R.id.b7q);
        o.LJIIIIZZ(cb_terms_pp_select_all, "cb_terms_pp_select_all");
        C71897SJp cb_terms_pp_select_terms = (C71897SJp) _$_findCachedViewById(R.id.b7s);
        o.LJIIIIZZ(cb_terms_pp_select_terms, "cb_terms_pp_select_terms");
        C71897SJp cb_terms_pp_select_pp = (C71897SJp) _$_findCachedViewById(R.id.b7r);
        o.LJIIIIZZ(cb_terms_pp_select_pp, "cb_terms_pp_select_pp");
        cb_terms_pp_select_all.setOnCheckedChangeListener(new C63006Oo6(cb_terms_pp_select_terms, cb_terms_pp_select_pp, this, cb_terms_pp_select_all));
        cb_terms_pp_select_terms.setOnCheckedChangeListener(new C63007Oo7(cb_terms_pp_select_pp, cb_terms_pp_select_all, this, cb_terms_pp_select_terms));
        cb_terms_pp_select_pp.setOnCheckedChangeListener(new C63008Oo8(cb_terms_pp_select_terms, cb_terms_pp_select_all, this, cb_terms_pp_select_pp));
        TermsConsentInfo LLFII6 = LLFII();
        if (LLFII6 != null) {
            str2 = LLFII6.getTermsOfUseUrl();
        } else {
            str2 = null;
        }
        TermsConsentInfo LLFII7 = LLFII();
        if (LLFII7 != null) {
            str3 = LLFII7.getPrivacyPolicyUrl();
        }
        if (str2 != null && str2.length() != 0) {
            WebView wv_terms = (WebView) _$_findCachedViewById(R.id.nk8);
            o.LJIIIIZZ(wv_terms, "wv_terms");
            LLFZ(wv_terms, str2);
        }
        if (str3 != null && str3.length() != 0) {
            WebView wv_pp = (WebView) _$_findCachedViewById(R.id.nk7);
            o.LJIIIIZZ(wv_pp, "wv_pp");
            LLFZ(wv_pp, str3);
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.azp), new ACListenerS30S0100000_10(this, 92));
        FMX.LJIIL("qa_kr_terms_dialog_show", new C188727au().LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onCreate", false);
    }

    public final void LLFZ(WebView webView, String str) {
        C16880lQ.LLZLI(webView, new C59749Ncf(this));
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        C16880lQ.LLZZ(webView, str);
        webView.setOnTouchListener(ViewOnTouchListenerC63009Oo9.LJLIL);
    }
}
