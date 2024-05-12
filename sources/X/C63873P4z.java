package X;

import android.media.Image;
import android.media.ImageReader;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P4z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63873P4z implements ImageReader.OnImageAvailableListener {
    public int LJLIL;
    public final List<Long> LJLILLLLZI = new ArrayList();
    public final /* synthetic */ List[] LJLJI;
    public final /* synthetic */ P53 LJLJJI;

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
                                P53 p53 = this.LJLJJI;
                                createYUVPlanFrame = VEFrame.createYUVPlanFrame(p4m, p53.LJIILJJIL, p53.LJIILL, p53.LJIILIIL, 0L, P6Z.TEPixFmt_NV12);
                                P53 p532 = this.LJLJJI;
                                if (p532.LJIIJ == null) {
                                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((p532.LJIILJJIL * p532.LJIILL) * 3) / 2);
                                    allocateDirect.clear();
                                    P53 p533 = this.LJLJJI;
                                    p533.LJIIJ = VEFrame.createByteBufferFrame(allocateDirect, p533.LJIILJJIL, p533.LJIILL, p533.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
                                    TEImageUtils.LIZ(createYUVPlanFrame, this.LJLJJI.LJIIJ, P4K.OP_CONVERT);
                                    createYUVPlanFrame = this.LJLJJI.LJIIJ;
                                }
                            } else {
                                P4M p4m2 = new P4M(acquireNextImage.getPlanes());
                                P53 p534 = this.LJLJJI;
                                createYUVPlanFrame = VEFrame.createYUVPlanFrame(p4m2, p534.LJIILJJIL, p534.LJIILL, p534.LJIILIIL, 0L, P6Z.TEPixFmt_YUV420P);
                            }
                            VEFrame vEFrame2 = this.LJLJJI.LJIIIZ;
                            if (vEFrame2 != null) {
                                TEImageUtils.LIZ(createYUVPlanFrame, vEFrame2, P4K.OP_SCALE);
                            }
                            P53 p535 = this.LJLJJI;
                            if (p535.LJIILIIL != 0) {
                                vEFrame = p535.LJIIJJI;
                                TEImageUtils.LIZ(p535.LJIIIZ, vEFrame, P4K.OP_ROTATION);
                            } else {
                                vEFrame = p535.LJIIIZ;
                            }
                            TEImageUtils.LIZ(vEFrame, this.LJLJJI.LJIIIIZZ, P4K.OP_CONVERT);
                            ((VEFrame.ByteBufferFrame) this.LJLJJI.LJIIIIZZ.getFrame()).getByteBuffer().clear();
                        }
                        P53 p536 = this.LJLJJI;
                        p536.LIZIZ(((VEFrame.ByteBufferFrame) p536.LJIIIIZZ.getFrame()).getByteBuffer(), this.LJLJJI.LJIIIIZZ.getWidth(), this.LJLJJI.LJIIIIZZ.getHeight(), (int) (acquireNextImage.getTimestamp() / 1000000.0d));
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

    public C63873P4z(P53 p53, List[] listArr) {
        this.LJLJJI = p53;
        this.LJLJI = listArr;
    }
}
