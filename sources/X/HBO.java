package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;

/* loaded from: classes8.dex */
public class HBO implements InterfaceC42801Gqz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.HBN] */
    @Override // X.InterfaceC41387GMd
    public final void LIZ(String str, final InterfaceC15040iS interfaceC15040iS) {
        new ChallengeModule().LIZ(str, new InterfaceC41846Gba() { // from class: X.HBN
            @Override // X.InterfaceC41846Gba
            public final void accept(Object obj) {
                Challenge challenge;
                InterfaceC15040iS interfaceC15040iS2 = InterfaceC15040iS.this;
                ChallengeDetail challengeDetail = (ChallengeDetail) obj;
                if (challengeDetail != null && (challenge = challengeDetail.challenge) != null) {
                    new HWD();
                    interfaceC15040iS2.accept(HWD.LIZ(challenge));
                }
            }
        });
    }
}
