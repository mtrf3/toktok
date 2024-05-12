package com.appsflyer.internal;

import X.C03660Ck;
import X.V0N;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE;

        public static b valueOf(String str) {
            return (b) V0N.LJJJ(b.class, str);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        FIRST,
        ALL;

        public static c valueOf(String str) {
            return (c) V0N.LJJJ(c.class, str);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        public String valueOf;

        public static e valueOf(String str) {
            return (e) V0N.LJJJ(e.class, str);
        }

        e(String str) {
            this.valueOf = str;
        }
    }

    public static List<BigDecimal> AFInAppEventType(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f2 = (Float) arrayList.get(1);
        Float f3 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(CastDoubleProtector.parseDouble(f.toString())));
        arrayList2.add(BigDecimal.valueOf(CastDoubleProtector.parseDouble(f2.toString())));
        arrayList2.add(BigDecimal.valueOf(CastDoubleProtector.parseDouble(f3.toString())));
        return arrayList2;
    }

    public final Map AFInAppEventParameterName(List<Map<String, Object>> list) {
        boolean z;
        boolean z2;
        c cVar;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            if (map.get("sVS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (map.get("sVE") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    cVar = c.ALL;
                } else {
                    cVar = c.FIRST;
                }
            } else {
                cVar = c.NONE;
            }
            if (cVar != c.NONE) {
                Integer num = (Integer) map.get("sT");
                Object obj = map.get("sN");
                if (obj != null) {
                    hashMap2.put("n", obj);
                } else {
                    hashMap2.put("n", "uk");
                }
                b bVar = b.values()[num.intValue()];
                ArrayList arrayList2 = new ArrayList(AFInAppEventType(map.get("sVS")));
                if (cVar == c.ALL) {
                    arrayList2.addAll(AFInAppEventType(map.get("sVE")));
                }
                if (bVar == b.MAGNETOMETER) {
                    ArrayList arrayList3 = new ArrayList();
                    BigDecimal bigDecimal = (BigDecimal) ListProtector.get(arrayList2, 0);
                    BigDecimal bigDecimal2 = (BigDecimal) ListProtector.get(arrayList2, 1);
                    BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(bigDecimal2.doubleValue(), bigDecimal.doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat("##.#");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat.format(valueOf))));
                    Object obj2 = ListProtector.get(arrayList2, 2);
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat2.format(obj2))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal bigDecimal3 = (BigDecimal) ListProtector.get(arrayList2, 3);
                        BigDecimal bigDecimal4 = (BigDecimal) ListProtector.get(arrayList2, 4);
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(bigDecimal4.doubleValue(), bigDecimal3.doubleValue()) * 57.29577951308232d).subtract(valueOf);
                        DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) ListProtector.get(arrayList2, 5)).subtract((BigDecimal) ListProtector.get(arrayList2, 2));
                        DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat4.format(subtract2))));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) ListProtector.get(arrayList2, 3)).subtract((BigDecimal) ListProtector.get(arrayList2, 0));
                        DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) ListProtector.get(arrayList2, 4)).subtract((BigDecimal) ListProtector.get(arrayList2, 1));
                        DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) ListProtector.get(arrayList2, 5)).subtract((BigDecimal) ListProtector.get(arrayList2, 2));
                        DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Object obj3 = ListProtector.get(arrayList2, 0);
                    DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat8.format(obj3))));
                    Object obj4 = ListProtector.get(arrayList2, 1);
                    DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat9.format(obj4))));
                    Object obj5 = ListProtector.get(arrayList2, 2);
                    DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(CastDoubleProtector.parseDouble(decimalFormat10.format(obj5))));
                    arrayList = new ArrayList();
                    arrayList.add(arrayList6);
                    arrayList.add(arrayList5);
                }
                hashMap2.put("v", arrayList);
                hashMap.put(e.values()[num.intValue()].valueOf, hashMap2);
                if (cVar == c.FIRST) {
                    hashMap.put("er", "no_svs");
                }
            } else {
                return C03660Ck.LIZJ("er", "na");
            }
        }
        return hashMap;
    }
}
