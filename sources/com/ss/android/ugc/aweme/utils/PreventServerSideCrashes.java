package com.ss.android.ugc.aweme.utils;

import X.C03880Dg;
import X.C0RN;
import X.C16880lQ;
import X.C36361EOv;
import X.C39519Ff9;
import X.C65300Pk0;
import X.EE1;
import X.EFK;
import X.EUP;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36511EUp;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class PreventServerSideCrashes implements EE1 {
    public static Activity LJLIL;
    public static boolean LJLILLLLZI;
    public static final CopyOnWriteArrayList<InterfaceC36511EUp> LJLJI = new CopyOnWriteArrayList<>();
    public static Field LJLJJI;
    public static Object LJLJJL;
    public static Object LJLJJLL;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2628441485885586904"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.EEY
    public final String key() {
        return "PreventServerSideCrashes";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static synchronized void LJ() {
        Field declaredField;
        final Object obj;
        synchronized (PreventServerSideCrashes.class) {
            if (LJLILLLLZI) {
                return;
            }
            LJLILLLLZI = true;
            if (!C36361EOv.LIZIZ) {
                try {
                    Field LIZ = C36361EOv.LIZ(EUP.class.getClass(), "classLoader");
                    if (LIZ != null) {
                        if (!LIZ.isAccessible()) {
                            LIZ.setAccessible(true);
                        }
                        LIZ.set(EUP.class, null);
                    }
                } catch (Exception unused) {
                }
                C36361EOv.LIZIZ = true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 28) {
                return;
            }
            try {
                if (i >= 26) {
                    declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
                } else {
                    declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                }
                declaredField.setAccessible(true);
                LJLJJL = declaredField.get(null);
                Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
                LJLJJI = declaredField2;
                declaredField2.setAccessible(true);
                obj = LJLJJI.get(LJLJJL);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused2) {
            }
            if (obj == null) {
                return;
            }
            LJLJJLL = Proxy.newProxyInstance(C16880lQ.LLLLIIIILLL().getContextClassLoader(), new Class[]{Class.forName("android.app.IActivityManager")}, new InvocationHandler() { // from class: X.EUo
                /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
                
                    if ((r0.getTargetException() instanceof java.lang.IllegalArgumentException) == false) goto L7;
                 */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:42:0x007e, B:44:0x0086, B:46:0x008f, B:47:0x0097, B:49:0x00c2, B:51:0x00c5, B:55:0x00f8, B:56:0x00ca, B:58:0x00d4, B:60:0x00dc, B:62:0x00e8, B:68:0x00f5, B:71:0x00fb, B:73:0x0101, B:75:0x0109, B:77:0x0114, B:80:0x009d, B:82:0x00a3, B:84:0x00a7, B:86:0x00b0, B:87:0x00b9), top: B:41:0x007e }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0101 A[Catch: all -> 0x0117, TryCatch #3 {all -> 0x0117, blocks: (B:42:0x007e, B:44:0x0086, B:46:0x008f, B:47:0x0097, B:49:0x00c2, B:51:0x00c5, B:55:0x00f8, B:56:0x00ca, B:58:0x00d4, B:60:0x00dc, B:62:0x00e8, B:68:0x00f5, B:71:0x00fb, B:73:0x0101, B:75:0x0109, B:77:0x0114, B:80:0x009d, B:82:0x00a3, B:84:0x00a7, B:86:0x00b0, B:87:0x00b9), top: B:41:0x007e }] */
                @Override // java.lang.reflect.InvocationHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
                    /*
                        Method dump skipped, instructions count: 280
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C36510EUo.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                }
            });
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        LJ();
    }
}
