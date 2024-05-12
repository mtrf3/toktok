package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.o;

/* renamed from: X.1QY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QY implements InterfaceC11660d0 {
    public final PathMeasure LIZ;

    @Override // X.InterfaceC11660d0
    public final float getLength() {
        return this.LIZ.getLength();
    }

    public C1QY(PathMeasure pathMeasure) {
        this.LIZ = pathMeasure;
    }

    @Override // X.InterfaceC11660d0
    public final void LIZIZ(InterfaceC11610cv interfaceC11610cv) {
        Path path;
        PathMeasure pathMeasure = this.LIZ;
        if (interfaceC11610cv != null) {
            if (interfaceC11610cv instanceof C1QX) {
                path = ((C1QX) interfaceC11610cv).LIZIZ;
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
    }

    @Override // X.InterfaceC11660d0
    public final boolean LIZ(float f, float f2, InterfaceC11610cv destination) {
        o.LJIIIZ(destination, "destination");
        PathMeasure pathMeasure = this.LIZ;
        if (destination instanceof C1QX) {
            return pathMeasure.getSegment(f, f2, ((C1QX) destination).LIZIZ, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
