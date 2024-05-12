package X;

import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P57 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final P5A LIZLLL;
    public final Object LJ;
    public boolean LJFF;

    public P57(int i, int i2, int i3, int i4, P59 p59) {
        long id = C16880lQ.LLLLIIIILLL().getId();
        this.LIZ = "HwFrameExtractorRange_";
        this.LJ = new Object();
        this.LJFF = false;
        this.LIZ = C00F.LIZJ("HwFrameExtractorRange_", i4, "_", id);
        Math.max(i, 0);
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = p59;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
            allocateDirect.clear();
            VEFrame.createByteBufferFrame(allocateDirect, i2, i3, 0, 0L, P6Z.TEPixFmt_ARGB8);
        } catch (OutOfMemoryError unused) {
            P4Q.LJII(this.LIZ, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.LIZIZ * this.LIZJ * 4);
                allocateDirect2.clear();
                VEFrame.createByteBufferFrame(allocateDirect2, this.LIZIZ, this.LIZJ, 0, 0L, P6Z.TEPixFmt_ARGB8);
            } catch (Exception unused2) {
                if (this.LJFF) {
                    return;
                }
                Q4K.LJ("processFrameLast begin hasProcessCount:", 0, this.LIZ);
                if (this.LIZLLL.processFrame(null, this.LIZIZ, this.LIZJ, 0)) {
                    return;
                }
                Q4K.LJ("processFrameLast stop hasProcxessCount:", 0, this.LIZ);
            }
        }
    }
}
