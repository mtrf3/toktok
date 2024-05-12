package X;

import android.graphics.Bitmap;
import com.lynx.tasm.base.LLog;
import java.util.List;

/* loaded from: classes14.dex */
public final class V9N implements InterfaceC79287V9v {
    public final /* synthetic */ V9P LIZ;

    @Override // X.InterfaceC79287V9v
    public final void LIZIZ() {
        V9P v9p = this.LIZ;
        v9p.tryFetchImageFromFresco(v9p.getWidth(), this.LIZ.getHeight(), this.LIZ.getPaddingLeft(), this.LIZ.getPaddingTop(), this.LIZ.getPaddingRight(), this.LIZ.getPaddingBottom());
    }

    @Override // X.InterfaceC79287V9v
    public final void LIZJ() {
        this.LIZ.markDirty();
    }

    @Override // X.InterfaceC79287V9v
    public final boolean LIZLLL() {
        InterfaceC78716Uuu interfaceC78716Uuu = this.LIZ.mScaleType;
        if (interfaceC78716Uuu != InterfaceC78716Uuu.LJJLIIIJILLIZJL && interfaceC78716Uuu != InterfaceC78716Uuu.LJJLIIIJJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79287V9v
    public final void LJFF() {
        this.LIZ.maybeUpdateView();
    }

    @Override // X.InterfaceC79287V9v
    public final void LJI() {
        this.LIZ.onSourceSetted();
        C81392Vwy<?> c81392Vwy = this.LIZ.mRef;
        if (c81392Vwy != null) {
            c81392Vwy.close();
            this.LIZ.mRef = null;
        }
        V9P v9p = this.LIZ;
        if (v9p.mTempPlaceHolder != null) {
            V92 hierarchy = v9p.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIILL(null, 1);
            }
            this.LIZ.mTempPlaceHolder.close();
            this.LIZ.mTempPlaceHolder = null;
        }
    }

    @Override // X.InterfaceC79287V9v
    public final void clear() {
        this.LIZ.setController(null);
    }

    public V9N(V9P v9p) {
        this.LIZ = v9p;
    }

    @Override // X.InterfaceC79287V9v
    public final void LIZ(List<VA3> list) {
        this.LIZ.onPostprocessorPreparing(list);
    }

    @Override // X.InterfaceC79287V9v
    public final void LJ(C81392Vwy<?> c81392Vwy) {
        C81392Vwy<?> c81392Vwy2;
        Bitmap bitmap;
        C81392Vwy<?> c81392Vwy3 = this.LIZ.mRef;
        if (c81392Vwy3 != null) {
            c81392Vwy3.close();
            this.LIZ.mRef = null;
        }
        this.LIZ.mRef = c81392Vwy.clone();
        V9P v9p = this.LIZ;
        if (v9p.mLoaderCallback != null && (c81392Vwy2 = v9p.mRef) != null) {
            Object LJI = c81392Vwy2.LJI();
            if (LJI instanceof W5B) {
                bitmap = ((W5B) LJI).getUnderlyingBitmap();
            } else {
                if (LJI instanceof Bitmap) {
                    bitmap = (Bitmap) LJI;
                }
                LLog.LIZLLL(4, "FrescoImageView", "onLocalCacheGet error bitmap is null or recycled");
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                this.LIZ.mLoaderCallback.LIZLLL(bitmap.getWidth(), bitmap.getHeight());
            }
            LLog.LIZLLL(4, "FrescoImageView", "onLocalCacheGet error bitmap is null or recycled");
        }
        this.LIZ.postInvalidate();
    }
}
