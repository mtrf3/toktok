package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.BaseBundle;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FXX {
    public static final Method LIZ;
    public static final Field LIZIZ;
    public static final java.util.Set<String> LIZJ;

    static {
        Field field;
        try {
            Class superclass = Bundle.class.getSuperclass();
            if (superclass != null) {
                field = superclass.getDeclaredField("mMap");
            } else {
                field = null;
            }
            LIZIZ = field;
            if (field != null) {
                field.setAccessible(true);
            }
            Method declaredMethod = BaseBundle.class.getDeclaredMethod("unparcel", new Class[0]);
            LIZ = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
        } catch (Exception unused) {
        }
        LIZJ = C77275UUl.LJIIIIZZ("INTENT_BTM", "wrangler_activity_start_stack_info", "pns.sandbox.dataflow_id");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0016, B:12:0x0022, B:14:0x0027, B:16:0x002d, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0043, B:23:0x0048, B:25:0x004e, B:26:0x0053, B:28:0x0059), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1HQ LIZIZ(android.content.Intent r3) {
        /*
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.1HQ r2 = new X.1HQ     // Catch: java.lang.Throwable -> L5f
            r2.<init>()     // Catch: java.lang.Throwable -> L5f
            android.os.Bundle r0 = X.C16880lQ.LLJJIJI(r3)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L27
            X.1HQ r1 = LIZ(r3, r0)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L1f
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 != 0) goto L27
            java.lang.String r0 = "extras"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
        L27:
            android.net.Uri r1 = r3.getData()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L32
            java.lang.String r0 = "data"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
        L32:
            java.lang.String r1 = r3.getType()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L3d
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
        L3d:
            java.lang.String r1 = r3.getAction()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L48
            java.lang.String r0 = "action"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
        L48:
            java.lang.String r1 = r3.getPackage()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L53
            java.lang.String r0 = "package"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
        L53:
            android.content.ComponentName r1 = r3.getComponent()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L60
            java.lang.String r0 = "component"
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L5f
            goto L60
        L5f:
            r2 = 0
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXX.LIZIZ(android.content.Intent):X.1HQ");
    }

    public static void LIZJ(Bundle bundle) {
        Method method = LIZ;
        if (method != null) {
            Object[] objArr = new Object[0];
            if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{bundle, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1777940128386772081")).LIZ) {
                return;
            }
            method.invoke(bundle, objArr);
        }
    }

    public static C1HQ LIZ(Intent intent, Bundle bundle) {
        C3C4 LIZ2;
        java.util.Map map;
        String str;
        Object valueOf;
        try {
            Field field = LIZIZ;
            if (field != null) {
                field.setAccessible(true);
                LIZJ(bundle);
                Object obj = field.get(bundle);
                if (obj instanceof java.util.Map) {
                    map = (java.util.Map) obj;
                } else {
                    map = null;
                }
                if (map != null) {
                    C1HQ c1hq = new C1HQ();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (!ORZ.LJLJJI(key, LIZJ)) {
                            if (o.LJ(key, "android.intent.extra.STREAM")) {
                                c1hq.put(key.toString(), String.valueOf((android.net.Uri) intent.getParcelableExtra(key.toString())));
                            } else if (o.LJ(key, "android.intent.extra.INTENT")) {
                                Intent intent2 = (Intent) intent.getParcelableExtra(key.toString());
                                if (intent2 != null) {
                                    c1hq.put(key.toString(), LIZIZ(intent2));
                                }
                            } else if (o.LJ(key, "android.intent.extra.CHOSEN_COMPONENT_INTENT_SENDER")) {
                                IntentSender intentSender = (IntentSender) intent.getParcelableExtra(key.toString());
                                String obj2 = key.toString();
                                if (intentSender != null) {
                                    str = intentSender.toString();
                                } else {
                                    str = null;
                                }
                                c1hq.put(obj2, str);
                            } else {
                                String valueOf2 = String.valueOf(key);
                                if (value instanceof Bundle) {
                                    valueOf = LIZ(intent, (Bundle) value);
                                } else if (value instanceof Intent) {
                                    valueOf = LIZIZ((Intent) value);
                                } else {
                                    valueOf = String.valueOf(value);
                                }
                                c1hq.put(valueOf2, valueOf);
                            }
                        }
                    }
                    return c1hq;
                }
            }
            C3C5.m7constructorimpl(null);
            LIZ2 = null;
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m10exceptionOrNullimpl(LIZ2);
        return null;
    }
}
