package com.bytedance.sysoptimizer.java;

import X.C16880lQ;
import android.content.Context;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class IConnectivityManagerProtector {
    public static final List<String> PROTECTED_METHODS = Arrays.asList("getNetworkCapabilities", "getAllNetworks", "getLinkProperties", "getLinkPropertiesForType");
    public static boolean sIsInit;

    public static void install(Context context) {
        if (sIsInit || context == null) {
            return;
        }
        sIsInit = BinderServiceWrapperProtector.install(C16880lQ.LLLLL(context), "connectivity", PROTECTED_METHODS, "ICMP", new BinderServiceWrapperProtector.AdminResult() { // from class: com.bytedance.sysoptimizer.java.IConnectivityManagerProtector.1
            @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
            public Object getDefaultResult(Object obj, Method method, Object[] objArr) {
                String name = method.getName();
                if ("getNetworkCapabilities".equals(name) || "getAllNetworks".equals(name) || "getLinkProperties".equals(name)) {
                    return null;
                }
                return new Object();
            }
        });
    }
}
