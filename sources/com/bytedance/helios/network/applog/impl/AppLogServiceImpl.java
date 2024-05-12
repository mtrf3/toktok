package com.bytedance.helios.network.applog.impl;

import X.C65301Pk1;
import X.C65302Pk2;
import X.C65926Pu6;
import X.E18;
import X.InterfaceC65784Pro;
import com.bytedance.helios.network.api.service.IAppLogService;
import com.ss.android.common.applog.AppLog;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AppLogServiceImpl implements IAppLogService {
    public static final C65302Pk2 Companion = new C65302Pk2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.E18] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.E18] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.E18] */
    @Override // com.bytedance.helios.network.api.service.IAppLogService
    public boolean addInterceptor(Object obj) {
        ?? r6;
        ?? r3;
        if (obj instanceof C65301Pk1) {
            return false;
        }
        InterfaceC65784Pro interfaceC65784Pro = null;
        if (obj != null) {
            try {
            } catch (Throwable th) {
                C65926Pu6.LIZ("Helios:Network-Service", interfaceC65784Pro, 6, th);
                r3 = interfaceC65784Pro;
            }
            if (obj instanceof E18) {
                r6 = (E18) obj;
                interfaceC65784Pro = r6;
                r3 = interfaceC65784Pro;
                AppLog.setSendLogCallback(new C65301Pk1(r3));
                return true;
            }
        }
        Field field = AppLog.class.getDeclaredField("sSendLogCallback");
        o.LJIIIIZZ(field, "field");
        field.setAccessible(true);
        r6 = (E18) field.get(null);
        interfaceC65784Pro = r6;
        r3 = interfaceC65784Pro;
        AppLog.setSendLogCallback(new C65301Pk1(r3));
        return true;
    }
}
