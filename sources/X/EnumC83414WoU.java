package X;

/* renamed from: X.WoU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC83414WoU {
    START(0),
    ACTION_EXECUTE(1),
    ACTION_CALLBACK(2),
    END(3);

    public final int LJLIL;

    public static EnumC83414WoU valueOf(String str) {
        return (EnumC83414WoU) V0N.LJJJ(EnumC83414WoU.class, str);
    }

    public final int getWhat() {
        return this.LJLIL;
    }

    EnumC83414WoU(int i) {
        this.LJLIL = i;
    }
}
