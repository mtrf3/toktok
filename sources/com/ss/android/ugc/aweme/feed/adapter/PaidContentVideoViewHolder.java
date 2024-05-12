package com.ss.android.ugc.aweme.feed.adapter;

import X.C16880lQ;
import X.C222588oQ;
import X.C222688oa;
import X.C73318Sq2;
import X.C73969T1h;
import X.C92D;
import X.HG3;
import X.T16;
import Y.ARunnableS39S0100000_3;
import Y.AfS35S0000000_3;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.adapter.PaidContentVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.PaidContentCollectionPlayProgressServiceImpl;
import com.ss.android.ugc.aweme.service.PaidContentServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PaidContentVideoViewHolder extends VideoViewCell {
    public long LLZZ;
    public long LLZZJLIL;
    public final C73318Sq2 LLZZLLIL;
    public final String LLZZZIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 27;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS39S0100000_3(this, 52), 8000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidContentVideoViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZLLIL = new C73318Sq2();
        this.LLZZZIL = HG3.LJIILL().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        super.LIZLLL(aweme);
        this.LLZZJLIL = 0L;
        Yc0(new C92D() { // from class: X.8pB
            @Override // X.C92D
            public final void LIZ(float f, float f2) {
                FragmentManager fragmentManager;
                String str;
                ActivityC45651qj LJJIFFI;
                PaidContentVideoViewHolder paidContentVideoViewHolder = PaidContentVideoViewHolder.this;
                paidContentVideoViewHolder.getClass();
                IPaidContentService LJIIIZ = PaidContentServiceImpl.LJIIIZ();
                String authorUid = paidContentVideoViewHolder.LJLLL.getAuthorUid();
                o.LJIIIIZZ(authorUid, "aweme.authorUid");
                String aid = paidContentVideoViewHolder.LJLLL.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                String eventType = paidContentVideoViewHolder.getEventType();
                o.LJIIIIZZ(eventType, "getEventType()");
                Context context = paidContentVideoViewHolder.LLJJJIL;
                if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                    fragmentManager = LJJIFFI.getSupportFragmentManager();
                } else {
                    fragmentManager = null;
                }
                LJIIIZ.LJFF(fragmentManager, authorUid, aid, eventType);
                C220488l2 c220488l2 = C220488l2.LIZIZ;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("group_id", paidContentVideoViewHolder.LJLLL.getAid());
                if (paidContentVideoViewHolder.LJLLL.getAuthor() != null) {
                    str = paidContentVideoViewHolder.LJLLL.getAuthor().getUid();
                } else {
                    str = "";
                }
                c188727au.LJIIIZ("author_id", str);
                c188727au.LJIIIZ("content_type", C227768wm.LJ(paidContentVideoViewHolder.LJLLL));
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(paidContentVideoViewHolder.LJLLL)));
                c188727au.LJIIIZ("enter_from", paidContentVideoViewHolder.getEventType());
                c188727au.LJIIIZ("enter_method", "detail");
                c188727au.LJIIIZ("from_group_id", C2KM.LIZ(C2S6.LIZ(paidContentVideoViewHolder.LLJJJIL).getPreviousPage(), C2S6.LIZ(paidContentVideoViewHolder.LLJJJIL).getFromGroupId()));
                c188727au.LJIIIZ("is_collection_item", "1");
                c188727au.LJFF(Boolean.valueOf(paidContentVideoViewHolder.LJLLL.isSubOnlyVideo()), "is_sub_only_video");
                Object LJII = c220488l2.LJII(paidContentVideoViewHolder.LJLLL, c188727au);
                C222578oP.LIZJ(LJII, paidContentVideoViewHolder.LJLLL, null, null, 14);
                o.LJIIIIZZ(LJII, "EventMapBuilder()\n      …pendStoryMobParams(aweme)");
                FMX.LJIIL("click_trans_layer", ((C188727au) LJII).LIZ);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIII(int i) {
        super.LJJIII(i);
        LLLLIIL(2, this.LLZZJLIL, this.LLZZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        this.LLZZJLIL = 0L;
        this.LLZZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        super.onPausePlay(str);
        if (this.LJLLL.getAid().equals(str)) {
            LLLLIIL(0, this.LLZZJLIL, this.LLZZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        super.onPlayCompleted(str);
        LLLLIIL(4, this.LLZZJLIL, this.LJLLL.getVideo().getDuration());
        this.LLZZJLIL = 0L;
        this.LLZZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        String str2;
        C222688oa.LJIL(this, str);
        IPaidContentService LJIIIZ = PaidContentServiceImpl.LJIIIZ();
        Aweme aweme = this.LJLLL;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        LJIIIZ.LIZLLL(str2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        String str2;
        super.onPreparePlay(str);
        IPaidContentService LJIIIZ = PaidContentServiceImpl.LJIIIZ();
        Aweme aweme = this.LJLLL;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        LJIIIZ.LIZLLL(str2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        LLLLIIL(1, this.LLZZJLIL, this.LLZZ);
        this.LLZZJLIL = 0L;
        this.LLZZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        super.onSeekEnd(str, z);
    }

    public final void LLLLIIL(int i, long j, long j2) {
        if (j == j2) {
            return;
        }
        this.LLZZJLIL = j2;
        try {
            String aid = this.LJLLL.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            long parseLong = CastLongProtector.parseLong(aid);
            String userId = this.LLZZZIL;
            o.LJIIIIZZ(userId, "userId");
            this.LLZZLLIL.LIZ(PaidContentServiceImpl.LJIIIZ().LIZJ(parseLong, CastLongProtector.parseLong(userId), (float) j, (float) j2, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS35S0000000_3(0), new AfS35S0000000_3(this, 1)));
            IPaidContentCollectionPlayProgressService LJI = PaidContentCollectionPlayProgressServiceImpl.LJI();
            String aid2 = this.LJLLL.getAid();
            o.LJIIIIZZ(aid2, "aweme.aid");
            LJI.LIZJ(j2, aid2);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
        if (this.LJLLL.getAid().equals(str)) {
            this.LLZZ = j;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
        LLLLIIL(3, this.LLZZJLIL, i);
    }
}
