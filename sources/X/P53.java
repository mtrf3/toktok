package X;

import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.HandlerThread;
import com.ss.android.ttve.model.VEFrame;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P53 {
    public static String LJIL;
    public static String LJJ;
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
    public int LJIILJJIL;
    public int LJIILL;
    public HandlerThread LJIILLIIL;
    public HandlerThread LJIIZILJ;
    public ImageReader LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;

    public final void LIZJ() {
        this.LJIJJ = true;
        String str = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("processFrameLast begin hasProcessCount:");
        LIZ.append(this.LJIJI);
        LIZ.append(" ptsMsLength: ");
        C01R.LIZJ(LIZ, this.LIZLLL.length, LIZ, str);
        while (this.LJIJI < this.LIZLLL.length * this.LJI) {
            String str2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("processFrameLast processing hasProcxessCount:");
            LIZ2.append(this.LJIJI);
            LIZ2.append(" ptsMsLength: ");
            C01R.LIZJ(LIZ2, this.LIZLLL.length, LIZ2, str2);
            if (!this.LJII.processFrame(null, this.LJ, this.LJFF, 0)) {
                String str3 = this.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("processFrameLast stop hasProcxessCount:");
                LIZ3.append(this.LJIJI);
                LIZ3.append(" ptsMsLength: ");
                C01R.LIZJ(LIZ3, this.LIZLLL.length, LIZ3, str3);
                return;
            }
            this.LJIJI += this.LJI;
        }
    }

    public static void LJ() {
        if (LJIL == null || LJJ == null) {
            String lowerCase = C47697Inl.LIZ().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                LJIL = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    LJJ = "sdm660";
                    return;
                }
                if (lowerCase.contains("msm8994")) {
                    LJJ = "msm8994";
                    return;
                }
                if (lowerCase.contains("sdm845")) {
                    LJJ = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    LJJ = "sm8150";
                } else {
                    LJJ = "";
                }
            }
        }
    }

    public final void LIZ() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.LJ * this.LJFF * 4);
        allocateDirect.clear();
        this.LJIIIIZZ = VEFrame.createByteBufferFrame(allocateDirect, this.LJ, this.LJFF, 0, 0L, P6Z.TEPixFmt_ARGB8);
    }

    public final void LIZLLL() {
        try {
            P4Q.LJFF(this.LIZIZ, "stop begin");
            if (this.LJIJ != null) {
                this.LJIIL.reset();
                this.LJIIL.release();
            }
            ImageReader imageReader = this.LJIJ;
            if (imageReader != null) {
                imageReader.close();
            }
            HandlerThread handlerThread = this.LJIIZILJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            HandlerThread handlerThread2 = this.LJIILLIIL;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
        } catch (Exception unused) {
            P4Q.LJFF(this.LIZIZ, "stop crash");
            LIZJ();
        }
    }

    public final void LIZIZ(ByteBuffer byteBuffer, int i, int i2, int i3) {
        String str = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("processFrame right begin hasProcxessCount:");
        LIZ.append(this.LJIJI);
        LIZ.append(" ptsMsLength: ");
        C01R.LIZJ(LIZ, this.LIZLLL.length, LIZ, str);
        if (this.LJIJI < this.LIZLLL.length * this.LJI && !this.LJIJJ) {
            String str2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("processFrame right process hasProcxessCount:");
            LIZ2.append(this.LJIJI);
            LIZ2.append(" ptsMsLength: ");
            C15890jp.LIZIZ(LIZ2, this.LIZLLL.length, " width ", i, " height ");
            LIZ2.append(i2);
            LIZ2.append("ptsMs:");
            LIZ2.append(i3);
            P4Q.LJFF(str2, X1D.LIZIZ(LIZ2));
            if (!this.LJII.processFrame(byteBuffer, i, i2, i3)) {
                String str3 = this.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("processFrame right stop hasProcxessCount:");
                LIZ3.append(this.LJIJI);
                LIZ3.append(" ptsMsLength: ");
                C01R.LIZJ(LIZ3, this.LIZLLL.length, LIZ3, str3);
                this.LJIJJ = true;
                LIZLLL();
            }
            this.LJIJI++;
        }
    }

    public P53(String str, int[] iArr, int i, int i2, int i3, int i4, P56 p56) {
        long id = C16880lQ.LLLLIIIILLL().getId();
        this.LIZ = id;
        this.LIZIZ = "HwFrameExtractor_";
        this.LJIIL = null;
        this.LJIJI = 0;
        this.LJIJJ = false;
        this.LJIJJLI = false;
        this.LIZIZ = C00F.LIZJ("HwFrameExtractor_", i4, "_", id);
        this.LIZJ = str;
        this.LIZLLL = iArr;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = p56;
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
