package com.ss.android.ugc.sdk.channel.third.facebook;

import X.C113554cx;
import X.C16880lQ;
import X.C1GE;
import X.C29S;
import X.C62673Oij;
import X.C62675Oil;
import X.C62676Oim;
import X.C62677Oin;
import X.C65803Ps7;
import X.InterfaceC62573Oh7;
import X.OSZ;
import X.Q6B;
import X.Q85;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS11S0202000_11;
import kotlin.jvm.internal.AqS71S0400000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FacebookShareActivity extends C29S {
    public static InterfaceC62573Oh7 LJLJJL;
    public Q85 LJLIL;
    public String LJLILLLLZI;
    public final Map<String, TokenCert> LJLJI;
    public final C62675Oil LJLJJI;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.sdk.channel.third.facebook.FacebookShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FacebookShareActivity() {
        new LinkedHashMap();
        this.LJLILLLLZI = "";
        TokenCert.Companion companion = TokenCert.Companion;
        this.LJLJI = C113554cx.LJJL(new OSZ("landscape_photo_share", companion.with("bpea-facebook_androidsdk_6536")), new OSZ("non_landscape_photo_share", companion.with("bpea-facebook_androidsdk_4403")), new OSZ("non_landscape_photo_share_v2", companion.with("bpea-facebook_androidsdk_1999")), new OSZ("landscape_video_share_top_activity", companion.with("bpea-facebook_androidsdk_5564")), new OSZ("landscape_video_share", companion.with("bpea-facebook_androidsdk_6870")), new OSZ("non_landscape_video_share", companion.with("bpea-facebook_androidsdk_2000")), new OSZ("landscape_link_share_top_activity", companion.with("bpea-facebook_androidsdk_7030")), new OSZ("landscape_link_share", companion.with("bpea-facebook_androidsdk_6132")), new OSZ("non_landscape_link_share", companion.with("bpea-facebook_androidsdk_1998")));
        this.LJLJJI = new C62675Oil(this);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Intent intent;
        Uri data;
        String string;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.sdk.channel.third.facebook.FacebookShareActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.e9);
        this.LJLIL = new Q85(new Q6B());
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        String str2 = null;
        if (LLJJIJI != null) {
            str2 = LLJJIJI.getString("share_mode");
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI2 == null || (str = LLJJIJI2.getString("cert_token")) == null) {
            str = "";
        }
        this.LJLILLLLZI = str;
        Bundle LLJJIJI3 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI3 != null && (string = LLJJIJI3.getString("title")) != null) {
            str3 = string;
        }
        TokenCert tokenCert = this.LJLJI.get(this.LJLILLLLZI);
        if (tokenCert != null && (intent = getIntent()) != null && (data = intent.getData()) != null) {
            C62673Oij.LIZIZ(this);
            if (o.LJ(str2, "photo_share")) {
                C1GE.LJIJJ(tokenCert, "Facebook", "sharePhoto", new AqS71S0400000_11(data, this, this.LJLIL, this.LJLJJI, 4));
            } else if (o.LJ(str2, "video_share")) {
                C1GE.LJIJJ(tokenCert, "Facebook", "shareVideo", new AqS71S0400000_11(data, this, this.LJLIL, this.LJLJJI, 7));
            } else {
                C62677Oin c62677Oin = new C62677Oin();
                c62677Oin.LIZ = data;
                c62677Oin.LIZIZ = str3;
                C1GE.LJIJJ(tokenCert, "Facebook", "shareLink", new AqS71S0400000_11(new C62676Oim(c62677Oin), this, this.LJLIL, this.LJLJJI, 2));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.sdk.channel.third.facebook.FacebookShareActivity", "onCreate", false);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Q85 q85;
        super.onActivityResult(i, i2, intent);
        TokenCert tokenCert = this.LJLJI.get(this.LJLILLLLZI);
        if (tokenCert != null && (q85 = this.LJLIL) != null) {
            C1GE.LJIJJ(tokenCert, "Facebook", "onActivityResult", new AqS11S0202000_11(i, i2, intent, q85, 1));
        }
    }
}
