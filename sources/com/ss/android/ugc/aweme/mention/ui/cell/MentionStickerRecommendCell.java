package com.ss.android.ugc.aweme.mention.ui.cell;

import X.C16880lQ;
import X.C19N;
import X.C1DI;
import X.C217838gl;
import X.C218048h6;
import X.C218088hA;
import X.C218098hB;
import X.C218128hE;
import X.C56331M8x;
import X.C72972SkS;
import X.C7MY;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.Y9G;
import X.Y9H;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerRecommendCell;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerRecommendViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.Au2S0S1200000_3;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MentionStickerRecommendCell extends PowerCell<C218048h6> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C218048h6 c218048h6) {
        final String str;
        String str2;
        Integer LIZJ;
        ImageUrlModel imageUrlModel;
        float f;
        String str3;
        final C218048h6 t = c218048h6;
        o.LJIIIZ(t, "t");
        View findViewById = this.itemView.findViewById(R.id.gh6);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…tion_sticker_item_border)");
        View findViewById2 = this.itemView.findViewById(R.id.gh5);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…tion_sticker_item_avatar)");
        SmartImageView smartImageView = (SmartImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.gh8);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…on_sticker_item_username)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        int i = C217838gl.LIZ[t.LJLIL.LJIJI.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "all_user";
                } else {
                    str = "follow";
                }
            } else {
                str = "friend";
            }
        } else {
            str = "recent";
        }
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: X.8hC
            public final /* synthetic */ MentionStickerRecommendCell LJLILLLLZI;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View v) {
                o.LJIIIZ(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View v) {
                o.LJIIIZ(v, "v");
                C218098hB c218098hB = C218088hA.LIZIZ;
                if (c218098hB != null) {
                    java.util.Set<String> set = c218098hB.getRecommendViewModel$mention_tag_release().LJLJI;
                    if (!set.contains(t.LJLIL.LIZ)) {
                        MentionStickerRecommendCell mentionStickerRecommendCell = this.LJLILLLLZI;
                        Y9G y9g = t.LJLIL;
                        String str4 = str;
                        mentionStickerRecommendCell.getClass();
                        C7DS.LIZIZ("tag_mention_head_show", new AqS57S1100000_3(y9g, str4, 29));
                        set.add(t.LJLIL.LIZ);
                        return;
                    }
                    return;
                }
                o.LJIJI("mentionStickerContainerView");
                throw null;
            }

            {
                this.LJLILLLLZI = this;
            }
        });
        tuxTextView.setText(C56331M8x.LIZIZ(Y9H.LIZJ(t.LJLIL), false, false));
        GradientDrawable gradientDrawable = null;
        tuxTextView.setBackground(null);
        Y9G y9g = t.LJLIL;
        C218098hB c218098hB = C218088hA.LIZIZ;
        if (c218098hB != null) {
            MentionStickerRecommendViewModel recommendViewModel$mention_tag_release = c218098hB.getRecommendViewModel$mention_tag_release();
            String str4 = y9g.LIZ;
            User user = recommendViewModel$mention_tag_release.LJLIL;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            if (o.LJ(str4, str2)) {
                LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.eb);
            } else {
                LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.dk);
            }
            if (LIZJ != null) {
                tuxTextView.setTextColor(LIZJ.intValue());
            }
            UrlModel urlModel = t.LJLIL.LJFF;
            if (urlModel == null) {
                imageUrlModel = null;
            } else {
                imageUrlModel = new ImageUrlModel(urlModel.getUri(), urlModel.getUrlList());
            }
            W5F LJII = W5U.LJII(imageUrlModel);
            S3I s3i = new S3I();
            s3i.LIZ = true;
            LJII.LJIJJLI = new S3L(s3i);
            LJII.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJII);
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eb);
            if (LIZIZ != null) {
                int intValue = LIZIZ.intValue();
                Y9G y9g2 = t.LJLIL;
                C218098hB c218098hB2 = C218088hA.LIZIZ;
                if (c218098hB2 != null) {
                    MentionStickerRecommendViewModel recommendViewModel$mention_tag_release2 = c218098hB2.getRecommendViewModel$mention_tag_release();
                    String str5 = y9g2.LIZ;
                    User user2 = recommendViewModel$mention_tag_release2.LJLIL;
                    if (user2 != null) {
                        str3 = user2.getUid();
                    } else {
                        str3 = null;
                    }
                    if (o.LJ(str5, str3)) {
                        C218128hE c218128hE = new C218128hE();
                        c218128hE.LIZ = 1;
                        int LIZIZ2 = C7MY.LIZIZ(2);
                        c218128hE.LIZJ = Integer.valueOf(intValue);
                        c218128hE.LIZLLL = Integer.valueOf(LIZIZ2);
                        c218128hE.LIZIZ = 0;
                        gradientDrawable = c218128hE.LIZ();
                    }
                    findViewById.setBackground(gradientDrawable);
                } else {
                    o.LJIJI("mentionStickerContainerView");
                    throw null;
                }
            }
            C16880lQ.LJIIJ(new Au2S0S1200000_3(this, t, str, 0), this.itemView);
            View view = this.itemView;
            if (t.LJLIL.LJIJI.LIZ) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            view.setAlpha(f);
            return;
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bsi, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }
}
