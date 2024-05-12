package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: classes14.dex */
public class V9T {
    public Rect LIZIZ;
    public Rect LIZJ;
    public Bitmap LIZLLL;
    public final V9U LJFF;
    public C81392Vwy<W5A> LJI;
    public int LIZ = 1;
    public boolean LJ = true;

    public final void LIZ() {
        Bitmap bitmap = this.LIZLLL;
        if (bitmap != null && !bitmap.isRecycled() && !this.LJ) {
            this.LIZLLL.recycle();
            this.LIZLLL = null;
        }
        C81392Vwy<W5A> c81392Vwy = this.LJI;
        if (c81392Vwy != null) {
            c81392Vwy.close();
        }
    }

    public V9T(V9U v9u) {
        this.LJFF = v9u;
    }
}
