package com.ss.android.ugc.aweme.live;

import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C107794Kx;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C259710f;
import X.C30033BqX;
import X.C31205CMn;
import X.C40515FvD;
import X.C44037HQb;
import X.C59650Nb4;
import X.C59651Nb5;
import X.C65803Ps7;
import X.C77591Ucl;
import X.C90193gN;
import X.CN1;
import X.InterfaceC27436Apk;
import X.InterfaceC29111Bbf;
import X.InterfaceC31234CNq;
import X.InterfaceC31238CNu;
import X.OGB;
import X.QD3;
import Y.AObjectS11S0001000_6;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class LiveDummyActivity extends ActivityC86117Xqz implements InterfaceC29111Bbf, OGB {
    public static final /* synthetic */ int LJLJJLL = 0;
    public InterfaceC31234CNq LJLIL;
    public InterfaceC31238CNu LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public long LJLJJL = -1;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk interfaceC27436Apk) {
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC31238CNu interfaceC31238CNu = this.LJLILLLLZI;
        if (interfaceC31238CNu != null && interfaceC31238CNu.onBackPressed("swipe")) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        if (C90193gN.LIZIZ(this)) {
            overridePendingTransition(R.anim.e1, R.anim.e3);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(-1);
        }
        if (this.LJLJJI) {
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).E8(SystemClock.elapsedRealtime() - this.LJLJJL);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", true);
        super.onResume();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(2);
        }
        if (this.LJLJJI) {
            this.LJLJJL = SystemClock.elapsedRealtime();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", false);
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

    static {
        Live.getService();
    }

    @Override // X.C29S, X.C1AU, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC31238CNu interfaceC31238CNu;
        InterfaceC31234CNq interfaceC31234CNq = this.LJLIL;
        if (interfaceC31234CNq != null && interfaceC31234CNq.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (interfaceC31238CNu = this.LJLILLLLZI) != null && interfaceC31238CNu.onBackPressed("hardware_back_press")) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        Fragment LJJJIL;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", true);
        activityConfiguration(new AObjectS11S0001000_6(0, 2));
        super.onCreate(bundle);
        getTheme().applyStyle(C259710f.LIZ.LJFF(this), false);
        C44037HQb.LIZIZ(this, 0);
        setContentView(R.layout.br3);
        this.LJLJI = findViewById(R.id.dm7);
        getWindow().getDecorView().setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this));
        getWindow().setSoftInputMode(18);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        if (intExtra == 1) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (C31205CMn.LIZ() != null) {
                C40515FvD.LIZJ().LIZIZ(LLJJIJI.getString("url"));
                InterfaceC31238CNu LJZL = C30033BqX.LJZL(LLJJIJI);
                if (LJZL != null) {
                    AbsHybridFragment absHybridFragment = (AbsHybridFragment) LJZL;
                    this.LJLILLLLZI = absHybridFragment;
                    LLJJIJI.putBoolean("is_dummy_host", true);
                    absHybridFragment.setArguments(LLJJIJI);
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    c1b3.LJIIIIZZ(R.id.dm7, 1, absHybridFragment, null);
                    c1b3.LJI();
                }
            }
        } else if (intExtra == 2) {
            C16880lQ.LLJJIJI(intent);
            if (C31205CMn.LIZ() != null) {
                throw null;
            }
        } else if (intExtra == 3) {
            C16880lQ.LLJJIJI(intent);
            if (C31205CMn.LIZ() != null) {
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                C1B6.LIZ(supportFragmentManager2, supportFragmentManager2).LJIIIIZZ(R.id.dm7, 1, null, null);
                throw null;
            }
        } else if (intExtra == 4) {
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
            if (C31205CMn.LIZ() != null) {
                Fragment LLD = C30033BqX.LLD(this, LLJJIJI2);
                if (LLD instanceof InterfaceC31238CNu) {
                    this.LJLILLLLZI = (InterfaceC31238CNu) LLD;
                }
                LLJJIJI2.putBoolean("is_dummy_host", true);
                LLD.setArguments(LLJJIJI2);
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                supportFragmentManager3.getClass();
                C1B3 c1b32 = new C1B3(supportFragmentManager3);
                c1b32.LJIIIIZZ(R.id.dm7, 1, LLD, null);
                c1b32.LJI();
            }
        } else if (intExtra == 5) {
            Uri uri = (Uri) C16880lQ.LLJJIJI(intent).getParcelable("bundle_uri");
            String queryParameter = UriProtector.getQueryParameter(uri, "url");
            if (queryParameter != null && queryParameter.contains("fe_tiktok_ecommerce_shop_cart")) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJI = z;
            C30033BqX LIZ = C31205CMn.LIZ();
            if (LIZ != null && ((LJJJIL = getSupportFragmentManager().LJJJIL("new_container_tag")) != null || (LJJJIL = LIZ.LL(this, uri)) != null)) {
                if (LJJJIL instanceof InterfaceC31234CNq) {
                    this.LJLIL = (InterfaceC31234CNq) LJJJIL;
                }
                View view = this.LJLJI;
                if (view != null) {
                    view.setFitsSystemWindows(false);
                }
                if (!LJJJIL.isAdded()) {
                    FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                    C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager4, supportFragmentManager4);
                    LIZ2.LJIIIIZZ(R.id.dm7, 1, LJJJIL, "new_container_tag");
                    LIZ2.LJI();
                }
            }
        } else {
            finish();
        }
        if (C90193gN.LIZIZ(this)) {
            overridePendingTransition(R.anim.e0, R.anim.e2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", false);
    }

    @QD3
    public void onEvent(C59650Nb4 c59650Nb4) {
        C77591Ucl c77591Ucl = new C77591Ucl();
        Map<String, String> map = c59650Nb4.LJLJI;
        o.LJIIIZ(map, "<set-?>");
        c77591Ucl.LIZIZ = map;
        LiveOuterService.LJJJLL().LJJIJIL().createRechargeDialogFragment(this, new C59651Nb5(c59650Nb4), c59650Nb4.LJLILLLLZI, c77591Ucl).showNow(getSupportFragmentManager(), C16880lQ.LJLLJ(getClass()));
    }

    @QD3
    public void onEvent(C107794Kx c107794Kx) {
        if (!isDestroyed() && TextUtils.equals("live_event", c107794Kx.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(this, this.LJLJI, c107794Kx);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
