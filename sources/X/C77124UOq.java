package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.UOq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77124UOq<K, V> extends WeakReference<V> {
    public final K LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C77124UOq(Object obj, AbstractC73910Sza abstractC73910Sza, ReferenceQueue q) {
        super(abstractC73910Sza, q);
        o.LJIIJ(q, "q");
        this.LIZ = obj;
    }
}
