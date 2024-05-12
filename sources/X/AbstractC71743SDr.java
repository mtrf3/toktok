package X;

import androidx.lifecycle.MutableLiveData;
import java.io.Closeable;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SDr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71743SDr implements Closeable {
    public final MutableLiveData<Object> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C79146V4k.LJIJ(((InterfaceC70422pa) this.LJLJI.getValue()).getCoroutineContext(), null);
    }

    public AbstractC71743SDr() {
        MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = C221108m2.LIZIZ(SAT.LJLIL);
    }

    public <T> InterfaceC88472Yns<T, T> LIZ(T t) {
        o.LJIIIZ(t, "t");
        return new AqS178S0100000_12(t, 321);
    }

    public final <T> void LIZIZ(C71746SDu<T> stateOwner, InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns) {
        o.LJIIIZ(stateOwner, "stateOwner");
        InterfaceC88472Yns<? super T, ? extends T> LIZ = LIZ(interfaceC88472Yns.invoke(stateOwner.LIZ));
        if (MS5.LIZLLL()) {
            stateOwner.LIZ(LIZ);
        } else {
            XKX.LIZLLL((InterfaceC70422pa) this.LJLJI.getValue(), null, null, new C71748SDw(stateOwner, LIZ, null), 3);
        }
    }

    public final <T> void LIZJ(C71746SDu<T> stateOwner, InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns) {
        o.LJIIIZ(stateOwner, "stateOwner");
        InterfaceC88472Yns<? super T, ? extends T> LIZ = LIZ(interfaceC88472Yns.invoke(stateOwner.LIZ));
        if (MS5.LIZLLL()) {
            stateOwner.LIZ(LIZ);
            this.LJLIL.setValue(0);
        } else {
            XKX.LIZLLL((InterfaceC70422pa) this.LJLJI.getValue(), null, null, new C71747SDv(stateOwner, LIZ, this, null), 3);
        }
    }
}
