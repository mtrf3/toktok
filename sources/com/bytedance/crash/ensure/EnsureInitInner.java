package com.bytedance.crash.ensure;

import X.C171096nZ;
import X.C78983UzD;
import X.PJY;
import X.PJZ;
import X.V1M;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes12.dex */
public final class EnsureInitInner {
    public static boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        try {
            IEnsure iEnsure = new IEnsure() { // from class: com.bytedance.crash.ensure.EnsureInitInner.1
                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere() {
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(null, "EnsureNotReachHere", null);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z) {
                    if (z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(null, "EnsureFalse", null);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotEmpty(Collection collection) {
                    if (collection != null && collection.size() != 0) {
                        return true;
                    }
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(null, "EnsureNotEmpty", null);
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj) {
                    if (obj != null) {
                        return true;
                    }
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(null, "EnsureNotNull", null);
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th) {
                    PJZ.LIZ.getClass();
                    if (!PJY.LIZIZ(th)) {
                        return;
                    }
                    V1M.LJJJ(th, null, true, null, "core_exception_monitor");
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z) {
                    if (!z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(null, "EnsureTrue", null);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th) {
                    ensureNotReachHere(th);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str) {
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(str, "EnsureNotReachHere", null);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str) {
                    if (z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(str, "EnsureFalse", null);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureNotNull(Object obj, String str) {
                    if (obj != null) {
                        return true;
                    }
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(str, "EnsureNotNull", null);
                    return false;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str) {
                    PJZ.LIZ.getClass();
                    if (!PJY.LIZIZ(th)) {
                        return;
                    }
                    V1M.LJJJ(th, str, true, null, "core_exception_monitor");
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str) {
                    if (!z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(str, "EnsureTrue", null);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(Throwable th, String str) {
                    ensureNotReachHere(th, str);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(String str, Map<String, String> map) {
                    PJZ.LIZ.getClass();
                    PJY.LIZJ(str, "EnsureNotReachHere", map);
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
                    if (z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(str, "EnsureFalse", map);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
                    PJZ.LIZ.getClass();
                    if (!PJY.LIZIZ(th)) {
                        return;
                    }
                    V1M.LJJJ(th, str, true, map, "core_exception_monitor");
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
                    if (!z) {
                        PJZ.LIZ.getClass();
                        PJY.LIZJ(str, "EnsureTrue", map);
                    }
                    return z;
                }

                @Override // com.bytedance.services.apm.api.IEnsure
                public void reportLogException(int i, Throwable th, String str) {
                    PJZ.LIZ.getClass();
                    if (!PJY.LIZIZ(th)) {
                        return;
                    }
                    V1M.LJJJ(th, str, false, null, "core_exception_monitor");
                }
            };
            C171096nZ.LIZ.put(IEnsure.class, iEnsure);
            C78983UzD.LJLLLL = iEnsure;
        } catch (Throwable unused) {
        }
    }
}
