package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Parcel;
import com.bytedance.helios.api.consumer.ApmEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.PxK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66126PxK implements InterfaceC64482PSk {
    @Override // X.InterfaceC64482PSk
    public final java.util.Set<String> LIZIZ() {
        java.util.Set<String> keySet = C66074PwU.LIZIZ.keySet();
        o.LJIIIIZZ(keySet, "BinderConfigManager.mBinderMethodMap.keys");
        return keySet;
    }

    public C66126PxK(Context mContext) {
        o.LJIIIZ(mContext, "mContext");
        try {
            ProviderInfo[] providerInfoArr = C16880lQ.LLLLLLZ(mContext.getPackageManager(), mContext.getPackageName(), 8).providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    String str = providerInfo.authority;
                    if (str != null) {
                        ((HashMap) C66198PyU.LIZ).put(str, Boolean.valueOf(providerInfo.exported));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            C66063PwJ.LIZ("ProviderProcessor", "initProviderInfo: ", e);
        }
    }

    @Override // X.InterfaceC64482PSk
    public final boolean LIZ(String descriptor, Method method, Parcel data, Parcel parcel) {
        o.LJIIIZ(descriptor, "descriptor");
        o.LJIIIZ(data, "data");
        C66199PyV c66199PyV = C66199PyV.LIZJ;
        if (C66199PyV.LIZIZ.contains(descriptor)) {
            return c66199PyV.LIZ(descriptor, method, data, parcel);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return C66116PxA.LIZ(descriptor, method, data, parcel, null);
        } catch (Throwable th) {
            try {
                C66063PwJ.LIZ("DefaultInterceptor", "needIntercept exception: ", th);
                String substring = descriptor.substring(s.LJJLIIIJLLLLLLLZ(descriptor, '.', 0, 6) + 1);
                o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DefaultInterceptor_");
                LIZ.append(substring);
                LIZ.append('_');
                LIZ.append(method.getName());
                C66059PwF.LIZIZ(ApmEvent.LJ(System.currentTimeMillis() - currentTimeMillis, X1D.LIZIZ(LIZ)));
                return false;
            } finally {
                String substring2 = descriptor.substring(s.LJJLIIIJLLLLLLLZ(descriptor, '.', 0, 6) + 1);
                o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("DefaultInterceptor_");
                LIZ2.append(substring2);
                LIZ2.append('_');
                LIZ2.append(method.getName());
                C66059PwF.LIZIZ(ApmEvent.LJ(System.currentTimeMillis() - currentTimeMillis, X1D.LIZIZ(LIZ2)));
            }
        }
    }
}
