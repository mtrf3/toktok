package com.kakao.sdk.auth;

import X.ORZ;
import android.net.Uri;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ServerHosts;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UriUtility {
    public final ServerHosts hosts;

    /* JADX WARN: Multi-variable type inference failed */
    public UriUtility() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UriUtility(ServerHosts hosts) {
        o.LJIIIZ(hosts, "hosts");
        this.hosts = hosts;
    }

    public final Uri accountLoginAndAuthorize(Uri authorizeUri, Map<String, String> map) {
        o.LJIIIZ(authorizeUri, "authorizeUri");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(this.hosts.getMobileAccount()).path("/sdks/page").appendQueryParameter("continue", authorizeUri.toString());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Uri build = appendQueryParameter.build();
        o.LJIIIIZZ(build, "Builder()\n            .scheme(com.kakao.sdk.common.Constants.SCHEME)\n            .authority(hosts.mobileAccount)\n            .path(Constants.ACCOUNT_LOGIN_PATH)\n            .appendQueryParameter(Constants.ACCOUNT_LOGIN_PARAM_CONTINUE, authorizeUri.toString())\n            .apply {\n                accountParameters?.forEach {\n                    appendQueryParameter(it.key, it.value)\n                }\n            }.build()");
        return build;
    }

    public /* synthetic */ UriUtility(ServerHosts serverHosts, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getHosts() : serverHosts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Uri accountLoginAndAuthorize$default(UriUtility uriUtility, Uri uri, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return uriUtility.accountLoginAndAuthorize(uri, map);
    }

    public final Uri authorize(String clientId, String str, String redirectUri, List<String> list, String str2, List<String> list2, List<String> list3, List<? extends Prompt> list4, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(redirectUri, "redirectUri");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(this.hosts.getKauth()).path("oauth/authorize").appendQueryParameter("client_id", clientId).appendQueryParameter("redirect_uri", redirectUri).appendQueryParameter("response_type", "code");
        if (str != null) {
            appendQueryParameter.appendQueryParameter("agt", str);
        }
        if (list != null && !list.isEmpty()) {
            appendQueryParameter.appendQueryParameter("scope", ORZ.LLD(list, ",", null, null, null, 62));
        }
        if (list2 != null) {
            appendQueryParameter.appendQueryParameter("channel_public_id", ORZ.LLD(list2, ",", null, null, null, 62));
        }
        if (list3 != null) {
            appendQueryParameter.appendQueryParameter("service_terms", ORZ.LLD(list3, ",", null, null, null, 62));
        }
        if (list4 != null) {
            appendQueryParameter.appendQueryParameter("prompt", ORZ.LLD(list4, ",", null, null, UriUtility$authorize$1$4$1.INSTANCE, 30));
        }
        if (str3 != null) {
            appendQueryParameter.appendQueryParameter("state", str3);
        }
        if (str4 != null) {
            appendQueryParameter.appendQueryParameter("login_hint", str4);
        }
        if (str5 != null) {
            appendQueryParameter.appendQueryParameter("nonce", str5);
        }
        if (str6 != null) {
            appendQueryParameter.appendQueryParameter("approval_type", str6);
        }
        if (str7 != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", str7);
        }
        if (str8 != null) {
            appendQueryParameter.appendQueryParameter("code_challenge_method", str8);
        }
        if (bool != null) {
            appendQueryParameter.appendQueryParameter("accounts_skip_intro", String.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            appendQueryParameter.appendQueryParameter("accounts_talk_login_visible", String.valueOf(bool2.booleanValue()));
        }
        Uri build = appendQueryParameter.appendQueryParameter("ka", str2).build();
        o.LJIIIIZZ(build, "Builder()\n            .scheme(com.kakao.sdk.common.Constants.SCHEME)\n            .authority(hosts.kauth).path(Constants.AUTHORIZE_PATH)\n            .appendQueryParameter(Constants.CLIENT_ID, clientId)\n            .appendQueryParameter(Constants.REDIRECT_URI, redirectUri)\n            .appendQueryParameter(Constants.RESPONSE_TYPE, Constants.CODE).apply {\n                agt?.let { appendQueryParameter(Constants.AGT, agt) }\n                if (!scopes.isNullOrEmpty()) {\n                    appendQueryParameter(Constants.SCOPE, scopes.joinToString(\",\"))\n                }\n                channelPublicIds?.let {\n                    appendQueryParameter(\n                        Constants.CHANNEL_PUBLIC_ID,\n                        channelPublicIds.joinToString(\",\")\n                    )\n                }\n                serviceTerms?.let {\n                    appendQueryParameter(\n                        Constants.SERVICE_TERMS,\n                        serviceTerms.joinToString(\",\")\n                    )\n                }\n                prompts?.let { prompts ->\n                    appendQueryParameter(\n                        Constants.PROMPT,\n                        prompts.joinToString(\",\") { prompt -> prompt.value }\n                    )\n                }\n                state?.let { appendQueryParameter(Constants.STATE, it) }\n                loginHint?.let { appendQueryParameter(Constants.LOGIN_HINT, it) }\n                nonce?.let { appendQueryParameter(Constants.NONCE, it) }\n                approvalType?.let { appendQueryParameter(Constants.APPROVAL_TYPE, it) }\n                codeChallenge?.let { appendQueryParameter(Constants.CODE_CHALLENGE, it) }\n                codeChallengeMethod?.let {\n                    appendQueryParameter(\n                        Constants.CODE_CHALLENGE_METHOD,\n                        it\n                    )\n                }\n                accountsSkipIntro?.let { appendQueryParameter(Constants.ACCOUNTS_SKIP_INTRO, it.toString()) }\n                accountsTalkLoginVisible?.let { appendQueryParameter(Constants.ACCOUNTS_TALK_LOGIN_VISIBLE, it.toString()) }\n            }\n            .appendQueryParameter(Constants.KA_HEADER, kaHeader)\n            .build()");
        return build;
    }

    public static /* synthetic */ Uri authorize$default(UriUtility uriUtility, String str, String str2, String str3, List list, String str4, List list2, List list3, List list4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2, int i, Object obj) {
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        String str11 = str4;
        String str12 = str2;
        List list8 = list;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        String str18 = str10;
        Boolean bool3 = bool;
        Boolean bool4 = null;
        if ((i & 2) != 0) {
            str12 = null;
        }
        if ((i & 8) != 0) {
            list8 = null;
        }
        if ((i & 16) != 0) {
            str11 = null;
        }
        if ((i & 32) != 0) {
            list7 = null;
        }
        if ((i & 64) != 0) {
            list6 = null;
        }
        if ((i & 128) != 0) {
            list5 = null;
        }
        if ((i & 256) != 0) {
            str13 = null;
        }
        if ((i & 512) != 0) {
            str14 = null;
        }
        if ((i & 1024) != 0) {
            str15 = null;
        }
        if ((i & 2048) != 0) {
            str16 = null;
        }
        if ((i & 4096) != 0) {
            str17 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str18 = null;
        }
        if ((i & 16384) != 0) {
            bool3 = null;
        }
        if ((i & 32768) == 0) {
            bool4 = bool2;
        }
        return uriUtility.authorize(str, str12, str3, list8, str11, list7, list6, list5, str13, str14, str15, str16, str17, str18, bool3, bool4);
    }
}
