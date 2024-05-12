package X;

import android.opengl.EGLContext;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83870Wvq implements InterfaceC83889Ww9, InterfaceC83996Wxs {
    public final CopyOnWriteArrayList<InterfaceC83889Ww9> LIZ;
    public final InterfaceC83867Wvn LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65784Pro<Boolean> LIZLLL;

    @Override // X.InterfaceC63914P6o
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC83996Wxs
    public final void LIZ() {
        if (this.LIZLLL.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC83889Ww9> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(null, 0, 0, 0, 0, 0L, 0L);
        }
    }

    public C83870Wvq(C83866Wvm recorder, boolean z, AqS164S0100000_14 interceptCallback) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LIZIZ = recorder;
        this.LIZJ = z;
        this.LIZLLL = interceptCallback;
        this.LIZ = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC63914P6o
    public final void LIZJ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2) {
        if (this.LIZLLL.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC83889Ww9> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(eGLContext, i, i2, i3, i4, j, j2);
        }
    }
}
