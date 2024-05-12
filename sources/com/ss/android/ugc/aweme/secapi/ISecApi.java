package com.ss.android.ugc.aweme.secapi;

import X.EnumC66897QNh;
import X.QNA;
import X.QND;
import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ISecApi {
    void dismissCaptcha();

    Map<String, String> frameSign(String str, int i);

    void initSec(Context context, String str, int i, String str2, String str3, boolean z, QND qnd);

    void initTask();

    boolean isCaptchaUrl(String str);

    boolean needVerifyImage(int i);

    String onEvent();

    void popCaptcha(Activity activity, int i, QNA qna);

    void popCaptchaV2(Activity activity, String str, QNA qna);

    void reportData(String str);

    void setParams();

    void updateCollectMode(EnumC66897QNh enumC66897QNh);

    void updateDeviceIdAndInstallId(String str, String str2);
}
