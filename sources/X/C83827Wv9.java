package X;

import java.lang.Enum;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wv9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83827Wv9<KEY extends Enum<KEY>> implements InterfaceC83724WtU<KEY> {
    public InterfaceC65784Pro<? extends InterfaceC83831WvD<KEY>> LIZ;
    public final InterfaceC83821Wv3<KEY> LIZIZ;
    public final InterfaceC83836WvI<KEY> LIZJ;
    public final InterfaceC65784Pro<InterfaceC83878Wvy> LIZLLL;

    @Override // X.InterfaceC83724WtU
    public final C83826Wv8 create() {
        InterfaceC83831WvD<KEY> c83828WvA;
        InterfaceC65784Pro<InterfaceC83878Wvy> globalContextProvider = this.LIZLLL;
        o.LJIIIZ(globalContextProvider, "globalContextProvider");
        C83910WwU c83910WwU = new C83910WwU(globalContextProvider);
        InterfaceC65784Pro<? extends InterfaceC83831WvD<KEY>> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro == null || (c83828WvA = interfaceC65784Pro.invoke()) == null) {
            c83828WvA = new C83828WvA<>();
        }
        return new C83826Wv8(this.LIZIZ, c83828WvA, this.LIZJ, c83910WwU, this.LIZLLL);
    }

    public C83827Wv9(InterfaceC83821Wv3 defaultKey, C83837WvJ c83837WvJ, AqS164S0100000_14 aqS164S0100000_14) {
        o.LJIIIZ(defaultKey, "defaultKey");
        this.LIZIZ = defaultKey;
        this.LIZJ = c83837WvJ;
        this.LIZLLL = aqS164S0100000_14;
    }
}
