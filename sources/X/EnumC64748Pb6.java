package X;

/* renamed from: X.Pb6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC64748Pb6 {
    TTRESUME(-2),
    TTHardCode(-1),
    TTCACHE(0),
    TTSERVER(1),
    TTERROR(2),
    TTPOLL(3),
    TTTNC(4),
    PORTRETRY(7),
    TTREGION(10),
    TTCRONET(20);

    public final int mValue;

    public static EnumC64748Pb6 valueOf(String str) {
        return (EnumC64748Pb6) V0N.LJJJ(EnumC64748Pb6.class, str);
    }

    EnumC64748Pb6(int i) {
        this.mValue = i;
    }
}
