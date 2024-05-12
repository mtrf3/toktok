package X;

/* renamed from: X.8yU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC228828yU {
    MIXCREATE(1),
    MIXDELETE(2),
    RENAME(3),
    VIDEOADD(10),
    VIDEOREMOVE(11),
    VIDEOCOMMITCHANGES(12);

    public int LJLIL;

    public static EnumC228828yU valueOf(String str) {
        return (EnumC228828yU) V0N.LJJJ(EnumC228828yU.class, str);
    }

    public final int getOperation() {
        return this.LJLIL;
    }

    public final void setOperation(int i) {
        this.LJLIL = i;
    }

    EnumC228828yU(int i) {
        this.LJLIL = i;
    }
}
