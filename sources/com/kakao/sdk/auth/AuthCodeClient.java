package com.kakao.sdk.auth;

import X.AnonymousClass629;
import X.C16880lQ;
import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C76800UCe;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.PVC;
import X.TBT;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.IntentResolveClient;
import com.kakao.sdk.common.util.KakaoResultReceiver;
import com.kakao.sdk.common.util.SdkLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthCodeClient {
    public static final Companion Companion = new Companion();
    public static final C5H3<AuthCodeClient> instance$delegate = C221108m2.LIZIZ(AuthCodeClient$Companion$instance$2.INSTANCE);
    public final ApplicationInfo applicationInfo;
    public final ApprovalType approvalType;
    public final ContextInfo contextInfo;
    public final IntentResolveClient intentResolveClient;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthCodeClient;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final String codeVerifier() {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] bytes = AnonymousClass629.LIZ("randomUUID().toString()").getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(messageDigest.digest(bytes), 3);
            o.LJIIIIZZ(encodeToString, "encodeToString(\n                MessageDigest.getInstance(Constants.CODE_VERIFIER_ALGORITHM).digest(\n                    UUID.randomUUID().toString().toByteArray()\n                ),\n                Base64.NO_WRAP or Base64.NO_PADDING\n            )");
            return encodeToString;
        }

        public final AuthCodeClient getInstance() {
            return AuthCodeClient.instance$delegate.getValue();
        }

        public Companion() {
        }

        public final String codeChallenge(byte[] codeVerifier) {
            o.LJIIIZ(codeVerifier, "codeVerifier");
            String encodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(codeVerifier), 11);
            o.LJIIIIZZ(encodeToString, "encodeToString(\n                MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM).digest(codeVerifier),\n                Base64.NO_WRAP or Base64.NO_PADDING or Base64.URL_SAFE\n            )");
            return encodeToString;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthCodeClient() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static final AuthCodeClient getInstance() {
        return Companion.getInstance();
    }

    public final void authorizeWithKakaoAccount(Context context, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, null, null, null, null, null, null, null, false, null, null, null, null, null, callback, 16382, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, null, null, null, null, null, null, false, null, null, null, null, null, callback, 16380, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, null, null, null, null, null, false, null, null, null, null, null, callback, 16376, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, null, null, null, null, false, null, null, null, null, null, callback, 16368, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, null, null, null, false, null, null, null, null, null, callback, 16352, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, null, null, false, null, null, null, null, null, callback, 16320, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, null, false, null, null, null, null, null, callback, 16256, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, false, null, null, null, null, null, callback, 16128, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z, null, null, null, null, null, callback, 15872, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, String str4, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z, str4, null, null, null, null, callback, 15360, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, String str4, Map<String, String> map, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z, str4, map, null, null, null, callback, 14336, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, String str4, Map<String, String> map, String str5, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z, str4, map, str5, null, null, callback, 12288, null);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, String str4, Map<String, String> map, String str5, Boolean bool, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoAccount$default(this, context, list, str, list2, str2, str3, list3, list4, z, str4, map, str5, bool, null, callback, FileUtils.BUFFER_SIZE, null);
    }

    public final void authorizeWithKakaoTalk(Context context, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, null, null, 0, null, null, null, null, callback, 254, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, null, 0, null, null, null, null, callback, 252, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i, null, null, null, null, callback, 240, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i, str2, null, null, null, callback, 224, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, List<String> list2, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i, str2, list2, null, null, callback, 192, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, List<String> list2, List<String> list3, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, i, str2, list2, list3, null, callback, 128, null);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        authorizeWithKakaoTalk$default(this, context, list, str, 0, null, null, null, null, callback, 248, null);
    }

    public final boolean isKakaoTalkLoginAvailable(Context context) {
        o.LJIIIZ(context, "context");
        if (this.intentResolveClient.resolveTalkIntent(context, AuthCodeIntentFactory.INSTANCE.talkBase()) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ KakaoResultReceiver resultReceiver$auth_release(InterfaceC88471Ynr callback) {
        o.LJIIIZ(callback, "callback");
        KakaoResultReceiver<InterfaceC88471Ynr<? super String, ? super Throwable, ? extends C76800UCe>> kakaoResultReceiver = new KakaoResultReceiver<InterfaceC88471Ynr<? super String, ? super Throwable, ? extends C76800UCe>>() { // from class: com.kakao.sdk.auth.AuthCodeClient$resultReceiver$1
            @Override // com.kakao.sdk.common.util.KakaoResultReceiver
            public void processError() {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown resultCode in AuthCodeReceiver#onReceivedResult()");
                InterfaceC88471Ynr<? super String, ? super Throwable, ? extends C76800UCe> emitter = getEmitter();
                if (emitter == null) {
                    return;
                }
                emitter.invoke(null, illegalArgumentException);
            }

            @Override // com.kakao.sdk.common.util.KakaoResultReceiver
            public void receiveCanceled(Bundle bundle) {
                Serializable serializable;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (bundle == null) {
                        serializable = null;
                    } else {
                        serializable = bundle.getSerializable("key.exception", KakaoSdkError.class);
                    }
                } else if (bundle == null || (serializable = bundle.getSerializable("key.exception")) == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.kakao.sdk.common.model.KakaoSdkError");
                }
                InterfaceC88471Ynr<? super String, ? super Throwable, ? extends C76800UCe> emitter = getEmitter();
                if (emitter == null) {
                    return;
                }
                emitter.invoke(null, serializable);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
            
                if (r7 == null) goto L6;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
            @Override // com.kakao.sdk.common.util.KakaoResultReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void receiveOk(android.os.Bundle r9) {
                /*
                    r8 = this;
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 33
                    java.lang.String r1 = "key.url"
                    r4 = 0
                    if (r2 < r0) goto L64
                    if (r9 != 0) goto L5b
                Lb:
                    r2 = r4
                Lc:
                    com.kakao.sdk.auth.Constants r0 = com.kakao.sdk.auth.Constants.INSTANCE
                    java.lang.String r7 = r0.getUNKNOWN_ERROR()
                L12:
                    java.lang.String r0 = "uri?.getQueryParameter(Constants.ERROR) ?: Constants.UNKNOWN_ERROR"
                    kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
                    if (r2 != 0) goto L54
                    r6 = r4
                L1a:
                    java.lang.Object r5 = r8.getEmitter()
                    X.Ynr r5 = (X.InterfaceC88471Ynr) r5
                    if (r5 != 0) goto L23
                L22:
                    return
                L23:
                    com.kakao.sdk.common.util.KakaoJson r1 = com.kakao.sdk.common.util.KakaoJson.INSTANCE     // Catch: java.lang.Throwable -> L31
                    java.lang.Class<com.kakao.sdk.common.model.AuthErrorCause> r0 = com.kakao.sdk.common.model.AuthErrorCause.class
                    java.lang.Object r3 = r1.fromJson(r7, r0)     // Catch: java.lang.Throwable -> L31
                    com.kakao.sdk.common.model.AuthErrorCause r3 = (com.kakao.sdk.common.model.AuthErrorCause) r3     // Catch: java.lang.Throwable -> L31
                    X.C3C5.m7constructorimpl(r3)     // Catch: java.lang.Throwable -> L31
                    goto L39
                L31:
                    r0 = move-exception
                    X.3C4 r3 = X.C141335gf.LIZ(r0)
                    X.C3C5.m7constructorimpl(r3)
                L39:
                    com.kakao.sdk.common.model.AuthErrorCause r1 = com.kakao.sdk.common.model.AuthErrorCause.Unknown
                    boolean r0 = X.C3C5.m12isFailureimpl(r3)
                    if (r0 == 0) goto L42
                    r3 = r1
                L42:
                    com.kakao.sdk.common.model.AuthErrorCause r3 = (com.kakao.sdk.common.model.AuthErrorCause) r3
                    com.kakao.sdk.common.model.AuthErrorResponse r2 = new com.kakao.sdk.common.model.AuthErrorResponse
                    r2.<init>(r7, r6)
                    com.kakao.sdk.common.model.AuthError r1 = new com.kakao.sdk.common.model.AuthError
                    r0 = 302(0x12e, float:4.23E-43)
                    r1.<init>(r0, r3, r2)
                    r5.invoke(r4, r1)
                    goto L22
                L54:
                    java.lang.String r0 = "error_description"
                    java.lang.String r6 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
                    goto L1a
                L5b:
                    java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                    java.lang.Object r2 = r9.getParcelable(r1, r0)
                    android.net.Uri r2 = (android.net.Uri) r2
                    goto L6d
                L64:
                    if (r9 != 0) goto L67
                    goto Lb
                L67:
                    android.os.Parcelable r2 = r9.getParcelable(r1)
                    android.net.Uri r2 = (android.net.Uri) r2
                L6d:
                    if (r2 != 0) goto L70
                    goto Lc
                L70:
                    java.lang.String r0 = "code"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
                    if (r1 == 0) goto L85
                    java.lang.Object r0 = r8.getEmitter()
                    X.Ynr r0 = (X.InterfaceC88471Ynr) r0
                    if (r0 != 0) goto L81
                    goto L22
                L81:
                    r0.invoke(r1, r4)
                    goto L22
                L85:
                    if (r2 != 0) goto L88
                    goto Lc
                L88:
                    java.lang.String r0 = "error"
                    java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r0)
                    if (r7 != 0) goto L12
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.AuthCodeClient$resultReceiver$1.receiveOk(android.os.Bundle):void");
            }
        };
        kakaoResultReceiver.setEmitter(callback);
        return kakaoResultReceiver;
    }

    public AuthCodeClient(IntentResolveClient intentResolveClient, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType) {
        o.LJIIIZ(intentResolveClient, "intentResolveClient");
        o.LJIIIZ(applicationInfo, "applicationInfo");
        o.LJIIIZ(contextInfo, "contextInfo");
        o.LJIIIZ(approvalType, "approvalType");
        this.intentResolveClient = intentResolveClient;
        this.applicationInfo = applicationInfo;
        this.contextInfo = contextInfo;
        this.approvalType = approvalType;
    }

    public /* synthetic */ AuthCodeClient(IntentResolveClient intentResolveClient, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IntentResolveClient.Companion.getInstance() : intentResolveClient, (i & 2) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationInfo, (i & 4) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : contextInfo, (i & 8) != 0 ? KakaoSdk.INSTANCE.getApprovalType() : approvalType);
    }

    public final void authorizeWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, List<String> list2, List<String> list3, String str3, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        if (!isKakaoTalkLoginAvailable(context)) {
            callback.invoke(null, new ClientError(ClientErrorCause.NotSupported, "KakaoTalk not installed"));
            return;
        }
        try {
            AuthCodeIntentFactory authCodeIntentFactory = AuthCodeIntentFactory.INSTANCE;
            String appKey = this.applicationInfo.getAppKey();
            String redirectUri = this.applicationInfo.getRedirectUri();
            String kaHeader = this.contextInfo.getKaHeader();
            Bundle bundle = new Bundle();
            if (list2 != null) {
                bundle.putString("channel_public_id", ORZ.LLD(list2, ",", null, null, null, 62));
            }
            if (list3 != null) {
                bundle.putString("service_terms", ORZ.LLD(list3, ",", null, null, null, 62));
            }
            String value = this.approvalType.getValue();
            if (value != null) {
                bundle.putString("approval_type", value);
            }
            if (str3 != null) {
                Companion companion = Companion;
                byte[] bytes = str3.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                bundle.putString("code_challenge", companion.codeChallenge(bytes));
                bundle.putString("code_challenge_method", "S256");
            }
            if (list != null) {
                bundle.putString("prompt", ORZ.LLD(list, ",", null, null, AuthCodeClient$authorizeWithKakaoTalk$1$5$1.INSTANCE, 30));
            }
            if (str != null) {
                bundle.putString("state", str);
            }
            if (str2 != null) {
                bundle.putString("nonce", str2);
            }
            C16880lQ.LIZJ(context, authCodeIntentFactory.talk(context, i, appKey, redirectUri, kaHeader, bundle, resultReceiver$auth_release(callback)));
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            callback.invoke(null, th);
        }
    }

    public static /* synthetic */ void authorizeWithKakaoTalk$default(AuthCodeClient authCodeClient, Context context, List list, String str, int i, String str2, List list2, List list3, String str3, InterfaceC88471Ynr interfaceC88471Ynr, int i2, Object obj) {
        String str4 = str;
        List list4 = list;
        int i3 = i;
        String str5 = str2;
        List list5 = list2;
        List list6 = list3;
        String str6 = null;
        if ((i2 & 2) != 0) {
            list4 = null;
        }
        if ((i2 & 4) != 0) {
            str4 = null;
        }
        if ((i2 & 8) != 0) {
            i3 = 10012;
        }
        if ((i2 & 16) != 0) {
            str5 = null;
        }
        if ((i2 & 32) != 0) {
            list5 = null;
        }
        if ((i2 & 64) != 0) {
            list6 = null;
        }
        if ((i2 & 128) == 0) {
            str6 = str3;
        }
        authCodeClient.authorizeWithKakaoTalk(context, list4, str4, i3, str5, list5, list6, str6, interfaceC88471Ynr);
    }

    public final void authorizeWithKakaoAccount(Context context, List<? extends Prompt> list, String str, List<String> list2, String str2, String str3, List<String> list3, List<String> list4, boolean z, String str4, Map<String, String> map, String str5, Boolean bool, Boolean bool2, InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        String codeChallenge;
        String str6;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        UriUtility uriUtility = new UriUtility(null, 1, null);
        String appKey = this.applicationInfo.getAppKey();
        String redirectUri = this.applicationInfo.getRedirectUri();
        String kaHeader = this.contextInfo.getKaHeader();
        String value = this.approvalType.getValue();
        if (str5 == null) {
            codeChallenge = null;
            str6 = null;
        } else {
            Companion companion = Companion;
            byte[] bytes = str5.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            codeChallenge = companion.codeChallenge(bytes);
            str6 = "S256";
        }
        Uri authorize = uriUtility.authorize(appKey, str3, redirectUri, list2, kaHeader, list3, list4, list, str, str4, str2, value, codeChallenge, str6, bool, bool2);
        if (z && map != null) {
            authorize = uriUtility.accountLoginAndAuthorize(authorize, map);
        }
        SdkLog.Companion.i(authorize);
        try {
            C16880lQ.LIZJ(context, AuthCodeIntentFactory.INSTANCE.account(context, authorize, this.applicationInfo.getRedirectUri(), resultReceiver$auth_release(callback)));
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            callback.invoke(null, th);
        }
    }

    public static /* synthetic */ void authorizeWithKakaoAccount$default(AuthCodeClient authCodeClient, Context context, List list, String str, List list2, String str2, String str3, List list3, List list4, boolean z, String str4, Map map, String str5, Boolean bool, Boolean bool2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        Boolean bool3 = bool;
        String str6 = str5;
        Map map2 = map;
        String str7 = str4;
        boolean z2 = z;
        List list5 = list4;
        String str8 = str;
        List list6 = list;
        List list7 = list2;
        String str9 = str2;
        String str10 = str3;
        List list8 = list3;
        Boolean bool4 = null;
        if ((i & 2) != 0) {
            list6 = null;
        }
        if ((i & 4) != 0) {
            str8 = null;
        }
        if ((i & 8) != 0) {
            list7 = null;
        }
        if ((i & 16) != 0) {
            str9 = null;
        }
        if ((i & 32) != 0) {
            str10 = null;
        }
        if ((i & 64) != 0) {
            list8 = null;
        }
        if ((i & 128) != 0) {
            list5 = null;
        }
        if ((i & 256) != 0) {
            z2 = false;
        }
        if ((i & 512) != 0) {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            map2 = null;
        }
        if ((i & 2048) != 0) {
            str6 = null;
        }
        if ((i & 4096) != 0) {
            bool3 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) == 0) {
            bool4 = bool2;
        }
        authCodeClient.authorizeWithKakaoAccount(context, list6, str8, list7, str9, str10, list8, list5, z2, str7, map2, str6, bool3, bool4, interfaceC88471Ynr);
    }
}
