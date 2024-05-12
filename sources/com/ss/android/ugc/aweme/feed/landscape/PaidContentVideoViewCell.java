package com.ss.android.ugc.aweme.feed.landscape;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C211568Sa;
import X.C222588oQ;
import X.C222688oa;
import X.C2U8;
import X.C73318Sq2;
import X.C73969T1h;
import X.HG3;
import X.T16;
import Y.ARunnableS40S0100000_4;
import Y.AfS36S0000000_4;
import android.os.Handler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.service.PaidContentServiceImpl;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentVideoViewCell extends LandscapeVideoViewCell {
    public long LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public final C73318Sq2 LLJLIL;
    public final String LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 27;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 57), 8000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidContentVideoViewCell(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLJLIL = new C73318Sq2();
        this.LLJLILLLLZIIL = HG3.LJIILL().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        super.LIZLLL(aweme);
        this.LLJL = 0L;
        Yc0(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C2MA
    public final void LJJIII(int i) {
        LLFII(2, this.LLJL, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        this.LLJL = 0L;
        this.LLJJLIIIJLLLLLLLZ = 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        String str2;
        super.onPausePlay(str);
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (ujb.o.LJJJJIZL(str2, str, false)) {
            LLFII(0, this.LLJL, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        long j;
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        Video video;
        super.onPlayCompleted(str);
        long j2 = this.LLJL;
        Aweme aweme2 = this.LJLLL;
        if (aweme2 != null && (video = aweme2.getVideo()) != null) {
            j = video.getDuration();
        } else {
            j = 0;
        }
        LLFII(4, j2, j);
        this.LLJL = 0L;
        this.LLJJLIIIJLLLLLLLZ = 0L;
        if (C211568Sa.LIZ() && (aweme = this.LJLLL) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview()) {
            ActivityC45651qj activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            C2U8.LIZIZ(new IEvent() { // from class: X.9CO
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
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

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        LLFII(1, this.LLJL, this.LLJJLIIIJLLLLLLLZ);
        this.LLJL = 0L;
        this.LLJJLIIIJLLLLLLLZ = 0L;
    }

    public final void LLFII(int i, long j, long j2) {
        long j3;
        String aid;
        if (j == j2) {
            return;
        }
        this.LLJL = j2;
        try {
            Aweme aweme = this.LJLLL;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                j3 = CastLongProtector.parseLong(aid);
            } else {
                j3 = 0;
            }
            String userId = this.LLJLILLLLZIIL;
            o.LJIIIIZZ(userId, "userId");
            this.LLJLIL.LIZ(PaidContentServiceImpl.LJIIIZ().LIZJ(j3, CastLongProtector.parseLong(userId), (float) j, (float) j2, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0000000_4(0), new AfS36S0000000_4(this, 1)));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String sourceId, long j, long j2) {
        String str;
        o.LJIIIZ(sourceId, "sourceId");
        super.onPlayProgressChange(sourceId, j, j2);
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (ujb.o.LJJJJIZL(str, sourceId, false)) {
            this.LLJJLIIIJLLLLLLLZ = j;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
        LLFII(3, this.LLJL, i);
    }
}
