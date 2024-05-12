package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ELR {
    public static final /* synthetic */ ELR[] LJLILLLLZI;
    public static final ELR MANAGE_MY_ACCOUNT;
    public final String LJLIL = "manage_my_account";

    public static ELR valueOf(String str) {
        return (ELR) V0N.LJJJ(ELR.class, str);
    }

    public static ELR[] values() {
        return (ELR[]) LJLILLLLZI.clone();
    }

    static {
        ELR elr = new ELR();
        MANAGE_MY_ACCOUNT = elr;
        LJLILLLLZI = new ELR[]{elr};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
