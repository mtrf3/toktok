package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.06V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06V {
    public final CharSequence LIZ;
    public final IconCompat LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final Bundle LIZ() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.LIZ);
        IconCompat iconCompat = this.LIZIZ;
        if (iconCompat != null) {
            iconCompat.getClass();
            bundle = new Bundle();
            switch (iconCompat.LIZ) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.LIZIZ);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.LIZIZ);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.LIZIZ);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.LIZIZ);
                    break;
            }
            bundle.putInt("type", iconCompat.LIZ);
            bundle.putInt("int1", iconCompat.LJ);
            bundle.putInt("int2", iconCompat.LJFF);
            bundle.putString("string1", iconCompat.LJIIIZ);
            ColorStateList colorStateList = iconCompat.LJI;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.LJII;
            if (mode != IconCompat.LJIIJ) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.LIZJ);
        bundle2.putString("key", this.LIZLLL);
        bundle2.putBoolean("isBot", this.LJ);
        bundle2.putBoolean("isImportant", this.LJFF);
        return bundle2;
    }

    public C06V(C06U c06u) {
        this.LIZ = c06u.LIZ;
        this.LIZIZ = c06u.LIZIZ;
        this.LIZJ = c06u.LIZJ;
        this.LIZLLL = c06u.LIZLLL;
        this.LJ = c06u.LJ;
        this.LJFF = c06u.LJFF;
    }
}
