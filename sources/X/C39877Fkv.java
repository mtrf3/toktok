package X;

import Y.ARunnableS42S0100000_6;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39877Fkv implements InterfaceC39875Fkt {
    public final /* synthetic */ ARunnableS42S0100000_6 LIZ;

    public C39877Fkv(ARunnableS42S0100000_6 aRunnableS42S0100000_6) {
        this.LIZ = aRunnableS42S0100000_6;
    }

    @Override // X.InterfaceC39875Fkt
    public final void LIZ(String url, SSPResponse.Data data) {
        String str;
        o.LJIIJ(url, "url");
        C39878Fkw c39878Fkw = (C39878Fkw) this.LIZ.l0;
        c39878Fkw.LJLJJLL = data;
        C39879Fkx c39879Fkx = c39878Fkw.LJLIL;
        if (data == null || (str = data.logID) == null) {
            str = "";
        }
        c39879Fkx.getClass();
        c39879Fkx.LJIIIZ = str;
        if (((C39878Fkw) this.LIZ.l0).LJLJJLL != null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZIZ = C25620zW.LIZIZ("fetch ssp response data success. url: ", url, ", timestamp: ");
            LIZIZ.append(System.currentTimeMillis());
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZIZ), null, "SspLifeCycle", 2);
            C39878Fkw c39878Fkw2 = (C39878Fkw) this.LIZ.l0;
            c39878Fkw2.LJLIL.LJIILLIIL = Long.valueOf(System.currentTimeMillis());
            if (c39878Fkw2.LJLJJL != null) {
                C37755Ern.LIZ(new ARunnableS42S0100000_6(c39878Fkw2, 90));
                return;
            }
            return;
        }
        C39048FUe.LIZIZ.LIZ(i0.LJFF("fetch ssp response data failed. url: ", url), EnumC39866Fkk.E, "SspLifeCycle");
    }
}
