package X;

import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes12.dex */
public final class P7U implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ YQ8 LJLIL;

    public P7U(YQ8 yq8) {
        this.LJLIL = yq8;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        TotalCaptureResult totalCaptureResult;
        Image acquireNextImage = imageReader.acquireNextImage();
        if (this.LJLIL.LJJLIIIJILLIZJL) {
            int i = 0;
            this.LJLIL.LJJLIIIJILLIZJL = false;
            if (acquireNextImage != null) {
                long timestamp = acquireNextImage.getTimestamp();
                TotalCaptureResult[] totalCaptureResultArr = this.LJLIL.LJJLIIIIJ;
                int length = totalCaptureResultArr.length;
                while (true) {
                    if (i < length) {
                        totalCaptureResult = totalCaptureResultArr[i];
                        Long l = (Long) totalCaptureResult.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                        if (l != null && timestamp >= l.longValue()) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        totalCaptureResult = null;
                        break;
                    }
                }
                this.LJLIL.LJJL(acquireNextImage, totalCaptureResult);
            } else {
                this.LJLIL.LJJJZ(-1000, new Exception("no image data"));
                return;
            }
        } else if (acquireNextImage == null) {
            return;
        }
        acquireNextImage.close();
    }
}
