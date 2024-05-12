package com.kakao.sdk.auth;

import X.C16880lQ;
import X.C29S;
import X.C32I;
import X.C65803Ps7;
import X.C78598Ut0;
import X.X1D;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TalkAuthCodeActivity extends C29S {
    public ResultReceiver resultReceiver;
    public final String EXTRA_ERROR_TYPE = "com.kakao.sdk.talk.error.type";
    public final String EXTRA_ERROR_DESCRIPTION = "com.kakao.sdk.talk.error.description";
    public final String NOT_SUPPORT_ERROR = "NotSupportError";
    public final String UNKNOWN_ERROR = "UnknownError";
    public final String PROTOCOL_ERROR = "ProtocolError";
    public final String APPLICATION_ERROR = "ApplicationError";
    public final String AUTH_CODE_ERROR = "AuthCodeError";
    public final String CLIENT_INFO_ERROR = "ClientInfoError";

    public void com_kakao_sdk_auth_TalkAuthCodeActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_kakao_sdk_auth_TalkAuthCodeActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public final String getAPPLICATION_ERROR() {
        return this.APPLICATION_ERROR;
    }

    public final String getAUTH_CODE_ERROR() {
        return this.AUTH_CODE_ERROR;
    }

    public final String getCLIENT_INFO_ERROR() {
        return this.CLIENT_INFO_ERROR;
    }

    public final String getEXTRA_ERROR_DESCRIPTION() {
        return this.EXTRA_ERROR_DESCRIPTION;
    }

    public final String getEXTRA_ERROR_TYPE() {
        return this.EXTRA_ERROR_TYPE;
    }

    public final String getNOT_SUPPORT_ERROR() {
        return this.NOT_SUPPORT_ERROR;
    }

    public final String getPROTOCOL_ERROR() {
        return this.PROTOCOL_ERROR;
    }

    public final String getUNKNOWN_ERROR() {
        return this.UNKNOWN_ERROR;
    }

    public static void com_kakao_sdk_auth_TalkAuthCodeActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(TalkAuthCodeActivity talkAuthCodeActivity) {
        talkAuthCodeActivity.com_kakao_sdk_auth_TalkAuthCodeActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                talkAuthCodeActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_kakao_sdk_auth_TalkAuthCodeActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(TalkAuthCodeActivity talkAuthCodeActivity) {
        com_kakao_sdk_auth_TalkAuthCodeActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(talkAuthCodeActivity);
        try {
            talkAuthCodeActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final void sendError(KakaoSdkError kakaoSdkError) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key.exception", kakaoSdkError);
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        ResultReceiver resultReceiver;
        Intent intent;
        Bundle LLJJIJI;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.fb);
        try {
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI2 != null) {
                Bundle bundle2 = LLJJIJI2.getBundle("key.bundle");
                if (bundle2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        resultReceiver = (ResultReceiver) bundle2.getParcelable("key.result.receiver", ResultReceiver.class);
                    } else {
                        Parcelable parcelable = bundle2.getParcelable("key.result.receiver");
                        if (parcelable != null) {
                            resultReceiver = (ResultReceiver) parcelable;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.os.ResultReceiver");
                        }
                    }
                    if (resultReceiver != null) {
                        this.resultReceiver = resultReceiver;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                int i = LLJJIJI2.getInt("key.request.code");
                SdkLog.Companion companion = SdkLog.Companion;
                companion.i(o.LJIILLIIL(Integer.valueOf(i), "requestCode: "));
                if (Build.VERSION.SDK_INT >= 33) {
                    intent = (Intent) LLJJIJI2.getParcelable("key.login.intent", Intent.class);
                } else {
                    intent = (Intent) LLJJIJI2.getParcelable("key.login.intent");
                }
                companion.i("loginIntent:");
                if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('\t');
                    Constants constants = Constants.INSTANCE;
                    LIZ.append(constants.getEXTRA_APPLICATION_KEY());
                    LIZ.append(" : ");
                    LIZ.append((Object) LLJJIJI.getString(constants.getEXTRA_APPLICATION_KEY()));
                    companion.i(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('\t');
                    LIZ2.append(constants.getEXTRA_REDIRECT_URI());
                    LIZ2.append(" : ");
                    LIZ2.append((Object) LLJJIJI.getString(constants.getEXTRA_REDIRECT_URI()));
                    companion.i(X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append('\t');
                    LIZ3.append(constants.getEXTRA_KA_HEADER());
                    LIZ3.append(" : ");
                    LIZ3.append((Object) LLJJIJI.getString(constants.getEXTRA_KA_HEADER()));
                    companion.i(X1D.LIZIZ(LIZ3));
                    Bundle bundle3 = LLJJIJI.getBundle(constants.getEXTRA_EXTRAPARAMS());
                    if (bundle3 != null) {
                        companion.i(o.LJIILLIIL(constants.getEXTRA_EXTRAPARAMS(), "\t"));
                        Set<String> keySet = bundle3.keySet();
                        o.LJIIIIZZ(keySet, "keySet()");
                        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
                        for (String str : keySet) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("\t\t");
                            LIZ4.append((Object) str);
                            LIZ4.append(" : ");
                            LIZ4.append((Object) bundle3.getString(str));
                            arrayList.add(X1D.LIZIZ(LIZ4));
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SdkLog.Companion.i((String) it.next());
                        }
                    }
                }
                C78598Ut0.LJIJJ(intent, this);
                startActivityForResult(intent, i);
                return;
            }
            throw new IllegalArgumentException("no extras.");
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            ClientError clientError = new ClientError(ClientErrorCause.Unknown, null, 2, null);
            clientError.initCause(th);
            sendError(clientError);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle bundle = new Bundle();
        if (intent == null || i2 == 0) {
            sendError(new ClientError(ClientErrorCause.Cancelled, null, 2, null));
            return;
        }
        if (i2 == -1) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI == null) {
                sendError(new ClientError(ClientErrorCause.Unknown, "No result from KakaoTalk."));
                return;
            }
            String string = LLJJIJI.getString(this.EXTRA_ERROR_TYPE);
            String string2 = LLJJIJI.getString(this.EXTRA_ERROR_DESCRIPTION);
            if (o.LJ(string, "access_denied")) {
                sendError(new ClientError(ClientErrorCause.Cancelled, null, 2, null));
                return;
            }
            if (string != null) {
                AuthErrorCause authErrorCause = (AuthErrorCause) KakaoJson.INSTANCE.fromJson(string, AuthErrorCause.class);
                if (authErrorCause == null) {
                    authErrorCause = AuthErrorCause.Unknown;
                }
                if (string2 == null) {
                    string2 = "no error description";
                }
                sendError(new AuthError(302, authErrorCause, new AuthErrorResponse(string, string2)));
                return;
            }
            bundle.putParcelable("key.url", UriProtector.parse(LLJJIJI.getString(Constants.INSTANCE.getEXTRA_REDIRECT_URL())));
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(-1, bundle);
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            o.LJIJI("resultReceiver");
            throw null;
        }
        throw new IllegalArgumentException("");
    }
}
