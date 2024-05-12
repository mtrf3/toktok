package com.appsflyer.internal;

import X.X1D;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class cj extends cl {
    public final Map<String, Object> AFInAppEventParameterName;

    public cj(Runnable runnable) {
        super("google", runnable);
        this.AFInAppEventParameterName = new HashMap();
    }

    public static boolean values(Context context) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFInAppEventParameterName("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (ac.AFKeystoreWrapper(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.AFInAppEventType("Install referrer is allowed");
                return true;
            }
            AFLogger.AFInAppEventType("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.AFInAppEventParameterName("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.valueOf("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(final Context context) {
        if (!values(context)) {
            return;
        }
        AFInAppEventType();
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.AFInAppEventType("Connecting to Install Referrer Library...");
            build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.cj.2
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.AFInAppEventType("Install Referrer service disconnected");
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i) {
                    cj.this.AFInAppEventParameterName.put("code", String.valueOf(i));
                    cj.this.values.put("api_ver", Long.valueOf(ac.valueOf(context, "com.android.vending")));
                    cj.this.values.put("api_ver_name", ac.values(context, "com.android.vending"));
                    if (i == -1) {
                        AFLogger.values("InstallReferrer SERVICE_DISCONNECTED");
                        cj.this.values.put("response", "SERVICE_DISCONNECTED");
                    } else if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                AFLogger.values("InstallReferrer FEATURE_NOT_SUPPORTED");
                                cj.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            } else if (i != 3) {
                                AFLogger.values("responseCode not found.");
                            } else {
                                AFLogger.values("InstallReferrer DEVELOPER_ERROR");
                                cj.this.values.put("response", "DEVELOPER_ERROR");
                            }
                        } else {
                            cj.this.values.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.values("InstallReferrer not supported");
                        }
                    } else {
                        cj.this.values.put("response", "OK");
                        try {
                            AFLogger.AFInAppEventType("InstallReferrer connected");
                            if (!build.isReady()) {
                                AFLogger.values("ReferrerClient: InstallReferrer is not ready");
                                cj.this.AFInAppEventParameterName.put("err", "ReferrerClient: InstallReferrer is not ready");
                            } else {
                                ReferrerDetails installReferrer = build.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    cj.this.AFInAppEventParameterName.put("val", installReferrer2);
                                    cj.this.values.put("referrer", installReferrer2);
                                }
                                long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                cj.this.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                                cj.this.values.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                cj.this.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                                cj.this.values.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                HashMap hashMap = new HashMap();
                                try {
                                    boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                    cj.this.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                } catch (NoSuchMethodError unused) {
                                }
                                try {
                                    hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                    hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                    hashMap.put("install_version", installReferrer.getInstallVersion());
                                } catch (NoSuchMethodError unused2) {
                                }
                                if (!hashMap.isEmpty()) {
                                    cj.this.values.put("google_custom", hashMap);
                                }
                            }
                        } catch (Throwable th) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Failed to get install referrer: ");
                            LIZ.append(th.getMessage());
                            AFLogger.values(X1D.LIZIZ(LIZ));
                            cj.this.AFInAppEventParameterName.put("err", th.getMessage());
                        }
                    }
                    AFLogger.AFInAppEventType("Install Referrer collected locally");
                    cj.this.AFKeystoreWrapper();
                    build.endConnection();
                }
            });
        } catch (Throwable th) {
            AFLogger.valueOf("referrerClient -> startConnection", th);
        }
    }
}
