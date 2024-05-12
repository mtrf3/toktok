package X;

import android.os.Bundle;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;

/* renamed from: X.Zh6, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90600Zh6 extends AbstractC90104ZXw {
    public final /* synthetic */ Messenger LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C90595Zh1 LIZJ;

    @Override // X.AbstractC90104ZXw
    public final void LIZIZ(Bundle bundle) {
        if (this.LIZJ.LIZLLL(this.LIZ) >= 0) {
            MediaRouteProviderService.LJ(this.LIZ, 3, this.LIZIZ, 0, bundle, null);
        }
    }

    @Override // X.AbstractC90104ZXw
    public final void LIZ(Bundle bundle, String str) {
        if (this.LIZJ.LIZLLL(this.LIZ) >= 0) {
            if (str != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("error", str);
                MediaRouteProviderService.LJ(this.LIZ, 4, this.LIZIZ, 0, bundle, bundle2);
                return;
            }
            MediaRouteProviderService.LJ(this.LIZ, 4, this.LIZIZ, 0, bundle, null);
        }
    }

    public C90600Zh6(C90595Zh1 c90595Zh1, Messenger messenger, int i) {
        this.LIZJ = c90595Zh1;
        this.LIZ = messenger;
        this.LIZIZ = i;
    }
}
