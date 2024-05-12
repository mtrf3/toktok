package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C16880lQ;
import X.C221108m2;
import X.C222688oa;
import X.C48905JHh;
import X.C49187JSd;
import X.C49687Jel;
import X.C50345JpN;
import X.C50699Jv5;
import X.C62822Ol8;
import X.EnumC47177IfN;
import X.EnumC50341JpJ;
import X.F3T;
import X.IGF;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC37146Ehy;
import X.InterfaceC46334IGk;
import X.InterfaceC49137JQf;
import X.JGK;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PlayMusicBridge extends BaseBridgeMethod implements JGK {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final String LJLJJI;
    public final C50345JpN LJLJJL;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return null;
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
    }

    @Override // X.JGK
    public final void Wf(int i) {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void contextPause() {
    }

    @Override // X.JGK
    public final void contextResume() {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
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

    @Override // X.JGK, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
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

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
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
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.JGK, X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        MusicPlayHelper musicPlayHelper = (MusicPlayHelper) this.LJLJI.getValue();
        if (musicPlayHelper != null) {
            musicPlayHelper.hv0();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayMusicBridge(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(contextProviderFactory, 176));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(contextProviderFactory, 177));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 178));
        this.LJLJJI = "playMusic";
        this.LJLJJL = new C50345JpN(contextProviderFactory, "playMusic", EnumC50341JpJ.STABLE);
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.music.model.Music r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.PlayMusicBridge.LIZJ(com.ss.android.ugc.aweme.music.model.Music, org.json.JSONObject):void");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJJL.LIZ(params, iReturn)) {
            return;
        }
        try {
            String optString = params.optString("music");
            JSONObject optJSONObject = params.optJSONObject("music_extra");
            if (o.LJ(params.optString("from_card_type"), "music_card")) {
                new C50699Jv5(getContext()).LJI();
            }
            if (optString != null && optJSONObject != null) {
                Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), optString, new C49687Jel().getType());
                o.LJIIIIZZ(fromJson, "get().gson.fromJson(result, type)");
                Music music = (Music) fromJson;
                music.setId(optJSONObject.optLong("id"));
                LIZJ(music, optJSONObject);
            }
            iReturn.onSuccess(new JSONArray());
        } catch (Exception e) {
            IGF.LIZ(e, "ShowEasterEggMethod");
            iReturn.LIZ(0, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
    }
}
