package X;

import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.LinkedHashMap;

/* renamed from: X.NvV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60917NvV {
    public static final void LIZ(android.net.Uri uri, SparkSchemaParam sparkSchemaParam, java.util.Map map) {
        String str = (String) ((LinkedHashMap) map).get("container_bgcolor");
        if (str != null) {
            sparkSchemaParam.setContainerBgColor(C60906NvK.LIZLLL("container_bgcolor", str, map, uri));
        }
    }
}
