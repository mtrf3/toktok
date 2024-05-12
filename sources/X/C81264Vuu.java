package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.o;

/* renamed from: X.Vuu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81264Vuu {
    public final C81263Vut LIZ;
    public final Context LIZIZ;
    public final View LIZJ;

    public C81264Vuu(Y5K activity) {
        View view;
        o.LJIIIZ(activity, "activity");
        this.LIZ = new C81263Vut();
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = activity;
    }
}
