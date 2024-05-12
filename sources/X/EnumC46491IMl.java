package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.IMl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC46491IMl {
    public static final /* synthetic */ EnumC46491IMl[] LJLILLLLZI;
    public static final EnumC46491IMl MANAGE_MY_ACCOUNT;
    public final String LJLIL = "manage_my_account";

    public static EnumC46491IMl valueOf(String str) {
        return (EnumC46491IMl) V0N.LJJJ(EnumC46491IMl.class, str);
    }

    public static EnumC46491IMl[] values() {
        return (EnumC46491IMl[]) LJLILLLLZI.clone();
    }

    static {
        EnumC46491IMl enumC46491IMl = new EnumC46491IMl();
        MANAGE_MY_ACCOUNT = enumC46491IMl;
        LJLILLLLZI = new EnumC46491IMl[]{enumC46491IMl};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
