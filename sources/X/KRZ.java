package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.kids.commonfeed.panel.BaseFeedPanel;
import com.ss.android.ugc.aweme.kids.commonfeed.reportstats.KidsAwemeStatsApi;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KRZ implements OnUIPlayListener {
    public final BaseFeedPanel LJLIL;
    public final InterfaceC46330IGg LJLILLLLZI;

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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final OnUIPlayListener LIZ() {
        InterfaceC82710Wd8 curViewHolder = this.LJLIL.getCurViewHolder();
        if (curViewHolder instanceof OnUIPlayListener) {
            return (OnUIPlayListener) curViewHolder;
        }
        return null;
    }

    public KRZ(BaseFeedPanel panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL = panel;
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        o.LJIIIIZZ(LJJLIIIIJ, "inst()");
        this.LJLILLLLZI = LJJLIIIIJ;
    }

    public static void LIZIZ(KRZ krz) {
        Video video;
        InterfaceC82710Wd8 curViewHolder = krz.LJLIL.getCurViewHolder();
        if (curViewHolder == null) {
            return;
        }
        Aweme aweme = curViewHolder.getAweme();
        krz.LJLILLLLZI.LJJJLL(krz);
        krz.LJLILLLLZI.setSurface(curViewHolder.getSurface());
        InterfaceC46330IGg interfaceC46330IGg = krz.LJLILLLLZI;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        interfaceC46330IGg.LJJJJI(video, false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        Aweme aweme;
        int i;
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onRenderReady(iph);
        }
        InterfaceC82710Wd8 curViewHolder = this.LJLIL.getCurViewHolder();
        if (curViewHolder == null || (aweme = curViewHolder.getAweme()) == null) {
            return;
        }
        String enterFrom = this.LJLIL.getEnterFrom();
        if (o.LJ(enterFrom, "homepage_hot")) {
            i = 0;
        } else if (o.LJ(enterFrom, "like")) {
            i = 4;
        } else {
            i = -1;
        }
        C51707KRb c51707KRb = new C51707KRb();
        c51707KRb.LIZ = aweme.getAid();
        c51707KRb.LIZIZ = 1;
        c51707KRb.LJ = 0;
        c51707KRb.LJFF = 0;
        c51707KRb.LIZJ = aweme.getAwemeType();
        c51707KRb.LIZLLL = i;
        if (aweme.isForwardAweme() && aweme.getForwardItem() != null) {
            c51707KRb.LJI = aweme.getForwardItem().getAid();
            c51707KRb.LJII = aweme.getForwardItem().getAuthorUid();
            c51707KRb.LJIIIIZZ = aweme.getForwardItem().getFollowStatus();
            c51707KRb.LJIIIZ = aweme.getForwardItem().getAuthor().getFollowerStatus();
            c51707KRb.LJIIJ = false;
        }
        if (!TextUtils.isEmpty(C51708KRc.LIZ) && !TextUtils.isEmpty(C51708KRc.LIZIZ)) {
            String preItemId = C51708KRc.LIZ;
            o.LJIIIZ(preItemId, "preItemId");
            c51707KRb.LJIIJJI = preItemId;
            String preItemPlaytime = C51708KRc.LIZIZ;
            o.LJIIIZ(preItemPlaytime, "preItemPlaytime");
            c51707KRb.LJIIL = preItemPlaytime;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C51708KRc.LIZ = aid;
        C51706KRa c51706KRa = new C51706KRa();
        String str = c51707KRb.LIZ;
        if (str == null) {
            str = "";
        }
        c51706KRa.LIZ = str;
        c51706KRa.LIZIZ = c51707KRb.LIZIZ;
        c51706KRa.LIZJ = c51707KRb.LIZJ;
        c51706KRa.LIZLLL = c51707KRb.LIZLLL;
        c51706KRa.LJ = c51707KRb.LJ;
        c51706KRa.LJFF = c51707KRb.LJFF;
        String str2 = c51707KRb.LJI;
        if (str2 == null) {
            str2 = "";
        }
        c51706KRa.LJI = str2;
        String str3 = c51707KRb.LJII;
        if (str3 == null) {
            str3 = "";
        }
        c51706KRa.LJII = str3;
        c51706KRa.LJIIIIZZ = c51707KRb.LJIIIIZZ;
        c51706KRa.LJIIIZ = c51707KRb.LJIIIZ;
        c51706KRa.LJIIJ = c51707KRb.LJIIJ;
        c51706KRa.LJIIJJI = c51707KRb.LJIIJJI;
        c51706KRa.LJIIL = c51707KRb.LJIIL;
        c51706KRa.LJIILIIL = "";
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(c51706KRa.LIZ)) {
            hashMap.put("item_id", c51706KRa.LIZ);
        }
        int i2 = c51706KRa.LIZIZ;
        if (i2 > 0) {
            hashMap.put("play_delta", String.valueOf(i2));
        }
        int i3 = c51706KRa.LIZJ;
        if (i3 > -1) {
            hashMap.put("aweme_type", String.valueOf(i3));
        }
        int i4 = c51706KRa.LIZLLL;
        if (i4 > -1) {
            hashMap.put("tab_type", String.valueOf(i4));
        }
        int i5 = c51706KRa.LJ;
        if (i5 > -1) {
            hashMap.put("follow_status", String.valueOf(i5));
        }
        int i6 = c51706KRa.LJFF;
        if (i6 > -1) {
            hashMap.put("follower_status", String.valueOf(i6));
        }
        if (!TextUtils.isEmpty(c51706KRa.LJI)) {
            hashMap.put("origin_item_id", c51706KRa.LJI);
        }
        if (!TextUtils.isEmpty(c51706KRa.LJII)) {
            hashMap.put("origin_author_id", c51706KRa.LJII);
        }
        int i7 = c51706KRa.LJIIIIZZ;
        if (i7 > -1) {
            hashMap.put("origin_follow_status", String.valueOf(i7));
        }
        int i8 = c51706KRa.LJIIIZ;
        if (i8 > -1) {
            hashMap.put("origin_follower_status", String.valueOf(i8));
        }
        hashMap.put("sync_origin", String.valueOf(c51706KRa.LJIIJ));
        hashMap.put("pre_item_id", c51706KRa.LJIIJJI);
        hashMap.put("pre_item_playtime", c51706KRa.LJIIL);
        hashMap.put("pre_hot_sentence", c51706KRa.LJIILIIL);
        hashMap.put("first_install_time", String.valueOf(C2YJ.LIZIZ.LIZ.getFirstInstallTime()));
        hashMap.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
        KidsAwemeStatsApi.LIZ.reportAwemeStats(hashMap);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        OnUIPlayListener LIZ = LIZ();
        if (LIZ != null) {
            LIZ.onRetryOnError(ipg);
        }
    }
}
