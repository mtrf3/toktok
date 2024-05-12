package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45741qs extends AbstractC65781Prl implements InterfaceC88472Yns<Object, Boolean> {
    public static final C45741qs LJLIL = new C45741qs();

    public C45741qs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Object it) {
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!((C0DU) it).isValid());
    }
}
