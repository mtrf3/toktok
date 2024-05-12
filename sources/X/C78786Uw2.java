package X;

import android.graphics.Bitmap;

/* renamed from: X.Uw2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78786Uw2 implements InterfaceC78787Uw3 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ Bitmap LIZIZ;

    @Override // X.InterfaceC78787Uw3
    public final void LIZ(C79565VKn c79565VKn) {
        Bitmap.CompressFormat compressFormat;
        int i;
        if (this.LIZ) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            i = 85;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
            i = 100;
        }
        this.LIZIZ.compress(compressFormat, i, c79565VKn);
    }

    public C78786Uw2(boolean z, Bitmap bitmap) {
        this.LIZ = z;
        this.LIZIZ = bitmap;
    }
}
