package com.ss.android.ttve.model;

import X.EnumC46487IMh;
import X.P4Q;
import X.X1D;
import android.opengl.EGLContext;

/* loaded from: classes12.dex */
public class VERenderContext {
    public EGLContext eglContext;
    public EnumC46487IMh envType;

    public EGLContext getEGLContext() {
        if (this.envType == EnumC46487IMh.VE_RENDER_ENV_OPENGL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getEGLContext ");
            LIZ.append(this.eglContext);
            LIZ.append(", current env type ");
            LIZ.append(this.envType);
            P4Q.LIZ("VERenderContext", X1D.LIZIZ(LIZ));
            return this.eglContext;
        }
        return null;
    }

    public VERenderContext() {
        this.envType = EnumC46487IMh.VE_RENDER_ENV_OPENGL;
    }

    public EnumC46487IMh getCurrentEnvType() {
        return this.envType;
    }
}
