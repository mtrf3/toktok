package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS12S0101000_8;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class P6F extends P6G implements P6Q {
    public VECameraSettings LJLJI;
    public VESize LJLJJI = new VESize(1280, 720);
    public int LJLJJL = 0;
    public HandlerThread LJLJJLL;
    public Handler LJLJL;
    public byte[] LJLJLJ;
    public int LJLJLLL;
    public int LJLL;

    @Override // X.P6Q
    public final void LJIIIIZZ(int i) {
    }

    public final synchronized int LJIL() {
        if (this.LJLILLLLZI) {
            return -2;
        }
        if (this.LJLJJLL == null) {
            HandlerThread handlerThread = new HandlerThread("VEMockCapture");
            this.LJLJJLL = handlerThread;
            handlerThread.start();
            this.LJLJL = new Handler(this.LJLJJLL.getLooper());
        }
        this.LJLILLLLZI = true;
        this.LJLJL.post(new ARunnableS12S0101000_8(3, this, 1));
        return 0;
    }

    public final synchronized void LJJ() {
        this.LJLILLLLZI = false;
        Handler handler = this.LJLJL;
        if (handler != null) {
            handler.removeCallbacks(new ARunnableS11S0101000_7(4, this, 3));
            this.LJLJL = null;
        }
        HandlerThread handlerThread = this.LJLJJLL;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LJLJJLL = null;
        }
    }

    @Override // X.P6Q
    public final VESize LJI() {
        return this.LJLJJI;
    }

    @Override // X.P6Q
    public final VECameraSettings LLJJJJLIIL() {
        return this.LJLJI;
    }

    public static void LJIJJ(P6F p6f) {
        P6E p6e;
        synchronized (p6f) {
            if (p6f.LJLILLLLZI) {
                p6f.LJLJL.postDelayed(new HZD(6, p6f), 1000 / p6f.LJLJJL);
            }
            for (int i = 0; i < p6f.LJLIL.LIZJ().size(); i++) {
                P6O p6o = (P6O) ListProtector.get(p6f.LJLIL.LIZJ(), i);
                if (p6o instanceof P6P) {
                    int i2 = ((P6P) p6o).LJI;
                    P63 p63 = p6o.LIZJ;
                    if (p63 != null) {
                        if (p6f.LJLJLJ != null) {
                            p6e = new P6E(p6f.LJLL, p6f.LJLJLLL, System.nanoTime());
                            p6e.LJ = false;
                            p6e.LJFF = true;
                            p6e.LJ(p6f.LJLJLJ, 0, EnumC63901P6b.PIXEL_FORMAT_ARGB8, 0);
                            p6f.LJLJI.setOutPutMode(VECameraSettings.CAMERA_OUTPUT_MODE.FRAME);
                        } else {
                            VESize vESize = p6f.LJLJJI;
                            p6e = new P6E(vESize.width, vESize.height, System.nanoTime());
                            p6e.LJ = false;
                            p6e.LJFF = true;
                            p6e.LJFF(i2, 0, null, EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES, 0);
                        }
                        p63.onFrameCaptured(p6e);
                    }
                }
            }
        }
    }

    @Override // X.P6Q
    public final int LJIILLIIL(C169706lK<P6O> c169706lK) {
        synchronized (this) {
            this.LJLIL.LIZIZ();
            for (int i = 0; i < c169706lK.LIZJ().size(); i++) {
                this.LJLIL.LIZ(c169706lK.LIZJ().get(i));
            }
        }
        return LJIL();
    }

    public final void LJIJJLI(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile == null) {
            P4Q.LIZJ("VEMockCapture", "bitmap is null!!!");
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(decodeFile.getByteCount());
        decodeFile.copyPixelsToBuffer(allocate);
        this.LJLJLJ = allocate.array();
        this.LJLJLLL = options.outHeight;
        this.LJLL = options.outWidth;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setImage width is ");
        LIZ.append(this.LJLL);
        LIZ.append(" , height is ");
        LIZ.append(this.LJLJLLL);
        P4Q.LIZ("VEMockCapture", X1D.LIZIZ(LIZ));
        decodeFile.recycle();
    }
}
