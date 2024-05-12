package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel;

/* loaded from: classes13.dex */
public final class TMO implements InterfaceC47920IrM {
    public final /* synthetic */ InfoStickerViewModel LIZ;

    @Override // X.InterfaceC47920IrM
    public final void LIZ() {
    }

    @Override // X.InterfaceC47920IrM
    public final void LIZIZ() {
        NetworkInfo LLLZIL;
        Context context = this.LIZ.LJLJL;
        if (context != null && (LLLZIL = C16880lQ.LLLZIL((ConnectivityManager) C16880lQ.LLILL(context, "connectivity"), 1)) != null && LLLZIL.isAvailable()) {
            this.LIZ.gv0();
        }
    }

    public TMO(InfoStickerViewModel infoStickerViewModel) {
        this.LIZ = infoStickerViewModel;
    }
}
