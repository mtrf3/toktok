package com.ss.android.ugc.aweme.topic.book.recommend;

import X.AbstractC029409q;
import X.AbstractC13940gg;
import X.AnonymousClass391;
import X.C13930gf;
import X.C16880lQ;
import X.C184817Nd;
import X.C1DI;
import X.C26338AVi;
import X.C278817o;
import X.C32151Nz;
import X.C78897Uxp;
import X.O6R;
import X.ORZ;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendItemCell;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookRecommendItemCell extends PowerCell<C184817Nd> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.7Nk
            public InterfaceC65784Pro<String> LJ;
            public final float LJFF = 0.001f;
            public final C184877Nj LJI;

            @Override // X.AbstractC13940gg
            public final boolean LJI() {
                return false;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC19530ph LJ() {
                return this.LJI;
            }

            @Override // X.AbstractC13940gg
            public final float LJIIIZ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.7Nj] */
            {
                this.LJ = new AqS153S0100000_3(this, 1066);
                this.LJI = new InterfaceC19530ph() { // from class: X.7Nj
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        String str;
                        TopicRawInfo topicRawInfo;
                        TopicRawInfo topicRawInfo2;
                        o.LJIIIZ(itemID, "itemID");
                        C184817Nd item = BookRecommendItemCell.this.getItem();
                        String str2 = null;
                        if (item != null && (topicRawInfo2 = item.LJLIL) != null) {
                            str = topicRawInfo2.id;
                        } else {
                            str = null;
                        }
                        C184817Nd item2 = BookRecommendItemCell.this.getItem();
                        if (item2 != null && (topicRawInfo = item2.LJLIL) != null) {
                            str2 = topicRawInfo.title;
                        }
                        C184847Ng.LIZJ("topic_detail", str, str2);
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C184817Nd c184817Nd) {
        Integer num;
        int i;
        List<String> urlList;
        String str;
        C184817Nd t = c184817Nd;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(smartImageView, "itemView.avatar");
        float f = 75;
        Integer valueOf = Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT);
        float f2 = LiveTryModeCountDownThresholdSetting.DEFAULT;
        float f3 = f / f2;
        UrlModel urlModel = t.LJLIL.cover;
        Integer num2 = null;
        if (urlModel != null) {
            num = Integer.valueOf(urlModel.getWidth());
        } else {
            num = null;
        }
        UrlModel urlModel2 = t.LJLIL.cover;
        if (urlModel2 != null) {
            num2 = Integer.valueOf(urlModel2.getHeight());
        }
        if (num != null && num2 != null && num.intValue() != 0 && num2.intValue() != 0) {
            float intValue = num.intValue() / num2.intValue();
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (intValue >= f3) {
                    marginLayoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
                    marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f / intValue)));
                } else {
                    marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                    float f4 = f2 * intValue;
                    marginLayoutParams.width = C278817o.LIZ(f4);
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf((f - f4) / 2)));
                    marginLayoutParams.setMargins(LJJIIZ, marginLayoutParams.topMargin, LJJIIZ, marginLayoutParams.bottomMargin);
                }
                smartImageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
                layoutParams2.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                smartImageView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        UrlModel urlModel3 = t.LJLIL.cover;
        if (urlModel3 != null && (urlList = urlModel3.getUrlList()) != null && (str = (String) ORZ.LJLLJ(urlList)) != null) {
            smartImageView.LIZ(W5U.LJIIIIZZ(str).LIZ());
        }
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition == 0) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJI(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, AnonymousClass391.LIZJ(5), null, false, 26);
        } else {
            AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
            if (bindingAdapter != null) {
                i = bindingAdapter.getItemCount();
            } else {
                i = 10;
            }
            if (absoluteAdapterPosition == i - 1) {
                View itemView2 = this.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C26338AVi.LJI(itemView2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, AnonymousClass391.LIZJ(16), null, false, 26);
            } else {
                View itemView3 = this.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                C26338AVi.LJI(itemView3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, AnonymousClass391.LIZJ(5), null, false, 26);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(t, 247), this.itemView);
        View findViewById = this.itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "itemView.avatar");
        C78897Uxp.LJJJJL(findViewById, C32151Nz.LJIIZILJ(2));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cse, viewGroup, false, "from(parent.context)\n   …er_layout, parent, false)");
    }
}
