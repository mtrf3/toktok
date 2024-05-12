package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.staticsellingpoint;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C27192Alo;
import X.C27342AoE;
import X.C45804HyK;
import X.C47261Igj;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C76800UCe;
import X.EF7;
import X.KL2;
import X.ORS;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S0S2200000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS13S1101000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StaticSellingPointVH extends PdpHolder {
    public final C62822Ol8 LJLIL;
    public final LinkedList<C27192Alo> LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticSellingPointVH(View view) {
        super(view, R.layout.a4q);
        o.LJIIIZ(view, "view");
        this.LJLJJI = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 70));
        this.LJLILLLLZI = new LinkedList<>();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        String str;
        Image image;
        C27342AoE item = (C27342AoE) obj;
        o.LJIIIZ(item, "item");
        ViewGroup static_selling_point_container = (ViewGroup) _$_findCachedViewById(R.id.kec);
        o.LJIIIIZZ(static_selling_point_container, "static_selling_point_container");
        LinkedList<C27192Alo> linkedList = this.LJLILLLLZI;
        while (static_selling_point_container.getChildCount() > 0) {
            C16880lQ.LLIFFJFJJ(0, static_selling_point_container);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            if (c76800UCe instanceof C27192Alo) {
                linkedList.add(c76800UCe);
            }
        }
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.kec));
        List<StaticSellingPoint> list = item.LJLIL;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<StaticSellingPoint> list2 = item.LJLIL;
        if (list2 != null) {
            int i2 = 0;
            for (StaticSellingPoint staticSellingPoint : list2) {
                int i3 = i2 + 1;
                C62562cu c62562cu = null;
                if (i2 >= 0) {
                    StaticSellingPoint staticSellingPoint2 = staticSellingPoint;
                    String str2 = staticSellingPoint2.title;
                    if (str2 != null) {
                        C27192Alo c27192Alo = (C27192Alo) ORS.LJJLJLI(this.LJLILLLLZI);
                        if (c27192Alo == null) {
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            c27192Alo = new C27192Alo(context, null, 0);
                        }
                        Icon icon = staticSellingPoint2.icon;
                        if (icon != null && (image = icon.icon) != null) {
                            c62562cu = image.toImageUrlModel();
                        }
                        C27192Alo.LJJLJLI(c27192Alo, c62562cu);
                        c27192Alo.LJJLL(new AqS13S1101000_4(str2, i, staticSellingPoint2, 4));
                        CommonColor commonColor = staticSellingPoint2.backgroundColor;
                        if (commonColor != null) {
                            try {
                                Context context2 = this.itemView.getContext();
                                o.LJIIIIZZ(context2, "itemView.context");
                                if (AnonymousClass636.LJIILJJIL(context2)) {
                                    str = commonColor.darkColor;
                                } else {
                                    str = commonColor.color;
                                }
                                c27192Alo.setBackgroundColor(Color.parseColor(str));
                            } catch (Throwable unused) {
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        if (i2 != 0) {
                            marginLayoutParams.setMarginStart(C45804HyK.LJJI(8));
                        }
                        if (c27192Alo.getWidth() + _$_findCachedViewById(R.id.kec).getWidth() > KL2.LJIIJJI(EF7.LIZIZ())) {
                            return;
                        }
                        String str3 = staticSellingPoint2.buttonType;
                        if (str3 != null) {
                            ((PdpViewModel) this.LJLIL.getValue()).LLILII.add(str3);
                        }
                        ((ViewGroup) _$_findCachedViewById(R.id.kec)).addView(c27192Alo, marginLayoutParams);
                        if (!this.LJLJI) {
                            this.LJLJI = true;
                            C70414RkI c70414RkI = ((PdpViewModel) this.LJLIL.getValue()).LLFII;
                            if (c70414RkI != null) {
                                HashMap<String, Object> hashMap = new HashMap<>();
                                String str4 = staticSellingPoint2.buttonType;
                                if (str4 != null) {
                                    hashMap.put("button_type", str4);
                                }
                                c70414RkI.LJJIFFI("selling_point", hashMap);
                            }
                        }
                        String str5 = staticSellingPoint2.description;
                        if (str5 != null && str5.length() != 0) {
                            C16880lQ.LJIIJ(new Au2S0S2200000_4(this, c27192Alo, staticSellingPoint2.description, staticSellingPoint2.buttonType, 1), c27192Alo);
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }
}
