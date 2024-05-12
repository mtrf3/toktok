package com.ss.android.ugc.aweme.profile.edit;

import X.AWX;
import X.ActivityC45651qj;
import X.C10K;
import X.C188727au;
import X.C221108m2;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C2U8;
import X.C5H3;
import X.C64918Pdq;
import X.C65176Pi0;
import X.C65177Pi1;
import X.C65465Pmf;
import X.C66553QAb;
import X.C66554QAc;
import X.C82544WaS;
import X.C9WB;
import X.EnumC243849hc;
import X.FMX;
import X.HG3;
import X.InterfaceC66555QAd;
import X.InterfaceC67707Qhj;
import X.PP8;
import X.QA1;
import X.QAT;
import X.RBX;
import X.X1D;
import Y.ACallableS88S0200000_11;
import Y.ARunnableS47S0100000_11;
import Y.AgS128S0100000_11;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class YoutubePresenter implements InterfaceC67707Qhj, WeakHandler.IHandler {
    public static final C66554QAc Companion = new C66554QAc();
    public static final boolean DEBUG = false;
    public final ActivityC45651qj activity;
    public QAT credential;
    public String googleClientId;
    public final PP8 httpTransport;
    public final C5H3 isGoogleServiceAvailable$delegate;
    public final C66553QAb jsonFactory;
    public String redirectUri;
    public WeakHandler weakHandler;
    public final InterfaceC66555QAd youTubeView;

    public final void authorize() {
        if (!isGoogleServiceAvailable()) {
            onError$default(this, new Exception("Google service is not available, aborting."), null, "before_goto_URL", null, 10, null);
        } else {
            C82544WaS.LIZIZ(new ARunnableS47S0100000_11(this, 47), "YoutubeApi");
        }
    }

    @Override // X.InterfaceC67712Qho
    public void onConnectionFailed(ConnectionResult p0) {
        o.LJIIIZ(p0, "p0");
    }

    private final boolean isGoogleServiceAvailable() {
        return ((Boolean) this.isGoogleServiceAvailable$delegate.getValue()).booleanValue();
    }

    public final void remove() {
        C82544WaS.LIZ(new ARunnableS47S0100000_11(this, 48));
    }

    public final ActivityC45651qj getActivity() {
        return this.activity;
    }

    private final String getUserAgent(C65465Pmf c65465Pmf) {
        c65465Pmf.getClass();
        String LIZJ = new C65176Pi0(new C65177Pi1(c65465Pmf)).LJLJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "youtube.channels().list(….requestHeaders.userAgent");
        return LIZJ;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        User user;
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof Exception) && obj != null) {
            if (obj instanceof UserResponse) {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                user = ((UserResponse) obj).getUser();
            } else {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj;
            }
            if (message.what == 112 && user != null) {
                HG3.LJIILL().updateCurUser(user);
                C2U8.LIZ(new AWX(HG3.LJIILL().getCurUser()));
            }
        }
    }

    public final void onActivityResult(Intent intent) {
        if (intent == null) {
            onError$default(this, new Exception("onActivityResult called with null Intent"), null, "goto_URL_and_auth", null, 10, null);
        } else {
            C10K.LIZJ(new ACallableS88S0200000_11(intent, this, 0)).LIZLLL(new AgS128S0100000_11(this, 1));
        }
    }

    public YoutubePresenter(ActivityC45651qj activity, InterfaceC66555QAd youTubeView) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(youTubeView, "youTubeView");
        this.activity = activity;
        this.youTubeView = youTubeView;
        this.redirectUri = "";
        this.googleClientId = "";
        this.weakHandler = new WeakHandler(this);
        this.httpTransport = new C64918Pdq();
        this.jsonFactory = new C66553QAb();
        this.isGoogleServiceAvailable$delegate = C221108m2.LIZIZ(new AqS161S0100000_11(this, 52));
    }

    public final void requestLinkYouTube(C65465Pmf c65465Pmf, QA1 qa1) {
        YoutubeApi.YouTubeResponse youTubeResponse;
        Integer num;
        String str = null;
        Integer num2 = null;
        r2 = null;
        String str2 = null;
        try {
            youTubeResponse = YoutubeApi.LIZ.link(qa1.LJ, null, "", "", getUserAgent(c65465Pmf), qa1.LIZ, qa1.LIZIZ).get();
            if (youTubeResponse != null && (num = youTubeResponse.statusCode) != null) {
                if (num.intValue() == 0) {
                    ((RBX) HG3.LJIILL()).queryUser(this.weakHandler);
                    YoutubeApi.YouTubeResponse.YoutubeChannelStruct youtubeChannelStruct = youTubeResponse.youtubeData;
                    if (youtubeChannelStruct != null) {
                        str = youtubeChannelStruct.channelTitle;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        YoutubeApi.YouTubeResponse.YoutubeChannelStruct youtubeChannelStruct2 = youTubeResponse.youtubeData;
                        if (youtubeChannelStruct2 != null) {
                            str2 = youtubeChannelStruct2.channelTitle;
                        }
                    } else {
                        YoutubeApi.YouTubeResponse.YoutubeChannelStruct youtubeChannelStruct3 = youTubeResponse.youtubeData;
                        if (youtubeChannelStruct3 != null) {
                            str2 = youtubeChannelStruct3.channelId;
                        }
                    }
                    this.youTubeView.wd(str2);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("platform", "youtube");
                    FMX.LJIIL("social_account_bind_success", c188727au.LIZ);
                    C244329iO c244329iO = new C244329iO("click_save", C9WB.SOCIAL_ACCOUNT_BIND);
                    c244329iO.LJI = EnumC243849hc.YOUTUBE;
                    C244309iM.LJ(new C244319iN(c244329iO));
                    return;
                }
                if (num.intValue() == 3004005) {
                    onError$default(this, null, this.activity.getString(R.string.pfk), "sever_get_user_info", youTubeResponse, 1, null);
                    return;
                }
            }
        } catch (Exception unused) {
            youTubeResponse = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("YouTube link request error: ");
        if (youTubeResponse != null) {
            num2 = youTubeResponse.statusCode;
        }
        LIZ.append(num2);
        onError$default(this, new Exception(X1D.LIZIZ(LIZ)), null, "sever_get_user_info", youTubeResponse, 2, null);
    }

    private final void onError(Exception exc, String str, String str2, YoutubeApi.YouTubeResponse youTubeResponse) {
        onError(false, null, str, exc, youTubeResponse, str2);
    }

    public final void onError(boolean z, Integer num, String str, Exception exc, YoutubeApi.YouTubeResponse youTubeResponse, String str2) {
        YoutubeApi.YouTubeResponse.YouTubeErrorStruct youTubeErrorStruct;
        if (DEBUG) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError ");
            if (youTubeResponse != null) {
                youTubeErrorStruct = youTubeResponse.errorStruct;
            } else {
                youTubeErrorStruct = null;
            }
            LIZ.append(youTubeErrorStruct);
            X1D.LIZIZ(LIZ);
        }
        String LIZ2 = YoutubeApi.LIZ(this.activity, exc, num, youTubeResponse);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", "youtube");
        c188727au.LJIIIZ("error_desc", LIZ2);
        c188727au.LJIIIZ("error_code", str2);
        FMX.LJIIL("social_account_bind_failure", c188727au.LIZ);
        if (z) {
            this.youTubeView.wd(null);
            str = this.activity.getString(R.string.s7n, "YouTube");
        } else if (str == null) {
            ActivityC45651qj activity = this.activity;
            o.LJIIIZ(activity, "activity");
            if (s.LJJJLZIJ(LIZ2, "User cancelled", false)) {
                str = activity.getString(R.string.s7n, "YouTube");
                o.LJIIIIZZ(str, "{\n                activi…ernal, YTB)\n            }");
            } else if (s.LJJJLZIJ(LIZ2, "AuthorizationException", false)) {
                str = activity.getString(R.string.s7p, "YouTube");
                o.LJIIIIZZ(str, "{\n                activi…known, YTB)\n            }");
            } else {
                str = activity.getString(R.string.s7o, "YouTube", "YouTube");
                o.LJIIIIZZ(str, "{\n                activi…, YTB, YTB)\n            }");
            }
        }
        o.LJIIIIZZ(str, "if (cancelled) {\n       …ity, errorDesc)\n        }");
        this.youTubeView.PL(str);
    }

    public static /* synthetic */ void onError$default(YoutubePresenter youtubePresenter, Exception exc, String str, String str2, YoutubeApi.YouTubeResponse youTubeResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            youTubeResponse = null;
        }
        youtubePresenter.onError(exc, str, str2, youTubeResponse);
    }

    public static /* synthetic */ void onError$default(YoutubePresenter youtubePresenter, boolean z, Integer num, String str, Exception exc, YoutubeApi.YouTubeResponse youTubeResponse, String str2, int i, Object obj) {
        if ((i & 32) != 0) {
            str2 = "";
        }
        youtubePresenter.onError(z, num, str, exc, youTubeResponse, str2);
    }
}
