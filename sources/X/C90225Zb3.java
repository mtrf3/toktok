package X;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: X.Zb3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90225Zb3 {
    public final List<String> LIZ;
    public final int[] LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final long LJIILL;

    public C90225Zb3() {
        List<String> list;
        int[] iArr;
        list = NotificationOptions.zza;
        this.LIZ = list;
        iArr = NotificationOptions.zzb;
        this.LIZIZ = iArr;
        this.LIZJ = LIZ("smallIconDrawableResId");
        this.LIZLLL = LIZ("stopLiveStreamDrawableResId");
        this.LJ = LIZ("pauseDrawableResId");
        this.LJFF = LIZ("playDrawableResId");
        this.LJI = LIZ("skipNextDrawableResId");
        this.LJII = LIZ("skipPrevDrawableResId");
        this.LJIIIIZZ = LIZ("forwardDrawableResId");
        this.LJIIIZ = LIZ("forward10DrawableResId");
        this.LJIIJ = LIZ("forward30DrawableResId");
        this.LJIIJJI = LIZ("rewindDrawableResId");
        this.LJIIL = LIZ("rewind10DrawableResId");
        this.LJIILIIL = LIZ("rewind30DrawableResId");
        this.LJIILJJIL = LIZ("disconnectDrawableResId");
        this.LJIILL = 10000L;
    }

    public static int LIZ(String str) {
        try {
            Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
