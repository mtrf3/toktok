package X;

import X.C0Q9;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.0Q1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Q1<T, V extends C0Q9> {
    public final C0QC<T, V> LIZ;
    public final T LIZIZ;
    public final long LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public V LJFF;
    public long LJI;
    public final ParcelableSnapshotMutableState LJII;

    public final T LIZ() {
        return this.LJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0Q1(Object obj, C0QC typeConverter, C0Q9 initialVelocityVector, long j, Object obj2, long j2, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(typeConverter, "typeConverter");
        o.LJIIIZ(initialVelocityVector, "initialVelocityVector");
        this.LIZ = typeConverter;
        this.LIZIZ = obj2;
        this.LIZJ = j2;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = C78966Uyw.LJJJIL(obj);
        this.LJFF = (V) C78946Uyc.LJIIIZ(initialVelocityVector);
        this.LJI = j;
        this.LJII = C78966Uyw.LJJJIL(Boolean.TRUE);
    }
}
