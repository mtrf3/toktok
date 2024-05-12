package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JHz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48923JHz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JI0.LJLIL);

    public static WeakHashMap LIZIZ() {
        return (WeakHashMap) LIZ.getValue();
    }

    public static JI2 LIZ(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        if (itemView instanceof RecyclerView) {
            return (JI2) LIZIZ().get(itemView);
        }
        ViewParent parent = itemView.getParent();
        while (!(parent instanceof RecyclerView)) {
            if (parent != null) {
                parent = parent.getParent();
            } else {
                return null;
            }
        }
        if (parent == null) {
            return null;
        }
        return (JI2) LIZIZ().get(parent);
    }
}
