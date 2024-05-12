package com.ss.android.ugc.aweme.sec;

import X.C03660Ck;
import X.C36922EeM;
import X.C38091ExD;
import X.C58096Mr6;
import X.C65083PgV;
import X.EnumC66897QNh;
import X.QNA;
import X.QND;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SecApiImpl implements ISecApi {
    public static ISecApi LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISecApi.class, false);
        if (LIZ != null) {
            return (ISecApi) LIZ;
        }
        if (C58096Mr6.M4 == null) {
            synchronized (ISecApi.class) {
                if (C58096Mr6.M4 == null) {
                    C58096Mr6.M4 = new SecApiImpl();
                }
            }
        }
        return C58096Mr6.M4;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void dismissCaptcha() {
        C36922EeM.LIZLLL(4, "Sec", "dismissCaptcha");
        DmtSec.dismissCaptcha();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final String onEvent() {
        return DmtSec.INSTANCE.onEvent();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void setParams() {
        DmtSec.INSTANCE.setParams();
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initTask() {
        C65083PgV.LIZIZ(new C38091ExD(C03660Ck.LIZJ("x-vc-bdturing-sdk-version", "2.3.3.i18n")));
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean isCaptchaUrl(String url) {
        o.LJIIIZ(url, "url");
        boolean isCaptchaUrl = DmtSec.isCaptchaUrl(url);
        if (isCaptchaUrl) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isCaptchaUrl: ");
            LIZ.append(url);
            C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        }
        return isCaptchaUrl;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final boolean needVerifyImage(int i) {
        boolean needVerifyImage = DmtSec.needVerifyImage(i);
        if (needVerifyImage) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("needVerifyImage: ");
            LIZ.append(i);
            C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        }
        return needVerifyImage;
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void reportData(String scene) {
        o.LJIIIZ(scene, "scene");
        DmtSec.report(scene);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateCollectMode(EnumC66897QNh enumC66897QNh) {
        DmtSec.INSTANCE.updateCollectMode(enumC66897QNh);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final Map<String, String> frameSign(String signData, int i) {
        o.LJIIIZ(signData, "signData");
        return DmtSec.INSTANCE.frameSign(signData, i);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void updateDeviceIdAndInstallId(String deviceId, String iid) {
        o.LJIIIZ(deviceId, "deviceId");
        o.LJIIIZ(iid, "iid");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDeviceIdAndInstallId:did = ");
        LIZ.append(deviceId);
        LIZ.append("  iid = ");
        LIZ.append(iid);
        C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        DmtSec.updateDeviceIdAndInstallId(deviceId, iid);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptcha(Activity activity, int i, QNA secCaptchaListener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(secCaptchaListener, "secCaptchaListener");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popCaptcha - errorcode = ");
        LIZ.append(i);
        C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        DmtSec.popCaptcha(i, activity, secCaptchaListener);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptchaV2(Activity activity, String riskInfo, QNA secCaptchaListener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(riskInfo, "riskInfo");
        o.LJIIIZ(secCaptchaListener, "secCaptchaListener");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popCaptchaV2 - riskInfo = ");
        LIZ.append(riskInfo);
        C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        DmtSec.INSTANCE.popCaptchaV2(riskInfo, activity, secCaptchaListener);
    }

    @Override // com.ss.android.ugc.aweme.secapi.ISecApi
    public final void initSec(Context context, String language, int i, String appName, String channel, boolean z, QND secGetDataCallBack) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(appName, "appName");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(secGetDataCallBack, "secGetDataCallBack");
        C36922EeM.LIZLLL(4, "Sec", "initSec");
        DmtSec.init(context, language, i, appName, channel, z, secGetDataCallBack);
    }
}
