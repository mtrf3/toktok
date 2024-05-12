package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.QHs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC66752QHs {
    public static final /* synthetic */ EnumC66752QHs[] LJLILLLLZI;
    public static final EnumC66752QHs USER_ID;
    public final String LJLIL = "user_id";

    static {
        EnumC66752QHs enumC66752QHs = new EnumC66752QHs();
        USER_ID = enumC66752QHs;
        LJLILLLLZI = new EnumC66752QHs[]{enumC66752QHs};
    }

    public static EnumC66752QHs[] values() {
        return (EnumC66752QHs[]) LJLILLLLZI.clone();
    }

    public String getKey() {
        return this.LJLIL;
    }

    public static EnumC66752QHs fromKey(String str) {
        for (EnumC66752QHs enumC66752QHs : values()) {
            if (enumC66752QHs.getKey().equals(str)) {
                return enumC66752QHs;
            }
        }
        return null;
    }

    public static EnumC66752QHs valueOf(String str) {
        return (EnumC66752QHs) V0N.LJJJ(EnumC66752QHs.class, str);
    }
}
