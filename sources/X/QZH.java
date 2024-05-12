package X;

/* loaded from: classes12.dex */
public enum QZH implements InterfaceC67490QeE {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int LJLIL;

    @Override // X.InterfaceC67490QeE
    public int getNumber() {
        return this.LJLIL;
    }

    public static QZH valueOf(String str) {
        return (QZH) V0N.LJJJ(QZH.class, str);
    }

    QZH(int i) {
        this.LJLIL = i;
    }
}
