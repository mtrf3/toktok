package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Zvd, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91501Zvd implements InterfaceC91418ZuI {
    public W4W<C81392Vwy<W5A>> LIZ;
    public final int LIZIZ = Math.min(JF5.LIZJ(EF7.LIZIZ()) / 3, 300);

    @Override // X.InterfaceC91228ZrE
    public final void release() {
        W4W<C81392Vwy<W5A>> w4w = this.LIZ;
        if (w4w != null) {
            w4w.close();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC91418ZuI
    public final void LIZ(String str, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        W5O LIZ;
        W4W<C81392Vwy<W5A>> w4w = this.LIZ;
        if (w4w != null) {
            w4w.close();
        }
        if (str == null) {
            return;
        }
        W6J LIZ2 = W5I.LIZ();
        if (Build.VERSION.SDK_INT >= 33) {
            LIZ = W5P.LIZLLL(UriProtector.parse(str)).LIZ();
        } else {
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            int i = this.LIZIZ;
            LIZLLL.LIZJ = new C79238V7y(i, i);
            LIZ = LIZLLL.LIZ();
        }
        W4W<C81392Vwy<W5A>> LJ = LIZ2.LJ(LIZ, null);
        ((AbstractC48384Iyq) LJ).LJ(new C91596ZxA(interfaceC88472Yns), C79561VKj.LJLIL);
        this.LIZ = LJ;
    }
}
