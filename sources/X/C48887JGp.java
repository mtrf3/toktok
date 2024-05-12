package X;

import Y.ALAdapterS6S0100000_8;
import Y.AObserverS76S0100000_8;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JGp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48887JGp extends FrameLayout implements JGK, C92U, InterfaceC48907JHj, InterfaceC48888JGq {
    public InterfaceC48890JGs LJLIL;
    public C48881JGj LJLILLLLZI;
    public ImageView LJLJI;
    public JGI LJLJJI;
    public boolean LJLJJL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJLL;
    public boolean LJLJL;
    public ViewGroup LJLJLJ;
    public ImageView LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public long LJLLILLLL;

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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return false;
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // X.InterfaceC48888JGq
    public final void onPause() {
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

    @Override // X.InterfaceC48888JGq
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public void setAutoPlay(boolean z) {
    }

    private final View getItemView() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LIZ;
        }
        return null;
    }

    private final C46331IGh getMPlayVideoHelper() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LJ;
        }
        return null;
    }

    private final RotateAnimation getMRotateAnimation() {
        return (RotateAnimation) this.LJLLI.getValue();
    }

    public final void LIZIZ() {
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            if (this.LJLJJL) {
                if (imageView.getVisibility() == 8) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new ALAdapterS6S0100000_8(imageView, 2));
                ofFloat.start();
            } else {
                imageView.setVisibility(8);
            }
            InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(8);
            }
        }
    }

    public final void LIZLLL() {
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
            InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(0);
            }
        }
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public void LLLJIL() {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.LLLJIL();
        }
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public void LLLLLJLJLL() {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.LLLLLJLJLL();
        }
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void contextPause() {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.contextPause();
        }
    }

    @Override // X.JGK
    public final void contextResume() {
        JGK jgk;
        C48880JGi LJI;
        JGI jgi = this.LJLJJI;
        if (jgi != null) {
            jgi.setVisibility(8);
        }
        JGI jgi2 = this.LJLJJI;
        if (jgi2 != null) {
            jgi2.setVisibility(0);
        }
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj == null || (LJI = c48881JGj.LJI()) == null || LJI.LJFF == null) {
            LIZLLL();
        }
        C48881JGj c48881JGj2 = this.LJLILLLLZI;
        if (c48881JGj2 != null && (jgk = c48881JGj2.LJIILJJIL) != null) {
            jgk.contextResume();
        }
    }

    public final long getCurrentPosition() {
        long j = this.LJLLILLLL;
        if (j > 0) {
            return j;
        }
        JGI jgi = this.LJLJJI;
        if (jgi != null) {
            return jgi.getCurrentPosition();
        }
        return 0L;
    }

    public final Aweme getMAweme() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LIZJ;
        }
        return null;
    }

    public final String getMEventType() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LJIILLIIL;
        }
        return null;
    }

    public final C49153JQv getMScrollStateManager() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LJIIIIZZ;
        }
        return null;
    }

    public final AbstractC49155JQx getMScrollStateObserver() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            return c48881JGj.LJIIIZ;
        }
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            c48881JGj.LJI();
        }
        JGI jgi = this.LJLJJI;
        if (jgi != null) {
            jgi.LLLLLJLJLL();
        }
        VideoPreloadManager.LJIILJJIL().cancelAll();
    }

    public final void LIZJ() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ);
            o.LJI(LJJIFFI);
            MutableLiveData<String> mutableLiveData = C3SZ.LIZ(LJJIFFI).LJLJL;
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(LJIIIIZZ);
            o.LJI(LJJIFFI2);
            C68182ly.LIZIZ(mutableLiveData, LJJIFFI2, new AObserverS76S0100000_8(this, 50));
        }
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return getItemView();
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
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (context = c48881JGj.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        WidgetManager.xl(activityC45651qj, null, getItemView(), activityC45651qj).Al(R.id.eq0, LIZ);
        return LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i;
        String str;
        C49153JQv mScrollStateManager;
        super.onAttachedToWindow();
        if (this.LJLJL) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                C68182ly.LIZ(LJJIFFI, this);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" register ");
        AbstractC49155JQx mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            i = mScrollStateObserver.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (!C46447IKt.LJLJLJ && (mScrollStateManager = getMScrollStateManager()) != null) {
            mScrollStateManager.LJII(getMScrollStateObserver());
        }
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme mAweme = getMAweme();
        JQA jqa = null;
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            jqa = c48881JGj.LJIJJLI;
        }
        concurrentHashMap.put(str, new WeakReference<>(jqa));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int i;
        C49153JQv mScrollStateManager;
        super.onDetachedFromWindow();
        if (this.LJLJL) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                C68182ly.LIZLLL(LJJIFFI, this);
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
        if (!C46447IKt.LJLJLJ && (mScrollStateManager = getMScrollStateManager()) != null) {
            mScrollStateManager.LJIIIIZZ(getMScrollStateObserver());
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void g9() {
        LIZLLL();
    }

    public final JGI getCore() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<Integer, C76800UCe> getCoverVisibilityChangeListener() {
        return this.LJLJJLL;
    }

    public final C48881JGj getDataProvider() {
        return this.LJLILLLLZI;
    }

    public final boolean getEnableHideCoverAnim() {
        return this.LJLJJL;
    }

    public final boolean getEnableLifecycleObserver() {
        return this.LJLJL;
    }

    public final ImageView getMCoverView() {
        return this.LJLJI;
    }

    public final InterfaceC48890JGs getVideoPlayerStatusListener() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    public final void onResume() {
        contextResume();
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    private final void setMAweme(Aweme aweme) {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LIZJ = aweme;
    }

    private final void setMEventType(String str) {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        c48881JGj.LJIILLIIL = str;
    }

    public void LIZ(Aweme aweme) {
        JQA jqa;
        C48881JGj c48881JGj;
        String str;
        o.LJIIIZ(aweme, "aweme");
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        String aid = aweme.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        C48881JGj c48881JGj2 = this.LJLILLLLZI;
        if (c48881JGj2 != null) {
            jqa = c48881JGj2.LJIJJLI;
        } else {
            jqa = null;
        }
        concurrentHashMap.put(aid, new WeakReference<>(jqa));
        setMAweme(aweme);
        JGI jgi = this.LJLJJI;
        if (jgi != null) {
            jgi.LJIIJJI(aweme);
        }
        if (getMAweme() != null && getMAweme() != null) {
            LIZLLL();
        }
        if (JP2.LIZ(getMAweme()) && (c48881JGj = this.LJLILLLLZI) != null) {
            JQA jqa2 = c48881JGj.LJIJJLI;
            if (jqa2 != null && (str = jqa2.LJJIJIIJI) != null) {
                str2 = str;
            }
            c48881JGj.LJII(str2);
        }
        LJ(false);
    }

    public final void LJ(boolean z) {
        if (!this.LJLL) {
            return;
        }
        if (z) {
            ImageView imageView = this.LJLJLLL;
            if (imageView != null && imageView.getVisibility() == 0) {
                return;
            }
            ImageView imageView2 = this.LJLJLLL;
            if (imageView2 != null) {
                imageView2.startAnimation(getMRotateAnimation());
            }
            ImageView imageView3 = this.LJLJLLL;
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(0);
            return;
        }
        ImageView imageView4 = this.LJLJLLL;
        if (imageView4 != null && imageView4.getVisibility() == 8) {
            return;
        }
        ImageView imageView5 = this.LJLJLLL;
        if (imageView5 != null) {
            imageView5.clearAnimation();
        }
        ImageView imageView6 = this.LJLJLLL;
        if (imageView6 == null) {
            return;
        }
        imageView6.setVisibility(8);
    }

    public final void LJFF(C46276IEe c46276IEe) {
        InterfaceC48890JGs interfaceC48890JGs = this.LJLIL;
        if (interfaceC48890JGs != null) {
            interfaceC48890JGs.LIZ(c46276IEe);
        }
    }

    @Override // X.JGK
    public final void Wf(int i) {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.Wf(i);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    LJ(false);
                    return;
                }
                LJ(true);
                return;
            }
            LJ(false);
            return;
        }
        LJ(false);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        int i;
        OnUIPlayListener onUIPlayListener;
        String str;
        JGK jgk;
        String str2 = null;
        LJFF(new C46276IEe((Object) null));
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
                str2 = mAweme.getAid();
            }
            objArr[0] = str2;
            objArr[1] = Boolean.valueOf(z);
            o.LJIIIIZZ(C16880lQ.LLLZ("onBuffering: sourceId=%s, start=%s", Arrays.copyOf(objArr, 2)), "format(format, *args)");
        }
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onBuffering(z);
        }
        C48881JGj c48881JGj2 = this.LJLILLLLZI;
        if (c48881JGj2 != null && (onUIPlayListener = c48881JGj2.LJIILL) != null) {
            Aweme mAweme2 = getMAweme();
            if (mAweme2 == null || (str = mAweme2.getAid()) == null) {
                str = "";
            }
            onUIPlayListener.onBuffering(str, z);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onDecoderBuffering(z);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        JGK jgk;
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            this.LJLLILLLL = mPlayVideoHelper.LIZLLL();
        }
        Wf(1);
        LJFF(new C46276IEe(4));
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPausePlay(str);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Wf(4);
        LJFF(new C46276IEe(7));
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        JGK jgk;
        LJFF(new C46276IEe(6));
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPlayCompletedFirstTime(str);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        JGK jgk;
        LJFF(new C46276IEe(1));
        Wf(1);
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPlayFailed(ipg);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C48880JGi LJI;
        C48880JGi LJI2;
        InterfaceC46330IGg interfaceC46330IGg;
        StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayStop: sourceId=", str, ", playing: ");
        C48881JGj c48881JGj = this.LJLILLLLZI;
        Boolean bool = null;
        if (c48881JGj != null && (LJI2 = c48881JGj.LJI()) != null && (interfaceC46330IGg = LJI2.LJFF) != null) {
            bool = Boolean.valueOf(interfaceC46330IGg.isPlaying());
        }
        LIZIZ.append(bool);
        X1D.LIZIZ(LIZIZ);
        LJFF(new C46276IEe(12));
        Wf(1);
        C48881JGj c48881JGj2 = this.LJLILLLLZI;
        if (c48881JGj2 == null || (LJI = c48881JGj2.LJI()) == null || LJI.LJFF == null) {
            LIZLLL();
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        JGK jgk;
        Wf(2);
        LJFF(new C46276IEe(2));
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPreparePlay(str);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        String str;
        OnUIPlayListener onUIPlayListener;
        JGK jgk;
        if (it4 != null) {
            str = it4.getId();
        } else {
            str = null;
        }
        LIZIZ();
        LJFF(new C46276IEe(5, 0));
        if (TextUtils.equals(getMEventType(), "homepage_follow") && (getContext() instanceof ActivityC45651qj)) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            o.LJI(LJJIFFI);
            ViewModelProviders.of(LJJIFFI).get(FollowPageFirstFrameViewModel.class).getClass();
        }
        C46315IFr.LIZ();
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onRenderFirstFrame(it4);
        }
        C48881JGj c48881JGj2 = this.LJLILLLLZI;
        if (c48881JGj2 != null && (onUIPlayListener = c48881JGj2.LJIILL) != null) {
            onUIPlayListener.onRenderFirstFrame(str, it4);
        }
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
        LJFF(new C46276IEe(0, 0));
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        JGK jgk;
        InterfaceC46330IGg interfaceC46330IGg;
        LIZIZ();
        Wf(0);
        C46331IGh mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null && (interfaceC46330IGg = mPlayVideoHelper.LJI) != null) {
            interfaceC46330IGg.getDuration();
        }
        C46331IGh mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            mPlayVideoHelper2.LIZLLL();
        }
        LJFF(new C46276IEe());
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onResumePlay(str);
        }
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onRetryOnError(ipg);
        }
    }

    public final void setCore(JGI jgi) {
        this.LJLJJI = jgi;
    }

    public final void setCoverVisibilityChangeListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLJJLL = interfaceC88472Yns;
    }

    public final void setCurrentPosition(long j) {
        this.LJLLILLLL = j;
    }

    public final void setDataProvider(C48881JGj c48881JGj) {
        this.LJLILLLLZI = c48881JGj;
    }

    public final void setEnableHideCoverAnim(boolean z) {
        this.LJLJJL = z;
    }

    public final void setEnableLifecycleObserver(boolean z) {
        this.LJLJL = z;
    }

    public final void setMCoverView(ImageView imageView) {
        this.LJLJI = imageView;
    }

    public final void setMScrollStateManager(C49153JQv c49153JQv) {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LJIIIIZZ = c49153JQv;
    }

    public final void setMScrollStateObserver(AbstractC49155JQx abstractC49155JQx) {
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj == null) {
            return;
        }
        c48881JGj.LJIIIZ = abstractC49155JQx;
    }

    public final void setVideoPlayerStatusListener(InterfaceC48890JGs interfaceC48890JGs) {
        this.LJLIL = interfaceC48890JGs;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48887JGp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C48887JGp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C48881JGj c48881JGj;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        InterfaceC47247IgV surfaceHolder;
        a1.LJFF(context, "context");
        int i2 = 1;
        this.LJLL = true;
        this.LJLLI = C221108m2.LIZIZ(C48922JHy.LJLIL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bb8});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.SearchVideoView)");
        this.LJLL = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (C49500Jbk.LIZ()) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            C38619FDr.LIZIZ(R.layout.chy, context2, this, true);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.chy, this, true);
        }
        this.LJLJLJ = (ViewGroup) findViewById(R.id.fnp);
        this.LJLJJI = (JGI) findViewById(R.id.l60);
        ImageView imageView = (ImageView) findViewById(R.id.f6h);
        this.LJLJLLL = imageView;
        if (!this.LJLL && imageView != null) {
            imageView.setVisibility(8);
        }
        JGI jgi = this.LJLJJI;
        C50321Joz c50321Joz = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (jgi != null) {
            c48881JGj = jgi.getDataProvider();
        } else {
            c48881JGj = null;
        }
        this.LJLILLLLZI = c48881JGj;
        JGI jgi2 = this.LJLJJI;
        if (jgi2 != null) {
            jgi2.setMVideoViewListener(this);
        }
        JGI jgi3 = this.LJLJJI;
        if (jgi3 != null) {
            jgi3.setMPlayerViewListener(this);
        }
        JGI jgi4 = this.LJLJJI;
        if (jgi4 != null) {
            C48881JGj c48881JGj2 = this.LJLILLLLZI;
            C50652JuK.Companion.getClass();
            C50321Joz LIZLLL = C50651JuJ.LIZLLL(this);
            if (LIZLLL != null) {
                ISearchContextAbility LJJJJJ = C17N.LJJJJJ(this);
                if (LJJJJJ != null && (If = LJJJJJ.If()) != null && (LIZJ = If.LIZJ()) != null) {
                    TMC.LJIIJ(new C50652JuK(objArr2 == true ? 1 : 0, new C50438Jqs(LIZLLL, null, 2, null), i2, objArr == true ? 1 : 0), LIZJ, "SearchVideoView 225");
                }
                c50321Joz = LIZLLL;
            }
            jgi4.setMVideoMobListener(new C48894JGw(c48881JGj2, c50321Joz));
        }
        JGI jgi5 = this.LJLJJI;
        if (jgi5 != null) {
            jgi5.LJIIJ();
        }
        JGI jgi6 = this.LJLJJI;
        if (jgi6 != null && (surfaceHolder = jgi6.getSurfaceHolder()) != null) {
            surfaceHolder.N7(new C48889JGr(this));
        }
        getMPlayVideoHelper();
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZJ();
        } else {
            C243119gR.LIZ(new AqS158S0100000_8(this, 260));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        JGK jgk;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null && (jgk = c48881JGj.LJIILJJIL) != null) {
            jgk.onPlayProgressChange(str, j, j2);
        }
    }
}
