package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MoY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57938MoY {
    public InterfaceC57932MoS LIZ;
    public final List<InterfaceC88472Yns<InterfaceC57932MoS, C76800UCe>> LIZIZ;

    public C57938MoY(String logTag) {
        o.LJIIIZ(logTag, "logTag");
        this.LIZIZ = new ArrayList();
    }

    public final void LIZ(Integer num, InterfaceC88472Yns<? super InterfaceC57932MoS, C76800UCe> interfaceC88472Yns) {
        int size;
        InterfaceC57932MoS interfaceC57932MoS = this.LIZ;
        if (interfaceC57932MoS != null && interfaceC57932MoS.LJJJJZ()) {
            InterfaceC57932MoS interfaceC57932MoS2 = this.LIZ;
            if (interfaceC57932MoS2 != null) {
                interfaceC88472Yns.invoke(interfaceC57932MoS2);
                return;
            } else {
                o.LJIJI("section");
                throw null;
            }
        }
        if (num != null) {
            size = num.intValue();
        } else {
            size = ((ArrayList) this.LIZIZ).size();
        }
        ListProtector.add(this.LIZIZ, size, interfaceC88472Yns);
    }
}
