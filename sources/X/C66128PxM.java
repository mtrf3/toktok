package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PxM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66128PxM extends AbstractC66131PxP {
    public static final C66128PxM LIZIZ = new C66128PxM();

    @Override // X.AbstractC66131PxP
    public final int[] LIZLLL() {
        return new int[0];
    }

    static {
        try {
            for (C65955PuZ c65955PuZ : C65986Pv4.LIZIZ.values()) {
                LIZIZ.LIZ.put(c65955PuZ.LIZ, new C66184PyG(c65955PuZ.LIZLLL, c65955PuZ.LIZJ, c65955PuZ.LIZ));
            }
        } catch (Throwable th) {
            C66059PwF.LIZIZ(new C65852Psu((Thread) null, th, "label_custom_detector_init", (java.util.Map) null, 25));
        }
    }

    @Override // X.AbstractC66131PxP
    public final void LJFF(C66120PxE privacyEvent) {
        o.LJIIIZ(privacyEvent, "privacyEvent");
        if (!privacyEvent.LIZIZ()) {
            C66059PwF.LIZIZ(privacyEvent);
        }
    }

    @Override // X.AbstractC66131PxP
    public final void LJ(C66120PxE event, Throwable th) {
        String str;
        o.LJIIIZ(event, "event");
        C65955PuZ LIZ = C65986Pv4.LIZ(event.LJLJI);
        String LJLLILLLL = C16880lQ.LJLLILLLL(C66128PxM.class);
        String str2 = event.LJLJJI;
        if (LIZ != null) {
            str = LIZ.LIZJ;
        } else {
            str = null;
        }
        AbstractC66131PxP.LIZJ(LJLLILLLL, str2, o.LJIILLIIL(".kt", str), th);
        event.LIZLLL(th);
        LJFF(event);
    }
}
