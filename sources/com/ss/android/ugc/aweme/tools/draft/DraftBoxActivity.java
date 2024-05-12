package com.ss.android.ugc.aweme.tools.draft;

import X.ARI;
import X.ActivityC45651qj;
import X.C173576rZ;
import X.C26227ARb;
import X.C29901Fi;
import X.C3AW;
import X.C41658GWo;
import X.C43212Gxc;
import X.C44591Hel;
import X.C45804HyK;
import X.C55R;
import X.C55S;
import X.C55T;
import X.C5HC;
import X.C60903NvH;
import X.C61099NyR;
import X.C63422eI;
import X.C65803Ps7;
import X.C69B;
import X.C6YM;
import X.C74275TDb;
import X.C78605Ut7;
import X.GBO;
import X.GGS;
import X.H0W;
import X.InterfaceC144185lG;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.XKX;
import Y.AObjectS132S0100000_2;
import Y.AObjectS44S0101000_8;
import Y.AObjectS47S0101000_2;
import Y.IDeS154S0200000_2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class DraftBoxActivity extends GBO implements InterfaceC45540Hu4 {
    public static final /* synthetic */ int LJLJL = 0;
    public Fragment LJLJI;
    public final ArrayList<C5HC> LJLJJI = new ArrayList<>();
    public final C29901Fi<Boolean> LJLJJL = new C29901Fi<>();
    public final C29901Fi<Boolean> LJLJJLL = new C29901Fi<>();

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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Iterator<C5HC> it = this.LJLJJI.iterator();
        while (it.hasNext() && !it.next().onKeyDown(4, null)) {
        }
    }

    static {
        C6YM.LIZ();
        C69B.LIZ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        AVCommerceServiceImpl.LJIIJ().LJ();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onStart", true);
        super.onStart();
        C60903NvH.LJIIJJI().getPublishService().LJIIJJI().LIZLLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        C60903NvH.LJIIJJI().getPublishService().LJIIJJI().LIZ();
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

    public static void LLIIIJ(Context context) {
        ARI ari = new ARI(context);
        ari.LJII(context.getResources().getString(R.string.rtj), new AObjectS44S0101000_8(4, context, 1));
        ari.LJIIIIZZ(R.string.rti, null);
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LIZ(R.string.eyp);
        LIZ.LJIIL = ari;
        LIZ.LJI().LIZLLL();
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.eu);
        C60903NvH.LJIIJJI().LJJIJL().getMonitor().LIZLLL();
        C41658GWo.LIZLLL().LJ = Boolean.FALSE;
        LLIIIILZ(this, new AObjectS132S0100000_2(this, 6), new AObjectS47S0101000_2(2, this, 0));
        C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI();
        H0W.LIZ();
        C44591Hel.LIZ().init();
        C60903NvH.LJIIJJI().getPublishService().LIZIZ();
        C60903NvH.LJIIJJI().getPublishService().LJIL().LIZ();
        AVCommerceServiceImpl.LJIIJ().LJI((int) C74275TDb.LIZIZ(this, 15.0f));
        if (C55R.LIZ() || C55T.LIZ() || C55S.LIZ()) {
            XKX.LIZLLL(new C173576rZ().LIZ, null, null, new C63422eI(null), 3);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        this.LJLJJL.LJII(Boolean.valueOf(intent.getBooleanExtra("need_finish_posted_draft_fragment", false)));
        this.LJLJJLL.LJII(Boolean.valueOf(intent.getBooleanExtra("need_refresh_draft", false)));
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLJJI.add(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
        ListProtector.add(this.LJLJJI, 0, c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLJJI.remove(c5hc);
    }

    public static void LLIIIILZ(Context context, InterfaceC65784Pro<Void> interfaceC65784Pro, InterfaceC65784Pro<Void> interfaceC65784Pro2) {
        C61099NyR LIZIZ;
        if (!(context instanceof ActivityC45651qj)) {
            interfaceC65784Pro.invoke();
            return;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (C78605Ut7.LIZLLL()) {
            interfaceC65784Pro.invoke();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            LIZIZ = C61099NyR.LIZIZ(LJJIFFI, TokenCert.with("bpea-tools_request_storage_permission_draft_box_target33"));
            LIZIZ.LIZ("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        } else {
            LIZIZ = C61099NyR.LIZIZ(LJJIFFI, TokenCert.with("bpea-tools_request_storage_permission_draft_box"));
            LIZIZ.LIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        LIZIZ.LIZ.LIZJ(new IDeS154S0200000_2(interfaceC65784Pro2, interfaceC65784Pro, 0));
    }
}
