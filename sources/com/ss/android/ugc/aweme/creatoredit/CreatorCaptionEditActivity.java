package com.ss.android.ugc.aweme.creatoredit;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C0AC;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C222688oa;
import X.C26045AKb;
import X.C36636EZk;
import X.C46757IWr;
import X.C47261Igj;
import X.C48841JEv;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C65822iA;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73536StY;
import X.C73969T1h;
import X.C80146Vcs;
import X.C80457Vht;
import X.C85505Xh7;
import X.C85507Xh9;
import X.C85509XhB;
import X.C85510XhC;
import X.C85511XhD;
import X.DialogC25756A8y;
import X.EnumC47177IfN;
import X.FMX;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC85514XhG;
import X.Q7K;
import X.RunnableC85504Xh6;
import X.T16;
import X.XKX;
import X.XMD;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import Y.AfS50S0200000_1;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import o3.h0;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class CreatorCaptionEditActivity extends ActivityC86117Xqz implements OnUIPlayListener, InterfaceC85514XhG {
    public HighLightLayoutManager LJLIL;
    public C85511XhD LJLILLLLZI;
    public Aweme LJLJI;
    public Long LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public Boolean LJLL;
    public Video LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final ACListenerS35S0100000_15 LLIILZL;
    public final ACListenerS35S0100000_15 LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;
    public final Map<Integer, View> LLILIL = new LinkedHashMap();
    public boolean LJLLI = true;
    public float LJZ = 0.004f;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILIL;
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
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
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
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
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
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public CreatorCaptionEditActivity() {
        C221108m2.LIZIZ(new AqS165S0100000_15(this, LiveCoverMinSizeSetting.DEFAULT));
        this.LJZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 233));
        this.LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 234));
        this.LLD = C221108m2.LIZIZ(new AqS165S0100000_15(this, 235));
        this.LLF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 248));
        this.LLFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 242));
        this.LLFFF = C221108m2.LIZIZ(C85510XhC.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 246));
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 255));
        this.LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 244));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 236));
        this.LLII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 249));
        this.LLIIII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 245));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 243));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 240));
        this.LLIIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 238));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 254));
        this.LLIIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 237));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 253));
        this.LLIIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 251));
        this.LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 247));
        this.LLIILZL = new ACListenerS35S0100000_15(this, 91);
        this.LLIIZ = new ACListenerS35S0100000_15(this, 92);
        this.LLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 241));
        this.LLILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 239));
    }

    public final CreatorCaptionEditViewModel LLII() {
        return (CreatorCaptionEditViewModel) this.LLFF.getValue();
    }

    public final DialogC25756A8y LLIIIILZ() {
        return (DialogC25756A8y) this.LLIIII.getValue();
    }

    public final C85507Xh9 LLIIIJ() {
        return (C85507Xh9) this.LLIILII.getValue();
    }

    public final View LLIIIZ() {
        Object value = this.LLII.getValue();
        o.LJIIIIZZ(value, "<get-pauseBtn>(...)");
        return (View) value;
    }

    public final SafeHandler LLIIJI() {
        return (SafeHandler) this.LL.getValue();
    }

    public final C73305Spp LLIIJLIL() {
        Object value = this.LLIFFJFJJ.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final FrameLayout LLIILII() {
        Object value = this.LLI.getValue();
        o.LJIIIIZZ(value, "<get-videoPlayer>(...)");
        return (FrameLayout) value;
    }

    public final FrameLayout LLIL() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-videoPlayerContainer>(...)");
        return (FrameLayout) value;
    }

    public final VideoViewComponent LLILIL() {
        return (VideoViewComponent) this.LLFFF.getValue();
    }

    public final void LLILLJJLI() {
        if (this.LJLLLLLL && this.LJLLILLLL != null) {
            LLILIL().LJIIL(this.LJLLILLLL);
            C16880lQ.LJIILJJIL(LLIILII(), new ACListenerS35S0100000_15(this, 95));
            LLIILII().setContentDescription(getString(R.string.abc));
            String string = getString(R.string.a_p);
            o.LJIIIIZZ(string, "getString(R.string.acces…yLabels_common_playVideo)");
            String string2 = getString(R.string.a_n);
            o.LJIIIIZZ(string2, "getString(R.string.acces…Labels_common_pauseVideo)");
            h0.LJIJI(LLIILII(), new C80457Vht(this, string, string2));
        }
    }

    public final RecyclerView w6() {
        Object value = this.LLIIL.getValue();
        o.LJIIIIZZ(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    public final void LLFII() {
        if (LLII().kv0()) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.fiu);
            c26045AKb.LJIIJ();
            return;
        }
        if (!LLII().jv0()) {
            int LIZIZ = Q7K.LIZIZ("creator_caption_max_edit_times", 2);
            C26045AKb c26045AKb2 = new C26045AKb(this);
            String quantityString = getResources().getQuantityString(R.plurals.f2, LIZIZ);
            o.LJIIIIZZ(quantityString, "resources.getQuantityStr…Number,\n                )");
            String LLLZ = C16880lQ.LLLZ(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(LIZIZ)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c26045AKb2.LJIIIZ(LLLZ);
            c26045AKb2.LJIIJ();
            return;
        }
        if (o.LJ(LLII().iv0().getValue(), Boolean.FALSE)) {
            return;
        }
        C26045AKb c26045AKb3 = new C26045AKb(this);
        c26045AKb3.LJIIIIZZ(R.string.dti);
        c26045AKb3.LJIIJ();
    }

    public final void LLILLL() {
        AbstractC73672Svk<CreatorCaptionEditModel> abstractC73672Svk;
        LLIIJLIL().setVisibility(0);
        LLIIJLIL().LJFF();
        LLIIJLIL().LJFF();
        CreatorCaptionEditViewModel LLII = LLII();
        Long l = this.LJLJJI;
        String str = this.LJLJJL;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(this, 252);
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 48);
        LLII.getClass();
        if (l != null) {
            long longValue = l.longValue();
            CreatorCaptionEditApi.LIZ.getClass();
            try {
                abstractC73672Svk = C85509XhB.LIZ().queryAwemeAndCaption(Long.valueOf(longValue), str);
            } catch (ExecutionException e) {
                AbstractC36908Ee8.getCompatibleException(e);
                abstractC73672Svk = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk, "empty()");
            }
            new C73318Sq2().LIZ(abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS50S0200000_1(aqS165S0100000_15, LLII, 13), new AfS50S0200000_1(aqS181S0100000_15, LLII, 14)));
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((Boolean) LLII().LJLJI.getValue()).booleanValue()) {
            LLILZ(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (LLILIL().LJFF()) {
            LLILIL().LJIIJJI();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        ((Handler) this.LJZL.getValue()).removeCallbacksAndMessages(null);
        LLIIJI().removeCallbacksAndMessages(null);
        if (LLIIJLIL().getVisibility() == 8 && this.LJLLILLLL != null && LLILIL().LJFF()) {
            LLILLIZIL(false);
        }
        SystemClock.elapsedRealtime();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onResume", true);
        super.onResume();
        LLIIJI().post((RunnableC85504Xh6) this.LLF.getValue());
        if (LLIIJLIL().getVisibility() == 8 && this.LJLLILLLL != null && !LLILIL().LJFF() && !this.LJLLLL) {
            LLILLIZIL(false);
        }
        SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onResume", false);
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

    @Override // X.InterfaceC85514XhG
    public final void LJJLI() {
        LLFII();
    }

    /* loaded from: classes15.dex */
    public final class HighLightLayoutManager extends LinearLayoutManager {
        public HighLightLayoutManager() {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C80146Vcs c80146Vcs = new C80146Vcs(this, context);
            c80146Vcs.LIZ = i;
            LLIIIILZ(c80146Vcs);
        }
    }

    @Override // X.InterfaceC85514XhG
    public final void LJJ(int i) {
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditData creatorCaptionEditData;
        CreatorCaptionEditItem creatorCaptionEditItem = LLII().LJLJJLL;
        if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, i)) != null) {
            LLILIL().LJIIJ((creatorCaptionEditData.getStartTime() * 100.0f) / ((float) LLILIL().LJ()));
            this.LJZI = creatorCaptionEditData.getEndTime();
        }
        this.LJLZ = true;
        LLILIL().resume();
        this.LJLLL = false;
        this.LJLLLL = false;
        LLIIIZ().setVisibility(8);
    }

    @Override // X.InterfaceC85514XhG
    public final void LJJIJIL(int i) {
        CreatorCaptionEditItem creatorCaptionEditItem;
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditData creatorCaptionEditData;
        C65822iA value;
        if (LLII().hv0() != null) {
            MutableLiveData<C65822iA> hv0 = LLII().hv0();
            if (hv0 != null && (value = hv0.getValue()) != null && (value.LIZ == 0 || value.LIZIZ)) {
                return;
            }
            LLILZ(true);
            C85511XhD c85511XhD = this.LJLILLLLZI;
            if (c85511XhD != null) {
                if (c85511XhD.LJLJJI != i && (creatorCaptionEditItem = LLII().LJLJJLL) != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, i)) != null) {
                    LLILIL().LJIIJ((creatorCaptionEditData.getStartTime() * 100.0f) / ((float) LLILIL().LJ()));
                    this.LJZI = creatorCaptionEditData.getEndTime();
                }
                if (this.LJLZ) {
                    C85511XhD c85511XhD2 = this.LJLILLLLZI;
                    if (c85511XhD2 != null) {
                        if (c85511XhD2.LJLJJI == i) {
                            return;
                        }
                    } else {
                        o.LJIJI("creatorCaptionEditAdapter");
                        throw null;
                    }
                }
                LLILIL().pause();
                this.LJLLL = true;
                this.LJLLLL = true;
                this.LJLZ = true;
                LLIIIZ().setVisibility(0);
                C85511XhD c85511XhD3 = this.LJLILLLLZI;
                if (c85511XhD3 != null) {
                    c85511XhD3.LJLLLLLL(i);
                    return;
                } else {
                    o.LJIJI("creatorCaptionEditAdapter");
                    throw null;
                }
            }
            o.LJIJI("creatorCaptionEditAdapter");
            throw null;
        }
    }

    public final int LLFZ(long j) {
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditItem creatorCaptionEditItem = LLII().LJLJJLL;
        if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null) {
            int i = 0;
            for (CreatorCaptionEditData creatorCaptionEditData : transSubtitleItem) {
                int i2 = i + 1;
                if (i >= 0) {
                    CreatorCaptionEditData creatorCaptionEditData2 = creatorCaptionEditData;
                    if (creatorCaptionEditData2.getStartTime() <= j && j < creatorCaptionEditData2.getEndTime()) {
                        return i;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void LLILLIZIL(boolean z) {
        if (this.LJLLL) {
            if (!LLILIL().LJFF() && this.LJLLILLLL != null) {
                this.LJLZ = false;
                C85511XhD c85511XhD = this.LJLILLLLZI;
                if (c85511XhD != null) {
                    c85511XhD.LJZ();
                    LLILIL().resume();
                    this.LJLLL = false;
                    this.LJLLLL = false;
                    LLIIIZ().setVisibility(8);
                    return;
                }
                o.LJIJI("creatorCaptionEditAdapter");
                throw null;
            }
            return;
        }
        if (!LLILIL().LJFF()) {
            return;
        }
        LLILIL().pause();
        if (this.LJLZ) {
            C85511XhD c85511XhD2 = this.LJLILLLLZI;
            if (c85511XhD2 != null) {
                c85511XhD2.LJLZ();
            } else {
                o.LJIJI("creatorCaptionEditAdapter");
                throw null;
            }
        }
        this.LJLLL = true;
        if (!z) {
            return;
        }
        this.LJLLLL = true;
        LLIIIZ().setVisibility(0);
    }

    public final void LLILZ(boolean z) {
        int i;
        String str;
        if (!((Boolean) LLII().LJLJI.getValue()).booleanValue() && z) {
            C85507Xh9 LLIIIJ = LLIIIJ();
            LLIIIJ.getClass();
            C188727au c188727au = new C188727au();
            LLIIIJ.LIZ(c188727au);
            FMX.LJIIL("enter_secondary_edit_captions", c188727au.LIZ);
        }
        LLII().LJLILLLLZI.setValue(Boolean.valueOf(z));
        C85505Xh7 c85505Xh7 = (C85505Xh7) this.LLIL.getValue();
        Resources resources = getResources();
        if (z) {
            i = R.string.q8h;
        } else {
            i = R.string.exd;
        }
        String string = resources.getString(i);
        o.LJIIIIZZ(string, "resources.getString(\n   …         },\n            )");
        TuxTextView LIZIZ = c85505Xh7.LIZIZ();
        C85505Xh7.LJFF(LIZIZ, true);
        LIZIZ.setText(string);
        C85505Xh7.LJFF(c85505Xh7.LIZ(), false);
        C85505Xh7 c85505Xh72 = (C85505Xh7) this.LLIL.getValue();
        if (z) {
            str = getResources().getString(R.string.bwv);
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (isExpandedEditScreen…         \"\"\n            }");
        Object value = c85505Xh72.LJIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-titleText>(...)");
        ((TextView) value).setText(str);
        Object value2 = c85505Xh72.LJIIIZ.getValue();
        o.LJIIIIZZ(value2, "<get-titleText>(...)");
        C85505Xh7.LJFF((View) value2, true);
    }

    public final void LLIZLLLIL(int i) {
        String str;
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditData creatorCaptionEditData;
        if (!this.LJLLI) {
            Object value = this.LLIIIJ.getValue();
            o.LJIIIIZZ(value, "<get-captionViewContainer>(...)");
            ((View) value).setVisibility(8);
            return;
        }
        Object value2 = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value2, "<get-translationSourceIcon>(...)");
        ((View) value2).setVisibility(8);
        Object value3 = this.LLIIIJ.getValue();
        o.LJIIIIZZ(value3, "<get-captionViewContainer>(...)");
        ((View) value3).setVisibility(0);
        if (i == -1) {
            Object value4 = this.LLIIIL.getValue();
            o.LJIIIIZZ(value4, "<get-captionView>(...)");
            ((View) value4).setVisibility(8);
            return;
        }
        Object value5 = this.LLIIIL.getValue();
        o.LJIIIIZZ(value5, "<get-captionView>(...)");
        ((View) value5).setVisibility(0);
        Object value6 = this.LLIIJI.getValue();
        o.LJIIIIZZ(value6, "<get-captionTextView>(...)");
        TextView textView = (TextView) value6;
        CreatorCaptionEditItem creatorCaptionEditItem = LLII().LJLJJLL;
        if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, i)) != null) {
            str = creatorCaptionEditData.getText();
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onCreate", true);
        super.onCreate(bundle);
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        setContentView(R.layout.aae);
        try {
            this.LJLJJI = Long.valueOf(getIntent().getLongExtra("cla_subtitle_id", 0L));
            this.LJLJJL = C16880lQ.LLJJIJIIJIL(getIntent(), "item_id");
            this.LJLJJLL = C16880lQ.LLJJIJIIJIL(getIntent(), "group_id");
            this.LJLJL = C16880lQ.LLJJIJIIJIL(getIntent(), "author_id");
            this.LJLJLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
            this.LJLJLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
            this.LJLLI = getIntent().getBooleanExtra("should_show_caption_on_video", true);
            LLII().gv0().setValue((Aweme) getIntent().getSerializableExtra("aweme"));
            this.LJLL = Boolean.valueOf(getIntent().getBooleanExtra("add_caption_flow_entry", false));
        } catch (Exception unused) {
        }
        getWindow().setNavigationBarColor(-16777216);
        this.LJLILLLLZI = new C85511XhD(LLII(), this);
        this.LJLIL = new HighLightLayoutManager();
        RecyclerView w6 = w6();
        HighLightLayoutManager highLightLayoutManager = this.LJLIL;
        if (highLightLayoutManager != null) {
            w6.setLayoutManager(highLightLayoutManager);
            C85511XhD c85511XhD = this.LJLILLLLZI;
            if (c85511XhD != null) {
                w6.setAdapter(c85511XhD);
                AbstractC030109x itemAnimator = w6.getItemAnimator();
                o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                ((AbstractC28931Bp) itemAnimator).LJI = false;
                C16880lQ.LJIILJJIL(LLIL(), new ACListenerS35S0100000_15(this, 93));
                LLILZ(false);
                Object value = this.LLIIJLIL.getValue();
                o.LJIIIIZZ(value, "<get-retryButton>(...)");
                C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 94), (View) value);
                LLILLL();
                LLII().gv0().observe(this, new AObserverS83S0100000_15(this, 12));
                LLII().iv0().observe(this, new AObserverS83S0100000_15(this, 13));
                XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new XMD(this, null), 3);
                LLII().hv0().observe(this, new AObserverS83S0100000_15(this, 14));
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onCreate", false);
                return;
            }
            o.LJIJI("creatorCaptionEditAdapter");
            throw null;
        }
        o.LJIJI("highLightLayoutManager");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C46757IWr c46757IWr = LLILIL().LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.LJJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (this.LJLZ) {
            LLILIL().pause();
            this.LJLLL = true;
            this.LJLLLL = true;
            LLIIIZ().setVisibility(0);
            C85511XhD c85511XhD = this.LJLILLLLZI;
            if (c85511XhD != null) {
                c85511XhD.LJLZ();
            } else {
                o.LJIJI("creatorCaptionEditAdapter");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if ((r3.getEndTime() - LLILIL().LIZLLL()) <= 100) goto L24;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayProgressChange(float r11) {
        /*
            r10 = this;
            boolean r0 = r10.LJLZ
            r4 = 0
            java.lang.String r9 = "creatorCaptionEditAdapter"
            r8 = 0
            if (r0 != 0) goto L86
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r10.LLILIL()
            long r0 = r0.LIZLLL()
            int r7 = r10.LLFZ(r0)
            if (r7 < 0) goto L58
            X.XhD r1 = r10.LJLILLLLZI
            if (r1 == 0) goto Lc0
            int r0 = r1.LJLJJI
            if (r0 == r7) goto L58
            int r0 = r1.getItemCount()
            if (r7 >= r0) goto L58
            X.XhD r0 = r10.LJLILLLLZI
            if (r0 == 0) goto Lbc
            int r0 = r0.LJLJJI
            int r0 = r0 + (-1)
            if (r7 != r0) goto L5c
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel r0 = r10.LLII()
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem r0 = r0.LJLJJLL
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.getTransSubtitleItem()
            if (r0 == 0) goto L5c
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData r3 = (com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData) r3
            if (r3 == 0) goto L5c
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r10.LLILIL()
            long r1 = r0.LIZLLL()
            int r0 = r3.getEndTime()
            long r5 = (long) r0
            long r5 = r5 - r1
            r1 = 100
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5c
        L58:
            r10.LLIZLLLIL(r7)
        L5b:
            return
        L5c:
            if (r7 != 0) goto L81
            r0 = 998445679(0x3b83126f, float:0.004)
            r10.LJZ = r0
        L63:
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$HighLightLayoutManager r3 = r10.LJLIL
            if (r3 == 0) goto Lb6
            androidx.recyclerview.widget.RecyclerView r2 = r10.w6()
            X.0AC r1 = new X.0AC
            r1.<init>()
            int r0 = r7 + (-2)
            int r0 = java.lang.Math.max(r0, r4)
            r3.LLIIII(r2, r1, r0)
            X.XhD r0 = r10.LJLILLLLZI
            if (r0 == 0) goto Lb2
            r0.LJLLLLLL(r7)
            goto L58
        L81:
            r0 = 1137180672(0x43c80000, float:400.0)
            r10.LJZ = r0
            goto L63
        L86:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r10.LLILIL()
            long r2 = r0.LJ()
            float r1 = (float) r2
            float r1 = r1 * r11
            int r0 = r10.LJZI
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L5b
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r10.LLILIL()
            r0.pause()
            r0 = 1
            r10.LJLLL = r0
            r10.LJLLLL = r0
            android.view.View r0 = r10.LLIIIZ()
            r0.setVisibility(r4)
            X.XhD r0 = r10.LJLILLLLZI
            if (r0 == 0) goto Lc4
            r0.LJLZ()
            goto L5b
        Lb2:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r8
        Lb6:
            java.lang.String r0 = "highLightLayoutManager"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r8
        Lbc:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r8
        Lc0:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r8
        Lc4:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity.onPlayProgressChange(float):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 event) {
        o.LJIIIZ(event, "event");
        if (this.LJLLILLLL != null && !LLILIL().LJFF()) {
            LLILLIZIL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C46757IWr c46757IWr = LLILIL().LJLILLLLZI;
        if (c46757IWr != null) {
            c46757IWr.LJJJLIIL();
        }
    }
}
