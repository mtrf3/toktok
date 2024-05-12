package androidx.webkit.internal;

import X.AbstractC29211Cr;
import X.C0CR;
import X.C29221Cs;
import X.C29231Ct;
import X.C40351iB;
import X.C40361iC;
import X.C40371iD;
import X.C40381iE;
import X.C40391iF;
import X.C40401iG;
import X.C40411iH;
import X.C40421iI;
import X.InterfaceC07940Sw;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewFeature;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.i0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class WebViewFeatureInternal {
    public static final C40421iI ALGORITHMIC_DARKENING;
    public static final C40351iB CREATE_WEB_MESSAGE_CHANNEL;
    public static final C40361iC DISABLED_ACTION_MODE_MENU_ITEMS;
    public static final C40371iD DOCUMENT_START_SCRIPT;
    public static final C40371iD ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
    public static final C40411iH FORCE_DARK;
    public static final C40371iD FORCE_DARK_STRATEGY;
    public static final C40371iD GET_COOKIE_INFO;
    public static final C40371iD GET_VARIATIONS_HEADER;
    public static final C40381iE GET_WEB_CHROME_CLIENT;
    public static final C40381iE GET_WEB_VIEW_CLIENT;
    public static final C40411iH GET_WEB_VIEW_RENDERER;
    public static final C40371iD MULTI_PROCESS;
    public static final C40351iB OFF_SCREEN_PRERASTER;
    public static final C40351iB POST_WEB_MESSAGE;
    public static final C40371iD PROXY_OVERRIDE;
    public static final C40371iD PROXY_OVERRIDE_REVERSE_BYPASS;
    public static final C40351iB RECEIVE_HTTP_ERROR;
    public static final C40351iB RECEIVE_WEB_RESOURCE_ERROR;
    public static final C40371iD REQUESTED_WITH_HEADER_ALLOW_LIST;
    public static final C40391iF SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED;
    public static final C40391iF SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED;
    public static final C40391iF SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
    public static final C40391iF SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
    public static final C40381iE SAFE_BROWSING_ENABLE;
    public static final C40391iF SAFE_BROWSING_HIT;
    public static final C40391iF SAFE_BROWSING_PRIVACY_POLICY_URL;
    public static final C40391iF SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
    public static final C40391iF SAFE_BROWSING_RESPONSE_PROCEED;
    public static final C40391iF SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
    public static final C40361iC SERVICE_WORKER_BASIC_USAGE;
    public static final C40361iC SERVICE_WORKER_BLOCK_NETWORK_LOADS;
    public static final C40361iC SERVICE_WORKER_CACHE_MODE;
    public static final C40361iC SERVICE_WORKER_CONTENT_ACCESS;
    public static final C40361iC SERVICE_WORKER_FILE_ACCESS;
    public static final C40361iC SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST;
    public static final C40361iC SHOULD_OVERRIDE_WITH_REDIRECTS;
    public static final C29231Ct STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX;
    public static final C29221Cs STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH;
    public static final C40391iF START_SAFE_BROWSING;
    public static final C40371iD SUPPRESS_ERROR_PAGE;
    public static final C40401iG TRACING_CONTROLLER_BASIC_USAGE;
    public static final C40351iB VISUAL_STATE_CALLBACK;
    public static final C40351iB WEB_MESSAGE_CALLBACK_ON_MESSAGE;
    public static final C40371iD WEB_MESSAGE_GET_MESSAGE_PAYLOAD;
    public static final C40371iD WEB_MESSAGE_LISTENER;
    public static final C40351iB WEB_MESSAGE_PORT_CLOSE;
    public static final C40351iB WEB_MESSAGE_PORT_POST_MESSAGE;
    public static final C40351iB WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
    public static final C40351iB WEB_RESOURCE_ERROR_GET_CODE;
    public static final C40351iB WEB_RESOURCE_ERROR_GET_DESCRIPTION;
    public static final C40361iC WEB_RESOURCE_REQUEST_IS_REDIRECT;
    public static final C40411iH WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
    public static final C40411iH WEB_VIEW_RENDERER_TERMINATE;

    /* JADX WARN: Type inference failed for: r0v37, types: [X.1iG] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.1Ct] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.1Cs] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1iE] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v21, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v23, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v25, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v27, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v28, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v29, types: [X.1iB] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v30, types: [X.1iE] */
    /* JADX WARN: Type inference failed for: r1v31, types: [X.1iE] */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.1iH] */
    /* JADX WARN: Type inference failed for: r1v33, types: [X.1iH] */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.1iH] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v38, types: [X.1iH] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v40, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v42, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v43, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v44, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v45, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v46, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1iF] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.1iC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.1iD] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.1iD] */
    static {
        final String str = "VISUAL_STATE_CALLBACK";
        VISUAL_STATE_CALLBACK = new AbstractC29211Cr(str, str) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str2 = "OFF_SCREEN_PRERASTER";
        OFF_SCREEN_PRERASTER = new AbstractC29211Cr(str2, str2) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str3 = "SAFE_BROWSING_ENABLE";
        SAFE_BROWSING_ENABLE = new AbstractC29211Cr(str3, str3) { // from class: X.1iE
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            }
        };
        final String str4 = "DISABLED_ACTION_MODE_MENU_ITEMS";
        DISABLED_ACTION_MODE_MENU_ITEMS = new AbstractC29211Cr(str4, str4) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str5 = "START_SAFE_BROWSING";
        START_SAFE_BROWSING = new AbstractC29211Cr(str5, str5) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str6 = WebViewFeature.SAFE_BROWSING_WHITELIST;
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = new AbstractC29211Cr(str6, str6) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str7 = "SAFE_BROWSING_ALLOWLIST";
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = new AbstractC29211Cr(str6, str7) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = new AbstractC29211Cr(str7, str6) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = new AbstractC29211Cr(str7, str7) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str8 = "SAFE_BROWSING_PRIVACY_POLICY_URL";
        SAFE_BROWSING_PRIVACY_POLICY_URL = new AbstractC29211Cr(str8, str8) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str9 = "SERVICE_WORKER_BASIC_USAGE";
        SERVICE_WORKER_BASIC_USAGE = new AbstractC29211Cr(str9, str9) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str10 = "SERVICE_WORKER_CACHE_MODE";
        SERVICE_WORKER_CACHE_MODE = new AbstractC29211Cr(str10, str10) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str11 = "SERVICE_WORKER_CONTENT_ACCESS";
        SERVICE_WORKER_CONTENT_ACCESS = new AbstractC29211Cr(str11, str11) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str12 = "SERVICE_WORKER_FILE_ACCESS";
        SERVICE_WORKER_FILE_ACCESS = new AbstractC29211Cr(str12, str12) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str13 = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";
        SERVICE_WORKER_BLOCK_NETWORK_LOADS = new AbstractC29211Cr(str13, str13) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str14 = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";
        SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = new AbstractC29211Cr(str14, str14) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str15 = "RECEIVE_WEB_RESOURCE_ERROR";
        RECEIVE_WEB_RESOURCE_ERROR = new AbstractC29211Cr(str15, str15) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str16 = "RECEIVE_HTTP_ERROR";
        RECEIVE_HTTP_ERROR = new AbstractC29211Cr(str16, str16) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str17 = "SHOULD_OVERRIDE_WITH_REDIRECTS";
        SHOULD_OVERRIDE_WITH_REDIRECTS = new AbstractC29211Cr(str17, str17) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str18 = "SAFE_BROWSING_HIT";
        SAFE_BROWSING_HIT = new AbstractC29211Cr(str18, str18) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str19 = "WEB_RESOURCE_REQUEST_IS_REDIRECT";
        WEB_RESOURCE_REQUEST_IS_REDIRECT = new AbstractC29211Cr(str19, str19) { // from class: X.1iC
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            }
        };
        final String str20 = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";
        WEB_RESOURCE_ERROR_GET_DESCRIPTION = new AbstractC29211Cr(str20, str20) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str21 = "WEB_RESOURCE_ERROR_GET_CODE";
        WEB_RESOURCE_ERROR_GET_CODE = new AbstractC29211Cr(str21, str21) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str22 = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";
        SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = new AbstractC29211Cr(str22, str22) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str23 = "SAFE_BROWSING_RESPONSE_PROCEED";
        SAFE_BROWSING_RESPONSE_PROCEED = new AbstractC29211Cr(str23, str23) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str24 = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";
        SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new AbstractC29211Cr(str24, str24) { // from class: X.1iF
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            }
        };
        final String str25 = "WEB_MESSAGE_PORT_POST_MESSAGE";
        WEB_MESSAGE_PORT_POST_MESSAGE = new AbstractC29211Cr(str25, str25) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str26 = "WEB_MESSAGE_PORT_CLOSE";
        WEB_MESSAGE_PORT_CLOSE = new AbstractC29211Cr(str26, str26) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str27 = "WEB_MESSAGE_GET_MESSAGE_PAYLOAD";
        WEB_MESSAGE_GET_MESSAGE_PAYLOAD = new AbstractC29211Cr(str27, str27) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str28 = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
        WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = new AbstractC29211Cr(str28, str28) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str29 = "CREATE_WEB_MESSAGE_CHANNEL";
        CREATE_WEB_MESSAGE_CHANNEL = new AbstractC29211Cr(str29, str29) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str30 = "POST_WEB_MESSAGE";
        POST_WEB_MESSAGE = new AbstractC29211Cr(str30, str30) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str31 = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
        WEB_MESSAGE_CALLBACK_ON_MESSAGE = new AbstractC29211Cr(str31, str31) { // from class: X.1iB
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            }
        };
        final String str32 = "GET_WEB_VIEW_CLIENT";
        GET_WEB_VIEW_CLIENT = new AbstractC29211Cr(str32, str32) { // from class: X.1iE
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            }
        };
        final String str33 = "GET_WEB_CHROME_CLIENT";
        GET_WEB_CHROME_CLIENT = new AbstractC29211Cr(str33, str33) { // from class: X.1iE
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            }
        };
        final String str34 = "GET_WEB_VIEW_RENDERER";
        GET_WEB_VIEW_RENDERER = new AbstractC29211Cr(str34, str34) { // from class: X.1iH
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            }
        };
        final String str35 = "WEB_VIEW_RENDERER_TERMINATE";
        WEB_VIEW_RENDERER_TERMINATE = new AbstractC29211Cr(str35, str35) { // from class: X.1iH
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            }
        };
        TRACING_CONTROLLER_BASIC_USAGE = new AbstractC29211Cr() { // from class: X.1iG
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            }
        };
        STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = new C0CR() { // from class: X.1Ct
            @Override // X.C0CR
            public final boolean LIZ() {
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            }
        };
        STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH = new C0CR() { // from class: X.1Cs
            @Override // X.C0CR
            public final boolean LIZ() {
                return false;
            }
        };
        final String str36 = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
        WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = new AbstractC29211Cr(str36, str36) { // from class: X.1iH
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            }
        };
        ALGORITHMIC_DARKENING = new C40421iI() { // from class: X.1qn
            public final Pattern LIZLLL = PatternProtector.compile("\\A\\d+");

            @Override // X.AbstractC29211Cr
            public final boolean LIZLLL() {
                int i;
                PackageInfo packageInfo;
                boolean LIZLLL = super.LIZLLL();
                if (!LIZLLL || (i = Build.VERSION.SDK_INT) >= 29) {
                    return LIZLLL;
                }
                if (i >= 26) {
                    packageInfo = C07900Ss.LIZ();
                } else {
                    try {
                        packageInfo = C07450Qz.LIZ();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfo = null;
                    }
                }
                if (packageInfo == null) {
                    return false;
                }
                Matcher matcher = this.LIZLLL.matcher(packageInfo.versionName);
                if (!matcher.find() || CastIntegerProtector.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                    return false;
                }
                return true;
            }
        };
        final String str37 = "PROXY_OVERRIDE";
        final String str38 = "PROXY_OVERRIDE:3";
        PROXY_OVERRIDE = new AbstractC29211Cr(str37, str38) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str39 = "SUPPRESS_ERROR_PAGE";
        SUPPRESS_ERROR_PAGE = new AbstractC29211Cr(str39, str39) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str40 = "MULTI_PROCESS";
        final String str41 = "MULTI_PROCESS_QUERY";
        MULTI_PROCESS = new AbstractC29211Cr(str40, str41) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str42 = "FORCE_DARK";
        FORCE_DARK = new AbstractC29211Cr(str42, str42) { // from class: X.1iH
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            }
        };
        final String str43 = "FORCE_DARK_STRATEGY";
        final String str44 = "FORCE_DARK_BEHAVIOR";
        FORCE_DARK_STRATEGY = new AbstractC29211Cr(str43, str44) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str45 = "WEB_MESSAGE_LISTENER";
        WEB_MESSAGE_LISTENER = new AbstractC29211Cr(str45, str45) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str46 = "DOCUMENT_START_SCRIPT";
        final String str47 = "DOCUMENT_START_SCRIPT:1";
        DOCUMENT_START_SCRIPT = new AbstractC29211Cr(str46, str47) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str48 = "PROXY_OVERRIDE_REVERSE_BYPASS";
        PROXY_OVERRIDE_REVERSE_BYPASS = new AbstractC29211Cr(str48, str48) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str49 = "GET_VARIATIONS_HEADER";
        GET_VARIATIONS_HEADER = new AbstractC29211Cr(str49, str49) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str50 = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";
        ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = new AbstractC29211Cr(str50, str50) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str51 = "GET_COOKIE_INFO";
        GET_COOKIE_INFO = new AbstractC29211Cr(str51, str51) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
        final String str52 = "REQUESTED_WITH_HEADER_ALLOW_LIST";
        REQUESTED_WITH_HEADER_ALLOW_LIST = new AbstractC29211Cr(str52, str52) { // from class: X.1iD
            @Override // X.AbstractC29211Cr
            public final boolean LIZJ() {
                return false;
            }
        };
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean isSupported(String str) {
        return isSupported(str, Collections.unmodifiableSet(AbstractC29211Cr.LIZJ));
    }

    public static boolean isStartupFeatureSupported(String str, Context context) {
        return isStartupFeatureSupported(str, Collections.unmodifiableSet(C0CR.LIZJ), context);
    }

    public static <T extends InterfaceC07940Sw> boolean isSupported(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t : collection) {
            if (t.LIZ().equals(str)) {
                hashSet.add(t);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((InterfaceC07940Sw) it.next()).LIZIZ()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException(i0.LJFF("Unknown feature ", str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|(1:21)(2:63|64)|(5:62|38|(3:40|41|42)(3:54|(1:56)(1:58)|57)|(1:47)|33)|23|24|26|(1:28)(1:60)|(4:37|38|(0)(0)|(1:51)(3:44|45|47))|33) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isStartupFeatureSupported(java.lang.String r6, java.util.Collection<X.C0CR> r7, android.content.Context r8) {
        /*
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r1 = r2.next()
            X.0CR r1 = (X.C0CR) r1
            java.lang.String r0 = r1.LIZ
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L9
            r3.add(r1)
            goto L9
        L21:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Ld5
            java.util.Iterator r7 = r3.iterator()
        L2b:
            boolean r0 = r7.hasNext()
            r5 = 0
            if (r0 == 0) goto Ld4
            java.lang.Object r4 = r7.next()
            X.0CR r4 = (X.C0CR) r4
            boolean r0 = r4.LIZ()
            r6 = 1
            if (r0 != 0) goto Ld3
        L40:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            r3 = 0
            if (r1 < r0) goto L83
            android.content.pm.PackageInfo r0 = X.C07900Ss.LIZ()
        L4b:
            if (r0 == 0) goto L88
        L4d:
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = "org.chromium.android_webview.services.StartupFeatureMetadataHolder"
            r2.<init>(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L6d
            r0 = 640(0x280, double:3.16E-321)
            android.content.pm.PackageManager$ComponentInfoFlags r1 = X.C07930Sv.LIZIZ(r0)
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            android.content.pm.ServiceInfo r0 = X.C07930Sv.LIZ(r0, r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            android.os.Bundle r3 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            goto L80
        L6d:
            r0 = 24
            if (r1 < r0) goto L74
            r1 = 640(0x280, float:8.97E-43)
            goto L76
        L74:
            r1 = 128(0x80, float:1.8E-43)
        L76:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            android.content.pm.ServiceInfo r0 = r0.getServiceInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            android.os.Bundle r3 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
        L80:
            if (r3 != 0) goto Lcb
            goto L2b
        L83:
            android.content.pm.PackageInfo r0 = X.C07450Qz.LIZ()     // Catch: java.lang.Throwable -> L88
            goto L4b
        L88:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2b
            r0 = 23
            if (r1 > r0) goto La5
            java.lang.String r0 = "android.webkit.WebViewFactory"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "getWebViewPackageName"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
            goto Lbb
        La5:
            java.lang.String r0 = "android.webkit.WebViewUpdateService"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "getCurrentWebViewPackageName"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2b
        Lbb:
            if (r1 != 0) goto Lbf
            goto L2b
        Lbf:
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r0, r1, r5)
            if (r0 != 0) goto L4d
            goto L2b
        Lcb:
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L2b
        Ld3:
            return r6
        Ld4:
            return r5
        Ld5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown feature "
            java.lang.String r0 = defpackage.i0.LJFF(r0, r6)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.WebViewFeatureInternal.isStartupFeatureSupported(java.lang.String, java.util.Collection, android.content.Context):boolean");
    }
}
