package X;

import android.media.Image;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes19.dex */
public final class ZUG extends AbstractC89987ZTj {
    public final LinkedBlockingQueue<Integer> LJIJI = new LinkedBlockingQueue<>();

    @Override // X.AbstractC89987ZTj
    public final void LIZ() {
        C89983ZTf c89983ZTf = new C89983ZTf(this);
        if (Build.VERSION.SDK_INT > 23) {
            this.LIZIZ.setCallback(c89983ZTf, this.LJI);
        } else {
            this.LIZIZ.setCallback(c89983ZTf);
        }
    }

    @Override // X.AbstractC89987ZTj
    public final void LJIIIZ() {
        LJII();
        this.LJIJI.clear();
    }

    @Override // X.AbstractC89987ZTj
    public final int LIZJ(C89989ZTl c89989ZTl) {
        byte[] bArr;
        if (this.LJIJI.isEmpty()) {
            return -605;
        }
        int intValue = this.LJIJI.poll().intValue();
        if (this.LJIIZILJ != EnumC89986ZTi.STARTED) {
            return -607;
        }
        if (c89989ZTl.LIZ()) {
            if (this.LIZ.getInputColorFormat() == 2135033992) {
                Image inputImage = this.LIZIZ.getInputImage(intValue);
                if (inputImage != null && inputImage.getPlanes()[1].getPixelStride() == 2) {
                    bArr = new byte[c89989ZTl.LIZIZ.length];
                    int i = 0;
                    for (int i2 = 0; i2 < this.LIZ.getHeight(); i2++) {
                        for (int i3 = 0; i3 < this.LIZ.getWidth(); i3++) {
                            bArr[i] = c89989ZTl.LIZIZ[(this.LIZ.getWidth() * i2) + i3];
                            i++;
                        }
                    }
                    for (int i4 = 0; i4 < this.LIZ.getHeight() / 4; i4++) {
                        for (int i5 = 0; i5 < this.LIZ.getWidth(); i5++) {
                            int width = (this.LIZ.getWidth() * this.LIZ.getHeight()) + (this.LIZ.getWidth() * i4) + i5;
                            byte[] bArr2 = c89989ZTl.LIZIZ;
                            bArr[i] = bArr2[width];
                            bArr[i + 1] = bArr2[width + ((this.LIZ.getWidth() * this.LIZ.getHeight()) / 4)];
                            i += 2;
                        }
                    }
                } else {
                    bArr = c89989ZTl.LIZIZ;
                }
            } else {
                bArr = c89989ZTl.LIZIZ;
            }
            ByteBuffer inputBuffer = this.LIZIZ.getInputBuffer(intValue);
            inputBuffer.clear();
            inputBuffer.put(bArr);
            inputBuffer.position(0);
            inputBuffer.limit(bArr.length);
            this.LIZIZ.queueInputBuffer(intValue, 0, c89989ZTl.LIZIZ.length, c89989ZTl.LIZLLL, 0);
        } else if (c89989ZTl.LJI) {
            C47261Igj.LJJIIJ("BXMediaCodecEncoder");
            this.LIZIZ.queueInputBuffer(intValue, 0, 0, c89989ZTl.LIZLLL, 4);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid input frame: ");
            LIZ.append(c89989ZTl);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXMediaCodecEncoder");
            return -100;
        }
        return 0;
    }
}
