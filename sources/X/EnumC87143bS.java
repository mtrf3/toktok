package X;

/* renamed from: X.3bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC87143bS {
    TOP(0),
    TRENDING_VIDEOS(1),
    NEW(2),
    ALL(3),
    ADDED(4),
    SET_PROFILE(5);

    public final int LJLIL;

    public static EnumC87143bS valueOf(String str) {
        return (EnumC87143bS) V0N.LJJJ(EnumC87143bS.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC87143bS(int i) {
        this.LJLIL = i;
    }
}
