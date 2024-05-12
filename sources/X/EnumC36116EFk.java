package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EFk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC36116EFk {
    public static final EnumC36116EFk DEFAULT;
    public static final /* synthetic */ EnumC36116EFk[] LJLILLLLZI;
    public final String LJLIL = "default";

    public static EnumC36116EFk valueOf(String str) {
        return (EnumC36116EFk) V0N.LJJJ(EnumC36116EFk.class, str);
    }

    public static EnumC36116EFk[] values() {
        return (EnumC36116EFk[]) LJLILLLLZI.clone();
    }

    static {
        EnumC36116EFk enumC36116EFk = new EnumC36116EFk();
        DEFAULT = enumC36116EFk;
        LJLILLLLZI = new EnumC36116EFk[]{enumC36116EFk};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
