package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTV {
    public static final java.util.Map<String, UTW> LIZ;

    static {
        if (!UTU.LJ) {
            UTU.LIZIZ = UTU.LIZ();
            UTU.LJ = true;
        }
        new UTW(UTU.LIZIZ, 4);
        LIZ = new LinkedHashMap();
        try {
            SpringApiLimitConfig springApiLimitConfig = C2YJ.LIZIZ.LIZ.getSpringApiLimitConfig();
            o.LJIIIIZZ(springApiLimitConfig, "get().springApiLimitConfig");
            List<ApiConfigEntity> configList = springApiLimitConfig.getConfigList();
            if (configList != null) {
                for (ApiConfigEntity apiConfigEntity : configList) {
                    java.util.Map<String, UTW> map = LIZ;
                    String apiName = apiConfigEntity.getApiName();
                    o.LJIIIIZZ(apiName, "it.apiName");
                    Boolean isBanned = apiConfigEntity.getIsBanned();
                    o.LJIIIIZZ(isBanned, "it.isBanned");
                    boolean booleanValue = isBanned.booleanValue();
                    Long delayTime = apiConfigEntity.getDelayTime();
                    o.LJIIIIZZ(delayTime, "it.delayTime");
                    long longValue = delayTime.longValue();
                    String apiName2 = apiConfigEntity.getApiName();
                    o.LJIIIIZZ(apiName2, "it.apiName");
                    map.put(apiName, new UTW(longValue, apiName2, booleanValue));
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
