package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.97D, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97D {
    public static FrameLayout LIZ(Activity activity) {
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.c78);
        if (viewStub == null || viewStub.getParent() == null) {
            return (FrameLayout) activity.findViewById(R.id.b8q);
        }
        View inflate = viewStub.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) inflate;
    }
}
