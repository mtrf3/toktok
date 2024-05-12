package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.2zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76432zH extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C76432zH LJLIL = new C76432zH();

    public C76432zH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
        o.LJIIIIZZ(lifecycleOwner, "get()");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C36636EZk.LIZ, null, new C76422zG(null), 2);
        return C76800UCe.LIZ;
    }
}
