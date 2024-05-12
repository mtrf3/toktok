package X;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.1AV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AV extends AnonymousClass070 {
    public Bitmap LJ;
    public IconCompat LJFF;
    public boolean LJI;

    @Override // X.AnonymousClass070
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // X.AnonymousClass070
    public final void LIZIZ(AnonymousClass071 anonymousClass071) {
        Bitmap LIZIZ;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(anonymousClass071.LIZIZ).setBigContentTitle(this.LIZIZ).bigPicture(this.LJ);
        if (this.LJI) {
            IconCompat iconCompat = this.LJFF;
            if (iconCompat == null) {
                C022106v.LIZ(bigPicture, null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                C022206w.LIZ(bigPicture, iconCompat.LJIIIIZZ(anonymousClass071.LIZ));
            } else {
                int i = iconCompat.LIZ;
                if (i == -1 || i != 1) {
                    C022106v.LIZ(bigPicture, null);
                } else {
                    IconCompat iconCompat2 = this.LJFF;
                    int i2 = iconCompat2.LIZ;
                    if (i2 != -1) {
                        if (i2 == 1) {
                            LIZIZ = (Bitmap) iconCompat2.LIZIZ;
                        } else if (i2 == 5) {
                            LIZIZ = IconCompat.LIZIZ((Bitmap) iconCompat2.LIZIZ, true);
                        }
                        C022106v.LIZ(bigPicture, LIZIZ);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("called getBitmap() on ");
                    LIZ.append(iconCompat2);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
        }
        if (this.LIZLLL) {
            C022106v.LIZIZ(bigPicture, this.LIZJ);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            C022306x.LIZIZ(bigPicture, false);
            C022306x.LIZ(bigPicture, null);
        }
    }

    public final void LJIIIZ(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.LIZIZ = bitmap;
        }
        this.LJFF = iconCompat;
        this.LJI = true;
    }
}
