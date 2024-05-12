package X;

import android.os.Build;
import android.view.View;
import android.widget.ScrollView;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAG {
    public final View LIZ;
    public final C62822Ol8 LIZIZ;
    public final java.util.Set<InterfaceC41061G9p> LIZJ;
    public final ViewOnScrollChangeListenerC41062G9q LIZLLL;

    public final void LIZ() {
        ViewOnScrollChangeListenerC41062G9q viewOnScrollChangeListenerC41062G9q = this.LIZLLL;
        if (viewOnScrollChangeListenerC41062G9q == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-scrollable>(...)");
        ((ScrollView) value).setOnScrollChangeListener(viewOnScrollChangeListenerC41062G9q);
    }

    public GAG(View content) {
        ViewOnScrollChangeListenerC41062G9q viewOnScrollChangeListenerC41062G9q;
        o.LJIIIZ(content, "content");
        this.LIZ = content;
        this.LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 422));
        this.LIZJ = new LinkedHashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            viewOnScrollChangeListenerC41062G9q = new ViewOnScrollChangeListenerC41062G9q(this);
        } else {
            viewOnScrollChangeListenerC41062G9q = null;
        }
        this.LIZLLL = viewOnScrollChangeListenerC41062G9q;
    }
}
