package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.IAf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46173IAf {
    public final Object LIZ;

    public C46173IAf(InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    public C46173IAf(Context context, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(context, "context");
        View LIZ = C16950lX.LIZ(context, R.layout.b6z, new FrameLayout(context), false, -1);
        o.LJIIIIZZ(LIZ, "getView(context, R.layout.im_layout_dm_entrance)");
        this.LIZ = LIZ;
        LIZ.setLayoutParams(layoutParams);
    }
}
