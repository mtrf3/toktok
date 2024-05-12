package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;

/* loaded from: classes11.dex */
public final class NGQ {
    public static /* synthetic */ AdSparkContext LIZ(IAdSparkUtils iAdSparkUtils, Context context, String str, Bundle bundle, boolean z, int i) {
        boolean z2 = z;
        String str2 = str;
        Bundle bundle2 = bundle;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bundle2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return iAdSparkUtils.LJ(context, str2, bundle2, null, z2);
    }
}
