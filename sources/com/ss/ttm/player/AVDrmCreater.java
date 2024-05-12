package com.ss.ttm.player;

import X.C16880lQ;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* loaded from: classes3.dex */
public class AVDrmCreater {
    public static synchronized long createDrm(int i) {
        synchronized (AVDrmCreater.class) {
            long j = 0;
            if (i != 1) {
                return 0L;
            }
            try {
                j = CastLongProtector.parseLong(String.valueOf(Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrm").getMethod("createDrm", new Class[0]).invoke(null, new Object[0])));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return j;
        }
    }
}
