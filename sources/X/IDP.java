package X;

import Y.ACallableS106S0100000_3;
import Y.ACallableS111S0100000_8;
import Y.ACallableS41S0000000_6;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS11S0201000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS14S1000000_8;
import Y.ARunnableS19S0300000_8;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS2S0202000_8;
import Y.ARunnableS47S0100000_11;
import Y.ARunnableS5S0200100_8;
import Y.ARunnableS9S0101000_5;
import Y.IDBReceiverS6S0100000_6;
import Y.IDHandlerS21S0100000_8;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplashnp.RealTimeSplashNPManagerImpl;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.IUgAllService;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.AwemeContextServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAwemeContextService;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.experiment.AdPreloadExperimentData;
import com.ss.android.ugc.aweme.feed.experiment.AdPreloadMainSwitch;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.StoryVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackService;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.service.proactive.ProactiveTriggersService;
import com.ss.android.ugc.aweme.services.NetworkLevelService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.video.experiment.PlayerSmartPrerenderConfig;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPreloadDataComponent;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public class IDP extends C2LB implements OnUIPlayListener, OnPreRenderListener {
    public static Pair<String, HashMap<String, Boolean>> LLLLZLL;
    public static boolean LLLLZLLIL;
    public static boolean LLLLZLLLI;
    public static final long LLLZ = System.currentTimeMillis();
    public static final int LLLZI = 5;
    public static final C35751E1j LLLZIIL = new C35751E1j(10);
    public static final C46247IDb LLLZIL = new C46247IDb();
    public boolean LJLJLLL;
    public final WeakReference<IDR> LJLL;
    public KeyguardManager LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public final java.util.Map<String, Long> LJLLL;
    public IE6 LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public String LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public long LLF;
    public final C64082fM LLFF;
    public final C64092fN LLFFF;
    public final C64012fF LLFII;
    public final C64042fI LLFZ;
    public final C64062fK LLI;
    public final C64072fL LLIFFJFJJ;
    public final C64532g5 LLII;
    public final C64172fV LLIIII;
    public final C64122fQ LLIIIILZ;
    public long LLIIIJ;
    public long LLIIIL;
    public long LLIIIZ;
    public long LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public long LLIILII;
    public long LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public long LLILII;
    public long LLILIL;
    public long LLILL;
    public C56462Jm LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public volatile boolean LLIZLLLIL;
    public Aweme LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public IDBReceiverS6S0100000_6 LLJILJIL;
    public Aweme LLJILJILJ;
    public boolean LLJILLL;
    public C35732E0q LLJJ;
    public C73318Sq2 LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public double LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final KTY LLJJJ;
    public final C64162fU LLJJJIL;
    public final C64102fO LLJJJJ;
    public final C64022fG LLJJJJJIL;
    public final C64032fH LLJJJJLIIL;
    public final C64052fJ LLJJL;
    public final C64112fP LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public int LLJLIL;
    public File LLJLILLLLZIIL;
    public int LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;
    public final C46255IDj LLJZ;
    public final C65632hr LLJZIJLIL;
    public volatile boolean LLL;
    public ARunnableS9S0101000_5 LLLF;
    public ARunnableS12S0101000_8 LLLFF;
    public IDRunnableS6S0101000 LLLFFI;
    public ARunnableS12S0101000_8 LLLFZ;
    public ARunnableS27S0200000_8 LLLI;
    public int LLLII;
    public Aweme LLLIIII;
    public final InterfaceC46803IYl LLLIIIIL;
    public C47548IlM LLLIIIL;
    public IPipFeedService LLLIIL;
    public IGM LLLIILIL;
    public final IProactiveTriggersService LLLIL;
    public final IEarlyFeedbackService LLLILZ;
    public final C35733E0r LLLILZJ;
    public C46296IEy LLLILZLLLI;
    public IGI LLLIZZ;
    public C46319IFv LLLJ;
    public final C35734E0s LLLJIL;
    public final XNW LLLJL;
    public boolean LLLL;
    public RunnableC58822So LLLLII;
    public int LLLLIIIILLL;
    public String LLLLIIL;
    public boolean LLLLIILL;
    public double LLLLIILLL;
    public boolean LLLLIL;
    public final int LLLLILI;
    public boolean LLLLJ;
    public volatile boolean LLLLJI;
    public String LLLLL;
    public final ARunnableS10S0101000_6 LLLLLIL;
    public final PlayerSmartPrerenderConfig LLLLLILLIL;
    public int LLLLLJIL;
    public boolean LLLLLJLJLL;
    public int LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public final IDW LLLLLLL;
    public Aweme LLLLLLLLL;
    public InterfaceC46330IGg LLLLLLLLLL;
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public Aweme LLLLLLZZ;
    public VideoUrlModel LLLLLZ;
    public C2067689o LLLLLZIL;
    public Surface LLLLLZL;
    public String LLLLZ;
    public final IDQ LLLLZI;
    public WeakReference<IDZ> LLLLZIL;

    @Override // X.C2LB
    public final void LJIIIZ() {
        Fragment fragment;
        this.LJLIL = null;
        Context LJJIIZ = LJJIIZ();
        if (LJJIIZ == null && (fragment = this.LJLILLLLZI) != null) {
            LJJIIZ = fragment.getContext();
        }
        C10760bY.LIZ(LJJIIZ).LIZLLL(this.LLJILJIL);
        C35732E0q c35732E0q = this.LLJJ;
        if (c35732E0q != null) {
            c35732E0q.dispose();
            this.LLJJ = null;
        }
        C73318Sq2 c73318Sq2 = this.LLJJI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
            this.LLJJI = null;
        }
        if (!C47957Irx.LIZIZ() || LJJIIZ == null) {
            return;
        }
        try {
            LJJIIZ.unbindService(this.LLLJL);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unexpect Exception: ");
            LIZ.append(e.getMessage());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }

    public void LJIL(String str, IDR idr, Aweme aweme) {
    }

    public void LJJ(IPG ipg, C2MA c2ma, boolean z) {
    }

    public void LJJI(String str, IDR idr, Aweme aweme) {
    }

    public final void LJL() {
        this.LJLJLLL = false;
        this.LLIIIZ = SystemClock.elapsedRealtime();
        this.LJZ = System.currentTimeMillis();
    }

    public final void LJLILLLLZI() {
        this.LJLJLLL = true;
        if (this.LLLLZI != null) {
            Activity activity = this.LJLIL;
            Fragment fragment = this.LJLILLLLZI;
            o.LJIIIZ(activity, "activity");
            if (!(activity instanceof ActivityC45651qj) || fragment == null || !com.bytedance.hox.Hox.LJLLI.LIZ((ActivityC45651qj) activity).uv0(fragment)) {
                return;
            }
            LJJJJIZL().LJJIJIL().LJJLIIIJJIZ(this.LLLLZI);
            LJJJJIZL().LJJIJIL().LJJLIIIIJ(this.LLLIIIIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
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
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    public final void onDestroyView() {
        LJIJ(false);
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = this.LLLFF;
        if (aRunnableS12S0101000_8 != null) {
            C57022Lq.LIZ.LJLIL.removeCallbacks(aRunnableS12S0101000_8);
            this.LLLFF = null;
        }
        ARunnableS27S0200000_8 aRunnableS27S0200000_8 = this.LLLI;
        if (aRunnableS27S0200000_8 != null) {
            C57022Lq.LIZ.LJLIL.removeCallbacks(aRunnableS27S0200000_8);
            this.LLLI = null;
        }
        this.LLLLLLZZ = null;
        this.LLLLLZ = null;
        this.LLLLLZL = null;
        this.LLLLLZIL = null;
        if (this.LLLLJ) {
            this.LLLLJ = false;
            C2MA LJJIJIIJI = LJJIJIIJI();
            if (C72083SQt.LJLILLLLZI(LJJIJIIJI)) {
                if (TextUtils.equals(this.LJLJI, "general_search")) {
                    return;
                }
                Aweme currentAweme = LJJIJIIJI.getCurrentAweme();
                IAdSceneService LJII = AdSceneServiceImpl.LJII();
                if (currentAweme != null && LJII != null && !this.LLJJIJIL && currentAweme.getAid() != null) {
                    LJIIJJI();
                    OSZ<Integer, Long> LJJIJIIJIL = LJJIJIIJIL(currentAweme);
                    LJII.LIZJ();
                    NT2.LJJIJLIJ(currentAweme, LJJIIZ(), currentAweme.getAid(), LJJIJIIJIL, this.LLILLJJLI + 1);
                }
            }
        }
        this.LLJJJ.LIZLLL();
        C47548IlM c47548IlM = this.LLLIIIL;
        if (c47548IlM != null) {
            C47554IlS c47554IlS = c47548IlM.LIZJ.get();
            if (c47554IlS != null) {
                C46303IFf.LIZ("checkAudioClose start >>> ");
                if (c47554IlS.LJIIIIZZ) {
                    c47554IlS.LJII.clear();
                    C47549IlN c47549IlN = new C47549IlN();
                    c47549IlN.LIZIZ = 2;
                    c47554IlS.LJ(c47549IlN);
                    C46303IFf.LIZ("checkAudioClose  end");
                }
            }
            this.LLLIIIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
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
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
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
    public /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final void LJIIJJI() {
        if (this.LJZ != -1) {
            long j = this.LJLZ;
            if (j == -1) {
                this.LJLZ = System.currentTimeMillis() - this.LJZ;
            } else {
                this.LJLZ = (System.currentTimeMillis() - this.LJZ) + j;
            }
            this.LJZ = -1L;
        }
    }

    public final C46296IEy LJJIII() {
        if (this.LLLILZLLLI == null) {
            this.LLLILZLLLI = new C46296IEy(this, new C46263IDr(this));
        }
        return this.LLLILZLLLI;
    }

    public final IGI LJJIIJ() {
        if (this.LLLIZZ == null) {
            this.LLLIZZ = new IGI(new IDU(this), this);
        }
        return this.LLLIZZ;
    }

    public final IDR LJJJ() {
        return this.LJLL.get();
    }

    public final InterfaceC46330IGg LJJJJIZL() {
        if (this.LLLLLLLLLL == null) {
            this.LLLLLLLLLL = IWF.LJJLIIIIJ();
        }
        return this.LLLLLLLLLL;
    }

    public final IDZ LJJJJJ() {
        WeakReference<IDZ> weakReference = this.LLLLZIL;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final boolean LJJLIIIJJI() {
        return TextUtils.equals(this.LJLJI, "homepage_hot");
    }

    public final IDX LJJII() {
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI != null && LJJIJIIJI.j3() != null) {
            return LJJIJIIJI.j3().i2();
        }
        return null;
    }

    public final Context LJJIIZ() {
        IDR LJJJ = LJJJ();
        if (LJJJ != null && LJJJ.getContext() != null) {
            return LJJJ.getContext();
        }
        return this.LJLIL;
    }

    public final Aweme LJJIIZI() {
        return LJJIIJZLJL(LJJIJIIJI());
    }

    public final C2MA LJJIJIIJI() {
        C2MA curFeedViewHolder;
        IDR LJJJ = LJJJ();
        if (LJJJ == null || (curFeedViewHolder = LJJJ.getCurFeedViewHolder()) == null) {
            return null;
        }
        if (C54838Lfe.LJJ(curFeedViewHolder.getAweme()) && !C59542Vi.LIZ()) {
            C2MA Y6 = curFeedViewHolder.Y6();
            if (Y6 != null) {
                return Y6;
            }
        } else if (curFeedViewHolder.getAwemeType() == 325) {
            return null;
        }
        return curFeedViewHolder;
    }

    public final long LJJIJIL() {
        return LJJJJIZL().getCurrentPosition();
    }

    public final Aweme LJJJI() {
        Aweme LJJIIZI = LJJIIZI();
        IDR LJJJ = LJJJ();
        if (LJJIIZI == null || LJJJ == null) {
            return null;
        }
        return LJJJ.getNextAweme(LJJIIZI);
    }

    public final OnUIPlayListener LJJJJ() {
        StoryVideo storyModel;
        Aweme LJJIIZI = LJJIIZI();
        if (LJJIIZI != null && (storyModel = LJJIIZI.getStoryModel()) != null && storyModel.getAwemeType() == 77) {
            return LJJIIJ();
        }
        if (C63081OpJ.LJLLLL(LJJIIZI())) {
            return LJJIII();
        }
        return this;
    }

    public final long LJJJJJL() {
        NQH LIZ = C201697vp.LIZ();
        if (C63081OpJ.LJLJI(LJJIIZI()) && LIZ != null) {
            return LIZ.getCurrentPosition();
        }
        if (C63081OpJ.LJLLLL(LJJIIZI())) {
            return LJJIII().getCurrentPosition();
        }
        return LJJJJIZL().getCurrentPosition();
    }

    public final boolean LJJLIIIIJ() {
        IDR LJJJ = LJJJ();
        if (LJJJ == null || !LJJJ.getUserVisibleHint()) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 22) {
            return true;
        }
        if (LJJJ.getFragment() == null || !LJJJ.getFragment().isResumed()) {
            return false;
        }
        return true;
    }

    public final boolean LJJLIIIJ() {
        Aweme LJJJI = LJJJI();
        if (LJJJI != null && LJJJI.isAd()) {
            return true;
        }
        return false;
    }

    public final Aweme LJJLIIJ() {
        IDR LJJJ = LJJJ();
        if (LJJJ == null) {
            return null;
        }
        return LJJJ.getNextAweme(LJJIIZI());
    }

    public final void LJJZZIII() {
        if (C35386Dug.LIZ()) {
            Aweme LJJIIZI = LJJIIZI();
            Aweme aweme = this.LLLLLLLLL;
            if (aweme != null && LJJIIZI != null && !TextUtils.equals(aweme.getAid(), LJJIIZI.getAid())) {
                C2MA viewHolderByAwemeId = getViewHolderByAwemeId(this.LLLLLLLLL.getAid());
                if (C72083SQt.LJJZZIII(viewHolderByAwemeId) && LJJJIL(viewHolderByAwemeId) != null) {
                    InterfaceC46264IDs LJIJ = C73340SqO.LJIJ();
                    NQL nql = (NQL) LJIJ;
                    nql.LIZ(LJJIIZ(), LJJJIL(viewHolderByAwemeId), viewHolderByAwemeId.getCurrentAweme(), false);
                }
            }
        }
        this.LLLLLL = -1;
    }

    public final void LJLJJI() {
        LJJJJIZL().LJIILJJIL();
    }

    public final void LJLJJL() {
        StoryVideo storyModel;
        StoryVideo storyModel2;
        List<Video> subVideoList;
        Video video;
        StoryVideo storyModel3;
        StoryVideo storyModel4;
        List<Video> subVideoList2;
        Video video2;
        IGI LJJIIJ = LJJIIJ();
        LJJIIJ.getClass();
        int i = IEW.LIZIZ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Aweme aweme = LJJIIJ.LJLJI;
                    if (aweme != null && (storyModel4 = aweme.getStoryModel()) != null && (subVideoList2 = storyModel4.getSubVideoList()) != null && !subVideoList2.isEmpty() && subVideoList2.size() > 1 && (video2 = (Video) ListProtector.get(subVideoList2, 1)) != null) {
                        Aweme aweme2 = LJJIIJ.LJLJI;
                        if (aweme2 != null) {
                            aweme2.setVideo(video2);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("update storyVideo2 Data = ");
                        LIZ.append(video2);
                        IE0.LIZ(X1D.LIZIZ(LIZ));
                    }
                    Aweme aweme3 = LJJIIJ.LJLJI;
                    if (aweme3 != null && (storyModel3 = aweme3.getStoryModel()) != null) {
                        int awemeType = storyModel3.getAwemeType();
                        Aweme aweme4 = LJJIIJ.LJLJI;
                        if (aweme4 != null) {
                            aweme4.setAwemeType(awemeType);
                        }
                    }
                }
            } else {
                Aweme aweme5 = LJJIIJ.LJLJI;
                if (aweme5 != null && (storyModel2 = aweme5.getStoryModel()) != null && (subVideoList = storyModel2.getSubVideoList()) != null && (!subVideoList.isEmpty()) && (video = (Video) ListProtector.get(subVideoList, 0)) != null) {
                    Aweme aweme6 = LJJIIJ.LJLJI;
                    if (aweme6 != null) {
                        aweme6.setVideo(video);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("update storyVideo1Data = ");
                    LIZ2.append(video);
                    IE0.LIZ(X1D.LIZIZ(LIZ2));
                }
                Aweme aweme7 = LJJIIJ.LJLJI;
                if (aweme7 != null && (storyModel = aweme7.getStoryModel()) != null) {
                    int awemeType2 = storyModel.getAwemeType();
                    Aweme aweme8 = LJJIIJ.LJLJI;
                    if (aweme8 != null) {
                        aweme8.setAwemeType(awemeType2);
                    }
                }
            }
        } else {
            Aweme aweme9 = LJJIIJ.LJLJI;
            if (aweme9 != null) {
                aweme9.setVideo(LJJIIJ.LJLJJI);
            }
            Aweme aweme10 = LJJIIJ.LJLJI;
            if (aweme10 != null) {
                aweme10.setAwemeType(LJJIIJ.LJLJJL);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("update mainVideoData:  = ");
            LIZ3.append(LJJIIJ.LJLJJI);
            IE0.LIZ(X1D.LIZIZ(LIZ3));
        }
        Aweme LJJIIZI = LJJIIZI();
        if (LJJIIZI != null && IEW.LIZIZ(LJJIIZI)) {
            if (IEW.LIZJ == IEW.LIZIZ) {
                IGI LJJIIJ2 = LJJIIJ();
                LJJIIJ2.getClass();
                ((IDU) LJJIIJ2.LJLIL).LIZ();
                LJLLLL(0, LJJIIZI);
                return;
            }
            if (LJJIJIIJI() != null && LJJIJIIJI().j3() != null) {
                AnonymousClass901 j3 = LJJIJIIJI().j3();
                if (j3.u2()) {
                    j3.e3(false);
                }
            }
            LLIIJLIL(LJJIJIIJI(), LJJIIZI, false);
        }
    }

    public final void LJLJL() {
        IDR LJJJ = LJJJ();
        if (LJJJ == null) {
            return;
        }
        if (C2M9.LIZ()) {
            C47541IlF.LIZLLL(LJJIIZI(), LJJJ.getEnterFrom(true));
        }
        LJJJ.tryMoveToNext(C84763XOl.LJIIJJI);
    }

    public final Aweme LJLLI() {
        IDR LJJJ = LJJJ();
        if (LJJJ == null) {
            return null;
        }
        return LJJJ.getPrevAweme(LJJIIZI());
    }

    public final void LLFFF() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.LJLJI;
        if (JIW.LIZJ(str, C2S6.LIZ(LJJIIZ()).getPlaylistPreviousPage()) || TextUtils.equals(str, "search_result")) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZLLL = JIW.LIZLLL(this.LJZI, this.LJLJI, C2S6.LIZ(LJJIIZ()).getPlaylistPreviousPage());
        InterfaceC221168m8 LJLLLLLL = Z9N.LIZIZ.LJLLLLLL();
        if (z || LIZLLL) {
            LJLLLLLL.LIZJ(currentTimeMillis);
        }
    }

    @Override // X.C2LB
    public final String LJFF() {
        return this.LJLJI;
    }

    public static void LJIJI(String str) {
        LJIJJ(str, "video_block");
        LJIJJ(str, "video_request");
        LJIJJ(str, "video_play_end");
        LJIJJ(str, "video_play_failed");
        LJIJJ(str, "video_play_quality");
        LJIJJ(str, "video_request_response");
    }

    public static Aweme LJJIIJZLJL(C2MA c2ma) {
        if (c2ma != null) {
            return c2ma.getCurrentAweme();
        }
        return null;
    }

    public static final View LJJJIL(C2MA c2ma) {
        if (c2ma != null && c2ma.LJIIIIZZ() != null && c2ma.LJIIIIZZ().getRootView() != null) {
            return c2ma.LJIIIIZZ().getRootView();
        }
        return null;
    }

    public static String LJJJJLI(C2MA c2ma) {
        if (C59542Vi.LIZ() && (c2ma instanceof C2K9) && c2ma.getCurrentAweme() != null) {
            return c2ma.getCurrentAweme().getAid();
        }
        return c2ma.O1().getAid();
    }

    public static void LJJJLZIJ(String str) {
        if (str == null || LLLLZLL != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        hashMap.put("video_block", bool);
        hashMap.put("video_request", bool);
        hashMap.put("video_play_end", bool);
        hashMap.put("video_play_failed", bool);
        hashMap.put("video_play_quality", bool);
        hashMap.put("video_request_response", bool);
        LLLLZLL = new Pair<>(str, hashMap);
    }

    public static boolean LJJLI(Aweme aweme) {
        if (aweme != null && aweme.getStatus() != null) {
            return aweme.getStatus().isDelete();
        }
        return false;
    }

    public static boolean LJJLIIIJILLIZJL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!OUP.LJJIII(aweme) && !C1DF.LJJIII(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJJLIIIJL(C2MA c2ma) {
        if (c2ma != null && c2ma.getCurrentAweme() != null && c2ma.LLLJ() != null) {
            return true;
        }
        return false;
    }

    public static void LJLLJ(boolean z) {
        if (z) {
            C58604MzI.LIZIZ.onVideoPlayBlock();
            NetworkLevelService.createINetworkLevelServicebyMonsterPlugin(false).reportNetworkLevel("video_block");
        }
        IRuntimeBehaviorService LJ = RuntimeBehaviorServiceImpl.LJ();
        if (LJ != null) {
            LJ.LIZ("block");
        }
    }

    public final boolean LJIILL(boolean z) {
        boolean z2;
        if (z && !C79004UzY.LJJIJIIJI(LJJIIZ())) {
            ComponentCallbacks2 componentCallbacks2 = this.LJLIL;
            if ((!(componentCallbacks2 instanceof InterfaceC55058LjC) || !((InterfaceC55058LjC) componentCallbacks2).isDuoDualMode()) && componentCallbacks2 != null && (!KNV.LJFF((ActivityC45651qj) componentCallbacks2, "page_feed"))) {
                z2 = false;
                if (this.LJLILLLLZI.getUserVisibleHint() && !C2M9.LIZ()) {
                    return false;
                }
                if ((this.LJLJLLL && !C2M9.LIZ()) || !z2 || AVExternalServiceImpl.LIZ().publishService().needPauseFeed()) {
                    return false;
                }
                return true;
            }
        }
        z2 = true;
        if (this.LJLILLLLZI.getUserVisibleHint()) {
        }
        if (this.LJLJLLL) {
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.ss.android.ugc.aweme.feed.model.VideoUrlModel r9) {
        /*
            r8 = this;
            X.IGg r0 = r8.LJJJJIZL()
            float r6 = r0.getBitrate()
            r3 = 1
            if (r9 == 0) goto L4c
            X.IYN r0 = r9.getHitBitrate()
            if (r0 == 0) goto L28
            X.IYN r0 = r9.getHitBitrate()
            int r0 = r0.getBitRate()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L1d:
            java.lang.String r5 = "play_bitrate"
            if (r4 == 0) goto L6c
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            double r0 = (double) r6
            goto L4e
        L28:
            java.util.List r0 = r9.getBitRate()
            if (r0 == 0) goto L4c
            java.util.List r0 = r9.getBitRate()
            int r0 = r0.size()
            if (r0 < r3) goto L4c
            java.util.List r1 = r9.getBitRate()
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.feed.model.BitRate r0 = (com.ss.android.ugc.aweme.feed.model.BitRate) r0
            int r0 = r0.getBitRate()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L1d
        L4c:
            r4 = 0
            goto L1d
        L4e:
            r7.put(r5, r0)     // Catch: org.json.JSONException -> L63
            java.lang.String r0 = "bitrate"
            r7.put(r0, r4)     // Catch: org.json.JSONException -> L63
            java.lang.String r2 = "bitrate_delta"
            int r0 = r4.intValue()     // Catch: org.json.JSONException -> L63
            float r0 = (float) r0     // Catch: org.json.JSONException -> L63
            float r0 = r0 - r6
            double r0 = (double) r0     // Catch: org.json.JSONException -> L63
            r7.put(r2, r0)     // Catch: org.json.JSONException -> L63
            goto L67
        L63:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L67:
            java.lang.String r0 = "http_hijack_info_v2"
            X.C8HX.LIZIZ(r0, r0, r7)
        L6c:
            boolean r0 = X.InterfaceC46268IDw.LIZ
            if (r0 != 0) goto L71
            return
        L71:
            if (r4 == 0) goto L79
            int r0 = r4.intValue()
            if (r0 > 0) goto L7a
        L79:
            return
        L7a:
            int r0 = r4.intValue()
            float r1 = (float) r0
            float r1 = r1 - r6
            int r0 = X.InterfaceC46270IDy.LIZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L79
            X.IaY r0 = X.C1DG.LIZ()
            com.ss.android.ugc.aweme.simkit.ISimKitConfig r0 = r0.getConfig()
            com.ss.android.ugc.playerkit.model.PlayerGlobalConfig r0 = r0.getPlayerGlobalConfig()
            r0.setForceHttps(r3)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            double r0 = (double) r6
            r2.put(r5, r0)     // Catch: org.json.JSONException -> Laa
            java.lang.String r0 = "hit_bitrate"
            r2.put(r0, r4)     // Catch: org.json.JSONException -> Laa
            java.lang.String r0 = "is_hijack"
            r2.put(r0, r3)     // Catch: org.json.JSONException -> Laa
            goto Lae
        Laa:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lae:
            java.lang.String r0 = "http_hijack_info"
            X.FUA.LIZJ(r0, r2)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJIIZILJ(com.ss.android.ugc.aweme.feed.model.VideoUrlModel):void");
    }

    public final void LJIJ(boolean z) {
        boolean z2;
        InterfaceC88471Ynr<? super Float, ? super Aweme, C76800UCe> interfaceC88471Ynr;
        if (C79004UzY.LJJIJIIJI(LJJIIZ())) {
            IFH.LIZ = null;
            IFH.LIZJ = 1.0f;
            IFH.LIZIZ = 1.0f;
            LJJJJIZL().LJFF(1.0f);
        }
        if (IFH.LIZ == null) {
            return;
        }
        Aweme LJJIIZI = LJJIIZI();
        Activity activity = this.LJLIL;
        LFH lfh = LFH.LIZIZ;
        boolean z3 = false;
        if (!lfh.LIZLLL().LJIILLIIL().LIZLLL().LJJIIZI()) {
            if (IFH.LIZIZ(LJJIIZI) == 1.0f) {
                z3 = true;
            }
            z2 = !z3;
            IFH.LIZ = null;
            IFH.LIZJ = 1.0f;
            IFH.LIZIZ = 1.0f;
        } else {
            if (z && (activity instanceof ActivityC45651qj) && com.bytedance.hox.Hox.LJLLI.LIZ((ActivityC45651qj) activity).vv0("For You") && lfh.LIZLLL().LJIILLIIL().LIZLLL().LJJIJIIJIL()) {
                return;
            }
            if (IFH.LIZIZ(LJJIIZI) == 1.0f) {
                z3 = true;
            }
            z2 = !z3;
            IFH.LIZ = null;
            IFH.LIZJ = 1.0f;
            IFH.LIZIZ = 1.0f;
            if (!z && (interfaceC88471Ynr = IFH.LIZLLL) != null) {
                interfaceC88471Ynr.invoke(Float.valueOf(IFH.LIZJ), IFH.LIZ);
            }
        }
        if (z2) {
            LJJJJIZL().LJFF(1.0f);
        }
    }

    public final void LJIJJLI(String str) {
        WeakReference<IDR> weakReference = this.LJLL;
        if (weakReference != null && weakReference.get() != null) {
            this.LJLL.get().disableHotComment(str);
        }
    }

    public final long LJJIJ(Aweme aweme) {
        Video video;
        int duration;
        NQH LIZ = C201697vp.LIZ();
        if (C63081OpJ.LJLJI(LJJIIZI()) && LIZ != null) {
            return LIZ.getDuration();
        }
        if (C63081OpJ.LJLLLL(aweme)) {
            return LJJIII().getDuration();
        }
        if ((aweme != null || (aweme = LJJIIZI()) != null) && (video = aweme.getVideo()) != null && (duration = video.getDuration()) > 0) {
            return duration;
        }
        long duration2 = LJJJJIZL().getDuration();
        if (duration2 > 0) {
            return duration2;
        }
        if (this.LJLLLLLL <= 0) {
            return -1L;
        }
        if (this.LJLZ != -1) {
            return (System.currentTimeMillis() - this.LJLLLLLL) - this.LJLZ;
        }
        return System.currentTimeMillis() - this.LJLLLLLL;
    }

    public final OSZ<Integer, Long> LJJIJIIJIL(Aweme aweme) {
        long currentTimeMillis;
        long j;
        if (C46275IEd.LIZ == 1) {
            if (C46273IEb.LIZ().enableRecordPosBeforeStop && aweme != null) {
                MeasurementServiceImpl.LJ().LIZIZ();
                long LIZ = C47712Io0.LIZ(aweme.getRequestId(), aweme.getAwemeRawAdIdStr());
                if (LIZ > 0) {
                    return new OSZ<>(2, Long.valueOf(LIZ));
                }
            }
            long LJJJJJL = LJJJJJL();
            if (LJJJJJL > 0) {
                return new OSZ<>(0, Long.valueOf(LJJJJJL));
            }
        }
        if (this.LJLZ == -1) {
            currentTimeMillis = System.currentTimeMillis();
            j = this.LJLLLLLL;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.LJLLLLLL;
            j = this.LJLZ;
        }
        return new OSZ<>(1, Long.valueOf(currentTimeMillis - j));
    }

    public final long LJJIJL(String str) {
        if (C35704Dzo.LIZ() == 0) {
            return this.LLILL;
        }
        if (1 != C35704Dzo.LIZ() || TextUtils.isEmpty(str)) {
            return -1L;
        }
        if (!containsKey(str)) {
            return this.LLILL;
        }
        return get(str).longValue();
    }

    public final boolean LJJIJLIJ(String str) {
        if (C35704Dzo.LIZ() == 0) {
            return this.LLIIZ;
        }
        if (1 != C35704Dzo.LIZ() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!containsKey(str)) {
            return this.LLIIZ;
        }
        return get(str).booleanValue();
    }

    public final boolean LJJIL(String str) {
        if (C35704Dzo.LIZ() == 0) {
            return this.LLD;
        }
        if (1 != C35704Dzo.LIZ() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!containsKey(str)) {
            return this.LLD;
        }
        return get(str).booleanValue();
    }

    public final boolean LJJIZ(String str) {
        if (C35704Dzo.LIZ() == 0) {
            return this.LL;
        }
        if (1 != C35704Dzo.LIZ() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!containsKey(str)) {
            return this.LL;
        }
        return get(str).booleanValue();
    }

    public final long LJJJJI(String str) {
        int intValue;
        if (C44432HcC.LJLJI) {
            intValue = ((Number) C35704Dzo.LJIJ.getValue()).intValue();
        } else {
            intValue = ((Number) C35080Dpk.LIZ.getValue()).intValue();
        }
        if (intValue == 0) {
            return this.LJLLJ;
        }
        if (1 != intValue) {
            if (2 != intValue) {
                return -1L;
            }
            if (!TextUtils.isEmpty(str) && !((HashMap) this.LJLLL).containsKey(str) && this.LJLLJ > 0) {
                PEH.LIZLLL(new Exception(), "getPlayStartTime exception which may lead to playtime metric over actually value!");
            }
        }
        if (TextUtils.isEmpty(str) || !((HashMap) this.LJLLL).containsKey(str)) {
            return -1L;
        }
        return ((Long) ((HashMap) this.LJLLL).get(str)).longValue();
    }

    public final String LJJJJL(String str) {
        String str2;
        if (str != null) {
            str2 = get(str);
        } else {
            str2 = "";
        }
        return String.valueOf(str2);
    }

    public final long LJJJJLL(String str) {
        if (C35704Dzo.LIZ() == 0) {
            return this.LLIIJI;
        }
        if (1 != C35704Dzo.LIZ() || TextUtils.isEmpty(str)) {
            return -1L;
        }
        if (!containsKey(str)) {
            return this.LLIIJI;
        }
        return get(str).longValue();
    }

    public final C46259IDn LJJJJZ(C2MA c2ma) {
        if (c2ma == null) {
            return null;
        }
        return IQ6.LIZ(c2ma.getCurrentAweme(), Integer.valueOf(this.LJLJJI), c2ma.I7().getId());
    }

    public final void LJJL(Runnable runnable) {
        if (SharePrefCache.inst().getShowPlayerInfoUI().LIZ().booleanValue()) {
            this.LLJJI.LIZ(AbstractC73745Swv.LIZLLL(new ACallableS111S0100000_8(runnable, 0)).LJIILJJIL(T16.LIZ()).LJII(T16.LIZ).LJIIJJI(C73674Svm.LIZLLL, C73674Svm.LJFF, C73674Svm.LIZJ, EnumC73750Sx0.INSTANCE));
        }
    }

    public final void LJJZ(int i) {
        int i2;
        AdPreloadExperimentData lynxMaskData;
        int i3;
        AdPreloadExperimentData lynxSuperLikeData;
        this.LLLII = i;
        if (i == 0) {
            int i4 = 30;
            if (!this.LLL && IEI.LIZ) {
                if (LJJLIIIJ()) {
                    if (this.LLLF == null) {
                        this.LLLF = new ARunnableS9S0101000_5(5, this, 13);
                    }
                    Handler handler = C57022Lq.LIZ.LJLIL;
                    ARunnableS9S0101000_5 aRunnableS9S0101000_5 = this.LLLF;
                    int i5 = IEI.LIZIZ;
                    if (i5 > 120000) {
                        i5 = 120000;
                    } else if (i5 < 30) {
                        i5 = 30;
                    }
                    handler.postDelayed(aRunnableS9S0101000_5, i5);
                } else {
                    ARunnableS9S0101000_5 aRunnableS9S0101000_52 = this.LLLF;
                    if (aRunnableS9S0101000_52 != null) {
                        C57022Lq.LIZ.LJLIL.removeCallbacks(aRunnableS9S0101000_52);
                    }
                }
            }
            if (C46253IDh.LIZ) {
                ARunnableS12S0101000_8 aRunnableS12S0101000_8 = this.LLLFF;
                if (aRunnableS12S0101000_8 != null) {
                    C57022Lq.LIZ.LJLIL.removeCallbacks(aRunnableS12S0101000_8);
                }
                if (C46253IDh.LIZIZ) {
                    JHI.LIZ().getClass();
                    if (LJJLIIIJ()) {
                        if (this.LLLFF == null) {
                            this.LLLFF = new ARunnableS12S0101000_8(5, this, 5);
                        }
                        Handler handler2 = C57022Lq.LIZ.LJLIL;
                        ARunnableS12S0101000_8 aRunnableS12S0101000_82 = this.LLLFF;
                        int i6 = C46253IDh.LIZJ;
                        if (i6 > 120000) {
                            i4 = 120000;
                        } else if (i6 >= 30) {
                            i4 = i6;
                        }
                        handler2.postDelayed(aRunnableS12S0101000_82, i4);
                    }
                }
            }
            if (C59982Xa.LIZ()) {
                IDRunnableS6S0101000 iDRunnableS6S0101000 = this.LLLFFI;
                if (iDRunnableS6S0101000 != null) {
                    C57022Lq.LIZ.LJLIL.removeCallbacks(iDRunnableS6S0101000);
                }
                if (C59982Xa.LIZ() && LJJLIIIJ()) {
                    if (this.LLLFFI == null) {
                        this.LLLFFI = new IDRunnableS6S0101000(2, this, 37);
                    }
                    Handler handler3 = C57022Lq.LIZ.LJLIL;
                    IDRunnableS6S0101000 iDRunnableS6S01010002 = this.LLLFFI;
                    if (!C59982Xa.LIZIZ) {
                        FFL LJIIIZ = FFL.LJIIIZ();
                        AdPreloadMainSwitch adPreloadMainSwitch = C59982Xa.LIZ;
                        LJIIIZ.getClass();
                        C59982Xa.LIZ = (AdPreloadMainSwitch) FFL.LJIJ(true, "ad_lynx_is_use_preload_experiment", 31744, AdPreloadMainSwitch.class, adPreloadMainSwitch);
                        C59982Xa.LIZIZ = true;
                    }
                    AdPreloadMainSwitch adPreloadMainSwitch2 = C59982Xa.LIZ;
                    if (adPreloadMainSwitch2 != null && (lynxMaskData = adPreloadMainSwitch2.getLynxMaskData()) != null) {
                        i2 = lynxMaskData.getDelayMillsec();
                    } else {
                        i2 = 0;
                    }
                    handler3.postDelayed(iDRunnableS6S01010002, i2);
                }
            }
            if (C59982Xa.LIZJ()) {
                ARunnableS12S0101000_8 aRunnableS12S0101000_83 = this.LLLFZ;
                if (aRunnableS12S0101000_83 != null) {
                    C57022Lq.LIZ.LJLIL.removeCallbacks(aRunnableS12S0101000_83);
                }
                if (C59982Xa.LIZJ() && LJJLIIIJ()) {
                    if (this.LLLFZ == null) {
                        this.LLLFZ = new ARunnableS12S0101000_8(0, this, 0);
                    }
                    Handler handler4 = C57022Lq.LIZ.LJLIL;
                    ARunnableS12S0101000_8 aRunnableS12S0101000_84 = this.LLLFZ;
                    if (!C59982Xa.LIZIZ) {
                        FFL LJIIIZ2 = FFL.LJIIIZ();
                        AdPreloadMainSwitch adPreloadMainSwitch3 = C59982Xa.LIZ;
                        LJIIIZ2.getClass();
                        C59982Xa.LIZ = (AdPreloadMainSwitch) FFL.LJIJ(true, "ad_lynx_is_use_preload_experiment", 31744, AdPreloadMainSwitch.class, adPreloadMainSwitch3);
                        C59982Xa.LIZIZ = true;
                    }
                    AdPreloadMainSwitch adPreloadMainSwitch4 = C59982Xa.LIZ;
                    if (adPreloadMainSwitch4 != null && (lynxSuperLikeData = adPreloadMainSwitch4.getLynxSuperLikeData()) != null) {
                        i3 = lynxSuperLikeData.getDelayMillsec();
                    } else {
                        i3 = 0;
                    }
                    handler4.postDelayed(aRunnableS12S0101000_84, i3);
                }
            }
            ARunnableS27S0200000_8 aRunnableS27S0200000_8 = this.LLLI;
            if (aRunnableS27S0200000_8 == null || !C46250IDe.LIZ || C46250IDe.LIZLLL != 0) {
                return;
            }
            C2NG c2ng = C57022Lq.LIZ;
            c2ng.LJLIL.removeCallbacks(aRunnableS27S0200000_8);
            c2ng.LJLIL.postAtFrontOfQueue(this.LLLI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x07d6, code lost:
    
        if (r1 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0913, code lost:
    
        if (r6 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0810, code lost:
    
        if (r10 != null) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d7, code lost:
    
        if ((!r3) == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ce  */
    /* JADX WARN: Type inference failed for: r3v244, types: [T, java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIL(X.IPH r37) {
        /*
            Method dump skipped, instructions count: 2760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJLIL(X.IPH):void");
    }

    public final void LJLJLJ(String str) {
        C2MA viewHolderByAwemeId;
        if (str != null && (viewHolderByAwemeId = getViewHolderByAwemeId(str)) != null) {
            viewHolderByAwemeId.w1();
        }
    }

    public final void LJLJLLL(C2MA c2ma) {
        if (this.LLLII != 0 && C46250IDe.LIZ && C46250IDe.LIZIZ) {
            ARunnableS27S0200000_8 aRunnableS27S0200000_8 = new ARunnableS27S0200000_8(this, c2ma, 1);
            this.LLLI = aRunnableS27S0200000_8;
            Handler handler = C57022Lq.LIZ.LJLIL;
            int i = C46250IDe.LIZJ;
            if (i > 60000) {
                i = 60000;
            } else if (i < 30) {
                i = 30;
            }
            handler.postDelayed(aRunnableS27S0200000_8, i);
            return;
        }
        if (c2ma.j3() == null) {
            return;
        }
        c2ma.j3().e2();
    }

    public final boolean LJLL(Aweme aweme) {
        Aweme prevAweme;
        if (!((Boolean) C35704Dzo.LJJIIJZLJL.getValue()).booleanValue()) {
            return true;
        }
        IDR LJJJ = LJJJ();
        Aweme LJJIIZI = LJJIIZI();
        if (LJJJ != null && LJJIIZI != null) {
            if (this.LLLLLLJ) {
                prevAweme = LJJJ.getNextAweme(LJJIIZI);
            } else {
                prevAweme = LJJJ.getPrevAweme(LJJIIZI);
            }
            if (prevAweme == null || !TextUtils.equals(aweme.getAid(), prevAweme.getAid()) || TextUtils.equals(this.LLLLL, aweme.getAid())) {
                return false;
            }
            this.LLLLL = aweme.getAid();
            return true;
        }
        return false;
    }

    public final void LJLLILLLL(Aweme aweme) {
        if (IEW.LIZIZ(aweme)) {
            IGI LJJIIJ = LJJIIJ();
            LJJIIJ.getClass();
            if (IEW.LJ) {
                IEW.LJ = false;
                ((IDU) LJJIIJ.LJLIL).LIZ();
            }
        }
    }

    public void LJLLL(Aweme aweme) {
        J85 j85 = new J85();
        j85.LJIILJJIL = aweme;
        j85.LIZLLL = this.LJLJI;
        j85.LJIILIIL();
    }

    public final void LJZ(C46276IEe c46276IEe) {
        IDR LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.isDetail();
        }
        C2U8.LIZ(c46276IEe);
    }

    public final void LL(boolean z) {
        LJJJJIZL().LJJJJL(z);
    }

    public final void LLIIII(C2MA c2ma) {
        if ((C63081OpJ.LJJJZ(LJJIIZI()) || C63081OpJ.LLIIIL(LJJIIZI()) || C63081OpJ.LLD(LJJIIZI()) || C63081OpJ.LJJLJ(LJJIIZI()) || C63081OpJ.LJJLJLI(LJJIIZI())) && c2ma != null && c2ma.j3() != null) {
            c2ma.j3().x2();
        }
    }

    public final void LLIIIILZ(Aweme aweme) {
        C47333Iht LJIIIIZZ;
        java.util.Map<String, Float> map;
        C37179EiV.LIZ().removeCallbacks(this.LLLLLIL);
        IDR LJJJ = LJJJ();
        Aweme LJJIIZI = LJJIIZI();
        if (LJJJ == null || LJJIIZI == null) {
            return;
        }
        IFF iff = new IFF();
        iff.LJIIIIZZ = LJJIIZI;
        C46687ITz c46687ITz = IE2.LIZ;
        if (c46687ITz == null) {
            c46687ITz = IFR.LIZ;
        }
        AbstractC48510J2c LIZIZ = c46687ITz.LIZIZ(SmartPrerenderExperiment.SCENE);
        if (LIZIZ != null && LIZIZ.LIZLLL()) {
            if (containsValue(LJJIIZI.getAid())) {
                LJIIIIZZ = get(LJJIIZI.getAid());
            } else {
                LJIIIIZZ = LIZIZ.LJIIIIZZ(iff);
                put(LJJIIZI.getAid(), LJIIIIZZ);
            }
            if (LJIIIIZZ != null && (map = LJIIIIZZ.LIZIZ) != null && map.get("gt") != null && map.get("gt").floatValue() > this.LLLLLILLIL.effectValue) {
                C37179EiV.LIZ().postDelayed(this.LLLLLIL, this.LLLLLILLIL.delayMs);
                return;
            }
        }
        LLIIIJ(4, aweme, !this.LLLLLLJ, true);
    }

    public final void LLIIIL(Aweme aweme) {
        if (C63081OpJ.LJLJI(aweme)) {
            return;
        }
        LFH lfh = LFH.LIZIZ;
        if (lfh.LIZLLL().LJIIJ().LIZJ()) {
            LJJJJIZL().LJJJLZIJ(lfh.LIZLLL().LJIIJ().LJIIIZ());
            return;
        }
        int i = this.LLLLILI;
        if (i >= 100 && i <= 1000 && LJJIJ(aweme) > 29000) {
            long LJJIJ = LJJIJ(aweme) / this.LLLLILI;
            if (LJJIJ > 50) {
                LJJJJIZL().LJJJLZIJ((int) LJJIJ);
                return;
            }
        }
        LJJJJIZL().LJJJLIIL();
    }

    public final C2MA getViewHolderByAwemeId(String str) {
        IDR LJJJ = LJJJ();
        if (LJJJ == null) {
            return null;
        }
        return LJJJ.getViewHolderByAwemeId(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (C35704Dzo.LIZ() == 0) {
            LJJLJ("", z, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        LJJLJLI(z, false, true);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x03ad: INVOKE (r0v12 ?? I:X.IDZ), (r4 I:java.lang.String) INTERFACE call: X.IDZ.onPlayCompleted(java.lang.String):void A[MD:(java.lang.String):void (m)] (LINE:16778157), block:B:167:0x03a9 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x03bc: INVOKE (r0v11 ?? I:com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener), (r4 I:java.lang.String) INTERFACE call: com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener.onPlayCompleted(java.lang.String):void A[MD:(java.lang.String):void (m)] (LINE:16778172), block:B:171:0x03b8 */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        String onPlayCompleted;
        String onPlayCompleted2;
        IFG W2;
        IFG W22;
        IVK LIZJ;
        IPipFeedService iPipFeedService;
        if (!LJII()) {
            return;
        }
        IDR LJJJ = LJJJ();
        UgAllServiceImpl.LIZ().LJII();
        Session LJFF = C46664ITc.LJIJ.LJFF();
        if (LJFF != null) {
            INO.LIZJ.LIZ(LJFF.key);
        }
        C2MA LJJIJIIJI = LJJIJIIJI();
        C2U8.LIZ(new C46288IEq(LJJIIJZLJL(LJJIJIIJI), this.LJLJI, this.LJLJJI, 3, LJJJ));
        long LJJIJ = LJJIJ(LJJIIJZLJL(LJJIJIIJI));
        this.LJLZ = -1L;
        int i = this.LLILLJJLI + 1;
        this.LLILLJJLI = i;
        C56446MDi.LJJJIL = i;
        if (LJJLIIIJL(LJJIJIIJI) && (TextUtils.equals(this.LJLJI, "general_search") || LJJIJIIJI.getCurrentAweme().isSearchPreciseAd())) {
            this.LLILLL++;
            JHI.LIZ().LJ = this.LLILLL;
        }
        try {
            if (!C72083SQt.LJLILLLLZI(LJJIJIIJI)) {
                if (LJJJJJ() != null) {
                    LJJJJJ().onPlayCompleted(str);
                }
                if (LJJIJIIJI != null && LJJIJIIJI.LLLJ() != null) {
                    LJJIJIIJI.LLLJ().onPlayCompleted(str);
                    return;
                }
                return;
            }
            IAdSceneService LJII = AdSceneServiceImpl.LJII();
            if (LJII != null) {
                Aweme LJJIIZI = LJJIIZI();
                if (IL1.LIZJ) {
                    if (LJJIIZI != null && LJJIIZI.isAd() && TextUtils.equals(LJJIIZI.getAid(), str)) {
                        LJII.LIZJ();
                        NT2.LJJJJIZL(LJJIIZI, LJJIIZ(), LJJIJ, this.LLILLJJLI, this.LJLJI);
                    }
                } else {
                    LJII.LIZJ();
                    NT2.LJJJJIZL(LJJIIZI, LJJIIZ(), LJJIJ, this.LLILLJJLI, this.LJLJI);
                }
            }
            if (LJJIJIIJI.getCurrentAweme() != null && LJJIJIIJI.getCurrentAweme().getVideoControl() != null) {
                InterfaceC36571c5 interfaceC36571c5 = this.LJLILLLLZI;
                if ((!(interfaceC36571c5 instanceof C92C) || ((C92C) interfaceC36571c5).R0()) && !C54840Lfg.LJJZZI(LJJIJIIJI.getCurrentAweme()) && !C72083SQt.LJJLIIIJL(LJJIJIIJI.getCurrentAweme()) && LJJIJIIJI.u7() && !C54838Lfe.LJIIZILJ(LJJIJIIJI.getCurrentAweme()) && !Y02.LJ(LJJIJIIJI.getCurrentAweme()) && !C62623Ohv.LIZIZ.LJFF(LJJIJIIJI.getCurrentAweme()) && !C217628gQ.LIZIZ.LJIIJ(LJJIIZ(), LJJIJIIJI.getAweme()) && (iPipFeedService = this.LLLIIL) != null && !iPipFeedService.LIZLLL()) {
                    LJJJJIZL().LJJJZ();
                }
            }
            if (C72083SQt.LJJZZIII(LJJIJIIJI) && LJJJIL(LJJIJIIJI) != null) {
                ((NQL) C73340SqO.LJIJ()).LJIJJ(this.LLILLJJLI, LJJIIZ(), LJJJIL(LJJIJIIJI), LJJIJIIJI.getCurrentAweme());
                if (C46279IEh.LIZ() && O5Y.LJJJIL(LJJIJIIJI.getCurrentAweme()) && (LIZJ = MeasurementServiceImpl.LJ().LIZJ()) != null) {
                    LIZJ.LJIIL(this.LLILLJJLI, LJJIIZ(), LJJJIL(LJJIJIIJI), LJJIJIIJI.getCurrentAweme());
                }
            }
            if (LJJIJIIJI.j3() != null) {
                LJJIJIIJI.j3().l2(this.LLILLJJLI);
            }
            if (LJJIJIIJI.getCurrentAweme() != null && this.LLILLJJLI > 0) {
                Aweme currentAweme = LJJIJIIJI.getCurrentAweme();
                if (C59645Naz.LIZ(currentAweme)) {
                    C2NF LIZ = C2NF.LIZ();
                    int i2 = this.LLILLJJLI;
                    LIZ.LIZJ = i2;
                    if (i2 == 0) {
                        ARunnableS5S0200100_8 aRunnableS5S0200100_8 = new ARunnableS5S0200100_8(LIZ, 1);
                        LIZ.LJ = aRunnableS5S0200100_8;
                        LIZ.LIZ.post(aRunnableS5S0200100_8);
                    }
                }
                if (currentAweme != null && TextUtils.equals(str, currentAweme.getAid()) && LJJLIIIJJIZ(currentAweme, LJJIJIIJI)) {
                    if (LJJIJIIJI.j3() != null && LJJIJIIJI.j3().I2(LJ())) {
                        try {
                            AnonymousClass901 j3 = LJJIJIIJI.j3();
                            if (j3 != null && (W22 = j3.W2()) != null) {
                                W22.LJIIIZ(LJJIIZ(), this.LJLJI, currentAweme, true);
                            }
                        } catch (Exception unused) {
                        }
                        this.LLJJIJIL = true;
                        this.LLILZIL = true;
                        JHI.LIZ().LIZLLL = true;
                        if (FypAutoScrollServiceImpl.LJIIZILJ() != null) {
                            FypAutoScrollServiceImpl.LJIIZILJ().LJ(true);
                        }
                        C46276IEe c46276IEe = new C46276IEe(7, 0);
                        c46276IEe.LJLILLLLZI = str;
                        LJZ(c46276IEe);
                        if (LJJJJJ() != null) {
                            LJJJJJ().onPlayCompleted(str);
                        }
                        if (LJJIJIIJI.LLLJ() != null) {
                            LJJIJIIJI.LLLJ().onPlayCompleted(str);
                            return;
                        }
                        return;
                    }
                    this.LLILZ++;
                }
                try {
                    AnonymousClass901 j32 = LJJIJIIJI.j3();
                    if (j32 != null && (W2 = j32.W2()) != null) {
                        W2.LJIIIZ(LJJIIZ(), this.LJLJI, currentAweme, false);
                    }
                } catch (Exception unused2) {
                }
            }
            this.LJLLLLLL = System.currentTimeMillis();
            if (LJII != null && LJJJ != null && !LJJJ.isAdHasClickRefresh()) {
                LJII.LIZJ();
                NT2.LJJJJLI(LJJIIZI(), LJJIIZ(), 2, this.LLILLJJLI + 1);
            }
            LJZ(new C46276IEe(13, str));
            AdReRankServiceManager.LIZJ().LIZIZ(ILE.FEED).LJIILJJIL(LJJIIZI());
            if (LJJJ != null) {
                LJJJ.showFollowGuide();
                LJJJ.onPlayCompletedToShowSwipeUpGuide();
            }
            C46276IEe c46276IEe2 = new C46276IEe(7, 0);
            c46276IEe2.LJLILLLLZI = str;
            LJZ(c46276IEe2);
            if (TextUtils.equals(this.LLLLIIL, str)) {
                this.LLLLIIIILLL++;
            } else {
                this.LLLLIIIILLL = 1;
                this.LLLLIIL = str;
            }
            LJJIJIIJI.LLLJ().G60(this.LLLLIIIILLL);
            if (LJJJ != null) {
                LJJJ.onPlayCompletedToShowShareGuide(str);
            }
            UgAllServiceImpl.LIZ().LJFF();
            if (LJJJJJ() != null) {
                LJJJJJ().onPlayCompleted(str);
            }
            if (LJJIJIIJI.LLLJ() != null) {
                LJJIJIIJI.LLLJ().onPlayCompleted(str);
            }
            C37288EkG.LIZ();
            int i3 = this.LLLLIIIILLL;
            long LJJIJ2 = LJJIJ(null);
            C176566wO.LIZJ = i3;
            C176566wO.LIZLLL = LJJIJ2;
            SpecActServiceImpl.LJJJIL().LJJIJL(LJJIIZI());
            SpecActServiceImpl.LJJJIL().LJJIJ();
            C46323IFz.LIZIZ(LJJIIZI());
            C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy().LJFF();
            this.LLLJL.LIZIZ();
            if (C84763XOl.LJIIJJI && C47957Irx.LIZIZ() && C46416IJo.LIZ() == ILC.PLAY_IN_ORDER) {
                LJLJL();
                C47541IlF.LIZIZ = true;
                LJJJJIZL().LIZIZ();
            }
            C47699Inn.LJI = System.currentTimeMillis();
            if (LJJJJIZL().getDuration() <= 0) {
                C47699Inn.LJII = (C47699Inn.LJI - C47699Inn.LJFF) / this.LLLLIIIILLL;
            } else {
                C47699Inn.LJII = LJJJJIZL().getDuration();
            }
            C47699Inn.LIZLLL(LJJIJIIJI.getCurrentAweme(), true);
            LJJL(new ARunnableS11S0201000_8(1, this, str, 6));
        } catch (Throwable th) {
            if (LJJJJJ() != null) {
                LJJJJJ().onPlayCompleted(onPlayCompleted2);
            }
            if (LJJIJIIJI != null && LJJIJIIJI.LLLJ() != null) {
                LJJIJIIJI.LLLJ().onPlayCompleted(onPlayCompleted);
            }
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
        if (LJJJJJ() != null) {
            LJJJJJ().onPlayPause(str);
        }
        C46255IDj c46255IDj = this.LLJZ;
        if (str != null) {
            if (c46255IDj.LIZIZ.containsKey((Object) str)) {
                LJJJJL(str);
                this.LLJZ.getClass();
                this.LLLJL.LIZIZ();
                return;
            }
            return;
        }
        c46255IDj.getClass();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepared(String str) {
        if (((Boolean) C35041Dp7.LIZIZ.getValue()).booleanValue()) {
            RealTimeSplashNPManagerImpl.LIZJ().LIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        String aid;
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        String LJJJJL = LJJJJL(str);
        C46255IDj c46255IDj = this.LLJZ;
        c46255IDj.getClass();
        if (!TextUtils.isEmpty(LJJJJL) && !TextUtils.isEmpty(str)) {
            c46255IDj.LIZIZ.put(str, LJJJJL);
        }
        this.LLJZ.getClass();
        LLFII(LJJJJL, str);
        this.LLLJL.LIZIZ();
        IH1 LIZJ = IH1.LIZJ();
        Aweme LJJIIZI = LJJIIZI();
        LIZJ.getClass();
        VideoCoverPreloadConfig videoCoverPreloadConfig = IH1.LJFF;
        if (videoCoverPreloadConfig.enablePreload && videoCoverPreloadConfig.preloadWhenDownloadComplete && LJJIIZI != null && (aid = LJJIIZI.getAid()) != null && aid.length() != 0 && (iDHandlerS21S0100000_8 = LIZJ.LIZLLL) != null && (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(5, LJJIIZI)) != null) {
            obtainMessage.sendToTarget();
        }
        C47699Inn.LJFF = System.currentTimeMillis();
        if (LJJJ() != null) {
            LJJJ().onPlaying(str);
        }
        if (LJJJJJ() != null) {
            LJJJJJ().onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final void onPreRenderReady(String str) {
        IDR LJJJ = LJJJ();
        if (LJJJ instanceof FullFeedFragmentPanel) {
            C2MA viewHolderByAwemeId = ((BaseListFragmentPanel) LJJJ).getViewHolderByAwemeId(str);
            if (viewHolderByAwemeId instanceof VideoViewCell) {
                VideoViewCell videoViewCell = (VideoViewCell) viewHolderByAwemeId;
                videoViewCell.getClass();
                if (((Boolean) C92H.LIZ.getValue()).booleanValue()) {
                    videoViewCell.LLILLIZIL("preRenderReady");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r4 == 1) goto L54;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRenderFirstFrame(X.IT4 r17) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onRenderFirstFrame(X.IT4):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        String str;
        boolean LJJIJL;
        boolean LJJIJL2;
        int LIZ;
        int LJ = C34710Djm.LJ();
        if (LJ == 1 || LJ == 2 || StrategyImpl.LIZIZ().LJJIJIL()) {
            C39106FWk.LIZ().LIZIZ();
        }
        if (FVW.LIZ.LIZ(FVU.ON_RENDER_READY) && (LIZ = C00F.LIZ(31744, 0, "downgrade_feed_total_duration", true)) > 0) {
            try {
                Thread.sleep(LIZ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (a.LJIJI().LIZ()) {
            C46981IcD.LIZJ = true;
        }
        if (iph != null) {
            str = iph.LIZ;
        } else {
            str = "";
        }
        C9K4.LIZIZ("call onRenderReady", str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!FN9.LIZLLL || !C35810E3q.LJFF) {
            LJJIJL = C78596Usy.LJJIJL(C46257IDl.LJLIL, DPB.LIZIZ());
            if (LJJIJL && iph != null) {
                LJLJLJ(iph.LIZ);
                if (!C46284IEm.LIZ()) {
                    C57022Lq.LIZ.LJLIL.post(new ARunnableS27S0200000_8(this, iph, elapsedRealtime, 0));
                    return;
                } else {
                    LLIILZL(new ARunnableS27S0200000_8(this, iph, elapsedRealtime, 4), str, "onRenderReady");
                    return;
                }
            }
            if (!C46284IEm.LIZ()) {
                LJLIL(iph);
                return;
            } else {
                LLIILZL(new ARunnableS27S0200000_8(this, iph, elapsedRealtime, 5), str, "onRenderReady");
                return;
            }
        }
        LJJIJL2 = C78596Usy.LJJIJL(C46257IDl.LJLIL, DPB.LIZIZ());
        if (LJJIJL2 && iph != null) {
            LJLJLJ(iph.LIZ);
        }
        if (!C46284IEm.LIZ()) {
            C57022Lq.LIZ.LJLIL.post(new ARunnableS27S0200000_8(this, iph, elapsedRealtime, 2));
        } else {
            LLIILZL(new ARunnableS27S0200000_8(this, iph, elapsedRealtime, 3), str, "onRenderReady");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x02cf, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0264  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResumePlay(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onResumePlay(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        C2MA viewHolderByAwemeId;
        Video video;
        if (!LJII() || (viewHolderByAwemeId = getViewHolderByAwemeId(ipg.LIZ)) == null || viewHolderByAwemeId.LLLJ() == null) {
            return;
        }
        viewHolderByAwemeId.LLLJ().onRetryOnError(ipg);
        if (IFS.LIZ[LJJJJIZL().getPlayerType().ordinal()] != 1) {
            return;
        }
        Object obj = ipg.LJI;
        if ((obj != null && !(obj instanceof Integer)) || viewHolderByAwemeId.getCurrentAweme() == null || (video = viewHolderByAwemeId.getCurrentAweme().getVideo()) == null) {
            return;
        }
        C38816FLg.LJ(new ARunnableS19S0300000_8(video, ipg, this, 0));
    }

    public static int LJIIL(VideoUrlModel videoUrlModel, String str) {
        if (C47242IgQ.LIZ().isCache(C51029K0z.LJJJJI(videoUrlModel))) {
            return C46728IVo.LJ(videoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(str) == null) {
            return -2;
        }
        return -1;
    }

    public static boolean LJIILJJIL(String str, String str2) {
        Pair<String, HashMap<String, Boolean>> pair;
        Object obj;
        Boolean bool;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (pair = LLLLZLL) == null || TextUtils.isEmpty((CharSequence) pair.first) || !TextUtils.equals(str, (CharSequence) LLLLZLL.first) || (obj = LLLLZLL.second) == null || !((HashMap) obj).containsKey(str2) || (bool = (Boolean) ((HashMap) LLLLZLL.second).get(str2)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJIJJ(String str, String str2) {
        Pair<String, HashMap<String, Boolean>> pair;
        Object obj;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (pair = LLLLZLL) == null || TextUtils.isEmpty((CharSequence) pair.first) || !TextUtils.equals(str, (CharSequence) LLLLZLL.first) || (obj = LLLLZLL.second) == null || !((HashMap) obj).containsKey(str2)) {
            return;
        }
        ((HashMap) LLLLZLL.second).put(str2, Boolean.FALSE);
    }

    public static void LJJJZ(Aweme aweme, Video video) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(video.getMeta())) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(video.getMeta());
            }
            boolean z = false;
            if (DZH.LIZ && aweme.getAwemeType() == 150) {
                z = true;
            }
            jSONObject.put("disable_in_photo_mode", z);
            video.setMeta(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static void LJLZ(int i, String str) {
        ILM ilm;
        int i2;
        int i3;
        JSONObject jSONObject;
        if (i == 1) {
            ilm = ILM.SUCCESS;
        } else {
            ilm = ILM.FAILURE;
        }
        int i4 = -1;
        int i5 = 0;
        if (str != null && !str.isEmpty()) {
            try {
                jSONObject = new JSONObject(str);
                i5 = JSONObjectProtectorUtils.getInt(jSONObject, "code");
                i4 = JSONObjectProtectorUtils.getInt(jSONObject, "cache_hit");
            } catch (JSONException unused) {
                i4 = -1;
            }
            try {
                i3 = JSONObjectProtectorUtils.getInt(jSONObject, "download_duration");
            } catch (JSONException unused2) {
                i3 = -1;
                i2 = -1;
                C46290IEs.LIZ().LIZLLL(ilm, Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2));
            }
            try {
                i2 = JSONObjectProtectorUtils.getInt(jSONObject, "file_size");
            } catch (JSONException unused3) {
                i2 = -1;
                C46290IEs.LIZ().LIZLLL(ilm, Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2));
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        C46290IEs.LIZ().LIZLLL(ilm, Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2));
    }

    @Override // X.C2LB
    public void LJIIIIZZ(Activity activity, Fragment fragment) {
        this.LJLIL = activity;
        this.LJLILLLLZI = fragment;
        if (activity == null) {
            C1JD.LJIJJ("ATTACH ACTIVITY == NULL");
        }
        this.LLJILJIL = new IDBReceiverS6S0100000_6(this, 0);
        C10760bY.LIZ(activity).LIZIZ(this.LLJILJIL, AnonymousClass028.LIZ("android.intent.action.USER_PRESENT"));
        if (!C47957Irx.LIZIZ()) {
            return;
        }
        this.LJLIL.bindService(new Intent(this.LJLIL, (Class<?>) BackgroundAudioBrowserService.class), this.LLLJL, 1);
    }

    public final void LJJJLIIL(AnonymousClass901 anonymousClass901, Aweme aweme) {
        if (anonymousClass901 != null && anonymousClass901.u2()) {
            anonymousClass901.e3(false);
            IAdSceneService LJII = AdSceneServiceImpl.LJII();
            if (LJII != null) {
                LJII.LIZJ();
                NT2.LJJJJLI(aweme, LJJIIZ(), 1, this.LLILLJJLI + 1);
            }
        }
    }

    public final boolean LJJLIIIJJIZ(Aweme aweme, C2MA c2ma) {
        CardStruct LJJJIL;
        if (!aweme.isAd() || C63081OpJ.LJZL(aweme) || c2ma.S7()) {
            return false;
        }
        if (TextUtils.isEmpty(aweme.getAwemeRawAd().getWebUrl()) && !C63081OpJ.LLD(aweme) && !C63081OpJ.LJJLJ(aweme) && !C63081OpJ.LJJLJLI(aweme) && !C63081OpJ.LLIIIL(aweme) && ((LJJJIL = C63081OpJ.LJJJIL(aweme)) == null || LJJJIL.getCardType() != 15)) {
            return false;
        }
        if (aweme.getAwemeRawAd().showMaskRecycle || IEW.LIZIZ(aweme)) {
            return true;
        }
        if (this.LLILZ == -10) {
            this.LLILZ = aweme.getAwemeRawAd().getShowMaskTimes();
        }
        if (LJJLIIIJL(c2ma) && TextUtils.equals(this.LJLJI, "general_search")) {
            int i = this.LLILZ;
            if (i <= 0 || this.LLILLL < i || this.LLILZIL) {
                return false;
            }
            return true;
        }
        int i2 = this.LLILZ;
        if (i2 <= 0 || this.LLILLJJLI < i2 || this.LLILZIL) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIJLLLLLLLZ(int i, Aweme aweme) {
        if (C63081OpJ.LJJLIL(aweme)) {
            IDR LJJJ = LJJJ();
            IAwemeContextService LJ = AwemeContextServiceImpl.LJ();
            if (LJJJ != null && LJ != null) {
                int curIndex = LJJJ.getCurIndex() + i;
                LJ.LIZIZ(aweme, LJJJ.getAwemeByIndex(curIndex - 1), LJJJ.getAwemeByIndex(curIndex + 1));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r8.LLLLLJLJLL == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r8.LLLLLJIL = r9;
        r8.LLLLLJLJLL = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (((java.lang.Boolean) X.C35704Dzo.LJJ.getValue()).booleanValue() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        X.C37179EiV.LIZ().postAtFrontOfQueue(new Y.ARunnableS12S0110000_6(r8, r10, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (X.C35386Dug.LIZ() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0 = !r10;
        r7 = LJJIIZI();
        r6 = LJJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r7 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        r2 = r6.getNextAweme(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d7, code lost:
    
        r1 = getViewHolderByAwemeId(r2.getAid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        if (X.C72083SQt.LJJZZIII(r1) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        if (LJJJIL(r1) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        r8.LLLLLLLLL = r2;
        ((X.NQL) X.C73340SqO.LJIJ()).LJJIIZ(LJJIIZ(), LJJJIL(r1), r1.getCurrentAweme(), r6.getOmSdkContentUrl(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        r2 = r6.getPrevAweme(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        LLIIIJ(1, null, !r10, X.C35704Dzo.LJI());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if (X.C00F.LIZ(31744, 1, "player_scroll_prerender_enable", true) == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r8.LLLLLJIL != r9) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLL(int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJJLL(int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        if (r7 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZI(X.C2MA r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJJZZI(X.2MA, boolean):void");
    }

    public final void LJLI(IPG ipg, C2MA c2ma) {
        if (ipg == null || c2ma == null || c2ma.getCurrentAweme() == null || c2ma.getCurrentAweme().getVideo() == null) {
            return;
        }
        LJJJJL(this.LLJLLIL);
        C46255IDj c46255IDj = this.LLJZ;
        c46255IDj.LIZIZ.remove((Object) this.LLJLLIL);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", String.valueOf(ipg.LJ));
            jSONObject.put("error_internal_code", String.valueOf(ipg.LJFF));
            jSONObject.put("internet_speed", String.valueOf(C47497IkX.LIZJ()));
            String msg = jSONObject.toString();
            o.LJIIIZ(msg, "msg");
            IRuntimeBehaviorService LJ = RuntimeBehaviorServiceImpl.LJ();
            if (LJ == null) {
                return;
            }
            LJ.event("error", msg);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0061, code lost:
    
        if (r0 != 0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJI(int r21, com.ss.android.ugc.aweme.feed.model.Aweme r22) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJLJI(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJLJJLL(Aweme aweme, C2MA c2ma) {
        if (aweme != null) {
            if (!C79146V4k.LJJJJ(this.LJLJI)) {
                LJLJJI();
            }
            InterfaceC222708oc LLLJ = c2ma.LLLJ();
            if (LLLJ != null && LLLJ.UU() == 2) {
                LLLJ.Y2(aweme);
            }
        }
    }

    public final String LJLLLL(int i, Aweme aweme) {
        return LJLLLLLL(i, aweme, false);
    }

    public final void LJZI(String str, boolean z) {
        this.LLIIZ = z;
        if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Boolean.valueOf(z));
        }
    }

    public final void LJZL(String str, boolean z) {
        this.LLD = z;
        if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Boolean.valueOf(z));
        }
    }

    public final void LLD(String str, boolean z) {
        this.LL = z;
        if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Boolean.valueOf(z));
        }
    }

    public final void LLF(long j, String str) {
        this.LLILII = j;
        if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Long.valueOf(j));
        }
    }

    public final void LLFF(long j, String str) {
        int intValue;
        this.LJLLJ = j;
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI instanceof IPhotosViewHolderType) {
            IPhotosViewHolderType iPhotosViewHolderType = (IPhotosViewHolderType) LJJIJIIJI;
            if (j != -1) {
                iPhotosViewHolderType.setStartTime(j);
            }
        }
        if (C44432HcC.LJLJI) {
            intValue = ((Number) C35704Dzo.LJIJ.getValue()).intValue();
        } else {
            intValue = ((Number) C35080Dpk.LIZ.getValue()).intValue();
        }
        if ((1 == intValue || 2 == intValue) && !TextUtils.isEmpty(str)) {
            if (j >= 0) {
                ((HashMap) this.LJLLL).put(str, Long.valueOf(j));
            } else {
                ((HashMap) this.LJLLL).remove(str);
            }
            IE6 ie6 = this.LJLLLL;
            if (ie6 != null) {
                ie6.LJIIIIZZ(j, str);
            }
        }
    }

    public final void LLFII(String str, String str2) {
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(str2);
        if (viewHolderByAwemeId != null && viewHolderByAwemeId.getCurrentAweme() != null && viewHolderByAwemeId.LLLJ() != null) {
            viewHolderByAwemeId.x8(str);
        }
    }

    public final void LLFZ(long j, String str) {
        this.LLIIJI = j;
        if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Long.valueOf(j));
        }
    }

    public final void LLII(Aweme aweme, C2MA c2ma) {
        boolean z;
        if (C57272Mp.LIZ() && LJJLIIIJL(c2ma) && c2ma.LLJJIJIL() != null) {
            ViewGroup Dp = c2ma.LLLJ().Dp();
            InterfaceC47247IgV surfaceHolder = c2ma.LLJJIJIL().getSurfaceHolder();
            InterfaceC222998p5 pinchListener = this.LJLL.get().getPinchListener();
            if (c2ma.LLLJ().Jk0() && C56892Ld.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            if (Dp == null || surfaceHolder == null || aweme.isAd() || ((c2ma.LLLJ() != null && c2ma.LLLJ().UU() == 2) || OUP.LJJIII(aweme) || z)) {
                this.LLJJJ.LIZLLL();
                c2ma.C7(null);
                if (z) {
                    c2ma.A8();
                    return;
                }
                return;
            }
            this.LLJJJ.LIZ(LJJIIZ(), (ViewGroup) this.LJLIL.getWindow().getDecorView(), Dp, surfaceHolder, pinchListener, EnumC223028p8.VIDEO);
            c2ma.C7(this.LLJJJ);
        }
    }

    public final String LLIILII(int i, Aweme aweme) {
        if (C39082FVm.LIZ()) {
            HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_video_play");
            LIZJ.put("vv_code", Integer.valueOf(LiveCenterDelayLoadSetting.DEFAULT));
            C39082FVm.LIZJ(LIZJ);
        }
        String LJLLLLLL = LJLLLLLL(i, aweme, false);
        IDR LJJJ = LJJJ();
        if (LJJJ != null) {
            LJJJ.handleMobShowEvent();
        }
        return LJLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        if (LJJLIIIJJI()) {
            C2MY.LIZ().LJ();
            C2MY.LIZ().LJFF(1);
            C51645KOr.LIZIZ.LJII(str);
        }
        IPlayerPreloadDataAbility x3 = PlayerPreloadDataComponent.x3(this.LJLL);
        if (x3 != null) {
            x3.It(str, z);
        }
        IH1 LIZJ = IH1.LIZJ();
        LIZJ.getClass();
        VideoCoverPreloadConfig videoCoverPreloadConfig = IH1.LJFF;
        if (!videoCoverPreloadConfig.enablePreload || !videoCoverPreloadConfig.preloadWhenDownloadComplete || str == null || str.length() == 0 || (iDHandlerS21S0100000_8 = LIZJ.LIZLLL) == null || (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(3, str)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r0 > 0) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPausePlay(java.lang.String r18, X.IPH r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onPausePlay(java.lang.String, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        Aweme aweme;
        double d;
        double d2;
        if (!LJII()) {
            return;
        }
        if (C40438Fty.LIZLLL) {
            C1DH.LIZJ(C40438Fty.LJ);
            C40438Fty.LIZLLL = false;
            C40443Fu3.LIZ("video_play").LIZ("is_pause", "true");
            C40443Fu3.LIZ("video_play").stop();
        }
        if (((HashMap) C40438Fty.LIZ).get("system_launch") != EnumC40442Fu2.MONITORED) {
            C40438Fty.LJ("true");
            C35326Dti.LIZ = false;
        }
        IDR LJJJ = LJJJ();
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId != null && viewHolderByAwemeId.LLLJ() != null) {
            viewHolderByAwemeId.LLLJ().onPlayCompletedFirstTime(str);
        }
        LJZ(new C46276IEe(6, 0));
        if (viewHolderByAwemeId != null) {
            aweme = viewHolderByAwemeId.getCurrentAweme();
            if (aweme != null && !TextUtils.isEmpty(this.LLJJIII)) {
                C2U8.LIZ(new C49671JeV(3, this.LLJJIII, aweme.getAid(), LJJJJIZL().getCurrentPosition()));
            }
        } else {
            aweme = null;
        }
        if (!C1DF.LJJIII(aweme)) {
            LJIL(str, LJJJ, aweme);
        }
        IUgAllService LIZ = UgAllServiceImpl.LIZ();
        LJJLIIIJJI();
        LIZ.LJ();
        MLCommonService.instance().onPlayFinishFirst(aweme, this.LJLJI);
        if (LJJIIZI() == null) {
            return;
        }
        if (aweme != null) {
            String id = aweme.getAid();
            o.LJIIIZ(id, "id");
            if (((HashMap) C47699Inn.LJIIIZ).containsKey(id)) {
                C47699Inn.LIZJ(aweme);
            }
        }
        if (LJJLIIIJJI()) {
            C2MY.LIZ().LJFF = true;
            C2MY.LIZ().LJ();
            C2MY.LIZ().LJFF(2);
        }
        if (this.LLJLL == 0) {
            double LJII = C47636Imm.LJII(2);
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(IG3.LIZLLL() ? 1 : 0, "earphone_status");
            if (IG3.LIZIZ) {
                d = IG3.LIZJ();
            } else {
                d = IG3.LIZJ;
            }
            c188727au.LIZJ("auto_adjusted_volume_value", d);
            if (IG3.LIZIZ) {
                d2 = IG3.LIZJ();
            } else {
                d2 = IG3.LIZJ;
            }
            c188727au.LIZJ("auto_adjusted_volume_pct", d2);
            c188727au.LIZJ("end_volume_value", LJII);
            c188727au.LIZJ("end_volume_pct", LJII);
            FMX.LJIIL("first_video_play_finish_volume", c188727au.LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0 > 0) goto L21;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPreparePlay(java.lang.String r15, X.IPH r16) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onPreparePlay(java.lang.String, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeekEnd, success:");
        LIZ.append(z);
        C36922EeM.LIZLLL(6, "PlayerController", X1D.LIZIZ(LIZ));
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI == null || LJJIJIIJI.LLLJ() == null) {
            return;
        }
        LJJIJIIJI.LLLJ().onSeekEnd(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI == null || LJJIJIIJI.LLLJ() == null) {
            return;
        }
        LJJIJIIJI.LLLJ().onSpeedChanged(str, f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2fM] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2fN] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.2fU] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2fO] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.2fG] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.2fH] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.2fJ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.2fP] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2fF] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.2hr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2fI] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2fK] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2fL] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2g5] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2fV] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2fQ] */
    public IDP(int i, IDR idr, String str) {
        super(str, i);
        this.LJLLJ = -1L;
        this.LJLLLLLL = -1L;
        this.LJLZ = -1L;
        this.LJZ = -1L;
        this.LJZI = "";
        this.LLF = -1L;
        this.LLFF = new LinkedHashMap<String, Boolean>() { // from class: X.2fM
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLFFF = new LinkedHashMap<String, Boolean>() { // from class: X.2fN
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLFII = new LinkedHashMap<String, Boolean>() { // from class: X.2fF
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLFZ = new LinkedHashMap<String, Long>() { // from class: X.2fI
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLI = new LinkedHashMap<String, Long>() { // from class: X.2fK
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLIFFJFJJ = new LinkedHashMap<String, Long>() { // from class: X.2fL
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLII = new LinkedHashMap<String, Boolean>() { // from class: X.2g5
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLIIII = new LinkedHashMap<String, Boolean>() { // from class: X.2fV
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLIIIILZ = new LinkedHashMap<String, Integer>() { // from class: X.2fQ
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLIIIJ = 0L;
        this.LLIIIL = 0L;
        this.LLIIIZ = -1L;
        this.LLIIJI = -1L;
        this.LLIIJLIL = 0;
        this.LLIIL = 0;
        this.LLIILII = -1L;
        this.LLIILZL = 0L;
        this.LLILII = 0L;
        this.LLILIL = 0L;
        this.LLILL = -1L;
        this.LLILLJJLI = 0;
        this.LLILLL = 0;
        this.LLILZ = -10;
        this.LLILZIL = false;
        this.LLIZLLLIL = false;
        this.LLJJI = new C73318Sq2();
        this.LLJJIJI = true;
        this.LLJJIJIL = false;
        this.LLJJJ = new KTY();
        this.LLJJJIL = new LinkedHashMap<String, Double>() { // from class: X.2fU
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Double> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJJJ = new LinkedHashMap<String, String>() { // from class: X.2fO
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJJJJIL = new LinkedHashMap<String, Long>() { // from class: X.2fG
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJJJLIIL = new LinkedHashMap<String, Integer>() { // from class: X.2fH
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJL = new LinkedHashMap<String, Long>() { // from class: X.2fJ
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                if (size() > 10) {
                    return true;
                }
                return false;
            }
        };
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap<String, C47333Iht>() { // from class: X.2fP
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, C47333Iht> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }
        };
        this.LLJLLL = true;
        this.LLJZ = new C46255IDj();
        this.LLJZIJLIL = new LinkedHashMap<String, String>() { // from class: X.2hr
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 5) {
                    return true;
                }
                return false;
            }
        };
        this.LLL = false;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = 0;
        this.LLLIL = ProactiveTriggersService.LJI();
        this.LLLILZ = EarlyFeedbackService.LJI();
        this.LLLILZJ = new C35733E0r();
        this.LLLJIL = new C35734E0s();
        this.LLLJL = new XNW(this);
        this.LLLL = false;
        this.LLLLIIIILLL = 0;
        this.LLLLIILLL = -0.5d;
        this.LLLLIL = false;
        this.LLLLJ = true;
        this.LLLLJI = false;
        this.LLLLLIL = new ARunnableS10S0101000_6(0, this, 0);
        IEC.LIZ.getClass();
        this.LLLLLILLIL = (PlayerSmartPrerenderConfig) IEC.LIZIZ.getValue();
        this.LLLLLJIL = -1;
        this.LLLLLL = -1;
        this.LLLLLLJ = true;
        this.LLLLLLL = MeasurementServiceImpl.LJ().LIZLLL();
        this.LLLLLLLLL = null;
        this.LLLLLLLZIL = null;
        this.LLLLLLZ = null;
        this.LLLLZ = "";
        this.LLLLZI = new IDQ(this);
        this.LJLL = new WeakReference<>(idr);
        this.LJLLJ = -1L;
        this.LJLLL = new HashMap();
        this.LJLLLLLL = -1L;
        this.LJLZ = -1L;
        this.LJZ = -1L;
        this.LLJJIJIIJIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        try {
            this.LLLLILI = C2YJ.LIZIZ.LIZ.getVideoPlayProgressCount().intValue();
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_ab_block_type", true);
        if (AnonymousClass340.LIZ()) {
            this.LLLIIIIL = new IDT(this);
        } else {
            this.LLLIIIIL = new IDS(this, this);
        }
        if (e1.LIZ(31744, "player_data_middle_memory_opt", true, false)) {
            this.LLLIILIL = new C47539IlD(this);
        } else {
            this.LLLIILIL = new C47540IlE(this);
        }
    }

    public final void LJIILIIL(String str, boolean z, C2MA c2ma) {
        LJIIJJI();
        OSZ<Integer, Long> LJJIJIIJIL = LJJIJIIJIL(this.LLJ);
        if (c2ma == null) {
            c2ma = LJJIJIIJI();
        }
        if (C72083SQt.LJLILLLLZI(c2ma)) {
            IAdSceneService LJII = AdSceneServiceImpl.LJII();
            if (LJII != null && !this.LLJJIJIL && !C1DJ.LJJ(this.LLJ)) {
                if (z && this.LLJ != null) {
                    LJII.LIZJ();
                    Aweme LJJIIZI = LJJIIZI();
                    Context LJJIIZ = LJJIIZ();
                    Aweme aweme = this.LLJ;
                    NT2.LJJIIZI(LJJIIZI, LJJIIZ, aweme, aweme.getAid(), LJJIJIIJIL, this.LLILLJJLI + 1, C48052ItU.LIZIZ());
                } else {
                    LJII.LIZJ();
                    NT2.LJJIIZI(LJJIIZI(), LJJIIZ(), this.LLJ, str, LJJIJIIJIL, this.LLILLJJLI + 1, C48052ItU.LIZIZ());
                }
            }
            Aweme aweme2 = this.LLJ;
            if (aweme2 != null && aweme2.isAd() && this.LLJ.getAwemeRawAd() != null) {
                this.LLJ.getAwemeRawAd().setReshowAd(true);
                long j = AdSessionPositionHelper.LJFF;
                if (j != -1) {
                    AdSessionPositionHelper.LJI = j;
                    AdSessionPositionHelper.LJFF = -1L;
                }
            }
            this.LLJ = LJJIIJZLJL(c2ma);
        }
    }

    public final void LJIILLIIL(Aweme aweme, InterfaceC46330IGg interfaceC46330IGg, boolean z) {
        if (aweme != null) {
            if (aweme.getMusic() != null && aweme.getMusic().getId() != 0 && aweme.getMusic().getMusicStatus() == 0) {
                C73340SqO.LJJIIZI().getClass();
                if (!C59252NNg.LJI(aweme)) {
                    interfaceC46330IGg.LJIJJ();
                    return;
                }
            }
            if (aweme.getStatus() != null && aweme.getStatus().getVideoMuteInfo() != null) {
                if (aweme.getStatus().getVideoMuteInfo().isMute()) {
                    interfaceC46330IGg.LJIJJ();
                } else {
                    interfaceC46330IGg.LJJIL();
                }
                if (z && !TextUtils.isEmpty(aweme.getStatus().getVideoMuteInfo().getMuteDesc())) {
                    C5S1 c5s1 = new C5S1(LJJIIZ());
                    c5s1.LIZLLL(aweme.getStatus().getVideoMuteInfo().getMuteDesc());
                    c5s1.LJ();
                    return;
                }
                return;
            }
        }
        interfaceC46330IGg.LJJIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ec, code lost:
    
        if (r2 >= 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(int r13, X.C2MA r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJJJLL(int, X.2MA, boolean):void");
    }

    public final void LJJLIIIJLJLI(String str, String str2, String str3) {
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ(str, "code");
            c56742Ko.LIZ(str3, "aid");
            c56742Ko.LIZ(str2, "errMsg");
            c56742Ko.LIZ(this.LJLJI, WM7.SCENE_SERVICE);
            c56742Ko.LIZ("renderReady", "source");
            c9k4.LIZJ(str3, c56742Ko.LIZ);
        }
    }

    public final void LJJLJ(String str, boolean z, boolean z2) {
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI != null && LJJIJIIJI.LLLJ() != null) {
            LJJIJIIJI.LLLJ().onBuffering(z);
        }
        LJZI(str, z);
        LJJLIL(str, z, false, z2);
        if (LJJIJIIJI != null && LJJJIL(LJJIJIIJI) != null && LJJIZ(str) && C72083SQt.LJJZZIII(LJJIJIIJI)) {
            if (z) {
                InterfaceC46264IDs LJIJ = C73340SqO.LJIJ();
                Aweme currentAweme = LJJIJIIJI.getCurrentAweme();
                LJIJ.LIZIZ(this.LLILLJJLI, LJJIIZ(), LJJJIL(LJJIJIIJI), currentAweme);
                return;
            }
            InterfaceC46264IDs LJIJ2 = C73340SqO.LJIJ();
            Aweme currentAweme2 = LJJIJIIJI.getCurrentAweme();
            LJIJ2.LIZJ(this.LLILLJJLI, LJJIIZ(), LJJJIL(LJJIJIIJI), currentAweme2);
        }
    }

    public final void LJJLJLI(boolean z, boolean z2, boolean z3) {
        if (!this.LL || !C72083SQt.LJLILLLLZI(LJJIJIIJI())) {
            return;
        }
        this.LLIL = z;
        if (z) {
            this.LLIIL++;
            if (this.LLIILII == -1) {
                this.LLIILII = SystemClock.elapsedRealtime();
                return;
            }
            return;
        }
        if (this.LLIILII == -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LLIILII;
        this.LLIILZL += elapsedRealtime;
        this.LLIILII = -1L;
        if (!z3 || z2 || elapsedRealtime < C00F.LIZ(31744, 0, "video_buffering_threshold", true)) {
            return;
        }
        LJLLJ(false);
    }

    public final void LJLIIIL(IT4 it4, C2MA c2ma, long j) {
        HandlerC39100FWe handlerC39100FWe;
        long j2;
        C2NL.LIZ.LIZ(ILW.PLAYER_RENDER_FIRST_DELAY);
        String id = it4.getId();
        C35818E3y.LIZJ++;
        List<WeakReference<InterfaceC88472Yns<Integer, C76800UCe>>> list = C35818E3y.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Reference) next).get() != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Reference) it2.next()).get());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) it3.next();
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf(C35818E3y.LIZJ));
            }
        }
        this.LLLIL.LIZIZ();
        if (c2ma != null && c2ma.getCurrentAweme() != null) {
            this.LLLILZ.LIZIZ(c2ma.getCurrentAweme().getAid());
        }
        BuildConfigAllServiceImpl.LIZJ().LIZ();
        if (!this.LLLLIL) {
            if (C35274Dss.LIZ() != -1 && Boolean.TRUE.equals(FAJ.LJFF)) {
                FAJ.LJFF = Boolean.FALSE;
            }
            if (FKN.LIZ(LJJIIZ()) == 3) {
                C38993FSb.LIZ = false;
            }
            FAK LIZ = C56672Kh.LIZ();
            if (LIZ.LJJIJ <= 0) {
                C56672Kh.LIZ().LJJIII = EHX.FEED_TOTAL;
                LIZ.LJJIJ = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - FKB.LIZ) - (SystemClock.uptimeMillis() - j);
            FAJ.LJ(j, "feed_video_to_total");
            FAJ.LJ(j, "feed_texture_available_to_first_frame");
            C56662Kg.LIZ().LJ(j, "feed_total", true);
            C56672Kh.LIZ().LJIIJ("feed_total");
            C56672Kh.LIZ().LJIIIZ(j, "feed_total");
            FAJ.LJ(j, "feed_total_v2");
            C56672Kh.LIZ().LJIIIIZZ(elapsedRealtime, "feed_total_v3");
            C56672Kh.LIZ().LIZIZ("app_start_to_main_focus", "app_start_to_main_focus_v4");
            C56672Kh.LIZ().LIZIZ("feed_total", "feed_total_v4");
            FAK LIZ2 = C56672Kh.LIZ();
            SystemClock.uptimeMillis();
            LIZ2.getClass();
            C56662Kg.LIZ().LJ(elapsedRealtime, "feed_total_v3", false);
            C56662Kg.LIZ().LJFF("app_start_to_first_frame_render", false);
            C56662Kg.LIZ().LJ(j, "player_setsurface_to_first_frame", false);
            C56662Kg.LIZ().LJ(j, "player_prerender_onprepared_to_first_frame", false);
            C56662Kg.LIZ().LJ(j, "player_tryplay_to_first_frame", false);
            C56662Kg.LIZ().LJFF("from_start_to_video_play", false);
            FAJ.LJFF("realtime_splash_prepare_show_to_first_frame", false);
            FAM LIZ3 = C56662Kg.LIZ();
            System.currentTimeMillis();
            LIZ3.getClass();
            C56662Kg.LIZ().LJIIL = SystemClock.elapsedRealtime();
            C38995FSd.LIZIZ().execute(new ARunnableS47S0100000_11(this, 3));
            C56662Kg.LIZ().LIZLLL(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("loadmore_wait_count", 0), "wait_count");
            C56662Kg.LIZ().LIZLLL(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("loadmore_wait_duration", 0L), "wait_duration");
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("loadmore_wait_count", 0);
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeLong("loadmore_wait_duration", 0L);
            if (C36210EJa.LIZ > 0) {
                C10K.LIZJ(new ACallableS41S0000000_6(11));
            }
            if (((Boolean) C59352Up.LIZJ.getValue()).booleanValue()) {
                C38995FSd.LIZLLL().execute(new ARunnableS1S0001000_6(0, 0));
            } else {
                C56662Kg.LIZ().LJIIJJI();
            }
            C35818E3y.LJ(2);
            C46247IDb callback = LLLZIL;
            o.LJIIIZ(callback, "callback");
            ((ArrayList) C35818E3y.LIZ).add(new WeakReference(callback));
            this.LLLLIL = true;
            C90L.LIZ = false;
            if (((Number) C34710Djm.LJJJJZ.getValue()).intValue() == 2) {
                BlockHelper.endBlock();
            }
            if (C39082FVm.LIZ()) {
                HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_video_play");
                LIZJ.put("vv_code", 9000);
                C39082FVm.LIZJ(LIZJ);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C46254IDi.LIZ >= 0 && o.LJ(id, C46254IDi.LJ)) {
            long j3 = C46254IDi.LIZ;
            long j4 = currentTimeMillis - j3;
            if (C46254IDi.LIZIZ >= 0 && j3 >= 0 && currentTimeMillis >= 0 && j4 >= 0 && !TextUtils.isEmpty(C46254IDi.LJ)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_status", String.valueOf(C46254IDi.LIZIZ));
                jSONObject.put("deeplink_type", String.valueOf(C46254IDi.LIZJ));
                jSONObject.put("deeplink_label", C46254IDi.LIZLLL);
                jSONObject.put("deeplink_aweme_id", C46254IDi.LJ);
                jSONObject.put("deeplink_aweme_has_cache", C46254IDi.LJFF);
                jSONObject.put("duration", String.valueOf(j4));
                C46254IDi.LIZ = -1L;
                C46254IDi.LJ = "";
                C46254IDi.LIZIZ = -1;
                C46254IDi.LJFF = 0;
                C10K.LIZJ(new ACallableS106S0100000_3(jSONObject, 6));
            }
        }
        if (DXC.LIZ() == 2) {
            C2QU.LIZJ();
        }
        LJJJJL(id);
        this.LLJZ.getClass();
        C33857DQn.LIZJ = true;
        if (C36152EGu.LJ() && (C2NW.LIZ().LJJIIZ() || C34206Dbe.LIZ())) {
            if (C35478DwA.LIZIZ()) {
                j2 = LivePlayEnforceIntervalSetting.DEFAULT;
            } else {
                j2 = 5000;
            }
            Handler handler = C37179EiV.LJFF;
            C36093EEn c36093EEn = C36093EEn.LIZ;
            Objects.requireNonNull(c36093EEn);
            handler.postDelayed(new IDRunnableS6S0101000(5, c36093EEn, 19), j2);
        } else if (((Boolean) C2XA.LIZJ.getValue()).booleanValue()) {
            Handler handler2 = C37179EiV.LJFF;
            C36093EEn c36093EEn2 = C36093EEn.LIZ;
            Objects.requireNonNull(c36093EEn2);
            handler2.post(new IDRunnableS6S0101000(7, c36093EEn2, 4));
        } else {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZJ();
        }
        C37179EiV.LJFF.post(new ARunnableS14S1000000_8(id, 0));
        if (((Boolean) C93Q.LIZIZ.getValue()).booleanValue()) {
            Iterator<Runnable> it5 = C253789xe.LIZ.iterator();
            while (it5.hasNext()) {
                it5.next().run();
            }
            C253789xe.LIZ.clear();
        }
        if (LJJJ() != null) {
            LJJJ().onRenderFirstFrame(id);
        }
        if (LJJJJJ() != null) {
            LJJJJJ().onRenderFirstFrame(id);
        }
        LJJIIZ();
        if (LJJJJIZL() != null && LJJJJIZL().LJJIJIL() != null) {
            LJJJJIZL().LJJIJIL().LJJLIIIJJIZ(this.LLLLZI);
            LJJJJIZL().LJJIJIL().LJJLIIIIJ(this.LLLIIIIL);
        }
        if (!C16970lZ.LIZIZ(LJJIIZ(), "common_feed_item_feed") && !C46343IGt.LIZ(this.LJLJI)) {
            FET.LIZIZ(1, LJJIIZ());
        }
        C2NL.LIZ.LIZIZ(ILW.PLAYER_RENDER_FIRST_DELAY);
        C88408Ymq.LIZ = false;
        C36093EEn.LIZ.getClass();
        ((MainLooperOptService) C36093EEn.LJII(MainLooperOptService.class)).LJIJ();
        C37179EiV.LJFF.post(new ARunnableS1S0001000_6(1, 5));
        if (C34710Djm.LIZJ()) {
            if (C39101FWf.LIZIZ == null) {
                synchronized (C39101FWf.class) {
                    if (C39101FWf.LIZIZ == null) {
                        C39101FWf.LIZIZ = new C39101FWf();
                    }
                }
            }
            C39101FWf c39101FWf = C39101FWf.LIZIZ;
            c39101FWf.getClass();
            if (C34710Djm.LIZJ() && (handlerC39100FWe = c39101FWf.LIZ) != null && handlerC39100FWe.LIZJ) {
                try {
                    handlerC39100FWe.LIZJ = false;
                    if (C37684Eqe.LJ() == handlerC39100FWe) {
                        C37684Eqe.LIZ(handlerC39100FWe.LIZ);
                        C37684Eqe.LIZIZ(handlerC39100FWe, handlerC39100FWe.LIZ);
                    }
                } catch (Throwable th) {
                    android.util.Log.getStackTraceString(th);
                }
                while (true) {
                    Message message = (Message) ((LinkedList) handlerC39100FWe.LIZIZ).poll();
                    if (message != null) {
                        Handler LJ = C37684Eqe.LJ();
                        try {
                            Field field = C36595EXv.LIZIZ;
                            field.set(message, Integer.valueOf(((Integer) field.get(message)).intValue() & (-2)));
                            LJ.sendMessageAtTime(message, -1L);
                        } catch (Throwable unused) {
                            Message obtain = Message.obtain(message);
                            try {
                                C36595EXv.LIZ.invoke(message, new Object[0]);
                            } catch (Throwable unused2) {
                            }
                            LJ.sendMessageAtTime(obtain, -1L);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x03b2, code lost:
    
        if (r1 != null) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJLLLLLL(int r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJLLLLLL(int, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v56, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r54v0, types: [X.IDP, X.2LB] */
    public final void LLIIIZ(long j, String str, final boolean z) {
        Aweme currentAweme;
        Aweme currentAweme2;
        final boolean z2;
        long LIZ;
        long LJ;
        IDR idr;
        C36581c6 c36581c6;
        ?? r2;
        int i;
        boolean z3;
        boolean z4;
        C47333Iht LJIIIIZZ;
        final String str2;
        final String str3;
        final String str4;
        final String str5;
        final String str6;
        final String str7;
        final String str8;
        final String str9;
        final String str10;
        final String str11;
        final boolean z5;
        Session LJ2;
        M89 param;
        String str12;
        int i2;
        boolean z6;
        long longValue;
        Activity activity;
        String str13 = str;
        if (LJJIJLIJ(str13)) {
            LJJLIL(str13, false, true, z);
            LJJLJLI(false, true, z);
        }
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI == null || (currentAweme = LJJIJIIJI.getCurrentAweme()) == null) {
            return;
        }
        final String aid = currentAweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return;
        }
        if (TextUtils.isEmpty(str13) && (LJJIJIIJI.LLLJ() == null || LJJIJIIJI.LLLJ().UU() != 2)) {
            str13 = aid;
        }
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(str13);
        if (viewHolderByAwemeId == null) {
            if (str13 != null && JAY.LIZJ.get(str13) != null && str13 != null) {
                currentAweme2 = JAY.LIZJ.get(str13);
            } else {
                return;
            }
        } else {
            currentAweme2 = viewHolderByAwemeId.getCurrentAweme();
        }
        if (currentAweme2 == null) {
            return;
        }
        if (viewHolderByAwemeId == null) {
            viewHolderByAwemeId = getViewHolderByAwemeId(currentAweme2.getAid());
        }
        if (this.LLJI != 0 && aid.equals(str13)) {
            this.LLJI = 0L;
            LJJJJL(str13);
            this.LLJZ.getClass();
        }
        Z9N z9n = Z9N.LIZIZ;
        z9n.LJLJJI(this.LJLIL, j - LJJJJI(str13), this.LJLJI, currentAweme2.getAid());
        if ((C1GE.LJIIIZ(this.LJLIL) && (activity = this.LJLIL) != null && activity.isFinishing() && !(this.LJLIL instanceof InterfaceC229748zy) && !z9n.LLLLLLLLLL(currentAweme2, this.LJLJI)) || C1DF.LJJIII(currentAweme2)) {
            return;
        }
        final String str14 = this.LJLJI;
        final String str15 = this.LJZI;
        final String str16 = this.LJLJJL;
        int i3 = this.LLIIJLIL;
        long j2 = this.LLIIIJ;
        long LJJJJI = LJJJJI(str13);
        if (LJJJJI == -1) {
            c36581c6 = null;
            r2 = 0;
            i = 2;
        } else {
            long j3 = j - LJJJJI;
            if (JIW.LIZJ(str14, C2S6.LIZ(LJJIIZ()).getPlaylistPreviousPage()) || TextUtils.equals(str14, "search_result")) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean LIZLLL = JIW.LIZLLL(str15, str14, C2S6.LIZ(LJJIIZ()).getPlaylistPreviousPage());
            final HashMap hashMap = new HashMap();
            if (z2 || LIZLLL) {
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC221168m8 LJLLLLLL = z9n.LJLLLLLL();
                hashMap.putAll(LJLLLLLL.LIZIZ(currentTimeMillis, j3));
                LIZ = LJLLLLLL.LIZ();
                LJ = LJLLLLLL.LJ();
                LJLLLLLL.LJFF();
            } else {
                LJ = j3;
                LIZ = 0;
            }
            if (z9n.LJLLL()) {
                if (currentAweme2.getVideo() != null) {
                    i2 = currentAweme2.getVideo().getDuration();
                } else {
                    i2 = 0;
                }
                z9n.LLJJIII(this.LJLIL, str14, currentAweme2.getGroupId(), LJJJJI, LIZ, LJ, Integer.valueOf(i2));
            }
            z9n.LJJLJ(LJ, currentAweme2.getAid());
            final double LJII = C47636Imm.LJII(2);
            final double d = LJII - this.LLJJIJIIJIL;
            final IDR LJJJ = LJJJ();
            final InterfaceC46330IGg LJJJJIZL = LJJJJIZL();
            if (j3 > 0) {
                if (LJJJ != null) {
                    str2 = LJJJ.getContentSource();
                    str3 = LJJJ.getLikeEnterMethod();
                    str4 = LJJJ.getPreviousPage();
                    str5 = C2S6.LIZ(LJJIIZ()).getPreviousPagePosition();
                    str6 = LJJJ.getTabName();
                    str7 = LJJJ.getPlayListIdKey();
                    str8 = LJJJ.getPlayListIdValue();
                    str9 = LJJJ.getPlayListType();
                    str10 = LJJJ.getParam().getChallengeId();
                    str11 = LJJJ.getParam().getParentTagId();
                } else {
                    str2 = "";
                    str3 = "";
                    str4 = "";
                    str5 = "";
                    str6 = "";
                    str7 = "";
                    str8 = "";
                    str9 = "";
                    str10 = "";
                    str11 = "";
                }
                if (!TextUtils.isEmpty(str13)) {
                    List<Long> list = this.LLLJIL.get(str13);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(Long.valueOf(j3));
                    this.LLLJIL.put(str13, list);
                }
                if (viewHolderByAwemeId instanceof IPhotosViewHolderType) {
                    IPhotosViewHolderType iPhotosViewHolderType = (IPhotosViewHolderType) viewHolderByAwemeId;
                    z5 = iPhotosViewHolderType.declineReport();
                    if (!z5) {
                        j3 = iPhotosViewHolderType.getSavedDuration();
                    } else {
                        iPhotosViewHolderType.saveDuration(j3);
                    }
                } else {
                    z5 = false;
                }
                if (LJJJ != null && (param = LJJJ.getParam()) != null) {
                    String searchId = param.getSearchId();
                    if (JIW.LIZLLL(this.LJZI, this.LJLJI, C2S6.LIZ(LJJIIZ()).getPlaylistPreviousPage()) && TextUtils.isEmpty(searchId)) {
                        searchId = C227768wm.LJIILL(9, currentAweme2);
                    }
                    if (!TextUtils.isEmpty(searchId)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("duration", String.valueOf(j3));
                        if (IG2.LIZ) {
                            str12 = "1";
                        } else {
                            str12 = CardStruct.IStatusCode.DEFAULT;
                        }
                        hashMap2.put("is_fullscreen", str12);
                        hashMap2.put("search_id", searchId);
                        Video video = currentAweme2.getVideo();
                        if (video != null) {
                            hashMap2.put("video_duration", String.valueOf(video.getDuration()));
                        }
                        String str17 = this.LJLJI;
                        String groupId = currentAweme2.getGroupId();
                        if ((groupId != null || (groupId = currentAweme2.getAid()) != null) && str17 != null) {
                            C86918Y9i.LIZJ(YG0.PLAY_TIME_REAL_TIME, str17, groupId, hashMap2);
                        }
                    }
                }
                idr = LJJJ;
                i = 2;
                long j4 = j3;
                r2 = 0;
                r2 = 0;
                final long j5 = j3;
                final String str18 = str13;
                final Aweme aweme = currentAweme2;
                final C2MA c2ma = viewHolderByAwemeId;
                c36581c6 = null;
                C10K.LIZIZ(new Callable() { // from class: X.J8C
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:285:0x078c  */
                    /* JADX WARN: Removed duplicated region for block: B:291:0x02f5  */
                    /* JADX WARN: Removed duplicated region for block: B:293:0x02fb  */
                    /* JADX WARN: Removed duplicated region for block: B:294:0x0300  */
                    /* JADX WARN: Removed duplicated region for block: B:295:0x0303  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x01d7  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0230  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0261  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0268  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0071  */
                    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v284, types: [X.8l2] */
                    /* JADX WARN: Type inference failed for: r2v310, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v340 */
                    /* JADX WARN: Type inference failed for: r2v346 */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 2317
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.J8C.call():java.lang.Object");
                    }
                }, FMX.LIZIZ(), null);
                if (C72083SQt.LJLILLLLZI(viewHolderByAwemeId) && (LJ2 = C46664ITc.LJIJ.LJ(str13)) != null) {
                    LJ2.blockTime = (int) j2;
                    LJ2.blockCnt = i3;
                    j3 = j4;
                    LJ2.playTime = (int) j3;
                } else {
                    j3 = j4;
                }
            } else {
                idr = LJJJ;
                c36581c6 = null;
                r2 = 0;
                i = 2;
            }
            MLCommonService.instance().onPlayStopCallPlayTime(currentAweme2, j3, this.LJLJI);
            if (SmartFeedPreloadService.instance().enable()) {
                if (C48559J3z.LJFF && idr != null && !idr.isResumed()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (SmartFeedPreloadService.getDebug() && idr != null && (idr instanceof BaseListFragmentPanel)) {
                    idr.getEventType();
                }
                if (!z3) {
                    SmartFeedPreloadService.instance().startSmartPreloadV2Judge(currentAweme2);
                }
            }
            if (SmartFeedAdUIService.instance().enable()) {
                if (idr != null && !idr.isResumed()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (SmartFeedAdUIService.getDebug() && idr != null && (idr instanceof BaseListFragmentPanel)) {
                    idr.getEventType();
                }
                if (!z4) {
                    SmartFeedAdUIService.instance().startSmartAdUIJudge(currentAweme2);
                }
            }
            if (((Boolean) IES.LIZ.getValue()).booleanValue()) {
                IFF iff = new IFF();
                iff.LJIIIIZZ = currentAweme2;
                C46687ITz c46687ITz = IE2.LIZ;
                if (c46687ITz == null) {
                    c46687ITz = IFR.LIZ;
                }
                AbstractC48510J2c LIZIZ = c46687ITz.LIZIZ(SmartPrerenderExperiment.SCENE);
                if (LIZIZ != null && LIZIZ.LIZLLL()) {
                    if (containsValue(currentAweme2.getAid())) {
                        LJIIIIZZ = get(currentAweme2.getAid());
                    } else {
                        LJIIIIZZ = LIZIZ.LJIIIIZZ(iff);
                        put(currentAweme2.getAid(), LJIIIIZZ);
                    }
                    if (LJIIIIZZ != null) {
                        String str19 = LJIIIIZZ.LIZ;
                        if (!TextUtils.isEmpty(str19)) {
                            C47242IgQ.LIZ().smartPreloadWeakNetBusinessEvent(str19);
                        }
                    }
                }
            }
        }
        final long LJJJJI2 = (j - LJJJJI(str13)) - this.LLIIIL;
        if (LJJJJI2 > 0) {
            final int i4 = this.LLIIJLIL;
            final long j6 = this.LLIIIJ;
            final Aweme aweme2 = currentAweme2;
            C10K.LIZIZ(new Callable() { // from class: X.IEp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i5;
                    IDP idp = IDP.this;
                    int i6 = i4;
                    long j7 = LJJJJI2;
                    long j8 = j6;
                    Aweme aweme3 = aweme2;
                    idp.getClass();
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("count_rate", Float.valueOf((i6 * 1000.0f) / ((float) j7)));
                    c198517qh.LIZ.put("duration_rate", Long.valueOf(j8 / j7));
                    c198517qh.LIZ.put("block_count", Integer.valueOf(i6));
                    c198517qh.LIZ.put("block_duration", Long.valueOf(j8));
                    C47483IkJ.LIZ(c198517qh);
                    c198517qh.LIZ.put("duration", Long.valueOf(j7));
                    if (aweme3.getVideo() != null) {
                        i5 = aweme3.getVideo().getDuration();
                    } else {
                        i5 = 0;
                    }
                    c198517qh.LIZ.put("video_duration", Integer.valueOf(i5));
                    c198517qh.LIZ.put("netType", C16880lQ.LLJILLL(idp.LJJIIZ()));
                    C8HX.LIZIZ("aweme_media_block_log1", "video_block", c198517qh.LJ());
                    return null;
                }
            }, FMX.LIZIZ(), c36581c6);
        }
        if (((Number) IEG.LIZ.getValue()).intValue() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.LLIIJLIL > 0 && this.LLIIIJ > 0) {
            if (z6 && z) {
                LJLLJ(true);
            }
            Session LJ3 = C46664ITc.LJIJ.LJ(str13);
            if (LJ3 != null) {
                INO.LIZJ.LIZ(LJ3.key);
            }
        }
        if (this.LLIIL > 0 && this.LLIILZL > 0) {
            if (z6 && z) {
                LJLLJ(r2);
            }
            Session LJ4 = C46664ITc.LJIJ.LJ(str13);
            if (LJ4 != null) {
                INO.LIZJ.LIZ(LJ4.key);
            }
        }
        if (!z6) {
            if (LJJIJLIJ(str13)) {
                if (C35704Dzo.LIZ() == 0) {
                    longValue = this.LLILII;
                } else if (1 == C35704Dzo.LIZ() && !TextUtils.isEmpty(str13)) {
                    if (!containsKey(str13)) {
                        longValue = this.LLILII;
                    } else {
                        longValue = get(str13).longValue();
                    }
                }
                if (longValue > 0) {
                    if (z) {
                        LJLLJ(true);
                    }
                    LJZI(str13, r2);
                    LJZL(str13, r2);
                }
            }
            if (this.LLIL && this.LLILIL > 0 && z) {
                LJLLJ(r2);
            }
        }
        LLFF(-1L, str13);
        this.LLJJIJIIJIL = C47636Imm.LJII(i);
        this.LLIIIZ = -1L;
        LLFZ(-1L, str13);
        LJZL(str13, r2);
        this.LLIIIJ = 0L;
        this.LLIIIL = 0L;
        this.LLIIJLIL = r2;
        this.LLIILZL = 0L;
        this.LLIIL = r2;
        this.LLIILII = -1L;
        LLF(0L, str13);
        this.LLILIL = 0L;
    }

    public final String LLIIJLIL(C2MA c2ma, Aweme aweme, boolean z) {
        return LLIIJI(aweme, z, c2ma, 0);
    }

    public final void LLIILZL(Runnable runnable, String str, String str2) {
        EnumC61792bf enumC61792bf;
        LJLJLJ(str);
        C56162Ii c56162Ii = new C56162Ii();
        c56162Ii.LIZ = "task_type_feed_on_idle";
        if (((Boolean) C46284IEm.LIZIZ.getValue()).booleanValue()) {
            enumC61792bf = EnumC61792bf.POST_AT_FONT;
        } else {
            enumC61792bf = EnumC61792bf.POST_MESSAGE;
        }
        if (enumC61792bf != null) {
            c56162Ii.LIZIZ = enumC61792bf;
        }
        c56162Ii.LIZJ = runnable;
        C2KN.LIZJ(c56162Ii);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        int LIZ;
        Aweme LJJIIZI = LJJIIZI();
        if (LJJLIIIJJI() && i == 100 && LJJIIZI != null && TextUtils.equals(str, LJJIIZI.getAid())) {
            C2MY.LIZ().LJ();
            C2MY.LIZ().LJFF(1);
            C51645KOr.LIZIZ.LJII(str);
        }
        IDR LJJJ = LJJJ();
        if (C35704Dzo.LJ()) {
            if (C44432HcC.LJLJI) {
                LIZ = ((Number) C35704Dzo.LJIIJJI.getValue()).intValue();
            } else {
                LIZ = C00F.LIZ(31744, 90, "player_prerender_buffered_percent", true);
            }
            if (i >= LIZ && LJJJ != null && !LJJJ.isScrollDragging()) {
                this.LLLLLJIL = -1;
                LLIIIJ(0, null, false, C35704Dzo.LJFF());
            }
        }
        C2U8.LIZ(new C46261IDp(LJJIIZI, i, LJJJ));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        if (1 != C35704Dzo.LIZ() || !TextUtils.equals(this.LLJLLIL, str)) {
            return;
        }
        LJJLJ(str, z, !iph.LJI);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH iph) {
        Session LJ = C46664ITc.LJIJ.LJ(ipg.LIZ);
        if (!TextUtils.isEmpty(ipg.LIZ)) {
            put(ipg.LIZ, Integer.valueOf(ipg.LJ));
        }
        if (LJ != null) {
            INO.LIZJ.LIZ(LJ.key);
        }
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(ipg.LIZ);
        LJJ(ipg, viewHolderByAwemeId, !iph.LJI);
        if (viewHolderByAwemeId != null && viewHolderByAwemeId.LLLJ() != null) {
            LJJJJIZL().LJJJZ();
        }
        if (this.LLJIJIL) {
            String str2 = ipg.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("source_id", str2);
            } catch (JSONException unused) {
            }
            C09900aA.LJIIJJI("aweme_screen_ad_open_media_error_rate", 1, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayProgressChange(java.lang.String r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onPlayProgressChange(java.lang.String, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0.LIZIZ.containsKey((java.lang.Object) r18) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        if (r13 < 0) goto L82;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayStop(java.lang.String r18, org.json.JSONObject r19, X.IPH r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.onPlayStop(java.lang.String, org.json.JSONObject, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        LJJL(new ARunnableS2S0202000_8(i, 1, str, jSONObject, 1));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeekStart, offset:");
        LIZ.append(i);
        LIZ.append(", progress:");
        LIZ.append(f);
        C36922EeM.LIZLLL(6, "PlayerController", X1D.LIZIZ(LIZ));
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI == null || LJJIJIIJI.LLLJ() == null) {
            return;
        }
        LJJIJIIJI.LLLJ().onSeekStart(str, i, f);
    }

    public final void LJJJJZI(Aweme aweme, boolean z, boolean z2, boolean z3) {
        boolean z4;
        IDR LJJJ = LJJJ();
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (C63081OpJ.LJLJLLL(aweme)) {
            String LJJIL = C63081OpJ.LJJIL(R.string.tob, aweme);
            C5S1 c5s1 = new C5S1(LJJIIZ());
            c5s1.LIZLLL(LJJIL);
            c5s1.LJ();
            return;
        }
        boolean z5 = false;
        if (LJJIJIIJI instanceof IE5) {
            if (((IE5) LJJIJIIJI).LJIJJ()) {
                if (LJJJ != null) {
                    LJJJ.hideIvPlay();
                    return;
                } else {
                    C36922EeM.LIZ(new IllegalStateException("listFragmentPanel is null!"));
                    return;
                }
            }
            if (!z) {
                return;
            }
            if (LJJJ != null) {
                LJJJ.showIvPlay();
                return;
            } else {
                C36922EeM.LIZ(new IllegalStateException("listFragmentPanel is null!"));
                return;
            }
        }
        if (LJJIJIIJI == null || LJJIJIIJI.LLLJ() == null || LJJIJIIJI.getCurrentAweme() != aweme || LJJLI(aweme) || !aweme.isSharedStoryVisible()) {
            if (LJJIIZ() != null && LJJLI(aweme)) {
                C5S1 c5s12 = new C5S1(LJJIIZ());
                c5s12.LIZJ(R.string.tme);
                c5s12.LJ();
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try to handlePlay, but can't meet the conditions, holder:");
            if (LJJIJIIJI == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZ.append(z4);
            LIZ.append(", player:");
            if (LJJIJIIJI == null || LJJIJIIJI.LLLJ() == null) {
                z5 = true;
            }
            LIZ.append(z5);
            C36922EeM.LJFF(new IllegalStateException(X1D.LIZIZ(LIZ)));
            return;
        }
        UgAllServiceImpl.LIZ().LJFF();
        M89 LIZ2 = C2S6.LIZ(LJJIIZ());
        if (aweme.getVideo() != null || aweme.isLive()) {
            int i = this.LLILLIZIL.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("current play status:");
            LIZ3.append(i);
            C36922EeM.LIZLLL(3, "PlayerController", X1D.LIZIZ(LIZ3));
            if (z3 || i == 2 || (C2M9.LIZ() && i == 1)) {
                if (!aweme.isLive()) {
                    LJJIIZ();
                    FMX.LJII("click", 0L, "video_pause", aweme.getAid());
                    if (!z3) {
                        J8I j8i = new J8I();
                        j8i.LJJLIIIJJIZ = "click";
                        j8i.LJJIIZ(this.LJLJJI, aweme);
                        j8i.LJJL = this.LJLJI;
                        j8i.LJJJZ = C2KM.LIZ(LIZ2.getPreviousPage(), LIZ2.getFromGroupId());
                        j8i.LJIILIIL();
                    }
                    LJJJJIZL().LJIILJJIL();
                    if (z) {
                        if (LJJJ != null) {
                            LJJJ.showIvPlay();
                        } else {
                            C36922EeM.LIZ(new IllegalStateException("listFragmentPanel is null!"));
                        }
                    }
                    C56692Kj LIZ4 = C56692Kj.LIZ();
                    InterfaceC56552Jv interfaceC56552Jv = LIZ4.LIZ;
                    if (interfaceC56552Jv != null) {
                        interfaceC56552Jv.LIZ();
                    }
                    InterfaceC56552Jv interfaceC56552Jv2 = LIZ4.LIZIZ;
                    if (interfaceC56552Jv2 != null) {
                        interfaceC56552Jv2.LIZ();
                    }
                    C2U8.LIZ(new C46288IEq(LJJIIZI(), this.LJLJI, 1, LJJJ, z3));
                    return;
                }
                C36922EeM.LIZLLL(6, "PlayerController", "aweme is live aweme,maybe is bug?");
                return;
            }
            if (i == 3) {
                LJJIIZ();
                FMX.LJII("click", 0L, "video_play", aweme.getAid());
                if (aweme.isLive()) {
                    C56692Kj LIZ5 = C56692Kj.LIZ();
                    LJJIJIIJI.LLLJ().getSurface();
                    LIZ5.getClass();
                    C56692Kj LIZ6 = C56692Kj.LIZ();
                    aweme.getAid();
                    aweme.getStreamUrlModel();
                    LIZ6.getClass();
                    LJJJJIZL().LJIILJJIL();
                } else {
                    if (aweme.getVideo().getProperPlayAddr() == null) {
                        C36922EeM.LIZ(new IllegalStateException("try resume play,but model is null"));
                        return;
                    }
                    LJLLLL(0, aweme);
                }
                if (LJJJ != null) {
                    LJJJ.hideIvPlay();
                    return;
                } else {
                    C36922EeM.LIZ(new IllegalStateException("listFragmentPanel is null!"));
                    return;
                }
            }
            if (i == 0 && LJJJ != null && LJJJ.isIvPlayVisible()) {
                LLIIJLIL(null, LJJJ.getCurrentAweme(), true);
                LJJJ.hideIvPlay();
                return;
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("status:");
            LIZ7.append(i);
            LIZ7.append(",don't know how to do in this situation");
            C36922EeM.LIZLLL(6, "PlayerController", X1D.LIZIZ(LIZ7));
        }
    }

    public final void LJJLIL(String str, boolean z, boolean z2, boolean z3) {
        Object valueOf;
        int i;
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        if (z) {
            LJZL(str, !LJJIZ(str));
            this.LLF = System.currentTimeMillis();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBuffering_2 cur_id:");
        YE1.LIZLLL(LIZ, this.LLJLLIL, ", souce_id: ", str, ", buferring_start: ");
        LIZ.append(z);
        LIZ.append(", is_rendered: ");
        LIZ.append(LJJIZ(str));
        LIZ.append(", is_first_buffering: ");
        LIZ.append(LJJIL(str));
        LIZ.append(", start_t: ");
        if (z) {
            valueOf = "N/A";
        } else {
            valueOf = Long.valueOf(LJJJJLL(str));
        }
        LIZ.append(valueOf);
        X1D.LIZIZ(LIZ);
        if (!LJJIZ(str)) {
            return;
        }
        if (!z && LJJIL(str) && (!C44432HcC.LJLJI ? E01.LIZ == 1 : C35704Dzo.LJIIL)) {
            LLFZ(LJJIJL(str), str);
        }
        IDR LJJJ = LJJJ();
        if (!C72083SQt.LJLILLLLZI(LJJIJIIJI())) {
            return;
        }
        int i2 = C2LW.LIZ;
        if (!C44432HcC.LJLJI ? E01.LIZ == 1 : C35704Dzo.LJIIL) {
            i = InterfaceC46269IDx.LIZ;
        } else {
            i = 0;
        }
        if (z) {
            LLF(SystemClock.elapsedRealtime(), str);
            this.LLIIJLIL++;
            if (LJJJJLL(str) == -1) {
                LLFZ(SystemClock.elapsedRealtime(), str);
            }
            C35732E0q c35732E0q = this.LLJJ;
            if (c35732E0q != null) {
                c35732E0q.dispose();
                this.LLJJ = null;
            }
            C73454SsE LJJJ2 = AbstractC73672Svk.LJJLIIIJLJLI(i, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ());
            C35732E0q c35732E0q2 = new C35732E0q(LJJJ);
            LJJJ2.LIZ(c35732E0q2);
            this.LLJJ = c35732E0q2;
            if (SharePrefCache.inst().getShowPlayerInfoUI().LIZ().booleanValue()) {
                ((InterfaceC2302291u) ServiceManager.get().getService(InterfaceC2302291u.class)).LJJJJIZL();
            }
        } else {
            if (LJJJJLL(str) != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - LJJJJLL(str);
                this.LLIIIJ += elapsedRealtime;
                if (!z2 && elapsedRealtime >= i2) {
                    if (z3) {
                        LJLLJ(true);
                    }
                    LLFZ(-1L, str);
                }
                if (SharePrefCache.inst().getShowPlayerInfoUI().LIZ().booleanValue()) {
                    ((InterfaceC2302291u) ServiceManager.get().getService(InterfaceC2302291u.class)).LJJJJ();
                }
            }
            if (!z2) {
                LLF(0L, str);
                LJZI(str, false);
                LJZL(str, false);
            }
            C35732E0q c35732E0q3 = this.LLJJ;
            if (c35732E0q3 != null) {
                c35732E0q3.dispose();
                this.LLJJ = null;
            }
            if (LJJJ != null) {
                LJJJ.stopLineProgressBarAnimation();
            }
        }
        LJZ(new C46276IEe((Object) null));
        IH1 LIZJ = IH1.LIZJ();
        LIZJ.getClass();
        if (!IH1.LJFF.enablePreload || str == null || str.length() == 0 || (iDHandlerS21S0100000_8 = LIZJ.LIZLLL) == null || (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(4, str)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIL(X.IT4 r29, long r30, long r32, long r34) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LJLIIL(X.IT4, long, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a0, code lost:
    
        if (X.C46728IVo.LJIIJ(r14) != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(int r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LLIIIJ(int, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0223, code lost:
    
        if (r11 == 0) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LLIIJI(com.ss.android.ugc.aweme.feed.model.Aweme r29, boolean r30, X.C2MA r31, int r32) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IDP.LLIIJI(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, X.2MA, int):java.lang.String");
    }

    public final void LLIIL(Aweme aweme, Surface surface, boolean z, boolean z2, C2067689o c2067689o) {
        Audio.InfoIdType infoIdType;
        C9K4.LIZIZ("tryPreparePlay", C78996UzQ.LJIIL(aweme));
        if (C63081OpJ.LJLJI(aweme) || surface == null || !surface.isValid() || aweme.isLive()) {
            return;
        }
        Video video = aweme.getVideo();
        Audio audio = aweme.getAudio();
        if (video == null || aweme.getVideo().getProperPlayAddr() == null) {
            return;
        }
        video.setRationAndSourceId(aweme.getAid());
        LJJJZ(aweme, video);
        C46744IWe c46744IWe = new C46744IWe();
        SimVideo LJJJJ = C51029K0z.LJJJJ(video);
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LJJJJ;
        c46745IWf.LJIILIIL = surface;
        boolean isNeedSetCookie = video.isNeedSetCookie();
        C46745IWf c46745IWf2 = c46744IWe.LIZ;
        c46745IWf2.LJIJJLI = isNeedSetCookie;
        c46745IWf2.LJJJJI = z;
        c46745IWf2.LJJJJIZL = z2;
        c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, audio);
        C2MA viewHolderByAwemeId = getViewHolderByAwemeId(aweme.getAid());
        if (viewHolderByAwemeId != null) {
            if (viewHolderByAwemeId.f9()) {
                infoIdType = Audio.InfoIdType.TRANSLATED;
            } else {
                infoIdType = Audio.InfoIdType.ORIGINAL;
            }
            c46744IWe.LIZ.LJ = infoIdType.getInfoId();
        }
        c46744IWe.LIZLLL(video.getVideoAdTag());
        boolean z3 = false;
        c46744IWe.LIZ.LJJJJL = false;
        int LIZ = (int) J8M.LIZ(aweme, this.LJLJI);
        C46745IWf c46745IWf3 = c46744IWe.LIZ;
        c46745IWf3.LJIIJ = LIZ;
        c46745IWf3.LIZ = this;
        if (LJJLIIIJJI() && aweme.getVideo().isLongVideo()) {
            FFL.LJIIIZ().getClass();
            float LJIIIIZZ = FFL.LJIIIIZZ(31744, "long_video_default_playback_rate", 1.0f);
            C46745IWf c46745IWf4 = c46744IWe.LIZ;
            c46745IWf4.LJJIFFI = LJIIIIZZ;
            c46745IWf4.LJJII = true;
        }
        C86951YAp c86951YAp = C86951YAp.LIZIZ;
        if (c86951YAp.LJ() && this.LJLJI.equals("offline_mode_page")) {
            c46744IWe.LIZ.LJJLIIJ = c86951YAp.LIZIZ();
        }
        C46259IDn LIZ2 = IQ6.LIZ(aweme, Integer.valueOf(this.LJLJJI), null);
        if (LIZ2 != null) {
            int i = LIZ2.LIZ;
            C46745IWf c46745IWf5 = c46744IWe.LIZ;
            c46745IWf5.LJJJI = i;
            c46745IWf5.LJJJ = true;
            c46745IWf5.LJJJIL = LIZ2.LIZIZ;
            c46745IWf5.LJJIZ = LIZ2.LIZJ;
            c46745IWf5.LJJJJ = LIZ2.LIZLLL;
        }
        if (c2067689o != null) {
            c46744IWe.LIZ.LJIILJJIL = true;
        }
        if (LJJLIIIJILLIZJL(aweme)) {
            C46745IWf c46745IWf6 = c46744IWe.LIZ;
            c46745IWf6.LJIILIIL = null;
            c46745IWf6.LJJJJZ = false;
        }
        C2MA LJJIJIIJI = LJJIJIIJI();
        if (LJJIJIIJI != null && LJJIJIIJI.LLLJ() != null) {
            z3 = LJJIJIIJI.LLLJ().Jk0();
        }
        c46744IWe.LIZ.LJJLIIIJILLIZJL = z3;
        LJJJJIZL().LJIIJ(c46744IWe.LIZ());
    }
}
