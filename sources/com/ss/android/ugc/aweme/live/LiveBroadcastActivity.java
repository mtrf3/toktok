package com.ss.android.ugc.aweme.live;

import X.B73;
import X.C0IT;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1X;
import X.C29066Baw;
import X.C29121Bbp;
import X.C2E1;
import X.C32537Cpp;
import X.C32831Qp;
import X.C46375IHz;
import X.C47061t0;
import X.C4S;
import X.C4T;
import X.C5HC;
import X.C61493OBl;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C77434UaE;
import X.InterfaceC12680ee;
import X.InterfaceC144185lG;
import X.InterfaceC30043Bqh;
import X.InterfaceC30302Bus;
import X.InterfaceC45540Hu4;
import X.InterfaceC88472Yns;
import X.NTI;
import X.O6U;
import X.QD3;
import X.VCK;
import X.VCN;
import Y.ACListenerS45S0200000_10;
import Y.AObjectS14S0001000_13;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS16S0000000_9;
import Y.IDRunnableS6S0101000;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableBroadcastSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public class LiveBroadcastActivity extends O6U implements InterfaceC45540Hu4, InterfaceC12680ee {
    public static final /* synthetic */ int LJLJLLL = 0;
    public InterfaceC30302Bus LJLIL;
    public InterfaceC30043Bqh LJLILLLLZI;
    public boolean LJLJI;
    public C32831Qp LJLJJLL;
    public final List<InterfaceC144185lG> LJLJJI = new ArrayList();
    public final Handler LJLJJL = new Handler(Looper.myLooper());
    public C61493OBl LJLJL = new C61493OBl(this);
    public final ARunnableS16S0000000_9 LJLJLJ = new ARunnableS16S0000000_9(0);

    @Override // X.O6U
    public final int LLFII() {
        return 1;
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
    }

    @Override // X.InterfaceC12680ee
    public final void LJJIZ() {
        C32831Qp c32831Qp = this.LJLJJLL;
        if (c32831Qp != null) {
            c32831Qp.LJJIZ();
        }
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJJJJL() {
        C32831Qp c32831Qp = this.LJLJJLL;
        if (c32831Qp != null) {
            return c32831Qp.LJLJJI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final SurfaceView LJJZZIII() {
        C32831Qp c32831Qp = this.LJLJJLL;
        if (c32831Qp != null) {
            return c32831Qp.LJLJI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJLIL() {
        C32831Qp c32831Qp = this.LJLJJLL;
        if (c32831Qp != null) {
            return c32831Qp.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final ViewGroup LJLJJL() {
        C32831Qp c32831Qp = this.LJLJJLL;
        if (c32831Qp != null) {
            return c32831Qp.LJLIL;
        }
        return null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC30302Bus interfaceC30302Bus = this.LJLIL;
        if (interfaceC30302Bus != null && interfaceC30302Bus.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        this.LJLJL = null;
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class)).invoke(0);
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(0);
            }
        }
        ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C4S.class);
        super.onDestroy();
        C0IT.LIZLLL(this);
        this.LJLJJL.removeCallbacksAndMessages(null);
        VCN.LIZIZ(this, VCK.BROADCAST);
        C29121Bbp.LIZ();
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

    public final void LLII(Bundle bundle) {
        this.LJLIL = Live.getService().createLiveBroadcastFragment(this.LJLJL, bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        LIZ.LJIIJ(this.LJLIL.getFragment(), null, R.id.dm7);
        LIZ.LJIILJJIL();
        Live.getService().setBroadcastActivity(this);
        int i = 0;
        Live.getService().preloadLiveStream(this, this.LJLJI, bundle.getBoolean("is_try_mode", false));
        C0IT.LIZJ(this);
        C62822Ol8 c62822Ol8 = C46375IHz.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() >= 0) {
            Handler handler = this.LJLJJL;
            ARunnableS16S0000000_9 aRunnableS16S0000000_9 = this.LJLJLJ;
            int intValue = ((Number) c62822Ol8.getValue()).intValue();
            if (intValue >= 0 && (i = intValue) > 60) {
                i = 60;
            }
            handler.postDelayed(aRunnableS16S0000000_9, i * 1000);
        }
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        activityConfiguration(new AObjectS14S0001000_13(2, 0));
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((C32537Cpp) dataChannelGlobal.gv0(C2E1.class)).LIZ = null;
        ((InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class)).invoke(1);
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(1);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.boy);
        C32831Qp c32831Qp = new C32831Qp();
        this.LJLJJLL = c32831Qp;
        c32831Qp.LIZ(this, (FrameLayout) findViewById(R.id.ar3));
        VCN.LIZ(this, VCK.BROADCAST);
        if (getWindow() != null) {
            getWindow().addFlags(128);
            if (LiveOverdrawOptimizeSettings.INSTANCE.enable()) {
                getWindow().getDecorView().setBackgroundResource(0);
            }
        }
        LLFZ();
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = C16880lQ.LLJJIJI(getIntent());
            this.LJLJI = getIntent().getBooleanExtra("is_one_tap_go_live", false);
        }
        if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
            B73.LIZ().postDelayed(new ARunnableS12S0101000_8(2, this, 9), LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value());
        }
        if (TestEnableBroadcastSetting.INSTANCE.enable()) {
            LLII(bundle2);
        } else {
            findViewById(R.id.j7n).setBackgroundColor(C15380j0.LIZIZ(R.color.ey));
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, bundle2, 12), findViewById(R.id.j7n));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }

    @QD3
    public void onEvent(NTI nti) {
        if (Live.getService() != null) {
            Live.getService().LJJJJJ();
        }
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            C77434UaE.LIZ(this, intent);
            this.LJLJI = intent.getBooleanExtra("is_one_tap_go_live", false);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "request_page");
            if (this.LJLJI || "live_end_page".equals(LLJJIJIIJIL)) {
                Live.getService().releaseLiveStream();
                LLFZ();
                Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
                    B73.LIZ().postDelayed(new IDRunnableS6S0101000(3, this, 17), LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value());
                }
                C32831Qp c32831Qp = new C32831Qp();
                this.LJLJJLL = c32831Qp;
                c32831Qp.LIZ(this, (FrameLayout) findViewById(R.id.ar3));
                this.LJLIL = Live.getService().createLiveBroadcastFragment(this.LJLJL, LLJJIJI);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                LIZ.LJIIJ(this.LJLIL.getFragment(), null, R.id.dm7);
                LIZ.LJIILJJIL();
                Live.getService().setBroadcastActivity(this);
                Live.getService().preloadLiveStream(this, this.LJLJI, false);
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LJLJJI).add(interfaceC144185lG);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LJLJJI).remove(interfaceC144185lG);
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
