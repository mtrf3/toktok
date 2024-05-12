package og7;

import X.C018905p;
import android.animation.LayoutTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class a {
    public static void LIZ(String str, p8.a aVar, ConstraintLayout constraintLayout, C018905p c018905p) {
        if (o.LJ(q8.a.LJ(str), "animateLayoutChanges") && Boolean.parseBoolean(aVar.LIZ)) {
            constraintLayout.setLayoutTransition(new LayoutTransition());
        }
    }
}
