package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.notification.widget.WidgetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.MPq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56766MPq {
    public WidgetFragment LJLIL;

    public void LIZIZ(int i, int i2, Intent intent) {
    }

    public void LIZJ(Bundle bundle) {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJFF() {
    }

    public void LJI() {
    }

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
    }

    public final WidgetFragment LIZ() {
        WidgetFragment widgetFragment = this.LJLIL;
        if (widgetFragment != null) {
            return widgetFragment;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public final ActivityC45651qj LJIIJ() {
        ActivityC45651qj mo49getActivity = LIZ().mo49getActivity();
        o.LJI(mo49getActivity);
        return mo49getActivity;
    }

    public final <T extends View> T LJIIJJI(int i) {
        T t;
        View view = LIZ().getView();
        if (view != null) {
            t = (T) view.findViewById(i);
        } else {
            t = null;
        }
        o.LJI(t);
        return t;
    }
}
