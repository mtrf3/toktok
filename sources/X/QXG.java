package X;

import Y.ARunnableS12S1100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QXG extends AbstractC68941R3x {
    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        if (r4v != null) {
            try {
                if (r4v.LIZIZ) {
                    QTX qtx = new QTX(r4v.LJII);
                    qtx.LIZ();
                    JSONObject optJSONObject = qtx.LJIIL.optJSONObject("push_challenge_info");
                    if (optJSONObject != null) {
                        String challengeTicket = optJSONObject.optString("challenge_ticket");
                        String oUrl = optJSONObject.optString("o_url");
                        HG3.LJIIL();
                        InterfaceC26157AOj LJIIL = HG3.LJLJL.LJIIL();
                        o.LJIIIIZZ(challengeTicket, "challengeTicket");
                        o.LJIIIIZZ(oUrl, "oUrl");
                        LJIIL.handlePushChallengeInfo(challengeTicket, oUrl);
                    }
                    if (((Boolean) C33763DMx.LIZIZ.getValue()).booleanValue()) {
                        C68542QvC.LIZ.getClass();
                        C38995FSd.LIZIZ().execute(new ARunnableS12S1100000_11(qtx, 7));
                    } else {
                        C68542QvC.LIZ.getClass();
                        C68542QvC.LIZLLL(qtx, "refresh passport user info");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.AbstractC67055QTj
    public final /* bridge */ /* synthetic */ void onError(R4V r4v, int i) {
    }
}
