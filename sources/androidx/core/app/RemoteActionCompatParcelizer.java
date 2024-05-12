package androidx.core.app;

import X.AbstractC06170Mb;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC06170Mb abstractC06170Mb) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.LIZ;
        if (abstractC06170Mb.LJII(1)) {
            obj = abstractC06170Mb.LJIILIIL();
        }
        remoteActionCompat.LIZ = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.LIZIZ;
        if (abstractC06170Mb.LJII(2)) {
            charSequence = abstractC06170Mb.LJI();
        }
        remoteActionCompat.LIZIZ = charSequence;
        CharSequence charSequence2 = remoteActionCompat.LIZJ;
        if (abstractC06170Mb.LJII(3)) {
            charSequence2 = abstractC06170Mb.LJI();
        }
        remoteActionCompat.LIZJ = charSequence2;
        remoteActionCompat.LIZLLL = (PendingIntent) abstractC06170Mb.LJIIJJI(remoteActionCompat.LIZLLL, 4);
        boolean z = remoteActionCompat.LJ;
        if (abstractC06170Mb.LJII(5)) {
            z = abstractC06170Mb.LJ();
        }
        remoteActionCompat.LJ = z;
        boolean z2 = remoteActionCompat.LJFF;
        if (abstractC06170Mb.LJII(6)) {
            z2 = abstractC06170Mb.LJ();
        }
        remoteActionCompat.LJFF = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        IconCompat iconCompat = remoteActionCompat.LIZ;
        abstractC06170Mb.LJIILJJIL(1);
        abstractC06170Mb.LJIL(iconCompat);
        CharSequence charSequence = remoteActionCompat.LIZIZ;
        abstractC06170Mb.LJIILJJIL(2);
        abstractC06170Mb.LJIIZILJ(charSequence);
        CharSequence charSequence2 = remoteActionCompat.LIZJ;
        abstractC06170Mb.LJIILJJIL(3);
        abstractC06170Mb.LJIIZILJ(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.LIZLLL;
        abstractC06170Mb.LJIILJJIL(4);
        abstractC06170Mb.LJIJJ(pendingIntent);
        boolean z = remoteActionCompat.LJ;
        abstractC06170Mb.LJIILJJIL(5);
        abstractC06170Mb.LJIILL(z);
        boolean z2 = remoteActionCompat.LJFF;
        abstractC06170Mb.LJIILJJIL(6);
        abstractC06170Mb.LJIILL(z2);
    }
}
