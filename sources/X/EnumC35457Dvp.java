package X;

/* renamed from: X.Dvp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35457Dvp {
    NORMAL_LIVE_ROOM(0),
    MIC_ROOM(1),
    WHITE_LIST_MIC_ROOM(2);

    public int LJLIL;

    public static EnumC35457Dvp valueOf(String str) {
        return (EnumC35457Dvp) V0N.LJJJ(EnumC35457Dvp.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final void setType(int i) {
        this.LJLIL = i;
    }

    EnumC35457Dvp(int i) {
        this.LJLIL = i;
    }
}
