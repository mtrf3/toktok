package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.IDqS186S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class S29<T extends ViewGroup> extends S2R<T, S2G> implements InterfaceC71280RyG {
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public C68762mu LJII;
    public final ArrayList<PromotionItem> LJIIIIZZ;
    public S2C LJIIIZ;
    public java.util.Map<L3F, ? extends S2E> LJIIJ;

    @Override // X.InterfaceC71280RyG
    public final void destroy() {
        this.LIZIZ = null;
        C68762mu c68762mu = this.LJII;
        if (c68762mu != null) {
            c68762mu.LIZ();
        }
    }

    public final String LJIIIIZZ() {
        C68762mu c68762mu;
        if (!this.LJFF || (c68762mu = this.LJII) == null) {
            return null;
        }
        long j = c68762mu.LIZ;
        if (j > 86400000) {
            return "gt_24";
        }
        if (j > 3600000) {
            return "in_24";
        }
        if (j > 0) {
            return "in_1";
        }
        return "no_countdown";
    }

    public final String LJIIIZ() {
        C68762mu c68762mu;
        if (!this.LJFF || (c68762mu = this.LJII) == null) {
            return null;
        }
        int i = c68762mu.LIZJ;
        if (i == 2) {
            return "on_sale";
        }
        if (i != 4) {
            return null;
        }
        return "warm_up";
    }

    public final java.util.Map<Integer, Integer> LJIIJ() {
        HashMap hashMap = new HashMap();
        S2E s2e = this.LJIIJ.get(L3F.FREE_SHIPPING);
        if (s2e != null) {
            hashMap.put(8, Integer.valueOf(s2e.getTextFont()));
        }
        return hashMap;
    }

    public S29(T t) {
        super(t);
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIJ = TMC.LJIJI();
    }

    public static boolean LJ(PromotionItem promotionItem) {
        PromotionProperty promotionProperty;
        if (promotionItem == null) {
            return false;
        }
        List<PromotionProperty> extraProperty = promotionItem.getExtraProperty();
        if (extraProperty != null) {
            Iterator<PromotionProperty> it = extraProperty.iterator();
            while (true) {
                if (it.hasNext()) {
                    promotionProperty = it.next();
                    if (o.LJ(promotionProperty.getPropertyName(), "emphasize_name")) {
                        break;
                    }
                } else {
                    promotionProperty = null;
                    break;
                }
            }
            PromotionProperty promotionProperty2 = promotionProperty;
            if (promotionProperty2 != null) {
                if (promotionProperty2.getPropertyValue() == null) {
                    return false;
                }
                return true;
            }
        }
        Integer style = promotionItem.getStyle();
        if (style == null || style.intValue() != 16) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(PromotionItem promotionItem) {
        Integer type;
        if (promotionItem == null || (type = promotionItem.getType()) == null || 4 != type.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdk.model.message.ext.PromotionItem r13) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S29.LJI(com.bytedance.android.livesdk.model.message.ext.PromotionItem):void");
    }

    public final void LJII(boolean z) {
        this.LJI = z;
        if (z) {
            this.LIZ.setVisibility(8);
        } else {
            this.LIZ.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(java.util.Map<String, String> eventMap) {
        o.LJIIIZ(eventMap, "eventMap");
        if (this.LJFF || this.LJIIIIZZ.isEmpty() || !LIZ() || this.LJI) {
            C36746EbW.LIZ(4, "no need to add event");
            return;
        }
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role", "coupon_name", "coupon_type");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
        Iterator it = LJJIJIIJI.iterator();
        while (it.hasNext()) {
            it.next();
            arrayList.add(new ArrayList());
        }
        List LJJIJIIJI2 = C47261Igj.LJJIJIIJI("campaign_id", "campaign_type", "campaign_user_tag", "campaign_channel");
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJIJIIJI2, 10));
        Iterator it2 = LJJIJIIJI2.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList2.add(new ArrayList());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setShowPromotionEventWithoutFlashSale view count = ");
        LIZ.append(((ViewGroup) this.LIZ).getChildCount());
        LIZ.append(" , item count = ");
        LIZ.append(this.LJIIIIZZ.size());
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        int childCount = ((ViewGroup) this.LIZ).getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount && i < this.LJIIIIZZ.size(); i2++) {
            if (i2 == 1 || ((ViewGroup) this.LIZ).getChildAt(i2).getWidth() > 0) {
                int i3 = i + 1;
                Object obj = ListProtector.get(this.LJIIIIZZ, i);
                o.LJIIIIZZ(obj, "promotionShowItems[itemIndex++]");
                PromotionItem promotionItem = (PromotionItem) obj;
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), promotionItem.getLog_extra(), C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(java.util.Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LIZLLL(Object.class)))));
                    if (!(fromJson instanceof java.util.Map)) {
                        fromJson = null;
                    }
                    java.util.Map map = (java.util.Map) fromJson;
                    if (map != null) {
                        Integer type = promotionItem.getType();
                        if (type == null || type.intValue() != 6) {
                            int i4 = 0;
                            for (Object obj2 : LJJIJIIJI2) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    Object obj3 = map.get(obj2);
                                    if ((obj3 instanceof String) && obj3 != null) {
                                        ((List) ListProtector.get(arrayList2, i4)).add(obj3);
                                    }
                                    i4 = i5;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        } else {
                            int i6 = 0;
                            for (Object obj4 : LJJIJIIJI) {
                                int i7 = i6 + 1;
                                if (i6 >= 0) {
                                    Object obj5 = map.get(obj4);
                                    if ((obj5 instanceof String) && obj5 != null) {
                                        ((List) ListProtector.get(arrayList, i6)).add(obj5);
                                    }
                                    i6 = i7;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                    }
                } catch (s unused) {
                }
                i = i3;
            }
        }
        int i8 = 0;
        for (Object obj6 : LJJIJIIJI) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                String str = (String) ((LinkedHashMap) eventMap).get(obj6);
                if (str != null) {
                    eventMap.put(obj6, ORZ.LLD((Iterable) ListProtector.get(arrayList, i8), ",", C42398GkU.LIZIZ(str, ','), null, null, 60));
                } else {
                    eventMap.put(obj6, ORZ.LLD((Iterable) ListProtector.get(arrayList, i8), ",", null, null, null, 62));
                }
                i8 = i9;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int i10 = 0;
        for (Object obj7 : LJJIJIIJI2) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String str2 = (String) ((LinkedHashMap) eventMap).get(obj7);
                if (str2 != null) {
                    eventMap.put(obj7, ORZ.LLD((Iterable) ListProtector.get(arrayList2, i10), ",", C42398GkU.LIZIZ(str2, ','), null, null, 60));
                } else {
                    eventMap.put(obj7, ORZ.LLD((Iterable) ListProtector.get(arrayList2, i10), ",", null, null, null, 62));
                }
                i10 = i11;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LIZLLL(PromotionItem promotionItem, C68772mv c68772mv) {
        this.LJIIIZ = null;
        this.LJ = false;
        C68762mu c68762mu = this.LJII;
        if (c68762mu != null) {
            c68762mu.LIZ();
        }
        C68762mu c68762mu2 = new C68762mu();
        c68762mu2.LIZIZ(c68772mv);
        int i = c68762mu2.LIZJ;
        if (i == 2 || i == 4) {
            IDqS186S0200000_12 iDqS186S0200000_12 = new IDqS186S0200000_12((S29) this, promotionItem, (PromotionItem) 7);
            if (!((ArrayList) c68762mu2.LJ).contains(iDqS186S0200000_12)) {
                ((ArrayList) c68762mu2.LJ).add(iDqS186S0200000_12);
            }
            C68762mu.LIZJ(c68762mu2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("flash sale first show state = ");
            LIZ.append(c68762mu2.LIZJ);
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
            LJIIL(c68762mu2.LIZJ, promotionItem, c68762mu2.LIZ);
        } else {
            C36746EbW.LIZ(4, "flash sale is out of time");
        }
        this.LJII = c68762mu2;
    }

    public final void LJIIL(int i, PromotionItem promotionItem, long j) {
        L3Y l3y;
        S2H s2b;
        S2C s2c;
        C26773Af3 flashCountDownView;
        o.LJIIIZ(promotionItem, "promotionItem");
        if (2 == i) {
            S2E s2e = (S2E) C78841Uwv.LJJIJIIJIL(L3F.FLASH_SALE, this.LJIIJ);
            if (s2e == null) {
                s2e = (S2E) C78841Uwv.LJJIJIIJIL(L3F.DEFAULT, this.LJIIJ);
                if (s2e == null) {
                    s2e = new L39();
                }
            }
            L3Y LJIIJJI = s2e.LJIIJJI();
            if (j > 86400000) {
                l3y = L3Y.FlashSaleViewWithoutCountDown;
            } else {
                l3y = L3Y.FlashSaleViewWithCountDown;
            }
            s2e.LJIIIZ(l3y);
            if (this.LJIIIZ == null || LJIIJJI != s2e.LJIIJJI()) {
                S2C s2c2 = new S2C(this.LIZJ);
                this.LJIIIZ = s2c2;
                if (s2e.LIZLLL() == L34.OLD && s2e.LJIIJJI() == L3Y.FlashSaleViewWithCountDown) {
                    s2b = new S2D();
                } else if (s2e.LIZLLL() == L34.V4) {
                    s2b = new S2F();
                } else {
                    s2b = new S2B();
                }
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(s2c2.getContext()), s2b.getLayoutId(), s2c2, true);
                s2b.LIZJ(s2c2, s2e);
                if (s2e.LJIIJJI() == L3Y.FlashSaleViewWithCountDown) {
                    C26773Af3 LIZIZ = s2b.LIZIZ();
                    if (LIZIZ != null) {
                        LIZIZ.setVisibility(0);
                    }
                    C26773Af3 LIZIZ2 = s2b.LIZIZ();
                    if (LIZIZ2 != null) {
                        LIZIZ2.setTimeEndListener(new AqS162S0100000_12(s2c2, 1044));
                    }
                } else {
                    C26773Af3 LIZIZ3 = s2b.LIZIZ();
                    if (LIZIZ3 != null) {
                        LIZIZ3.setVisibility(8);
                    }
                }
                s2c2.LJLIL = s2b;
                S2C s2c3 = this.LJIIIZ;
                if (s2c3 != null) {
                    s2c3.setFlashSaleText(promotionItem.getName());
                }
                ((ViewGroup) this.LIZ).removeAllViews();
                ((ViewGroup) this.LIZ).addView(this.LJIIIZ);
            }
            if (s2e.LJIIJJI() == L3Y.FlashSaleViewWithCountDown && (s2c = this.LJIIIZ) != null && (flashCountDownView = s2c.getFlashCountDownView()) != null) {
                flashCountDownView.LJJJIL(j, true);
            }
            this.LJ = true;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("no need to show flash sale, currentState = ");
        LIZ.append(i);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        this.LJ = false;
    }
}
