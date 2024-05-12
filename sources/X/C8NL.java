package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8NL, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8NL<T extends ReusedAssem<? extends C3C8>> implements C8VP {
    public InterfaceC65350Pko<? extends T> LIZ;
    public C8VK LIZIZ = C8VK.IMMEDIATE;

    @Override // X.C8VP
    public final void LIZ() {
    }

    public T LIZJ() {
        return null;
    }

    public C8NL() {
        new ArrayList();
    }

    @Override // X.C8VP
    /* renamed from: LIZIZ */
    public T build() {
        boolean z;
        T LIZJ = LIZJ();
        if (LIZJ == null) {
            InterfaceC65350Pko<? extends T> interfaceC65350Pko = this.LIZ;
            if (interfaceC65350Pko != null) {
                LIZJ = (T) C39557Ffl.LIZ(interfaceC65350Pko).newInstance();
            } else {
                o.LJIJI("type");
                throw null;
            }
        }
        if (this.LIZIZ == C8VK.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        LIZJ.active = z;
        return LIZJ;
    }

    public final void LIZLLL(C8VK c8vk) {
        o.LJIIIZ(c8vk, "<set-?>");
        this.LIZIZ = c8vk;
    }

    public final void LJ(InterfaceC65350Pko<? extends T> interfaceC65350Pko) {
        o.LJIIIZ(interfaceC65350Pko, "<set-?>");
        this.LIZ = interfaceC65350Pko;
    }
}
