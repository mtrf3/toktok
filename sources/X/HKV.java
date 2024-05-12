package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AqS60S1100000_7;

/* loaded from: classes8.dex */
public final class HKV implements P5A {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ = 256;

    public HKV(AqS60S1100000_7 aqS60S1100000_7) {
        this.LIZ = aqS60S1100000_7;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer == null) {
            this.LIZ.invoke(null);
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            this.LIZ.invoke(HKU.LIZLLL(createBitmap, 0, this.LIZIZ));
        }
        return false;
    }
}
