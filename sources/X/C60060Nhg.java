package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60060Nhg<T> extends WeakReference<T> {
    public final String LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60060Nhg(String eventName, T t, ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(referenceQueue, "referenceQueue");
        this.LIZ = eventName;
    }
}
