package X;

import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationResponse;
import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationStatus;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IS4 implements InterfaceC116954iR<CreatorVerificationResponse> {
    public final /* synthetic */ SHU LJLIL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public IS4(SHU shu) {
        this.LJLIL = shu;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(CreatorVerificationResponse creatorVerificationResponse) {
        int i;
        String str;
        CreatorVerificationResponse response = creatorVerificationResponse;
        o.LJIIIZ(response, "response");
        SHU shu = this.LJLIL;
        CreatorVerificationStatus verificationStatus = response.getVerificationStatus();
        if (verificationStatus == null || (i = IM0.LIZ[verificationStatus.ordinal()]) == -1) {
            str = "unknown";
        } else if (i != 1) {
            if (i != 2) {
                str = "unverified";
            } else {
                str = "verified";
            }
        } else {
            str = "under_assessment";
        }
        shu.LIZ(str);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJFF.LIZ(d);
    }
}
