package com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon;

import X.AnonymousClass064;
import X.AnonymousClass636;
import X.C139825eE;
import X.C16880lQ;
import X.C221108m2;
import X.C26059AKp;
import X.C26338AVi;
import X.C27162AlK;
import X.C27941Axt;
import X.C27949Ay1;
import X.C27959AyB;
import X.C27988Aye;
import X.C32151Nz;
import X.C39985Fmf;
import X.C45804HyK;
import X.C47261Igj;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C66822jm;
import X.C73156SnQ;
import X.C78565UsT;
import X.C79057V0z;
import X.C7MY;
import X.InterfaceC60061Nhh;
import X.KL0;
import X.MBB;
import X.O6R;
import X.S47;
import X.S48;
import X.S4A;
import X.SC5;
import X.SG3;
import X.TBT;
import X.W5F;
import X.W5U;
import X.WHL;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnFeed;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonNotice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S0S0401000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS460S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class USAddonOrderVH extends ECJediViewHolder implements InterfaceC60061Nhh {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, Boolean> LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final S48 LJLJJLL;
    public final S48 LJLJL;
    public final S48 LJLJLJ;
    public final S48 LJLJLLL;
    public final S48 LJLL;
    public final S48 LJLLI;
    public final Map<String, S48> LJLLILLLL;
    public final List<String> LJLLJ;
    public boolean LJLLL;
    public final Map<String, Boolean> LJLLLL;
    public String LJLLLLLL;
    public final Map<String, String> LJLZ;
    public final SafeHandler LJZ;
    public final ARunnableS48S0100000_12 LJZI;
    public boolean LJZL;
    public final IDqS460S0100000_12 LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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

    public final void L() {
        boolean z;
        List<C27959AyB> list;
        String str;
        Rect rect = new Rect();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.LJLLILLLL).entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            View view = (View) entry.getValue();
            if (view != null && view.getGlobalVisibleRect(rect)) {
                Object key = entry.getKey();
                C27941Axt c27941Axt = N().LJLL;
                if (c27941Axt != null && (list = c27941Axt.LIZ) != null) {
                    for (C27959AyB c27959AyB : list) {
                        if (o.LJ(c27959AyB.LIZ, key) && (str = c27959AyB.LJIL) != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((ArrayList) this.LJLLJ).contains(it2.next())) {
                z = true;
            }
        }
        if (z) {
            ((ArrayList) this.LJLLJ).clear();
            ((ArrayList) this.LJLLJ).addAll(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) this.LJLLJ).iterator();
            while (it3.hasNext()) {
                arrayList2.add(new AddOnFeed((String) it3.next(), 1));
            }
            OrderSubmitViewModel N = N();
            N.getClass();
            C78565UsT.LJJIJ(N, MBB.INSTANCE, new C27988Aye(arrayList2, N, null));
        }
    }

    public final OrderSubmitViewModel N() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    public final void V() {
        Iterator it = ((LinkedHashMap) this.LJLLILLLL).entrySet().iterator();
        while (it.hasNext()) {
            S48 s48 = (S48) ((Map.Entry) it.next()).getValue();
            if (s48 != null) {
                if (!this.LJLJI.containsKey(Integer.valueOf(s48.getOrder()))) {
                    U(s48.getSkuInfo(), s48.getOrder());
                } else {
                    if (o.LJ(((LinkedHashMap) this.LJLJI).get(Integer.valueOf(s48.getOrder())), Boolean.FALSE)) {
                        U(s48.getSkuInfo(), s48.getOrder());
                    }
                }
            }
        }
    }

    public final void T() {
        String str;
        AddonNotice addonNotice;
        C27941Axt c27941Axt = N().LJLL;
        if (c27941Axt == null || (addonNotice = c27941Axt.LJ) == null || (str = addonNotice.getTipsText()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        View findViewById = this.LJLIL.findViewById(R.id.wz);
        if (findViewById.getGlobalVisibleRect(new Rect())) {
            this.LJLLL = true;
            synchronized (C39985Fmf.LIZ) {
                C79057V0z.LJJJJIZL(1, C66822jm.LIZ, "gecc_us_add_on_guide");
            }
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = findViewById;
            c139825eE.LJI(WHL.BOTTOM);
            c139825eE.LIZJ = str;
            c139825eE.LIZ.LJIIIZ = true;
            c139825eE.LIZJ().show();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, N(), new TBT() { // from class: X.AxU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPageStatus();
            }
        }, new S47(this));
        C26059AKp.LIZ().LIZJ("scrolled_state_change_event", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        C26059AKp.LIZ().LIZIZ("scrolled_state_change_event", this);
    }

    public USAddonOrderVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 129));
        this.LJLJI = new LinkedHashMap();
        boolean z = true;
        this.LJLJJL = true;
        View findViewById = view.findViewById(R.id.n3l);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.vertical_first_sku_item)");
        this.LJLJJLL = (S48) findViewById;
        View findViewById2 = view.findViewById(R.id.n3q);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.vertical_second_sku_item)");
        this.LJLJL = (S48) findViewById2;
        View findViewById3 = view.findViewById(R.id.n3s);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.vertical_third_sku_item)");
        this.LJLJLJ = (S48) findViewById3;
        View findViewById4 = view.findViewById(R.id.e6w);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.horizontal_first_sku_item)");
        this.LJLJLLL = (S48) findViewById4;
        View findViewById5 = view.findViewById(R.id.e7b);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.horizontal_second_sku_item)");
        this.LJLL = (S48) findViewById5;
        View findViewById6 = view.findViewById(R.id.e7c);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.horizontal_third_sku_item)");
        this.LJLLI = (S48) findViewById6;
        this.LJLLILLLL = new LinkedHashMap();
        this.LJLLJ = new ArrayList();
        synchronized (C39985Fmf.LIZ) {
            if (C66822jm.LIZ.getInt("gecc_us_add_on_guide", 0) != 1) {
                z = false;
            }
        }
        this.LJLLL = z;
        this.LJLLLL = new LinkedHashMap();
        this.LJLLLLLL = "";
        this.LJLZ = new LinkedHashMap();
        this.LJZ = new SafeHandler(this);
        this.LJZI = new ARunnableS48S0100000_12(this, 35);
        this.LL = new IDqS460S0100000_12(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b6, code lost:
    
        if (r4 != null) goto L148;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH.onBind(java.lang.Object):void");
    }

    public final HashMap<String, Object> M(C27959AyB c27959AyB, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        HashMap<String, Object> fw0 = N().fw0(false);
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
        String str9 = N().LLJJIJI;
        if (str9 == null) {
            str9 = "";
        }
        fw0.put("parent_track_id", str9);
        Map<String, String> map = N().LLJJIJIL;
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
        fw0.put("purchase_path", "skip_pdp");
        fw0.put("source_module", "rec_order_submit_outer_add_on_module");
        return fw0;
    }

    public final void P(int i, List list) {
        int i2;
        int i3;
        S48 s48;
        boolean z;
        int i4;
        int i5;
        int i6 = 8;
        if (i == 3) {
            S48 s482 = this.LJLJJLL;
            if (!list.isEmpty()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            s482.setVisibility(i4);
            S48 s483 = this.LJLJL;
            if (list.size() > 1) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            s483.setVisibility(i5);
            S48 s484 = this.LJLJL;
            if (list.size() > 2) {
                i6 = 0;
            }
            s484.setVisibility(i6);
        } else {
            S48 s485 = this.LJLJLLL;
            if (!list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            s485.setVisibility(i2);
            S48 s486 = this.LJLL;
            if (list.size() > 1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            s486.setVisibility(i3);
            S48 s487 = this.LJLLI;
            if (list.size() > 2) {
                i6 = 0;
            }
            s487.setVisibility(i6);
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
                        if (i == 2 || i == 5 || i == 4) {
                            s48 = this.LJLLI;
                        } else {
                            s48 = this.LJLJLJ;
                        }
                    } else if (i == 2 || i == 5 || i == 4) {
                        s48 = this.LJLL;
                    } else {
                        s48 = this.LJLJL;
                    }
                } else if (i == 2 || i == 5 || i == 4) {
                    s48 = this.LJLJLLL;
                } else {
                    s48 = this.LJLJJLL;
                }
                if (i7 == list.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                Q(c27959AyB, s48, i, i8, Boolean.valueOf(z));
                i7 = i8;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void U(C27959AyB c27959AyB, int i) {
        String str;
        String str2;
        Object obj;
        OrderSubmitViewModel N = N();
        HashMap<String, Object> hashMap = N().LLIL;
        String str3 = "";
        if (hashMap == null || (obj = hashMap.get("track_id")) == null || (str = obj.toString()) == null) {
            str = "";
        }
        N.LLJJIJI = str;
        HashMap<String, Object> M = M(c27959AyB, i);
        M.put("request_id", this.LJLLLLLL);
        Map<String, String> map = this.LJLZ;
        String str4 = null;
        if (c27959AyB != null) {
            str2 = c27959AyB.LIZ;
        } else {
            str2 = null;
        }
        Object obj2 = ((LinkedHashMap) map).get(str2);
        if (obj2 == null) {
            obj2 = "";
        }
        M.put("rec_params", obj2);
        Map<String, String> map2 = N().LLJJIJIL;
        if (c27959AyB != null) {
            str4 = c27959AyB.LIZ;
        }
        String str5 = (String) ((HashMap) map2).get(str4);
        if (str5 != null) {
            str3 = str5;
        }
        C27949Ay1.LJJIIZI("tiktokec_product_show", str3, M);
        this.LJLJI.put(Integer.valueOf(i), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, X.InterfaceC60061Nhh
    public final void onEvent(String str, String str2) {
        C27941Axt c27941Axt;
        Integer num;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "scrolled_state_change_event") && !this.LJLLL) {
            try {
                Object obj = new JSONObject(str2).get("status_code");
                if (obj == null) {
                    obj = Integer.MAX_VALUE;
                }
                if (o.LJ(obj, 0) && (c27941Axt = N().LJLL) != null && (num = c27941Axt.LIZLLL) != null && num.intValue() == 4) {
                    T();
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(C27959AyB c27959AyB, S48 s48, int i, int i2, Boolean bool) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        C62562cu imageUrlModel;
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
        this.LJLLILLLL.put(str, s48);
        String str2 = c27959AyB.LJJIIJ;
        if (str2 != null && str2.length() > 0) {
            this.LJLLLLLL = str2;
        }
        String str3 = c27959AyB.LJJIIJZLJL;
        if (str3 != null && str3.length() > 0) {
            this.LJLZ.put(str, str3);
        }
        if (s48 != null) {
            C27941Axt addonOrderVO = (C27941Axt) getItem();
            IDqS460S0100000_12 handleSelectResult = this.LL;
            o.LJIIIZ(addonOrderVO, "addonOrderVO");
            o.LJIIIZ(handleSelectResult, "handleSelectResult");
            s48.LJLJLLL = i2;
            s48.LJLL = c27959AyB;
            if (i != 2) {
                if (i != 4 && i != 5) {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    anonymousClass064.LJII(s48.LJLIL);
                    anonymousClass064.LJFF(R.id.i40);
                    anonymousClass064.LJIIL(R.id.i40, 0);
                    anonymousClass064.LJIIJ(R.id.i40, -2);
                    anonymousClass064.LJIIIIZZ(R.id.i40, 4, R.id.i5y, 4);
                    anonymousClass064.LJIIIIZZ(R.id.i40, 6, R.id.i6k, 6);
                    anonymousClass064.LIZIZ(s48.LJLIL);
                    ConstraintLayout constraintLayout = s48.LJLIL;
                    if (i == 3) {
                        i7 = 0;
                    } else {
                        i7 = C27162AlK.LJIIIZ;
                    }
                    C45804HyK.LJJLIIIJ(i7, constraintLayout);
                    C45804HyK.LJJL(C27162AlK.LJIILL, s48.LJLIL);
                } else {
                    s48.LJLJLJ.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = 0;
                    int i8 = C27162AlK.LJIIIIZZ;
                    layoutParams.bottomMargin = i8;
                    layoutParams.setMarginEnd(i8);
                    if (i2 != 1) {
                        i8 = 0;
                    }
                    layoutParams.setMarginStart(i8);
                    s48.setLayoutParams(layoutParams);
                }
            } else {
                s48.LJLIL.setBackgroundResource(R.drawable.aar);
                C26338AVi.LJI(s48.LJLJI, 0, 0, 0, 0, false, 16);
                AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
                anonymousClass0642.LJII(s48.LJLIL);
                anonymousClass0642.LJFF(R.id.i40);
                anonymousClass0642.LJIIL(R.id.i40, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveCoverMinSizeSetting.DEFAULT))));
                anonymousClass0642.LJIIJ(R.id.i40, -2);
                anonymousClass0642.LJIIIIZZ(R.id.i40, 4, R.id.i5y, 4);
                anonymousClass0642.LJIIIIZZ(R.id.i40, 6, R.id.i6k, 6);
                anonymousClass0642.LIZIZ(s48.LJLIL);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = C27162AlK.LJIIIZ;
                if (o.LJ(bool, Boolean.TRUE)) {
                    i3 = C27162AlK.LJIIIIZZ;
                } else {
                    i3 = C27162AlK.LJIILJJIL;
                }
                layoutParams2.setMarginEnd(i3);
                if (i2 == 1) {
                    i4 = C27162AlK.LJIIIIZZ;
                } else {
                    i4 = C27162AlK.LJIILJJIL;
                }
                layoutParams2.setMarginStart(i4);
                s48.setLayoutParams(layoutParams2);
                s48.LJLJJI.setPadding(0, 0, 0, 0);
                s48.LJLJL.setPadding(0, 0, 0, 16);
                s48.LJLJLJ.setPadding(0, 0, 0, 16);
                String str4 = c27959AyB.LJIJ;
                if (str4 != null) {
                    i5 = str4.length();
                } else {
                    i5 = 0;
                }
                TuxTextView tuxTextView = s48.LJLJLJ;
                if (i5 > 0) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                tuxTextView.setVisibility(i6);
                if (c27959AyB.LJIJ != null && i5 > 0) {
                    SpannableString spannableString = new SpannableString(c27959AyB.LJIJ);
                    spannableString.setSpan(new StrikethroughSpan(), 0, i5, 17);
                    Context context = s48.getContext();
                    o.LJIIIIZZ(context, "context");
                    spannableString.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)), 0, i5, 17);
                    s48.LJLJLJ.setText(spannableString);
                }
            }
            Image image = c27959AyB.LIZJ;
            if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
                W5F LJIIIZ = W5U.LJIIIZ(imageUrlModel);
                LJIIIZ.LJJI = KL0.HIGH;
                LJIIIZ.LIZIZ("product_image_tag");
                LJIIIZ.LJJIIJ = s48.LJLJI;
                C16880lQ.LLJJJ(LJIIIZ);
                s48.LJLJI.setColorFilter(134217728);
            }
            s48.LJLJJI.LJJJIL(c27959AyB.LIZLLL, c27959AyB.LJIIIZ);
            s48.LJLJL.setText(c27959AyB.LJFF);
            s48.LJLJL.setVisibility(0);
            String str5 = c27959AyB.LJ;
            s48.LJLJJL.setText(str5);
            s48.LJLJJL.setVisibility(0);
            if ((i == 4 || i == 5) && (str5 == null || str5.length() == 0)) {
                ViewGroup.LayoutParams layoutParams3 = s48.LJLJJI.getLayoutParams();
                layoutParams3.height = C7MY.LIZIZ(55);
                s48.LJLJJI.setLayoutParams(layoutParams3);
                s48.LJLJJI.setMaxLines(3);
                SG3 sg3 = s48.LJLJJI;
                sg3.setLineSpacing(sg3.getLineSpacingExtra(), 1.05f);
                s48.LJLJJL.setVisibility(8);
            }
            s48.LJLJJLL.setChecked(z);
            C16880lQ.LJIIJ(new Au2S0S0401000_12(handleSelectResult, s48, addonOrderVO, c27959AyB, i2, 0), s48.LJLILLLLZI);
            s48.LJLJJLL.setOnTouchListener(new S4A(handleSelectResult, s48, addonOrderVO, c27959AyB, i2));
        }
    }
}
