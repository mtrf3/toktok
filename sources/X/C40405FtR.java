package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: X.FtR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40405FtR<T> implements InterfaceC64592gB {
    public static final C40405FtR<T> LJLIL = new C40405FtR<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C36203EIt.LIZ(EnumC36206EIw.POOLING, null);
        }
    }
}
