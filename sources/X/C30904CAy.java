package X;

import com.bytedance.android.livesdk.livesetting.hybrid.SparkDynamicParam;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CAy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30904CAy {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(SparkContext sparkContext, String str, SparkDynamicParam[] sparkDynamicParamArr) {
        if (sparkDynamicParamArr != null) {
            for (SparkDynamicParam sparkDynamicParam : sparkDynamicParamArr) {
                for (String str2 : sparkDynamicParam.patternList) {
                    if (o.LJ(str2, "*") || s.LJJJLZIJ(str, str2, false)) {
                        String str3 = sparkDynamicParam.paramKey;
                        String str4 = sparkDynamicParam.paramValue;
                        if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0) {
                            sparkContext.LJJIIJ(str3, str4);
                        }
                    }
                }
            }
        }
    }
}
