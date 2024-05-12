package com.kakao.sdk.common;

import X.V0N;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.SdkIdentifier;
import com.kakao.sdk.common.model.ServerHosts;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KakaoSdk {
    public static final KakaoSdk INSTANCE = new KakaoSdk();
    public static ApplicationContextInfo applicationContextInfo;
    public static ApprovalType approvalType;
    public static ServerHosts hosts;
    public static boolean loggingEnabled;
    public static Type type;

    /* loaded from: classes7.dex */
    public enum Type {
        KOTLIN,
        RX_KOTLIN;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }
    }

    public static final void init(Context context, String appKey) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        init$default(context, appKey, null, null, null, null, null, 124, null);
    }

    public static final void init(Context context, String appKey, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        init$default(context, appKey, str, null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        init$default(context, appKey, str, bool, null, null, null, 112, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool, ServerHosts serverHosts) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        init$default(context, appKey, str, bool, serverHosts, null, null, 96, null);
    }

    public static final void init(Context context, String appKey, String str, Boolean bool, ServerHosts serverHosts, ApprovalType approvalType2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        init$default(context, appKey, str, bool, serverHosts, approvalType2, null, 64, null);
    }

    public final ApplicationContextInfo getApplicationContextInfo() {
        ApplicationContextInfo applicationContextInfo2 = applicationContextInfo;
        if (applicationContextInfo2 != null) {
            return applicationContextInfo2;
        }
        o.LJIJI("applicationContextInfo");
        throw null;
    }

    public final ApprovalType getApprovalType() {
        ApprovalType approvalType2 = approvalType;
        if (approvalType2 != null) {
            return approvalType2;
        }
        o.LJIJI("approvalType");
        throw null;
    }

    public final ServerHosts getHosts() {
        ServerHosts serverHosts = hosts;
        if (serverHosts != null) {
            return serverHosts;
        }
        o.LJIJI("hosts");
        throw null;
    }

    public final Type getType() {
        Type type2 = type;
        if (type2 != null) {
            return type2;
        }
        o.LJIJI("type");
        throw null;
    }

    public final String getAppKey() {
        return getApplicationContextInfo().getAppKey();
    }

    public final String getKaHeader() {
        return getApplicationContextInfo().getKaHeader();
    }

    public final String getKeyHash() {
        return getApplicationContextInfo().getSigningKeyHash();
    }

    public final String getRedirectUri() {
        return getApplicationContextInfo().getRedirectUri();
    }

    public final boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    public final void setApplicationContextInfo(ApplicationContextInfo applicationContextInfo2) {
        o.LJIIIZ(applicationContextInfo2, "<set-?>");
        applicationContextInfo = applicationContextInfo2;
    }

    public final void setApprovalType(ApprovalType approvalType2) {
        o.LJIIIZ(approvalType2, "<set-?>");
        approvalType = approvalType2;
    }

    public final void setHosts(ServerHosts serverHosts) {
        o.LJIIIZ(serverHosts, "<set-?>");
        hosts = serverHosts;
    }

    public final void setLoggingEnabled(boolean z) {
        loggingEnabled = z;
    }

    public final void setType(Type type2) {
        o.LJIIIZ(type2, "<set-?>");
        type = type2;
    }

    public static final void init(Context context, String appKey, String str, Boolean bool, ServerHosts serverHosts, ApprovalType approvalType2, SdkIdentifier sdkIdentifier) {
        boolean booleanValue;
        SdkIdentifier sdkIdentifier2 = sdkIdentifier;
        ApprovalType approvalType3 = approvalType2;
        String str2 = str;
        ServerHosts serverHosts2 = serverHosts;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        KakaoSdk kakaoSdk = INSTANCE;
        if (str2 == null) {
            str2 = o.LJIILLIIL(appKey, "kakao");
        }
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (serverHosts2 == null) {
            serverHosts2 = new ServerHosts();
        }
        if (approvalType3 == null) {
            approvalType3 = new ApprovalType();
        }
        Type type2 = Type.KOTLIN;
        if (sdkIdentifier2 == null) {
            sdkIdentifier2 = new SdkIdentifier(null, 1, null);
        }
        kakaoSdk.init(context, appKey, str2, booleanValue, serverHosts2, approvalType3, type2, sdkIdentifier2);
    }

    public final void init(Context context, String appKey, String customScheme, boolean z, ServerHosts hosts2, ApprovalType approvalType2, Type type2, SdkIdentifier sdkIdentifier) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        o.LJIIIZ(customScheme, "customScheme");
        o.LJIIIZ(hosts2, "hosts");
        o.LJIIIZ(approvalType2, "approvalType");
        o.LJIIIZ(type2, "type");
        o.LJIIIZ(sdkIdentifier, "sdkIdentifier");
        setHosts(hosts2);
        loggingEnabled = z;
        setType(type2);
        setApprovalType(approvalType2);
        setApplicationContextInfo(new ApplicationContextInfo(context, appKey, customScheme, type2, sdkIdentifier));
    }

    public static /* synthetic */ void init$default(Context context, String str, String str2, Boolean bool, ServerHosts serverHosts, ApprovalType approvalType2, SdkIdentifier sdkIdentifier, int i, Object obj) {
        ApprovalType approvalType3 = approvalType2;
        ServerHosts serverHosts2 = serverHosts;
        String str3 = str2;
        Boolean bool2 = bool;
        SdkIdentifier sdkIdentifier2 = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            serverHosts2 = null;
        }
        if ((i & 32) != 0) {
            approvalType3 = null;
        }
        if ((i & 64) == 0) {
            sdkIdentifier2 = sdkIdentifier;
        }
        init(context, str, str3, bool2, serverHosts2, approvalType3, sdkIdentifier2);
    }
}
