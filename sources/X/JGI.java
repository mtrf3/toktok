package X;

import X.C48891JGt;
import X.JGI;
import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.a1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JGI extends C47689Ind implements OnUIPlayListener, InterfaceC48907JHj {
    public static final C62822Ol8 LLIILII = C221108m2.LIZIZ(J2S.LJLIL);
    public JGS LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public OnUIPlayListener LJLLI;
    public JGK LJLLILLLL;
    public InterfaceC48907JHj LJLLJ;
    public InterfaceC48907JHj LJLLL;
    public String LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public boolean LJLZ;
    public final C62822Ol8 LJZ;
    public InterfaceC46826IZi LJZI;
    public Integer LJZL;
    public JGN LL;
    public final C62822Ol8 LLD;
    public boolean LLF;
    public boolean LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public long LLIIII;
    public JGL LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public boolean LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public N69 LLIIJLIL;
    public JMD LLIIL;

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.C47689Ind, X.InterfaceC47678InS
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C48690J9a.LIZ();
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
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
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
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
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
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
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
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
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
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public void setAutoPlay(boolean z) {
    }

    private final IAdSceneService getAdSceneService() {
        return (IAdSceneService) this.LLIIIJ.getValue();
    }

    private final JGO getSearchAdVideoPlayerDepend() {
        return (JGO) this.LLIIIL.getValue();
    }

    private final JGR getSearchAdVideoPlayerSceneCallBack() {
        return (JGR) this.LLIIJI.getValue();
    }

    public final C48881JGj getDataProvider() {
        return (C48881JGj) this.LJLLLLLL.getValue();
    }

    public final C46331IGh getMPlayVideoHelper() {
        return (C46331IGh) this.LLD.getValue();
    }

    public final InterfaceC47247IgV getSurfaceHolder() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-surfaceHolder>(...)");
        return (InterfaceC47247IgV) value;
    }

    public final InterfaceC47667InH getVideoSurfaceLifecycleListener() {
        return (InterfaceC47667InH) this.LLII.getValue();
    }

    private final JIB getMContainerStatusProvider() {
        return getDataProvider().LJII;
    }

    private final boolean getMIsAttached() {
        return getDataProvider().LIZIZ;
    }

    private final C56462Jm getMPlayStateHelper() {
        return (C56462Jm) getDataProvider().LJFF.getValue();
    }

    private final JGU getMPlayVideoObserver() {
        return getDataProvider().LJI;
    }

    public final void LJIIJ() {
        if (!EarphonePlayerControl.LJII().LIZIZ()) {
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
        if (LIZIZ == null) {
            return;
        }
        EarphonePlayerControl.LJII().LJI(LIZIZ, new C48799JDf(this));
    }

    public final void LJIIL() {
        try {
            SimVideoUrlModel LIZLLL = C46728IVo.LIZLLL(getMAweme());
            if (LIZLLL != null) {
                C47242IgQ.LIZ().cancelPreload(LIZLLL);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void LJIILIIL() {
        IWH iwh;
        IWH LJJIJIL;
        IWH iwh2;
        String str;
        IWH LJJIJIL2;
        IWH iwh3;
        String str2;
        IWH LJJIJIL3;
        if (!C49092JOm.LIZ()) {
            return;
        }
        InterfaceC46826IZi interfaceC46826IZi = this.LJZI;
        String str3 = null;
        if (interfaceC46826IZi != null) {
            InterfaceC46330IGg mPlayer = getMPlayer();
            if (mPlayer != null && (LJJIJIL3 = mPlayer.LJJIJIL()) != null) {
                LJJIJIL3.LJJLIIIJJIZ(this.LJZI);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubInfoListener：");
            InterfaceC46330IGg mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                iwh3 = mPlayer2.LJJIJIL();
            } else {
                iwh3 = null;
            }
            LIZ.append(iwh3);
            LIZ.append(", awemeId: ");
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str2 = mAweme.getAid();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            LIZ.append(", data:");
            LIZ.append(interfaceC46826IZi);
            X1D.LIZIZ(LIZ);
        }
        JGN jgn = this.LL;
        if (jgn != null) {
            InterfaceC46330IGg mPlayer3 = getMPlayer();
            if (mPlayer3 != null && (LJJIJIL2 = mPlayer3.LJJIJIL()) != null) {
                LJJIJIL2.LJJLIIIJ(jgn.LJLIL, jgn.LJLILLLLZI);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addSubtitleLanguage：");
            InterfaceC46330IGg mPlayer4 = getMPlayer();
            if (mPlayer4 != null) {
                iwh2 = mPlayer4.LJJIJIL();
            } else {
                iwh2 = null;
            }
            LIZ2.append(iwh2);
            LIZ2.append(", awemeId: ");
            Aweme mAweme2 = getMAweme();
            if (mAweme2 != null) {
                str = mAweme2.getAid();
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append(", data:");
            LIZ2.append(jgn);
            X1D.LIZIZ(LIZ2);
        }
        Integer num = this.LJZL;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC46330IGg mPlayer5 = getMPlayer();
            if (mPlayer5 != null && (LJJIJIL = mPlayer5.LJJIJIL()) != null) {
                LJJIJIL.LJJLIIIJLLLLLLLZ(intValue);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("switchSubtitlesLaunage: ");
            InterfaceC46330IGg mPlayer6 = getMPlayer();
            if (mPlayer6 != null) {
                iwh = mPlayer6.LJJIJIL();
            } else {
                iwh = null;
            }
            LIZ3.append(iwh);
            LIZ3.append(", awemeId: ");
            Aweme mAweme3 = getMAweme();
            if (mAweme3 != null) {
                str3 = mAweme3.getAid();
            }
            LIZ3.append(str3);
            LIZ3.append(", data:");
            LIZ3.append(intValue);
            X1D.LIZIZ(LIZ3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (android.text.TextUtils.equals(r1, r0.LJJJJLI().getSourceId()) == false) goto L4;
     */
    @Override // X.InterfaceC48907JHj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getMAweme()
            if (r0 != 0) goto L15
        L6:
            X.JHj r0 = r2.LJLLJ
            if (r0 == 0) goto Ld
            r0.LJIILL()
        Ld:
            X.JHj r0 = r2.LJLLL
            if (r0 == 0) goto L14
            r0.LJIILL()
        L14:
            return
        L15:
            X.IGg r0 = r2.getMPlayer()
            if (r0 == 0) goto L40
            X.IGg r0 = r2.getMPlayer()
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.LJJJJLI()
            if (r0 == 0) goto L40
            java.lang.String r1 = r2.LJLLLL
            X.IGg r0 = r2.getMPlayer()
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.LJJJJLI()
            java.lang.String r0 = r0.getSourceId()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L40
            goto L6
        L40:
            X.IGh r1 = r2.getMPlayVideoHelper()
            r0 = 1
            r1.LJFF = r0
            X.IGg r0 = r1.LJI
            if (r0 == 0) goto L6
            r0.LLLLLL()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGI.LJIILL():void");
    }

    public final void LJIIZILJ() {
        Integer num;
        String str;
        InterfaceC58799N5v LLLZIIL;
        InterfaceC58799N5v LLLZIIL2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pauseVideo ");
        LIZ.append(C16880lQ.LJLLJ(JGI.class));
        LIZ.append('@');
        LIZ.append(Integer.valueOf(hashCode()));
        LIZ.append(", player@");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", aid: ");
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
        if (LJII.LIZIZ()) {
            LJII.LJ("search_video_card", false);
        }
        if (getMAweme() == null) {
            return;
        }
        if (getMPlayer() != null) {
            InterfaceC46330IGg mPlayer2 = getMPlayer();
            o.LJI(mPlayer2);
            if (mPlayer2.LJJJJLI() != null) {
                String str2 = this.LJLLLL;
                InterfaceC46330IGg mPlayer3 = getMPlayer();
                o.LJI(mPlayer3);
                if (!TextUtils.equals(str2, mPlayer3.LJJJJLI().getSourceId())) {
                    return;
                }
            }
        }
        if (C46586IQc.LIZIZ() != null) {
            C46586IQc.LIZJ(null);
            C46586IQc.LIZJ = true;
        }
        if (isPlaying()) {
            JGK jgk = this.LJLLILLLL;
            if (jgk != null) {
                jgk.LLLLLJLJLL();
            }
            JMD jmd = this.LLIIL;
            if (jmd != null && (LLLZIIL2 = jmd.LLLZIIL()) != null) {
                LLLZIIL2.o5();
            }
            N69 n69 = this.LLIIJLIL;
            if (n69 != null && (LLLZIIL = n69.LLLZIIL()) != null) {
                LLLZIIL.o5();
            }
        }
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        mPlayVideoHelper.LJFF = 1;
        InterfaceC46330IGg interfaceC46330IGg = mPlayVideoHelper.LJI;
        if (interfaceC46330IGg != null) {
            interfaceC46330IGg.LJIILJJIL();
        }
        if (((Number) C48877JGf.LJLJLJ.getValue()).intValue() != 1 || !C46442IKo.LIZ()) {
            VideoPreloadManager.LJIILJJIL().cancelAll();
        }
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.LJJJJL();
        }
    }

    public final void LJIJ() {
        Aweme mAweme;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        if (!C49092JOm.LIZ() || (mAweme = getMAweme()) == null || (video = mAweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            if (getMPlayVideoHelper().LJI == null) {
                getDataProvider().LJ();
            }
            try {
                getMPlayVideoHelper().LJ();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return getDataProvider().LIZ;
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        int i;
        InterfaceC46330IGg interfaceC46330IGg = getMPlayVideoHelper().LJI;
        boolean z = true;
        if (interfaceC46330IGg == null || !interfaceC46330IGg.isPlaying() || ((i = getMPlayVideoHelper().LJFF) != 2 && i != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "search_separate_tab_lynx") != false) goto L28;
     */
    @Override // X.InterfaceC48907JHj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJIL() {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGI.LLLJIL():void");
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        Aweme mAweme;
        InterfaceC46330IGg mPlayer;
        LJIIZILJ();
        if (this.LLF && (mPlayer = getMPlayer()) != null) {
            mPlayer.LJJJZ();
        }
        InterfaceC48907JHj interfaceC48907JHj = this.LJLLJ;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.LLLLLJLJLL();
        }
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLLL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.LLLLLJLJLL();
        }
        if (isPlaying() && (mAweme = getMAweme()) != null && mAweme.isAd() && NPC.LJIIIIZZ()) {
            JGL jgl = this.LLIIIILZ;
            if (jgl != null) {
                jgl.LLLLIIIILLL(this.LJLJLJ);
            }
            this.LJLJLJ = false;
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        if (getDataProvider().LIZLLL) {
            getDataProvider().LIZLLL = false;
            return;
        }
        LLLLLJLJLL();
        InterfaceC48907JHj interfaceC48907JHj = this.LJLLJ;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.contextPause();
        }
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLLL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.contextPause();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        Integer num;
        long j;
        String str;
        String str2;
        SimVideoUrlModel LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onDestroy");
        X1D.LIZIZ(LIZ);
        if (getMAweme() != null) {
            this.LLIIII = getMPlayVideoHelper().LIZLLL();
            LLLLLJLJLL();
            if (getMPlayer() != null && getMAweme() != null && (LIZLLL = C46728IVo.LIZLLL(getMAweme())) != null) {
                C47242IgQ.LIZ().cancelPreload(LIZLLL);
            }
            if (getMPlayer() != null) {
                IQS iqs = IQT.LIZ;
                InterfaceC46330IGg mPlayer2 = getMPlayer();
                iqs.getClass();
                if (mPlayer2 != null) {
                    mPlayer2.LJJIIZ();
                    try {
                        mPlayer2.release();
                        ((LinkedList) iqs.LIZ).remove(mPlayer2);
                    } catch (Exception unused) {
                    }
                }
                getMPlayVideoHelper().LIZJ();
                setMPlayer(null);
            }
            JGL jgl = this.LLIIIILZ;
            if (jgl != null) {
                jgl.onDestroy();
            }
            C48881JGj dataProvider = getDataProvider();
            C48880JGi LJI = getDataProvider().LJI();
            if (LJI != null) {
                j = LJI.LIZJ;
            } else {
                j = -1;
            }
            dataProvider.LJJIJIL = j;
            if (getMAweme() != null) {
                JGY jgy = JGX.LIZ;
                JIB mContainerStatusProvider = getMContainerStatusProvider();
                if (mContainerStatusProvider != null) {
                    str = mContainerStatusProvider.getIdentifier();
                } else {
                    str = null;
                }
                Aweme mAweme = getMAweme();
                o.LJI(mAweme);
                String LIZ2 = C48880JGi.LIZ(str, mAweme.getAid());
                if (!((HashMap) jgy.LIZ).isEmpty()) {
                    ((HashMap) jgy.LIZ).remove(LIZ2);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("removePlayShareInfo ");
                JIB mContainerStatusProvider2 = getMContainerStatusProvider();
                if (mContainerStatusProvider2 != null) {
                    str2 = mContainerStatusProvider2.getIdentifier();
                } else {
                    str2 = null;
                }
                Aweme mAweme2 = getMAweme();
                o.LJI(mAweme2);
                LIZ3.append(C48880JGi.LIZ(str2, mAweme2.getAid()));
                LIZ3.append("; ");
                LIZ3.append(android.util.Log.getStackTraceString(new Throwable()));
                X1D.LIZIZ(LIZ3);
            }
            if (C49092JOm.LIZ()) {
                this.LJZI = null;
                this.LL = null;
                this.LJZL = null;
                getDataProvider().LJJIIZ = null;
            }
        }
        InterfaceC48907JHj interfaceC48907JHj = this.LJLLJ;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.g9();
        }
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLLL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.g9();
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.g9();
        }
    }

    public final Aweme getMAweme() {
        return getDataProvider().LIZJ;
    }

    public final InterfaceC46330IGg getMPlayer() {
        return getDataProvider().LJIILIIL;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        InterfaceC46330IGg interfaceC46330IGg = getMPlayVideoHelper().LJI;
        if (interfaceC46330IGg == null || !interfaceC46330IGg.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.C47689Ind, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMIsAttached(true);
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.onAttachedToWindow();
        }
        if (!C48873JGb.LIZ()) {
            return;
        }
        ((HashSet) LLIILII.getValue()).add(this);
    }

    @Override // X.C47689Ind, android.view.View
    public final void onDetachedFromWindow() {
        C48883JGl c48883JGl;
        if (C48873JGb.LIZ()) {
            ((HashSet) LLIILII.getValue()).remove(this);
        }
        if (getDataProvider().LJIIJJI) {
            super.onDetachedFromWindow();
            setMIsAttached(false);
            Aweme mAweme = getMAweme();
            if (mAweme != null && mAweme.isAd()) {
                this.LLIIIZ = true;
            }
            if (getDataProvider().LJIIL && (c48883JGl = getDataProvider().LJIIJ) != null) {
                c48883JGl.onDestroy();
            }
            JGL jgl = this.LLIIIILZ;
            if (jgl != null) {
                jgl.onDetachedFromWindow();
            }
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final long getCurrentPosition() {
        return this.LLIIII;
    }

    public final boolean getEnableProgressCallback() {
        return this.LLF;
    }

    public final boolean getFillHeight() {
        return this.LLFF;
    }

    public final int getFitType() {
        return this.LLFFF;
    }

    public final boolean getMEverFullScreen() {
        return this.LJLJLLL;
    }

    public final boolean getMIsContainerPaused() {
        return this.LJLL;
    }

    public final InterfaceC48907JHj getMPlayerMobListener() {
        return this.LJLLL;
    }

    public final InterfaceC48907JHj getMPlayerViewListener() {
        return this.LJLLJ;
    }

    public final JGS getMSearchAdViewCallBack() {
        return this.LJLJL;
    }

    public final JGK getMVideoMobListener() {
        return this.LJLLILLLL;
    }

    public final OnUIPlayListener getMVideoViewListener() {
        return this.LJLLI;
    }

    public final boolean getMute() {
        return this.LLFZ;
    }

    public final boolean getRepeat() {
        return this.LLFII;
    }

    public final String getSourceId() {
        return this.LJLLLL;
    }

    private final void setMIsAttached(boolean z) {
        getDataProvider().LIZIZ = z;
    }

    private final void setMPlayVideoObserver(JGU jgu) {
        getDataProvider().LJI = jgu;
    }

    public final void LJIIJJI(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        setVisibility(0);
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        mPlayVideoHelper.getClass();
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                mPlayVideoHelper.LIZIZ = aweme;
                mPlayVideoHelper.LIZ = aweme.getForwardItem();
            } else {
                mPlayVideoHelper.LIZIZ = null;
                mPlayVideoHelper.LIZ = aweme;
            }
        }
        setMAweme(aweme);
        HashMap<String, Object> hashMap = new HashMap<>();
        JQA jqa = getDataProvider().LJIJJLI;
        if (jqa == null || (str = jqa.LJFF) == null) {
            str = "";
        }
        hashMap.put("enter_from", str);
        hashMap.put("is_fullscreen", 0);
        getMPlayVideoHelper().LJII = hashMap;
        C56462Jm mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null) {
            mPlayStateHelper.LIZ = 0;
        }
        this.LJLJLLL = false;
        this.LLIIIILZ = null;
        if (aweme != null && aweme.isAd() && !C46278IEg.LIZ() && getAdSceneService() != null) {
            this.LLIIIILZ = getAdSceneService().LJ();
            getSearchAdVideoPlayerDepend().LIZ = getSearchAdVideoPlayerSceneCallBack();
            getSearchAdVideoPlayerDepend().LIZJ = aweme;
            JGO searchAdVideoPlayerDepend = getSearchAdVideoPlayerDepend();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            searchAdVideoPlayerDepend.LIZIZ = awemeRawAd;
            getSearchAdVideoPlayerDepend().LIZLLL = getContext();
            JGL jgl = this.LLIIIILZ;
            if (jgl != null) {
                jgl.init(getSearchAdVideoPlayerDepend());
            }
        }
        if (!C49092JOm.LIZ()) {
            return;
        }
        this.LJZI = null;
        this.LL = null;
        this.LJZL = null;
        getDataProvider().LJJIIZ = null;
    }

    public final boolean LJIILLIIL(String str) {
        String str2;
        if (getMAweme() != null) {
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str2 = mAweme.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onBuffering: start=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onDecoderBuffering: start=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Integer num;
        InterfaceC46330IGg mPlayer;
        if (!LJIILLIIL(str)) {
            return;
        }
        C56462Jm mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null && mPlayStateHelper.LIZ == 3) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPausePlay ");
        LIZ.append(C16880lQ.LJLLJ(JGI.class));
        LIZ.append('@');
        LIZ.append(Integer.valueOf(hashCode()));
        LIZ.append(", player@");
        InterfaceC46330IGg mPlayer2 = getMPlayer();
        String str2 = null;
        if (mPlayer2 != null) {
            num = Integer.valueOf(mPlayer2.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", sourceId: ");
        LIZ.append(str);
        LIZ.append(", aweme=");
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            str2 = mAweme.getDesc();
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        C56462Jm mPlayStateHelper2 = getMPlayStateHelper();
        if (mPlayStateHelper2 != null) {
            mPlayStateHelper2.LIZ = 3;
        }
        if (this.LLF && (mPlayer = getMPlayer()) != null) {
            mPlayer.LJJJZ();
        }
        setKeepScreenOn(false);
        JGU mPlayVideoObserver = getMPlayVideoObserver();
        if (mPlayVideoObserver != null) {
            mPlayVideoObserver.LJJJLZIJ();
        }
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Integer num;
        C48883JGl c48883JGl;
        InterfaceC58799N5v LLLZIIL;
        InterfaceC58799N5v LLLZIIL2;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayCompleted: sourceId=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayCompleted(str);
        }
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.LJJJ();
        }
        JMD jmd = this.LLIIL;
        if (jmd != null && (LLLZIIL2 = jmd.LLLZIIL()) != null) {
            LLLZIIL2.c();
        }
        N69 n69 = this.LLIIJLIL;
        if (n69 != null && (LLLZIIL = n69.LLLZIIL()) != null) {
            LLLZIIL.c();
        }
        if (!this.LLFII && (c48883JGl = getDataProvider().LJIIJ) != null) {
            c48883JGl.LLLLLJLJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayCompleteFirstTime: sourceId=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayCompletedFirstTime(str);
        }
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.LLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG error) {
        Integer num;
        o.LJIIIZ(error, "error");
        if (!LJIILLIIL(error.LIZ)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayFailed: error=");
        LIZ.append(error);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(error);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayFailed(error);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        Integer num2 = null;
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") Player(");
        InterfaceC46330IGg mPlayer2 = getMPlayer();
        if (mPlayer2 != null) {
            num2 = Integer.valueOf(mPlayer2.hashCode());
        }
        LIZ.append(num2);
        LIZ.append(") onPlayPrepare: sourceId=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayStop: sourceId=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayStop(str);
        }
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlaying ");
        LIZ.append(C16880lQ.LJLLJ(JGI.class));
        LIZ.append('@');
        LIZ.append(Integer.valueOf(hashCode()));
        LIZ.append(", player@");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", sourceId: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPreparePlay: sourceId=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C56462Jm mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null) {
            mPlayStateHelper.LIZ = 1;
        }
        this.LJLLLL = str;
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(str);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPreparePlay(str);
        }
        LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "search_separate_tab_lynx") != false) goto L17;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRenderFirstFrame(X.IT4 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r2 = r5.getId()
            boolean r0 = r4.LJIILLIIL(r2)
            if (r0 != 0) goto L10
            return
        L10:
            int r1 = r4.getWindowVisibility()
            r0 = 8
            r3 = 0
            if (r1 != r0) goto L45
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getMAweme()
            if (r0 == 0) goto L43
            java.lang.String r1 = r0.getSearchFeedType()
        L23:
            java.lang.String r0 = "search_horizontal_tab_lynx"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L3d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getMAweme()
            if (r0 == 0) goto L41
            java.lang.String r1 = r0.getSearchFeedType()
        L35:
            java.lang.String r0 = "search_separate_tab_lynx"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L45
        L3d:
            r4.LLLLLJLJLL()
            return
        L41:
            r1 = r3
            goto L35
        L43:
            r1 = r3
            goto L23
        L45:
            X.I8x r0 = X.EnumC46139I8x.INSTANCE
            r0.setVideoId(r2)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Player("
            r1.append(r0)
            X.IGg r0 = r4.getMPlayer()
            if (r0 == 0) goto L61
            int r0 = r0.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L61:
            r1.append(r3)
            java.lang.String r0 = ") onRenderFirstFrame: sourceId="
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            boolean r0 = r4.LLF
            if (r0 == 0) goto L7c
            X.IGg r0 = r4.getMPlayer()
            if (r0 == 0) goto L7c
            r0.LJJJLIIL()
        L7c:
            X.IGg r1 = r4.getMPlayer()
            if (r1 == 0) goto L87
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.LJFF(r0)
        L87:
            com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r0 = r4.LJLLI
            if (r0 == 0) goto L8e
            r0.onRenderFirstFrame(r5)
        L8e:
            X.JGK r0 = r4.LJLLILLLL
            if (r0 == 0) goto L95
            r0.onRenderFirstFrame(r5)
        L95:
            X.JMD r0 = r4.LLIIL
            if (r0 == 0) goto La2
            X.N5v r0 = r0.LLLZIIL()
            if (r0 == 0) goto La2
            r0.LJIIIZ()
        La2:
            X.N69 r0 = r4.LLIIJLIL
            if (r0 == 0) goto Laf
            X.N5v r0 = r0.LLLZIIL()
            if (r0 == 0) goto Laf
            r0.LJIIIZ()
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGI.onRenderFirstFrame(X.IT4):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH playerEvent) {
        Integer num;
        Integer num2;
        o.LJIIIZ(playerEvent, "playerEvent");
        if (this.LJLL || !LJIILLIIL(playerEvent.LIZ)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        String str = null;
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onRenderReady: playerEvent=");
        LIZ.append(playerEvent);
        X1D.LIZIZ(LIZ);
        J8V.LJLJJI++;
        C56462Jm mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null) {
            mPlayStateHelper.LIZ = 2;
        }
        if (getMAweme() != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Player(");
            InterfaceC46330IGg mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                num2 = Integer.valueOf(mPlayer2.hashCode());
            } else {
                num2 = null;
            }
            LIZ2.append(num2);
            LIZ2.append(") onRenderReady: preload, sourceId=%s, duration=%d");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            }
            objArr[0] = str;
            objArr[1] = Long.valueOf(playerEvent.LIZJ);
            o.LJIIIIZZ(C16880lQ.LLLZ(LIZIZ, Arrays.copyOf(objArr, 2)), "format(format, *args)");
        }
        setKeepScreenOn(true);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderReady(playerEvent);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onRenderReady(playerEvent);
        }
        JHI.LIZ().LJI = false;
        JGL jgl = this.LLIIIILZ;
        if (jgl != null) {
            jgl.onRenderReady(playerEvent);
        }
        LJIILIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "search_separate_tab_lynx") != false) goto L20;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResumePlay(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJIILLIIL(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onResumePlay "
            r1.append(r0)
            java.lang.Class<X.JGI> r0 = X.JGI.class
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r1.append(r0)
            r0 = 64
            r1.append(r0)
            int r0 = r3.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = ", player@"
            r1.append(r0)
            X.IGg r0 = r3.getMPlayer()
            r2 = 0
            if (r0 == 0) goto L7d
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3d:
            r1.append(r0)
            java.lang.String r0 = ", sourceId: "
            r1.append(r0)
            r1.append(r4)
            X.X1D.LIZIZ(r1)
            int r1 = r3.getWindowVisibility()
            r0 = 8
            if (r1 != r0) goto L7f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L7b
            java.lang.String r1 = r0.getSearchFeedType()
        L5d:
            java.lang.String r0 = "search_horizontal_tab_lynx"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L77
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L6f
            java.lang.String r2 = r0.getSearchFeedType()
        L6f:
            java.lang.String r0 = "search_separate_tab_lynx"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L7f
        L77:
            r3.LLLLLJLJLL()
            return
        L7b:
            r1 = r2
            goto L5d
        L7d:
            r0 = r2
            goto L3d
        L7f:
            X.2Jm r1 = r3.getMPlayStateHelper()
            if (r1 != 0) goto Laa
        L85:
            boolean r0 = r3.LLF
            if (r0 == 0) goto L92
            X.IGg r0 = r3.getMPlayer()
            if (r0 == 0) goto L92
            r0.LJJJLIIL()
        L92:
            r0 = 1
            r3.setKeepScreenOn(r0)
            r3.LJLLLL = r4
            com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r0 = r3.LJLLI
            if (r0 == 0) goto L9f
            r0.onResumePlay(r4)
        L9f:
            X.JGK r0 = r3.LJLLILLLL
            if (r0 == 0) goto La6
            r0.onResumePlay(r4)
        La6:
            r3.LJIILIIL()
            return
        Laa:
            r0 = 2
            r1.LIZ = r0
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGI.onResumePlay(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onRetryOnError: obj=");
        LIZ.append(ipg);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(ipg);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onRetryOnError(ipg);
        }
    }

    public final void setClickPlayIcon(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setContainerStatusProvider(JIB provider) {
        o.LJIIIZ(provider, "provider");
        getDataProvider().LJII = provider;
    }

    public final void setCurrentPosition(long j) {
        this.LLIIII = j;
    }

    public final void setEnableProgressCallback(boolean z) {
        this.LLF = z;
    }

    public final void setFillHeight(boolean z) {
        this.LLFF = z;
    }

    public final void setFitType(int i) {
        if (i < 0 || i > 1) {
            return;
        }
        this.LLFFF = i;
        LJIJI(this.LLI, this.LLIFFJFJJ);
    }

    public final void setISubInfoListener(InterfaceC46826IZi interfaceC46826IZi) {
        this.LJZI = interfaceC46826IZi;
    }

    public final void setMAweme(Aweme aweme) {
        getDataProvider().LIZJ = aweme;
    }

    public final void setMEverFullScreen(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setMIsContainerPaused(boolean z) {
        this.LJLL = z;
    }

    public final void setMPlayer(InterfaceC46330IGg interfaceC46330IGg) {
        getDataProvider().LJIILIIL = interfaceC46330IGg;
    }

    public final void setMPlayerMobListener(InterfaceC48907JHj interfaceC48907JHj) {
        this.LJLLL = interfaceC48907JHj;
    }

    public final void setMPlayerViewListener(InterfaceC48907JHj interfaceC48907JHj) {
        this.LJLLJ = interfaceC48907JHj;
    }

    public final void setMSearchAdViewCallBack(JGS jgs) {
        this.LJLJL = jgs;
    }

    public final void setMVideoMobListener(JGK jgk) {
        this.LJLLILLLL = jgk;
    }

    public final void setMVideoViewListener(OnUIPlayListener onUIPlayListener) {
        this.LJLLI = onUIPlayListener;
    }

    public final void setMute(boolean z) {
        this.LLFZ = z;
        if (z) {
            InterfaceC46330IGg interfaceC46330IGg = getMPlayVideoHelper().LJI;
            if (interfaceC46330IGg != null) {
                interfaceC46330IGg.LJIJJ();
                return;
            }
            return;
        }
        InterfaceC46330IGg interfaceC46330IGg2 = getMPlayVideoHelper().LJI;
        if (interfaceC46330IGg2 == null) {
            return;
        }
        interfaceC46330IGg2.LJJIL();
    }

    public final void setPausedByDisconnection(boolean z) {
        this.LJLZ = z;
    }

    public final void setRepeat(boolean z) {
        this.LLFII = z;
    }

    public final void setSourceId(String str) {
        this.LJLLLL = str;
    }

    public final void setVideoLifeCycleListener(OnUIPlayListener onUIPlayListener) {
        getDataProvider().LJIILL = onUIPlayListener;
    }

    public final void setVideoUiListener(JGK listener) {
        o.LJIIIZ(listener, "listener");
        getDataProvider().LJIILJJIL = listener;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JGI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LifecycleOwner LIZIZ;
        Lifecycle lifecycle;
        a1.LJFF(context, "context");
        if (C48873JGb.LIZ() && (LIZIZ = C57434MgQ.LIZIZ(context)) != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.common.ui.component.SearchPlayerCore$1
                @Override // X.InterfaceC48888JGq
                public final void onDestroy() {
                    ((HashSet) JGI.LLIILII.getValue()).remove(JGI.this);
                    C48891JGt.onDestroy(this);
                }

                @Override // X.InterfaceC48888JGq
                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                public void onCreate() {
                    C48891JGt.onCreate(this);
                }

                @Override // X.InterfaceC48888JGq
                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public void onPause() {
                    C48891JGt.onPause(this);
                }

                @Override // X.InterfaceC48888JGq
                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public void onResume() {
                    C48891JGt.onResume(this);
                }

                @Override // X.InterfaceC48888JGq
                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                public void onStart() {
                    C48891JGt.onStart(this);
                }

                @Override // X.InterfaceC48888JGq
                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                public void onStop() {
                    C48891JGt.onStop(this);
                }
            });
        }
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 526));
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 529));
        this.LLD = C221108m2.LIZIZ(new AqS158S0100000_8(this, 527));
        this.LLFF = true;
        this.LLFII = true;
        this.LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 530));
        this.LLIIIJ = C221108m2.LIZIZ(JGT.LJLIL);
        this.LLIIIL = C221108m2.LIZIZ(JGW.LJLIL);
        this.LLIIJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, context, 528));
    }

    public final void LJIJI(int i, int i2) {
        float f;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.LLI = i;
        this.LLIFFJFJJ = i2;
        float f2 = 1.0f;
        if (this.LLFF) {
            int i3 = this.LLFFF;
            Aweme mAweme = getMAweme();
            if (mAweme == null || mAweme.getVideo() == null) {
                return;
            }
            Aweme mAweme2 = getMAweme();
            o.LJI(mAweme2);
            Video video = mAweme2.getVideo();
            o.LJI(video);
            int width = video.getWidth();
            Aweme mAweme3 = getMAweme();
            o.LJI(mAweme3);
            Video video2 = mAweme3.getVideo();
            o.LJI(video2);
            int height = video2.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            float f3 = height / width;
            if (i3 == 0) {
                if (f3 <= 0.0f) {
                    return;
                }
                float f4 = i2 / i;
                if (f4 > f3) {
                    f2 = f4 / f3;
                    f = 1.0f;
                } else {
                    f = f3 / f4;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f2, f, i / 2, i2 / 2);
                setTransform(matrix);
                return;
            }
            float f5 = i2 / i;
            float f6 = f3 / f5;
            if (f5 <= f3) {
                f2 = f6;
                f6 = 1.0f;
            }
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f2, f6, i / 2, i2 / 2);
            setTransform(matrix2);
            return;
        }
        Aweme mAweme4 = getMAweme();
        if (mAweme4 == null || mAweme4.getVideo() == null) {
            return;
        }
        Aweme mAweme5 = getMAweme();
        o.LJI(mAweme5);
        Video video3 = mAweme5.getVideo();
        o.LJI(video3);
        int width2 = video3.getWidth();
        Aweme mAweme6 = getMAweme();
        o.LJI(mAweme6);
        Video video4 = mAweme6.getVideo();
        o.LJI(video4);
        int height2 = video4.getHeight();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        Matrix matrix3 = new Matrix();
        matrix3.setScale(1.0f, (height2 / width2) / (i2 / i), i / 2, i2 / 2);
        setTransform(matrix3);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        if (!LJIILLIIL(str)) {
            return;
        }
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedTimeMs(str, j);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onBuffering: sourceId=");
        LIZ.append(str);
        LIZ.append("; start=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(str, z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onCompleteLoaded: sourceId=");
        LIZ.append(str);
        LIZ.append("; isDash=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onDecoderBuffering: sourceId=");
        LIZ.append(str);
        LIZ.append("; start=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayFailed: sourceId=");
        LIZ.append(str);
        LIZ.append("; error=");
        LIZ.append(ipg);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, ipg);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayFailed(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayStop 2: sourceId=");
        LIZ.append(str);
        LIZ.append(", isUsedSr: ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onRenderFirstFrame: sourceId=");
        LIZ.append(str);
        LIZ.append("; event=");
        LIZ.append(it4);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrame(str, it4);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onRenderFirstFrame(str, it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, IPG ipg) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onRetryOnError: sourceId=");
        LIZ.append(str);
        LIZ.append("; obj=");
        LIZ.append(ipg);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, ipg);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onRetryOnError(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onSeekEnd: sourceId=");
        LIZ.append(str);
        LIZ.append("; success=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onPlayProgressChange: sourceId=");
        LIZ.append(str);
        LIZ.append("; position=");
        LIZ.append(j);
        LIZ.append("; duration=");
        LIZ.append(j2);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onSeekStart: sourceId=");
        LIZ.append(str);
        LIZ.append("; offset=");
        LIZ.append(i);
        LIZ.append("; progress=");
        LIZ.append(f);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        Integer num;
        if (!LJIILLIIL(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Player(");
        InterfaceC46330IGg mPlayer = getMPlayer();
        if (mPlayer != null) {
            num = Integer.valueOf(mPlayer.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(") onVideoSizeChanged: sourceId=");
        LIZ.append(str);
        LIZ.append("; width=");
        LIZ.append(i);
        LIZ.append("; height=");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        OnUIPlayListener onUIPlayListener = this.LJLLI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i, i2);
        }
        JGK jgk = this.LJLLILLLL;
        if (jgk != null) {
            jgk.onVideoSizeChanged(str, i, i2);
        }
    }

    public static void LJIILJJIL(JGI jgi, N69 n69, JMD jmd, int i) {
        JMD jmd2 = null;
        if ((i & 1) != 0) {
            n69 = null;
        }
        if ((i & 2) != 0) {
            jmd = null;
        }
        JGM jgm = new JGM(jgi);
        if (n69 != null) {
            n69.Z9(jgm);
        } else {
            n69 = null;
        }
        jgi.LLIIJLIL = n69;
        if (jmd != null) {
            jmd.Z9(jgm);
            jmd2 = jmd;
        }
        jgi.LLIIL = jmd2;
    }
}
