package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.module.logistic;

import X.C26952Ahw;
import X.C26958Ai2;
import X.C2QY;
import X.C44878HjO;
import X.C45804HyK;
import X.ORZ;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfExtraLogisticsInfoViewHolder extends ExtraLogisticsInfoViewHolder {
    public Map<Integer, View> _$_findViewCache;
    public TuxTextView shippingMethodHeaderView;
    public TuxTextView shippingTimeHeaderView;
    public ViewGroup timeoutContainer;
    public TuxTextView timeoutTextView;
    public TuxTextView title;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder
    public void bindStyle() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder
    public void bindView() {
        setDetailListView((ViewGroup) _$_findCachedViewById(R.id.c6r));
        this.shippingMethodHeaderView = (TuxTextView) this.itemView.findViewById(R.id.lmt);
        this.shippingTimeHeaderView = (TuxTextView) this.itemView.findViewById(R.id.lmv);
        this.timeoutContainer = (ViewGroup) this.itemView.findViewById(R.id.ln0);
        this.timeoutTextView = (TuxTextView) this.itemView.findViewById(R.id.ln2);
        this.title = (TuxTextView) this.itemView.findViewById(R.id.title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfExtraLogisticsInfoViewHolder(ViewGroup viewGroup) {
        super(viewGroup, R.layout.a8f);
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder
    public void onBind(C26952Ahw item) {
        LogisticLinkRichText logisticLinkRichText;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        List<LogisticLinkRichText> list = item.LIZIZ;
        if (list != null && (logisticLinkRichText = (LogisticLinkRichText) ORZ.LJLLLLLL(0, list)) != null) {
            TuxTextView tuxTextView = this.title;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            ViewGroup viewGroup = this.timeoutContainer;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TuxTextView tuxTextView2 = this.timeoutTextView;
            if (tuxTextView2 == null) {
                return;
            }
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            View view = this.itemView;
            C26958Ai2 c26958Ai2 = C26958Ai2.LJLIL;
            richTextUtil.getClass();
            tuxTextView2.setText(RichTextUtil.LIZ(logisticLinkRichText, view, c26958Ai2));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C26952Ahw) obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder
    public void setStyle(C2QY view, LogisticDTO logistic) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Integer valueOf;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(logistic, "logistic");
        ((TuxTextView) view.LIZ(R.id.jwz)).setTextColorRes(R.attr.go);
        TuxTextView tuxTextView = this.shippingMethodHeaderView;
        ViewGroup.LayoutParams layoutParams = null;
        if (tuxTextView != null) {
            layoutParams = tuxTextView.getLayoutParams();
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (resources = LJIJJ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (valueOf = Integer.valueOf(displayMetrics.widthPixels)) != null) {
            int intValue = valueOf.intValue();
            if (layoutParams != null) {
                layoutParams.width = intValue / 5;
            }
        }
        TuxTextView tuxTextView2 = this.shippingMethodHeaderView;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder
    public void setThirdPartyLogistics(C2QY view, LogisticDTO logistic) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(logistic, "logistic");
        super.setThirdPartyLogistics(view, logistic);
        TuxTextView tuxTextView = this.shippingTimeHeaderView;
        if (tuxTextView == null) {
            return;
        }
        int i = 0;
        if (logistic.leadTime == null) {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }
}
