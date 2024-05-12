package com.ss.android.ugc.aweme.inbox.skylight;

import X.C16880lQ;
import X.C222688oa;
import X.C47132Iee;
import X.C48703J9n;
import X.C48710J9u;
import X.C54740Le4;
import X.C77357UXp;
import X.C78939UyV;
import X.EnumC47177IfN;
import X.EnumC48702J9m;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.IWF;
import X.InterfaceC46330IGg;
import X.KL0;
import X.W5F;
import X.W5U;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SkylightOTDMediaCell extends SkylightBaseMediaCard<C48710J9u> implements OnUIPlayListener {
    public C47132Iee LJLJL;

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
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C222688oa.LJIILJJIL(this, str);
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
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
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
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void T() {
        Aweme aweme;
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LIZIZ(this);
            C47132Iee c47132Iee2 = this.LJLJL;
            if (c47132Iee2 != null) {
                C48710J9u c48710J9u = (C48710J9u) getItem();
                if (c48710J9u == null || (aweme = c48710J9u.LJLIL) == null) {
                    return;
                }
                C47132Iee.LJIIIZ(c47132Iee2, aweme);
                return;
            }
            o.LJIJI("videoPlayerWrapper");
            throw null;
        }
        o.LJIJI("videoPlayerWrapper");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void X() {
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LJ();
        } else {
            o.LJIJI("videoPlayerWrapper");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void Y() {
        Aweme aweme;
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LIZIZ(this);
            C47132Iee c47132Iee2 = this.LJLJL;
            if (c47132Iee2 != null) {
                C48710J9u c48710J9u = (C48710J9u) getItem();
                if (c48710J9u == null || (aweme = c48710J9u.LJLIL) == null) {
                    return;
                }
                C47132Iee.LJIIIZ(c47132Iee2, aweme);
                return;
            }
            o.LJIJI("videoPlayerWrapper");
            throw null;
        }
        o.LJIJI("videoPlayerWrapper");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void U() {
        P().setVisibility(0);
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LJFF(this);
            C47132Iee c47132Iee2 = this.LJLJL;
            if (c47132Iee2 != null) {
                c47132Iee2.LJLJL = false;
                c47132Iee2.LJIIIIZZ();
                return;
            } else {
                o.LJIJI("videoPlayerWrapper");
                throw null;
            }
        }
        o.LJIJI("videoPlayerWrapper");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.kuk);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.surface_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.setKeepScreenOn(true);
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        o.LJIIIIZZ(LJJLIIIIJ, "inst()");
        this.LJLJL = new C47132Iee(viewGroup, LJJLIIIIJ);
        M().setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LJIIIIZZ();
            P().setVisibility(0);
        } else {
            o.LJIJI("videoPlayerWrapper");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void L(C48710J9u t) {
        String str;
        Aweme aweme;
        Video video;
        o.LJIIIZ(t, "t");
        TuxTextView tuxTextView = this.LJLJI;
        UrlModel urlModel = null;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.p5);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            P().setVisibility(0);
            C48710J9u c48710J9u = (C48710J9u) getItem();
            if (c48710J9u != null && (aweme = c48710J9u.LJLIL) != null && (video = aweme.getVideo()) != null) {
                urlModel = video.getOriginCover();
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJI = KL0.HIGH;
            LJII.LIZIZ(toString());
            LJII.LJJIIJ = P();
            C16880lQ.LLJJJ(LJII);
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 46), this.itemView);
            return;
        }
        o.LJIJI("userName");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
        P().setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void a0(EnumC48702J9m event, Map<String, Object> map) {
        String str;
        Aweme aweme;
        String groupId;
        Aweme aweme2;
        Aweme aweme3;
        String str2;
        Aweme aweme4;
        String groupId2;
        Aweme aweme5;
        Aweme aweme6;
        o.LJIIIZ(event, "event");
        int i = C48703J9n.LIZ[event.ordinal()];
        User user = null;
        String str3 = "";
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C48710J9u c48710J9u = (C48710J9u) getItem();
            if (c48710J9u == null || (aweme6 = c48710J9u.LJLIL) == null || (str2 = aweme6.getAuthorUid()) == null) {
                str2 = "";
            }
            C48710J9u c48710J9u2 = (C48710J9u) getItem();
            if (c48710J9u2 != null && (aweme5 = c48710J9u2.LJLIL) != null) {
                user = aweme5.getAuthor();
            }
            int LIZIZ = C54740Le4.LIZIZ(user);
            C48710J9u c48710J9u3 = (C48710J9u) getItem();
            if (c48710J9u3 != null && (aweme4 = c48710J9u3.LJLIL) != null && (groupId2 = aweme4.getGroupId()) != null) {
                str3 = groupId2;
            }
            C77357UXp.LJJIJIIJI(this, "on_this_day", str2, Integer.valueOf(LIZIZ), str3, map, 18);
            return;
        }
        C48710J9u c48710J9u4 = (C48710J9u) getItem();
        if (c48710J9u4 == null || (aweme3 = c48710J9u4.LJLIL) == null || (str = aweme3.getAuthorUid()) == null) {
            str = "";
        }
        C48710J9u c48710J9u5 = (C48710J9u) getItem();
        if (c48710J9u5 != null && (aweme2 = c48710J9u5.LJLIL) != null) {
            user = aweme2.getAuthor();
        }
        int LIZIZ2 = C54740Le4.LIZIZ(user);
        C48710J9u c48710J9u6 = (C48710J9u) getItem();
        if (c48710J9u6 != null && (aweme = c48710J9u6.LJLIL) != null && (groupId = aweme.getGroupId()) != null) {
            str3 = groupId;
        }
        C77357UXp.LJJIJIIJIL(this, "on_this_day", str, LIZIZ2, str3, map, 18);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
        P().setVisibility(8);
    }
}
