package com.ss.android.ugc.aweme.featureeffectvideo.powerlist;

import X.C16880lQ;
import X.C208458Gb;
import X.C221108m2;
import X.C243599hD;
import X.C243609hE;
import X.C248339or;
import X.C62822Ol8;
import X.C71897SJp;
import X.C78939UyV;
import X.C8I5;
import X.EnumC62195Ob1;
import X.J7H;
import X.W5F;
import X.W5U;
import Y.ACListenerS39S0200000_4;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeatureVideoItemCell extends PowerCell<C243599hD> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 332));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 330));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 331));
    public C243599hD LJLJJI;

    public final C71897SJp L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-checkBox>(...)");
        return (C71897SJp) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.avf);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C243599hD c243599hD, List payloads) {
        C243599hD featureVideoItem = c243599hD;
        o.LJIIIZ(featureVideoItem, "featureVideoItem");
        o.LJIIIZ(payloads, "payloads");
        if (!o.LJ(featureVideoItem, this.LJLJJI)) {
            this.LJLJJI = featureVideoItem;
            Aweme aweme = featureVideoItem.LJLIL;
            if (aweme != null) {
                Video video = aweme.getVideo();
                o.LJIIIIZZ(video, "data.getVideo()");
                C248339or.LIZ();
                Object value = this.LJLIL.getValue();
                o.LJIIIIZZ(value, "<get-videoCover>(...)");
                if (!C208458Gb.LIZLLL((SmartImageView) value, video, "FeatureVideoItemCell", true, null, null, true, Bitmap.Config.ARGB_8888, false, 768)) {
                    UrlModel cover = video.getCover();
                    W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                    int[] LIZ = J7H.LIZ(200);
                    if (LIZ != null) {
                        LJII.LJIILIIL(LIZ);
                    }
                    if (o.LJ("AwemeViewHolder", "FeatureVideoItemCell") && C8I5.LIZ()) {
                        LJII.LJJIII = EnumC62195Ob1.CUSTOM;
                        LJII.LJJJ = "profile_post_img";
                    }
                    Object value2 = this.LJLIL.getValue();
                    o.LJIIIIZZ(value2, "<get-videoCover>(...)");
                    LJII.LJJIIJ = (SmartImageView) value2;
                    LJII.LIZIZ("FeatureVideoItemCell");
                    C16880lQ.LLJJJ(LJII);
                    if (aweme.getVideo() != null && !e1.LIZ(31744, "enable_reuse_external_image_include_static_image", true, true)) {
                        aweme.getVideo().setCachedOuterCoverUrl(cover);
                        aweme.getVideo().setCachedOuterCoverSize(LIZ);
                    }
                }
                if (aweme.isPublic()) {
                    Object value3 = this.LJLJI.getValue();
                    o.LJIIIIZZ(value3, "<get-inValidView>(...)");
                    ((View) value3).setVisibility(4);
                    L().setVisibility(0);
                    L().setChecked(featureVideoItem.LJLILLLLZI);
                } else {
                    Object value4 = this.LJLJI.getValue();
                    o.LJIIIIZZ(value4, "<get-inValidView>(...)");
                    ((View) value4).setVisibility(0);
                    L().setVisibility(4);
                }
            }
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(featureVideoItem, this, 82), this.itemView);
            return;
        }
        this.LJLJJI = featureVideoItem;
        for (Object obj : payloads) {
            if (obj instanceof C243609hE) {
                C243609hE c243609hE = (C243609hE) obj;
                this.LJLJJI = C243599hD.LIZ(featureVideoItem, c243609hE.LIZ);
                L().setVisibility(0);
                L().setChecked(c243609hE.LIZ);
            }
        }
    }
}
