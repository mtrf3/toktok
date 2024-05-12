package X;

import android.os.Build;
import ij2.a;

/* loaded from: classes16.dex */
public final class Y5Q implements InterfaceC81624W1s {
    public final /* synthetic */ Y5K LIZ;

    @Override // X.InterfaceC81624W1s
    public final void LIZ() {
        String str;
        a aVar = a.LJIJ;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIJJI(currentTimeMillis, "go_setting", "ocr_album_access_fail");
        this.LIZ.LLILLJJLI();
        OHI ohi = OHI.LIZ;
        Y5K y5k = this.LIZ;
        y5k.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        ohi.getClass();
        OHI.LJIIIIZZ(y5k, str);
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC81624W1s
    public final void LIZIZ() {
        a aVar = a.LJIJ;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIJJI(currentTimeMillis, "cancel", "ocr_album_access_fail");
    }

    public Y5Q(Y5K y5k) {
        this.LIZ = y5k;
    }
}
