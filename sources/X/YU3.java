package X;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public final class YU3 implements YU5<Object> {
    public volatile C253089wW LJLIL;
    public final Object LJLILLLLZI = new Object();
    public final C8W0 LJLJI;

    public final Object LIZ() {
        Context context = this.LJLJI.getContext();
        C78866UxK.LJIL("Hilt Assems must be attached to an @AndroidEntryPoint Activity. Found: %s", context instanceof YU5, context.getClass());
        C253099wX LJIIJ = ((YU4) ((YU5) this.LJLJI.getContext()).generatedComponent()).LJIIJ();
        C8W0 c8w0 = this.LJLJI;
        LJIIJ.getClass();
        c8w0.getClass();
        LJIIJ.getClass();
        final C106504Fy c106504Fy = LJIIJ.LIZ;
        final C253069wU c253069wU = LJIIJ.LIZIZ;
        return new AbstractC87448YTs(c106504Fy, c253069wU) { // from class: X.9wW
            public final C106504Fy LIZ;
            public final C253069wU LIZIZ;

            @Override // X.InterfaceC87449YTt
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC87454YTy
            public final void LIZJ() {
            }

            @Override // X.InterfaceC87444YTo
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC87453YTx
            public final void LJ() {
            }

            @Override // X.InterfaceC87455YTz
            public final void LJFF() {
            }

            @Override // X.InterfaceC87447YTr
            public final void LJI() {
            }

            @Override // X.InterfaceC87445YTp
            public final void LJII() {
            }

            @Override // X.InterfaceC87451YTv
            public final void LJIIIIZZ() {
            }

            @Override // X.YU0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC87452YTw
            public final void LJIIJ() {
            }

            @Override // X.YU1
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC87446YTq
            public final void LJIIL() {
            }

            @Override // X.YU2
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC87450YTu
            public final void LJIILJJIL() {
            }

            @Override // X.InterfaceC87442YTm
            public final AbstractC65583PoZ LIZ() {
                Application application = (Application) C16880lQ.LLLLL(this.LIZ.LIZ.LIZ);
                if (application != null) {
                    return AbstractC65583PoZ.of(new C48221us(application, new ViewModelProvider.AndroidViewModelFactory(application), this.LIZIZ.LJIIZILJ()));
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c253069wU;
            }
        };
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = (C253089wW) LIZ();
                }
            }
        }
        return this.LJLIL;
    }

    public YU3(C8W0 c8w0) {
        this.LJLJI = c8w0;
    }
}
