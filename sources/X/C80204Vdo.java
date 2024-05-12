package X;

import android.os.Handler;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vdo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80204Vdo implements InterfaceC111654Zt {
    public final /* synthetic */ BaseTransientBottomBar LIZ;

    @Override // X.InterfaceC111654Zt
    public final void show() {
        Handler handler = BaseTransientBottomBar.LJIILIIL;
        handler.sendMessage(handler.obtainMessage(0, this.LIZ));
    }

    public C80204Vdo(BaseTransientBottomBar baseTransientBottomBar) {
        this.LIZ = baseTransientBottomBar;
    }

    @Override // X.InterfaceC111654Zt
    public final void LIZ(int i) {
        Handler handler = BaseTransientBottomBar.LJIILIIL;
        handler.sendMessage(handler.obtainMessage(1, i, 0, this.LIZ));
    }
}
