package X;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P52 {
    public static String LJJII;
    public static String LJJIII;
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int[] LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final P5A LJII;
    public VEFrame LJIIIIZZ;
    public VEFrame LJIIIZ;
    public VEFrame LJIIJ;
    public VEFrame LJIIJJI;
    public MediaCodec LJIIL;
    public int LJIILIIL;
    public final Object LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public HandlerThread LJIIZILJ;
    public HandlerThread LJIJ;
    public ImageReader LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;

    public static void LJ() {
        if (LJJII == null || LJJIII == null) {
            String lowerCase = C47697Inl.LIZ().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                LJJII = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    LJJIII = "sdm660";
                    return;
                }
                if (lowerCase.contains("msm8994")) {
                    LJJIII = "msm8994";
                    return;
                }
                if (lowerCase.contains("sdm845")) {
                    LJJIII = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    LJJIII = "sm8150";
                } else {
                    LJJIII = "";
                }
            }
        }
    }

    public final void LIZ() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.LJ * this.LJFF * 4);
        allocateDirect.clear();
        this.LJIIIIZZ = VEFrame.createByteBufferFrame(allocateDirect, this.LJ, this.LJFF, 0, 0L, P6Z.TEPixFmt_ARGB8);
    }

    public final void LIZJ() {
        if (this.LJIJJLI) {
            return;
        }
        while (this.LJIJJ < this.LIZLLL.length * this.LJI) {
            String str = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("processFrameLast processing hasProcxessCount:");
            LIZ.append(this.LJIJJ);
            LIZ.append(" ptsMsLength: ");
            C01R.LIZJ(LIZ, this.LIZLLL.length, LIZ, str);
            if (!this.LJII.processFrame(null, this.LJ, this.LJFF, 0)) {
                String str2 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("processFrameLast stop hasProcxessCount:");
                LIZ2.append(this.LJIJJ);
                LIZ2.append(" ptsMsLength: ");
                C01R.LIZJ(LIZ2, this.LIZLLL.length, LIZ2, str2);
                return;
            }
            this.LJIJJ++;
        }
    }

    public final void LIZLLL() {
        try {
            P4Q.LJFF(this.LIZIZ, "stop begin");
            if (this.LJIJJLI) {
                return;
            }
            this.LJIJJLI = true;
            if (this.LJIJI != null) {
                this.LJIIL.reset();
                this.LJIIL.release();
            }
            ImageReader imageReader = this.LJIJI;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.LJIJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            P4Q.LJFF(this.LIZIZ, "stop end");
        } catch (Exception unused) {
            P4Q.LJFF(this.LIZIZ, "stop crash");
            LIZJ();
        }
    }

    public final void LIZIZ(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (this.LJIJJ < this.LIZLLL.length * this.LJI && !this.LJIJJLI) {
            if (!this.LJII.processFrame(byteBuffer, i, i2, i3)) {
                String str = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("processFrame right stop hasProcxessCount:");
                LIZ.append(this.LJIJJ);
                LIZ.append(" ptsMsLength: ");
                LIZ.append(this.LIZLLL.length);
                P4Q.LJFF(str, X1D.LIZIZ(LIZ));
                LIZLLL();
            }
            this.LJIJJ++;
        }
    }

    public P52(String str, int[] iArr, int i, int i2, int i3, int i4, P58 p58) {
        long id = C16880lQ.LLLLIIIILLL().getId();
        this.LIZ = id;
        this.LIZIZ = "HwFrameExtractor2_";
        this.LJIIL = null;
        this.LJIILJJIL = new Object();
        this.LJIJJ = 0;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = false;
        this.LIZIZ = C00F.LIZJ("HwFrameExtractor2_", i4, "_", id);
        this.LIZJ = str;
        this.LIZLLL = iArr;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = p58;
        try {
            LIZ();
        } catch (OutOfMemoryError unused) {
            P4Q.LJII(this.LIZIZ, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                LIZ();
            } catch (Exception unused2) {
                LIZJ();
                return;
            }
        }
        this.LIZLLL = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.LIZLLL[i5] = iArr[i5] * 1000;
            String str2 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ptsMS: ");
            LIZ.append(this.LIZLLL[i5]);
            P4Q.LJFF(str2, X1D.LIZIZ(LIZ));
        }
    }
}
