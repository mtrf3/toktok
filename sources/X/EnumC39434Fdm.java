package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Fdm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39434Fdm {
    public static final EnumC39434Fdm Closed;
    public static final /* synthetic */ EnumC39434Fdm[] LJLILLLLZI;
    public final String LJLIL = "closed";

    static {
        EnumC39434Fdm enumC39434Fdm = new EnumC39434Fdm();
        Closed = enumC39434Fdm;
        LJLILLLLZI = new EnumC39434Fdm[]{enumC39434Fdm};
    }

    public static EnumC39434Fdm valueOf(String str) {
        return (EnumC39434Fdm) V0N.LJJJ(EnumC39434Fdm.class, str);
    }

    public static EnumC39434Fdm[] values() {
        return (EnumC39434Fdm[]) LJLILLLLZI.clone();
    }

    public final String getActionType() {
        return this.LJLIL;
    }
}
