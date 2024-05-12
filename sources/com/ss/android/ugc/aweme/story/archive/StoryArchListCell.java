package com.ss.android.ugc.aweme.story.archive;

import X.C025908h;
import X.C16880lQ;
import X.C184077Kh;
import X.C19N;
import X.C2068389v;
import X.C208458Gb;
import X.C214378bB;
import X.C214528bQ;
import X.C55723Ltv;
import X.C65352Pkq;
import X.C77123UOp;
import X.C78926UyI;
import X.C78939UyV;
import X.C7F3;
import X.C7F4;
import X.C7F5;
import X.C7F6;
import X.C7MY;
import X.J7H;
import X.SY9;
import X.VA9;
import X.W5F;
import X.W5G;
import X.W5U;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryArchListCell extends PowerCell<C7F4> {
    public StoryArchListCell() {
        C7F5 c7f5 = C7F5.LJLIL;
        new C214378bB(C65352Pkq.LIZ(StoryArchListViewModel.class), c7f5, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C7F3.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.f12)).setAttached(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ((SmartImageView) this.itemView.findViewById(R.id.f12)).setAttached(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7F4 c7f4) {
        UrlModel cover;
        long j;
        int i;
        C7F4 storyArchListItem = c7f4;
        o.LJIIIZ(storyArchListItem, "storyArchListItem");
        Aweme aweme = storyArchListItem.LJLIL;
        if (!aweme.isSharedStoryVisible()) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_video_slash;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LIZIZ = C7MY.LIZIZ(32);
            c2068389v.LIZJ = C7MY.LIZIZ(32);
            SY9 LIZJ = C025908h.LIZJ(this.itemView, "itemView.context", c2068389v);
            ((ImageView) this.itemView.findViewById(R.id.f12)).setScaleType(ImageView.ScaleType.CENTER);
            ((VA9) this.itemView.findViewById(R.id.f12)).setImageDrawable(LIZJ);
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.d4);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            this.itemView.findViewById(R.id.f12).setBackgroundColor(i);
        } else {
            ((W5G) this.itemView.findViewById(R.id.f12)).setActualImageResource(0);
            Video video = aweme.getVideo();
            if (video != null) {
                SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.f12);
                o.LJIIIIZZ(smartImageView, "itemView.iv_cover");
                if (!C208458Gb.LIZJ(smartImageView, video, "StoryArchListCell", false, LiveTryModeCountDownThresholdSetting.DEFAULT) && (cover = video.getCover()) != null) {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                    int[] LIZ = J7H.LIZ(200);
                    if (LIZ != null) {
                        LJII.LJIILIIL(LIZ);
                    }
                    LJII.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.f12);
                    LJII.LIZIZ("StoryArchListCell");
                    C16880lQ.LLJJJ(LJII);
                }
            }
        }
        Aweme aweme2 = storyArchListItem.LJLIL;
        View view = this.itemView;
        ((ImageView) view.findViewById(R.id.e9_)).setVisibility(0);
        view.findViewById(R.id.m34).setVisibility(0);
        ((TuxIconView) view.findViewById(R.id.e9_)).setIconRes(R.raw.icon_play);
        TextView textView = (TextView) view.findViewById(R.id.m34);
        AwemeStatistics statistics = aweme2.getStatistics();
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        textView.setText(C77123UOp.LJJIIJ(j));
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, storyArchListItem, 103), this.itemView);
        Aweme aweme3 = storyArchListItem.LJLIL;
        if (aweme3.isProhibited()) {
            ((TextView) this.itemView.findViewById(R.id.ib_)).setText(aweme3.getCoverNotice());
            this.itemView.findViewById(R.id.geh).setVisibility(0);
            this.itemView.findViewById(R.id.ib_).setVisibility(0);
            this.itemView.findViewById(R.id.g1z).setVisibility(8);
            return;
        }
        this.itemView.findViewById(R.id.geh).setVisibility(8);
        this.itemView.findViewById(R.id.ib_).setVisibility(8);
        this.itemView.findViewById(R.id.g1z).setVisibility(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_layout_story_arch_list_cell", parent.getContext(), R.layout.cp3, null, parent, false, 40);
    }
}
