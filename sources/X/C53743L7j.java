package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.L7j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53743L7j {
    public static void LIZ(Context context, ViewGroup viewGroup, C72827Si7 c72827Si7) {
        o.LJIIIZ(context, "context");
        C72826Si6 c72826Si6 = new C72826Si6(c72827Si7, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.xr);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackground(c72826Si6);
        viewGroup.addView(frameLayout);
    }
}
