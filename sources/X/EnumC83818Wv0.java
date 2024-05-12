package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Wv0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC83818Wv0 implements InterfaceC83821Wv3<EnumC83818Wv0> {
    public static final /* synthetic */ EnumC83818Wv0[] LJLILLLLZI;
    public static final EnumC83818Wv0 RECORD_VIDEO;
    public final String LJLIL = "record_video";

    public static EnumC83818Wv0 valueOf(String str) {
        return (EnumC83818Wv0) V0N.LJJJ(EnumC83818Wv0.class, str);
    }

    public static EnumC83818Wv0[] values() {
        return (EnumC83818Wv0[]) LJLILLLLZI.clone();
    }

    static {
        EnumC83818Wv0 enumC83818Wv0 = new EnumC83818Wv0();
        RECORD_VIDEO = enumC83818Wv0;
        LJLILLLLZI = new EnumC83818Wv0[]{enumC83818Wv0};
    }

    public final String getStrategyKey() {
        return this.LJLIL;
    }
}
