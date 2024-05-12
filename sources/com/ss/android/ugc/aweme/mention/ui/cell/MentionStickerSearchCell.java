package com.ss.android.ugc.aweme.mention.ui.cell;

import X.C16880lQ;
import X.C19N;
import X.C1DI;
import X.C217798gh;
import X.C217918gt;
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
import com.ss.android.ugc.aweme.mention.ui.cell.MentionStickerSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerSearchViewModel;
import com.ss.android.ugc.aweme.utils.Au2S0S1200000_3;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MentionStickerSearchCell extends PowerCell<C217918gt> {
    public final String L() {
        String str;
        C218098hB c218098hB = C218088hA.LIZIZ;
        if (c218098hB != null) {
            C217798gh c217798gh = c218098hB.getSearchViewModel$mention_tag_release().LJLIL;
            if (c217798gh == null || (str = c217798gh.LIZLLL) == null) {
                return "";
            }
            return str;
        }
        o.LJIJI("mentionStickerContainerView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C217918gt c217918gt) {
        final String str;
        Integer LIZJ;
        ImageUrlModel imageUrlModel;
        float f;
        final C217918gt t = c217918gt;
        o.LJIIIZ(t, "t");
        View findViewById = this.itemView.findViewById(R.id.gh6);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…tion_sticker_item_border)");
        View findViewById2 = this.itemView.findViewById(R.id.gh5);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…tion_sticker_item_avatar)");
        SmartImageView smartImageView = (SmartImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.gh8);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…on_sticker_item_username)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        if (t.LJLIL.LJIJI.LIZJ) {
            str = "all_user";
        } else {
            str = "follow";
        }
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: X.8hD
            public final /* synthetic */ MentionStickerSearchCell LJLILLLLZI;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View v) {
                o.LJIIIZ(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View v) {
                o.LJIIIZ(v, "v");
                C218098hB c218098hB = C218088hA.LIZIZ;
                if (c218098hB != null) {
                    java.util.Set<String> set = c218098hB.getSearchViewModel$mention_tag_release().LJLJI;
                    if (!set.contains(t.LJLIL.LIZ)) {
                        C7DS.LIZIZ("tag_mention_head_show", new AqS13S2100000_3(t.LJLIL, str, this.LJLILLLLZI.L(), 10));
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
            MentionStickerSearchViewModel searchViewModel$mention_tag_release = c218098hB.getSearchViewModel$mention_tag_release();
            String str2 = y9g.LIZ;
            searchViewModel$mention_tag_release.getClass();
            if (o.LJ(str2, null)) {
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
                    MentionStickerSearchViewModel searchViewModel$mention_tag_release2 = c218098hB2.getSearchViewModel$mention_tag_release();
                    String str3 = y9g2.LIZ;
                    searchViewModel$mention_tag_release2.getClass();
                    if (o.LJ(str3, null)) {
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
            C16880lQ.LJIIJ(new Au2S0S1200000_3(this, t, str, 1), this.itemView);
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
