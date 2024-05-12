package X;

/* loaded from: classes12.dex */
public enum QZJ implements InterfaceC67490QeE {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    public final int LJLIL;

    @Override // X.InterfaceC67490QeE
    public int getNumber() {
        return this.LJLIL;
    }

    public static QZJ valueOf(String str) {
        return (QZJ) V0N.LJJJ(QZJ.class, str);
    }

    QZJ(int i) {
        this.LJLIL = i;
    }
}
