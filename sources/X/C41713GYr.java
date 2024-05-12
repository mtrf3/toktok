package X;

import Y.ACallableS84S0200000_7;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: X.GYr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41713GYr implements P5A {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C41713GYr(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer == null) {
            this.LIZ.invoke(null);
            return false;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        C10K.LIZIZ(new ACallableS84S0200000_7(this.LIZ, createBitmap, 7), C10K.LJIIIIZZ, null);
        return false;
    }
}
