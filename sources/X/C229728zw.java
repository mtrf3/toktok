package X;

/* renamed from: X.8zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229728zw implements InterfaceC197277oh {
    public final InterfaceC46645ISj LIZ;

    public final boolean LIZ() {
        InterfaceC46645ISj interfaceC46645ISj = this.LIZ;
        if (interfaceC46645ISj != null && interfaceC46645ISj.isMute()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC197277oh
    public final long getCurrentPosition() {
        InterfaceC46645ISj interfaceC46645ISj = this.LIZ;
        if (interfaceC46645ISj == null) {
            return 0L;
        }
        return interfaceC46645ISj.getCurrentPosition();
    }

    @Override // X.InterfaceC197277oh
    public final ITI getVideoInfo() {
        InterfaceC46645ISj interfaceC46645ISj = this.LIZ;
        if (interfaceC46645ISj == null) {
            return null;
        }
        return interfaceC46645ISj.getVideoInfo();
    }

    public C229728zw(InterfaceC46645ISj interfaceC46645ISj) {
        this.LIZ = interfaceC46645ISj;
    }
}
