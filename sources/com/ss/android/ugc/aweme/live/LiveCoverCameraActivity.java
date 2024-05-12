package com.ss.android.ugc.aweme.live;

import X.C158096Ij;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C259710f;
import X.C259810g;
import X.C28493BGf;
import X.C29S;
import X.C31878CfC;
import X.C62822Ol8;
import X.C62908OmW;
import X.C65803Ps7;
import X.InterfaceC30045Bqj;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LiveCoverCameraActivity extends C29S {
    public InterfaceC30045Bqj LJLIL;
    public CropFragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        Object obj;
        Lifecycle lifecycle;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onResume", true);
        super.onResume();
        if (C158096Ij.LIZ && (obj = this.LJLIL) != null && (lifecycle = ((Fragment) obj).getLifecycle()) != null) {
            IComplianceBusinessService complianceBusinessService = (IComplianceBusinessService) this.LJLJI.getValue();
            o.LJIIIIZZ(complianceBusinessService, "complianceBusinessService");
            lifecycle.addObserver(complianceBusinessService.LJIIJ(this, R.string.g0n, "direct_shoot", "personal_homepage", "", null));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onResume", false);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public LiveCoverCameraActivity() {
        new LinkedHashMap();
        this.LJLJI = C221108m2.LIZIZ(C62908OmW.LJLIL);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C28493BGf.LIZ = null;
        super.onDestroy();
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
        CropFragment cropFragment;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onCreate", true);
        super.onCreate(bundle);
        C259810g c259810g = C259710f.LIZ;
        if (c259810g.LJII(this)) {
            setTheme(R.style.ux);
        }
        getTheme().applyStyle(c259810g.LJFF(this), false);
        setContentView(R.layout.bor);
        getWindow().getDecorView().setBackgroundResource(0);
        Uri uri = (Uri) getIntent().getParcelableExtra("photoUri");
        boolean booleanExtra = getIntent().getBooleanExtra("isFromLiveCover", false);
        if (booleanExtra) {
            if (uri != null) {
                cropFragment = C31878CfC.LIZ(booleanExtra, uri);
            } else {
                cropFragment = null;
            }
            this.LJLILLLLZI = cropFragment;
            if (cropFragment != null) {
                cropFragment.LJLJL = new AqS160S0100000_10(this, 253);
            }
        }
        InterfaceC30045Bqj createLiveCoverCameraFragment = Live.getService().createLiveCoverCameraFragment();
        this.LJLIL = createLiveCoverCameraFragment;
        if (createLiveCoverCameraFragment != null) {
            ((LiveCoverCameraFragment) createLiveCoverCameraFragment).LJLLL = new AqS160S0100000_10(this, 254);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        Object obj = this.LJLIL;
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.broadcast.ILiveCoverCameraFragment");
        LIZ.LJIIJ((Fragment) obj, null, R.id.dm7);
        LIZ.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "onCreate", false);
    }
}
