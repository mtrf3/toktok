package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.DefaultTtfSkcStyle;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ujb.o;

/* renamed from: X.Rhi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70254Rhi {
    public final Context LIZ;
    public final java.util.Map<Integer, String> LIZIZ = new HashMap();
    public List<SaleProp> LIZJ = C61878OQg.INSTANCE;
    public final java.util.Map<Integer, InterfaceC70268Rhw> LIZLLL = new HashMap();
    public ITtfSkcStyle LJ = new DefaultTtfSkcStyle();
    public InterfaceC70165RgH LJFF;

    public C70254Rhi(Context context) {
        this.LIZ = context;
    }

    public final List<String> LIZIZ(java.util.Map<Integer, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            map = this.LIZIZ;
        }
        int size = this.LIZJ.size();
        for (int i = 0; i < size; i++) {
            String str = map.get(Integer.valueOf(i));
            if (str == null || o.LJJJJJL(str)) {
                arrayList.add("");
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final boolean LIZJ(int i, String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        return kotlin.jvm.internal.o.LJ(((HashMap) this.LIZIZ).get(Integer.valueOf(i)), str2);
    }

    public final void LJ(int i, String str, List list) {
        String str2;
        SalePropValue salePropValue;
        HashMap hashMap = new HashMap(this.LIZIZ);
        if (str == null || o.LJJJJJL(str) || o.LJJJJJL(str)) {
            hashMap.remove(Integer.valueOf(i));
        } else {
            hashMap.put(Integer.valueOf(i), str);
        }
        if (!kotlin.jvm.internal.o.LJ(hashMap, this.LIZIZ)) {
            int i2 = i + 1;
            int size = this.LIZJ.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                String str3 = (String) hashMap.get(Integer.valueOf(i2));
                int LIZ = RXW.LIZ(list, (String[]) ((ArrayList) LIZIZ(hashMap)).toArray(new String[0]));
                if (str3 == null || o.LJJJJJL(str3)) {
                    List<SalePropValue> list2 = ((SaleProp) ListProtector.get(this.LIZJ, i2)).salePropValueList;
                    if (list2 != null && list2.size() == 1 && (LIZ > 0 || this.LJ.getNoStockIsEnable())) {
                        Integer valueOf = Integer.valueOf(i2);
                        List<SalePropValue> list3 = ((SaleProp) ListProtector.get(this.LIZJ, i2)).salePropValueList;
                        if (list3 == null || (salePropValue = (SalePropValue) ORZ.LJLLLL(list3)) == null || (str2 = salePropValue.propValueId) == null) {
                            str2 = "";
                        }
                        hashMap.put(valueOf, str2);
                    }
                } else if (LIZ <= 0 && !this.LJ.getNoStockIsEnable()) {
                    int size2 = this.LIZJ.size();
                    while (i2 < size2) {
                        hashMap.remove(Integer.valueOf(i2));
                        i2++;
                    }
                }
                i2++;
            }
            ((HashMap) this.LIZIZ).clear();
            ((HashMap) this.LIZIZ).putAll(hashMap);
        }
        for (Map.Entry entry : ((HashMap) this.LIZLLL).entrySet()) {
            InterfaceC70268Rhw interfaceC70268Rhw = (InterfaceC70268Rhw) entry.getValue();
            int intValue = ((Number) entry.getKey()).intValue();
            C70261Rhp skuChooseGroupView = interfaceC70268Rhw.getSkuChooseGroupView();
            InterfaceC70263Rhr<InterfaceC70269Rhx> interfaceC70263Rhr = skuChooseGroupView.LJLJJL;
            if (interfaceC70263Rhr != null) {
                List<? extends InterfaceC70269Rhx> LLJILJILJ = ORZ.LLJILJILJ(skuChooseGroupView.LJLJI);
                skuChooseGroupView.LJLJJLL = -1;
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        InterfaceC70269Rhx LIZ2 = interfaceC70263Rhr.LIZ((InterfaceC70269Rhx) next);
                        ListProtector.set(LLJILJILJ, i3, LIZ2);
                        if (LIZ2.LIZ()) {
                            skuChooseGroupView.LJLJJLL = i3;
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                skuChooseGroupView.LJLJI = LLJILJILJ;
                C70265Rht c70265Rht = skuChooseGroupView.LJLJLJ;
                if (c70265Rht != null) {
                    c70265Rht.submitList(LLJILJILJ);
                }
            }
            SaleProp saleProp = (SaleProp) ORZ.LJLLLLLL(intValue, this.LIZJ);
            if (saleProp != null) {
                interfaceC70268Rhw.LJJIII(saleProp);
            }
        }
    }

    public final void LIZLLL(LifecycleOwner lifecycleOwner, List<SaleProp> list, String[] strArr, ITtfSkcStyle ttfSkuStyle) {
        kotlin.jvm.internal.o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.LJIIIZ(ttfSkuStyle, "ttfSkuStyle");
        if (list == null) {
            return;
        }
        this.LJ = ttfSkuStyle;
        this.LIZJ = list;
        ((HashMap) this.LIZIZ).clear();
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = strArr[i];
                ((HashMap) this.LIZIZ).put(Integer.valueOf(i2), str);
                i++;
                i2++;
            }
        }
    }

    public final void LIZ(C70247Rhb c70247Rhb, int i, SaleProp prop, List list, List list2, SkcInfo skcInfo, InterfaceC70165RgH interfaceC70165RgH) {
        String str;
        List<SalePropValue> list3;
        int i2;
        String str2;
        boolean z;
        boolean z2;
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list4;
        String str3;
        boolean z3;
        List list5 = list2;
        kotlin.jvm.internal.o.LJIIIZ(prop, "prop");
        this.LJFF = interfaceC70165RgH;
        c70247Rhb.LJJLJLI(prop, list, skcInfo, i);
        String str4 = prop.propId;
        if (skcInfo != null) {
            str = skcInfo.skcPropertyId;
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.o.LJ(str4, str)) {
            if (skcInfo != null && (list4 = skcInfo.skcList) != null && !list4.isEmpty() && list5 != null && !list5.isEmpty() && list4.size() != 1) {
                c70247Rhb.getTitleTextView().setText(prop.propName);
                C70261Rhp skuChooseGroupView = c70247Rhb.getSkuChooseGroupView();
                ArrayList arrayList = new ArrayList(C32I.LJJL(list4, 10));
                int i3 = 0;
                for (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc skc : list4) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc skc2 = skc;
                        String str5 = skc2.skcId;
                        if (str5 == null) {
                            str3 = "";
                        } else {
                            str3 = str5;
                        }
                        Image image = skc2.colorBlockImage;
                        List<Image> list6 = skc2.skcImages;
                        String str6 = skc2.skcName;
                        if (skc2.skcStock > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList.add(new C70257Rhl(str3, image, list6, i3, str6, z3, LIZJ(i, prop.propId, str5), true));
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                skuChooseGroupView.LIZ(arrayList, prop.showType, false, new C70260Rho(this), new C70258Rhm(this, c70247Rhb, i, list5));
                ((HashMap) this.LIZLLL).put(Integer.valueOf(i), c70247Rhb);
            }
        } else if (!kotlin.jvm.internal.o.LJ(prop.hasImage, Boolean.TRUE) && (list3 = prop.salePropValueList) != null && !list3.isEmpty()) {
            c70247Rhb.getTitleTextView().setText(prop.propName);
            C70261Rhp skuChooseGroupView2 = c70247Rhb.getSkuChooseGroupView();
            List<SalePropValue> list7 = prop.salePropValueList;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list7, 10));
            int i5 = 0;
            for (SalePropValue salePropValue : list7) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    SalePropValue salePropValue2 = salePropValue;
                    String str7 = salePropValue2.propValueId;
                    if (str7 == null || o.LJJJJJL(str7)) {
                        i2 = 0;
                    } else {
                        HashMap hashMap = new HashMap(this.LIZIZ);
                        hashMap.remove(Integer.valueOf(i));
                        Collection values = hashMap.values();
                        kotlin.jvm.internal.o.LJIIIIZZ(values, "map.values");
                        i2 = RXW.LIZ(list5, (String[]) C61898ORa.LJJIII(values.toArray(new String[0]), new String[]{salePropValue2.propValueId}));
                    }
                    String str8 = salePropValue2.propValueId;
                    if (str8 == null) {
                        str2 = "";
                    } else {
                        str2 = str8;
                    }
                    String str9 = salePropValue2.propValue;
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean LIZJ = LIZJ(i, prop.propId, str8);
                    if (i2 > 0 || this.LJ.getNoStockIsEnable()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList2.add(new C70256Rhk(z, str2, LIZJ, z2, str9));
                    i5 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            skuChooseGroupView2.LIZ(arrayList2, prop.showType, true, new C70259Rhn(this), new C70255Rhj(this, i, list5, prop, c70247Rhb));
            ((HashMap) this.LIZLLL).put(Integer.valueOf(i), c70247Rhb);
        }
        String str10 = (String) ((HashMap) this.LIZIZ).get(Integer.valueOf(i));
        if (str10 != null) {
            if (list5 == null) {
                list5 = C61878OQg.INSTANCE;
            }
            LJ(i, str10, list5);
        }
    }
}
