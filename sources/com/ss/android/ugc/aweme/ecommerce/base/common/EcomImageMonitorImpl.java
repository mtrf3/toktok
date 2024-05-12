package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C58096Mr6;
import X.C61830OOk;
import X.C61831OOl;
import X.W5O;
import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EcomImageMonitorImpl implements IEcomImageMonitor {
    public static IEcomImageMonitor LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IEcomImageMonitor.class, false);
        if (LIZ != null) {
            return (IEcomImageMonitor) LIZ;
        }
        if (C58096Mr6.H == null) {
            synchronized (IEcomImageMonitor.class) {
                if (C58096Mr6.H == null) {
                    C58096Mr6.H = new EcomImageMonitorImpl();
                }
            }
        }
        return C58096Mr6.H;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor
    public final void LIZ(boolean z, W5O w5o, long j, Map<String, ? extends Object> map, String str, Integer num, Integer num2) {
        JSONObject jSONObject;
        Long l;
        Integer num3;
        if (w5o == null) {
            return;
        }
        C61830OOk remove = C61831OOl.LIZLLL.remove(w5o);
        Uri uri = w5o.LIZIZ;
        o.LJIIIIZZ(uri, "request.sourceUri");
        String str2 = null;
        if (remove != null) {
            jSONObject = remove.LJLILLLLZI;
            l = Long.valueOf(remove.LJLJI);
            num3 = Integer.valueOf(remove.LJLJJI);
            str2 = remove.LJLJJL;
        } else {
            jSONObject = null;
            l = null;
            num3 = null;
        }
        C61831OOl.LIZ(uri, num3, num, num2, l, Long.valueOf(j), str2, str, map, jSONObject, z);
    }
}
