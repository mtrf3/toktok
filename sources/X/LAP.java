package X;

import com.ss.android.ugc.aweme.experiment.InterestGroupSetting;
import com.ss.android.ugc.aweme.feed.interest.model.InterestListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class LAP<T> implements InterfaceC64592gB {
    public static final LAP<T> LJLIL = new LAP<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        Integer num;
        Integer num2;
        InterestListResponse interestListResponse = (InterestListResponse) obj;
        if (interestListResponse == null || (num2 = interestListResponse.statusCode) == null || num2.intValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
        if (!z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InterestSelectExperiment");
            LIZ.append(",status:");
            if (interestListResponse != null) {
                num = interestListResponse.statusCode;
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(",msg:");
            if (interestListResponse != null) {
                str = interestListResponse.statusMsg;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            C36922EeM.LIZLLL(6, "InterestSelectExperiment", LIZIZ);
            throw new RuntimeException(LIZIZ);
        }
        C36922EeM.LIZLLL(4, "InterestSelectExperiment", "request ok");
        Aweme aweme = interestListResponse.aweme;
        if (aweme == null || aweme.getAid() == null || interestListResponse.interestList == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("requestId:");
        LIZ2.append(interestListResponse.requestIdInner);
        LIZ2.append(",logPb:");
        LIZ2.append(interestListResponse.logPb);
        C36922EeM.LIZLLL(4, "InterestSelectExperiment", X1D.LIZIZ(LIZ2));
        interestListResponse.requestIdInner = "user_interest_show_strategy";
        C3A5.LIZ.LJFF("user_interest_show_strategy", interestListResponse.logPb);
        FW5.LJIIJJI(0, interestListResponse.requestIdInner, Arrays.asList(interestListResponse.aweme));
        LAL.LJIIIIZZ = interestListResponse.aweme;
        try {
            InterestGroupSetting interestGroupSetting = LAL.LIZJ;
            if (interestGroupSetting == null) {
                return;
            }
            if (interestGroupSetting.group != 1) {
                return;
            }
            LAL.LIZ(C84763XOl.LJIIIIZZ());
        } catch (Throwable unused) {
        }
    }
}
