package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06600Ns {
    public final AbstractC06580Nq LIZ;
    public final AbstractC06620Nu LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public final InterfaceC06430Nb LIZLLL;

    public C06600Ns(AbstractC06580Nq targetContentEnter, AbstractC06620Nu initialContentExit) {
        final C48031uZ sizeAnimationSpec = C48031uZ.LJLIL;
        o.LJIIIZ(sizeAnimationSpec, "sizeAnimationSpec");
        final boolean z = true;
        InterfaceC06430Nb interfaceC06430Nb = new InterfaceC06430Nb(z, sizeAnimationSpec) { // from class: X.1I2
            public final boolean LIZ;
            public final InterfaceC88471Ynr<C23490w5, C23490w5, C1J4<C23490w5>> LIZIZ;

            @Override // X.InterfaceC06430Nb
            public final boolean LIZ() {
                return this.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = z;
                this.LIZIZ = sizeAnimationSpec;
            }

            @Override // X.InterfaceC06430Nb
            public final C1J4<C23490w5> LIZIZ(long j, long j2) {
                return this.LIZIZ.invoke(new C23490w5(j), new C23490w5(j2));
            }
        };
        o.LJIIIZ(targetContentEnter, "targetContentEnter");
        o.LJIIIZ(initialContentExit, "initialContentExit");
        this.LIZ = targetContentEnter;
        this.LIZIZ = initialContentExit;
        this.LIZJ = C78966Uyw.LJJJIL(Float.valueOf(0.0f));
        this.LIZLLL = interfaceC06430Nb;
    }
}
