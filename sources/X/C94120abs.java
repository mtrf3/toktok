package X;

import com.google.ar.core.ArImage;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* renamed from: X.abs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94120abs extends AbstractC93402aQI {
    public final long LIZ;
    public final int LIZIZ;
    public final /* synthetic */ ArImage LIZJ;

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.LIZJ;
        return arImage.nativeGetBuffer(arImage.session.nativeWrapperHandle, this.LIZ, this.LIZIZ).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.LIZJ;
        int nativeGetPixelStride = arImage.nativeGetPixelStride(arImage.session.nativeWrapperHandle, this.LIZ, this.LIZIZ);
        if (nativeGetPixelStride != -1) {
            return nativeGetPixelStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.LIZJ;
        int nativeGetRowStride = arImage.nativeGetRowStride(arImage.session.nativeWrapperHandle, this.LIZ, this.LIZIZ);
        if (nativeGetRowStride != -1) {
            return nativeGetRowStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }

    public C94120abs(ArImage arImage, long j, int i) {
        this.LIZJ = arImage;
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
