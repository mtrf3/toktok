package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22390uJ {
    public static InterfaceC22380uI LIZ(Context context) {
        String string;
        o.LJIIIZ(context, "context");
        PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = LLLLLLZ.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List LLJI = ORZ.LLJI(arrayList);
        if (LLJI.isEmpty()) {
            return null;
        }
        Iterator it = LLJI.iterator();
        InterfaceC22380uI interfaceC22380uI = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                o.LJII(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC22380uI interfaceC22380uI2 = (InterfaceC22380uI) newInstance;
                if (!interfaceC22380uI2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC22380uI != null) {
                        return null;
                    }
                    interfaceC22380uI = interfaceC22380uI2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC22380uI;
    }
}
