package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.06y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C022406y {
    public final Context LIZ;
    public CharSequence LJ;
    public CharSequence LJFF;
    public PendingIntent LJI;
    public PendingIntent LJII;
    public Bitmap LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public AnonymousClass070 LJIIL;
    public CharSequence LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public String LJIJJ;
    public Bundle LJIJJLI;
    public RemoteViews LJJI;
    public RemoteViews LJJIFFI;
    public String LJJII;
    public final boolean LJJIII;
    public final Notification LJJIIJ;
    public final ArrayList<String> LJJIIJZLJL;
    public final ArrayList<C022006u> LIZIZ = new ArrayList<>();
    public final ArrayList<C06V> LIZJ = new ArrayList<>();
    public final ArrayList<C022006u> LIZLLL = new ArrayList<>();
    public boolean LJIIJJI = true;
    public boolean LJIJI = false;
    public int LJIL = 0;
    public int LJJ = 0;

    public final Notification LIZIZ() {
        RemoteViews remoteViews;
        Notification build;
        AnonymousClass071 anonymousClass071 = new AnonymousClass071(this);
        AnonymousClass070 anonymousClass070 = anonymousClass071.LIZJ.LJIIL;
        if (anonymousClass070 != null) {
            anonymousClass070.LIZIZ(anonymousClass071);
            remoteViews = anonymousClass070.LJI();
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            build = anonymousClass071.LIZIZ.build();
        } else if (i >= 24) {
            build = anonymousClass071.LIZIZ.build();
        } else {
            anonymousClass071.LIZIZ.setExtras(anonymousClass071.LJI);
            build = anonymousClass071.LIZIZ.build();
            RemoteViews remoteViews2 = anonymousClass071.LIZLLL;
            if (remoteViews2 != null) {
                build.contentView = remoteViews2;
            }
            RemoteViews remoteViews3 = anonymousClass071.LJ;
            if (remoteViews3 != null) {
                build.bigContentView = remoteViews3;
            }
        }
        if (remoteViews != null) {
            build.contentView = remoteViews;
        } else {
            RemoteViews remoteViews4 = anonymousClass071.LIZJ.LJJI;
            if (remoteViews4 != null) {
                build.contentView = remoteViews4;
            }
        }
        if (anonymousClass070 != null) {
            RemoteViews LJFF = anonymousClass070.LJFF();
            if (LJFF != null) {
                build.bigContentView = LJFF;
            }
            anonymousClass071.LIZJ.LJIIL.LJII();
            Bundle bundle = build.extras;
            if (bundle != null) {
                anonymousClass070.LIZ(bundle);
            }
        }
        return build;
    }

    public static CharSequence LIZJ(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void LIZLLL(boolean z) {
        LJII(16, z);
    }

    public final void LJ(CharSequence charSequence) {
        this.LJFF = LIZJ(charSequence);
    }

    public final void LJFF(CharSequence charSequence) {
        this.LJ = LIZJ(charSequence);
    }

    public final void LJI(int i) {
        Notification notification = this.LJJIIJ;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void LJIIIIZZ(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.LIZ.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ks);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.kr);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.LJIIIIZZ = bitmap;
    }

    public final void LJIIIZ(android.net.Uri uri) {
        Notification notification = this.LJJIIJ;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void LJIIJ(AnonymousClass070 anonymousClass070) {
        if (this.LJIIL != anonymousClass070) {
            this.LJIIL = anonymousClass070;
            if (anonymousClass070 != null) {
                anonymousClass070.LJIIIIZZ(this);
            }
        }
    }

    public C022406y(Context context, String str) {
        Notification notification = new Notification();
        this.LJJIIJ = notification;
        this.LIZ = context;
        this.LJJII = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.LJIIJ = 0;
        this.LJJIIJZLJL = new ArrayList<>();
        this.LJJIII = true;
    }

    public final void LJII(int i, boolean z) {
        if (z) {
            Notification notification = this.LJJIIJ;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.LJJIIJ;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final void LIZ(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        ArrayList<C022006u> arrayList = this.LIZIZ;
        IconCompat iconCompat = null;
        if (i != 0) {
            iconCompat = IconCompat.LIZJ(null, "", i);
        }
        arrayList.add(new C022006u(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
    }
}
