package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.xtrace.XTrace;
import com.bytedance.xtrace.utils.TraceHelper;
import com.google.gson.g;
import com.google.gson.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.xtrace.MethodItem;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.List;

/* renamed from: X.FfJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39529FfJ {
    public static volatile boolean LIZ;

    public static void LIZ() {
        Class[] clsArr;
        String str;
        Class<?> cls;
        Member method;
        j jVar = (j) SettingsManager.LIZLLL().LJIIIIZZ("dynamic_trace_config", g.class, null);
        if (jVar == null) {
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("trace config:");
        LIZ2.append(jVar.toString());
        printStream.println(X1D.LIZIZ(LIZ2));
        for (MethodItem methodItem : (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), jVar, new C39530FfK().getType())) {
            if (TextUtils.isEmpty(methodItem.methodSign)) {
                clsArr = null;
            } else {
                String[] split = methodItem.methodSign.split(",");
                clsArr = new Class[split.length];
                int i = 0;
                for (String str2 : split) {
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1374008726:
                            if (str2.equals("byte[]")) {
                                clsArr[i] = byte[].class;
                                break;
                            }
                            break;
                        case -1361632968:
                            if (str2.equals("char[]")) {
                                clsArr[i] = char[].class;
                                break;
                            }
                            break;
                        case -1325958191:
                            if (str2.equals("double")) {
                                clsArr[i] = Double.TYPE;
                                break;
                            }
                            break;
                        case -1097129250:
                            if (str2.equals("long[]")) {
                                clsArr[i] = long[].class;
                                break;
                            }
                            break;
                        case -766441794:
                            if (str2.equals("float[]")) {
                                clsArr[i] = float[].class;
                                break;
                            }
                            break;
                        case 104431:
                            if (str2.equals("int")) {
                                clsArr[i] = Integer.TYPE;
                                break;
                            }
                            break;
                        case 3039496:
                            if (str2.equals("byte")) {
                                clsArr[i] = Byte.TYPE;
                                break;
                            }
                            break;
                        case 3052374:
                            if (str2.equals("char")) {
                                clsArr[i] = Character.TYPE;
                                break;
                            }
                            break;
                        case 3327612:
                            if (str2.equals("long")) {
                                clsArr[i] = Long.TYPE;
                                break;
                            }
                            break;
                        case 64711720:
                            if (str2.equals("boolean")) {
                                clsArr[i] = Boolean.TYPE;
                                break;
                            }
                            break;
                        case 97526364:
                            if (str2.equals("float")) {
                                clsArr[i] = Float.TYPE;
                                break;
                            }
                            break;
                        case 100361105:
                            if (str2.equals("int[]")) {
                                clsArr[i] = int[].class;
                                break;
                            }
                            break;
                        case 109413500:
                            if (str2.equals("short")) {
                                clsArr[i] = Short.TYPE;
                                break;
                            }
                            break;
                        case 1359468275:
                            if (str2.equals("double[]")) {
                                clsArr[i] = double[].class;
                                break;
                            }
                            break;
                        case 2058423690:
                            if (str2.equals("boolean[]")) {
                                clsArr[i] = boolean[].class;
                                break;
                            }
                            break;
                        case 2067161310:
                            if (str2.equals("short[]")) {
                                clsArr[i] = short[].class;
                                break;
                            }
                            break;
                    }
                    if (str2.contains("[]")) {
                        str = str2.replace("[]", "");
                    } else {
                        str = str2;
                    }
                    try {
                        cls = Class.forName(str);
                    } catch (ClassNotFoundException e) {
                        C16880lQ.LLLLIIL(e);
                        cls = null;
                    }
                    if (str2.contains("[]") && cls != null) {
                        clsArr[i] = Array.newInstance(cls, 0).getClass();
                    } else {
                        clsArr[i] = cls;
                    }
                    i++;
                }
            }
            boolean z = methodItem.isConstructor;
            String str3 = methodItem.className;
            String str4 = methodItem.methodName;
            if (z) {
                try {
                    method = TraceHelper.getConstructorWithArgs(Class.forName(str3), clsArr);
                } catch (ClassNotFoundException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } else {
                method = TraceHelper.getMethod(str3, str4, clsArr);
            }
            if (method != null) {
                PrintStream printStream2 = System.err;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("trace method:");
                LIZ3.append(method.getDeclaringClass().getName());
                LIZ3.append("#");
                LIZ3.append(method.getName());
                printStream2.println(X1D.LIZIZ(LIZ3));
                XTrace.trace(method);
            }
        }
    }
}
