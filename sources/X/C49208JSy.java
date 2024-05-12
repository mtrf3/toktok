package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JSy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49208JSy {
    public static C49206JSw LIZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LIZIZ = C50365Jph.LIZIZ(R.layout.ci3, parent);
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C49206JSw(context, LIZIZ);
    }
}
