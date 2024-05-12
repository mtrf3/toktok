package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MN5 {
    public static final int LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
    public static final int LIZIZ = C7MY.LIZIZ(48);
    public static final int LIZJ = C7MY.LIZIZ(56);

    public static final SY9 LIZ(int i) {
        Activity activity = ActivityStack.getTopActivity();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        o.LJIIIIZZ(activity, "activity");
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.gu, activity);
        return c2068389v.LIZ(activity);
    }

    public static Drawable LIZIZ(EnumC56696MMy type) {
        o.LJIIIZ(type, "type");
        int i = MN4.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return (Drawable) new C4YW().LIZ.getValue();
            }
            return (Drawable) new MNF().LIZ.getValue();
        }
        if (((Boolean) C46604IQu.LIZJ.getValue()).booleanValue()) {
            return (Drawable) new MN9().LIZIZ.getValue();
        }
        if (((Boolean) C46604IQu.LJ.getValue()).booleanValue()) {
            return (Drawable) new MN9().LIZJ.getValue();
        }
        return (Drawable) new MN9().LIZ.getValue();
    }
}
