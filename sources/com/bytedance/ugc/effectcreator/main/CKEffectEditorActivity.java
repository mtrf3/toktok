package com.bytedance.ugc.effectcreator.main;

import X.C16880lQ;
import X.C29S;
import X.C38891fp;
import X.C39386Fd0;
import X.C39647FhD;
import X.C65803Ps7;
import X.C68322mC;
import X.C85999Xp5;
import X.C93901aYL;
import X.C93970aZS;
import X.C93971aZT;
import X.C94034aaU;
import X.C94783amZ;
import X.InterfaceC94011aa7;
import X.XKX;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.ckeapi.api.IInit;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CKEffectEditorActivity extends C29S implements InterfaceC94011aa7 {
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

    @Override // X.InterfaceC94011aa7
    public final CKEDraftInfo LJLI() {
        Intent intent = getIntent();
        if (intent != null) {
            return (CKEDraftInfo) intent.getParcelableExtra("Intent_Draft");
        }
        return null;
    }

    @Override // X.InterfaceC94011aa7
    public final int LJLJJLL() {
        Intent intent = getIntent();
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("draft_type", 0);
    }

    @Override // X.InterfaceC94011aa7
    public final String getTemplateId() {
        Intent intent = getIntent();
        if (intent != null) {
            return C16880lQ.LLJJIJIIJIL(intent, "key_template_id");
        }
        return null;
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C94034aaU.LIZ("CKEffectEditorActivity", "on destroy");
        super.onDestroy();
        CKEffectEditorContext.LJIIJJI();
        C93971aZT.LIZ().LIZ.clear();
        ImmersionBar.with(this).destroy();
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

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context LIZ = C39386Fd0.LIZ(context);
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZJ() != null) {
            C39647FhD.LIZLLL(LIZ);
        }
        super.attachBaseContext(context);
    }

    @Override // X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C85999Xp5.LJFF(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        T t;
        C65803Ps7.LIZ(this, bundle);
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZJ() != null) {
            C39647FhD.LIZLLL(this);
        }
        C93971aZT.LIZ().getClass();
        IInit iInit = (IInit) C93970aZS.LIZJ(IInit.class);
        if (iInit != null) {
            iInit.onInit();
            CKEffectEditorContext.LJIIIIZZ(true);
            C93971aZT.LIZ().LIZ.clear();
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            o.LJIIIIZZ(applicationContext, "this.applicationContext");
            C93901aYL.LIZ(applicationContext);
            super.onCreate(bundle);
            ImmersionBar with = ImmersionBar.with(this);
            with.navigationBarColor(R.color.aeq);
            with.init();
            setContentView(R.layout.activity_main);
            C68322mC c68322mC = new C68322mC();
            Intent intent = getIntent();
            if (intent != null) {
                t = intent.getParcelableExtra("Intent_Draft");
            } else {
                t = 0;
            }
            c68322mC.element = t;
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94783amZ(this, c68322mC, null), 3);
            C85999Xp5.LJFF(this);
            return;
        }
        throw new IllegalArgumentException("Please implement IInit with @ServiceImpl and register services in method onInit to config the sdk");
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        CKEDraftInfo cKEDraftInfo;
        super.onNewIntent(intent);
        CKEffectEditorContext.LJIIJJI();
        String str = null;
        if (intent != null) {
            cKEDraftInfo = (CKEDraftInfo) intent.getParcelableExtra("Intent_Draft");
        } else {
            cKEDraftInfo = null;
        }
        IMain iMain = (IMain) C93971aZT.LIZ().LIZ(IMain.class);
        if (iMain != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "this.supportFragmentManager");
            if (cKEDraftInfo != null) {
                str = cKEDraftInfo.draftPath;
            }
            iMain.onNewIntent(supportFragmentManager, str);
        }
    }
}
