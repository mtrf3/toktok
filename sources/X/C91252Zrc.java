package X;

import android.os.SystemClock;

/* renamed from: X.Zrc, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91252Zrc {
    public static C91250Zra LIZ = new C91250Zra();

    public static boolean LIZ(TBU tbu) {
        if (((Number) tbu.get()).longValue() == -1) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(boolean z) {
        LIZ = new C91250Zra();
        final C91250Zra c91250Zra = LIZ;
        new TBU(c91250Zra) { // from class: X.Zxx
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Boolean.valueOf(((C91250Zra) this.receiver).LJIILLIIL);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LJIILLIIL = ((Boolean) obj).booleanValue();
            }
        }.set(Boolean.valueOf(z));
        final C91250Zra c91250Zra2 = LIZ;
        LIZJ(new TBU(c91250Zra2) { // from class: X.Zxn
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LIZ);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((C91250Zra) this.receiver).LIZ = ((Number) obj).longValue();
            }
        });
    }

    public static void LIZJ(TBU tbu) {
        tbu.set(Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
