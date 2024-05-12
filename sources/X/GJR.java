package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes8.dex */
public final class GJR {
    public static /* synthetic */ void LIZ(GJQ gjq, Activity activity, VideoPublishEditModel videoPublishEditModel, int i, boolean z, boolean z2, AqS173S0100000_7 aqS173S0100000_7, Bundle bundle, int i2) {
        AqS173S0100000_7 aqS173S0100000_72 = aqS173S0100000_7;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        }
        Bundle bundle2 = null;
        if ((i2 & 32) != 0) {
            aqS173S0100000_72 = null;
        }
        if ((i2 & 64) == 0) {
            bundle2 = bundle;
        }
        gjq.LIZ(activity, videoPublishEditModel, z3, z4, aqS173S0100000_72, bundle2);
    }
}
