package X;

/* renamed from: X.CYp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31519CYp {
    BEFORE_SETTLE(-1),
    BEFORE_SETTLE_SIMPLE(-2),
    LOOP(-3),
    LOOP_FOR_OFF_RANK(-4),
    NONE(0),
    ENTER_RANK(1),
    LEAVE_RANK(2),
    RISE(3),
    FALL(4),
    AFTER_SETTLE(5);

    public final int LJLIL;

    public static EnumC31519CYp valueOf(String str) {
        return (EnumC31519CYp) V0N.LJJJ(EnumC31519CYp.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC31519CYp(int i) {
        this.LJLIL = i;
    }
}
