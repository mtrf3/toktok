package com.ss.android.ttve.common;

import X.C16880lQ;
import X.FWO;
import X.P4K;
import com.ss.android.ttve.model.VEFrame;

/* loaded from: classes12.dex */
public class TEImageUtils {
    public static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        FWO.LIZJ();
        C16880lQ.LJLLJ(TEImageUtils.class);
    }

    public static void LIZ(VEFrame vEFrame, VEFrame vEFrame2, P4K p4k) {
        nativeConvertFrame(vEFrame, vEFrame2, p4k.ordinal());
    }
}
