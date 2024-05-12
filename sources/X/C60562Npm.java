package X;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Npm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60562Npm implements JF8 {
    public final /* synthetic */ Window LIZ;
    public final /* synthetic */ BulletPopUpFragment LIZIZ;

    @Override // X.JF8
    public final void LIZ(int i) {
        boolean z;
        InterfaceC60585Nq9 interfaceC60585Nq9 = this.LIZIZ.LJLJI;
        if (interfaceC60585Nq9 != null) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Window window = this.LIZ;
            o.LJFF(window, "this@apply");
            View decorView = window.getDecorView();
            o.LJFF(decorView, "window.decorView");
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            interfaceC60585Nq9.LIZJ(i, Integer.valueOf(rect.bottom), z);
        }
        InterfaceC40516FvE interfaceC40516FvE = this.LIZIZ.LJLJJI;
        if (interfaceC40516FvE != null) {
            interfaceC40516FvE.onEvent(new C60572Npw(this, i));
        }
    }

    public C60562Npm(Window window, BulletPopUpFragment bulletPopUpFragment) {
        this.LIZ = window;
        this.LIZIZ = bulletPopUpFragment;
    }
}
