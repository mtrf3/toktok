package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes16.dex */
public final class YIF {
    public static final String LIZIZ(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void LIZJ(YIH yih, StringBuilder sb, int i) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : yih.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    LIZ(sb, i, LIZIZ(concat), YIN.LJIILL(yih, method2, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    LIZ(sb, i, LIZIZ(concat2), YIN.LJIILL(yih, method3, new Object[0]));
                }
            }
            if (hashMap2.get("set".concat(str)) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object LJIILL = YIN.LJIILL(yih, method4, new Object[0]);
                    if (method5 == null) {
                        if (LJIILL instanceof Boolean) {
                            if (((Boolean) LJIILL).booleanValue()) {
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                        } else if (LJIILL instanceof Integer) {
                            if (((Integer) LJIILL).intValue() != 0) {
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                        } else if (LJIILL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) LJIILL).floatValue()) != 0) {
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                        } else if (LJIILL instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) LJIILL).doubleValue()) != 0) {
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                        } else {
                            if (LJIILL instanceof String) {
                                equals = LJIILL.equals("");
                            } else if (LJIILL instanceof AbstractC87134YHq) {
                                equals = LJIILL.equals(AbstractC87134YHq.zzb);
                            } else if (LJIILL instanceof YIH) {
                                if (LJIILL != ((YIK) LJIILL).LIZLLL()) {
                                    LIZ(sb, i, LIZIZ(concat3), LJIILL);
                                }
                            } else {
                                if ((LJIILL instanceof Enum) && ((Enum) LJIILL).ordinal() == 0) {
                                }
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                            if (!equals) {
                                LIZ(sb, i, LIZIZ(concat3), LJIILL);
                            }
                        }
                    } else if (((Boolean) YIN.LJIILL(yih, method5, new Object[0])).booleanValue()) {
                        LIZ(sb, i, LIZIZ(concat3), LJIILL);
                    }
                }
            }
        }
        if (!(yih instanceof AbstractC87145YIb)) {
            C87157YIn c87157YIn = ((YIN) yih).zzc;
            if (c87157YIn != null) {
                for (int i2 = 0; i2 < c87157YIn.LIZ; i2++) {
                    LIZ(sb, i, String.valueOf(c87157YIn.LIZIZ[i2] >>> 3), c87157YIn.LIZJ[i2]);
                }
                return;
            }
            return;
        }
        throw null;
    }

    public static final void LIZ(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                LIZ(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                LIZ(sb, i, str, it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C1DJ.LJJJI(AbstractC87134YHq.zzm((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC87134YHq) {
            sb.append(": \"");
            sb.append(C1DJ.LJJJI((AbstractC87134YHq) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof YIN) {
            sb.append(" {");
            LIZJ((YIP) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i + 2;
            LIZ(sb, i4, "key", entry.getKey());
            LIZ(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
