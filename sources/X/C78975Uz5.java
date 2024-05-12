package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.MtCertStatusEnum;
import com.ss.android.ugc.aweme.setting.verification.MtCertingActionEnum;
import com.ss.android.ugc.aweme.setting.verification.VerificationApi;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Uz5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78975Uz5 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C73318Sq2 LIZ = new C73318Sq2();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r1.booleanValue() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (X.C213948aU.LIZ() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        LIZ(r2, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.profile.model.User r4, X.C78915Uy7 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r2 = 0
            X.2YJ r0 = X.C2YJ.LIZIZ     // Catch: X.C158056If -> L1d
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: X.C158056If -> L1d
            com.ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings r0 = r0.getMtcertSettings()     // Catch: X.C158056If -> L1d
            java.lang.Boolean r1 = r0.getEnableChangeHandleNotice()     // Catch: X.C158056If -> L1d
            java.lang.String r0 = "{\n                Settin…andleNotice\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: X.C158056If -> L1d
            boolean r0 = r1.booleanValue()     // Catch: X.C158056If -> L1d
            if (r0 != 0) goto L23
        L1d:
            boolean r0 = X.C213948aU.LIZ()
            if (r0 == 0) goto L24
        L23:
            r2 = 1
        L24:
            r3.LIZ(r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78975Uz5.LIZIZ(com.ss.android.ugc.aweme.profile.model.User, X.Uy7):void");
    }

    public final void LIZ(boolean z, User user, C78915Uy7 c78915Uy7) {
        o.LJIIIZ(user, "user");
        if (z) {
            VerificationApi.LIZ.getClass();
            Object create = C78976Uz6.LIZIZ.createNewRetrofit(C74712wV.LIZ).create(VerificationApi.class);
            o.LJIIIIZZ(create, "retrofitService.createNe…ificationApi::class.java)");
            ((VerificationApi) create).requestVerification(user.getSecUid()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C78919UyB(c78915Uy7, this));
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        c78915Uy7.LJJIII(verificationResponse);
        c78915Uy7.LJJIFFI();
    }
}
