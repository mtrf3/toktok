package com.ss.android.ugc.aweme.fe.method.upload.config;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UploadConfig extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("authorization2")
    public STSAuthConfig authorizationV2;

    @InterfaceC65349Pkn("enableHttps")
    public int enableHttps;

    @InterfaceC65349Pkn("fileRetryCount")
    public int fileRetryCount;

    @InterfaceC65349Pkn("maxFailTime")
    public int maxFailTime;

    @InterfaceC65349Pkn("maxFileSize")
    public int maxFileSize;

    @InterfaceC65349Pkn("sliceRetryCount")
    public int sliceRetryCount;

    @InterfaceC65349Pkn("sliceSize")
    public int sliceSize;

    @InterfaceC65349Pkn("sliceTimeout")
    public int sliceTimeout;

    @InterfaceC65349Pkn("socketNumber")
    public int socketNumber;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("appKey")
    public String appKey = "";

    @InterfaceC195777mH
    @InterfaceC65349Pkn("authorization")
    public String authKey = "";

    @InterfaceC195777mH
    @InterfaceC65349Pkn("videoHostName")
    public String videoHostName = "";

    @InterfaceC195777mH
    @InterfaceC65349Pkn("imageHostName")
    public String imageHostName = "";

    /* loaded from: classes16.dex */
    public static final class STSAuthConfig extends AbstractC36908Ee8 {

        @InterfaceC195777mH
        @InterfaceC65349Pkn("access_key_id")
        public String accessKeyId;

        @InterfaceC195777mH
        @InterfaceC65349Pkn("secret_access_key")
        public String secretAccessKey;

        @InterfaceC195777mH
        @InterfaceC65349Pkn("session_token")
        public String sessionToken;

        @InterfaceC195777mH
        @InterfaceC65349Pkn("space_name")
        public String spaceName;

        public final String getAccessKeyId() {
            return this.accessKeyId;
        }

        public final String getSecretAccessKey() {
            return this.secretAccessKey;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getSpaceName() {
            return this.spaceName;
        }

        public final void setAccessKeyId(String str) {
            this.accessKeyId = str;
        }

        public final void setSecretAccessKey(String str) {
            this.secretAccessKey = str;
        }

        public final void setSessionToken(String str) {
            this.sessionToken = str;
        }

        public final void setSpaceName(String str) {
            this.spaceName = str;
        }
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final STSAuthConfig getAuthorizationV2() {
        return this.authorizationV2;
    }

    public final int getEnableHttps() {
        return this.enableHttps;
    }

    public final int getFileRetryCount() {
        return this.fileRetryCount;
    }

    public final String getImageHostName() {
        return this.imageHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getSliceRetryCount() {
        return this.sliceRetryCount;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final int getSocketNumber() {
        return this.socketNumber;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public final void setAppKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appKey = str;
    }

    public final void setAuthKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.authKey = str;
    }

    public final void setAuthorizationV2(STSAuthConfig sTSAuthConfig) {
        this.authorizationV2 = sTSAuthConfig;
    }

    public final void setEnableHttps(int i) {
        this.enableHttps = i;
    }

    public final void setFileRetryCount(int i) {
        this.fileRetryCount = i;
    }

    public final void setImageHostName(String str) {
        this.imageHostName = str;
    }

    public final void setMaxFailTime(int i) {
        this.maxFailTime = i;
    }

    public final void setMaxFileSize(int i) {
        this.maxFileSize = i;
    }

    public final void setSliceRetryCount(int i) {
        this.sliceRetryCount = i;
    }

    public final void setSliceSize(int i) {
        this.sliceSize = i;
    }

    public final void setSliceTimeout(int i) {
        this.sliceTimeout = i;
    }

    public final void setSocketNumber(int i) {
        this.socketNumber = i;
    }

    public final void setVideoHostName(String str) {
        this.videoHostName = str;
    }
}
