package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.FWx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39119FWx {
    public final Context LIZ;
    public java.util.Map<String, String> LIZIZ;

    public C39119FWx(Context context) {
        this.LIZ = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap] */
    public final InterfaceC67474Qdy LIZ(String str) {
        ?? r7;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (this.LIZIZ == null) {
            Context context = this.LIZ;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) != null) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null) {
                    r7 = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object LLJJIII = C16880lQ.LLJJIII(bundle, str2);
                        if ((LLJJIII instanceof String) && str2.startsWith("backend:")) {
                            String[] split = ((String) LLJJIII).split(",", -1);
                            for (String str3 : split) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    r7.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    this.LIZIZ = r7;
                }
            }
            r7 = Collections.emptyMap();
            this.LIZIZ = r7;
        }
        String str4 = this.LIZIZ.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (InterfaceC67474Qdy) Class.forName(str4).asSubclass(InterfaceC67474Qdy.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }
}
