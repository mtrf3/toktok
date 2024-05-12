package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shippingmethod;

import X.C16880lQ;
import X.C1FL;
import X.C26952Ahw;
import X.C26953Ahx;
import X.C2RO;
import X.C44878HjO;
import X.C47261Igj;
import X.C70963Rt9;
import X.C76800UCe;
import X.C78946Uyc;
import X.ORS;
import X.OUP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USShippingMethodsVH extends ECJediViewHolder {
    public ViewGroup LJLIL;
    public final LinkedList<C2RO> LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USShippingMethodsVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8z, viewGroup, false, "from(parent.context)\n   …st_layout, parent, false)"));
        this.LJLJI = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLILLLLZI = new LinkedList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.2RO] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        String str;
        TextView textView;
        String priceStr;
        TextView textView2;
        TextView textView3;
        C26952Ahw item = (C26952Ahw) obj;
        o.LJIIIZ(item, "item");
        List<LogisticDTO> list = item.LIZ;
        final int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View findViewById = this.itemView.findViewById(R.id.h2j);
            if (findViewById != null) {
                OUP.LJJLIIIJ(findViewById);
            }
            View findViewById2 = this.itemView.findViewById(R.id.jx0);
            if (findViewById2 != null) {
                OUP.LJIJJLI(findViewById2);
                return;
            }
            return;
        }
        View findViewById3 = this.itemView.findViewById(R.id.h2j);
        if (findViewById3 != null) {
            OUP.LJIJJLI(findViewById3);
        }
        View findViewById4 = this.itemView.findViewById(R.id.jx0);
        if (findViewById4 != null) {
            OUP.LJJLIIIJ(findViewById4);
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.jx0);
        this.LJLIL = viewGroup;
        if (viewGroup != null) {
            LinkedList<C2RO> linkedList = this.LJLILLLLZI;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof C2RO) {
                    linkedList.add(c76800UCe);
                }
            }
        }
        int i2 = 0;
        for (LogisticDTO logisticDTO : item.LIZ) {
            int i3 = i2 + 1;
            final AttributeSet attributeSet = null;
            if (i2 >= 0) {
                LogisticDTO logisticDTO2 = logisticDTO;
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C78946Uyc.LJJIIJ(itemView, new C70963Rt9(), new AqS94S0101000_4(logisticDTO2, i2, 15));
                C2RO c2ro = (C2RO) ORS.LJJLJLI(this.LJLILLLLZI);
                C2RO c2ro2 = c2ro;
                if (c2ro == null) {
                    final Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    c2ro2 = new ConstraintLayout(context, attributeSet, i) { // from class: X.2RO
                        public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

                        public final View _$_findCachedViewById(int i4) {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
                            View view = (View) linkedHashMap.get(Integer.valueOf(i4));
                            if (view != null) {
                                return view;
                            }
                            View findViewById5 = findViewById(i4);
                            if (findViewById5 == null) {
                                return null;
                            }
                            linkedHashMap.put(Integer.valueOf(i4), findViewById5);
                            return findViewById5;
                        }

                        {
                            super(context, attributeSet, i);
                            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a8y, this, true);
                        }
                    };
                }
                String str2 = logisticDTO2.deliveryName;
                if (str2 != null && (textView3 = (TextView) c2ro2._$_findCachedViewById(R.id.jwj)) != null) {
                    textView3.setText(str2);
                }
                Price price = logisticDTO2.shippingFee;
                if (price != null && (priceStr = price.getPriceStr()) != null && (textView2 = (TextView) c2ro2._$_findCachedViewById(R.id.jwk)) != null) {
                    textView2.setText(priceStr);
                }
                LogisticTextDTO logisticTextDTO = logisticDTO2.logisticText;
                if (logisticTextDTO != null && (str = logisticTextDTO.estimatedArrivalText) != null && (textView = (TextView) c2ro2._$_findCachedViewById(R.id.jwl)) != null) {
                    textView.setText(str);
                }
                LogisticLinkRichText logisticLinkRichText = logisticDTO2.shippingThresholdText;
                if (logisticLinkRichText != null) {
                    View _$_findCachedViewById = c2ro2._$_findCachedViewById(R.id.jxh);
                    if (_$_findCachedViewById != null) {
                        OUP.LJJLIIIJ(_$_findCachedViewById);
                    }
                    TextView textView4 = (TextView) c2ro2._$_findCachedViewById(R.id.jxh);
                    if (textView4 != null) {
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        View view = this.itemView;
                        C26953Ahx c26953Ahx = C26953Ahx.LJLIL;
                        richTextUtil.getClass();
                        textView4.setText(RichTextUtil.LIZ(logisticLinkRichText, view, c26953Ahx));
                    }
                }
                OUP.LJJLIIIJ(c2ro2);
                ViewGroup viewGroup2 = this.LJLIL;
                if (viewGroup2 != null) {
                    viewGroup2.addView(c2ro2);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
