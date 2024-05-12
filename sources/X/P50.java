package X;

import android.media.Image;
import android.media.ImageReader;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P50 implements ImageReader.OnImageAvailableListener {
    public int LJLIL;
    public final List<Long> LJLILLLLZI = new ArrayList();
    public final /* synthetic */ List[] LJLJI;
    public final /* synthetic */ P52 LJLJJI;

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        VEFrame createYUVPlanFrame;
        VEFrame vEFrame;
        try {
            synchronized (this.LJLJJI) {
                Image acquireNextImage = imageReader.acquireNextImage();
                long timestamp = acquireNextImage.getTimestamp() / 1000;
                if (this.LJLJI[this.LJLIL].contains(Long.valueOf(timestamp))) {
                    if (this.LJLJJI.LJII != null) {
                        if (acquireNextImage.getFormat() == 35) {
                            if (acquireNextImage.getPlanes() != null && acquireNextImage.getPlanes()[1].getPixelStride() > 1) {
                                P4M p4m = new P4M(acquireNextImage.getPlanes());
                                P52 p52 = this.LJLJJI;
                                VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(p4m, p52.LJIILL, p52.LJIILLIIL, p52.LJIILIIL, 0L, P6Z.TEPixFmt_NV12);
                                P52 p522 = this.LJLJJI;
                                if (p522.LJIIJ == null) {
                                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((p522.LJIILL * p522.LJIILLIIL) * 3) / 2);
                                    allocateDirect.clear();
                                    P52 p523 = this.LJLJJI;
                                    p523.LJIIJ = VEFrame.createByteBufferFrame(allocateDirect, p523.LJIILL, p523.LJIILLIIL, p523.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
                                }
                                TEImageUtils.LIZ(createYUVPlanFrame2, this.LJLJJI.LJIIJ, P4K.OP_CONVERT);
                                createYUVPlanFrame = this.LJLJJI.LJIIJ;
                            } else {
                                P4M p4m2 = new P4M(acquireNextImage.getPlanes());
                                P52 p524 = this.LJLJJI;
                                createYUVPlanFrame = VEFrame.createYUVPlanFrame(p4m2, p524.LJIILL, p524.LJIILLIIL, p524.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
                            }
                            VEFrame vEFrame2 = this.LJLJJI.LJIIIZ;
                            if (vEFrame2 != null) {
                                TEImageUtils.LIZ(createYUVPlanFrame, vEFrame2, P4K.OP_SCALE);
                            }
                            P52 p525 = this.LJLJJI;
                            if (p525.LJIILIIL != 0) {
                                vEFrame = p525.LJIIJJI;
                                TEImageUtils.LIZ(p525.LJIIIZ, vEFrame, P4K.OP_ROTATION);
                            } else {
                                vEFrame = p525.LJIIIZ;
                            }
                            TEImageUtils.LIZ(vEFrame, this.LJLJJI.LJIIIIZZ, P4K.OP_CONVERT);
                            ((VEFrame.ByteBufferFrame) this.LJLJJI.LJIIIIZZ.getFrame()).getByteBuffer().clear();
                        }
                        P52 p526 = this.LJLJJI;
                        p526.LIZIZ(((VEFrame.ByteBufferFrame) p526.LJIIIIZZ.getFrame()).getByteBuffer(), this.LJLJJI.LJIIIIZZ.getWidth(), this.LJLJJI.LJIIIIZZ.getHeight(), (int) (acquireNextImage.getTimestamp() / 1000000.0d));
                    }
                    ((ArrayList) this.LJLILLLLZI).add(Long.valueOf(timestamp));
                    if (this.LJLILLLLZI.containsAll(this.LJLJI[this.LJLIL])) {
                        ((ArrayList) this.LJLILLLLZI).clear();
                        this.LJLIL++;
                    }
                    this.LJLJJI.notify();
                }
                acquireNextImage.close();
            }
        } catch (Exception unused) {
            this.LJLJJI.LIZJ();
            this.LJLJJI.notify();
            this.LJLJJI.LIZLLL();
        } catch (OutOfMemoryError unused2) {
            Runtime.getRuntime().gc();
            this.LJLJJI.LIZJ();
            this.LJLJJI.notify();
            this.LJLJJI.LIZLLL();
        }
    }

    public P50(P52 p52, List[] listArr) {
        this.LJLJJI = p52;
        this.LJLJI = listArr;
    }
}
