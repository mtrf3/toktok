package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vx5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81399Vx5 {
    public static View LIZ(LayoutInflater layoutInflater, ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        if (HWY.LIZ()) {
            i = R.layout.j5;
        } else {
            i = R.layout.j4;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return LLLLIILL;
    }
}
