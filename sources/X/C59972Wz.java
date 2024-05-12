package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.2Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59972Wz extends AbstractC65781Prl implements InterfaceC88472Yns<WeakReference<C2X1>, Boolean> {
    public static final C59972Wz LJLIL = new C59972Wz();

    public C59972Wz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(WeakReference<C2X1> weakReference) {
        boolean z;
        WeakReference<C2X1> ref = weakReference;
        o.LJIIIZ(ref, "ref");
        if (ref.get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
