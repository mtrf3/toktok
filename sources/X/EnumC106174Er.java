package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC106174Er {
    public static final /* synthetic */ EnumC106174Er[] LJLILLLLZI;
    public static final EnumC106174Er QUICK_REACTION;
    public final String LJLIL = "quick_reaction";

    public static EnumC106174Er valueOf(String str) {
        return (EnumC106174Er) V0N.LJJJ(EnumC106174Er.class, str);
    }

    public static EnumC106174Er[] values() {
        return (EnumC106174Er[]) LJLILLLLZI.clone();
    }

    static {
        EnumC106174Er enumC106174Er = new EnumC106174Er();
        QUICK_REACTION = enumC106174Er;
        LJLILLLLZI = new EnumC106174Er[]{enumC106174Er};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
