package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.DaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rze, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71366Rze {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZLLL(List list) {
        Object obj;
        boolean z;
        if (list != null && !list.isEmpty() && (!((z = list instanceof Collection)) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ShopWindowAnchorModel) it.next()).LIZ.bizType != null) {
                    if (!z || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            Integer num = ((ShopWindowAnchorModel) it2.next()).LIZ.bizType;
                            if (num == null || num.intValue() != 0) {
                                if (!z || !list.isEmpty()) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        Integer num2 = ((ShopWindowAnchorModel) it3.next()).LIZ.bizType;
                                        if (num2 == null || num2.intValue() != 2) {
                                            obj = 99;
                                            break;
                                        }
                                    }
                                }
                                obj = 2;
                                return obj.toString();
                            }
                        }
                    }
                    obj = 0;
                    return obj.toString();
                }
            }
        }
        obj = "";
        return obj.toString();
    }

    public static String LJFF(ShopWindowAnchorModel shopWindowAnchorModel) {
        ShopWindowExtraModel shopWindowExtraModel;
        Integer num;
        String num2;
        if (shopWindowAnchorModel == null || (shopWindowExtraModel = shopWindowAnchorModel.LIZ) == null || (num = shopWindowExtraModel.bizType) == null || (num2 = num.toString()) == null) {
            return "";
        }
        return num2;
    }

    public static int LJI(List list) {
        C71361RzZ.LIZ.getClass();
        if (C71361RzZ.LJJJ(list)) {
            return 5;
        }
        return 10;
    }

    public static java.util.Map LJIIIIZZ(OSZ osz) {
        boolean z;
        String str;
        int i;
        Integer itemType;
        DaInfo daInfo;
        DaInfo daInfo2;
        String str2;
        DaInfo daInfo3;
        Integer itemType2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorPrivilegeItem anchorPrivilegeItem = (AnchorPrivilegeItem) osz.getFirst();
        int i2 = 1;
        if (anchorPrivilegeItem == null || (itemType2 = anchorPrivilegeItem.getItemType()) == null || itemType2.intValue() != 2) {
            z = false;
        } else {
            z = true;
        }
        String str3 = null;
        if (z) {
            AnchorPrivilegeItem anchorPrivilegeItem2 = (AnchorPrivilegeItem) osz.getFirst();
            if (anchorPrivilegeItem2 != null && (daInfo3 = anchorPrivilegeItem2.getDaInfo()) != null) {
                str2 = daInfo3.name;
            } else {
                str2 = null;
            }
            str = String.valueOf(str2);
            i = 1;
        } else {
            str = "";
            i = 0;
        }
        AnchorPrivilegeItem anchorPrivilegeItem3 = (AnchorPrivilegeItem) osz.getSecond();
        if (anchorPrivilegeItem3 == null || (itemType = anchorPrivilegeItem3.getItemType()) == null || itemType.intValue() != 2) {
            i2 = i;
        } else {
            i++;
            if (str.length() == 0) {
                AnchorPrivilegeItem anchorPrivilegeItem4 = (AnchorPrivilegeItem) osz.getSecond();
                if (anchorPrivilegeItem4 != null && (daInfo2 = anchorPrivilegeItem4.getDaInfo()) != null) {
                    str3 = daInfo2.name;
                }
                str = String.valueOf(str3);
            } else {
                StringBuilder LJFF = C72972SkS.LJFF(str, ',');
                AnchorPrivilegeItem anchorPrivilegeItem5 = (AnchorPrivilegeItem) osz.getSecond();
                if (anchorPrivilegeItem5 != null && (daInfo = anchorPrivilegeItem5.getDaInfo()) != null) {
                    str3 = daInfo.name;
                }
                LJFF.append(str3);
                str = X1D.LIZIZ(LJFF);
            }
        }
        linkedHashMap.put("has_sellingpoint", Integer.valueOf(i2));
        linkedHashMap.put("sellingpoint_cnt", Integer.valueOf(i));
        linkedHashMap.put("pos_selling_point", str);
        return linkedHashMap;
    }

    public static void LIZ(C71367Rzf c71367Rzf, Aweme aweme) {
        int i = 1;
        if (aweme.getShopAdStruct() != null && o.LJ(aweme.getShopAdStruct().isAd(), "1")) {
            c71367Rzf.LJIL = 1;
            c71367Rzf.LJJ = aweme.getShopAdStruct().getAdId();
            c71367Rzf.LJJI = aweme.getShopAdStruct().getCreativeId();
        } else {
            if (!aweme.isAd()) {
                i = 0;
            }
            c71367Rzf.LJIL = i;
        }
    }

    public static void LIZIZ(String str, C71367Rzf params) {
        o.LJIIIZ(params, "params");
        java.util.Map LJI = C71370Rzi.LJI(str);
        if (LJI != null) {
            Object obj = LJI.get("volume");
            if (obj != null) {
                params.LJJLIIIJLLLLLLLZ = obj.toString();
            }
            Object obj2 = LJI.get("volume_type");
            if (obj2 != null) {
                params.LJJLIL = obj2.toString();
            }
            Object obj3 = LJI.get("inherited_volume");
            if (obj3 != null) {
                params.LJJLIIJ = obj3.toString();
            }
        }
    }

    public static void LIZJ(String str, java.util.Map map) {
        java.util.Map LJI = C71370Rzi.LJI(str);
        if (LJI != null) {
            Object obj = LJI.get("volume");
            if (obj != null) {
                map.put("volume", obj.toString());
            }
            Object obj2 = LJI.get("volume_type");
            if (obj2 != null) {
                map.put("volume_type", obj2.toString());
            }
            Object obj3 = LJI.get("inherited_volume");
            if (obj3 != null) {
                map.put("inherited_volume", obj3.toString());
            }
        }
    }

    public static int LJII(Aweme aweme, C188727au c188727au, List products) {
        java.util.Map<String, String> map;
        String str;
        Integer LJJIL;
        o.LJIIIZ(products, "products");
        C71361RzZ.LIZ.getClass();
        if (C71361RzZ.LJJJJ(aweme)) {
            if (!C71361RzZ.LJIILL(aweme, products)) {
                return 0;
            }
        } else if (c188727au != null && (map = c188727au.LIZ) != null && (str = (String) ((HashMap) map).get("multi_anchor_display")) != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            return LJJIL.intValue();
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r10.isAd() == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJ(com.ss.android.ugc.aweme.feed.model.Aweme r10, com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo r11, java.lang.String r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71366Rze.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo, java.lang.String, java.lang.Integer):java.util.Map");
    }
}
