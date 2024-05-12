package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig;
import java.util.LinkedHashMap;

/* renamed from: X.DyJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35611DyJ {
    public static final java.util.Map<String, IDynamicResourceConfig<?>> LIZ = new LinkedHashMap();

    static {
        try {
            for (IDynamicResourceConfig<?> iDynamicResourceConfig : ServiceManager.get().getServices(IDynamicResourceConfig.class)) {
                LIZ.put(iDynamicResourceConfig.key(), iDynamicResourceConfig);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
