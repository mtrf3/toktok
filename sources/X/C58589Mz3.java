package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Mz3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58589Mz3 extends AbstractC65781Prl implements InterfaceC65784Pro<C83828WvA<Enum<Object>>> {
    public final /* synthetic */ C83824Wv6 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58589Mz3(C83824Wv6 c83824Wv6) {
        super(0);
        this.LJLIL = c83824Wv6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C83828WvA<Enum<Object>> invoke() {
        C83828WvA<Enum<Object>> c83828WvA = new C83828WvA<>();
        for (Map.Entry entry : this.LJLIL.LIZIZ.entrySet()) {
            Object key = entry.getKey();
            Object obj = ((C83825Wv7) entry.getValue()).LIZJ;
            if (obj != null) {
                o.LJIIIZ(key, "key");
                c83828WvA.LIZ.put(key, obj);
            }
        }
        return c83828WvA;
    }
}
