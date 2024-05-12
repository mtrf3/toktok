package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: X.GYq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41712GYq implements P5A {
    public final /* synthetic */ C3CK<GYE> LIZ;
    public final /* synthetic */ GYE LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C41712GYq(C3CK<? super GYE> c3ck, GYE gye) {
        this.LIZ = c3ck;
        this.LIZIZ = gye;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("calculateBackgroundColor extract frame finish,width:");
        LIZ.append(i);
        LIZ.append(",height:");
        LIZ.append(i2);
        C41700GYe.LJI(X1D.LIZIZ(LIZ));
        Bitmap frameBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (byteBuffer != null) {
            frameBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        }
        C57730MlC c57730MlC = new C57730MlC();
        o.LJIIIIZZ(frameBitmap, "frameBitmap");
        OSZ<Integer, Integer> LIZIZ = c57730MlC.LIZIZ(frameBitmap);
        frameBitmap.recycle();
        C3CK<GYE> c3ck = this.LIZ;
        GYE gye = this.LIZIZ;
        C142615ij c142615ij = CanvasBackground.Companion;
        int LJ = C41700GYe.LJ(LIZIZ.getFirst().intValue());
        int LJ2 = C41700GYe.LJ(LIZIZ.getSecond().intValue());
        c142615ij.getClass();
        C41700GYe.LJIIIZ(c3ck, GYE.LIZ(gye, C142615ij.LIZIZ(LJ, LJ2)));
        return true;
    }
}
