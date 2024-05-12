package X;

import Y.ARunnableS27S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import defpackage.a1;
import defpackage.i0;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS61S1100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class KMZ extends AbstractC79989VaL implements GenericLifecycleObserver, OnUIPlayListener {
    public static SoftReference<InterfaceC46330IGg> LLIIIZ;
    public boolean LJLILLLLZI;
    public android.net.Uri LJLJI;
    public Aweme LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public String LJZI;
    public boolean LJZL;
    public boolean LL;
    public String LLD;
    public final IResourceLoaderService LLF;
    public boolean LLFF;
    public int LLFFF;
    public boolean LLFII;
    public C48679J8p LLFZ;
    public InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super AbstractC79989VaL, C76800UCe> LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C62822Ol8 LLIIII;
    public C47689Ind LLIIIILZ;
    public C47689Ind LLIIIJ;
    public final C62846OlW LLIIIL;

    public InterfaceC46330IGg LJIIIZ() {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onHostResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onHostPause(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onHostDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.AbstractC79989VaL
    public void setDeviceChangeAware(boolean z) {
    }

    @Override // X.AbstractC79989VaL
    public void setPreload(boolean z) {
    }

    private final InterfaceC46330IGg getMPlayer() {
        return (InterfaceC46330IGg) this.LLIFFJFJJ.getValue();
    }

    private final String getMReactSessionId() {
        return (String) this.LLIIII.getValue();
    }

    private final TextureViewSurfaceTextureListenerC51581KMf getSurfaceListener() {
        return (TextureViewSurfaceTextureListenerC51581KMf) this.LLII.getValue();
    }

    @Override // X.AbstractC79989VaL
    public void LIZIZ() {
        if (this.LJLLLLLL) {
            LJIILL();
        }
    }

    @Override // X.AbstractC79989VaL
    public void LIZJ() {
        if (this.LJLJJI != null) {
            LJIIJJI();
            if (getPlayer() != null) {
                LJIIL("onZoomChange", C113554cx.LJJJLZIJ(new OSZ("zoom", 1)));
                return;
            }
            return;
        }
        android.net.Uri uri = this.LJLJI;
        if (uri != null && uri.isHierarchical()) {
            LJIIJJI();
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                String str = this.LLD;
                boolean z = this.LJLLI;
                String LIZJ = C38352F3k.LIZJ(str);
                o.LJIIIIZZ(LIZJ, "md5Hex(mPlayUrl)");
                createIMainServicebyMonsterPlugin.startVideoPlayActivity(context, str, "", z, str, LIZJ, "hybrid", "", this.LJLLLL);
            }
            this.LJLLLL = 0.0f;
        }
    }

    public final void LJI() {
        InterfaceC46330IGg interfaceC46330IGg;
        if (this.LJLJJL) {
            C48679J8p c48679J8p = this.LLFZ;
            if (c48679J8p != null && (interfaceC46330IGg = c48679J8p.LIZIZ) != null) {
                interfaceC46330IGg.LJIJJ();
                return;
            }
            return;
        }
        C48679J8p c48679J8p2 = this.LLFZ;
        if (c48679J8p2 == null) {
            return;
        }
        float f = this.LJLLL;
        InterfaceC46330IGg interfaceC46330IGg2 = c48679J8p2.LIZIZ;
        if (interfaceC46330IGg2 == null) {
            return;
        }
        interfaceC46330IGg2.LJJIIJZLJL(f, f);
    }

    public void LJIIIIZZ() {
        InterfaceC46330IGg interfaceC46330IGg;
        InterfaceC46330IGg interfaceC46330IGg2;
        InterfaceC46330IGg player;
        if (this.LJLJJLL > 0 && (player = getPlayer()) != null) {
            player.LJJJZ();
        }
        C48679J8p c48679J8p = this.LLFZ;
        if (c48679J8p != null && (interfaceC46330IGg2 = c48679J8p.LIZIZ) != null) {
            interfaceC46330IGg2.LJIILJJIL();
        }
        C48679J8p c48679J8p2 = this.LLFZ;
        if (c48679J8p2 != null && (interfaceC46330IGg = c48679J8p2.LIZIZ) != null && interfaceC46330IGg.LJJLIIIJLJLI(c48679J8p2.LIZ) && 1 != 0) {
            interfaceC46330IGg.LJJJLL(null);
        }
    }

    public final void LJIIJ() {
        C47689Ind c47689Ind = this.LLIIIILZ;
        if (c47689Ind != null) {
            c47689Ind.setAlpha(1.0f);
        }
        this.LLIIIL.setAlpha(0.0f);
        C47689Ind c47689Ind2 = this.LLIIIJ;
        if (c47689Ind2 != null) {
            if (C78996UzQ.LJJIIJZLJL(c47689Ind2)) {
                C78996UzQ.LJI();
            }
            removeView(c47689Ind2);
        }
    }

    public final void LJIIJJI() {
        InterfaceC46330IGg player;
        InterfaceC46330IGg interfaceC46330IGg;
        C48679J8p c48679J8p = this.LLFZ;
        if (c48679J8p != null && (interfaceC46330IGg = c48679J8p.LIZIZ) != null) {
            interfaceC46330IGg.LJIILJJIL();
        }
        if (this.LJLJJLL > 0 && (player = getPlayer()) != null) {
            player.LJJJZ();
        }
    }

    public final void LJIILL() {
        String str;
        InterfaceC78716Uuu interfaceC78716Uuu;
        if (this.LJLILLLLZI) {
            LJIIIIZZ();
            this.LLIIIJ = this.LLIIIILZ;
            C47689Ind c47689Ind = new C47689Ind(getContext(), null);
            c47689Ind.setAlpha(0.0f);
            this.LLIIIILZ = c47689Ind;
            addView(c47689Ind, -1, -1);
            C48679J8p c48679J8p = new C48679J8p(this.LLIIIILZ, this);
            this.LLFZ = c48679J8p;
            c48679J8p.LIZIZ = getMPlayer();
            C47689Ind c47689Ind2 = this.LLIIIILZ;
            if (c47689Ind2 != null) {
                c47689Ind2.setSurfaceTextureListener(getSurfaceListener());
            }
            C48679J8p c48679J8p2 = this.LLFZ;
            if (c48679J8p2 != null) {
                c48679J8p2.LJFF = this.LJLLI;
                android.net.Uri uri = this.LJLJI;
                if (uri != null && uri.isHierarchical()) {
                    c48679J8p2.LJ = this.LLD;
                } else {
                    c48679J8p2.LIZLLL = this.LJLJJI;
                }
            }
            requestLayout();
            String str2 = this.LJLLILLLL;
            if (this.LLIIIL.getTag() == null && (str = this.LJLLILLLL) != null && str.length() > 0 && str2 != null) {
                C62846OlW c62846OlW = this.LLIIIL;
                c62846OlW.setAlpha(1.0f);
                V92 hierarchy = c62846OlW.getHierarchy();
                String str3 = this.LJLJL;
                if (o.LJ(str3, "contain")) {
                    interfaceC78716Uuu = InterfaceC78716Uuu.LJJL;
                } else if (o.LJ(str3, "cover")) {
                    interfaceC78716Uuu = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
                } else {
                    interfaceC78716Uuu = InterfaceC78716Uuu.LJJJLZIJ;
                }
                hierarchy.LJIILJJIL(interfaceC78716Uuu);
                C78765Uvh.LJIIIZ(c62846OlW, this.LJLLILLLL, -1, -1);
                c62846OlW.setTag(this.LJLLILLLL);
            }
        } else {
            LJI();
        }
        LJ(new AqS158S0100000_8(this, 46));
        this.LJLLLLLL = false;
        this.LJLILLLLZI = false;
    }

    public void release() {
        InterfaceC46330IGg interfaceC46330IGg;
        C48679J8p c48679J8p = this.LLFZ;
        if (c48679J8p != null && (interfaceC46330IGg = c48679J8p.LIZIZ) != null) {
            interfaceC46330IGg.release();
        }
    }

    @Override // X.AbstractC79989VaL
    public void LIZLLL() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            topActivity.finish();
        }
    }

    public InterfaceC46330IGg getPlayer() {
        return getMPlayer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLFF = true;
        LJIIIIZZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onHostDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        Context context = getContext();
        Object obj = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            obj = contextWrapper.getBaseContext();
        }
        if ((obj instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) obj) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // X.AbstractC79989VaL
    public void pause() {
        LJIIJJI();
        this.LLFII = true;
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (getWidth() > 0 && getHeight() > 0) {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getLeft() + getPaddingLeft(), getTop() + getPaddingTop(), getLeft() + getPaddingLeft() + getWidth(), getTop() + getPaddingTop() + getHeight());
        }
    }

    @Override // X.AbstractC79989VaL
    public final void LIZ() {
        release();
    }

    public final int getCompleteCount() {
        return this.LLFFF;
    }

    public final C47689Ind getMTextureView() {
        return this.LLIIIILZ;
    }

    public final C48679J8p getMVideoControl() {
        return this.LLFZ;
    }

    @Override // X.AbstractC79989VaL
    public void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Boolean bool;
        Video LIZ;
        Video LIZ2;
        if (this.LL) {
            LJIILJJIL(interfaceC65784Pro);
            return;
        }
        C48679J8p c48679J8p = this.LLFZ;
        if (c48679J8p != null) {
            bool = Boolean.valueOf(c48679J8p.LIZJ());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE) && !this.LLFF) {
            postDelayed(new ARunnableS27S0200000_8(interfaceC65784Pro, this, 13), 100L);
            return;
        }
        boolean z = true;
        if (this.LJZL) {
            this.LJZL = false;
            C48679J8p c48679J8p2 = this.LLFZ;
            if (c48679J8p2 != null) {
                int i = this.LJLL;
                if (!c48679J8p2.LIZJ() && ((c48679J8p2.LIZLLL != null || c48679J8p2.LIZIZ() != null) && (LIZ2 = c48679J8p2.LIZ()) != null)) {
                    InterfaceC46330IGg interfaceC46330IGg = c48679J8p2.LIZIZ;
                    if (interfaceC46330IGg != null) {
                        interfaceC46330IGg.LJJJLL(c48679J8p2.LIZ);
                    }
                    InterfaceC46330IGg interfaceC46330IGg2 = c48679J8p2.LIZIZ;
                    if (interfaceC46330IGg2 != null) {
                        interfaceC46330IGg2.setSurface(c48679J8p2.LIZJ.getSurface());
                    }
                    InterfaceC46330IGg interfaceC46330IGg3 = c48679J8p2.LIZIZ;
                    if (interfaceC46330IGg3 != null) {
                        C46744IWe c46744IWe = new C46744IWe();
                        c46744IWe.LIZ.LJII = true;
                        SimVideo LJJJJ = C51029K0z.LJJJJ(LIZ2);
                        C46745IWf c46745IWf = c46744IWe.LIZ;
                        c46745IWf.LIZJ = LJJJJ;
                        c46745IWf.LJIIIZ = true;
                        c46745IWf.LJIIJ = i;
                        c46745IWf.LJIILL = c48679J8p2.LJFF;
                        interfaceC46330IGg3.LJJJI(c46744IWe.LIZ());
                    }
                }
            }
            LJI();
        } else {
            C48679J8p c48679J8p3 = this.LLFZ;
            if (c48679J8p3 != null && !c48679J8p3.LIZJ() && ((c48679J8p3.LIZLLL != null || c48679J8p3.LIZIZ() != null) && (LIZ = c48679J8p3.LIZ()) != null)) {
                InterfaceC46330IGg interfaceC46330IGg4 = c48679J8p3.LIZIZ;
                if (interfaceC46330IGg4 != null) {
                    interfaceC46330IGg4.LJJJLL(c48679J8p3.LIZ);
                }
                InterfaceC46330IGg interfaceC46330IGg5 = c48679J8p3.LIZIZ;
                if (interfaceC46330IGg5 != null) {
                    interfaceC46330IGg5.setSurface(c48679J8p3.LIZJ.getSurface());
                }
                InterfaceC46330IGg interfaceC46330IGg6 = c48679J8p3.LIZIZ;
                if (interfaceC46330IGg6 != null) {
                    Aweme aweme = c48679J8p3.LIZLLL;
                    if (aweme == null || !OUP.LJJIII(aweme)) {
                        z = false;
                    }
                    interfaceC46330IGg6.LJJIFFI(LIZ, z, c48679J8p3.LIZ, 0);
                }
            }
        }
        this.LLFII = false;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public Aweme LJIILIIL(String str) {
        return (Aweme) new C38341F2z(Aweme.class).LIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(X.InterfaceC65784Pro<X.C76800UCe> r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMZ.LJIILJJIL(X.Pro):void");
    }

    public final boolean LJIILLIIL(String str) {
        String str2;
        if (!o.LJ(str, this.LLD)) {
            Aweme aweme = this.LJLJJI;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            if (!o.LJ(str, str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        LJIIL("onBuffering", C113554cx.LJJJLZIJ(new OSZ("buffer", Integer.valueOf(z ? 1 : 0))));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onHostPause(LifecycleOwner source) {
        o.LJIIIZ(source, "source");
        InterfaceC46330IGg player = getPlayer();
        if (player != null && player.isPlaying() && this.LJLLJ && !this.LJLJLJ) {
            LJIIJJI();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume(LifecycleOwner source) {
        o.LJIIIZ(source, "source");
        InterfaceC46330IGg player = getPlayer();
        if (player != null && !player.isPlaying() && this.LJLLJ && !this.LLFII && !this.LJLJLJ) {
            LJ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (LJIILLIIL(str)) {
            LJIIL("onPause", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        if (LJIILLIIL(str)) {
            int i = this.LLFFF;
            this.LLFFF = i + 1;
            LJIIL("onCompleted", C113554cx.LJJJLZIJ(new OSZ("times", Integer.valueOf(i))));
            if (!this.LJLLI && this.LL) {
                LJFF(0, false);
                LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (LJIILLIIL(str)) {
            LJIIL("onFirstCompleted", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(IPG error) {
        o.LJIIIZ(error, "error");
        if (LJIILLIIL(error.LIZ)) {
            LJIIL("onPlayFailed", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        long j;
        this.LJLLLL = f;
        OSZ[] oszArr = new OSZ[1];
        InterfaceC46330IGg player = getPlayer();
        if (player != null) {
            j = player.getCurrentPosition();
        } else {
            j = 0;
        }
        oszArr[0] = new OSZ("progress", Integer.valueOf((int) j));
        LJIIL("onProgressChange", C113554cx.LJJJLZIJ(oszArr));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        if (LJIILLIIL(sourceId)) {
            LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        if (LJIILLIIL(str)) {
            LJIIL("onPreparePlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 event) {
        o.LJIIIZ(event, "event");
        if (LJIILLIIL(event.getId())) {
            LJIIJ();
            this.LJLLLL = 0.0f;
            LJIIL("onFirstFrame", new HashMap());
            LJIIL("onPlay", new HashMap());
            if (this.LLFII) {
                pause();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH playerEvent) {
        o.LJIIIZ(playerEvent, "playerEvent");
        if (LJIILLIIL(playerEvent.LIZ)) {
            LJIIL("onRenderReady", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (LJIILLIIL(str)) {
            LJIIL("onPlay", new HashMap());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG obj) {
        o.LJIIIZ(obj, "obj");
        LJIIL("onError", C113554cx.LJJJLZIJ(new OSZ("message", obj.toString())));
    }

    @Override // X.AbstractC79989VaL
    public void setAutoLifecycle(boolean z) {
        this.LJLLJ = z;
    }

    @Override // X.AbstractC79989VaL
    public void setAutoPlay(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setCompleteCount(int i) {
        this.LLFFF = i;
    }

    @Override // X.AbstractC79989VaL
    public void setInitTime(int i) {
        if (this.LJLL != i) {
            this.LJLLLLLL = true;
        }
        this.LJLL = i;
    }

    @Override // X.AbstractC79989VaL
    public void setLoop(boolean z) {
        boolean z2;
        if (z != this.LJLLI) {
            z2 = true;
            this.LJLLLLLL = true;
        } else {
            z2 = false;
        }
        this.LJLILLLLZI = z2;
        this.LJLLI = z;
    }

    public final void setMTextureView(C47689Ind c47689Ind) {
        this.LLIIIILZ = c47689Ind;
    }

    public final void setMVideoControl(C48679J8p c48679J8p) {
        this.LLFZ = c48679J8p;
    }

    @Override // X.AbstractC79989VaL
    public void setMuted(boolean z) {
        if (this.LJLJJL != z) {
            this.LJLLLLLL = true;
        }
        this.LJLJJL = z;
    }

    @Override // X.AbstractC79989VaL
    public void setObjectFit(String objectFit) {
        o.LJIIIZ(objectFit, "objectFit");
        this.LJLJL = objectFit;
    }

    @Override // X.AbstractC79989VaL
    public void setPoster(String poster) {
        o.LJIIIZ(poster, "poster");
        boolean z = !o.LJ(this.LJLLILLLL, poster);
        if (z) {
            this.LJLLLLLL = true;
        }
        this.LJLILLLLZI = z;
        this.LJLLILLLL = poster;
    }

    @Override // X.AbstractC79989VaL
    public void setRate(int i) {
        this.LJLJJLL = i;
    }

    @Override // X.AbstractC79989VaL
    public void setSinglePlayer(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.AbstractC79989VaL
    public void setSrc(String src) {
        Object obj;
        String queryParameter;
        int i;
        int i2;
        Integer LJJIL;
        Integer LJJIL2;
        o.LJIIIZ(src, "src");
        if (!o.LJ(this.LJZI, src)) {
            this.LJZI = src;
            this.LJZL = true;
        }
        String str = null;
        try {
            if (ujb.o.LJJJLIIL(src, "video://", false)) {
                obj = UriProtector.parse(src);
            } else {
                obj = LJIILIIL(src);
            }
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            obj = (Void) LIZ;
        }
        if (obj != null) {
            if (obj instanceof android.net.Uri) {
                if (!o.LJ(this.LJLJI, obj)) {
                    this.LJLLLLLL = true;
                    this.LJLILLLLZI = true;
                }
                android.net.Uri uri = (android.net.Uri) obj;
                this.LJLJI = uri;
                if (o.LJ("false", UriProtector.getQueryParameter(uri, "play_legacy"))) {
                    this.LL = false;
                } else {
                    this.LL = true;
                }
                android.net.Uri uri2 = this.LJLJI;
                this.LJLZ = 0;
                this.LJZ = 0;
                if (uri2 != null && uri2.isHierarchical()) {
                    String queryParameter2 = UriProtector.getQueryParameter(uri2, "width");
                    if (queryParameter2 != null && (LJJIL2 = C38350F3i.LJJIL(queryParameter2)) != null) {
                        i = LJJIL2.intValue();
                    } else {
                        i = 0;
                    }
                    this.LJLZ = i;
                    String queryParameter3 = UriProtector.getQueryParameter(uri2, "height");
                    if (queryParameter3 != null && (LJJIL = C38350F3i.LJJIL(queryParameter3)) != null) {
                        i2 = LJJIL.intValue();
                    } else {
                        i2 = 0;
                    }
                    this.LJZ = i2;
                }
                android.net.Uri uri3 = this.LJLJI;
                if (uri3 != null && uri3.isHierarchical() && (queryParameter = UriProtector.getQueryParameter(uri3, "play_url")) != null) {
                    if (this.LL) {
                        boolean z = !o.LJ(queryParameter, this.LLD);
                        if (z) {
                            this.LJLLLLLL = true;
                        }
                        this.LJLILLLLZI = z;
                        this.LJZL = z;
                        this.LLD = queryParameter;
                        LJIILL();
                        return;
                    }
                    IResourceLoaderService iResourceLoaderService = this.LLF;
                    if (iResourceLoaderService == null) {
                        return;
                    }
                    O1L o1l = new O1L("");
                    C51587KMl c51587KMl = new C51587KMl(false);
                    c51587KMl.LIZ = C47261Igj.LJJIJIL(EnumC60489Nob.GECKO, EnumC60489Nob.BUILTIN);
                    o1l.LIZ = c51587KMl;
                    iResourceLoaderService.loadAsync(queryParameter, o1l, new AqS61S1100000_8(this, queryParameter, 9), new AqS61S1100000_8(this, queryParameter, 10));
                    return;
                }
                return;
            }
            if (!(obj instanceof Aweme)) {
                return;
            }
            if (this.LJLJI == null) {
                Aweme aweme = this.LJLJJI;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                if (!o.LJ(str, ((Aweme) obj).getAid())) {
                    this.LJLLLLLL = true;
                    this.LJLILLLLZI = true;
                }
            }
            this.LJLJJI = (Aweme) obj;
        }
    }

    @Override // X.AbstractC79989VaL
    public void setStateChangeReporter(InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super AbstractC79989VaL, C76800UCe> interfaceC88473Ynt) {
        this.LLI = interfaceC88473Ynt;
    }

    @Override // X.AbstractC79989VaL
    public void setVolume(float f) {
        if (this.LJLLL != f) {
            this.LJLLLLLL = true;
        }
        this.LJLLL = f;
    }

    @Override // X.AbstractC79989VaL
    public final void LJFF(int i, boolean z) {
        this.LJZL = true;
        this.LJLL = i;
        LJ(new C48915JHr(this, z, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1 > r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r1 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r4 = r4 / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r1 > r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r8, int r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJI
            if (r0 == 0) goto L76
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJI
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r6 = r0.getWidth()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJI
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r3 = r0.getHeight()
        L27:
            X.Ind r5 = r7.LLIIIILZ
            java.lang.String r2 = r7.LJLJL
            java.lang.String r0 = "objectFit"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r9 <= 0) goto L38
            if (r8 <= 0) goto L38
            if (r6 <= 0) goto L38
            if (r3 > 0) goto L39
        L38:
            return
        L39:
            float r1 = (float) r9
            float r0 = (float) r8
            float r1 = r1 / r0
            float r4 = (float) r3
            float r0 = (float) r6
            float r4 = r4 / r0
            java.lang.String r0 = "cover"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L65
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L71
        L4d:
            float r1 = r1 / r4
        L4e:
            r3 = r1
            r4 = 1065353216(0x3f800000, float:1.0)
        L51:
            if (r5 == 0) goto L38
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r0 = r8 >> 1
            float r1 = (float) r0
            int r0 = r9 >> 1
            float r0 = (float) r0
            r2.setScale(r3, r4, r1, r0)
            r5.setTransform(r2)
            goto L38
        L65:
            java.lang.String r0 = "contain"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L73
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L4d
        L71:
            float r4 = r4 / r1
            goto L51
        L73:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L4e
        L76:
            android.net.Uri r0 = r7.LJLJI
            if (r0 == 0) goto L7f
            int r6 = r7.LJLZ
            int r3 = r7.LJZ
            goto L27
        L7f:
            r6 = 0
            r3 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMZ.LJII(int, int):void");
    }

    public final void LJIIL(String str, java.util.Map<String, ? extends Object> map) {
        System.out.println((Object) i0.LJFF("DeclarativeVideoPlayBox- ", str));
        InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super AbstractC79989VaL, C76800UCe> interfaceC88473Ynt = this.LLI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(str, map, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        a1.LJFF(context, "context");
        this.LJLJJLL = 166;
        this.LJLJL = "fill";
        this.LJLLILLLL = "";
        this.LJLLL = 1.0f;
        this.LJZI = "";
        this.LL = true;
        this.LLD = "";
        this.LLF = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class);
        this.LLFFF = 1;
        this.LLFII = true;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new C51578KMc(this));
        this.LLII = C221108m2.LIZ(EnumC221088m0.NONE, new AqS158S0100000_8(this, 47));
        this.LLIIII = C221108m2.LIZIZ(C51580KMe.LJLIL);
        C62846OlW c62846OlW = new C62846OlW(context);
        this.LLIIIL = c62846OlW;
        addView(c62846OlW, -1, -1);
        Object obj = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            obj = contextWrapper.getBaseContext();
        }
        if ((obj instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) obj) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
