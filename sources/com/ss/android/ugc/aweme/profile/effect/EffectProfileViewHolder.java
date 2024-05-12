package com.ss.android.ugc.aweme.profile.effect;

import X.AP2;
import X.C05040Hs;
import X.C1041847a;
import X.C16880lQ;
import X.C188727au;
import X.C1DI;
import X.C2068389v;
import X.C208458Gb;
import X.C221108m2;
import X.C47261Igj;
import X.C50918Jyc;
import X.C50922Jyg;
import X.C53378KxC;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.EnumC56422MCk;
import X.EnumC72807Shn;
import X.FMX;
import X.JHM;
import X.MHO;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EffectProfileViewHolder extends JediSimpleViewHolder {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        String str;
        String str2;
        C188727au c188727au = new C188727au();
        String str3 = "personal_homepage";
        if (this.LJLIL) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("prop_id", ((NewFaceStickerBean) getItem()).effectId);
        Aweme aweme = ((NewFaceStickerBean) getItem()).relatedAweme;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("enter_method", "profile_tab_card");
        FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://stickers/detail");
        buildRoute.withParam("extra_sticker_from", "from_sticker_master_profile");
        buildRoute.withParam("extra_music_from", "from_sticker_master_profile");
        String str4 = ((NewFaceStickerBean) getItem()).effectId;
        o.LJI(str4);
        buildRoute.withParam("extra_stickers", C47261Igj.LJII(str4));
        buildRoute.withParam("extra_related_item", ((NewFaceStickerBean) getItem()).relatedAweme);
        buildRoute.withParam("extra_owner_id", ((NewFaceStickerBean) getItem()).ownerId);
        buildRoute.withParam("extra_open_from_profile_page", true);
        buildRoute.withParam("extra_url_icon", ((NewFaceStickerBean) getItem()).iconUrl);
        buildRoute.withParam("featured_video_source", ((NewFaceStickerBean) getItem()).featureVideoSource);
        if (!this.LJLIL) {
            str3 = "others_homepage";
        }
        C05040Hs.LJ(buildRoute, "prop_page_enter_from", str3, "prop_page_enter_method", "profile_tab_card");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void attachToWindow() {
        String str;
        int i;
        String str2;
        long id;
        super.attachToWindow();
        Aweme aweme = ((NewFaceStickerBean) getItem()).relatedAweme;
        if (aweme != null) {
            if (this.LJLIL) {
                str = "personal_homepage";
                i = 1000;
            } else {
                str = "others_homepage";
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            int i2 = i + 6;
            if (!C1041847a.LIZ()) {
                C50918Jyc c50918Jyc = new C50918Jyc();
                c50918Jyc.LIZLLL = str;
                c50918Jyc.LJIILL(i2, aweme);
                c50918Jyc.LJJIII = "effect";
                c50918Jyc.LJIILIIL();
            }
            C50922Jyg c50922Jyg = new C50922Jyg();
            c50922Jyg.LIZLLL = str;
            c50922Jyg.LJIILJJIL = aweme.getAid();
            c50922Jyg.LJIILL = JHM.LJIIIZ(aweme);
            c50922Jyg.LJIJ = JHM.LJIIJJI(i2, aweme);
            int awemeType = aweme.getAwemeType();
            if (awemeType != 2) {
                if (awemeType != 101) {
                    str2 = "video";
                } else {
                    str2 = "live";
                }
            } else {
                str2 = "photo";
            }
            c50922Jyg.LJIIZILJ = str2;
            if (aweme.getMusic() == null) {
                id = 0;
            } else {
                id = aweme.getMusic().getId();
            }
            c50922Jyg.LJIILLIIL = Long.valueOf(id);
            c50922Jyg.LJIJI = "effect";
            c50922Jyg.LJIILIIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        NewFaceStickerBean item = (NewFaceStickerBean) obj;
        o.LJIIIZ(item, "item");
        ((TextView) this.itemView.findViewById(R.id.title)).setText(item.name);
        TextView textView = (TextView) this.itemView.findViewById(R.id.desc);
        Resources resources = this.itemView.getContext().getResources();
        long j = item.userCount;
        textView.setText(resources.getQuantityString(R.plurals.cc, (int) j, Long.valueOf(j)));
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.e_q);
        C2068389v c2068389v = (C2068389v) this.LJLJJL.getValue();
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        smartImageView.setPlaceholderImage(c2068389v.LIZ(context));
        SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.eb0);
        C2068389v c2068389v2 = (C2068389v) this.LJLJJL.getValue();
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        smartImageView2.setPlaceholderImage(c2068389v2.LIZ(context2));
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.title), new ACListenerS29S0100000_9(this, 152));
        C16880lQ.LJJIJLIJ((SmartImageView) this.itemView.findViewById(R.id.e_q), new ACListenerS29S0100000_9(this, 153));
        C16880lQ.LJJIJLIJ((SmartImageView) this.itemView.findViewById(R.id.eb0), new ACListenerS29S0100000_9(this, 154));
        if (item.relatedAweme != null) {
            C16880lQ.LJIIJ(new ACListenerS44S0200000_9(item, this, 40), this.itemView);
            SmartImageView smartImageView3 = (SmartImageView) this.itemView.findViewById(R.id.cover);
            o.LJIIIIZZ(smartImageView3, "itemView.cover");
            Video video = ((NewFaceStickerBean) getItem()).relatedAweme.getVideo();
            o.LJIIIIZZ(video, "item.relatedAweme.video");
            if (C208458Gb.LIZJ(smartImageView3, video, this.LJLILLLLZI, false, LiveTryModeCountDownThresholdSetting.DEFAULT)) {
                ((SmartImageView) this.itemView.findViewById(R.id.cover)).setAttached(true);
                ((SmartImageView) this.itemView.findViewById(R.id.cover)).LJ();
            } else {
                W5F LJII = W5U.LJII(C78939UyV.LJ(((NewFaceStickerBean) getItem()).relatedAweme.getVideo().getCover()));
                LJII.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.cover);
                C16880lQ.LLJJJ(LJII);
            }
            ((ImageView) this.itemView.findViewById(R.id.e_q)).setVisibility(0);
            ((ImageView) this.itemView.findViewById(R.id.eb0)).setVisibility(4);
            W5F LJII2 = W5U.LJII(C78939UyV.LJ(item.iconUrl));
            LJII2.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.e_q);
            C16880lQ.LLJJJ(LJII2);
        } else {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 155), this.itemView);
            W5F LJII3 = W5U.LJII(C78939UyV.LJ(item.iconUrl));
            LJII3.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.cover);
            LJII3.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LJII3.LJIL = new MHO(25, 0);
            C16880lQ.LLJJJ(LJII3);
            ((ImageView) this.itemView.findViewById(R.id.e_q)).setVisibility(4);
            ((ImageView) this.itemView.findViewById(R.id.eb0)).setVisibility(0);
            W5F LJII4 = W5U.LJII(C78939UyV.LJ(item.iconUrl));
            LJII4.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.eb0);
            C16880lQ.LLJJJ(LJII4);
        }
        if (item.getFeatureVideoSource() == EnumC56422MCk.TOP_LIKED && C53378KxC.LIZIZ()) {
            this.itemView.findViewById(R.id.bzd).setVisibility(0);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.bzd);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append(item.relatedAweme.getAuthor().getUniqueId());
            textView2.setText(X1D.LIZIZ(LIZ));
        } else {
            this.itemView.findViewById(R.id.bzd).setVisibility(8);
        }
        String str2 = item.ownerId;
        String str3 = item.id;
        boolean z = this.LJLIL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab_name", "effect");
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("prop_id", str3);
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("prop_card_show", c188727au.LIZ);
    }

    public EffectProfileViewHolder(ViewGroup viewGroup, boolean z) {
        super(C1DI.LIZ(viewGroup, "parent", R.layout.c41, viewGroup, false, "from(parent.context).inf…iewholder, parent, false)"));
        this.LJLIL = z;
        this.LJLILLLLZI = "EffectProfileViewHolder";
        this.LJLJI = "@";
        C65776Prg LIZ = C65352Pkq.LIZ(EffectProfileListViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 148));
        this.LJLJJL = C221108m2.LIZIZ(AP2.LJLIL);
    }
}
