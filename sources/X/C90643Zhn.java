package X;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: X.Zhn, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90643Zhn implements InterfaceC90422ZeE {
    public final /* synthetic */ ZZ7 LIZ;
    public final /* synthetic */ MediaNotificationService LIZIZ;

    public C90643Zhn(MediaNotificationService mediaNotificationService, ZZ7 zz7) {
        this.LIZIZ = mediaNotificationService;
        this.LIZ = zz7;
    }

    @Override // X.InterfaceC90422ZeE
    public final void LIZ(Bitmap bitmap) {
        ZZ7 zz7 = this.LIZ;
        zz7.LIZIZ = bitmap;
        MediaNotificationService mediaNotificationService = this.LIZIZ;
        mediaNotificationService.LJLLILLLL = zz7;
        mediaNotificationService.LIZIZ();
    }
}
