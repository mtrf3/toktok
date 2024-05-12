package X;

import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.0ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12740ek {
    public final SurfaceTextureHelper LIZ;
    public GlRenderDrawer LIZIZ = null;
    public GlTextureFrameBuffer LIZJ = null;
    public int LIZLLL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12740ek)) {
            return false;
        }
        C12740ek c12740ek = (C12740ek) obj;
        return o.LJ(this.LIZ, c12740ek.LIZ) && o.LJ(this.LIZIZ, c12740ek.LIZIZ) && o.LJ(this.LIZJ, c12740ek.LIZJ) && this.LIZLLL == c12740ek.LIZLLL;
    }

    public final int hashCode() {
        SurfaceTextureHelper surfaceTextureHelper = this.LIZ;
        int hashCode = (surfaceTextureHelper == null ? 0 : surfaceTextureHelper.hashCode()) * 31;
        GlRenderDrawer glRenderDrawer = this.LIZIZ;
        int hashCode2 = (hashCode + (glRenderDrawer == null ? 0 : glRenderDrawer.hashCode())) * 31;
        GlTextureFrameBuffer glTextureFrameBuffer = this.LIZJ;
        return ((hashCode2 + (glTextureFrameBuffer != null ? glTextureFrameBuffer.hashCode() : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixHolder(surfaceTextureHelper=");
        LIZ.append(this.LIZ);
        LIZ.append(", drawer=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textureFrameBuffer=");
        LIZ.append(this.LIZJ);
        LIZ.append(", maskTextureId=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C12740ek(SurfaceTextureHelper surfaceTextureHelper) {
        this.LIZ = surfaceTextureHelper;
    }
}
