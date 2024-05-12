package X;

import Y.ACListenerS35S0100000_15;
import android.R;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Y4e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86784Y4e {
    public final Context LIZ;
    public boolean LIZIZ;
    public final FrameLayout LIZJ;
    public final View LIZLLL;

    public C86784Y4e(Context context) {
        FrameLayout frameLayout;
        Window window;
        View decorView;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (window = LJJIFFI.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
        } else {
            frameLayout = null;
        }
        this.LIZJ = frameLayout;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), com.zhiliaoapp.musically.R.layout.c9e, frameLayout, false);
        this.LIZLLL = LLLLIILL;
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 182), LLLLIILL);
    }
}
