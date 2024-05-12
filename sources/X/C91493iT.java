package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.3iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91493iT {
    public static WeakReference<View> LIZ = new WeakReference<>(null);

    public static View LIZ(Context context) {
        View view = LIZ.get();
        if (view == null || !o.LJ(view.getContext(), context)) {
            view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.zz, null, false);
            TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.jyt);
            if (tuxAlertBadgeLayout != null) {
                tuxAlertBadgeLayout.LIZIZ();
            }
            LIZ = new WeakReference<>(view);
        }
        return view;
    }
}
