package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.SXn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72259SXn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, View target) {
        o.LJIIIZ(target, "target");
        LIZIZ(target, i, i, i, i);
    }

    public static void LIZIZ(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        Object parent = target.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        Rect rect = new Rect();
        rect.left = (int) B9K.LIZ(target.getContext(), i);
        rect.top = (int) B9K.LIZ(target.getContext(), i2);
        rect.right = (int) B9K.LIZ(target.getContext(), i3);
        rect.bottom = (int) B9K.LIZ(target.getContext(), i4);
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate instanceof C72258SXm) {
            ((LinkedList) ((C72258SXm) touchDelegate).LIZ).add(new C72257SXl(rect, target));
        } else {
            C72258SXm c72258SXm = new C72258SXm(target);
            view.setTouchDelegate(c72258SXm);
            ((LinkedList) c72258SXm.LIZ).add(new C72257SXl(rect, target));
        }
    }
}
