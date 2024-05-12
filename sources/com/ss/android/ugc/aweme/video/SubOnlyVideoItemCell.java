package com.ss.android.ugc.aweme.video;

import X.C06490Nh;
import X.C16880lQ;
import X.C2068389v;
import X.C78939UyV;
import X.C79045V0n;
import X.C7MY;
import X.C7UE;
import X.J7H;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SubOnlyVideoItemCell extends PowerCell<C7UE> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7UE c7ue) {
        Video video;
        Video video2;
        UrlModel cover;
        UrlModel cover2;
        List<String> urlList;
        AwemeStatus.ReviewResult reviewResult;
        int i;
        UrlModel urlModel;
        int i2;
        C7UE t = c7ue;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.itemView.findViewById(R.id.jon).setVisibility(8);
        this.itemView.findViewById(R.id.aq4).setVisibility(0);
        View findViewById = this.itemView.findViewById(R.id.bq9);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.nct);
        if (textView != null) {
            textView.setText(b.LJIILIIL(t.LJLIL.getStatistics().getPlayCount()));
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.j26);
        if (tuxIconView != null) {
            if (t.LJLIL.isSubOnlyVideo()) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_star_ring;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                c2068389v.LIZIZ = C7MY.LIZIZ(16);
                c2068389v.LIZJ = C7MY.LIZIZ(16);
                tuxIconView.setTuxIcon(c2068389v);
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
        }
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.n61);
        String str = null;
        if (smartImageView != null) {
            Video video3 = t.LJLIL.getVideo();
            if (video3 != null) {
                urlModel = video3.getCover();
            } else {
                urlModel = null;
            }
            L(smartImageView, urlModel, Bitmap.Config.ARGB_8888);
        }
        View findViewById2 = this.itemView.findViewById(R.id.moj);
        if (findViewById2 != null) {
            if (t.LJLIL.isTop()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById2.setVisibility(i);
        }
        Aweme aweme = t.LJLIL;
        for (VideoMaskInfo videoMaskInfo : aweme.getVideoMaskInfos()) {
            if (videoMaskInfo != null && o.LJ(videoMaskInfo.getShowMask(), Boolean.TRUE)) {
                this.itemView.findViewById(R.id.jon).setVisibility(0);
                return;
            }
        }
        AwemeStatus status = aweme.getStatus();
        if (status != null && status.isProhibited()) {
            this.itemView.findViewById(R.id.aq4).setVisibility(8);
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null && (reviewResult = status2.getReviewResult()) != null) {
                str = reviewResult.getCoverNotice();
            }
            View findViewById3 = this.itemView.findViewById(R.id.bq9);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.bud);
            if (textView2 == null) {
                return;
            }
            textView2.setText(str);
            return;
        }
        AwemeStatus status3 = aweme.getStatus();
        if (status3 == null || !status3.isDelete()) {
            return;
        }
        Video video4 = aweme.getVideo();
        if ((video4 == null || (cover = video4.getDynamicCover()) == null) && (((video = aweme.getVideo()) != null && (cover2 = video.getCover()) != null && (urlList = cover2.getUrlList()) != null && urlList.isEmpty()) || (video2 = aweme.getVideo()) == null || (cover = video2.getCover()) == null)) {
            return;
        }
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.j26);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.n61);
        if (smartImageView2 == null) {
            return;
        }
        L(smartImageView2, cover, Bitmap.Config.ARGB_8888);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bqo, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.koy);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 179), findViewById);
        }
        return LIZIZ;
    }

    public static void L(SmartImageView smartImageView, UrlModel urlModel, Bitmap.Config config) {
        String uri;
        List<String> urlList;
        if (urlModel == null || (((uri = urlModel.getUri()) == null || ujb.o.LJJJJJL(uri)) && (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()))) {
            Context context = smartImageView.getContext();
            o.LJIIIIZZ(context, "cover.context");
            Integer LJI = C79045V0n.LJI(R.attr.cf, context);
            if (LJI != null) {
                smartImageView.setActualImageResource(LJI.intValue());
                return;
            }
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        int[] LIZ = J7H.LIZ(200);
        if (LIZ != null) {
            LJII.LJIILIIL(LIZ);
        }
        LJII.LJJIIJ = smartImageView;
        LJII.LIZIZ("sub_only_video");
        if (config != null) {
            LJII.LJIJI = config;
        }
        C16880lQ.LLJJJ(LJII);
    }
}
