package X;

import X.InterfaceC58699N1z;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N21<ENUM extends InterfaceC58699N1z<TYPE_OUT>, TYPE_OUT> implements InterfaceC58602MzG<ENUM, TYPE_OUT> {
    public final String LIZ;
    public final InterfaceC88472Yns<M95, ENUM> LIZIZ;
    public final boolean LIZJ = true;

    @Override // X.InterfaceC58602MzG
    public final InterfaceC88472Yns<M95, ENUM> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC58602MzG
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final Object LIZ(Object obj) {
        InterfaceC58699N1z before = (InterfaceC58699N1z) obj;
        o.LJIIIZ(before, "before");
        return before.getParamValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N21(String str, Class<? extends InterfaceC58699N1z<TYPE_OUT>> cls, InterfaceC88472Yns<? super M95, ? extends ENUM> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = interfaceC88472Yns;
    }
}
