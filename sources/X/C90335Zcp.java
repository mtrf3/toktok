package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.Zcp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90335Zcp {
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

    public static void LIZJ(InterfaceC90712Ziu interfaceC90712Ziu, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : interfaceC90712Ziu.getClass().getDeclaredMethods()) {
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
            String str9 = (String) it.next();
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    LIZ(sb, i, LIZIZ(str8), AbstractC90950Zmk.LJIIIIZZ(interfaceC90712Ziu, method2, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    LIZ(sb, i, LIZIZ(str7), AbstractC90950Zmk.LJIIIIZZ(interfaceC90712Ziu, method3, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (hashMap2.get(str2) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (!hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object LJIIIIZZ = AbstractC90950Zmk.LJIIIIZZ(interfaceC90712Ziu, method4, new Object[0]);
                    if (method5 == null) {
                        if (LJIIIIZZ instanceof Boolean) {
                            if (((Boolean) LJIIIIZZ).booleanValue()) {
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                        } else if (LJIIIIZZ instanceof Integer) {
                            if (((Integer) LJIIIIZZ).intValue() != 0) {
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                        } else if (LJIIIIZZ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) LJIIIIZZ).floatValue()) != 0) {
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                        } else if (LJIIIIZZ instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) LJIIIIZZ).doubleValue()) != 0) {
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                        } else {
                            if (LJIIIIZZ instanceof String) {
                                equals = LJIIIIZZ.equals("");
                            } else if (LJIIIIZZ instanceof AbstractC90364ZdI) {
                                equals = LJIIIIZZ.equals(AbstractC90364ZdI.zzb);
                            } else if (LJIIIIZZ instanceof InterfaceC90712Ziu) {
                                if (LJIIIIZZ != ((InterfaceC90327Zch) LJIIIIZZ).LJIILIIL()) {
                                    LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                                }
                            } else {
                                if ((LJIIIIZZ instanceof Enum) && ((Enum) LJIIIIZZ).ordinal() == 0) {
                                }
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                            if (!equals) {
                                LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                            }
                        }
                    } else if (((Boolean) AbstractC90950Zmk.LJIIIIZZ(interfaceC90712Ziu, method5, new Object[0])).booleanValue()) {
                        LIZ(sb, i, LIZIZ(str3), LJIIIIZZ);
                    }
                }
            }
        }
        if (interfaceC90712Ziu instanceof AbstractC90996ZnU) {
            throw null;
        }
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
            sb.append(ZYK.LIZ(AbstractC90364ZdI.zzl((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC90364ZdI) {
            sb.append(": \"");
            sb.append(ZYK.LIZ((AbstractC90364ZdI) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC90950Zmk) {
            sb.append(" {");
            LIZJ((AbstractC90893Zlp) obj, sb, i + 2);
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
        sb.append(obj.toString());
    }
}
