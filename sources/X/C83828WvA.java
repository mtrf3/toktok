package X;

import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WvA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83828WvA<KEY extends Enum<KEY>> implements InterfaceC83831WvD<KEY> {
    public final java.util.Map<InterfaceC83821Wv3<KEY>, InterfaceC88472Yns<C83851WvX, InterfaceC83830WvC<KEY>>> LIZ = new LinkedHashMap();

    @Override // X.InterfaceC83831WvD
    public final InterfaceC83830WvC<KEY> LIZ(InterfaceC83821Wv3<KEY> key, C83851WvX c83851WvX) {
        InterfaceC83830WvC<KEY> interfaceC83830WvC;
        o.LJIIIZ(key, "key");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) this.LIZ).get(key);
        if (interfaceC88472Yns != null && (interfaceC83830WvC = (InterfaceC83830WvC) interfaceC88472Yns.invoke(c83851WvX)) != null) {
            return interfaceC83830WvC;
        }
        return new C83855Wvb(key, c83851WvX);
    }
}
