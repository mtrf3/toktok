package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class NQX implements InterfaceC58572Mym {
    public static final /* synthetic */ NQX[] LJLIL;
    public static final NQX PROGRESS_25P;
    public static final NQX PROGRESS_50P;
    public static final NQX PROGRESS_75P;

    public NQX() {
        throw null;
    }

    public static NQX valueOf(String str) {
        return (NQX) V0N.LJJJ(NQX.class, str);
    }

    public static NQX[] values() {
        return (NQX[]) LJLIL.clone();
    }

    @Override // X.InterfaceC58572Mym
    public abstract /* synthetic */ String label(boolean z);

    @Override // X.InterfaceC58572Mym
    public abstract /* synthetic */ boolean valid(long j, long j2);

    static {
        NQX nqx = new NQX() { // from class: X.NQg
            @Override // X.NQX, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_firstquartile" : "first_quartile";
            }

            @Override // X.NQX, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || ((float) j) / ((float) j2) < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_25P = nqx;
        NQX nqx2 = new NQX() { // from class: X.NQh
            @Override // X.NQX, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_midpoint" : "midpoint";
            }

            @Override // X.NQX, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || ((float) j) / ((float) j2) < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_50P = nqx2;
        NQX nqx3 = new NQX() { // from class: X.NQi
            @Override // X.NQX, X.InterfaceC58572Mym
            public final String label(boolean z) {
                return z ? "view_thirdquartile" : "third_quartile";
            }

            @Override // X.NQX, X.InterfaceC58572Mym
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || ((float) j) / ((float) j2) < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_75P = nqx3;
        LJLIL = new NQX[]{nqx, nqx2, nqx3};
    }

    public final float getPercent() {
        int i = NQW.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 0.75f;
                }
                throw new C162476Zf();
            }
            return 0.5f;
        }
        return 0.25f;
    }

    public NQX(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
