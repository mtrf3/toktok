package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.IMk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC46490IMk {
    public static final /* synthetic */ EnumC46490IMk[] LJLILLLLZI;
    public static final EnumC46490IMk MANAGE_MY_ACCOUNT;
    public final String LJLIL = "manage_my_account";

    public static EnumC46490IMk valueOf(String str) {
        return (EnumC46490IMk) V0N.LJJJ(EnumC46490IMk.class, str);
    }

    public static EnumC46490IMk[] values() {
        return (EnumC46490IMk[]) LJLILLLLZI.clone();
    }

    static {
        EnumC46490IMk enumC46490IMk = new EnumC46490IMk();
        MANAGE_MY_ACCOUNT = enumC46490IMk;
        LJLILLLLZI = new EnumC46490IMk[]{enumC46490IMk};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
