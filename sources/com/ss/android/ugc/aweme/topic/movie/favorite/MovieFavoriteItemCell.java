package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.C16880lQ;
import X.C184817Nd;
import X.C1DI;
import X.C26338AVi;
import X.C32151Nz;
import X.C7KI;
import X.C90193gN;
import X.O6R;
import X.ORZ;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieFavoriteItemCell extends PowerCell<C184817Nd> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        view.findViewById(R.id.jhc).setVisibility(8);
        View ll_titles = view.findViewById(R.id.g6p);
        o.LJIIIIZZ(ll_titles, "ll_titles");
        C26338AVi.LJI(ll_titles, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))), null, false, 27);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C184817Nd c184817Nd) {
        double d;
        String str;
        Integer num;
        List<String> urlList;
        String str2;
        Integer num2;
        C184817Nd t = c184817Nd;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        TopicRawInfo topicRawInfo = t.LJLIL;
        ((TextView) view.findViewById(R.id.gni)).setText(topicRawInfo.title);
        TextView textView = (TextView) view.findViewById(R.id.gnh);
        Double d2 = topicRawInfo.externalRating;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        String str3 = "";
        Double d3 = null;
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (num2 = topicRawInfo.year) != null && num2.intValue() != 0 && C90193gN.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            if (topicRawInfo.externalRating != null) {
                d3 = Double.valueOf(((int) (r0.doubleValue() * 10)) / 10.0d);
            }
            LIZ.append(d3);
            LIZ.append(" IMDb · ");
            LIZ.append(topicRawInfo.year);
            str = X1D.LIZIZ(LIZ);
        } else {
            Double d4 = topicRawInfo.externalRating;
            if (d4 != null && d4.doubleValue() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (num = topicRawInfo.year) != null && num.intValue() != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(topicRawInfo.year);
                LIZ2.append(" · IMDb ");
                if (topicRawInfo.externalRating != null) {
                    d3 = Double.valueOf(((int) (r0.doubleValue() * 10)) / 10.0d);
                }
                LIZ2.append(d3);
                str = X1D.LIZIZ(LIZ2);
            } else {
                Double d5 = topicRawInfo.externalRating;
                if (d5 != null && d5.doubleValue() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("IMDb ");
                    if (topicRawInfo.externalRating != null) {
                        d3 = Double.valueOf(((int) (r0.doubleValue() * 10)) / 10.0d);
                    }
                    LIZ3.append(d3);
                    str = X1D.LIZIZ(LIZ3);
                } else {
                    Integer num3 = topicRawInfo.year;
                    if (num3 == null || num3.intValue() == 0) {
                        str = "";
                    } else {
                        str = String.valueOf(topicRawInfo.year);
                    }
                }
            }
        }
        textView.setText(str);
        C16880lQ.LJIIJ(new ACListenerS29S0300000_3(topicRawInfo, t, view, 16), view);
        UrlModel urlModel = topicRawInfo.cover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) ORZ.LJLLLL(urlList)) != null) {
            str3 = str2;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str3);
        LJIIIIZZ.LJJIIJ = (SmartImageView) view.findViewById(R.id.gnf);
        SmartImageView movie_cover = (SmartImageView) view.findViewById(R.id.gnf);
        o.LJIIIIZZ(movie_cover, "movie_cover");
        LJIIIIZZ.LIZLLL(new C7KI(movie_cover));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.csn, viewGroup, false, "from(parent.context).inf…item_cell, parent, false)");
    }
}
