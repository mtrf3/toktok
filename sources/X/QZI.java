package X;

/* loaded from: classes12.dex */
public enum QZI implements InterfaceC67490QeE {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    public final int LJLIL;

    @Override // X.InterfaceC67490QeE
    public int getNumber() {
        return this.LJLIL;
    }

    public static QZI valueOf(String str) {
        return (QZI) V0N.LJJJ(QZI.class, str);
    }

    QZI(int i) {
        this.LJLIL = i;
    }
}
