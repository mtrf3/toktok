package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class W68 {
    public W6X<W6U, W5A> LIZ;
    public C79573VKv LIZIZ;
    public final int LIZJ;

    public final void LIZIZ() {
        ArrayList<C81736W6a<W6U, W5A>> LIZ;
        ArrayList<C81736W6a<W6U, W5A>> LIZ2;
        W6X<W6U, W5A> w6x = this.LIZ;
        if (w6x != null) {
            try {
                synchronized (w6x) {
                    LIZ = w6x.LJLIL.LIZ();
                    LIZ2 = w6x.LJLILLLLZI.LIZ();
                    w6x.LJIILIIL(LIZ2);
                }
                w6x.LJIILL(LIZ2);
                W6X.LJIJ(LIZ);
                w6x.LJIJJ();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public W68() {
        int memoryClass;
        Context context = C81725W5p.LIZ;
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        int i = (int) ((memoryClass * 1048576) / 10);
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
        if (i > i2) {
            i = i2;
        } else if (i < 6291456) {
            i = 6291456;
        }
        this.LIZJ = i;
        this.LIZ = new W6X<>(new C78598Ut0(), new C81743W6h(), new W69(this, (ActivityManager) C16880lQ.LLILL(C81725W5p.LIZ, "activity")));
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "bitmap-cache";
        this.LIZIZ = new C79573VKv(C37191Eih.LIZ(c38027EwB));
    }

    public final C81392Vwy<Bitmap> LIZJ(String str) {
        W5C w5c;
        C81392Vwy LJFF = this.LIZ.LJFF(new C245519kJ(str));
        C81392Vwy<Bitmap> c81392Vwy = null;
        if (LJFF == null) {
            return null;
        }
        try {
            if (C81392Vwy.LJIIJJI(LJFF) && (LJFF.LJI() instanceof W5C) && (w5c = (W5C) LJFF.LJI()) != null) {
                c81392Vwy = w5c.cloneUnderlyingBitmapReference();
            }
            return c81392Vwy;
        } finally {
            C81392Vwy.LJ(LJFF);
        }
    }

    public final void LIZ(String str, C81831W9r c81831W9r) {
        C81392Vwy LIZJ;
        if (!TextUtils.isEmpty(str) && c81831W9r != null && c81831W9r.LIZ() != null) {
            C81836W9w LIZ = c81831W9r.LIZ();
            synchronized (LIZ) {
                LIZJ = C81392Vwy.LIZJ(LIZ.LIZJ);
            }
            if (LIZJ != null && LIZJ.LJIIJ()) {
                C10K.LIZIZ(new W5S(this, LIZJ, str), this.LIZIZ, null);
            }
        }
    }
}
