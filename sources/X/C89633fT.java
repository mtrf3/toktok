package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.3fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89633fT extends AbstractC65781Prl implements InterfaceC88472Yns<WeakReference<InterfaceC89653fV>, Boolean> {
    public static final C89633fT LJLIL = new C89633fT();

    public C89633fT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(WeakReference<InterfaceC89653fV> weakReference) {
        boolean z;
        WeakReference<InterfaceC89653fV> it = weakReference;
        o.LJIIIZ(it, "it");
        if (it.get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
