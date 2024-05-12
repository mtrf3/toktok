package X;

import android.media.Image;
import com.ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P6V {
    public final ImageFrame LIZ;

    public P6V(ImageFrame imageFrame) {
        this.LIZ = imageFrame;
    }

    public final void LIZ(int[][] iArr, ByteBuffer[] byteBufferArr) {
        Image.Plane[] planeArr;
        P6X plane = this.LIZ.getPlane();
        if (plane == null || (planeArr = plane.LIZ) == null) {
            return;
        }
        for (int i = 0; i < planeArr.length; i++) {
            ByteBuffer buffer = planeArr[i].getBuffer();
            byteBufferArr[i] = buffer;
            int remaining = buffer.remaining();
            int rowStride = planeArr[i].getRowStride();
            if (rowStride <= 0) {
                rowStride = this.LIZ.width;
                P4Q.LIZJ("PlanFrame", "rowStride <= 0");
            }
            int pixelStride = planeArr[i].getPixelStride();
            if (pixelStride <= 0) {
                P4Q.LIZJ("PlanFrame", "pixelStride <= 0");
                pixelStride = 1;
            }
            int[] iArr2 = new int[3];
            iArr2[0] = remaining;
            iArr2[1] = rowStride;
            iArr2[2] = pixelStride;
            iArr[i] = iArr2;
        }
    }
}
