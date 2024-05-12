package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC39351FcR;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C222688oa;
import X.C38986FRu;
import X.C47246IgU;
import X.C47689Ind;
import X.C50912JyW;
import X.C50913JyX;
import X.C62822Ol8;
import X.C65803Ps7;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.K09;
import X.K0A;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class VideoPlayActivity extends ActivityC86117Xqz implements OnUIPlayListener {
    public static final /* synthetic */ int LJZ = 0;
    public C47689Ind LJLIL;
    public View LJLILLLLZI;
    public ImageView LJLJI;
    public ImageButton LJLJJI;
    public Video LJLJJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public float LJLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(K0A.LJLIL);
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public boolean LJLL = true;
    public String LJLLJ = "";
    public String LJLLL = "";
    public String LJLLLLLL = "";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final VideoViewComponent LLFII() {
        return (VideoViewComponent) this.LJLJJL.getValue();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        if (LLFII().LJFF()) {
            LLFZ(false);
        }
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", true);
        super.onResume();
        if (!LLFII().LJFF() && this.LJLJJLL != null && !this.LJLLILLLL) {
            LLFZ(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onStart", true);
        super.onStart();
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        if (!createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false)) {
            String LJI = C38986FRu.LIZ().LJI();
            C50913JyX c50913JyX = new C50913JyX();
            c50913JyX.LIZLLL = this.LJLLJ;
            c50913JyX.LJL = this.LJLLL;
            c50913JyX.LLIILII = this.LJLLLLLL;
            c50913JyX.LJLILLLLZI = LJI;
            c50913JyX.LJIILIIL();
            AbstractC39351FcR LIZ = C38986FRu.LIZ();
            if (LIZ.LJ) {
                AbstractC39351FcR.LJIIJ.storeBoolean("first_video", false);
                LIZ.LJ = false;
            }
        }
        LLFII().LJIILJJIL(this.LJLIL);
        LLFII().LIZ(this);
        C47246IgU.LIZJ(this.LJLIL).N7(new K09(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        LLFII().LLIIIILZ(this);
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

    public final void LLFZ(boolean z) {
        if (this.LJLLI) {
            if (!LLFII().LJFF() && this.LJLJJLL != null) {
                LLFII().LJIIL(this.LJLJJLL);
                ImageButton imageButton = this.LJLJJI;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                this.LJLLI = false;
                this.LJLLILLLL = false;
                return;
            }
            return;
        }
        if (!LLFII().LJFF()) {
            return;
        }
        LLFII().pause();
        ImageButton imageButton2 = this.LJLJJI;
        if (imageButton2 != null) {
            imageButton2.setVisibility(0);
        }
        this.LJLLI = true;
        if (!z) {
            return;
        }
        this.LJLLILLLL = true;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.al1);
        this.LJLIL = (C47689Ind) findViewById(R.id.n9f);
        this.LJLILLLLZI = findViewById(R.id.g94);
        this.LJLJI = (ImageView) findViewById(R.id.bfh);
        this.LJLJJI = (ImageButton) findViewById(R.id.hit);
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS28S0100000_8(this, 112));
        }
        C47689Ind c47689Ind = this.LJLIL;
        if (c47689Ind != null) {
            c47689Ind.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 113)));
        }
        ImageButton imageButton = this.LJLJJI;
        if (imageButton != null) {
            C16880lQ.LJIILL(imageButton, new ACListenerS28S0100000_8(this, 114));
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "play_addr_string");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLJL = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "cover_image_string");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLJLJ = LLJJIJIIJIL2;
        this.LJLL = getIntent().getBooleanExtra("loop", true);
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "video_id");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        this.LJLJLLL = LLJJIJIIJIL3;
        C16880lQ.LLJJIJIIJIL(getIntent(), "video_md5");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL4 == null) {
            LLJJIJIIJIL4 = "";
        }
        this.LJLLJ = LLJJIJIIJIL4;
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "video_type");
        if (LLJJIJIIJIL5 == null) {
            LLJJIJIIJIL5 = "";
        }
        this.LJLLL = LLJJIJIIJIL5;
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "tag_line");
        if (LLJJIJIIJIL6 != null) {
            str = LLJJIJIIJIL6;
        }
        this.LJLLLLLL = str;
        this.LJLLLL = getIntent().getFloatExtra("progress", 0.0f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.ui.VideoPlayActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C50912JyW c50912JyW = new C50912JyW();
        c50912JyW.LIZLLL = this.LJLLJ;
        c50912JyW.LJJLJLI = this.LJLLL;
        c50912JyW.LJIILIIL();
        if (!this.LJLL) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_code = ");
        if (ipg != null) {
            str = ipg.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        View view = this.LJLILLLLZI;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.LJLLLL > 0.0f) {
            C47689Ind c47689Ind = this.LJLIL;
            if (c47689Ind != null) {
                c47689Ind.setAlpha(1.0f);
            }
            LLFII().LJIIJ(this.LJLLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_code = ");
        if (ipg != null) {
            num = Integer.valueOf(ipg.LJ);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }
}
