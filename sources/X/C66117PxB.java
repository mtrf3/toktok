package X;

import android.util.Pair;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.PxB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66117PxB {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static volatile InterfaceC66159Pxr LIZLLL;
    public static final C66117PxB LJ = new C66117PxB();
    public static String LIZJ = "rule_engine";

    public static final Pair<Boolean, Object> LIZ(Object obj, Object obj2, Object[] objArr, int i, String str, C65300Pk0 c65300Pk0, int i2, String str2, String str3) {
        Object obj3;
        boolean z;
        InterfaceC66159Pxr interfaceC66159Pxr;
        Object newInstance;
        C66117PxB c66117PxB = LJ;
        if (LIZLLL == null && LIZ) {
            synchronized (c66117PxB) {
                if (LIZLLL == null) {
                    try {
                        newInstance = Class.forName("com.bytedance.helios.apimonitor.ActionInvokeEntranceImpl").newInstance();
                    } catch (Throwable th) {
                        if (!LIZIZ) {
                            LIZ = false;
                            interfaceC66159Pxr = null;
                        } else {
                            throw th;
                        }
                    }
                    if (newInstance != null) {
                        interfaceC66159Pxr = (InterfaceC66159Pxr) newInstance;
                        LIZLLL = interfaceC66159Pxr;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.helios.sdk.ActionInvokeEntranceDef");
                    }
                }
            }
        }
        InterfaceC66159Pxr interfaceC66159Pxr2 = LIZLLL;
        if (interfaceC66159Pxr2 != null) {
            Boolean bool = Boolean.FALSE;
            java.util.Map<String, Object> map = c65300Pk0.LIZJ;
            if (map == null || !map.containsKey("api_cached")) {
                obj3 = bool;
            } else {
                obj3 = c65300Pk0.LIZJ.get("api_cached");
            }
            if (!(obj3 instanceof Boolean)) {
                obj3 = null;
            }
            Boolean bool2 = (Boolean) obj3;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            if (!heliosEnvImpl.LJIIJJI()) {
                return new Pair<>(bool, null);
            }
            if (HeliosEnvImpl.get().LJIIL.contains(Integer.valueOf(i))) {
                return new Pair<>(bool, null);
            }
            C66120PxE createPrivacyEvent = interfaceC66159Pxr2.createPrivacyEvent(obj, obj2, objArr, i, str, currentTimeMillis, c65300Pk0.LIZ, z, str2, str3);
            if (createPrivacyEvent != null) {
                java.util.Map<String, Object> map2 = c65300Pk0.LIZJ;
                o.LJIIIIZZ(map2, "extraInfo.extra");
                createPrivacyEvent.LLIL = map2;
                if (map2.containsKey("certToken")) {
                    createPrivacyEvent.LJLLLL.put("certToken", createPrivacyEvent.LLIL.get("certToken"));
                }
                String str4 = c65300Pk0.LIZLLL;
                o.LJIIIIZZ(str4, "extraInfo.hashOfCallSiteClass");
                createPrivacyEvent.LLIILZL = str4;
                HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                if (heliosEnvImpl2.LJIIJ.ignoreApiIds.contains(Integer.valueOf(createPrivacyEvent.LJLJI))) {
                    return new Pair<>(bool, null);
                }
                if (o.LJ(LIZJ, "rule_engine")) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                interfaceC66159Pxr2.actionInvoke(createPrivacyEvent);
                            }
                        } else {
                            Pair<Boolean, Object> actionIntercept = interfaceC66159Pxr2.actionIntercept(createPrivacyEvent);
                            if (!((Boolean) actionIntercept.first).booleanValue()) {
                                C66120PxE LIZ2 = createPrivacyEvent.LIZ();
                                LIZ2.LJLZ = "SensitiveApiException";
                                interfaceC66159Pxr2.actionInvoke(LIZ2);
                            }
                            return actionIntercept;
                        }
                    } else {
                        return interfaceC66159Pxr2.actionIntercept(createPrivacyEvent);
                    }
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            createPrivacyEvent.LLI.setCheckModes(C77275UUl.LJ(EnumC66158Pxq.ASYNC));
                            interfaceC66159Pxr2.actionInvoke(createPrivacyEvent);
                        }
                    } else {
                        if (interfaceC66159Pxr2.isEnabled(createPrivacyEvent)) {
                            createPrivacyEvent.LJLJJLL = new Throwable();
                            createPrivacyEvent.LLI.setCheckModes(C77275UUl.LJ(EnumC66158Pxq.SYNC, EnumC66158Pxq.ASYNC));
                        } else {
                            createPrivacyEvent.LLI.setCheckModes(C77275UUl.LJ(EnumC66158Pxq.SYNC));
                        }
                        return interfaceC66159Pxr2.actionIntercept(createPrivacyEvent);
                    }
                } else {
                    createPrivacyEvent.LLI.setCheckModes(C77275UUl.LJ(EnumC66158Pxq.SYNC));
                    return interfaceC66159Pxr2.actionIntercept(createPrivacyEvent);
                }
            } else {
                return new Pair<>(bool, null);
            }
        }
        return new Pair<>(Boolean.FALSE, null);
    }
}
