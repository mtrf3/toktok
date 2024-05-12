package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.LvQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC55816LvQ {
    public static final EnumC55816LvQ DEFAULT_D_CODE;
    public static final /* synthetic */ EnumC55816LvQ[] LJLILLLLZI;
    public final String LJLIL = "d0";

    public static EnumC55816LvQ valueOf(String str) {
        return (EnumC55816LvQ) V0N.LJJJ(EnumC55816LvQ.class, str);
    }

    public static EnumC55816LvQ[] values() {
        return (EnumC55816LvQ[]) LJLILLLLZI.clone();
    }

    static {
        EnumC55816LvQ enumC55816LvQ = new EnumC55816LvQ();
        DEFAULT_D_CODE = enumC55816LvQ;
        LJLILLLLZI = new EnumC55816LvQ[]{enumC55816LvQ};
    }

    public final String getDCode() {
        return this.LJLIL;
    }
}
