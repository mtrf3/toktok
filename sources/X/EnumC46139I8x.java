package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.I8x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46139I8x {
    public static final EnumC46139I8x INSTANCE;
    public static final /* synthetic */ EnumC46139I8x[] LJLILLLLZI;
    public String LJLIL;

    static {
        EnumC46139I8x enumC46139I8x = new EnumC46139I8x();
        INSTANCE = enumC46139I8x;
        LJLILLLLZI = new EnumC46139I8x[]{enumC46139I8x};
    }

    public static EnumC46139I8x[] values() {
        return (EnumC46139I8x[]) LJLILLLLZI.clone();
    }

    public String getVideoId() {
        String str = this.LJLIL;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static EnumC46139I8x valueOf(String str) {
        return (EnumC46139I8x) V0N.LJJJ(EnumC46139I8x.class, str);
    }

    public void setVideoId(String str) {
        this.LJLIL = str;
    }
}
