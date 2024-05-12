package X;

import Y.AUListenerS90S0100000_1;

/* renamed from: X.6gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166866gk {
    public static final /* synthetic */ int LIZJ = 0;
    public Integer LIZ;
    public C166956gt LIZIZ;

    public final void LIZIZ() {
        C166956gt c166956gt;
        C166956gt c166956gt2 = this.LIZIZ;
        if (c166956gt2 != null && c166956gt2.LIZ.isRunning() && (c166956gt = this.LIZIZ) != null) {
            c166956gt.LIZ.cancel();
        }
    }

    public final void LIZ(int i, int i2, long j, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        C166956gt c166956gt = this.LIZIZ;
        if (c166956gt != null) {
            c166956gt.LIZ.cancel();
        }
        if (i >= 100) {
            interfaceC88472Yns.invoke(100);
            return;
        }
        Integer num = this.LIZ;
        if (num == null || i != num.intValue()) {
            this.LIZ = Integer.valueOf(i);
            C166956gt c166956gt2 = new C166956gt(i, i2, j);
            this.LIZIZ = c166956gt2;
            c166956gt2.LIZ.setDuration(j);
            c166956gt2.LIZ.addUpdateListener(new AUListenerS90S0100000_1(interfaceC88472Yns, 51));
            c166956gt2.LIZ.start();
        }
    }
}
