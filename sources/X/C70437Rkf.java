package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Rkf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70437Rkf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, java.util.Map commonParams) {
        o.LJIIIZ(commonParams, "commonParams");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            Object obj = map.get("campaign_id");
            if (obj != null && !linkedHashSet.contains(obj)) {
                linkedHashSet.add(obj);
                Object obj2 = map.get("campaign_user_tag");
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
                Object obj3 = map.get("campaign_type");
                if (obj3 != null) {
                    arrayList3.add(obj3);
                }
                Object obj4 = map.get("campaign_channel");
                if (obj4 != null) {
                    arrayList2.add(obj4);
                }
            }
            Object obj5 = map.get("campaign_cost_role");
            if (obj5 != null) {
                arrayList4.add(obj5);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        commonParams.put("campaign_id", ORZ.LLD(linkedHashSet, ",", null, null, null, 62));
        commonParams.put("campaign_user_tag", ORZ.LLD(arrayList, ",", null, null, null, 62));
        commonParams.put("campaign_type", ORZ.LLD(arrayList3, ",", null, null, null, 62));
        commonParams.put("campaign_channel", ORZ.LLD(arrayList2, ",", null, null, null, 62));
        commonParams.put("campaign_cost_role", ORZ.LLD(arrayList4, ",", null, null, null, 62));
    }

    public static void LIZIZ(java.util.Map map, java.util.Map commonParams) {
        o.LJIIIZ(commonParams, "commonParams");
        Object obj = map.get("coupon_type");
        Object obj2 = map.get("coupon_type_info");
        Object obj3 = map.get("coupon_cost_role");
        Object obj4 = map.get("coupon_name");
        Object obj5 = map.get("coupon_id");
        Object obj6 = map.get("coupon_type_id");
        commonParams.put("coupon_type", String.valueOf(obj));
        commonParams.put("coupon_type_info", String.valueOf(obj2));
        commonParams.put("coupon_cost_role", String.valueOf(obj3));
        commonParams.put("coupon_name", String.valueOf(obj4));
        commonParams.put("coupon_id", String.valueOf(obj5));
        commonParams.put("coupon_type_id", String.valueOf(obj6));
    }

    public static C70438Rkg LIZJ(Voucher voucher, Boolean bool) {
        o.LJIIIZ(voucher, "voucher");
        return LIZLLL(bool, C47261Igj.LJJIJIL(voucher));
    }

    public static C70438Rkg LIZLLL(Boolean bool, List list) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String obj;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII = C27739Aud.LJII(((Voucher) it.next()).getDaInfo());
                if (LJII != null) {
                    if (sb.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        sb.append(",");
                    }
                    Object obj2 = LJII.get("coupon_id");
                    String str6 = null;
                    if (obj2 == null || (str = obj2.toString()) == null || str.length() == 0) {
                        str = "-1";
                    }
                    sb.append(str);
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    Object obj3 = LJII.get("coupon_type_id");
                    String str7 = "";
                    if (obj3 == null || (str2 = obj3.toString()) == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    if (sb3.length() > 0) {
                        sb3.append(",");
                    }
                    Object obj4 = LJII.get("coupon_name");
                    if (obj4 == null || (str3 = obj4.toString()) == null) {
                        str3 = "";
                    }
                    sb3.append(str3);
                    if (sb4.length() > 0) {
                        sb4.append(",");
                    }
                    Object obj5 = LJII.get("coupon_type");
                    if (obj5 == null || (str4 = obj5.toString()) == null) {
                        str4 = "";
                    }
                    sb4.append(str4);
                    if (o.LJ(bool, Boolean.TRUE)) {
                        if (sb5.length() > 0) {
                            sb5.append(",");
                        }
                        Object obj6 = LJII.get("coupon_type_info");
                        if (obj6 == null || (str6 = obj6.toString()) == null || str6.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            sb5.append("\"task_type\":\"follow_task\"");
                        } else {
                            HashMap<String, Object> LJII2 = C27739Aud.LJII(str6);
                            if (LJII2 == null || LJII2.isEmpty()) {
                                sb5.append("\"task_type\":\"follow_task\"");
                            } else {
                                LJII2.put("task_type", "follow_task");
                                StringBuilder sb7 = new StringBuilder();
                                try {
                                    sb7.append("{");
                                    boolean z3 = true;
                                    for (Map.Entry<String, Object> entry : LJII2.entrySet()) {
                                        Object value = entry.getValue();
                                        if (value != null) {
                                            if (!z3) {
                                                sb7.append(",");
                                            }
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append('\"');
                                            LIZ2.append(entry.getKey());
                                            LIZ2.append("\":\"");
                                            LIZ2.append(value);
                                            LIZ2.append('\"');
                                            sb7.append(X1D.LIZIZ(LIZ2));
                                            z3 = false;
                                        }
                                    }
                                    sb7.append("}");
                                } catch (Exception unused) {
                                    sb7.append("{}");
                                }
                                String sb8 = sb7.toString();
                                o.LJIIIIZZ(sb8, "StringBuilder().apply(builderAction).toString()");
                                sb5.append(sb8);
                            }
                        }
                    } else {
                        if (sb5.length() > 0) {
                            sb5.append(",");
                        }
                        Object obj7 = LJII.get("coupon_type_info");
                        if (obj7 == null || (str5 = obj7.toString()) == null) {
                            str5 = "";
                        }
                        sb5.append(str5);
                    }
                    if (sb6.length() > 0) {
                        sb6.append(",");
                    }
                    Object obj8 = LJII.get("coupon_cost_role");
                    if (obj8 != null && (obj = obj8.toString()) != null) {
                        str7 = obj;
                    }
                    sb6.append(str7);
                }
            }
        }
        String sb9 = sb.toString();
        o.LJIIIIZZ(sb9, "couponsIds.toString()");
        String sb10 = sb2.toString();
        o.LJIIIIZZ(sb10, "voucherTypeIds.toString()");
        String sb11 = sb3.toString();
        o.LJIIIIZZ(sb11, "voucherNames.toString()");
        String sb12 = sb4.toString();
        o.LJIIIIZZ(sb12, "voucherTypes.toString()");
        String sb13 = sb5.toString();
        o.LJIIIIZZ(sb13, "typeInfo.toString()");
        String sb14 = sb6.toString();
        o.LJIIIIZZ(sb14, "costRole.toString()");
        return new C70438Rkg(sb9, sb10, sb11, sb12, sb13, sb14);
    }

    public static void LJ(C70438Rkg c70438Rkg, AbstractC70115RfT abstractC70115RfT, java.util.Map map) {
        if (map != null) {
            abstractC70115RfT.LIZLLL(map);
        }
        String str = c70438Rkg.LJLIL;
        if (str != null) {
            abstractC70115RfT.LIZIZ.put("coupon_id", str);
        }
        String str2 = c70438Rkg.LJLILLLLZI;
        if (str2 != null) {
            abstractC70115RfT.LIZIZ.put("coupon_type_id", str2);
        }
        String str3 = c70438Rkg.LJLJI;
        if (str3 != null) {
            abstractC70115RfT.LIZIZ.put("coupon_name", str3);
        }
        String str4 = c70438Rkg.LJLJJI;
        if (str4 != null) {
            abstractC70115RfT.LIZIZ.put("coupon_type", str4);
        }
        String str5 = c70438Rkg.LJLJJL;
        if (str5 != null) {
            abstractC70115RfT.LIZIZ.put("coupon_type_info", str5);
        }
        String str6 = c70438Rkg.LJLJJLL;
        if (str6 != null) {
            abstractC70115RfT.LIZIZ.put("coupon_cost_role", str6);
        }
    }
}
