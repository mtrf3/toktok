package com.ss.android.ugc.aweme.live;

import X.B73;
import X.C0IT;
import X.C0NB;
import X.C16880lQ;
import X.C29199Bd5;
import X.C29306Beo;
import X.C32831Qp;
import X.C47061t0;
import X.C5H3;
import X.C61495OBn;
import X.C65803Ps7;
import X.C73411SrX;
import X.C78983UzD;
import X.C78996UzQ;
import X.C86153XrZ;
import X.C86154Xra;
import X.C86155Xrb;
import X.C86156Xrc;
import X.EnumC32529Cph;
import X.InterfaceC118544l0;
import X.InterfaceC12680ee;
import X.InterfaceC30043Bqh;
import X.InterfaceC30046Bqk;
import X.InterfaceC30302Bus;
import X.O6U;
import X.RunnableC62611Ohj;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.SmoothGoLiveStatusChannel;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class GoLiveActivity extends O6U implements InterfaceC12680ee, InterfaceC118544l0 {
    public GoLiveManager LJLIL;
    public C32831Qp LJLJI;
    public InterfaceC30046Bqk LJLJJI;
    public InterfaceC30302Bus LJLJJL;
    public InterfaceC30043Bqh LJLJJLL;
    public C73411SrX LJLJL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public EnumC32529Cph LJLILLLLZI = EnumC32529Cph.PREVIEW;
    public final RunnableC62611Ohj LJLJLJ = RunnableC62611Ohj.LJLIL;
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 280));
    public final C61495OBn LJLL = new C61495OBn(this);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GoLiveActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC118544l0
    public final boolean LJJIJL() {
        EnumC32529Cph enumC32529Cph = this.LJLILLLLZI;
        if (enumC32529Cph == EnumC32529Cph.BROADCAST || enumC32529Cph == EnumC32529Cph.END) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC12680ee
    public final void LJJIZ() {
        C32831Qp c32831Qp = this.LJLJI;
        if (c32831Qp != null) {
            c32831Qp.LJJIZ();
        }
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJJJJL() {
        C32831Qp c32831Qp = this.LJLJI;
        if (c32831Qp != null) {
            return c32831Qp.LJLJJI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final SurfaceView LJJZZIII() {
        C32831Qp c32831Qp = this.LJLJI;
        if (c32831Qp != null) {
            return c32831Qp.LJLJI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final C47061t0 LJLIL() {
        C32831Qp c32831Qp = this.LJLJI;
        if (c32831Qp != null) {
            return c32831Qp.LJLILLLLZI;
        }
        return null;
    }

    @Override // X.InterfaceC12680ee
    public final ViewGroup LJLJJL() {
        C32831Qp c32831Qp = this.LJLJI;
        if (c32831Qp != null) {
            return c32831Qp.LJLIL;
        }
        return null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Boolean bool;
        InterfaceC30302Bus interfaceC30302Bus = this.LJLJJL;
        if (interfaceC30302Bus != null) {
            bool = Boolean.valueOf(interfaceC30302Bus.onBackPressed());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool) && this.LJLILLLLZI != EnumC32529Cph.COUNTDOWN) {
            super.onBackPressed();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        if (this.LJLILLLLZI != EnumC32529Cph.PREVIEW) {
            C0IT.LIZLLL(this);
        }
        LLIIIJ(EnumC32529Cph.NONE);
        Live.getService().releaseLiveStream();
        Live.getService().setBroadcastActivity(null);
        B73.LIZJ(this);
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

    public static Bundle LLIIIILZ(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", C16880lQ.LLJJIJIIJIL(intent, "enter_from"));
        bundle.putString("video_id", C78983UzD.LJJIJL());
        bundle.putString("sourceParams", C16880lQ.LLJJIJIIJIL(intent, "extra_live_source_params"));
        bundle.putString("enter_from_type", CardStruct.IStatusCode.DEFAULT);
        return bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(4:3|(1:5)|6|(6:8|(1:21)(1:10)|11|(1:19)(1:13)|14|(1:16)))|22|(5:24|(1:26)(1:33)|27|(1:31)|32)|34|(1:38)|39|(2:41|(5:43|44|45|46|47))|51|44|45|46|47) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.ss.android.ugc.aweme.live.GoLiveManager, androidx.lifecycle.LifecycleObserver, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.GoLiveActivity.LLII(java.lang.String):void");
    }

    public final void LLIIIJ(EnumC32529Cph enumC32529Cph) {
        this.LJLILLLLZI = enumC32529Cph;
        DataChannelGlobal.LJLJJI.tv0(SmoothGoLiveStatusChannel.class, enumC32529Cph);
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GoLiveActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Live.getService().LJIJJLI(this);
        getWindow().setSoftInputMode(48);
        setContentView(R.layout.brd);
        ((C29199Bd5) this.LJLJLLL.getValue()).LIZIZ(new C86155Xrb(this), new C86153XrZ(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GoLiveActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null || this.LJLILLLLZI == EnumC32529Cph.BROADCAST) {
            return;
        }
        try {
            String string = LLIIIILZ(intent).getString("sourceParams");
            if (string != null && o.LJ("live_end_page", new JSONObject(string).optString("request_page"))) {
                setIntent(intent);
                Live.getService().releaseLiveStream();
                LLFZ();
                ((C29199Bd5) this.LJLJLLL.getValue()).LIZIZ(new C86156Xrc(this), new C86154Xra(this));
            }
        } catch (Exception unused) {
            C0NB.LIZIZ("GoLiveActivity", "source params json parse failed!");
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(new Bundle());
    }
}
