package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dwq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC35520Dwq {
    public static final EnumC35520Dwq CODE;
    public static final /* synthetic */ EnumC35520Dwq[] LJLILLLLZI;
    public final String LJLIL = "code";

    public static EnumC35520Dwq valueOf(String str) {
        return (EnumC35520Dwq) V0N.LJJJ(EnumC35520Dwq.class, str);
    }

    public static EnumC35520Dwq[] values() {
        return (EnumC35520Dwq[]) LJLILLLLZI.clone();
    }

    static {
        EnumC35520Dwq enumC35520Dwq = new EnumC35520Dwq();
        CODE = enumC35520Dwq;
        LJLILLLLZI = new EnumC35520Dwq[]{enumC35520Dwq};
    }

    public final String getValue() {
        return this.LJLIL;
    }
}
