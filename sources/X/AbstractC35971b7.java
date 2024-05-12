package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35971b7<T> extends AbstractC24370xV<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC35971b7(InterfaceC65784Pro<? extends T> defaultFactory) {
        super(defaultFactory);
        o.LJIIIZ(defaultFactory, "defaultFactory");
    }

    public final C24620xu<T> LIZIZ(T t) {
        return new C24620xu<>(this, t, true);
    }
}
