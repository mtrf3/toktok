package X;

import Y.ARunnableS20S0200000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.8S2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8S2 {
    public static final /* synthetic */ int LJI = 0;
    public final WeakReference<FrameLayout> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final WeakReference<Context> LIZLLL;
    public final C5H3 LJ = C221118m3.LIZ(new AqS153S0100000_3(this, 1553));
    public XKQ LJFF;

    public final void LIZ() {
        View view = (View) this.LJ.getValue();
        if (view == null) {
            this.LIZIZ.invoke();
            return;
        }
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 368);
        view.setAlpha(1.0f);
        C09K.LIZ(view, 0.0f, 250L).withEndAction(new ARunnableS20S0200000_1(aqS167S0100000_1, view, 41));
    }

    public C8S2(ActivityC45651qj activityC45651qj, WeakReference weakReference, AqS153S0100000_3 aqS153S0100000_3, AqS153S0100000_3 aqS153S0100000_32) {
        this.LIZ = weakReference;
        this.LIZIZ = aqS153S0100000_3;
        this.LIZJ = aqS153S0100000_32;
        this.LIZLLL = new WeakReference<>(activityC45651qj);
    }
}
