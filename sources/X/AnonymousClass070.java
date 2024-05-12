package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;

/* renamed from: X.070, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass070 {
    public C022406y LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public boolean LIZLLL;

    public abstract void LIZIZ(AnonymousClass071 anonymousClass071);

    public String LJ() {
        return null;
    }

    public RemoteViews LJFF() {
        return null;
    }

    public RemoteViews LJI() {
        return null;
    }

    public void LJII() {
    }

    public void LIZ(Bundle bundle) {
        if (this.LIZLLL) {
            bundle.putCharSequence("android.summaryText", this.LIZJ);
        }
        CharSequence charSequence = this.LIZIZ;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String LJ = LJ();
        if (LJ != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", LJ);
        }
    }

    public final void LJIIIIZZ(C022406y c022406y) {
        if (this.LIZ != c022406y) {
            this.LIZ = c022406y;
            if (c022406y != null) {
                c022406y.LJIIJ(this);
            }
        }
    }

    public final Bitmap LIZJ(IconCompat iconCompat, int i, int i2) {
        Drawable drawable;
        int i3;
        Context context = this.LIZ.LIZ;
        iconCompat.LIZ(context);
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = C07B.LJ(iconCompat.LJIIIIZZ(context), context);
        } else {
            drawable = null;
            switch (iconCompat.LIZ) {
                case 1:
                    drawable = new BitmapDrawable(context.getResources(), (Bitmap) iconCompat.LIZIZ);
                    break;
                case 2:
                    String LJ = iconCompat.LJ();
                    if (TextUtils.isEmpty(LJ)) {
                        LJ = context.getPackageName();
                    }
                    try {
                        drawable = C0OW.LIZ(IconCompat.LJFF(context, LJ), iconCompat.LJ, context.getTheme());
                        break;
                    } catch (RuntimeException unused) {
                        break;
                    }
                case 3:
                    drawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) iconCompat.LIZIZ, iconCompat.LJ, iconCompat.LJFF));
                    break;
                case 4:
                    InputStream LJII = iconCompat.LJII(context);
                    if (LJII != null) {
                        drawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(LJII));
                        break;
                    }
                    break;
                case 5:
                    drawable = new BitmapDrawable(context.getResources(), IconCompat.LIZIZ((Bitmap) iconCompat.LIZIZ, false));
                    break;
                case 6:
                    InputStream LJII2 = iconCompat.LJII(context);
                    if (LJII2 != null) {
                        drawable = new BitmapDrawable(context.getResources(), IconCompat.LIZIZ(BitmapFactory.decodeStream(LJII2), false));
                        break;
                    }
                    break;
            }
            if (drawable != null && (iconCompat.LJI != null || iconCompat.LJII != IconCompat.LJIIJ)) {
                drawable.mutate();
                C07820Sk.LJII(drawable, iconCompat.LJI);
                C07820Sk.LJIIIIZZ(drawable, iconCompat.LJII);
            }
        }
        if (i2 == 0) {
            i3 = drawable.getIntrinsicWidth();
        } else {
            i3 = i2;
        }
        if (i2 == 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i3, i2);
        if (i != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap LIZLLL(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Context context = this.LIZ.LIZ;
        context.getClass();
        Bitmap LIZJ = LIZJ(IconCompat.LIZJ(context.getResources(), context.getPackageName(), R.drawable.btk), i4, i2);
        Canvas canvas = new Canvas(LIZJ);
        Drawable mutate = this.LIZ.LIZ.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) / 2;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return LIZJ;
    }
}
