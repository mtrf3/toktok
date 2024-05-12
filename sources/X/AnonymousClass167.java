package X;

import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.167, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass167 {
    public final InterfaceC272515d LIZ;
    public AnonymousClass164 LIZIZ;
    public final IDqS443S0100000 LIZJ;
    public final IDqS443S0100000 LIZLLL;
    public final IDqS443S0100000 LJ;

    public AnonymousClass167() {
        this(new InterfaceC272515d() { // from class: X.1gH
            @Override // X.InterfaceC272515d
            public final boolean LIZIZ(Object obj, Object obj2) {
                return false;
            }

            @Override // X.InterfaceC272515d
            public final void LIZ(C39051g5 slotIds) {
                o.LJIIIZ(slotIds, "slotIds");
                slotIds.clear();
            }
        });
    }

    public final AnonymousClass164 LIZ() {
        AnonymousClass164 anonymousClass164 = this.LIZIZ;
        if (anonymousClass164 != null) {
            return anonymousClass164;
        }
        "SubcomposeLayoutState is not attached to SubcomposeLayout".toString();
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public AnonymousClass167(InterfaceC272515d interfaceC272515d) {
        this.LIZ = interfaceC272515d;
        this.LIZJ = new IDqS443S0100000(this, 52);
        this.LIZLLL = new IDqS443S0100000(this, 50);
        this.LJ = new IDqS443S0100000(this, 51);
    }
}
