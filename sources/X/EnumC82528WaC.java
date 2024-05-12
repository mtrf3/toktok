package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.WaC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class EnumC82528WaC {
    public static final EnumC82528WaC EPIC;
    public static final EnumC82528WaC FAST;
    public static final EnumC82528WaC LAPSE;
    public static final /* synthetic */ EnumC82528WaC[] LJLIL;
    public static final EnumC82528WaC NORMAL;
    public static final EnumC82528WaC SLOW;
    public static final EnumC82528WaC STORY_BOOM;

    public EnumC82528WaC() {
        throw null;
    }

    public abstract String description();

    public abstract float value();

    static {
        EnumC82528WaC enumC82528WaC = new EnumC82528WaC() { // from class: X.WaE
            @Override // X.EnumC82528WaC
            public final String description() {
                return "slowest";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 0.333333f;
            }
        };
        EPIC = enumC82528WaC;
        EnumC82528WaC enumC82528WaC2 = new EnumC82528WaC() { // from class: X.WaF
            @Override // X.EnumC82528WaC
            public final String description() {
                return "slower";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 0.5f;
            }
        };
        SLOW = enumC82528WaC2;
        EnumC82528WaC enumC82528WaC3 = new EnumC82528WaC() { // from class: X.WaD
            @Override // X.EnumC82528WaC
            public final String description() {
                return "normal";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 1.0f;
            }
        };
        NORMAL = enumC82528WaC3;
        EnumC82528WaC enumC82528WaC4 = new EnumC82528WaC() { // from class: X.WaG
            @Override // X.EnumC82528WaC
            public final String description() {
                return "story_boom";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 1.5f;
            }
        };
        STORY_BOOM = enumC82528WaC4;
        EnumC82528WaC enumC82528WaC5 = new EnumC82528WaC() { // from class: X.WaH
            @Override // X.EnumC82528WaC
            public final String description() {
                return "faster";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 2.0f;
            }
        };
        FAST = enumC82528WaC5;
        EnumC82528WaC enumC82528WaC6 = new EnumC82528WaC() { // from class: X.WaI
            @Override // X.EnumC82528WaC
            public final String description() {
                return "fastest";
            }

            @Override // X.EnumC82528WaC
            public final float value() {
                return 3.0f;
            }
        };
        LAPSE = enumC82528WaC6;
        LJLIL = new EnumC82528WaC[]{enumC82528WaC, enumC82528WaC2, enumC82528WaC3, enumC82528WaC4, enumC82528WaC5, enumC82528WaC6};
    }

    public static EnumC82528WaC[] values() {
        return (EnumC82528WaC[]) LJLIL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return description();
    }

    public static EnumC82528WaC fromValue(float f) {
        EnumC82528WaC enumC82528WaC = EPIC;
        if (f == enumC82528WaC.value()) {
            return enumC82528WaC;
        }
        EnumC82528WaC enumC82528WaC2 = SLOW;
        if (f == enumC82528WaC2.value()) {
            return enumC82528WaC2;
        }
        EnumC82528WaC enumC82528WaC3 = NORMAL;
        if (f == enumC82528WaC3.value()) {
            return enumC82528WaC3;
        }
        EnumC82528WaC enumC82528WaC4 = FAST;
        if (f == enumC82528WaC4.value()) {
            return enumC82528WaC4;
        }
        EnumC82528WaC enumC82528WaC5 = LAPSE;
        if (f == enumC82528WaC5.value()) {
            return enumC82528WaC5;
        }
        EnumC82528WaC enumC82528WaC6 = STORY_BOOM;
        if (f == enumC82528WaC6.value()) {
            return enumC82528WaC6;
        }
        return null;
    }

    public static EnumC82528WaC valueOf(String str) {
        return (EnumC82528WaC) V0N.LJJJ(EnumC82528WaC.class, str);
    }

    public EnumC82528WaC(String str, int i) {
    }
}
