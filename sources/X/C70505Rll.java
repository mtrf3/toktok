package X;

import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import java.util.HashSet;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.o;

/* renamed from: X.Rll, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70505Rll<T, U> implements BiConsumer {
    public final /* synthetic */ BizIdentity LIZ;
    public final /* synthetic */ HashSet<String> LIZIZ;

    public C70505Rll(BizIdentity bizIdentity, HashSet<String> hashSet) {
        this.LIZ = bizIdentity;
        this.LIZIZ = hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiConsumer
    public final void accept(Object t, Object obj) {
        Object invoke;
        C69765RZp u = (C69765RZp) obj;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(u, "u");
        BizIdentity input = this.LIZ;
        o.LJIIIZ(input, "input");
        InterfaceC65784Pro<Object> interfaceC65784Pro = u.LIZIZ.get(input.getUniqueKey());
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            Class<?> cls = invoke.getClass();
            HashSet<String> hashSet = this.LIZIZ;
            Object obj2 = ((java.util.Map) C69757RZh.LIZIZ.getValue()).get(cls);
            if (obj2 != null) {
                hashSet.add(obj2);
            }
        }
    }
}
