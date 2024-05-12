package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FfZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39545FfZ {
    public static final EnumC39545FfZ IMAGE;
    public static final /* synthetic */ EnumC39545FfZ[] LJLILLLLZI;
    public final String LJLIL = "image";

    public static EnumC39545FfZ valueOf(String str) {
        return (EnumC39545FfZ) V0N.LJJJ(EnumC39545FfZ.class, str);
    }

    public static EnumC39545FfZ[] values() {
        return (EnumC39545FfZ[]) LJLILLLLZI.clone();
    }

    static {
        EnumC39545FfZ enumC39545FfZ = new EnumC39545FfZ();
        IMAGE = enumC39545FfZ;
        LJLILLLLZI = new EnumC39545FfZ[]{enumC39545FfZ};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
