package X;

import X.C16880lQ;
import X.C2NU;
import X.C38771FJn;
import X.C48272Ix2;
import X.EF7;
import X.GG9;
import X.GGA;
import X.InterfaceC69602oG;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS3S2100000_8;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS9S1100000_8;
import Y.IDBReceiverS6S0100000_6;
import Y.IDCListenerS115S0200000_8;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel;
import com.ss.android.ugc.aweme.pipfeed.components.single.ControlOverlayViewModel$isPlaying$1;
import com.ss.android.ugc.aweme.pipfeed.components.single.PipStatusViewViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS46S1000000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.JCg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48774JCg extends JEA implements JE6, OnUIPlayListener, AudioManager.OnAudioFocusChangeListener {
    public C47041IdB LJLJJLL;
    public C47246IgU LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final JEW LJLL;
    public final JEV LJLLI;
    public final JEV LJLLILLLL;
    public final JEV LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public SmartImageView LJLZ;
    public EnumC26410AYc LJZ;
    public String LJZI;
    public boolean LJZL;
    public boolean LL;
    public ARunnableS3S2100000_8 LLD;
    public final Keva LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;

    @Override // X.JEA
    public final void LJIIJJI() {
        C48777JCj.LJLJLJ = null;
        C47246IgU c47246IgU = this.LJLJL;
        if (c47246IgU != null) {
            c47246IgU.release();
        }
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            IGJ igj = c47041IdB.LIZJ;
            igj.getClass();
            igj.LJLIL.remove(this);
        }
    }

    public final java.util.Map<String, String> LJIILLIIL() {
        return C113554cx.LJJL(new OSZ("enter_method", this.LJZ.getMob()), new OSZ("is_floating_window", "1"));
    }

    public final java.util.Map<String, Object> LJIJ() {
        String str;
        String str2;
        Integer num;
        long j;
        int i;
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("enter_from", LJIJJ().LIZ);
        Aweme value = LJIJJLI().LJLIL.getValue();
        Long l = null;
        if (value == null || (str = value.getGroupId()) == null) {
            str = null;
        }
        oszArr[1] = new OSZ("group_id", str);
        Aweme value2 = LJIJJLI().LJLIL.getValue();
        if (value2 != null) {
            str2 = value2.getAuthorUid();
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("author_id", str2);
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            C48233IwP c48233IwP = c47041IdB.LIZLLL;
            if (c48233IwP != null) {
                i = c48233IwP.LJLJI.size();
            } else {
                i = c47041IdB.LJFF;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        oszArr[3] = new OSZ("video_cnt", num);
        C47041IdB c47041IdB2 = this.LJLJJLL;
        if (c47041IdB2 != null) {
            C48233IwP c48233IwP2 = c47041IdB2.LIZLLL;
            if (c48233IwP2 != null) {
                j = c48233IwP2.LIZJ();
            } else {
                j = c47041IdB2.LJI;
            }
            l = Long.valueOf(j);
        }
        oszArr[4] = new OSZ("duration", l);
        PipFeedManager.Companion.getClass();
        oszArr[5] = new OSZ("enter_method", JD9.LIZ.getExitReason$pipfeed_release());
        return C113554cx.LJJL(oszArr);
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
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
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
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
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
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
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
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
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
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
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

    @Override // X.JE6
    public final void LIZ() {
        LJJI(this, "onClickPlayNext");
        if (this.LL) {
            return;
        }
        Aweme value = LJIJJLI().LJLIL.getValue();
        FeedPipViewModel LJIJJLI = LJIJJLI();
        LJJII(true, value, (Aweme) ORZ.LJLLLLLL(LJIJJLI.LJLZ + 1, LJIJJLI.hv0()));
        LJIILL(EnumC26410AYc.CLICK);
    }

    @Override // X.JE6
    public final void LIZIZ() {
        ILD ild;
        LJJI(this, "onClickPause");
        if (this.LL) {
            return;
        }
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            ild = c47041IdB.LJ.LJLIL;
        } else {
            ild = null;
        }
        if (ild == ILD.PAUSED) {
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
            return;
        }
        if (c47041IdB != null) {
            c47041IdB.LIZ();
        }
        C48777JCj.LIZ();
    }

    @Override // X.JE6
    public final void LIZJ() {
        ILD ild;
        LJJI(this, "onClickResume");
        if (this.LL) {
            return;
        }
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            ild = c47041IdB.LJ.LJLIL;
        } else {
            ild = null;
        }
        if (ild == ILD.PLAYING) {
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.TRUE);
        } else {
            LJJIIZ(null);
        }
    }

    @Override // X.JE6
    public final void LJFF() {
        LJJI(this, "onClickPlayPrev");
        if (this.LL) {
            return;
        }
        boolean z = false;
        LJJII(false, LJIJJLI().LJLIL.getValue(), (Aweme) ORZ.LJLLLLLL(r0.LJLZ - 1, LJIJJLI().hv0()));
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            c47041IdB.LIZ();
        }
        LJIIZILJ().LJLJLJ.setValue(Float.valueOf(0.0f));
        LJIL().gv0(EnumC48779JCl.TRANSITION);
        FeedPipViewModel LJIJJLI = LJIJJLI();
        LJIJJLI.LJLLJ.setValue(Boolean.TRUE);
        LJIJJLI.kv0(LJIJJLI.LJLZ - 1);
        MutableLiveData<Boolean> mutableLiveData = LJIJJLI.LJLLL;
        if (LJIJJLI.LJLZ > 0) {
            z = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        LJIJJLI.LJLIL.setValue((FeedPipViewModel$currentAweme$1) ListProtector.get(LJIJJLI.hv0(), LJIJJLI.LJLZ));
    }

    @Override // X.JEA
    public final void LJIIJ() {
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        o.LJIIIIZZ(LJJLIIIIJ, "inst()");
        this.LJLJJLL = new C47041IdB(LJJLIIIIJ);
        Lifecycle lifecycle = ((JEY) LJIIIIZZ()).getLifecycle();
        o.LJIIIIZZ(lifecycle, "getLifecycleOwner().lifecycle");
        final C48272Ix2 c48272Ix2 = new C48272Ix2(new C48274Ix4(new AqS174S0100000_8(this, 231)));
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.ExtensionsKt$registerScreenInteractiveStateListener$1
            public final Context LJLIL = EF7.LIZIZ();

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = GG9.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C16880lQ.LJJLIIIJL(this.LJLIL, C48272Ix2.this);
                } else {
                    C16880lQ.LJJLIIIJILLIZJL(C48272Ix2.this, this.LJLIL, intentFilter);
                }
            }
        });
        Lifecycle lifecycle2 = ((JEY) LJIIIIZZ()).getLifecycle();
        o.LJIIIIZZ(lifecycle2, "getLifecycleOwner().lifecycle");
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 610);
        final Context LIZIZ = EF7.LIZIZ();
        final IntentFilter intentFilter2 = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
        final IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = new IDBReceiverS6S0100000_6(aqS158S0100000_8, 5);
        lifecycle2.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.ExtensionsKt$registerEarphoneUnplugListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = C38771FJn.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C16880lQ.LJJLIIIJL(LIZIZ, iDBReceiverS6S0100000_6);
                } else {
                    C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS6S0100000_6, LIZIZ, intentFilter2);
                }
            }
        });
        Lifecycle lifecycle3 = ((JEY) LJIIIIZZ()).getLifecycle();
        o.LJIIIIZZ(lifecycle3, "getLifecycleOwner().lifecycle");
        final C48786JCs l = C48786JCs.LJLIL;
        o.LJIIIZ(l, "l");
        lifecycle3.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.pipfeed.components.util.NetworkUtilsKt$whenNetworkTypeChange$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = GGA.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C2NU.LIZ.LIZLLL(new InterfaceC69602oG(l) { // from class: X.GGz
                        public final /* synthetic */ InterfaceC88471Ynr LJLIL;

                        {
                            o.LJIIIZ(function, "function");
                            this.LJLIL = function;
                        }

                        @Override // X.InterfaceC69602oG
                        public final /* synthetic */ void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
                            this.LJLIL.invoke(enumC111394Yt, enumC111394Yt2);
                        }
                    });
                    return;
                }
                C2NU.LIZ.LIZ(new InterfaceC69602oG(l) { // from class: X.GGz
                    public final /* synthetic */ InterfaceC88471Ynr LJLIL;

                    {
                        o.LJIIIZ(function, "function");
                        this.LJLIL = function;
                    }

                    @Override // X.InterfaceC69602oG
                    public final /* synthetic */ void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
                        this.LJLIL.invoke(enumC111394Yt, enumC111394Yt2);
                    }
                });
            }
        });
        LJIJJLI().LJZL = true;
    }

    public final ControlOverlayViewModel LJIIZILJ() {
        return (ControlOverlayViewModel) this.LJLLILLLL.getValue();
    }

    public final AbstractC48820JEa LJIJI() {
        return (AbstractC48820JEa) this.LLFF.getValue();
    }

    public final C48780JCm LJIJJ() {
        return (C48780JCm) this.LLFFF.getValue();
    }

    public final FeedPipViewModel LJIJJLI() {
        return (FeedPipViewModel) this.LJLL.getValue();
    }

    public final PipStatusViewViewModel LJIL() {
        return (PipStatusViewViewModel) this.LJLLJ.getValue();
    }

    public final boolean LJJ() {
        Display display;
        View view = this.LJLILLLLZI;
        if (view == null || (display = view.getDisplay()) == null || display.getState() != 1) {
            return false;
        }
        return true;
    }

    public final void LJJIIJZLJL() {
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            int i = IGV.LIZ[c47041IdB.LJ.LJLIL.ordinal()];
            if (i != 6 && i != 7) {
                return;
            }
            c47041IdB.LIZ();
        }
    }

    public C48774JCg() {
        super(R.id.kuk);
        this.LJLL = new JEW(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 172)), C65352Pkq.LIZ(FeedPipViewModel.class));
        this.LJLLI = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipFeedWindowVM.class));
        this.LJLLILLLL = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(ControlOverlayViewModel.class));
        this.LJLLJ = new JEV(C221108m2.LIZIZ(new AqS156S0100000_6((JEA) this, 173)), C65352Pkq.LIZ(PipStatusViewViewModel.class));
        this.LJLLL = "";
        this.LJLLLL = "";
        this.LJZ = EnumC26410AYc.CLICK;
        this.LJZI = "";
        this.LJZL = true;
        PipFeedManager.Companion.getClass();
        this.LLF = JD9.LIZ.getKeva();
        this.LLFF = C221108m2.LIZIZ(new AqS46S1000000_8("PipPlayerVC", 1));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 611));
    }

    @Override // X.JEA
    public final void LJIILIIL() {
        boolean z;
        long j;
        C48777JCj.LIZ();
        FeedPipViewModel LJIJJLI = LJIJJLI();
        Boolean value = LJIIZILJ().LJLJL.getValue();
        int i = 0;
        if (value != null && !value.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        LJIJJLI.LJZI.LIZJ = z;
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            IGT igt = c47041IdB.LJ;
            ILD state = ILD.IDLE;
            igt.getClass();
            o.LJIIIZ(state, "state");
            igt.LJLIL = state;
            C48233IwP c48233IwP = c47041IdB.LIZLLL;
            if (c48233IwP != null) {
                IGJ igj = c47041IdB.LIZJ;
                igj.getClass();
                igj.LJLIL.remove(c48233IwP);
            }
            C48233IwP c48233IwP2 = c47041IdB.LIZLLL;
            if (c48233IwP2 != null) {
                c48233IwP2.LIZLLL(c48233IwP2.LJLJJL, null);
                c48233IwP2.LJLJJI.clear();
            }
            C48233IwP c48233IwP3 = c47041IdB.LIZLLL;
            if (c48233IwP3 != null) {
                i = c48233IwP3.LJLJI.size();
            }
            c47041IdB.LJFF = i;
            C48233IwP c48233IwP4 = c47041IdB.LIZLLL;
            if (c48233IwP4 != null) {
                j = c48233IwP4.LIZJ();
            } else {
                j = 0;
            }
            c47041IdB.LJI = j;
            c47041IdB.LIZLLL = null;
            c47041IdB.LIZJ.LJLIL.clear();
            c47041IdB.LIZIZ.pause();
            c47041IdB.LIZIZ.LJJLIIIJL();
        }
        PipFeedManager.Companion.getClass();
        JD9.LIZ.reportExitFloatingWindow$pipfeed_release(LJIJ());
        FeedPipViewModel LJIJJLI2 = LJIJJLI();
        LJIJJLI2.LJLIL.removeObserver(LJIJJLI2.LJLJI);
        LJIJJLI2.jv0(LJIJJLI2.LJLIL.getValue());
        C42625Go9.LIZJ(this);
    }

    @Override // X.JEA
    public final void LJIILJJIL(View view) {
        int i;
        Video video;
        C48787JCt callback = C48787JCt.LJLIL;
        o.LJIIIZ(callback, "callback");
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC48790JCw(view, callback));
        } else {
            view.addOnAttachStateChangeListener(new IDCListenerS115S0200000_8(view, callback, 1));
        }
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null) {
            C48233IwP c48233IwP = new C48233IwP(LJIJJ());
            IGJ igj = c47041IdB.LIZJ;
            igj.getClass();
            igj.LJLIL.add(c48233IwP);
            c47041IdB.LIZLLL = c48233IwP;
            c47041IdB.LJI = 0L;
            c47041IdB.LJFF = 0;
        }
        C47041IdB c47041IdB2 = this.LJLJJLL;
        if (c47041IdB2 != null) {
            IGJ igj2 = c47041IdB2.LIZJ;
            igj2.getClass();
            igj2.LJLIL.add(this);
        }
        C47041IdB c47041IdB3 = this.LJLJJLL;
        if (c47041IdB3 != null) {
            C48778JCk c48778JCk = new C48778JCk(this);
            C48233IwP c48233IwP2 = c47041IdB3.LIZLLL;
            if (c48233IwP2 != null) {
                c48233IwP2.LJLJJI.add(c48778JCk);
            }
        }
        C42625Go9.LIZIZ(this);
        if (C48777JCj.LJLJLJ == null) {
            C48777JCj.LJLJLJ = this;
            FeedPipViewModel LJIJJLI = LJIJJLI();
            LJIJJLI.LJLIL.observeForever(LJIJJLI.LJLJI);
            ControlOverlayViewModel LJIIZILJ = LJIIZILJ();
            LJIIZILJ.getClass();
            LJIIZILJ.LJLIL = this;
            LJIL().gv0(EnumC48779JCl.LOADING_BLACKOUT);
            C47246IgU LIZ = C47246IgU.LIZ((ViewGroup) view, false, false, 0, 0);
            LIZ.N7(new C48776JCi(this, LIZ));
            this.LJLJL = LIZ;
            C48777JCj.LIZIZ();
            LJIJJLI().LJLLL.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 97));
            LJIJJLI().LJLLJ.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 98));
            LJIJJLI().LJLIL.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 99));
            LJIJJLI().LJLLLL.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 100));
            float f = LJIJJLI().LJZI.LIZIZ;
            Aweme value = LJIJJLI().LJLIL.getValue();
            if (value != null && (video = value.getVideo()) != null) {
                i = video.getDuration();
            } else {
                i = 0;
            }
            this.LJLJLLL = O6R.LJJIIZ(f * i);
            Aweme value2 = LJIJJLI().LJLIL.getValue();
            if (value2 != null) {
                FMX.LJIILL("enter_floating_window_mode", new OSZ(LJIJJ().LIZ, "enter_from"), new OSZ(value2.getGroupId(), "group_id"), new OSZ(value2.getAuthorUid(), "author_id"));
            }
            ((PipFeedWindowVM) this.LJLLI.getValue()).LJLJI.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 101));
            LJIL().LJLILLLLZI.observe(LJIIIIZZ(), new AObserverS76S0100000_8(this, 96));
            IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
            if (LJII.LIZIZ()) {
                LJII.LJI(LJIIIIZZ(), new C48775JCh(this));
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Last consumer ");
        LIZ2.append(C48777JCj.LJLJLJ);
        LIZ2.append(" has not been unbound");
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    public final void LJIILL(EnumC26410AYc enumC26410AYc) {
        boolean z;
        LJJI(this, "doPlayNext");
        LJJIIJZLJL();
        LJIIZILJ().LJLJLJ.setValue(Float.valueOf(0.0f));
        LJIL().gv0(EnumC48779JCl.TRANSITION);
        FeedPipViewModel LJIJJLI = LJIJJLI();
        LJIJJLI.LJLLL.setValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = LJIJJLI.LJLLJ;
        if (LJIJJLI.LJLZ + 2 < ((ArrayList) LJIJJLI.hv0()).size() || LJIJJLI.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        if (LJIJJLI.LJLZ + 1 == ((ArrayList) LJIJJLI.hv0()).size()) {
            EnumC48781JCn value = LJIJJLI.LJLLLL.getValue();
            EnumC48781JCn enumC48781JCn = EnumC48781JCn.LOADING;
            if (value != enumC48781JCn) {
                LJIJJLI.LJLLLL.setValue(enumC48781JCn);
                JCS jcs = LJIJJLI.LJLJLJ;
                if (jcs != null) {
                    jcs.t2(new JCT(LJIJJLI));
                }
            }
        } else {
            LJIJJLI.kv0(LJIJJLI.LJLZ + 1);
            LJIJJLI.LJLIL.setValue((FeedPipViewModel$currentAweme$1) ListProtector.get(LJIJJLI.hv0(), LJIJJLI.LJLZ));
        }
        this.LJZ = enumC26410AYc;
    }

    public final void LJJIII(boolean z) {
        StringBuilder LJI = JBR.LJI("blockPlayControl set to ", z, " by ");
        LJI.append(C77357UXp.LJIIIZ(new OSZ(3, 5)));
        LJJI(this, X1D.LIZIZ(LJI));
        this.LL = z;
    }

    public final void LJJIIJ(Aweme aweme) {
        boolean z;
        float LIZ;
        E4Y e4y;
        C47246IgU c47246IgU;
        Surface surface;
        if (aweme.getVideo() == null || TextUtils.isEmpty(aweme.getAid())) {
            return;
        }
        C47246IgU c47246IgU2 = this.LJLJL;
        if (c47246IgU2 != null && !c47246IgU2.d4()) {
            z = true;
        } else {
            z = false;
        }
        Surface surface2 = null;
        if (z) {
            this.LJLJLJ = true;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isTextureAvailable = false， current aid: ");
            LIZ2.append(aweme.getAid());
            LIZ2.append(", current surface: ");
            C47246IgU c47246IgU3 = this.LJLJL;
            if (c47246IgU3 != null) {
                surface2 = c47246IgU3.getSurface();
            }
            LIZ2.append(surface2);
            C36922EeM.LIZLLL(6, "PipPlayerVC", X1D.LIZIZ(LIZ2));
            return;
        }
        if (LJJ()) {
            return;
        }
        if (!C48777JCj.LJLJJI) {
            C48777JCj.LIZIZ();
        }
        if (this.LJZL) {
            LIZ = LJIJJLI().LJZI.LIZLLL;
        } else {
            LJIJJLI().LJZI.LIZLLL = C46295IEx.LIZ(aweme);
            LJIJJLI().LJZI.LJ = 1.0f;
            LIZ = C46295IEx.LIZ(aweme);
        }
        aweme.getVideo().setSourceId(C78927UyJ.LIZIZ(aweme));
        if (!o.LJ(this.LJZI, aweme.getAid())) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getVideo().getCover()));
            Context context = this.LJLJJL;
            if (context != null) {
                LJII.LIZJ = context;
                LJII.LIZIZ("PipPlayerVC");
                SmartImageView smartImageView = this.LJLZ;
                if (smartImageView != null) {
                    LJII.LJJIIJ = smartImageView;
                    LJII.LIZLLL(new C48784JCq(this, aweme));
                } else {
                    o.LJIJI("coverView");
                    throw null;
                }
            } else {
                o.LJIJI("context");
                throw null;
            }
        }
        if (aweme.getVideo().getDuration() - this.LJLJLLL < 1) {
            this.LJLJLLL = 0;
            LJIILL(EnumC26410AYc.AUTO);
            return;
        }
        MutableLiveData<E4Y> mutableLiveData = LJIIZILJ().LJLJJLL;
        if (CommonFeedServiceImpl.LJJIJLIJ().LJJIFFI(aweme)) {
            e4y = E4Y.VISIBLE;
        } else {
            e4y = E4Y.GONE;
        }
        mutableLiveData.setValue(e4y);
        C46744IWe c46744IWe = new C46744IWe();
        SimVideo LJJJJ = C51029K0z.LJJJJ(aweme.getVideo());
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LJJJJ;
        c46745IWf.LJIILL = true;
        c46745IWf.LJJIFFI = LIZ;
        c46745IWf.LJJII = true;
        c46745IWf.LJJJJZ = true;
        EnumC47177IfN resolution = EnumC47178IfO.SuperHigh.getResolution();
        C46745IWf c46745IWf2 = c46744IWe.LIZ;
        c46745IWf2.LJFF = resolution;
        c46745IWf2.LJIIJ = this.LJLJLLL;
        C46259IDn LIZ3 = IQ6.LIZ(aweme, Integer.valueOf(LJIJJ().LIZIZ), null);
        if (LIZ3 != null) {
            C46745IWf c46745IWf3 = c46744IWe.LIZ;
            c46745IWf3.LJJJ = true;
            c46745IWf3.LJJJI = LIZ3.LIZ;
            c46745IWf3.LJJJIL = LIZ3.LIZIZ;
            c46745IWf3.LJJJJ = LIZ3.LIZLLL;
            c46745IWf3.LJJIZ = LIZ3.LIZJ;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("realStartPlay: ");
        LIZ4.append(aweme.getAid());
        LJJI(this, X1D.LIZIZ(LIZ4));
        AbstractC48820JEa LJIJI = LJIJI();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[VideoPlay]: request, aid ");
        LIZ5.append(aweme.getAid());
        LIZ5.append(" progress ");
        LIZ5.append(this.LJLJLLL);
        LIZ5.append('/');
        LIZ5.append(aweme.getVideo().getDuration());
        LIZ5.append(" playSpeed ");
        LIZ5.append(LIZ);
        LJIJI.LJIIIIZZ(X1D.LIZIZ(LIZ5));
        C47041IdB c47041IdB = this.LJLJJLL;
        if (c47041IdB != null && (c47246IgU = this.LJLJL) != null && (surface = c47246IgU.getSurface()) != null) {
            c47041IdB.LIZIZ.setSurface(surface);
        }
        C47041IdB c47041IdB2 = this.LJLJJLL;
        if (c47041IdB2 != null) {
            C46745IWf data = c46744IWe.LIZ();
            o.LJIIIZ(data, "data");
            if (c47041IdB2.LJ.LJLIL != ILD.FINISHED) {
                c47041IdB2.LIZIZ.stop();
            }
            c47041IdB2.LIZIZ.LJIIL(data);
            InterfaceC46645ISj LIZJ = c47041IdB2.LIZIZ.LIZJ();
            if (LIZJ != null) {
                LIZJ.LJJJLZIJ(100);
            }
            IGT igt = c47041IdB2.LJ;
            ILD state = ILD.PREPARED;
            igt.getClass();
            o.LJIIIZ(state, "state");
            igt.LJLIL = state;
        }
        this.LJLJLLL = 0;
        String LIZIZ = C78927UyJ.LIZIZ(aweme);
        this.LJLLL = LIZIZ;
        StringBuilder LJFF = C72972SkS.LJFF(LIZIZ, '_');
        LJFF.append(System.currentTimeMillis());
        String LIZIZ2 = X1D.LIZIZ(LJFF);
        this.LJLLLL = LIZIZ2;
        this.LJLLLLLL = false;
        o.LJIIIZ(LIZIZ2, "<this>");
        String str = new String(LIZIZ2);
        LJJIII(true);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.postDelayed(new ARunnableS9S1100000_8(this, str, 15), 2000L);
        }
        String str2 = this.LJLLLL;
        o.LJIIIZ(str2, "<this>");
        ARunnableS3S2100000_8 aRunnableS3S2100000_8 = new ARunnableS3S2100000_8(new String(str2), this, "Reaching start play network check", 2);
        this.LLD = aRunnableS3S2100000_8;
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.postDelayed(aRunnableS3S2100000_8, 5000L);
    }

    public final void LJJIIZ(Aweme aweme) {
        C47041IdB c47041IdB;
        SimVideoUrlModel LJIILLIIL;
        String sourceId;
        SimVideoUrlModel LJIILLIIL2;
        String sourceId2;
        if (aweme == null && (aweme = LJIJJLI().LJLIL.getValue()) == null) {
            return;
        }
        if (!C48777JCj.LJLJJI) {
            C48777JCj.LIZIZ();
        }
        if (!LJJ() && (c47041IdB = this.LJLJJLL) != null) {
            IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
            if (LJII.LIZIZ()) {
                LJII.LJ("pip", false);
            }
            String str = "";
            switch (IGV.LIZ[c47041IdB.LJ.LJLIL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    LJJIIJ(aweme);
                    return;
                case 4:
                    String LIZIZ = C78927UyJ.LIZIZ(aweme);
                    InterfaceC46645ISj LIZJ = c47041IdB.LIZIZ.LIZJ();
                    if (LIZJ != null && (LJIILLIIL2 = LIZJ.LJIILLIIL()) != null && (sourceId2 = LJIILLIIL2.getSourceId()) != null) {
                        str = sourceId2;
                    }
                    if (o.LJ(LIZIZ, str)) {
                        c47041IdB.LIZIZ.resume();
                        InterfaceC46645ISj LIZJ2 = c47041IdB.LIZIZ.LIZJ();
                        if (LIZJ2 == null) {
                            return;
                        }
                        LIZJ2.LJJJLZIJ(100);
                        return;
                    }
                    LJJIIJ(aweme);
                    return;
                case 5:
                case 6:
                case 7:
                    String LIZIZ2 = C78927UyJ.LIZIZ(aweme);
                    InterfaceC46645ISj LIZJ3 = c47041IdB.LIZIZ.LIZJ();
                    if (LIZJ3 != null && (LJIILLIIL = LIZJ3.LJIILLIIL()) != null && (sourceId = LJIILLIIL.getSourceId()) != null) {
                        str = sourceId;
                    }
                    if (o.LJ(LIZIZ2, str)) {
                        return;
                    }
                    C47041IdB c47041IdB2 = this.LJLJJLL;
                    if (c47041IdB2 != null) {
                        c47041IdB2.LIZ();
                    }
                    LJJIIJ(aweme);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i != 1) {
                    return;
                }
                if (!C48777JCj.LJLJJL && !C48777JCj.LJLJJLL) {
                    return;
                }
                LJJIIZ(null);
                return;
            }
            LJJIIJZLJL();
            return;
        }
        LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayCompleted: sourceId: ", str, ", curSourceId: ");
        LIZIZ.append(this.LJLLL);
        LJJI(this, X1D.LIZIZ(LIZIZ));
        if (o.LJ(str, this.LJLLL)) {
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
            C47041IdB c47041IdB = this.LJLJJLL;
            if (c47041IdB != null) {
                c47041IdB.LIZ();
            }
            LJIILL(EnumC26410AYc.AUTO);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        if (o.LJ(str, this.LJLLL)) {
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (o.LJ(str, this.LJLLL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPlaying: hasRendered: ");
            LIZ.append(this.LJLLLLLL);
            LJJI(this, X1D.LIZIZ(LIZ));
            if (!this.LJLLLLLL) {
                onRenderFirstFrame(str, null);
            }
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.TRUE);
        }
        LJIL().gv0(EnumC48779JCl.NO_STATUS);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onScreenTimeEvent(IK5 ev) {
        o.LJIIIZ(ev, "ev");
        LJJIIJZLJL();
        LJIL().gv0(EnumC48779JCl.SCREEN_TIME_LIMIT);
    }

    public static void LJJI(C48774JCg c48774JCg, String str) {
        ILD ild;
        c48774JCg.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentSourceId: ");
        LIZ.append(c48774JCg.LJLLL);
        LIZ.append(" playerState: ");
        C47041IdB c47041IdB = c48774JCg.LJLJJLL;
        if (c47041IdB != null) {
            ild = c47041IdB.LJ.LJLIL;
        } else {
            ild = null;
        }
        LIZ.append(ild);
        LIZ.append(", uiState: ");
        LIZ.append(c48774JCg.LJIIZILJ().LJLJL.getValue());
        LIZ.append(", blockControl: ");
        LIZ.append(c48774JCg.LL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append(LIZIZ);
        String log = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(log, "log");
    }

    @Override // X.JEA
    public final View LJI(Context context, JEE jee) {
        FrameLayout frameLayout = new FrameLayout(context);
        SmartImageView smartImageView = new SmartImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        smartImageView.setLayoutParams(layoutParams);
        smartImageView.setClickable(false);
        smartImageView.setVisibility(4);
        smartImageView.setPlaceholderImage(new ColorDrawable(LJII(R.attr.d4)));
        this.LJLZ = smartImageView;
        frameLayout.addView(smartImageView);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("onPlayCompletedFirstTime: sourceId: ", str, ", curSourceId: ");
        LIZIZ.append(this.LJLLL);
        LJJI(this, X1D.LIZIZ(LIZIZ));
        onPlayCompleted(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
        LJIL().gv0(EnumC48779JCl.NET_ERROR);
        LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        Handler handler;
        String aid;
        AbstractC48820JEa LJIJI = LJIJI();
        StringBuilder LIZIZ = C25620zW.LIZIZ("onRenderFF: sourceId: ", str, " willPause: ");
        LIZIZ.append(LJIJJLI().LJZI.LIZJ);
        LIZIZ.append(", hasCalled: ");
        LIZIZ.append(this.LJLLLLLL);
        LJIJI.LJIIIIZZ(X1D.LIZIZ(LIZIZ));
        if (this.LJLLLLLL || !o.LJ(str, this.LJLLL)) {
            return;
        }
        this.LJLLLLLL = true;
        if (this.LJZL) {
            this.LJZL = false;
            PipFeedManager.Companion.getClass();
            JD9.LIZ.reportFirstVideoReady$pipfeed_release();
        }
        LJJIII(false);
        LJIL().gv0(EnumC48779JCl.NO_STATUS);
        SmartImageView smartImageView = this.LJLZ;
        if (smartImageView != null) {
            smartImageView.setVisibility(4);
            if (LJIJJLI().LJZI.LIZJ || LJJ()) {
                C47041IdB c47041IdB = this.LJLJJLL;
                if (c47041IdB != null) {
                    c47041IdB.LIZ();
                }
                LJIJJLI().LJZI.LIZJ = false;
                LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
            } else {
                LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.TRUE);
            }
            FeedPipViewModel LJIJJLI = LJIJJLI();
            Aweme aweme = (Aweme) ORZ.LJLLLLLL(LJIJJLI.LJLZ + 1, LJIJJLI.hv0());
            if (aweme != null && aweme.getVideo() != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getVideo().getCover()));
                Context context = this.LJLJJL;
                if (context != null) {
                    LJII.LIZJ = context;
                    LJII.LIZIZ("PipPlayerVC");
                    SmartImageView smartImageView2 = this.LJLZ;
                    if (smartImageView2 != null) {
                        LJII.LJJIIJ = smartImageView2;
                        LJII.LIZLLL(new C48785JCr(this, aweme));
                    } else {
                        o.LJIJI("coverView");
                        throw null;
                    }
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            }
            View view = this.LJLILLLLZI;
            if (view != null && (handler = view.getHandler()) != null) {
                handler.postDelayed(new ARunnableS42S0100000_6(this, 124), 100L);
                return;
            }
            return;
        }
        o.LJIJI("coverView");
        throw null;
    }

    public final void LJJII(boolean z, Aweme aweme, Aweme aweme2) {
        String str;
        if (aweme == null || aweme2 == null || !o.LJ(LJIJJLI().LJLJJI, "For You")) {
            return;
        }
        if (z) {
            str = "homepage_hot_slide_up";
        } else {
            str = "homepage_hot_slide_down";
        }
        java.util.Map LJJLIL = C113554cx.LJJLIL(LJIILLIIL());
        LJJLIL.put("enter_from", "homepage_hot");
        LJJLIL.put("play_mode", "normal");
        LJJLIL.put("auto_mode", "auto");
        String groupId = aweme.getGroupId();
        o.LJIIIIZZ(groupId, "from.groupId");
        LJJLIL.put("from_group_id", groupId);
        String groupId2 = aweme2.getGroupId();
        o.LJIIIIZZ(groupId2, "to.groupId");
        LJJLIL.put("to_group_id", groupId2);
        LJJLIL.put("is_finish", CardStruct.IStatusCode.DEFAULT);
        LJJLIL.remove("enter_method");
        C60903NvH.LJJIJIL(str, LJJLIL);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        View view;
        Handler handler;
        if (o.LJ(str, this.LJLLL)) {
            ARunnableS3S2100000_8 aRunnableS3S2100000_8 = this.LLD;
            if (aRunnableS3S2100000_8 != null && (view = this.LJLILLLLZI) != null && (handler = view.getHandler()) != null) {
                handler.removeCallbacks(aRunnableS3S2100000_8);
            }
            if (z) {
                String str2 = this.LJLLLL;
                o.LJIIIZ(str2, "<this>");
                ARunnableS3S2100000_8 aRunnableS3S2100000_82 = new ARunnableS3S2100000_8(new String(str2), this, "Reaching buffering checkpoint", 2);
                this.LLD = aRunnableS3S2100000_82;
                View view2 = this.LJLILLLLZI;
                if (view2 != null) {
                    view2.postDelayed(aRunnableS3S2100000_82, 5000L);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        String str2;
        Aweme value = LJIJJLI().LJLIL.getValue();
        if (value != null) {
            str2 = C78927UyJ.LIZIZ(value);
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        float f = ((float) j) / ((float) j2);
        LJIIZILJ().LJLJLJ.setValue(Float.valueOf(f));
        LJIJJLI().LJZI.LIZIZ = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        if (o.LJ(str, this.LJLLL)) {
            LJIIZILJ().LJLJL.setValue((ControlOverlayViewModel$isPlaying$1) Boolean.FALSE);
        }
    }
}
