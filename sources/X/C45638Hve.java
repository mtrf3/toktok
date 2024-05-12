package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Hve, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45638Hve implements InterfaceC45643Hvj {
    public final /* synthetic */ C45628HvU LIZ;

    public C45638Hve(C45628HvU c45628HvU) {
        this.LIZ = c45628HvU;
    }

    @Override // X.InterfaceC45643Hvj
    public final void LIZ(boolean z) {
        Integer valueOf;
        int i;
        Integer valueOf2;
        int i2;
        if (z) {
            InterfaceC45637Hvd interfaceC45637Hvd = C45628HvU.LLJILJIL;
            if (interfaceC45637Hvd == null || (valueOf2 = Integer.valueOf(interfaceC45637Hvd.LIZ())) == null) {
                return;
            }
            if (valueOf2.intValue() == 1 || valueOf2.intValue() == 4) {
                i2 = R.string.gpg;
            } else if (valueOf2.intValue() == 2) {
                i2 = R.string.gpf;
            } else if (valueOf2.intValue() != 3) {
                return;
            } else {
                i2 = R.string.gpe;
            }
            this.LIZ.LLILZ(i2);
            return;
        }
        InterfaceC45637Hvd interfaceC45637Hvd2 = C45628HvU.LLJILJIL;
        if (interfaceC45637Hvd2 == null || (valueOf = Integer.valueOf(interfaceC45637Hvd2.LIZ())) == null) {
            return;
        }
        if (valueOf.intValue() == 1 || valueOf.intValue() == 4) {
            i = R.string.gpj;
        } else if (valueOf.intValue() == 2) {
            i = R.string.gpi;
        } else if (valueOf.intValue() != 3) {
            return;
        } else {
            i = R.string.gph;
        }
        this.LIZ.LLILZ(i);
    }
}
