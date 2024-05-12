package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.1qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45351qF implements InterfaceC41991kp {
    public final ParcelableSnapshotMutableState LJLIL = C78966Uyw.LJJJIL(Float.valueOf(1.0f));

    @Override // X.MBD
    public final InterfaceC48698J9i getKey() {
        return InterfaceC41991kp.LJJJIL;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        return (E) MBC.LIZ(this, key);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        return MBC.LIZIZ(this, key);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
