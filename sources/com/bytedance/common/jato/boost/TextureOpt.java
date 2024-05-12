package com.bytedance.common.jato.boost;

import X.C1B6;
import X.C48693J9d;

/* loaded from: classes7.dex */
public class TextureOpt {
    public static native int nativeUnblockJNISurfaceTexture();

    public static void LIZ() {
        if (!C48693J9d.LJFF() || C1B6.LIZIZ("/data/local/tmp/disable_sf_opt")) {
            return;
        }
        nativeUnblockJNISurfaceTexture();
    }
}
