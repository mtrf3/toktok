package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18340nm {
    public static final C18320nk LIZIZ = new HashMap<String, InterfaceC18370np>() { // from class: X.0nk
        {
            put("OPPO", new InterfaceC18370np() { // from class: X.1YA
                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    try {
                        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return false;
                    }
                }
            });
            put("VIVO", new InterfaceC18370np() { // from class: X.1YC
                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    try {
                        return ((Boolean) Reflect.on("android.util.FtFeature").call("isFeatureSupport", new Class[]{Integer.class}, 32).get()).booleanValue();
                    } catch (EY6 unused) {
                        return false;
                    }
                }
            });
            put("HISENSE", new InterfaceC18370np() { // from class: X.1Y8
                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    try {
                        String LJJII = C86793Y4n.LJJII("ro.hmct.notch_height");
                        String LJJII2 = C86793Y4n.LJJII("ro.hmct.notch_width");
                        if (!TextUtils.equals(LJJII.trim(), CardStruct.IStatusCode.DEFAULT) && !TextUtils.isEmpty(LJJII.trim()) && !TextUtils.equals(LJJII2.trim(), CardStruct.IStatusCode.DEFAULT)) {
                            if (!TextUtils.isEmpty(LJJII2.trim())) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return false;
                }
            });
            put("HUAWEI", new C1Y9());
            put("XIAOMI", new InterfaceC18370np() { // from class: X.1YD
                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    try {
                        if (CastIntegerProtector.parseInt(C86793Y4n.LJJII("ro.miui.notch").trim()) != 1) {
                            return false;
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            put("ASUS", new InterfaceC18370np() { // from class: X.1Y7
                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    try {
                        if (CastIntegerProtector.parseInt(C86793Y4n.LJJII("persist.sys.notchui.enable").trim()) != 1) {
                            return false;
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            put("ONEPLUS", new InterfaceC18370np() { // from class: X.1YB
                public static final List<String> LIZ = Arrays.asList("ONEPLUS A6000");

                @Override // X.InterfaceC18370np
                public final boolean LIZ(Context context) {
                    return LIZ.contains(Build.MODEL);
                }
            });
        }
    };
    public static final C18330nl LIZJ = new HashMap<String, InterfaceC18370np>() { // from class: X.0nl
        {
            put("HONOR", new C1Y9() { // from class: X.1nO
            });
        }
    };
    public final boolean LIZ;

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(4:5|6|7|(2:9|(3:11|12|13)))|18|19|(1:35)(2:23|24)|(2:27|(4:29|(0)|12|13))|34|(0)|12|13|(1:(3:32|12|13))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18340nm(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            X.1qj r2 = defpackage.g0.LJIILL(r7)
            r4 = 1
            r5 = 0
            if (r2 != 0) goto Lc
            goto L66
        Lc:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L13
            goto L66
        L13:
            android.view.Window r0 = r2.getWindow()
            android.view.View r3 = r0.getDecorView()
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getRootWindowInsets"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getDisplayCutout"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r3 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "getBoundingRects"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L5c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L5c
            if (r0 == 0) goto L66
            int r0 = r0.size()     // Catch: java.lang.Exception -> L5c
            if (r0 <= 0) goto L66
            goto Lad
        L5c:
            r0 = move-exception
            java.lang.String r1 = "DigHoleCheck"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C0NB.LIZIZ(r1, r0)
        L66:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = r0.toUpperCase()     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Exception -> La2
            X.0nk r0 = X.C18340nm.LIZIZ     // Catch: java.lang.Exception -> La2
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Exception -> La2
            X.0np r3 = (X.InterfaceC18370np) r3     // Catch: java.lang.Exception -> La2
            X.0nl r0 = X.C18340nm.LIZJ     // Catch: java.lang.Exception -> La2
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Exception -> La2
            X.0np r2 = (X.InterfaceC18370np) r2     // Catch: java.lang.Exception -> La2
            if (r3 == 0) goto L93
            boolean r0 = r3.LIZ(r7)     // Catch: java.lang.Exception -> La2
            if (r0 == 0) goto L93
            goto L95
        L93:
            r1 = 0
            goto L96
        L95:
            r1 = 1
        L96:
            if (r2 == 0) goto La8
            if (r3 == r2) goto La8
            boolean r0 = r2.LIZ(r7)     // Catch: java.lang.Exception -> La2
            if (r0 == 0) goto La8
            r0 = 1
            goto La9
        La2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La6:
            r4 = 0
            goto Lad
        La8:
            r0 = 0
        La9:
            if (r1 != 0) goto Lad
            if (r0 == 0) goto La6
        Lad:
            r6.LIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18340nm.<init>(android.content.Context):void");
    }
}
