package X;

import X.InterfaceC58699N1z;

/* loaded from: classes11.dex */
public final class N20<ENUM extends InterfaceC58699N1z<TYPE_OUT>, TYPE_OUT> implements InterfaceC58602MzG<ENUM, TYPE_OUT> {
    public final String LIZ;
    public final InterfaceC88472Yns<M95, ENUM> LIZIZ;

    @Override // X.InterfaceC58602MzG
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC58602MzG
    public final InterfaceC88472Yns<M95, ENUM> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC58602MzG
    public final Object LIZ(Object obj) {
        InterfaceC58699N1z interfaceC58699N1z = (InterfaceC58699N1z) obj;
        if (interfaceC58699N1z == null) {
            return null;
        }
        return interfaceC58699N1z.getParamValue();
    }

    public N20(String str, Class cls, NGC ngc) {
        this.LIZ = str;
        this.LIZIZ = ngc;
    }
}
