package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes16.dex */
public final class YIE {
    public static final String LIZJ(String str) {
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

    public static void LIZ(YIZ yiz, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean equals;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : yiz.getClass().getDeclaredMethods()) {
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
            String str8 = (String) it.next();
            String replaceFirst = str8.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    LIZIZ(sb, i, LIZJ(str7), YIO.LJIIIZ(yiz, method2, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    LIZIZ(sb, i, LIZJ(str6), YIO.LJIIIZ(yiz, method3, new Object[0]));
                }
            }
            if (replaceFirst.length() != 0) {
                str = "set".concat(replaceFirst);
            } else {
                str = new String("set");
            }
            if (hashMap2.get(str) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (!hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(replaceFirst.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (replaceFirst.length() != 0) {
                    str3 = "get".concat(replaceFirst);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (replaceFirst.length() != 0) {
                    str4 = "has".concat(replaceFirst);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object LJIIIZ = YIO.LJIIIZ(yiz, method4, new Object[0]);
                    if (method5 == null) {
                        if (LJIIIZ instanceof Boolean) {
                            if (((Boolean) LJIIIZ).booleanValue()) {
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                        } else if (LJIIIZ instanceof Integer) {
                            if (((Integer) LJIIIZ).intValue() != 0) {
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                        } else if (LJIIIZ instanceof Float) {
                            if (((Float) LJIIIZ).floatValue() != 0.0f) {
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                        } else if (LJIIIZ instanceof Double) {
                            if (((Double) LJIIIZ).doubleValue() != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                        } else {
                            if (LJIIIZ instanceof String) {
                                equals = LJIIIZ.equals("");
                            } else if (LJIIIZ instanceof AbstractC87141YHx) {
                                equals = LJIIIZ.equals(AbstractC87141YHx.zzfuo);
                            } else if (LJIIIZ instanceof YIZ) {
                                if (LJIIIZ != ((YID) LJIIIZ).LIZIZ()) {
                                    LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                                }
                            } else {
                                if ((LJIIIZ instanceof Enum) && ((Enum) LJIIIZ).ordinal() == 0) {
                                }
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                            if (!equals) {
                                LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                            }
                        }
                    } else if (((Boolean) YIO.LJIIIZ(yiz, method5, new Object[0])).booleanValue()) {
                        LIZIZ(sb, i, LIZJ(str2), LJIIIZ);
                    }
                }
            }
        }
        if (yiz instanceof YIW) {
            Iterator<Map.Entry<Object, Object>> LIZIZ = ((YIW) yiz).zzfzg.LIZIZ();
            if (LIZIZ.hasNext()) {
                LIZIZ.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        C87159YIp c87159YIp = ((YIO) yiz).zzfza;
        if (c87159YIp != null) {
            for (int i2 = 0; i2 < c87159YIp.LIZ; i2++) {
                LIZIZ(sb, i, String.valueOf(c87159YIp.LIZIZ[i2] >>> 3), c87159YIp.LIZJ[i2]);
            }
        }
    }

    public static final void LIZIZ(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                LIZIZ(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                LIZIZ(sb, i, str, it2.next());
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
            sb.append(C72085SQv.LJJJJJL(AbstractC87141YHx.zzgt((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC87141YHx) {
            sb.append(": \"");
            sb.append(C72085SQv.LJJJJJL((AbstractC87141YHx) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof YIO) {
            sb.append(" {");
            LIZ((YIQ) obj, sb, i + 2);
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
            LIZIZ(sb, i4, "key", entry.getKey());
            LIZIZ(sb, i4, "value", entry.getValue());
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
