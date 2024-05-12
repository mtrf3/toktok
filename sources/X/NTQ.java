package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [KEY] */
/* loaded from: classes11.dex */
public final class NTQ<KEY> extends AbstractC65781Prl implements InterfaceC88472Yns<WeakReference<KEY>, KEY> {
    public static final NTQ LJLIL = new NTQ();

    public NTQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        Reference it = (Reference) obj;
        o.LJIIIZ(it, "it");
        return it.get();
    }
}
