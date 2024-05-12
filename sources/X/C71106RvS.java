package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloader;
import java.io.File;

/* renamed from: X.RvS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71106RvS implements InterfaceC31104CIq {
    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        if (!ImagePreloader.LIZIZ()) {
            return;
        }
        ImagePreloader.LIZIZ++;
        ImagePreloader.LIZ();
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        if (!ImagePreloader.LIZIZ()) {
            return;
        }
        ImagePreloader.LIZIZ++;
        ImagePreloader.LIZ();
    }
}
