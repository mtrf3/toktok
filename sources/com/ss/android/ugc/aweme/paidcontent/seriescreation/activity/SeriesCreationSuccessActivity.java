package com.ss.android.ugc.aweme.paidcontent.seriescreation.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C249239qJ;
import X.C249249qK;
import X.C249259qL;
import X.C252709vu;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C72818Shy;
import X.C76052yf;
import X.C9KF;
import X.EnumC249289qO;
import X.FMX;
import X.InterfaceC59973NgH;
import X.JBR;
import X.OJD;
import X.ORZ;
import X.SY4;
import X.W5F;
import X.W5U;
import Y.ACListenerS24S0100000_4;
import Y.IDCSpanS30S0100000_4;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class SeriesCreationSuccessActivity extends ActivityC86117Xqz {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public SmartImageView LJLJI;
    public TuxTextView LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesCreationSuccessActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public SeriesCreationSuccessActivity() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, C249239qJ.LJLIL, "collection_id", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, C249249qK.LJLIL, "enter_from", String.class);
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 479));
        this.LJLJJLL = C221108m2.LIZIZ(C249259qL.LJLIL);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "paidContent_draft_update"));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<String> LIZ;
        String str;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesCreationSuccessActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aj7);
        C252709vu c252709vu = (C252709vu) findViewById(R.id.gzz);
        if (c252709vu != null) {
            C9KF c9kf = new C9KF();
            String string = getString(R.string.qmr);
            o.LJIIIIZZ(string, "getString(R.string.serie…ewSeries_headerSec_title)");
            c9kf.LIZJ = string;
            c252709vu.LJIILLIIL(c9kf);
        }
        this.LJLJI = (SmartImageView) findViewById(R.id.gzx);
        PaidContentImageSettings.LIZ.getClass();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(PaidContentImageSettings.LIZ().seriesCreationSuccessImage.light);
        LJIIIIZZ.LJJIIJ = this.LJLJI;
        C16880lQ.LLJJJ(LJIIIIZZ);
        this.LJLJJI = (TuxTextView) findViewById(R.id.jpm);
        String string2 = getString(R.string.qqy);
        o.LJIIIIZZ(string2, "getString(R.string.serie…ssScreen_messageSec_body)");
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            try {
                OJD ojd = new OJD("\\{?\\{?(tiktok.com/series)\\}?\\}?", EnumC249289qO.IGNORE_CASE);
                InterfaceC59973NgH find$default = OJD.find$default(ojd, string2, 0, 2, null);
                if (find$default != null && (LIZ = find$default.LIZ()) != null && (str = (String) ORZ.LJLLLLLL(1, LIZ)) != null) {
                    String replace = ojd.replace(string2, str);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
                    StyleSpan styleSpan = new StyleSpan(1);
                    IDCSpanS30S0100000_4 iDCSpanS30S0100000_4 = new IDCSpanS30S0100000_4(this, 6);
                    int LJJLIIIJL = s.LJJLIIIJL(replace, str, 0, false, 6);
                    int length = str.length() + LJJLIIIJL;
                    spannableStringBuilder.setSpan(styleSpan, LJJLIIIJL, length, 18);
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("paid_content_series_shell_web_link_transfer_is_enabled", false)) {
                        spannableStringBuilder.setSpan(iDCSpanS30S0100000_4, LJJLIIIJL, length, 18);
                        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    string2 = spannableStringBuilder;
                }
            } catch (Exception unused) {
            }
            tuxTextView.setText(string2);
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.bv_);
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS24S0100000_4(this, 308));
        }
        SY4 sy4 = (SY4) findViewById(R.id.gzw);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 309));
        }
        FMX.LJIIL("show_new_series_created_page", JBR.LJIIIIZZ("collection_id", (String) this.LJLIL.getValue(), "enter_from", (String) this.LJLILLLLZI.getValue()).LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesCreationSuccessActivity", "onCreate", false);
    }
}
