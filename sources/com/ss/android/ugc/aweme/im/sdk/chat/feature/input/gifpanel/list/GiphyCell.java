package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.list;

import X.C018905p;
import X.C105454Bx;
import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C47261Igj;
import X.C4AS;
import X.C62822Ol8;
import X.C62846OlW;
import X.C86973bB;
import X.EF7;
import X.InterfaceC81853WAn;
import X.X1D;
import Y.ACListenerS27S0300000_1;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyDataBean;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyImagesBean;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.model.GifRes;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyCell extends PowerCell<C86973bB> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 103));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 104));

    public final C62846OlW L() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-emojiIv>(...)");
        return (C62846OlW) value;
    }

    public static C105454Bx M(GiphyDataBean giphyDataBean) {
        List<String> list;
        GifRes gifRes;
        String str;
        GifRes gifRes2;
        String str2;
        GifRes gifRes3;
        String str3;
        Emoji emoji = new Emoji();
        C105454Bx c105454Bx = new C105454Bx();
        emoji.setAnimateType(giphyDataBean.type);
        emoji.setStickerType(3);
        GiphyImagesBean giphyImagesBean = giphyDataBean.images;
        if (giphyImagesBean != null && (gifRes3 = giphyImagesBean.fixedHeightImage) != null && (str3 = gifRes3.width) != null) {
            emoji.setWidth(CastIntegerProtector.parseInt(str3));
        }
        GiphyImagesBean giphyImagesBean2 = giphyDataBean.images;
        if (giphyImagesBean2 != null && (gifRes2 = giphyImagesBean2.fixedHeightImage) != null && (str2 = gifRes2.height) != null) {
            emoji.setHeight(CastIntegerProtector.parseInt(str2));
        }
        emoji.setDisplayName(EF7.LIZIZ().getString(R.string.h71));
        UrlModel urlModel = new UrlModel();
        GiphyImagesBean giphyImagesBean3 = giphyDataBean.images;
        if (giphyImagesBean3 != null && (gifRes = giphyImagesBean3.fixedHeightImage) != null && (str = gifRes.url) != null) {
            list = C47261Igj.LJJIJ(str);
        } else {
            list = null;
        }
        urlModel.setUrlList(list);
        emoji.setAnimateUrl(urlModel);
        emoji.setStickerId(giphyDataBean.id);
        c105454Bx.LIZJ = emoji;
        return c105454Bx;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C86973bB c86973bB) {
        UrlModel animateUrl;
        final C86973bB t = c86973bB;
        o.LJIIIZ(t, "t");
        float height = r1.LIZJ.getHeight() / r1.LIZJ.getWidth();
        Emoji emoji = M(t.LJLIL).LIZJ;
        if (emoji == null || (animateUrl = emoji.getAnimateUrl()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = L().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p = (C018905p) layoutParams;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("H,1:");
        LIZ.append(height);
        c018905p.dimensionRatio = X1D.LIZIZ(LIZ);
        L().setLayoutParams(c018905p);
        L().setContentDescription(EF7.LIZIZ().getString(R.string.g26));
        final C62846OlW L = L();
        C16880lQ.LJJJJJL(L, null);
        C4AS.LIZIZ(L, animateUrl, "giphy", 0, 0, 0, 0, new InterfaceC81853WAn() { // from class: X.4Fj
            @Override // X.InterfaceC81853WAn
            public final void LIZIZ(String str, Throwable th) {
            }

            @Override // X.InterfaceC81853WAn
            public final void LIZJ(String str) {
            }

            @Override // X.InterfaceC81853WAn
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.InterfaceC81853WAn
            public final void LIZ(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                C62846OlW c62846OlW = C62846OlW.this;
                C16880lQ.LJJJJJL(c62846OlW, new ACListenerS27S0300000_1(this, c62846OlW, t, 9));
            }
        }, 248);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b_p, viewGroup, false, "from(parent.context)\n   …gered_gid, parent, false)");
    }
}
