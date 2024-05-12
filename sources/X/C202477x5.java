package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.7x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202477x5 extends X3I {
    public static final boolean LJI = C8D3.LIZJ();
    public View LIZIZ;
    public View LIZJ;
    public C202467x4 LIZLLL;
    public TuxTextView LJ;
    public View LJFF;

    public C202477x5() {
        super(1);
    }

    public static final int LIZ() {
        if (!C202677xP.LIZ()) {
            return C7MY.LIZIZ(32);
        }
        if (FavoriteServiceImpl.LJIJJLI().LJIJJ() || LJI) {
            return C7MY.LIZIZ(36);
        }
        return C7MY.LIZIZ(40);
    }

    public static final int LIZIZ() {
        float LJIIZILJ;
        if (!C202677xP.LIZ()) {
            return O6R.LJJIIZ(C32151Nz.LJIIZILJ(45));
        }
        if (!LJI) {
            LJIIZILJ = C32151Nz.LJIIZILJ(50);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(45);
        }
        return O6R.LJJIIZ(LJIIZILJ);
    }

    public static Drawable LIZJ() {
        if (C8D3.LIZJ() && C202677xP.LIZ()) {
            Drawable LIZLLL = LIZLLL(R.drawable.bo3);
            Drawable LIZLLL2 = LIZLLL(R.drawable.ic_home_like_after);
            if (LIZLLL != null && LIZLLL2 != null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{-16842913}, LIZLLL);
                stateListDrawable.addState(new int[]{android.R.attr.state_selected}, LIZLLL2);
                return stateListDrawable;
            }
        }
        return null;
    }

    public static Drawable LIZLLL(int i) {
        Bitmap.Config config;
        Drawable LIZIZ = C04270Et.LIZIZ(EF7.LIZIZ(), i);
        if (LIZIZ == null) {
            return null;
        }
        int intrinsicWidth = LIZIZ.getIntrinsicWidth();
        int intrinsicHeight = LIZIZ.getIntrinsicHeight();
        int intrinsicWidth2 = LIZIZ.getIntrinsicWidth();
        int intrinsicHeight2 = LIZIZ.getIntrinsicHeight();
        if (LIZIZ.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, config);
        Canvas canvas = new Canvas(createBitmap);
        LIZIZ.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
        LIZIZ.draw(canvas);
        Matrix matrix = new Matrix();
        matrix.postScale(0.9f, 0.9f);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, intrinsicWidth, intrinsicHeight, matrix, true);
        if (!createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), createBitmap2);
        bitmapDrawable.setTargetDensity(KL2.LJIIIIZZ(EF7.LIZIZ()));
        return bitmapDrawable;
    }
}
