package X;

/* renamed from: X.3Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79913Br {
    public static /* synthetic */ InterfaceC65462ha LIZ(InterfaceC79903Bq interfaceC79903Bq, XKW xkw, int i, XKI xki, int i2) {
        MBA mba = xkw;
        if ((i2 & 1) != 0) {
            mba = MBB.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            xki = XKI.SUSPEND;
        }
        return interfaceC79903Bq.fuse(mba, i, xki);
    }
}
