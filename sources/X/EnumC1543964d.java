package X;

/* renamed from: X.64d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1543964d {
    Bottom(64),
    Right(128),
    Top(512),
    Left(256),
    HorizontalSolid(32),
    VerticalSolid(16),
    HorizontalDot(8),
    VerticalDot(4),
    LeftSlash(2),
    RightSlash(1);

    public final int LJLIL;

    public static EnumC1543964d valueOf(String str) {
        return (EnumC1543964d) V0N.LJJJ(EnumC1543964d.class, str);
    }

    public final int getMark() {
        return this.LJLIL;
    }

    EnumC1543964d(int i) {
        this.LJLIL = i;
    }
}
