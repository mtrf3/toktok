package X;

import Y.AgS127S0100000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NPI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(InterfaceC59429NUb interfaceC59429NUb) {
        C10K.LJII(5000L).LIZLLL(new AgS127S0100000_10(interfaceC59429NUb, 4));
    }

    public static void LIZLLL(InterfaceC59429NUb interfaceC59429NUb) {
        C10K.LJII(((Number) C33955DUh.LIZ.getValue()).intValue() * 1000).LIZLLL(new AgS127S0100000_10(interfaceC59429NUb, 5));
    }

    public static void LIZIZ(Context context, String str, AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return;
        }
        C55707Ltf c55707Ltf = new C55707Ltf();
        c55707Ltf.LIZ = awemeRawAd;
        c55707Ltf.LIZJ = false;
        C58776N4y.LIZ("landing_ad", str, c55707Ltf.LIZ(), awemeRawAd);
        C58704N2e.LIZLLL("landing_ad", str, awemeRawAd).LJII();
    }

    public static void LIZ(NK2 nk2, String str, boolean z, boolean z2) {
        AwemeRawAd awemeRawAd = C59082NGs.LIZ;
        if (awemeRawAd == null) {
            return;
        }
        if (nk2 != null) {
            nk2.LJ(str, z);
        }
        LIZJ(new NPK(nk2, str, z, z2));
        LIZLLL(new NPJ(awemeRawAd));
    }
}
