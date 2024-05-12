package com.kakao.sdk.auth;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.AESCipher;
import com.kakao.sdk.common.util.Cipher;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.PersistentKVStore;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.common.util.SharedPrefsWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TokenManager implements TokenManageable {
    public static final Companion Companion = new Companion();
    public static final C5H3<TokenManager> instance$delegate = C221108m2.LIZIZ(TokenManager$Companion$instance$2.INSTANCE);
    public final PersistentKVStore appCache;
    public OAuthToken currentToken;
    public final Cipher encryptor;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManager;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TokenManager getInstance() {
            return TokenManager.instance$delegate.getValue();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final TokenManager getInstance() {
        return Companion.getInstance();
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public void clear() {
        this.currentToken = null;
        this.appCache.remove("com.kakao.sdk.oauth_token").commit();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:63)|3|4|5|(1:7)(2:53|(1:57))|8|(3:9|10|(1:12)(2:45|(1:49)))|13|(2:14|15)|(1:17)(2:38|(1:40)(6:41|19|20|(1:22)(2:31|(1:33)(2:34|(1:29)(2:26|27)))|23|(1:29)(1:30)))|18|19|20|(0)(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012e, code lost:
    
        com.kakao.sdk.common.util.SdkLog.Companion.e(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f A[Catch: Exception -> 0x012d, TryCatch #1 {Exception -> 0x012d, blocks: (B:20:0x0104, B:31:0x010f), top: B:19:0x0104 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void migrateFromOldVersion() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.TokenManager.migrateFromOldVersion():void");
    }

    public final PersistentKVStore getAppCache() {
        return this.appCache;
    }

    public final Cipher getEncryptor() {
        return this.encryptor;
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public OAuthToken getToken() {
        return this.currentToken;
    }

    @Override // com.kakao.sdk.auth.TokenManageable
    public synchronized void setToken(OAuthToken token) {
        o.LJIIIZ(token, "token");
        OAuthToken oAuthToken = new OAuthToken(token.getAccessToken(), token.getAccessTokenExpiresAt(), token.getRefreshToken(), token.getRefreshTokenExpiresAt(), null, token.getScopes(), 16, null);
        try {
            this.appCache.putString("com.kakao.sdk.oauth_token", this.encryptor.encrypt(KakaoJson.INSTANCE.toJson(oAuthToken))).commit();
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
        }
        this.currentToken = oAuthToken;
    }

    public TokenManager(PersistentKVStore appCache, Cipher encryptor) {
        o.LJIIIZ(appCache, "appCache");
        o.LJIIIZ(encryptor, "encryptor");
        this.appCache = appCache;
        this.encryptor = encryptor;
        OAuthToken oAuthToken = null;
        if (PersistentKVStore.DefaultImpls.getString$default(appCache, "com.kakao.sdk.version", null, 2, null) == null) {
            migrateFromOldVersion();
        }
        String string$default = PersistentKVStore.DefaultImpls.getString$default(appCache, "com.kakao.sdk.oauth_token", null, 2, null);
        if (string$default != null) {
            try {
                oAuthToken = (OAuthToken) KakaoJson.INSTANCE.fromJson(getEncryptor().decrypt(string$default), OAuthToken.class);
            } catch (Throwable th) {
                SdkLog.Companion.e(th);
            }
        }
        this.currentToken = oAuthToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TokenManager(PersistentKVStore persistentKVStore, Cipher cipher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SharedPrefsWrapper(KakaoSdk.INSTANCE.getApplicationContextInfo().getSharedPreferences()) : persistentKVStore, (i & 2) != 0 ? new AESCipher(null, 1, 0 == true ? 1 : 0) : cipher);
    }
}
