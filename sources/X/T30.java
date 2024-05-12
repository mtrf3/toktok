package X;

import java.util.List;
import kotlin.jvm.internal.AqS174S0200000_12;

/* loaded from: classes13.dex */
public final class T30 implements InterfaceC73142SnC<Object, AML> {
    public final InterfaceC88472Yns<AML, C76800UCe> LIZ;
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<AML, List<? extends Object>, C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr LJ;
    public final /* synthetic */ InterfaceC88471Ynr LJFF;

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, Throwable, C76800UCe> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88471Ynr<AML, List<? extends Object>, C76800UCe> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC73142SnC
    public final InterfaceC88472Yns<AML, C76800UCe> LIZJ() {
        return this.LIZ;
    }

    public T30(T33 t33, T31 t31, AqS174S0200000_12 aqS174S0200000_12) {
        this.LIZLLL = t33;
        this.LJ = t31;
        this.LJFF = aqS174S0200000_12;
        this.LIZ = t33;
        this.LIZIZ = t31;
        this.LIZJ = aqS174S0200000_12;
    }
}
