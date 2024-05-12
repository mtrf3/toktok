package com.byted.cast.common.auth.license;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.Constants;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.auth.AuthConstants;
import com.byted.cast.common.auth.AuthService;
import com.byted.cast.common.auth.IAuthListener;
import com.byted.cast.common.auth.license.AuthManager;
import com.byted.cast.common.auth.license.NetManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AuthManager {
    public static volatile AuthManager sInstance;
    public AuthCache mAuthCache;
    public ContextManager.CastContext mCastContext;
    public FileManager mFileManager = FileManager.getInstance();
    public WeakReference<IAuthListener> mIAuthLisRef;
    public boolean mIsUserToB;
    public CastLogger mLogger;
    public CastMonitor mMonitor;
    public NetManager mNetManager;
    public String mProjectId;

    /* renamed from: com.byted.cast.common.auth.license.AuthManager$2, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam;

        static {
            int[] iArr = new int[AuthConstants.LicenseParam.values().length];
            $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam = iArr;
            try {
                iArr[AuthConstants.LicenseParam.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam[AuthConstants.LicenseParam.BUSINESS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam[AuthConstants.LicenseParam.APP_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam[AuthConstants.LicenseParam.PROJECT_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam[AuthConstants.LicenseParam.CHANNEL_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static AuthManager getInstance() {
        if (sInstance == null) {
            synchronized (AuthManager.class) {
                if (sInstance == null) {
                    sInstance = new AuthManager(null);
                }
            }
        }
        return sInstance;
    }

    public void destroy() {
        this.mLogger.d("AuthManager", "destroy");
        this.mAuthCache.cacheLicenseContentInUse(this.mProjectId, null);
        this.mIAuthLisRef = null;
    }

    public void notifyLicenseBanned() {
        WeakReference<IAuthListener> weakReference;
        IAuthListener iAuthListener;
        this.mLogger.d("AuthManager", "notifyLicenseBanned");
        if (this.mIsUserToB && (weakReference = this.mIAuthLisRef) != null && (iAuthListener = weakReference.get()) != null) {
            iAuthListener.onFailed(10016, "ERROR_BAN_LICENSE", null);
        }
    }

    public AuthManager(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
        this.mMonitor = ContextManager.getMonitor(castContext);
        this.mNetManager = NetManager.createInstance(castContext);
        this.mAuthCache = new AuthCache(castContext);
    }

    public static AuthManager createInstance(ContextManager.CastContext castContext) {
        return new AuthManager(castContext);
    }

    public String getLicenseParam(AuthConstants.LicenseParam licenseParam) {
        int i = AnonymousClass2.$SwitchMap$com$byted$cast$common$auth$AuthConstants$LicenseParam[licenseParam.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return this.mAuthCache.getLicenseChannelId();
                    }
                    return this.mAuthCache.getLicenseProjectId();
                }
                return this.mAuthCache.getLicenseAppId();
            }
            return this.mAuthCache.getLicenseBusinessId();
        }
        return this.mAuthCache.getLicenseId();
    }

    public AuthService getService(String str) {
        return this.mAuthCache.getAvailableServiceByName(str);
    }

    public void init(String str) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init with projectId: ");
        LIZ.append(str);
        castLogger.d("AuthManager", X1D.LIZIZ(LIZ));
        this.mProjectId = str;
        this.mAuthCache.cacheLicenseContentInUse(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doVerifyLicense, reason: merged with bridge method [inline-methods] */
    public void lambda$verifyLicense$0(String str, IAuthListener iAuthListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doVerifyLicense: ");
        LIZ.append(str);
        castLogger.d("AuthManager", X1D.LIZIZ(LIZ));
        String readAssetFile = this.mFileManager.readAssetFile(str);
        if (TextUtils.isEmpty(readAssetFile) || readAssetFile.startsWith("LICENSE_FILE_OPERATE_ERROR: ")) {
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_import", String.valueOf(this.mIsUserToB), CardStruct.IStatusCode.DEFAULT, null, this.mProjectId, null, readAssetFile);
            if (iAuthListener != null) {
                iAuthListener.onFailed(10014, "ERROR_IMPORT_LICENSE_INVALID", null);
                return;
            }
            return;
        }
        this.mLogger.d("AuthManager", "verify importLicense");
        String packageName = Constants.sAppContext.getPackageName();
        try {
            JSONObject jSONObject = new JSONObject(readAssetFile);
            String verifyLicense = VerifyUtil.verifyLicense(packageName, jSONObject.optString("signature"), jSONObject.optString("content"));
            boolean equals = TextUtils.equals(verifyLicense, "-1");
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("verify importLicense, invalid: ");
            LIZ2.append(equals);
            castLogger2.d("AuthManager", X1D.LIZIZ(LIZ2));
            if (equals) {
                this.mMonitor.sendByteCastAuthEvent("bytecast_license_import", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, "license invalid");
                if (iAuthListener != null) {
                    iAuthListener.onFailed(10014, "ERROR_IMPORT_LICENSE_INVALID", null);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject(verifyLicense);
            CastLogger castLogger3 = this.mLogger;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("importContent: ");
            LIZ3.append(jSONObject2);
            castLogger3.v("AuthManager", X1D.LIZIZ(LIZ3));
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_import", String.valueOf(this.mIsUserToB), "1", jSONObject2.optString("appId"), this.mProjectId, jSONObject2.optString("businessId"), null);
            long optLong = jSONObject2.optLong("updateTime");
            this.mLogger.d("AuthManager", "verify cacheLicense");
            String readCacheFile = this.mFileManager.readCacheFile();
            if (TextUtils.isEmpty(readCacheFile)) {
                this.mLogger.d("AuthManager", "verify cacheLicense: empty license");
            } else if (readCacheFile.startsWith("LICENSE_FILE_OPERATE_ERROR: ")) {
                CastLogger castLogger4 = this.mLogger;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("verify cacheLicense error: ");
                LIZ4.append(readCacheFile);
                castLogger4.d("AuthManager", X1D.LIZIZ(LIZ4));
                this.mMonitor.sendByteCastAuthEvent("bytecast_license_cache", String.valueOf(this.mIsUserToB), CardStruct.IStatusCode.DEFAULT, null, this.mProjectId, null, readCacheFile);
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject(readCacheFile);
                    String verifyLicense2 = VerifyUtil.verifyLicense(packageName, jSONObject3.optString("signature"), jSONObject3.optString("content"));
                    boolean equals2 = TextUtils.equals(verifyLicense2, "-1");
                    CastLogger castLogger5 = this.mLogger;
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("verify cacheLicense, invalid: ");
                    LIZ5.append(equals2);
                    castLogger5.d("AuthManager", X1D.LIZIZ(LIZ5));
                    if (equals2) {
                        this.mMonitor.sendByteCastAuthEvent("bytecast_license_cache", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, "license invalid");
                    } else {
                        JSONObject jSONObject4 = new JSONObject(verifyLicense2);
                        CastLogger castLogger6 = this.mLogger;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("cacheContent: ");
                        LIZ6.append(jSONObject4);
                        castLogger6.v("AuthManager", X1D.LIZIZ(LIZ6));
                        String optString = jSONObject4.optString("businessId");
                        String optString2 = jSONObject4.optString("appId");
                        this.mMonitor.sendByteCastAuthEvent("bytecast_license_cache", String.valueOf(this.mIsUserToB), "1", optString2, this.mProjectId, optString, null);
                        long optLong2 = jSONObject4.optLong("updateTime");
                        if (optLong2 > optLong) {
                            verifyLicense = verifyLicense2;
                            optLong = optLong2;
                        } else {
                            String cacheLicense = this.mFileManager.cacheLicense(readAssetFile);
                            if (TextUtils.isEmpty(cacheLicense) || cacheLicense.startsWith("LICENSE_FILE_OPERATE_ERROR: ")) {
                                this.mMonitor.sendByteCastAuthEvent("bytecast_license_save", String.valueOf(this.mIsUserToB), "1", null, this.mProjectId, null, cacheLicense);
                            } else {
                                this.mMonitor.sendByteCastAuthEvent("bytecast_license_save", String.valueOf(this.mIsUserToB), CardStruct.IStatusCode.DEFAULT, optString2, this.mProjectId, optString, null);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.mMonitor.sendByteCastAuthEvent("bytecast_license_cache", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, e.getMessage());
                }
            }
            this.mAuthCache.cacheLicenseContentInUse(this.mProjectId, verifyLicense);
            this.mLogger.d("AuthManager", "verify success, isUserToB: " + this.mIsUserToB);
            if (iAuthListener != null) {
                iAuthListener.onSuccess();
            }
            try {
                JSONObject jSONObject5 = new JSONObject(verifyLicense);
                String optString3 = jSONObject5.optString("id");
                String optString4 = jSONObject5.optString("businessId");
                String optString5 = jSONObject5.optString("appId");
                this.mMonitor.sendByteCastAuthEvent("bytecast_license_auth_result", String.valueOf(this.mIsUserToB), CardStruct.IStatusCode.DEFAULT, optString5, this.mProjectId, optString4, null);
                this.mNetManager.reportVerifyResult(optString4, optString5, this.mProjectId, optString3, String.valueOf(800100), null);
                checkAndDownloadLicense(packageName, optString4, optString5, this.mProjectId, optString3, optLong);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_import", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, e3.getMessage());
            if (iAuthListener != null) {
                iAuthListener.onFailed(10014, "ERROR_IMPORT_LICENSE_INVALID", null);
            }
        }
    }

    public void verifyLicense(final String str, final IAuthListener iAuthListener) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("verifyLicense: projectId: ");
        LIZ.append(this.mProjectId);
        castLogger.d("AuthManager", X1D.LIZIZ(LIZ));
        this.mIsUserToB = PreferenceUtils.isByteUserToB();
        this.mIAuthLisRef = new WeakReference<>(iAuthListener);
        if (!this.mIsUserToB) {
            this.mLogger.d("AuthManager", "verify success: skip");
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_auth_result", "false", "1", null, this.mProjectId, null, null);
            if (iAuthListener != null) {
                iAuthListener.onSuccess();
            }
        }
        if (!this.mIsUserToB) {
            iAuthListener = null;
        }
        Dispatcher.getInstance().enqueue(new Runnable() { // from class: X.ZZf
            @Override // java.lang.Runnable
            public final void run() {
                AuthManager.this.lambda$verifyLicense$0(str, iAuthListener);
            }
        });
    }

    public void decodeAndCacheLicense(String str, long j, String str2) {
        this.mLogger.d("AuthManager", "decodeAndCacheLicense");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String verifyLicense = VerifyUtil.verifyLicense(str, jSONObject.optString("signature"), jSONObject.optString("content"));
            if (TextUtils.equals(verifyLicense, "-1")) {
                this.mMonitor.sendByteCastAuthEvent("bytecast_license_download", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, "license invalid");
            } else {
                JSONObject jSONObject2 = new JSONObject(verifyLicense);
                String optString = jSONObject2.optString("projectId");
                String optString2 = jSONObject2.optString("businessId");
                String optString3 = jSONObject2.optString("appId");
                this.mMonitor.sendByteCastAuthEvent("bytecast_license_download", String.valueOf(this.mIsUserToB), "1", optString3, optString, optString2, null);
                if (jSONObject2.optLong("updateTime") > j) {
                    String cacheLicense = this.mFileManager.cacheLicense(str2);
                    if (TextUtils.isEmpty(cacheLicense) || cacheLicense.startsWith("LICENSE_FILE_OPERATE_ERROR: ")) {
                        this.mMonitor.sendByteCastAuthEvent("bytecast_license_save", String.valueOf(this.mIsUserToB), "3", null, this.mProjectId, null, cacheLicense);
                    } else {
                        this.mMonitor.sendByteCastAuthEvent("bytecast_license_save", String.valueOf(this.mIsUserToB), "2", optString3, optString, optString2, null);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_download", String.valueOf(this.mIsUserToB), "2", null, this.mProjectId, null, e.getMessage());
        }
    }

    private void checkAndDownloadLicense(final String str, final String str2, final String str3, final String str4, final String str5, final long j) {
        this.mLogger.d("AuthManager", "checkAndDownloadLicense");
        try {
            this.mNetManager.checkLicense(str2, str3, str4, str5, j, new NetManager.INetListener() { // from class: com.byted.cast.common.auth.license.AuthManager.1
                @Override // com.byted.cast.common.auth.license.NetManager.INetListener
                public void onSuccess(String str6) {
                    if (TextUtils.isEmpty(str6)) {
                        AuthManager authManager = AuthManager.this;
                        authManager.mMonitor.sendByteCastAuthEvent("bytecast_license_check", String.valueOf(authManager.mIsUserToB), null, str3, str4, str2, "no need to update");
                    } else {
                        AuthManager authManager2 = AuthManager.this;
                        authManager2.mMonitor.sendByteCastAuthEvent("bytecast_license_check", String.valueOf(authManager2.mIsUserToB), str6, str3, str4, str2, null);
                        AuthManager.this.mNetManager.downloadLicense(str2, str3, str5, str6, new NetManager.INetListener() { // from class: com.byted.cast.common.auth.license.AuthManager.1.1
                            @Override // com.byted.cast.common.auth.license.NetManager.INetListener
                            public void onSuccess(String str7) {
                                if (TextUtils.isEmpty(str7)) {
                                    AuthManager authManager3 = AuthManager.this;
                                    CastMonitor castMonitor = authManager3.mMonitor;
                                    String valueOf = String.valueOf(authManager3.mIsUserToB);
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    castMonitor.sendByteCastAuthEvent("bytecast_license_download", valueOf, CardStruct.IStatusCode.DEFAULT, str3, str4, str2, "empty result");
                                    return;
                                }
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                AuthManager.this.decodeAndCacheLicense(str, j, str7);
                            }

                            @Override // com.byted.cast.common.auth.license.NetManager.INetListener
                            public void onFailed(int i, String str7, Exception exc) {
                                AuthManager authManager3 = AuthManager.this;
                                CastMonitor castMonitor = authManager3.mMonitor;
                                String valueOf = String.valueOf(authManager3.mIsUserToB);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                String str8 = str3;
                                String str9 = str4;
                                String str10 = str2;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(i);
                                LIZ.append("_");
                                LIZ.append(str7);
                                castMonitor.sendByteCastAuthEvent("bytecast_license_download", valueOf, CardStruct.IStatusCode.DEFAULT, str8, str9, str10, X1D.LIZIZ(LIZ));
                            }
                        });
                    }
                }

                @Override // com.byted.cast.common.auth.license.NetManager.INetListener
                public void onFailed(int i, String str6, Exception exc) {
                    AuthManager.this.mNetManager.reportVerifyResult(str2, str3, str4, str5, String.valueOf(i), null);
                    AuthManager authManager = AuthManager.this;
                    CastMonitor castMonitor = authManager.mMonitor;
                    String valueOf = String.valueOf(authManager.mIsUserToB);
                    String str7 = str3;
                    String str8 = str4;
                    String str9 = str2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i);
                    LIZ.append("_");
                    LIZ.append(str6);
                    castMonitor.sendByteCastAuthEvent("bytecast_license_check", valueOf, null, str7, str8, str9, X1D.LIZIZ(LIZ));
                    AuthManager authManager2 = AuthManager.this;
                    authManager2.mAuthCache.cacheLicenseContentInUse(authManager2.mProjectId, null);
                    AuthManager.this.notifyLicenseBanned();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            this.mMonitor.sendByteCastAuthEvent("bytecast_license_check", String.valueOf(this.mIsUserToB), null, str3, str4, str2, e.getMessage());
        }
    }
}
