package X;

/* renamed from: X.0IG, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0IG {
    NONE(0),
    EC_SECP256K1(1),
    EC_SECP256R1(2);

    public final int value;

    public static C0IG valueOf(String str) {
        return (C0IG) V0N.LJJJ(C0IG.class, str);
    }

    C0IG(int i) {
        this.value = i;
    }
}
