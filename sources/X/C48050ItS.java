package X;

import Y.ACallableS111S0100000_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.ItS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48050ItS implements InterfaceC48512J2e {
    public final /* synthetic */ SmartFeedAdUIServiceImpl LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    public C48050ItS(SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl, Aweme aweme) {
        this.LIZ = smartFeedAdUIServiceImpl;
        this.LIZIZ = aweme;
    }

    @Override // X.InterfaceC48512J2e
    public final void LIZ(boolean z, int i, C48044ItM c48044ItM, IFF iff) {
        String str;
        String str2;
        this.LIZ.getClass();
        float f = -1.0f;
        if (z && c48044ItM != null && (str2 = c48044ItM.LIZ) != null) {
            Float LIZIZ = c48044ItM.LIZIZ();
            if (LIZIZ != null) {
                f = LIZIZ.floatValue();
            }
            SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl = this.LIZ;
            smartFeedAdUIServiceImpl.LIZLLL = str2;
            smartFeedAdUIServiceImpl.LJ = f;
            C10K.LIZJ(new ACallableS111S0100000_8(smartFeedAdUIServiceImpl, 5));
        } else {
            SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl2 = this.LIZ;
            smartFeedAdUIServiceImpl2.LIZLLL = "";
            smartFeedAdUIServiceImpl2.LJ = -1.0f;
        }
        SmartFeedAdUIService.Companion.getClass();
        if (SmartFeedAdUIService.debug) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startSmartAdUIJudge end aid:");
            LIZ.append(this.LIZIZ.getAid());
            LIZ.append('-');
            User author = this.LIZIZ.getAuthor();
            if (author != null) {
                str = author.getNickname();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" predictLabelResult:");
            LIZ.append(this.LIZ.LIZLLL);
            LIZ.append(" predictProbabilityResult:");
            LIZ.append(this.LIZ.LJ);
            LIZ.append(" success:");
            LIZ.append(z);
            LIZ.append(" errorCode:");
            LIZ.append(i);
            LIZ.append(" output:");
            LIZ.append(c48044ItM);
            X1D.LIZIZ(LIZ);
        }
    }
}
