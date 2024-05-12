package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.promotion;

import X.C16880lQ;
import X.C221108m2;
import X.C26685Add;
import X.C32151Nz;
import X.C47261Igj;
import X.C5F2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72545SdZ;
import X.C7MY;
import X.O6R;
import X.ORS;
import Y.ARunnableS23S0200000_4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UsSellerPromotionVH extends AbsFullSpanVH {
    public final Fragment LJLIL;
    public final LinkedList<C5F2> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int LIZIZ;
        C26685Add item = (C26685Add) obj;
        o.LJIIIZ(item, "item");
        TextView textView = (TextView) _$_findCachedViewById(R.id.icv);
        String str = item.LIZ;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(item, this, 39), itemView);
        ViewGroup promotion_flow_layout = (ViewGroup) _$_findCachedViewById(R.id.icd);
        o.LJIIIIZZ(promotion_flow_layout, "promotion_flow_layout");
        LinkedList<C5F2> linkedList = this.LJLILLLLZI;
        while (promotion_flow_layout.getChildCount() > 0) {
            View childAt = promotion_flow_layout.getChildAt(0);
            C16880lQ.LJLLL(childAt, promotion_flow_layout);
            if (childAt instanceof C5F2) {
                linkedList.add(childAt);
            }
        }
        int i = 0;
        for (SellerPromotionItem sellerPromotionItem : item.LIZJ) {
            int i2 = i + 1;
            if (i >= 0) {
                SellerPromotionItem sellerPromotionItem2 = sellerPromotionItem;
                TuxTextView tuxTextView = (TuxTextView) ORS.LJJLJLI(this.LJLILLLLZI);
                if (tuxTextView == null) {
                    final Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    tuxTextView = new TuxTextView(context) { // from class: X.5F2
                        public final Paint LJLLLL;
                        public final RectF LJLLLLLL;
                        public Integer LJLZ;
                        public float LJZ;
                        public float LJZI;
                        public final java.util.Map<Integer, View> LJZL = new LinkedHashMap();

                        @Override // com.bytedance.tux.input.TuxTextView
                        public final View LJJIJIL(int i3) {
                            java.util.Map<Integer, View> map = this.LJZL;
                            Integer valueOf = Integer.valueOf(R.id.title);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                            View view = (View) linkedHashMap.get(valueOf);
                            if (view != null) {
                                return view;
                            }
                            View findViewById = findViewById(R.id.title);
                            if (findViewById == null) {
                                return null;
                            }
                            linkedHashMap.put(valueOf, findViewById);
                            return findViewById;
                        }

                        public final Integer getBorderCol() {
                            return this.LJLZ;
                        }

                        public final float getRadius() {
                            return this.LJZI;
                        }

                        public final float getStrokeWidth() {
                            return this.LJZ;
                        }

                        {
                            Paint paint = new Paint();
                            this.LJLLLL = paint;
                            this.LJLLLLLL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                            this.LJZ = C45804HyK.LJJ(1);
                            this.LJZI = C45804HyK.LJJ(0);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setAntiAlias(true);
                            this.LJLZ = Integer.valueOf(R.attr.eb);
                        }

                        @Override // android.widget.TextView, android.view.View
                        public final void onDraw(Canvas canvas) {
                            Integer num;
                            CharSequence text = getText();
                            o.LJIIIIZZ(text, "text");
                            if ((!ujb.o.LJJJJJL(text)) && (num = this.LJLZ) != null) {
                                int intValue = num.intValue();
                                Paint paint = this.LJLLLL;
                                Context context2 = getContext();
                                o.LJIIIIZZ(context2, "context");
                                paint.setColor(AnonymousClass636.LJIIIIZZ(intValue, context2));
                                this.LJLLLL.setStrokeWidth(this.LJZ);
                                RectF rectF = this.LJLLLLLL;
                                float f = this.LJZI;
                                rectF.left = f;
                                rectF.top = f;
                                rectF.right = getMeasuredWidth() - this.LJZI;
                                RectF rectF2 = this.LJLLLLLL;
                                float measuredHeight = getMeasuredHeight();
                                float f2 = this.LJZI;
                                rectF2.bottom = measuredHeight - f2;
                                if (canvas != null) {
                                    canvas.drawRoundRect(this.LJLLLLLL, f2, f2, this.LJLLLL);
                                }
                            }
                            super.onDraw(canvas);
                        }

                        public final void setBorderCol(Integer num) {
                            this.LJLZ = num;
                        }

                        public final void setRadius(float f) {
                            this.LJZI = f;
                        }

                        public final void setStrokeWidth(float f) {
                            this.LJZ = f;
                        }
                    };
                }
                tuxTextView.setTextColorRes(R.attr.eb);
                tuxTextView.setTuxFont(61);
                tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), C7MY.LIZIZ(4), C7MY.LIZIZ(4), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                tuxTextView.setText(sellerPromotionItem2.name);
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.icd);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (i != 0) {
                    LIZIZ = C7MY.LIZIZ(8);
                } else {
                    LIZIZ = C7MY.LIZIZ(0);
                }
                marginLayoutParams.setMarginStart(LIZIZ);
                viewGroup.addView(tuxTextView, marginLayoutParams);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        _$_findCachedViewById(R.id.icd).post(new ARunnableS23S0200000_4(this, item, 37));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsSellerPromotionVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a9k, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJI = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = new LinkedList<>();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 190));
    }
}
