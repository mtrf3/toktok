package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.N1v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC58695N1v implements InterfaceC58699N1z<String> {
    public static final EnumC58695N1v INSERT_TIMEOUT;
    public static final /* synthetic */ EnumC58695N1v[] LJLILLLLZI;
    public final String LJLIL = "insert_timeout";

    public static EnumC58695N1v valueOf(String str) {
        return (EnumC58695N1v) V0N.LJJJ(EnumC58695N1v.class, str);
    }

    public static EnumC58695N1v[] values() {
        return (EnumC58695N1v[]) LJLILLLLZI.clone();
    }

    static {
        EnumC58695N1v enumC58695N1v = new EnumC58695N1v();
        INSERT_TIMEOUT = enumC58695N1v;
        LJLILLLLZI = new EnumC58695N1v[]{enumC58695N1v};
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }
}
