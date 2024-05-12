package X;

/* loaded from: classes9.dex */
public enum KL0 {
    LOW,
    MEDIUM,
    HIGH;

    public static KL0 valueOf(String str) {
        return (KL0) V0N.LJJJ(KL0.class, str);
    }

    public static KL0 getHigherPriority(KL0 kl0, KL0 kl02) {
        if (kl0 == null) {
            return kl02;
        }
        if (kl02 == null) {
            return kl0;
        }
        if (kl0.ordinal() > kl02.ordinal()) {
            return kl0;
        }
        return kl02;
    }
}
