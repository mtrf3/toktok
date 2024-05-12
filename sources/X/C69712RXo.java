package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RXo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69712RXo extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        PdpViewModel vm = (PdpViewModel) obj;
        o.LJIIIZ(vm, "vm");
        Integer Wv0 = vm.Wv0();
        if (Wv0 == null || Wv0.intValue() != 2) {
            new C69711RXn();
            return C69711RXn.LIZIZ(vm, ry7);
        }
        new C69710RXm();
        return C69710RXm.LIZIZ(vm, ry7);
    }
}
