package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class AKC {
    public static final /* synthetic */ AKC[] LJLIL;
    public static final AKC PADDING_16;
    public static final AKC PADDING_28;
    public static final AKC PADDING_32;

    public AKC() {
        throw null;
    }

    public static AKC valueOf(String str) {
        return (AKC) V0N.LJJJ(AKC.class, str);
    }

    public static AKC[] values() {
        return (AKC[]) LJLIL.clone();
    }

    public abstract int toPx();

    static {
        AKC akc = new AKC() { // from class: X.AKB
            @Override // X.AKC
            public final int toPx() {
                return C7MY.LIZIZ(16);
            }
        };
        PADDING_16 = akc;
        AKC akc2 = new AKC() { // from class: X.AKE
            @Override // X.AKC
            public final int toPx() {
                return C7MY.LIZIZ(28);
            }
        };
        PADDING_28 = akc2;
        AKC akc3 = new AKC() { // from class: X.AKD
            @Override // X.AKC
            public final int toPx() {
                return C7MY.LIZIZ(32);
            }
        };
        PADDING_32 = akc3;
        LJLIL = new AKC[]{akc, akc2, akc3};
    }

    public AKC(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
