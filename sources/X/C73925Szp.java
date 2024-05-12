package X;

import Y.IDhS105S0100000_12;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Szp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73925Szp<T> implements InterfaceC73592SuS<OSZ<Object, Object>> {
    public final /* synthetic */ IDhS105S0100000_12 LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    public C73925Szp(IDhS105S0100000_12 iDhS105S0100000_12, Object obj) {
        this.LJLIL = iDhS105S0100000_12;
        this.LJLILLLLZI = obj;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(OSZ<Object, Object> osz) {
        OSZ<Object, Object> osz2 = osz;
        o.LJIIJ(osz2, "<name for destructuring parameter 0>");
        Object second = osz2.getSecond();
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{this.LJLILLLLZI, second})).size() != 2) {
            return false;
        }
        InterfaceC88471Ynr<? super V, ? super V1, Boolean> interfaceC88471Ynr = ((C73921Szl) ((C73923Szn) this.LJLIL.l0).LIZIZ).LIZIZ;
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            if (second != null) {
                Boolean valueOf = Boolean.valueOf(interfaceC88471Ynr.invoke(obj, second).booleanValue());
                if (valueOf == null) {
                    return false;
                }
                return valueOf.booleanValue();
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
