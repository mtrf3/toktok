package X;

import Y.IDTListenerS124S0100000_42;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aWa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93792aWa {
    public static final C93790aWY LJII = new C93790aWY();
    public final HashMap<Integer, List<OSZ<View, InterfaceC93791aWZ>>> LIZ;
    public final List<InterfaceC88471Ynr<MotionEvent, Boolean, Boolean>> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final int LJFF;
    public final IDTListenerS124S0100000_42 LJI;

    public C93792aWa(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = new HashMap<>();
        this.LIZIZ = new ArrayList();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(activity);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(activity)");
        this.LJFF = viewConfiguration.getScaledTouchSlop();
        this.LJI = new IDTListenerS124S0100000_42(this, 1);
    }

    public final void LIZ(ActivityC45651qj activityC45651qj) {
        this.LIZ.clear();
        ((ArrayList) this.LIZIZ).clear();
        LJII.getClass();
        C94164aca c94164aca = (C94164aca) activityC45651qj.findViewById(R.id.nm_);
        if (c94164aca != null) {
            IDTListenerS124S0100000_42 touchListener = this.LJI;
            o.LJIIIZ(touchListener, "touchListener");
            ((ArrayList) c94164aca.LJLIL).remove(touchListener);
        }
    }
}
