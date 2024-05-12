package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Pzm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC66278Pzm {
    public static final EnumC66278Pzm ACTION;
    public static final /* synthetic */ EnumC66278Pzm[] LJLILLLLZI;
    public final String LJLIL = "action";

    static {
        EnumC66278Pzm enumC66278Pzm = new EnumC66278Pzm();
        ACTION = enumC66278Pzm;
        LJLILLLLZI = new EnumC66278Pzm[]{enumC66278Pzm};
    }

    public static EnumC66278Pzm valueOf(String str) {
        return (EnumC66278Pzm) V0N.LJJJ(EnumC66278Pzm.class, str);
    }

    public static EnumC66278Pzm[] values() {
        return (EnumC66278Pzm[]) LJLILLLLZI.clone();
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
