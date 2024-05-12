package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NMw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59242NMw {
    public static FrameLayout LIZ(Activity activity) {
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.ro);
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            return (FrameLayout) inflate;
        }
        return (FrameLayout) activity.findViewById(R.id.rn);
    }
}
