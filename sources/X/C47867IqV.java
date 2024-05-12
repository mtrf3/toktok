package X;

/* renamed from: X.IqV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47867IqV extends Exception {
    public final C47789IpF LJLIL;

    public C47789IpF getError() {
        return this.LJLIL;
    }

    public C47867IqV(C47789IpF c47789IpF) {
        super(c47789IpF.toString());
        this.LJLIL = c47789IpF;
    }

    public C47867IqV(C47789IpF c47789IpF, Throwable th) {
        super(c47789IpF.toString(), th);
        this.LJLIL = c47789IpF;
    }
}
