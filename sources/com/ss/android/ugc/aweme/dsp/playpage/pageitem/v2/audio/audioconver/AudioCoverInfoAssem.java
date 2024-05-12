package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver;

import X.AbstractC91590Zx4;
import X.C212428Vi;
import X.C214348b8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C91113ZpN;
import X.C91200Zqm;
import X.C91264Zro;
import X.C91304ZsS;
import X.C91334Zsw;
import X.C91395Ztv;
import X.C91547ZwN;
import X.C91605ZxJ;
import X.C9BD;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.InterfaceC91459Zux;
import X.TBT;
import Y.IDObserverS226S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.AudioEventLoggerPlugin;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class AudioCoverInfoAssem extends BaseDspItemReusedAssem implements InterfaceC91289ZsD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public C91395Ztv LLFII;
    public View LLFZ;
    public final InterfaceC115514g7 LLI;
    public boolean LLIFFJFJJ;

    static {
        TBT tbt = new TBT(AudioCoverInfoAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public AudioCoverInfoAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 26), null, C91547ZwN.INSTANCE, null, null);
    }

    public final ViewGroup g4() {
        View view = this.LLFZ;
        if (view != null) {
            View findViewById = view.findViewById(R.id.gsi);
            o.LJIIIIZZ(findViewById, "cardRootView.findViewByI…_dsp_api_cover_container)");
            return (ViewGroup) findViewById;
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        IAudioPlayerAbility LIZJ;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        if (b4() && (LIZJ = C91264Zro.LIZJ(this)) != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
    }

    public final TuxIconView k4() {
        View findViewById = g4().findViewById(R.id.gsr);
        o.LJIIIIZZ(findViewById, "coverContainerView.findV…id.music_dsp_api_iv_play)");
        return (TuxIconView) findViewById;
    }

    public final void l4() {
        g4().animate().scaleX(0.887f).scaleY(0.887f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }

    public final void m4() {
        k4().animate().alpha(1.0f).setDuration(150L).withStartAction(new IDRunnableS88S0100000_29(this, 7)).start();
    }

    public final void n4() {
        g4().setScaleX(1.0f);
        g4().setScaleY(1.0f);
        k4().setVisibility(8);
        l4();
        m4();
    }

    public final void p4() {
        g4().animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L).setInterpolator(new C91113ZpN()).start();
        k4().animate().alpha(0.0f).setDuration(150L).withEndAction(new IDRunnableS88S0100000_29(this, 8)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (X.YBM.LIZIZ() == false) goto L16;
     */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(X.C91395Ztv r28) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver.AudioCoverInfoAssem.q4(java.lang.Object):void");
    }

    public final void e4(EnumC91310ZsY enumC91310ZsY) {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        if (b4() && enumC91310ZsY == EnumC91310ZsY.PLAYBACK_STATE_PAUSED) {
            IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
            if (LIZJ != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null) {
                InterfaceC91459Zux interfaceC91459Zux = c91605ZxJ.LJLJJI.LJLILLLLZI.get(AudioEventLoggerPlugin.class);
                if (!(interfaceC91459Zux instanceof AudioEventLoggerPlugin)) {
                    interfaceC91459Zux = null;
                }
                AudioEventLoggerPlugin audioEventLoggerPlugin = (AudioEventLoggerPlugin) interfaceC91459Zux;
                if (audioEventLoggerPlugin != null && audioEventLoggerPlugin.isLastPauseFromUserAction()) {
                    l4();
                }
            }
            m4();
            return;
        }
        if (b4() && enumC91310ZsY == EnumC91310ZsY.PLAYBACK_STATE_PLAYING) {
            p4();
            return;
        }
        if (b4() && enumC91310ZsY == EnumC91310ZsY.PLAYBACK_STATE_START && k4().getVisibility() == 0) {
            p4();
            return;
        }
        g4().setScaleX(1.0f);
        g4().setScaleY(1.0f);
        k4().setVisibility(8);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
        e4(currentState);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        this.LLFZ = view;
        IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
        if (LIZ != null && (OO = LIZ.OO()) != null) {
            OO.observe(this, new IDObserverS226S0100000_29(this, 10));
        }
        if (b4()) {
            IAudioPlayerAbility LIZJ = C91264Zro.LIZJ(this);
            if (LIZJ != null && (HS = LIZJ.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
                c91334Zsw.LJII(this);
            }
            IXTabPanelAbility LJFF = C91264Zro.LJFF(this);
            View view2 = this.LLFZ;
            if (view2 != null) {
                View findViewById = view2.findViewById(R.id.gs9);
                o.LJIIIIZZ(findViewById, "cardRootView.findViewByI…ic_dsp_api_audio_content)");
                C91200Zqm.LIZLLL(findViewById, C212428Vi.LIZLLL(this), LJFF);
            } else {
                o.LJIJI("cardRootView");
                throw null;
            }
        }
        k4().setBackgroundResource(R.drawable.kq);
        if (view.getContext() != null) {
            k4().setTintColorRes(R.attr.dj);
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
