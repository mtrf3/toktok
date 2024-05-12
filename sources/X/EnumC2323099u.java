package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.99u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2323099u {
    public static final /* synthetic */ EnumC2323099u[] LJLILLLLZI;
    public static final EnumC2323099u PROFILE_RIT;
    public final int LJLIL = 1;

    public static EnumC2323099u valueOf(String str) {
        return (EnumC2323099u) V0N.LJJJ(EnumC2323099u.class, str);
    }

    public static EnumC2323099u[] values() {
        return (EnumC2323099u[]) LJLILLLLZI.clone();
    }

    static {
        EnumC2323099u enumC2323099u = new EnumC2323099u();
        PROFILE_RIT = enumC2323099u;
        LJLILLLLZI = new EnumC2323099u[]{enumC2323099u};
    }

    public final int getTYPE() {
        return this.LJLIL;
    }
}
