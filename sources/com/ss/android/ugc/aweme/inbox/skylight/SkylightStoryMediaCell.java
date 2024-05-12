package com.ss.android.ugc.aweme.inbox.skylight;

import X.C16880lQ;
import X.C222688oa;
import X.C47132Iee;
import X.C48704J9o;
import X.C54740Le4;
import X.C71799SFv;
import X.C77357UXp;
import X.C78939UyV;
import X.EnumC47177IfN;
import X.EnumC48702J9m;
import X.EnumC72807Shn;
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
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SkylightStoryMediaCell extends SkylightBaseMediaCard<StoryInboxItem> implements OnUIPlayListener {
    public C47132Iee LJLJL;
    public Aweme LJLJLJ;

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

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void T() {
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            if (c47132Iee.LJLILLLLZI == 3) {
                c47132Iee.LJI();
                return;
            } else {
                Y();
                return;
            }
        }
        o.LJIJI("videoPlayerWrapper");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void U() {
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            if (c47132Iee.LJLILLLLZI == 2) {
                c47132Iee.LJ();
                return;
            }
            P().setVisibility(0);
            C47132Iee c47132Iee2 = this.LJLJL;
            if (c47132Iee2 != null) {
                c47132Iee2.LJFF(this);
                C47132Iee c47132Iee3 = this.LJLJL;
                if (c47132Iee3 != null) {
                    c47132Iee3.LJLJL = false;
                    c47132Iee3.LJIIIIZZ();
                    return;
                } else {
                    o.LJIJI("videoPlayerWrapper");
                    throw null;
                }
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

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void Y() {
        c0();
        C47132Iee c47132Iee = this.LJLJL;
        if (c47132Iee != null) {
            c47132Iee.LIZIZ(this);
            C47132Iee c47132Iee2 = this.LJLJL;
            if (c47132Iee2 != null) {
                Aweme aweme = this.LJLJLJ;
                if (aweme == null) {
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015a, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0103, code lost:
    
        if (r0 < 0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.SkylightStoryMediaCell.c0():void");
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

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void Q() {
        c0();
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void V() {
        c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void L(StoryInboxItem t) {
        Aweme storyCollection;
        User author;
        UrlModel avatarMedium;
        String str;
        Video video;
        Aweme storyCollection2;
        User author2;
        o.LJIIIZ(t, "t");
        C71799SFv N = N();
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        UrlModel urlModel = null;
        if (storyInboxItem == null || (storyCollection = storyInboxItem.getStoryCollection()) == null || (author = storyCollection.getAuthor()) == null || (avatarMedium = author.getAvatarMedium()) == null) {
            return;
        }
        C71799SFv.LJIIJ(N, C78939UyV.LJ(avatarMedium), null, false, null, 126);
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
            if (storyInboxItem2 != null && (storyCollection2 = storyInboxItem2.getStoryCollection()) != null && (author2 = storyCollection2.getAuthor()) != null) {
                str = author2.getNickname();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            P().setVisibility(0);
            c0();
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                urlModel = video.getOriginCover();
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJI = KL0.HIGH;
            LJII.LIZIZ(toString());
            LJII.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LJII.LJJIIJ = P();
            C16880lQ.LLJJJ(LJII);
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 47), this.itemView);
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
        String groupId;
        Aweme storyCollection;
        Aweme storyCollection2;
        String str2;
        String groupId2;
        Aweme storyCollection3;
        Aweme storyCollection4;
        int i;
        Aweme storyCollection5;
        UserStory userStory;
        o.LJIIIZ(event, "event");
        if (map != null) {
            StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
            if (storyInboxItem != null && (storyCollection5 = storyInboxItem.getStoryCollection()) != null && (userStory = storyCollection5.getUserStory()) != null && userStory.getAllViewed()) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("is_read", Integer.valueOf(i));
        }
        int i2 = C48704J9o.LIZ[event.ordinal()];
        User user = null;
        String str3 = "";
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
            if (storyInboxItem2 == null || (storyCollection4 = storyInboxItem2.getStoryCollection()) == null || (str2 = storyCollection4.getAuthorUid()) == null) {
                str2 = "";
            }
            StoryInboxItem storyInboxItem3 = (StoryInboxItem) getItem();
            if (storyInboxItem3 != null && (storyCollection3 = storyInboxItem3.getStoryCollection()) != null) {
                user = storyCollection3.getAuthor();
            }
            int LIZIZ = C54740Le4.LIZIZ(user);
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (groupId2 = aweme.getGroupId()) != null) {
                str3 = groupId2;
            }
            C77357UXp.LJJIJIIJI(this, "story", str2, Integer.valueOf(LIZIZ), str3, map, 18);
            return;
        }
        StoryInboxItem storyInboxItem4 = (StoryInboxItem) getItem();
        if (storyInboxItem4 == null || (storyCollection2 = storyInboxItem4.getStoryCollection()) == null || (str = storyCollection2.getAuthorUid()) == null) {
            str = "";
        }
        StoryInboxItem storyInboxItem5 = (StoryInboxItem) getItem();
        if (storyInboxItem5 != null && (storyCollection = storyInboxItem5.getStoryCollection()) != null) {
            user = storyCollection.getAuthor();
        }
        int LIZIZ2 = C54740Le4.LIZIZ(user);
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && (groupId = aweme2.getGroupId()) != null) {
            str3 = groupId;
        }
        C77357UXp.LJJIJIIJIL(this, "story", str, LIZIZ2, str3, map, 18);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
        P().setVisibility(8);
    }
}
