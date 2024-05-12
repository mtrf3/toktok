package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.N1x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58697N1x implements InterfaceC58433MwX {
    public final EnumC58694N1u LIZ;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public boolean LIZJ = true;

    public C58697N1x(EnumC58694N1u enumC58694N1u) {
        this.LIZ = enumC58694N1u;
    }

    @Override // X.InterfaceC58433MwX
    public final void LIZ(LifecycleOwner source, Lifecycle.Event event, AqS101S0300000_12 aqS101S0300000_12) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (!this.LIZJ) {
            aqS101S0300000_12.invoke();
            return;
        }
        int i = C58693N1t.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                aqS101S0300000_12.invoke();
                return;
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                aqS101S0300000_12.invoke();
                return;
            } else {
                this.LIZIZ.sendMessageAtTime(Message.obtain(this.LIZIZ, new ARunnableS46S0100000_10((Object) aqS101S0300000_12, 201)), 1L);
                return;
            }
        }
        this.LIZIZ.sendMessageAtTime(Message.obtain(this.LIZIZ, new ARunnableS46S0100000_10((Object) aqS101S0300000_12, 201)), 1L);
    }
}
