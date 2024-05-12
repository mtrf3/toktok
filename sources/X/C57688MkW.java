package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MkW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57688MkW {
    public static final GradientDrawable LIZJ;
    public final C73318Sq2 LIZ;
    public final ConcurrentHashMap<String, int[]> LIZIZ;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.rgb(33, 33, 33), -16777216});
        gradientDrawable.setCornerRadius(0.0f);
        LIZJ = gradientDrawable;
    }

    public C57688MkW(C73318Sq2 disposables) {
        o.LJIIIZ(disposables, "disposables");
        this.LIZ = disposables;
        this.LIZIZ = new ConcurrentHashMap<>();
    }

    public static Integer LIZ(C81154Vt8 c81154Vt8, boolean z) {
        float f;
        c81154Vt8.LJI(90.0f);
        if (z) {
            f = 0.0f;
        } else {
            f = 0.4f;
        }
        c81154Vt8.LJFF(0.0f, 0.1f, f, 0.6f, 0.0f);
        c81154Vt8.LJII(0.0f);
        return c81154Vt8.LIZJ();
    }
}
