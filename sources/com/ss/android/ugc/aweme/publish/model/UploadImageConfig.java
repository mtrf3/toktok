package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC36908Ee8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes8.dex */
public class UploadImageConfig extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("appKey")
    public String appKey;

    @InterfaceC65349Pkn("authorization")
    public String authorization;

    @InterfaceC65349Pkn("authorization2")
    public STSAuthConfig authorizationV2;

    @InterfaceC65349Pkn("enableHttps")
    public int enableHttps;

    @InterfaceC65349Pkn("fileHostName")
    public String fileHostName;

    @InterfaceC65349Pkn("fileRetryCount")
    public int fileRetryCount;

    @InterfaceC65349Pkn("imageHostName")
    public String imageHostName;

    @InterfaceC65349Pkn("maxFailTime")
    public int maxFailTime;

    @InterfaceC65349Pkn("maxFailTimeEnabled")
    public boolean maxFailTimeEnabled;

    @InterfaceC65349Pkn("rwTimeout")
    public int rwTimeout;

    @InterfaceC65349Pkn("sliceRetryCount")
    public int sliceRetryCount;

    @InterfaceC65349Pkn("sliceSize")
    public int sliceSize;

    @InterfaceC65349Pkn("sliceTimeout")
    public int sliceTimeout;

    @InterfaceC65349Pkn("socketNumber")
    public int socketNumber;

    @InterfaceC65349Pkn("userStoreRegion")
    public String userStoreRegion;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadImageConfig{appKey='");
        Q89.LIZIZ(LIZ, this.appKey, '\'', ", fileHostName='");
        Q89.LIZIZ(LIZ, this.fileHostName, '\'', ", imageHostName='");
        Q89.LIZIZ(LIZ, this.imageHostName, '\'', ", fileRetryCount=");
        LIZ.append(this.fileRetryCount);
        LIZ.append(", rwTimeout=");
        LIZ.append(this.rwTimeout);
        LIZ.append(", sliceSize=");
        LIZ.append(this.sliceSize);
        LIZ.append(", sliceTimeout=");
        LIZ.append(this.sliceTimeout);
        LIZ.append(", sliceRetryCount=");
        LIZ.append(this.sliceRetryCount);
        LIZ.append(", authorization='");
        Q89.LIZIZ(LIZ, this.authorization, '\'', ", enableHttps=");
        LIZ.append(this.enableHttps);
        LIZ.append(", userStoreRegion='");
        Q89.LIZIZ(LIZ, this.userStoreRegion, '\'', ", authorizationV2=");
        LIZ.append(this.authorizationV2);
        LIZ.append(", socketNumber=");
        return b0.LIZJ(LIZ, this.socketNumber, '}', LIZ);
    }
}
