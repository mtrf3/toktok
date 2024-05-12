package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Sx0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73750Sx0 implements InterfaceC64592gB<InterfaceC73651SvP> {
    public static final EnumC73750Sx0 INSTANCE;
    public static final /* synthetic */ EnumC73750Sx0[] LJLIL;

    static {
        EnumC73750Sx0 enumC73750Sx0 = new EnumC73750Sx0();
        INSTANCE = enumC73750Sx0;
        LJLIL = new EnumC73750Sx0[]{enumC73750Sx0};
    }

    public static EnumC73750Sx0[] values() {
        return (EnumC73750Sx0[]) LJLIL.clone();
    }

    public static EnumC73750Sx0 valueOf(String str) {
        return (EnumC73750Sx0) V0N.LJJJ(EnumC73750Sx0.class, str);
    }

    @Override // X.InterfaceC64592gB
    public void accept(InterfaceC73651SvP interfaceC73651SvP) {
        interfaceC73651SvP.request(Long.MAX_VALUE);
    }
}
