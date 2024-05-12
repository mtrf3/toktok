package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review;

import X.C16880lQ;
import X.C1GE;
import X.C221108m2;
import X.C26508Aam;
import X.C26695Adn;
import X.C26696Ado;
import X.C26699Adr;
import X.C26838Ag6;
import X.C27162AlK;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70445Rkn;
import X.C72545SdZ;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS23S0101000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpShopReviewHeadViewHolder extends AbsFullSpanVH {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        getVm();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        C26838Ag6 c26838Ag6;
        List<ReviewFilterStruct> list;
        C70414RkI c70414RkI;
        super.onResume();
        trackTag(new C70445Rkn(getItem()));
        if (this.itemView.getY() < C27162AlK.LIZIZ) {
            ITEM item = getItem();
            if ((item instanceof C26838Ag6) && (c26838Ag6 = (C26838Ag6) item) != null && (list = c26838Ag6.LJLJI) != null) {
                int i = 0;
                for (ReviewFilterStruct reviewFilterStruct : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ReviewFilterStruct reviewFilterStruct2 = reviewFilterStruct;
                        PdpViewModel vm = getVm();
                        if (vm != null && (c70414RkI = vm.LLFII) != null) {
                            c70414RkI.LJJIJIIJIL(i2, reviewFilterStruct2, "shop_review_entrance");
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpShopReviewHeadViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a4e, viewGroup, false));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 64));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        C26838Ag6 item = (C26838Ag6) obj;
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        TextView textView = (TextView) view.findViewById(R.id.jyl);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.itemView.getContext().getString(R.string.ffl));
        LIZ.append(" (");
        String str = item.LJLILLLLZI;
        if (str == null) {
            Object obj2 = item.LJLIL;
            if (obj2 == null) {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            str = obj2.toString();
        }
        LIZ.append(str);
        LIZ.append(')');
        textView.setText(X1D.LIZIZ(LIZ));
        view.findViewById(R.id.k8e).setVisibility(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<ReviewFilterStruct> list = item.LJLJI;
        if (list != null) {
            for (ReviewFilterStruct reviewFilterStruct : list) {
                Integer num = reviewFilterStruct.type;
                if (num == null || num.intValue() != 3) {
                    arrayList.add(reviewFilterStruct);
                } else {
                    arrayList2.add(reviewFilterStruct);
                }
            }
        }
        if (C1GE.LJIILIIL(arrayList2)) {
            view.findViewById(R.id.kcd).setVisibility(8);
            view.findViewById(R.id.j0n).setVisibility(0);
            ((C26699Adr) view.findViewById(R.id.j0n)).LIZ(arrayList2);
        } else if (arrayList2.isEmpty() && C1GE.LJIILIIL(arrayList)) {
            view.findViewById(R.id.kcd).setVisibility(0);
            view.findViewById(R.id.j0n).setVisibility(8);
            C26696Ado c26696Ado = (C26696Ado) view.findViewById(R.id.kcd);
            c26696Ado.getClass();
            if (c26696Ado.LJLIL.getChildCount() == 0) {
                c26696Ado.LJLIL.removeAllViews();
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ReviewFilterStruct reviewFilterStruct2 = (ReviewFilterStruct) next;
                        Context context = c26696Ado.getContext();
                        o.LJIIIIZZ(context, "context");
                        C26695Adn c26695Adn = new C26695Adn(context);
                        TuxIconView star = c26695Adn.getStar();
                        if (star != null) {
                            Integer num2 = reviewFilterStruct2.type;
                            if (num2 == null || num2.intValue() != 2) {
                                i = 8;
                            } else {
                                i = 0;
                            }
                            star.setVisibility(i);
                        }
                        if (o.LJ("102", reviewFilterStruct2.filterId)) {
                            TuxIconView star2 = c26695Adn.getStar();
                            if (star2 != null) {
                                star2.setVisibility(0);
                            }
                            TuxIconView star3 = c26695Adn.getStar();
                            if (star3 != null) {
                                star3.setIconRes(R.raw.icon_camera_fill);
                            }
                            TuxIconView star4 = c26695Adn.getStar();
                            if (star4 != null) {
                                star4.setTintColorRes(R.attr.go);
                            }
                            TextView pre = c26695Adn.getPre();
                            if (pre != null) {
                                pre.setVisibility(8);
                            }
                            TextView suf = c26695Adn.getSuf();
                            if (suf != null) {
                                suf.setText(reviewFilterStruct2.name + reviewFilterStruct2.countStr);
                            }
                        } else {
                            TextView pre2 = c26695Adn.getPre();
                            if (pre2 != null) {
                                pre2.setVisibility(0);
                            }
                            TextView pre3 = c26695Adn.getPre();
                            if (pre3 != null) {
                                pre3.setText(reviewFilterStruct2.name);
                            }
                            TextView suf2 = c26695Adn.getSuf();
                            if (suf2 != null) {
                                suf2.setText(reviewFilterStruct2.countStr);
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        int i4 = C27162AlK.LJIIIZ;
                        marginLayoutParams.rightMargin = i4;
                        marginLayoutParams.setMarginEnd(i4);
                        c26695Adn.setLayoutParams(marginLayoutParams);
                        c26695Adn.setTag(reviewFilterStruct2);
                        c26695Adn.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0101000_4(i2, c26696Ado, 6)));
                        c26696Ado.LJLIL.addView(c26695Adn);
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        } else {
            view.findViewById(R.id.kcd).setVisibility(8);
            view.findViewById(R.id.j0n).setVisibility(8);
        }
        View constraintLayout_head = view.findViewById(R.id.brz);
        o.LJIIIIZZ(constraintLayout_head, "constraintLayout_head");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 68, 42), constraintLayout_head);
        View review_filter_group = view.findViewById(R.id.j0n);
        o.LJIIIIZZ(review_filter_group, "review_filter_group");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 69, 42), review_filter_group);
        View star_review_filter_group = view.findViewById(R.id.kcd);
        o.LJIIIIZZ(star_review_filter_group, "star_review_filter_group");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 70, 42), star_review_filter_group);
        ((C26699Adr) view.findViewById(R.id.j0n)).setOnSelectedChangeListener(new AqS167S0200000_4(this, view, 28));
        ((C26696Ado) view.findViewById(R.id.kcd)).setOnSelectedChangeListener(new AqS167S0200000_4(this, view, 29));
    }
}
