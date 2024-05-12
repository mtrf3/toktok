package X;

/* renamed from: X.aX5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC93823aX5 {
    UnKnow(-1),
    Album(0),
    ResourcePackage(1),
    Text(2),
    DRAW(3),
    Camera(4),
    ThirdParty(5);

    public static final C93822aX4 Companion = new C93822aX4();
    public final int LJLIL;

    public static EnumC93823aX5 valueOf(String str) {
        return (EnumC93823aX5) V0N.LJJJ(EnumC93823aX5.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC93823aX5(int i) {
        this.LJLIL = i;
    }
}
