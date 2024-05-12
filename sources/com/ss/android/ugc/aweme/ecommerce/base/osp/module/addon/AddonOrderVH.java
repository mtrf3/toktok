package com.ss.android.ugc.aweme.ecommerce.base.osp.module.addon;

import X.AnonymousClass064;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C26508Aam;
import X.C27162AlK;
import X.C27941Axt;
import X.C27949Ay1;
import X.C27959AyB;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C56K;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70570Rmo;
import X.KL0;
import X.O6R;
import X.ORZ;
import X.S49;
import X.S4B;
import X.W5F;
import X.W5U;
import Y.IDCListenerS257S0100000_10;
import Y.IDTListenerS120S0100000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S0S0401000_12;
import com.ss.android.ugc.aweme.utils.Au2S5S0400000_12;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS460S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddonOrderVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, Boolean> LJLJI;
    public boolean LJLJJI;
    public final S49 LJLJJL;
    public final S49 LJLJJLL;
    public final S49 LJLJL;
    public final S49 LJLJLJ;
    public final S49 LJLJLLL;
    public final S49 LJLL;
    public final IDqS460S0100000_12 LJLLI;
    public final AqS194S0100000_12 LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    public final OrderSubmitViewModel M() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
    }

    public AddonOrderVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 21));
        this.LJLJI = new LinkedHashMap();
        this.LJLJJI = true;
        View findViewById = view.findViewById(R.id.n3l);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.vertical_first_sku_item)");
        this.LJLJJL = (S49) findViewById;
        View findViewById2 = view.findViewById(R.id.n3q);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.vertical_second_sku_item)");
        this.LJLJJLL = (S49) findViewById2;
        View findViewById3 = view.findViewById(R.id.n3s);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.vertical_third_sku_item)");
        this.LJLJL = (S49) findViewById3;
        View findViewById4 = view.findViewById(R.id.e6w);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.horizontal_first_sku_item)");
        this.LJLJLJ = (S49) findViewById4;
        View findViewById5 = view.findViewById(R.id.e7b);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.horizontal_second_sku_item)");
        this.LJLJLLL = (S49) findViewById5;
        View findViewById6 = view.findViewById(R.id.e7c);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.horizontal_third_sku_item)");
        this.LJLL = (S49) findViewById6;
        this.LJLLI = new IDqS460S0100000_12(this, 0);
        this.LJLLILLLL = new AqS194S0100000_12(this, 42);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        C27941Axt item = (C27941Axt) obj;
        o.LJIIIZ(item, "item");
        TextView addonTitle = (TextView) this.LJLIL.findViewById(R.id.wy);
        S49 oneSkuItemContainer = (S49) this.LJLIL.findViewById(R.id.ham);
        View horizontalScrollViewContainer = this.LJLIL.findViewById(R.id.e7a);
        View verticalContainer = this.LJLIL.findViewById(R.id.n3h);
        RelativeLayout verticalInitialContainer = (RelativeLayout) this.LJLIL.findViewById(R.id.j65);
        S49 s49 = (S49) this.LJLIL.findViewById(R.id.daw);
        View rlSeeMoreContainer = this.LJLIL.findViewById(R.id.j5t);
        LinearLayout verticalAddOnOrderGroup = (LinearLayout) this.LJLIL.findViewById(R.id.n3d);
        String str = item.LIZJ;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o.LJIIIIZZ(addonTitle, "addonTitle");
                addonTitle.setVisibility(8);
            } else {
                o.LJIIIIZZ(addonTitle, "addonTitle");
                addonTitle.setVisibility(0);
                addonTitle.setText(str);
            }
        }
        Integer num = item.LIZLLL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        o.LJIIIIZZ(oneSkuItemContainer, "oneSkuItemContainer");
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        oneSkuItemContainer.setVisibility(i2);
        o.LJIIIIZZ(horizontalScrollViewContainer, "horizontalScrollViewContainer");
        if (i == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        horizontalScrollViewContainer.setVisibility(i3);
        o.LJIIIIZZ(verticalContainer, "verticalContainer");
        if (i == 3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        verticalContainer.setVisibility(i4);
        List<C27959AyB> list = item.LIZ;
        if (list != null) {
            for (C27959AyB c27959AyB : list) {
                Map<String, String> map = M().LLJJIJIL;
                String str2 = c27959AyB.LIZ;
                if (str2 != null) {
                    HashMap hashMap = (HashMap) map;
                    if (!hashMap.containsKey(str2)) {
                        String str3 = c27959AyB.LJJIII;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = c27959AyB.LJIL;
                        if (str4 == null) {
                            str4 = "";
                        }
                        hashMap.put(str2, C70570Rmo.LIZ(str3, "", str4));
                    }
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (this.LJLJJI) {
                    verticalInitialContainer.setVisibility(0);
                    verticalAddOnOrderGroup.setVisibility(8);
                    C27959AyB c27959AyB2 = (C27959AyB) ORZ.LJLLLL(item.LIZ);
                    if (c27959AyB2 != null) {
                        P(c27959AyB2, s49, 1, 1, Boolean.FALSE);
                    }
                    C27949Ay1.LJIJI("see_more", "add_on_module", null, "order_submit", "product_detail", null, null, 3828);
                    o.LJIIIIZZ(rlSeeMoreContainer, "rlSeeMoreContainer");
                    C16880lQ.LJIIJ(new Au2S5S0400000_12(this, verticalInitialContainer, verticalAddOnOrderGroup, item, 7), rlSeeMoreContainer);
                    return;
                }
                o.LJIIIIZZ(verticalInitialContainer, "verticalInitialContainer");
                verticalInitialContainer.setVisibility(8);
                o.LJIIIIZZ(verticalAddOnOrderGroup, "verticalAddOnOrderGroup");
                verticalAddOnOrderGroup.setVisibility(0);
                N(3, item.LIZ);
                return;
            }
            N(2, item.LIZ);
            horizontalScrollViewContainer.setOnTouchListener(new IDTListenerS120S0100000_12(new C56K(), 7));
            return;
        }
        C27959AyB c27959AyB3 = (C27959AyB) ORZ.LJLLLL(item.LIZ);
        if (c27959AyB3 == null) {
            return;
        }
        P(c27959AyB3, oneSkuItemContainer, 1, 1, Boolean.FALSE);
    }

    public final HashMap<String, Object> L(C27959AyB c27959AyB, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        HashMap<String, Object> fw0 = M().fw0(false);
        fw0.put("source_page_type", "add_on_order_submit_rec");
        fw0.put("entrance_form", "append_goods_card");
        fw0.put("item_order", Integer.valueOf(i));
        String str8 = "";
        if (c27959AyB == null || (str = c27959AyB.LJIJI) == null) {
            str = "";
        }
        fw0.put("original_price", str);
        if (c27959AyB == null || (str2 = c27959AyB.LJJI) == null) {
            str2 = "";
        }
        fw0.put("sale_price", str2);
        if (c27959AyB == null || (str3 = c27959AyB.LJJII) == null) {
            str3 = "";
        }
        fw0.put("currency", str3);
        if (c27959AyB == null || (str4 = c27959AyB.LJJ) == null) {
            str4 = "";
        }
        fw0.put("parent_product_id", str4);
        String str9 = M().LLJJIJI;
        if (str9 == null) {
            str9 = "";
        }
        fw0.put("parent_track_id", str9);
        Map<String, String> map = M().LLJJIJIL;
        if (c27959AyB != null) {
            str5 = c27959AyB.LIZ;
        } else {
            str5 = null;
        }
        Object obj = ((HashMap) map).get(str5);
        if (obj == null) {
            obj = "";
        }
        fw0.put("track_id", obj);
        if (c27959AyB == null || (str6 = c27959AyB.LJIL) == null) {
            str6 = "";
        }
        fw0.put("product_id", str6);
        if (c27959AyB != null && (str7 = c27959AyB.LJIILJJIL) != null) {
            str8 = str7;
        }
        fw0.put("seller_id", str8);
        return fw0;
    }

    public final void N(int i, List list) {
        int i2;
        int i3;
        S49 s49;
        boolean z;
        int i4;
        int i5;
        int i6 = 8;
        if (i == 3) {
            S49 s492 = this.LJLJJL;
            if (!list.isEmpty()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            s492.setVisibility(i4);
            S49 s493 = this.LJLJJLL;
            if (list.size() > 1) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            s493.setVisibility(i5);
            S49 s494 = this.LJLJJLL;
            if (list.size() > 2) {
                i6 = 0;
            }
            s494.setVisibility(i6);
        } else {
            S49 s495 = this.LJLJLJ;
            if (!list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            s495.setVisibility(i2);
            S49 s496 = this.LJLJLLL;
            if (list.size() > 1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            s496.setVisibility(i3);
            S49 s497 = this.LJLL;
            if (list.size() > 2) {
                i6 = 0;
            }
            s497.setVisibility(i6);
        }
        if (list.size() >= 3) {
            list = list.subList(0, 3);
        }
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                C27959AyB c27959AyB = (C27959AyB) obj;
                if (i7 > 2) {
                    return;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i == 2) {
                            s49 = this.LJLL;
                        } else {
                            s49 = this.LJLJL;
                        }
                    } else if (i == 2) {
                        s49 = this.LJLJLLL;
                    } else {
                        s49 = this.LJLJJLL;
                    }
                } else if (i == 2) {
                    s49 = this.LJLJLJ;
                } else {
                    s49 = this.LJLJJL;
                }
                if (i7 == list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                P(c27959AyB, s49, i, i8, Boolean.valueOf(z));
                i7 = i8;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void Q(C27959AyB c27959AyB, int i) {
        String str;
        String str2;
        Object obj;
        OrderSubmitViewModel M = M();
        HashMap<String, Object> hashMap = M().LLIL;
        String str3 = "";
        if (hashMap == null || (obj = hashMap.get("track_id")) == null || (str = obj.toString()) == null) {
            str = "";
        }
        M.LLJJIJI = str;
        HashMap<String, Object> L = L(c27959AyB, i);
        Map<String, String> map = M().LLJJIJIL;
        if (c27959AyB != null) {
            str2 = c27959AyB.LIZ;
        } else {
            str2 = null;
        }
        String str4 = (String) ((HashMap) map).get(str2);
        if (str4 != null) {
            str3 = str4;
        }
        C27949Ay1.LJJIIJZLJL("tiktokec_product_show", str3, L);
        this.LJLJI.put(Integer.valueOf(i), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(C27959AyB c27959AyB, S49 s49, int i, int i2, Boolean bool) {
        boolean z;
        int i3;
        int i4;
        int i5;
        C62562cu imageUrlModel;
        int i6;
        int i7;
        Boolean bool2;
        String str = c27959AyB.LIZ;
        if (str == null) {
            str = "";
        }
        Map<String, Boolean> map = ((C27941Axt) getItem()).LIZIZ;
        if (map != null && (bool2 = map.get(str)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        if (s49 != null) {
            C27941Axt addonOrderVO = (C27941Axt) getItem();
            IDqS460S0100000_12 handleSelectResult = this.LJLLI;
            AqS194S0100000_12 uploadProductShowLog = this.LJLLILLLL;
            o.LJIIIZ(addonOrderVO, "addonOrderVO");
            o.LJIIIZ(handleSelectResult, "handleSelectResult");
            o.LJIIIZ(uploadProductShowLog, "uploadProductShowLog");
            if (i == 2) {
                s49.LJLIL.setBackgroundResource(R.drawable.aar);
                C26338AVi.LJI(s49.LJLILLLLZI, 0, 0, 0, 0, false, 16);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(s49.LJLIL);
                anonymousClass064.LJFF(R.id.i40);
                anonymousClass064.LJIIL(R.id.i40, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveCoverMinSizeSetting.DEFAULT))));
                anonymousClass064.LJIIJ(R.id.i40, -2);
                anonymousClass064.LJIIIIZZ(R.id.i40, 4, R.id.i5y, 4);
                anonymousClass064.LJIIIIZZ(R.id.i40, 6, R.id.i6k, 6);
                anonymousClass064.LIZIZ(s49.LJLIL);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = C27162AlK.LJIIIZ;
                if (o.LJ(bool, Boolean.TRUE)) {
                    i6 = C27162AlK.LJIIIIZZ;
                } else {
                    i6 = C27162AlK.LJIILJJIL;
                }
                layoutParams.setMarginEnd(i6);
                if (i2 == 1) {
                    i7 = C27162AlK.LJIIIIZZ;
                } else {
                    i7 = C27162AlK.LJIILJJIL;
                }
                layoutParams.setMarginStart(i7);
                s49.setLayoutParams(layoutParams);
                i3 = 0;
                s49.LJLJI.setPadding(0, 0, 0, 0);
                s49.LJLJJLL.setPadding(0, 0, 0, 16);
                s49.LJLJL.setPadding(0, 0, 0, 16);
            } else {
                i3 = 0;
                AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
                anonymousClass0642.LJII(s49.LJLIL);
                anonymousClass0642.LJFF(R.id.i40);
                anonymousClass0642.LJIIL(R.id.i40, 0);
                anonymousClass0642.LJIIJ(R.id.i40, -2);
                anonymousClass0642.LJIIIIZZ(R.id.i40, 4, R.id.i5y, 4);
                anonymousClass0642.LJIIIIZZ(R.id.i40, 6, R.id.i6k, 6);
                anonymousClass0642.LIZIZ(s49.LJLIL);
                ConstraintLayout constraintLayout = s49.LJLIL;
                if (i == 3) {
                    i4 = 0;
                } else {
                    i4 = C27162AlK.LJIIIZ;
                }
                C45804HyK.LJJLIIIJ(i4, constraintLayout);
                C45804HyK.LJJL(C27162AlK.LJIILL, s49.LJLIL);
            }
            Image image = c27959AyB.LIZJ;
            if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
                W5F LJIIIZ = W5U.LJIIIZ(imageUrlModel);
                LJIIIZ.LJJI = KL0.HIGH;
                LJIIIZ.LIZIZ("product_image_tag");
                LJIIIZ.LJJIIJ = s49.LJLILLLLZI;
                C16880lQ.LLJJJ(LJIIIZ);
                s49.LJLILLLLZI.setColorFilter(134217728);
            }
            s49.LJLJI.LJJJIL(c27959AyB.LIZLLL, c27959AyB.LJIIIZ);
            s49.LJLJJLL.setText(c27959AyB.LJFF);
            int i8 = 0;
            s49.LJLJJLL.setVisibility(i3);
            s49.LJLJJI.setText(c27959AyB.LJ);
            s49.LJLJJI.setVisibility(i3);
            String str2 = c27959AyB.LJIJ;
            if (str2 != null) {
                i8 = str2.length();
            }
            TuxTextView tuxTextView = s49.LJLJL;
            if (i8 > 0) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            tuxTextView.setVisibility(i5);
            if (c27959AyB.LJIJ != null && i8 > 0) {
                SpannableString spannableString = new SpannableString(c27959AyB.LJIJ);
                spannableString.setSpan(new StrikethroughSpan(), i3, i8, 17);
                Context context = s49.getContext();
                o.LJIIIIZZ(context, "context");
                spannableString.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)), i3, i8, 17);
                s49.LJLJL.setText(spannableString);
            }
            s49.LJLJJI.addOnLayoutChangeListener(new IDCListenerS257S0100000_10(s49, 1));
            s49.LJLJJL.setChecked(z);
            C16880lQ.LJIIJ(new Au2S0S0401000_12(handleSelectResult, s49, addonOrderVO, c27959AyB, i2, 1), s49.LJLIL);
            C16880lQ.LJIIJ(new Au2S0S0401000_12(handleSelectResult, s49, addonOrderVO, c27959AyB, i2, 2), s49.LJLILLLLZI);
            C16880lQ.LJIIJ(new Au2S0S0401000_12(handleSelectResult, s49, addonOrderVO, c27959AyB, i2, 3), s49.LJLJI);
            s49.LJLJJL.setOnTouchListener(new S4B(handleSelectResult, s49, addonOrderVO, c27959AyB, i2));
            uploadProductShowLog.invoke(c27959AyB, Integer.valueOf(i2));
        }
    }
}
