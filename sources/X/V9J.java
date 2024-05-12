package X;

import android.graphics.Bitmap;
import com.lynx.tasm.base.LLog;
import java.util.List;

/* loaded from: classes14.dex */
public final class V9J implements InterfaceC79287V9v {
    public final /* synthetic */ V9H LIZ;

    @Override // X.InterfaceC79287V9v
    public final void LIZ(List<VA3> list) {
    }

    @Override // X.InterfaceC79287V9v
    public final void clear() {
    }

    @Override // X.InterfaceC79287V9v
    public final void LIZIZ() {
        V9H v9h = this.LIZ;
        v9h.LJ(v9h.LJ, v9h.LJFF, v9h.LJIILLIIL, v9h.LJIJ, v9h.LJIIZILJ, v9h.LJIJI);
    }

    @Override // X.InterfaceC79287V9v
    public final void LIZJ() {
        this.LIZ.LJII = true;
    }

    @Override // X.InterfaceC79287V9v
    public final boolean LIZLLL() {
        return this.LIZ.LJJIFFI;
    }

    @Override // X.InterfaceC79287V9v
    public final void LJFF() {
        V9H v9h = this.LIZ;
        v9h.LIZIZ(v9h.LJ, v9h.LJFF, v9h.LJIILLIIL, v9h.LJIJ, v9h.LJIIZILJ, v9h.LJIJI);
    }

    @Override // X.InterfaceC79287V9v
    public final void LJI() {
        C81392Vwy<?> c81392Vwy = this.LIZ.LJIL;
        if (c81392Vwy != null) {
            c81392Vwy.close();
            this.LIZ.LJIL = null;
        }
    }

    public V9J(V9H v9h) {
        this.LIZ = v9h;
    }

    @Override // X.InterfaceC79287V9v
    public final void LJ(C81392Vwy<?> c81392Vwy) {
        C81392Vwy<?> c81392Vwy2;
        Bitmap bitmap;
        C81392Vwy<?> c81392Vwy3 = this.LIZ.LJIL;
        if (c81392Vwy3 != null) {
            c81392Vwy3.close();
            this.LIZ.LJIL = null;
        }
        this.LIZ.LJIL = c81392Vwy.clone();
        V9H v9h = this.LIZ;
        if (v9h.LJIILL != null && (c81392Vwy2 = v9h.LJIL) != null) {
            Object LJI = c81392Vwy2.LJI();
            if (LJI instanceof W5B) {
                bitmap = ((W5B) LJI).getUnderlyingBitmap();
            } else {
                if (LJI instanceof Bitmap) {
                    bitmap = (Bitmap) LJI;
                }
                LLog.LIZLLL(4, "LynxImageManager", "onLocalCacheGet error bitmap is null or recycled");
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                this.LIZ.LJIILL.LIZLLL(bitmap.getWidth(), bitmap.getHeight());
            }
            LLog.LIZLLL(4, "LynxImageManager", "onLocalCacheGet error bitmap is null or recycled");
        }
        V9H v9h2 = this.LIZ;
        v9h2.LJIILIIL.onCloseableRefReady(v9h2.LJIL);
    }
}
