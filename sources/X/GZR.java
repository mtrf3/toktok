package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class GZR implements P5A {
    public final /* synthetic */ InterfaceC65052gv<Bitmap> LIZ;

    public GZR(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
        if (!createBitmap.isRecycled()) {
            ((C73578SuE) this.LIZ).onSuccess(createBitmap);
            return false;
        }
        ((C73578SuE) this.LIZ).tryOnError(new NullPointerException());
        return false;
    }
}
