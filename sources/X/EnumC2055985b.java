package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.85b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2055985b {
    public static final EnumC2055985b HASHTAG;
    public static final /* synthetic */ EnumC2055985b[] LJLILLLLZI;
    public final char LJLIL = '#';

    public static EnumC2055985b valueOf(String str) {
        return (EnumC2055985b) V0N.LJJJ(EnumC2055985b.class, str);
    }

    public static EnumC2055985b[] values() {
        return (EnumC2055985b[]) LJLILLLLZI.clone();
    }

    static {
        EnumC2055985b enumC2055985b = new EnumC2055985b();
        HASHTAG = enumC2055985b;
        LJLILLLLZI = new EnumC2055985b[]{enumC2055985b};
    }

    public final char getValue() {
        return this.LJLIL;
    }
}
