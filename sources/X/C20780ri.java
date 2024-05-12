package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.0ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20780ri {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C24L.LJLIL);
    public static final java.util.Set<Integer> LIZIZ = new LinkedHashSet();

    public static boolean LIZ(int i) {
        return LIZIZ.contains(Integer.valueOf(i));
    }

    public static void LIZLLL(int i, Context context) {
        LIZIZ.add(Integer.valueOf(i));
        ((IHostPerformanceOpt) LIZ.getValue()).mM(i, context);
    }

    public static View LIZJ(int i, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(viewGroup, "<this>");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "context");
        return LIZIZ(i, context, viewGroup, z);
    }

    public static View LIZIZ(int i, Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(context, "context");
        return ((IHostPerformanceOpt) LIZ.getValue()).SO(i, context, viewGroup, z);
    }
}
