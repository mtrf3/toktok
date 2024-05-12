package Y;

import X.C51591KMp;
import X.C6ZS;
import X.C6ZT;
import X.KN8;
import X.KN9;
import X.KNA;
import X.KNG;
import X.SY4;
import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import kotlin.jvm.internal.AqS96S0101000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACListenerS19S0301000_8 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS19S0301000_8 aCListenerS19S0301000_8, View view) {
        if (C6ZT.LIZ(view) || ((TuxTextView) aCListenerS19S0301000_8.l0).isSelected() || ((SearchHubTabsComponent) aCListenerS19S0301000_8.l1).H3().getState().LJLJLLL) {
            return;
        }
        SearchHubHeaderVM H3 = ((SearchHubTabsComponent) aCListenerS19S0301000_8.l1).H3();
        int i = aCListenerS19S0301000_8.i3;
        H3.getClass();
        H3.withState(new AqS96S0101000_8(i, H3, 1));
        H3.withState(new AqS96S0101000_8(i, H3, 4));
        ((RecyclerView) aCListenerS19S0301000_8.l2).LJLIL(aCListenerS19S0301000_8.i3);
    }

    public static final void onClick$1(ACListenerS19S0301000_8 aCListenerS19S0301000_8, View view) {
        String str;
        EffectStructV2 effectStructV2;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = ((KNA) aCListenerS19S0301000_8.l0).LJLIL;
        if (effectRecommendationCardViewModel != null) {
            Integer valueOf = Integer.valueOf(aCListenerS19S0301000_8.i3);
            CardContent cardContent = (CardContent) aCListenerS19S0301000_8.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            Context context = ((CardView) aCListenerS19S0301000_8.l2).getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCardViewModel.gv0(new KNG(context, valueOf, str));
        }
    }

    public static final void onClick$2(ACListenerS19S0301000_8 aCListenerS19S0301000_8, View view) {
        String str;
        EffectStructV2 effectStructV2;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = ((KNA) aCListenerS19S0301000_8.l0).LJLIL;
        if (effectRecommendationCardViewModel != null) {
            Integer valueOf = Integer.valueOf(aCListenerS19S0301000_8.i3);
            CardContent cardContent = (CardContent) aCListenerS19S0301000_8.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            Context context = ((CardView) aCListenerS19S0301000_8.l2).getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCardViewModel.gv0(new KN8(context, valueOf, str));
        }
    }

    public static final void onClick$3(ACListenerS19S0301000_8 aCListenerS19S0301000_8, View view) {
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel;
        String str;
        EffectStructV2 effectStructV2;
        if (!C6ZS.LIZ(view) && (effectRecommendationCarouselViewModel = ((KN9) aCListenerS19S0301000_8.l0).LLJJ) != null) {
            Integer valueOf = Integer.valueOf(aCListenerS19S0301000_8.i3);
            CardContent cardContent = (CardContent) aCListenerS19S0301000_8.l1;
            if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
                str = effectStructV2.effectId;
            } else {
                str = null;
            }
            Context context = ((SY4) aCListenerS19S0301000_8.l2).getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCarouselViewModel.gv0(new C51591KMp(context, valueOf, str));
        }
    }

    public ACListenerS19S0301000_8(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
