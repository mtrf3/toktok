package X;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Zk3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90783Zk3 extends C90232ZbA implements InterfaceC90425ZeH {
    public C90783Zk3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // X.InterfaceC90425ZeH
    public final Bitmap LLIIJI(android.net.Uri uri) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, uri);
        Parcel LLJI = LLJI(LJLJI, 1);
        Bitmap bitmap = (Bitmap) C90257ZbZ.LIZ(LLJI, Bitmap.CREATOR);
        LLJI.recycle();
        return bitmap;
    }
}
