package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KzX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC53523KzX implements L4O {
    public static final EnumC53523KzX LIVE;
    public static final /* synthetic */ EnumC53523KzX[] LJLILLLLZI;
    public final String LJLIL = "live";

    public static EnumC53523KzX valueOf(String str) {
        return (EnumC53523KzX) V0N.LJJJ(EnumC53523KzX.class, str);
    }

    public static EnumC53523KzX[] values() {
        return (EnumC53523KzX[]) LJLILLLLZI.clone();
    }

    static {
        EnumC53523KzX enumC53523KzX = new EnumC53523KzX();
        LIVE = enumC53523KzX;
        LJLILLLLZI = new EnumC53523KzX[]{enumC53523KzX};
    }

    @Override // X.L4O
    public String getString() {
        return this.LJLIL;
    }
}
