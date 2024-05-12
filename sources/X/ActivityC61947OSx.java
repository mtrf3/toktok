package X;

import Y.ARunnableS26S0200000_7;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OSx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ActivityC61947OSx extends ActivityC86117Xqz implements LEA {
    public static final OT2 Companion = new OT2();
    public String clientKey;
    public String defaultUriWithClientKey;
    public boolean isUserBanned;
    public String redirectUri;
    public java.util.Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 enableWebviewAuth$delegate = C221108m2.LIZIZ(C52315Kg3.LJLIL);

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final C188727au getBaseLoggingEventBuilder() {
        String str = this.clientKey;
        String str2 = null;
        if (str != null) {
            String LIZ = OT0.LIZ(C16880lQ.LLJJIJI(getIntent()));
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI != null) {
                str2 = LLJJIJI.getString("_aweme_params_caller_open_sdk_version");
            }
            if (str2 == null) {
                str2 = "";
            }
            return OTN.LIZ("", str, LIZ, str2, false);
        }
        o.LJIJI("clientKey");
        throw null;
    }

    private final boolean getEnableWebviewAuth() {
        return ((Boolean) this.enableWebviewAuth$delegate.getValue()).booleanValue();
    }

    private final void handleChildMode() {
        C26227ARb c26227ARb = new C26227ARb(this);
        c26227ARb.LIZIZ(getResources().getString(R.string.bvo));
        UC0.LIZJ(c26227ARb, new AqS176S0100000_10(this, 160));
        c26227ARb.LJI().LIZLLL();
    }

    private final void openLoginPage() {
        String str;
        Bundle LIZ = C0JT.LIZ("need_restart", false, "should_restart_later", false);
        LIZ.putString("sdk_name", OT0.LIZ(C16880lQ.LLJJIJI(getIntent())));
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null || (str = LLJJIJI.getString("_aweme_params_caller_open_sdk_version")) == null) {
            str = "";
        }
        LIZ.putString("sdk_version", str);
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS26S0200000_7(LIZ, this, 24), 1500L);
    }

    public final boolean isClientTTN() {
        String str = this.clientKey;
        if (str != null) {
            return o.LJ(str, "awa59ufmg5y7ikht");
        }
        o.LJIJI("clientKey");
        throw null;
    }

    private final void handleLoginStatusCheck() {
        if (HG3.LJIILL() != null) {
            if (HG3.LJIILL().isLogin()) {
                if (HG3.LJIILL().isChildrenMode()) {
                    handleChildMode();
                    return;
                } else {
                    onLoginResult(0);
                    return;
                }
            }
            C40535FvX.LIZIZ(true);
            HG3.LJIILL().delete(HG3.LJIILL().getCurUserId(), "authorize");
            openLoginPage();
            return;
        }
        onLoginResult(-1);
    }

    private final boolean isRequestComingFromWeb() {
        String str;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            str = LLJJIJI.getString("_bytedance_params_source");
        } else {
            str = null;
        }
        return o.LJ(str, "web");
    }

    private final void navigateToNativeAuthorizedFragment() {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = new BaseI18nAuthorizedFragment();
            baseI18nAuthorizedFragment.setArguments(LLJJIJI);
            LIZ.LJIIJ(baseI18nAuthorizedFragment, "native_authorize_fragment", R.id.dm7);
            LIZ.LJI();
        }
    }

    private final void navigateToWebviewFragment() {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            SparkContext createSparkContext = createSparkContext(composeWebviewAuthUrl(LLJJIJI));
            SparkFragment sparkFragment = new SparkFragment();
            Bundle bundle = new Bundle();
            C109464Ri.LIZ.getClass();
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(createSparkContext);
            bundle.putString("SparkContextContainerId", createSparkContext.containerId);
            sparkFragment.setArguments(bundle);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(sparkFragment, null, R.id.dm7);
            c1b3.LJI();
        }
    }

    private final boolean shouldEnableWebviewAuth() {
        String str;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null && LLJJIJI.getBoolean("key_qrcode_auth")) {
            return false;
        }
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI2 != null) {
            str = LLJJIJI2.getString("_aweme_params_enter_from_flag");
        } else {
            str = null;
        }
        if (o.LJ(str, "ENTER_FROM_INNER_WEB") || ((Number) C52861Kor.LIZ.getValue()).intValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AccountService.LJIJ().LJIILLIIL(this);
    }

    private final void addIdentifierForChildMode(Intent intent) {
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier("third_party_app_identifier");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        if (r2.appendQueryParameter("code_challenge", r5).appendQueryParameter("app_identity", r4).appendQueryParameter("certificate", X.OU1.LIZ(r1, r3)) == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri.Builder composeWebviewAuthUrl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActivityC61947OSx.composeWebviewAuthUrl(android.os.Bundle):android.net.Uri$Builder");
    }

    private final SparkContext createSparkContext(Uri.Builder builder) {
        Uri.Builder appendQueryParameter = C0F1.LIZ("aweme://webview/").appendQueryParameter("url", builder.build().toString());
        SparkContext sparkContext = new SparkContext();
        String uri = appendQueryParameter.build().toString();
        o.LJIIIIZZ(uri, "sparkUriBuilder.build().toString()");
        sparkContext.LJJIJLIJ(uri);
        sparkContext.LJJ(new C61473OAr(this));
        sparkContext.LJJI(new C61475OAt());
        return sparkContext;
    }

    private final String hashPackageNameWithSha256(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        o.LJIIIIZZ(digest, "getInstance(\"SHA-256\")\n …ackageName.toByteArray())");
        String str2 = "";
        for (byte b : digest) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            String LLLZ = C16880lQ.LLLZ("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            o.LJIIIIZZ(LLLZ, "format(this, *args)");
            LIZ.append(LLLZ);
            str2 = X1D.LIZIZ(LIZ);
        }
        return str2;
    }

    private final void onLoginResult(int i) {
        if (i != 0) {
            sendFailureResponse(OT1.LIZ(-30, OTS.ACCESS_DENIED, null));
        } else if (shouldEnableWebviewAuth()) {
            FMX.LJIIL("auth_open_webview", getBaseLoggingEventBuilder().LIZ);
            navigateToWebviewFragment();
        } else {
            navigateToNativeAuthorizedFragment();
        }
    }

    private final void sendFailureResponse(C61948OSy c61948OSy) {
        logAuthFailureResult(c61948OSy.errorCode, c61948OSy.errorMsg);
        sendResponse(c61948OSy);
    }

    private final void sendResponseWithRedirectUrl(C61948OSy c61948OSy) {
        String str;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null || (str = LLJJIJI.getString("_bytedance_params_redirect_uri")) == null) {
            str = "";
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        if (c61948OSy.LIZ.length() > 0) {
            buildUpon.appendQueryParameter("code", c61948OSy.LIZ);
            buildUpon.appendQueryParameter("scopes", c61948OSy.LIZJ);
            String str2 = c61948OSy.LIZIZ;
            if (str2 != null) {
                buildUpon.appendQueryParameter("state", str2);
            }
        } else {
            String str3 = c61948OSy.LIZLLL;
            if (str3 != null) {
                buildUpon.appendQueryParameter("error", str3);
            }
            buildUpon.appendQueryParameter("errCode", String.valueOf(c61948OSy.errorCode));
            String str4 = c61948OSy.LJ;
            if (str4 != null) {
                buildUpon.appendQueryParameter("error_description", str4);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(buildUpon.build());
        addIdentifierForChildMode(intent);
        try {
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void sendResponseWithRequestPackageName(C61948OSy c61948OSy) {
        String string;
        String callingPackage = getCallingPackage();
        String str = null;
        if (callingPackage == null) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI != null) {
                callingPackage = LLJJIJI.getString("_bytedance_params_type_caller_package");
            } else {
                callingPackage = null;
            }
        }
        if (TextUtils.equals(EF7.LIZIZ().getPackageName(), callingPackage)) {
            return;
        }
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI2 == null || (string = LLJJIJI2.getString("_bytedance_params_from_entry")) == null) {
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity != null) {
                str = callingActivity.getClassName();
            }
        } else {
            str = string;
        }
        if (callingPackage == null || callingPackage.length() == 0 || str == null || str.length() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        c61948OSy.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callingPackage, str));
        intent.putExtras(bundle);
        addIdentifierForChildMode(intent);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void buildAndSendAuthResponseFromWebviewRedirect(String str) {
        android.net.Uri parse = UriProtector.parse(str);
        String queryParameter = UriProtector.getQueryParameter(parse, "code");
        if (C78857UxB.LJJJIL(queryParameter)) {
            sendResponse(new C61948OSy(queryParameter, UriProtector.getQueryParameter(parse, "state"), UriProtector.getQueryParameter(parse, "scopes"), null, null, null, 56));
        } else {
            C61948OSy c61948OSy = new C61948OSy(null, null, null, UriProtector.getQueryParameter(parse, "error"), UriProtector.getQueryParameter(parse, "error_description"), null, 39);
            c61948OSy.errorCode = -2;
            sendResponse(c61948OSy);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C85999Xp5.LJFF(this);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        activityConfiguration(GDS.LJLIL);
        super.onCreate(bundle);
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null || (str = LLJJIJI.getString("_bytedance_params_client_key")) == null) {
            str = "";
        }
        this.clientKey = str;
        C188727au baseLoggingEventBuilder = getBaseLoggingEventBuilder();
        baseLoggingEventBuilder.LIZLLL(((RBX) HG3.LJIILL()).isLogin() ? 1 : 0, "is_login");
        baseLoggingEventBuilder.LJFF(Boolean.valueOf(shouldEnableWebviewAuth()), "is_webview_auth");
        FMX.LJIIL("auth_init", baseLoggingEventBuilder.LIZ);
        String str2 = this.clientKey;
        if (str2 != null) {
            if (str2.length() == 0) {
                finish();
            }
            StringBuilder LIZ = X1D.LIZ();
            String str3 = this.clientKey;
            if (str3 != null) {
                this.defaultUriWithClientKey = JBR.LJFF(LIZ, str3, "://response.bridge.tiktok.com/oauth", LIZ);
                C85999Xp5.LJFF(this);
                setContentView(R.layout.dq);
                handleLoginStatusCheck();
                AccountService.LJIJ().LJIILJJIL(this);
                return;
            }
            o.LJIJI("clientKey");
            throw null;
        }
        o.LJIJI("clientKey");
        throw null;
    }

    @QD3
    public final void onUserBannedEvent(C62950OnC event) {
        o.LJIIIZ(event, "event");
        this.isUserBanned = true;
    }

    public final void sendResponse(C61948OSy c61948OSy) {
        if (OT0.LIZ(C16880lQ.LLJJIJI(getIntent())).length() > 0 || isRequestComingFromWeb()) {
            sendResponseWithRedirectUrl(c61948OSy);
        } else {
            sendResponseWithRequestPackageName(c61948OSy);
        }
    }

    public final void logAuthFailureResult(int i, String str) {
        C188727au baseLoggingEventBuilder = getBaseLoggingEventBuilder();
        baseLoggingEventBuilder.getClass();
        baseLoggingEventBuilder.LJIIIZ("result", "fail");
        baseLoggingEventBuilder.LIZLLL(0, "auto_auth");
        baseLoggingEventBuilder.LIZLLL(i, "error_code");
        baseLoggingEventBuilder.LJIIIZ("error_message", str);
        FMX.LJIIL("auth_result", baseLoggingEventBuilder.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && !shouldEnableWebviewAuth()) {
            Fragment LJJJIL = getSupportFragmentManager().LJJJIL("native_authorize_fragment");
            if (LJJJIL != null && (LJJJIL instanceof BaseI18nAuthorizedFragment)) {
                ((BaseI18nAuthorizedFragment) LJJJIL).Ol();
                return false;
            }
            finish();
            return false;
        }
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            if (i2 != -1 || this.isUserBanned) {
                onLoginResult(-1);
            }
        }
    }

    @Override // X.LEA
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (user == null) {
            return;
        }
        handleLoginStatusCheck();
    }
}
