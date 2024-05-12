package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDDListenerS394S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JHN extends FrameLayout implements JGK, C92U {
    public C48881JGj LJLIL;
    public C164086cG LJLILLLLZI;
    public View LJLJI;
    public ImageView LJLJJI;
    public JGI LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Integer LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public View LJLLJ;
    public final Handler LJLLL;
    public ARunnableS44S0100000_8 LJLLLL;
    public final long LJLLLLLL;
    public InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> LJLZ;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJZ;
    public String LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final JHO LLD;
    public final C62822Ol8 LLF;
    public int LLFF;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void LLLJIL() {
        Wf(2);
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void g9() {
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

    public final JHY getVideoPlayerStatusListener() {
        return null;
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
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
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
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
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
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
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
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

    public final void setVideoPlayerStatusListener(JHY jhy) {
    }

    private final JHT getContainerStatusProvider() {
        return (JHT) this.LJZL.getValue();
    }

    private final ViewGroup getCoreParent() {
        return (ViewGroup) this.LLF.getValue();
    }

    private final View getItemView() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LIZ;
        }
        return null;
    }

    private final JHU getMImageDisplayLighten() {
        return (JHU) this.LL.getValue();
    }

    private final C46331IGh getMPlayVideoHelper() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LJ;
        }
        return null;
    }

    public final void LIZJ() {
        int i;
        String str;
        JQA jqa;
        JGI jgi = this.LJLJJL;
        if (jgi != null) {
            JLU.LJIIIIZZ(jgi);
        }
        if (this.LJLJL) {
            C48881JGj c48881JGj = this.LJLIL;
            if (c48881JGj != null && (jqa = c48881JGj.LJIJJLI) != null) {
                str = jqa.LJIJJLI;
            } else {
                str = null;
            }
            if (o.LJ("hot_user", str)) {
                pause();
            } else if (isPlaying()) {
                pause();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" unregister ");
        AbstractC49155JQx mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            i = mScrollStateObserver.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C49153JQv mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJIIIIZZ(getMScrollStateObserver());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ca, code lost:
    
        if (r0 != null) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JHN.LIZLLL():void");
    }

    public final void LJIIIZ() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C164086cG c164086cG = this.LJLILLLLZI;
        if (c164086cG == null) {
            return;
        }
        c164086cG.setVisibility(0);
    }

    @Override // X.JGK
    public final void contextResume() {
        C48880JGi LJI;
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj == null || (LJI = c48881JGj.LJI()) == null || LJI.LJFF == null) {
            C48881JGj c48881JGj2 = this.LJLIL;
            if (c48881JGj2 == null || c48881JGj2.LJIILIIL == null) {
                LJIIIZ();
            }
        }
    }

    public final Aweme getMAweme() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LIZJ;
        }
        return null;
    }

    public final C49153JQv getMScrollStateManager() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LJIIIIZZ;
        }
        return null;
    }

    public final AbstractC49155JQx getMScrollStateObserver() {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            return c48881JGj.LJIIIZ;
        }
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        JGI jgi = this.LJLJJL;
        if (jgi != null) {
            return jgi.isPlaying();
        }
        return false;
    }

    public final void LIZ() {
        String str;
        C49153JQv c49153JQv;
        JGU jgu;
        int i;
        JGU jgu2;
        String str2;
        DynamicPatch dynamicPatch;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attachAutoData aid ");
        Aweme mAweme = getMAweme();
        JGU jgu3 = null;
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (!this.LJLJL) {
            return;
        }
        if (C46447IKt.LJLJLJ) {
            JSE LIZ2 = C49995Jjj.LIZ.LIZ(this.LJLJJLL);
            if (LIZ2 != null && (dynamicPatch = LIZ2.LIZ) != null) {
                str2 = dynamicPatch.schema;
            } else {
                str2 = null;
            }
            if (!C49163JRf.LIZ(str2)) {
                return;
            }
        }
        JI2 LIZ3 = C48923JHz.LIZ(this);
        if (LIZ3 != null) {
            c49153JQv = LIZ3.LJLIL;
        } else {
            c49153JQv = null;
        }
        setMScrollStateManager(c49153JQv);
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            jgu = c48881JGj.LJI;
        } else {
            jgu = null;
        }
        if (jgu instanceof C48885JGn) {
            if (c48881JGj != null) {
                jgu2 = c48881JGj.LJI;
            } else {
                jgu2 = null;
            }
            o.LJII(jgu2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.communicate.SearchLynxPlayObserver");
            C48885JGn c48885JGn = (C48885JGn) jgu2;
            if (LIZ3 != null) {
                jgu3 = LIZ3.LJLJI;
            }
            c48885JGn.LJLILLLLZI = jgu3;
        }
        JGI jgi = this.LJLJJL;
        if (jgi != null) {
            JLU.LJII(jgi);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(hashCode());
        LIZ4.append(" register ");
        AbstractC49155JQx mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            i = mScrollStateObserver.hashCode();
        } else {
            i = 0;
        }
        LIZ4.append(i);
        X1D.LIZIZ(LIZ4);
        C49153JQv mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.LJII(getMScrollStateObserver());
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.C92U
    public final AbsInteractStickerWidget h0() {
        ActivityC45651qj activityC45651qj;
        Context context;
        IStickerService LIZIZ = StickerServiceImpl.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "get().getService(IStickerService::class.java)");
        InteractStickerWidget LIZ = LIZIZ.LIZ();
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (context = c48881JGj.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        o.LJI(activityC45651qj);
        WidgetManager.xl(activityC45651qj, null, getItemView(), activityC45651qj).Al(R.id.eq0, LIZ);
        return LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C48881JGj c48881JGj;
        String str2;
        JQA jqa;
        C34X c34x;
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttachedToWindow aid:");
        Aweme mAweme = getMAweme();
        String str3 = null;
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (C49995Jjj.LIZ.LIZ(this.LJLJJLL) != null && (c48881JGj = this.LJLIL) != null) {
            c48881JGj.LJFF();
        }
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme mAweme2 = getMAweme();
        if (mAweme2 == null || (str2 = mAweme2.getAid()) == null) {
            str2 = "";
        }
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 != null) {
            jqa = c48881JGj2.LJIJJLI;
        } else {
            jqa = null;
        }
        concurrentHashMap.put(str2, new WeakReference<>(jqa));
        if (isPlaying()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("aid ");
            Aweme mAweme3 = getMAweme();
            if (mAweme3 != null) {
                str3 = mAweme3.getAid();
            }
            LIZ2.append(str3);
            LIZ2.append(" is playing");
            X1D.LIZIZ(LIZ2);
            play();
        } else {
            LJIIIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("aid ");
            Aweme mAweme4 = getMAweme();
            if (mAweme4 != null) {
                str3 = mAweme4.getAid();
            }
            C0MT.LJ(LIZ3, str3, " not is playing", LIZ3);
        }
        LIZ();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        InterfaceC36571c5 LJJIFFI = C45804HyK.LJJIFFI(context);
        if ((LJJIFFI instanceof C34X) && (c34x = (C34X) LJJIFFI) != null) {
            c34x.registerActivityOnKeyDownListener(this.LLD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C34X c34x;
        super.onDetachedFromWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetachedFromWindow aid:");
        Aweme mAweme = getMAweme();
        String str = null;
        if (mAweme != null) {
            str = mAweme.getAid();
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LIZJ();
        EventBus.LIZJ().LJIJ(this);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        InterfaceC36571c5 LJJIFFI = C45804HyK.LJJIFFI(context);
        if ((LJJIFFI instanceof C34X) && (c34x = (C34X) LJJIFFI) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LLD);
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
        String str;
        C48883JGl c48883JGl;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause:");
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (c48883JGl = c48881JGj.LJIIJ) != null) {
            c48883JGl.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
        String str;
        C48883JGl c48883JGl;
        C48880JGi LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play:");
        Aweme mAweme = getMAweme();
        C48883JGl c48883JGl2 = null;
        if (mAweme != null) {
            str = mAweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (LJI = c48881JGj.LJI()) != null && LJI.LIZ == 3) {
            LJI.LIZ = 0;
        }
        C48899JHb c48899JHb = C48898JHa.LIZ;
        Aweme mAweme2 = getMAweme();
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 != null) {
            c48883JGl2 = c48881JGj2.LJIIJ;
        }
        c48899JHb.LIZ(mAweme2, c48883JGl2, this.LJLJL, EnumC48901JHd.STOP_OTHER);
        C48881JGj c48881JGj3 = this.LJLIL;
        if (c48881JGj3 == null || (c48883JGl = c48881JGj3.LJIIJ) == null) {
            return;
        }
        c48883JGl.LLLLII(150L);
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    public final JGI getCore() {
        return this.LJLJJL;
    }

    public final C48881JGj getDataProvider() {
        return this.LJLIL;
    }

    public final ImageView getMCoverBackground() {
        return this.LJLJJI;
    }

    public final C164086cG getMCoverView() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JHN(Context context) {
        super(context, null, 0);
        InterfaceC47247IgV surfaceHolder;
        ImageView imageView;
        a1.LJFF(context, "context");
        this.LJLJJLL = -1;
        this.LJLLI = "";
        this.LJLLILLLL = -1;
        this.LJLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLLLLLL = 500L;
        this.LJZL = C221108m2.LIZIZ(new AqS155S0200000_8(this, context, 22));
        this.LL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 445));
        this.LLD = new JHO(this);
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 440));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cjh, this, true);
        View findViewById = findViewById(R.id.fnp);
        this.LJLLJ = findViewById;
        if (findViewById != null) {
            setRoundCorner(findViewById);
        }
        this.LJLILLLLZI = (C164086cG) findViewById(R.id.cover);
        this.LJLJI = findViewById(R.id.bxx);
        this.LJLJJI = (ImageView) findViewById(R.id.bxj);
        if (C34127DaN.LJFF() && (imageView = this.LJLJJI) != null) {
            imageView.setBackground(new ColorDrawable(C04330Ez.LIZIZ(getContext(), R.color.cz)));
        }
        JGI jgi = (JGI) findViewById(R.id.l60);
        this.LJLJJL = jgi;
        C48881JGj dataProvider = jgi != null ? jgi.getDataProvider() : null;
        this.LJLIL = dataProvider;
        if (dataProvider != null) {
            dataProvider.LJII = getContainerStatusProvider();
        }
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            c48881JGj.LJIIL = false;
            c48881JGj.LJIIJJI = false;
            c48881JGj.LIZ = this;
        }
        JGI jgi2 = this.LJLJJL;
        if (jgi2 != null) {
            jgi2.setMVideoViewListener(this);
        }
        JGI jgi3 = this.LJLJJL;
        if (jgi3 != null) {
            jgi3.setMPlayerViewListener(this);
        }
        JGI jgi4 = this.LJLJJL;
        if (jgi4 != null) {
            C48881JGj c48881JGj2 = this.LJLIL;
            C50652JuK.Companion.getClass();
            jgi4.setMVideoMobListener(new C48897JGz(c48881JGj2, C50651JuJ.LIZLLL(this)));
        }
        JGI jgi5 = this.LJLJJL;
        if (jgi5 != null) {
            jgi5.LJIIJ();
        }
        JGI jgi6 = this.LJLJJL;
        if (jgi6 != null && (surfaceHolder = jgi6.getSurfaceHolder()) != null) {
            surfaceHolder.N7(new JHS(this));
        }
        getMPlayVideoHelper();
        C48881JGj c48881JGj3 = this.LJLIL;
        if (c48881JGj3 != null) {
            c48881JGj3.LJIJJLI = new JQA();
        }
        C48883JGl c48883JGl = new C48883JGl(this.LJLJJL, this.LJLIL);
        C48881JGj c48881JGj4 = this.LJLIL;
        if (c48881JGj4 != null) {
            c48881JGj4.LJIIJ = c48883JGl;
            c48881JGj4.LJI = new C48885JGn(this.LJLJJL);
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
            C3SZ.LIZ(activityC45651qj).LJLJL.observe(activityC45651qj, new AObserverS76S0100000_8(this, 79));
        }
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(this, 156);
        C48909JHl c48909JHl = new C48909JHl();
        aqS174S0100000_8.invoke(c48909JHl);
        setMScrollStateObserver(c48909JHl);
        C48881JGj c48881JGj5 = this.LJLIL;
        if (c48881JGj5 == null) {
            return;
        }
        c48881JGj5.LJI = new C48885JGn(this.LJLJJL);
    }

    public static final boolean LJ(Context context) {
        ActivityC45651qj LJJIFFI;
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || !o.LJ(C50989Jzl.LJ(), LJJIFFI)) {
            return true;
        }
        return false;
    }

    public static Aweme LJII(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (Aweme) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, new JHQ().getType());
    }

    private final void setMAweme(Aweme aweme) {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LIZJ = aweme;
    }

    public final void LIZIZ(Aweme aweme) {
        String str;
        JQA jqa;
        int i;
        JQA jqa2;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        JHV LIZ = JHP.LIZ(aid);
        C48881JGj c48881JGj = this.LJLIL;
        String str2 = "";
        if (c48881JGj == null || (jqa2 = c48881JGj.LJIJJLI) == null || (str = jqa2.LJIJJLI) == null) {
            str = "";
        }
        LIZ.getClass();
        LIZ.LIZJ = str;
        if (!o.LJ(LIZ, JHW.LIZ)) {
            LIZ.LJ = System.currentTimeMillis();
        }
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        String aid2 = aweme.getAid();
        if (aid2 != null) {
            str2 = aid2;
        }
        C48881JGj c48881JGj2 = this.LJLIL;
        if (c48881JGj2 != null) {
            jqa = c48881JGj2.LJIJJLI;
        } else {
            jqa = null;
        }
        concurrentHashMap.put(str2, new WeakReference<>(jqa));
        setMAweme(aweme);
        JGI jgi = this.LJLJJL;
        if (jgi != null) {
            jgi.LJIIJJI(aweme);
        }
        if (getMAweme() == null || getMAweme() == null) {
            return;
        }
        if ((getWidth() == 0 || getHeight() == 0) && (getLayoutParams() == null || getLayoutParams().width == 0 || getLayoutParams().height == 0)) {
            getViewTreeObserver().addOnPreDrawListener(new IDDListenerS394S0100000_8(this, 1));
        } else {
            LIZLLL();
        }
        LJIIIZ();
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        if (C220858ld.LJIIIZ(getMAweme())) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.JGK
    public final void Wf(int i) {
        int i2;
        C48881JGj c48881JGj;
        InterfaceC46330IGg interfaceC46330IGg;
        C48881JGj c48881JGj2;
        InterfaceC46330IGg interfaceC46330IGg2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return;
                    }
                    LJI(this, "stop");
                    return;
                }
                LJI(this, "loading");
                return;
            }
            if ((!TextUtils.equals(this.LJZI, "pause")) && this.LJLLILLLL > 0 && (c48881JGj2 = this.LJLIL) != null && (interfaceC46330IGg2 = c48881JGj2.LJIILIIL) != null) {
                interfaceC46330IGg2.LJJJZ();
            }
            LJI(this, "pause");
            return;
        }
        if ((!TextUtils.equals(this.LJZI, "play")) && (i2 = this.LJLLILLLL) > 0 && (c48881JGj = this.LJLIL) != null && (interfaceC46330IGg = c48881JGj.LJIILIIL) != null) {
            interfaceC46330IGg.LJJJLZIJ(i2);
        }
        JGI jgi = this.LJLJJL;
        if (jgi != null) {
            jgi.setMute(J1C.LIZ(this.LLFF, 0, getMAweme()));
        }
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        J1C.LJ();
        LJFF("play", C113554cx.LJJJLZIJ(new OSZ("muted", Integer.valueOf(J1C.LIZIZ))));
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        int i;
        String str;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        Wf(i);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(z);
            o.LJIIIIZZ(C16880lQ.LLLZ("onBuffering: sourceId=%s, start=%s", Arrays.copyOf(objArr, 2)), "format(format, *args)");
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Wf(1);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        this.LJLJLLL = false;
        LJI(this, "ended");
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        JGI jgi = this.LJLJJL;
        if (jgi != null && jgi.getRepeat()) {
            return;
        }
        LJIIIZ();
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        Wf(1);
        LJFF("error", C113554cx.LJJJLZIJ(new OSZ("error", String.valueOf(ipg))));
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        long j;
        InterfaceC46330IGg interfaceC46330IGg;
        OSZ[] oszArr = new OSZ[1];
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (interfaceC46330IGg = c48881JGj.LJIILIIL) != null) {
            j = interfaceC46330IGg.getCurrentPosition();
        } else {
            j = 0;
        }
        oszArr[0] = new OSZ("progress", Integer.valueOf((int) j));
        LJFF("timeupdate", C113554cx.LJJJLZIJ(oszArr));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        this.LJLJLLL = false;
        LJIIIZ();
        Wf(5);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        this.LJLJLLL = true;
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Wf(2);
    }

    @QD3
    public final void onReceiveFeaturedAnswerEnterDetail(C2PJ event) {
        C48881JGj c48881JGj;
        o.LJIIIZ(event, "event");
        if (LJ(getContext()) || TextUtils.isEmpty(event.LJLIL) || (c48881JGj = this.LJLIL) == null) {
            return;
        }
        C48892JGu.LIZ(c48881JGj, true);
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onReceiveFeaturedAnswerExitDetail(C46592IQi event) {
        Aweme aweme;
        String aid;
        C48881JGj c48881JGj;
        JIB jib;
        o.LJIIIZ(event, "event");
        EventBus.LIZJ().LJIILLIIL(event);
        if (LJ(getContext()) || (aweme = event.LJLIL) == null || (aid = aweme.getAid()) == null || aid.length() == 0 || !o.LJ(aweme.getSearchFeedType(), "SearchFeaturedAnswer") || (c48881JGj = this.LJLIL) == null || (jib = c48881JGj.LJII) == null) {
            return;
        }
        boolean z = true ^ event.LJLILLLLZI;
        String LIZ = C48880JGi.LIZ(jib.getIdentifier(), aweme.getAid());
        o.LJIIIIZZ(LIZ, "buildShareId(it.identifier, aweme.aid)");
        C48892JGu.LIZIZ(aweme, z, LIZ, event.LJLJI, event.LJLJJI);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        if (it4 != null) {
            it4.getId();
        }
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        C164086cG c164086cG = this.LJLILLLLZI;
        if (c164086cG != null) {
            c164086cG.setVisibility(8);
        }
        C46315IFr.LIZ();
        Wf(0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH playerEvent) {
        String str;
        o.LJIIIZ(playerEvent, "playerEvent");
        Wf(0);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Long.valueOf(playerEvent.LIZJ);
            o.LJIIIIZZ(C16880lQ.LLLZ("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2)), "format(format, *args)");
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        InterfaceC46330IGg interfaceC46330IGg;
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        C164086cG c164086cG = this.LJLILLLLZI;
        if (c164086cG != null) {
            c164086cG.setVisibility(8);
        }
        Wf(0);
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null && (interfaceC46330IGg = mPlayVideoHelper.LJI) != null) {
            interfaceC46330IGg.getDuration();
        }
        C46331IGh mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            mPlayVideoHelper2.LIZLLL();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!this.LJLJLJ) {
            return;
        }
        if (this.LJLJLLL && i == 0) {
            play();
        } else {
            pause();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void searchShopTabVisible(IGH visibleEvent) {
        o.LJIIIZ(visibleEvent, "visibleEvent");
        if (!this.LJLJLJ) {
            return;
        }
        if (this.LJLJLLL && visibleEvent.LJLIL) {
            play();
        } else {
            pause();
        }
    }

    public void setAutoPlay(boolean z) {
        if (this.LJLJL == z) {
            return;
        }
        this.LJLJL = z;
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            c48881JGj.LJIIJJI = z;
        }
        if (z) {
            LIZ();
        } else {
            LIZJ();
        }
    }

    public void setAweme(String aweme) {
        o.LJIIIZ(aweme, "aweme");
        Aweme LJII = LJII(aweme);
        if (LJII != null) {
            if (getMAweme() != null) {
                Aweme mAweme = getMAweme();
                o.LJI(mAweme);
                if (o.LJ(mAweme.getAid(), LJII.getAid())) {
                    return;
                }
            }
            LIZIZ(LJII);
        }
    }

    public void setAwemeData(String awemeData) {
        o.LJIIIZ(awemeData, "awemeData");
        Aweme LJII = LJII(awemeData);
        if (LJII != null) {
            LIZIZ(LJII);
        }
    }

    public void setAwemeIndex(JHR awemeIndex) {
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        DynamicPatch dynamicPatch2;
        List<Aweme> awemeList2;
        o.LJIIIZ(awemeIndex, "awemeIndex");
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null) {
            c48881JGj.LJJ = awemeIndex.LJLIL;
            int i = awemeIndex.LJLILLLLZI;
            int i2 = -1;
            if (i >= 0) {
                int i3 = 0;
                while (true) {
                    JSE LIZ = C49995Jjj.LIZ.LIZ(this.LJLJJLL);
                    if (LIZ != null && (dynamicPatch = LIZ.LIZ) != null && (awemeList = dynamicPatch.getAwemeList()) != null && (aweme = (Aweme) ListProtector.get(awemeList, i3)) != null && aweme.getAid() != null) {
                        i2++;
                    }
                    if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            c48881JGj.LJJI = i2;
        }
        JSE LIZ2 = C49995Jjj.LIZ.LIZ(this.LJLJJLL);
        if (LIZ2 != null && (dynamicPatch2 = LIZ2.LIZ) != null && (awemeList2 = dynamicPatch2.getAwemeList()) != null) {
            Object obj = ListProtector.get(awemeList2, awemeIndex.LJLILLLLZI);
            o.LJIIIIZZ(obj, "it[awemeIndex.index]");
            LIZIZ((Aweme) obj);
            C48881JGj c48881JGj2 = this.LJLIL;
            if (c48881JGj2 != null) {
                c48881JGj2.LJFF();
            }
        }
    }

    public final void setCore(JGI jgi) {
        this.LJLJJL = jgi;
    }

    public final void setCoverPlaceholder(int i) {
        this.LJLL = Integer.valueOf(i);
    }

    public final void setDataProvider(C48881JGj c48881JGj) {
        this.LJLIL = c48881JGj;
    }

    public void setEventChangeListener(InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr) {
        this.LJLZ = interfaceC88471Ynr;
    }

    public final void setIsECommerce(boolean z) {
        this.LJLJLJ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLogExtra(HashMap<String, Object> logExtra) {
        String str;
        JQA jqa;
        C48881JGj c48881JGj;
        JQA jqa2;
        C48881JGj c48881JGj2;
        C48881JGj c48881JGj3;
        JQA jqa3;
        C48881JGj c48881JGj4;
        JQA jqa4;
        C48881JGj c48881JGj5;
        JQA jqa5;
        C48881JGj c48881JGj6;
        JQA jqa6;
        C48881JGj c48881JGj7;
        JQA jqa7;
        C48881JGj c48881JGj8;
        JQA jqa8;
        C48881JGj c48881JGj9;
        JQA jqa9;
        C48881JGj c48881JGj10;
        JQA jqa10;
        C48881JGj c48881JGj11;
        JQA jqa11;
        C48881JGj c48881JGj12;
        JQA jqa12;
        C48881JGj c48881JGj13;
        JQA jqa13;
        C48881JGj c48881JGj14;
        JQA jqa14;
        JQA jqa15;
        o.LJIIIZ(logExtra, "logExtra");
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it = logExtra.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (next.getValue() != null) {
                if (next.getValue() instanceof JavaOnlyMap) {
                    String key = next.getKey();
                    String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), next.getValue());
                    o.LJIIIIZZ(json, "get().gson.toJson(item.value)");
                    hashMap.put(key, json);
                } else {
                    hashMap.put(next.getKey(), String.valueOf(next.getValue()));
                    if (o.LJ("enter_from", next.getKey())) {
                        C48881JGj c48881JGj15 = this.LJLIL;
                        if (c48881JGj15 != null && (jqa15 = c48881JGj15.LJIJJLI) != null) {
                            String str2 = (String) hashMap.get("enter_from");
                            if (str2 != null) {
                                str = str2;
                            }
                            jqa15.LJFF = str;
                        }
                        hashMap.remove("enter_from");
                    }
                }
            }
        }
        if (hashMap.keySet().contains("impr_id") && (c48881JGj14 = this.LJLIL) != null && (jqa14 = c48881JGj14.LJIJJLI) != null) {
            String str3 = (String) hashMap.get("impr_id");
            if (str3 == null) {
                str3 = "";
            }
            jqa14.LJIIIIZZ = str3;
        }
        if (hashMap.keySet().contains("search_keyword") && (c48881JGj13 = this.LJLIL) != null && (jqa13 = c48881JGj13.LJIJJLI) != null) {
            String str4 = (String) hashMap.get("search_keyword");
            if (str4 == null) {
                str4 = "";
            }
            jqa13.LJ = str4;
        }
        if (hashMap.keySet().contains("search_result_id") && (c48881JGj12 = this.LJLIL) != null && (jqa12 = c48881JGj12.LJIJJLI) != null) {
            jqa12.LJJIIZ = new AqS174S0100000_8(hashMap, (HashMap<String, String>) 154);
        }
        if (hashMap.keySet().contains("list_item_id") && (c48881JGj11 = this.LJLIL) != null && (jqa11 = c48881JGj11.LJIJJLI) != null) {
            jqa11.LJJIJIL = new AqS174S0100000_8(hashMap, (HashMap<String, String>) 155);
        }
        if (hashMap.keySet().contains("search_id") && (c48881JGj10 = this.LJLIL) != null && (jqa10 = c48881JGj10.LJIJJLI) != null) {
            String str5 = (String) hashMap.get("search_id");
            if (str5 == null) {
                str5 = "";
            }
            jqa10.LJII = str5;
        }
        if (hashMap.keySet().contains("music_id") && (c48881JGj9 = this.LJLIL) != null && (jqa9 = c48881JGj9.LJIJJLI) != null) {
            String str6 = (String) hashMap.get("music_id");
            if (str6 == null) {
                str6 = "";
            }
            jqa9.LJIILLIIL = str6;
        }
        if (hashMap.keySet().contains("token_type") && (c48881JGj8 = this.LJLIL) != null && (jqa8 = c48881JGj8.LJIJJLI) != null) {
            String str7 = (String) hashMap.get("token_type");
            if (str7 == null) {
                str7 = "";
            }
            jqa8.LJIJJLI = str7;
        }
        if (hashMap.keySet().contains("is_fullscreen") && (c48881JGj7 = this.LJLIL) != null && (jqa7 = c48881JGj7.LJIJJLI) != null) {
            String str8 = (String) hashMap.get("is_fullscreen");
            if (str8 == null) {
                str8 = "";
            }
            jqa7.LJIL = str8;
        }
        if (hashMap.keySet().contains("rank") && (c48881JGj6 = this.LJLIL) != null && (jqa6 = c48881JGj6.LJIJJLI) != null) {
            String str9 = (String) hashMap.get("rank");
            if (str9 == null) {
                str9 = "";
            }
            jqa6.LJIILIIL = str9;
        }
        if (hashMap.keySet().contains("max_shoot_time") && (c48881JGj5 = this.LJLIL) != null && (jqa5 = c48881JGj5.LJIJJLI) != null) {
            String str10 = (String) hashMap.get("max_shoot_time");
            if (str10 == null) {
                str10 = "";
            }
            jqa5.LJJ = str10;
        }
        if (hashMap.keySet().contains("list_result_type") && (c48881JGj4 = this.LJLIL) != null && (jqa4 = c48881JGj4.LJIJJLI) != null) {
            String str11 = (String) hashMap.get("list_result_type");
            if (str11 == null) {
                str11 = "";
            }
            jqa4.LJJIIZI = str11;
        }
        if (hashMap.keySet().contains("tns_ban_type") && (c48881JGj3 = this.LJLIL) != null && (jqa3 = c48881JGj3.LJIJJLI) != null) {
            String str12 = (String) hashMap.get("tns_ban_type");
            if (str12 == null) {
                str12 = "";
            }
            jqa3.LJIJI = str12;
        }
        if (hashMap.keySet().contains("previous_page") && (c48881JGj2 = this.LJLIL) != null) {
            String str13 = (String) hashMap.get("previous_page");
            if (str13 == null) {
                str13 = "";
            }
            c48881JGj2.LJIJI = str13;
        }
        if (hashMap.keySet().contains("enter_method") && (c48881JGj = this.LJLIL) != null && (jqa2 = c48881JGj.LJIJJLI) != null) {
            String str14 = (String) hashMap.get("enter_method");
            if (str14 == null) {
                str14 = "";
            }
            jqa2.LJI = str14;
        }
        if (hashMap.keySet().contains("activity_keyword")) {
            Object obj = hashMap.get("activity_keyword");
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put("activity_keyword", obj);
        }
        if (hashMap.keySet().contains("video_card_type")) {
            Object obj2 = hashMap.get("video_card_type");
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put("video_card_type", obj2);
        }
        if (hashMap.keySet().contains("search_tab_name")) {
            Object obj3 = hashMap.get("search_tab_name");
            if (obj3 == null) {
                obj3 = "";
            }
            linkedHashMap.put("search_tab_name", obj3);
        }
        if (hashMap.keySet().contains("search_tab_rank")) {
            Object obj4 = hashMap.get("search_tab_rank");
            if (obj4 == null) {
                obj4 = "";
            }
            linkedHashMap.put("search_tab_rank", obj4);
        }
        if (hashMap.keySet().contains("video_tag")) {
            Object obj5 = hashMap.get("video_tag");
            if (obj5 != 0) {
                str = obj5;
            }
            linkedHashMap.put("video_tag", str);
        }
        C48881JGj c48881JGj16 = this.LJLIL;
        if (c48881JGj16 != null) {
            JQA jqa16 = c48881JGj16.LJIJJLI;
            if (jqa16 != null) {
                jqa16.LJJIII = linkedHashMap;
            }
            if (c48881JGj16 == null || (jqa = c48881JGj16.LJIJJLI) == null) {
                return;
            }
            jqa.LJJIIJ = hashMap;
        }
    }

    public final void setMCoverBackground(ImageView imageView) {
        this.LJLJJI = imageView;
    }

    public final void setMCoverView(C164086cG c164086cG) {
        this.LJLILLLLZI = c164086cG;
    }

    public final void setMScrollStateManager(C49153JQv c49153JQv) {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LJIIIIZZ = c49153JQv;
    }

    public final void setMScrollStateObserver(AbstractC49155JQx abstractC49155JQx) {
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LJIIIZ = abstractC49155JQx;
    }

    public void setMuted(int i) {
        if (i == -1) {
            return;
        }
        J1C.LIZJ(i);
        if (i == 0) {
            JYH jyh = JYH.LIZIZ;
            if (jyh.LJIIJ()) {
                J1C.LIZ = false;
                jyh.LIZLLL("general_search", J1M.CLICK_UNMUTE_BUTTON, J1O.STYLE_NO_BUTTON);
            }
        }
        JGI jgi = this.LJLJJL;
        if (jgi == null) {
            return;
        }
        jgi.setMute(J1C.LIZ(this.LLFF, 0, getMAweme()));
    }

    public void setObjectFit(String objectFit) {
        o.LJIIIZ(objectFit, "objectFit");
        JGI jgi = this.LJLJJL;
        if (jgi == null) {
            return;
        }
        jgi.setFitType(!o.LJ(objectFit, "fill") ? 1 : 0);
    }

    public void setPlayStatusActionHandler(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJZ = interfaceC88472Yns;
    }

    public final void setPoster(String poster) {
        o.LJIIIZ(poster, "poster");
        this.LJLLI = poster;
    }

    public void setRate(int i) {
        this.LJLLILLLL = i;
    }

    public void setRepeat(boolean z) {
        JGI jgi = this.LJLJJL;
        if (jgi == null) {
            return;
        }
        jgi.setRepeat(z);
    }

    public final void setRoundCorner(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        itemView.setOutlineProvider(new C43251GyF((int) V2B.LJI(getContext(), 2.0f)));
        itemView.setClipToOutline(true);
    }

    public void setSessionId(int i) {
        C48883JGl c48883JGl;
        this.LJLJJLL = i;
        if (this.LJLIL != null) {
            C49995Jjj.LIZ.LIZ(i);
        }
        JSE LIZ = C49995Jjj.LIZ.LIZ(this.LJLJJLL);
        if (LIZ != null) {
            new WeakReference(this);
        }
        JGI jgi = this.LJLJJL;
        if (jgi != null && LIZ != null) {
            new WeakReference(jgi);
        }
        C48881JGj c48881JGj = this.LJLIL;
        if (c48881JGj != null && (c48883JGl = c48881JGj.LJIIJ) != null && LIZ != null) {
            LIZ.LIZIZ = new WeakReference<>(c48883JGl);
        }
        ARunnableS44S0100000_8 aRunnableS44S0100000_8 = new ARunnableS44S0100000_8(this, 73);
        this.LJLLLL = aRunnableS44S0100000_8;
        this.LJLLL.post(aRunnableS44S0100000_8);
    }

    public void setShareEComVideoPlayerBeforeLaunchDetail(String targetAwemeId) {
        o.LJIIIZ(targetAwemeId, "targetAwemeId");
        if (!TextUtils.isEmpty(targetAwemeId) && this.LJLJLJ) {
            Aweme mAweme = getMAweme();
            String str = null;
            if (mAweme != null) {
                str = mAweme.getAid();
            }
            if (!o.LJ(targetAwemeId, str) || !C48919JHv.LIZ()) {
                return;
            }
            C78966Uyw.LJLJJI = getMAweme();
            C48881JGj c48881JGj = this.LJLIL;
            if (c48881JGj == null || c48881JGj.LJI() == null) {
                return;
            }
            InterfaceC46330IGg interfaceC46330IGg = c48881JGj.LJIILIIL;
            C48892JGu.LIZ(c48881JGj, true);
            if (interfaceC46330IGg == null) {
                return;
            }
            interfaceC46330IGg.LJIILJJIL();
        }
    }

    public void setSoundControl(int i) {
        this.LLFF = i;
        JGI jgi = this.LJLJJL;
        if (jgi == null) {
            return;
        }
        jgi.setMute(J1C.LIZ(i, 0, getMAweme()));
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

    public static /* synthetic */ void LJI(JHN jhn, String str) {
        jhn.LJFF(str, new HashMap());
    }

    public final void LJFF(String str, java.util.Map<String, ? extends Object> map) {
        if (o.LJ(str, "timeupdate")) {
            this.LJZI = str;
            InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr = this.LJLZ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(str, map);
                return;
            }
            return;
        }
        if (!(!TextUtils.equals(this.LJZI, str))) {
            return;
        }
        this.LJZI = str;
        InterfaceC88471Ynr<? super String, ? super java.util.Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr2 = this.LJLZ;
        if (interfaceC88471Ynr2 == null) {
            return;
        }
        interfaceC88471Ynr2.invoke(str, map);
    }

    public final void LJIIIIZZ(int i, boolean z) {
        InterfaceC46330IGg interfaceC46330IGg;
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            float f = i;
            if (mPlayVideoHelper.LIZIZ() && (interfaceC46330IGg = mPlayVideoHelper.LJI) != null) {
                interfaceC46330IGg.LJJJLL(mPlayVideoHelper.LIZLLL);
                mPlayVideoHelper.LJI.setSurface(mPlayVideoHelper.LIZJ.getSurface());
                mPlayVideoHelper.LJI.LJI(f);
            }
        }
        if (z) {
            play();
        } else {
            pause();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
