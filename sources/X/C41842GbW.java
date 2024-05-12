package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;

/* renamed from: X.GbW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41842GbW extends AbstractC41806Gaw<C41841GbV, Bitmap> {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.AbstractC41806Gaw
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C41841GbV r11, X.InterfaceC67352kd<? super android.graphics.Bitmap> r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41842GbW.LIZIZ(X.GbV, X.2kd):java.lang.Object");
    }

    public static Object LIZJ(int i, int i2, String str, C41843GbX c41843GbX) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c41843GbX));
        VEUtils.getVideoFrames(str, new int[]{0}, i, i2, false, new P5A() { // from class: X.5KV
            @Override // X.P5A
            public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                if (byteBuffer != null) {
                    createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                }
                C78966Uyw.LJJL(createBitmap, c84654XKg);
                return true;
            }
        });
        return c84654XKg.LIZ();
    }
}
