package com.ss.android.ugc.aweme.services.upload;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ExternalUploadVideoConfig extends F9E {
    public final String appKey;
    public final String authorization;
    public final String fileHostName;
    public final int maxFailTime;
    public final int sliceSize;
    public final int sliceTimeout;
    public final String spaceName;
    public final String topAccessKey;
    public final String topSecretKey;
    public final String topSessionToken;
    public final String videoHostName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExternalUploadVideoConfig() {
        /*
            r14 = this;
            r1 = 0
            r3 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r13 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig.<init>():void");
    }

    public static /* synthetic */ ExternalUploadVideoConfig copy$default(ExternalUploadVideoConfig externalUploadVideoConfig, int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = externalUploadVideoConfig.maxFailTime;
        }
        if ((i4 & 2) != 0) {
            i2 = externalUploadVideoConfig.sliceSize;
        }
        if ((i4 & 4) != 0) {
            str = externalUploadVideoConfig.fileHostName;
        }
        if ((i4 & 8) != 0) {
            str2 = externalUploadVideoConfig.videoHostName;
        }
        if ((i4 & 16) != 0) {
            i3 = externalUploadVideoConfig.sliceTimeout;
        }
        if ((i4 & 32) != 0) {
            str3 = externalUploadVideoConfig.appKey;
        }
        if ((i4 & 64) != 0) {
            str4 = externalUploadVideoConfig.authorization;
        }
        if ((i4 & 128) != 0) {
            str5 = externalUploadVideoConfig.topAccessKey;
        }
        if ((i4 & 256) != 0) {
            str6 = externalUploadVideoConfig.topSecretKey;
        }
        if ((i4 & 512) != 0) {
            str7 = externalUploadVideoConfig.topSessionToken;
        }
        if ((i4 & 1024) != 0) {
            str8 = externalUploadVideoConfig.spaceName;
        }
        return externalUploadVideoConfig.copy(i, i2, str, str2, i3, str3, str4, str5, str6, str7, str8);
    }

    public final ExternalUploadVideoConfig copy(int i, int i2, String fileHostName, String videoHostName, int i3, String appKey, String authorization, String topAccessKey, String topSecretKey, String topSessionToken, String spaceName) {
        o.LJIIIZ(fileHostName, "fileHostName");
        o.LJIIIZ(videoHostName, "videoHostName");
        o.LJIIIZ(appKey, "appKey");
        o.LJIIIZ(authorization, "authorization");
        o.LJIIIZ(topAccessKey, "topAccessKey");
        o.LJIIIZ(topSecretKey, "topSecretKey");
        o.LJIIIZ(topSessionToken, "topSessionToken");
        o.LJIIIZ(spaceName, "spaceName");
        return new ExternalUploadVideoConfig(i, i2, fileHostName, videoHostName, i3, appKey, authorization, topAccessKey, topSecretKey, topSessionToken, spaceName);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxFailTime), Integer.valueOf(this.sliceSize), this.fileHostName, this.videoHostName, Integer.valueOf(this.sliceTimeout), this.appKey, this.authorization, this.topAccessKey, this.topSecretKey, this.topSessionToken, this.spaceName};
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final String getFileHostName() {
        return this.fileHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public final String getTopAccessKey() {
        return this.topAccessKey;
    }

    public final String getTopSecretKey() {
        return this.topSecretKey;
    }

    public final String getTopSessionToken() {
        return this.topSessionToken;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public ExternalUploadVideoConfig(int i, int i2, String fileHostName, String videoHostName, int i3, String appKey, String authorization, String topAccessKey, String topSecretKey, String topSessionToken, String spaceName) {
        o.LJIIIZ(fileHostName, "fileHostName");
        o.LJIIIZ(videoHostName, "videoHostName");
        o.LJIIIZ(appKey, "appKey");
        o.LJIIIZ(authorization, "authorization");
        o.LJIIIZ(topAccessKey, "topAccessKey");
        o.LJIIIZ(topSecretKey, "topSecretKey");
        o.LJIIIZ(topSessionToken, "topSessionToken");
        o.LJIIIZ(spaceName, "spaceName");
        this.maxFailTime = i;
        this.sliceSize = i2;
        this.fileHostName = fileHostName;
        this.videoHostName = videoHostName;
        this.sliceTimeout = i3;
        this.appKey = appKey;
        this.authorization = authorization;
        this.topAccessKey = topAccessKey;
        this.topSecretKey = topSecretKey;
        this.topSessionToken = topSessionToken;
        this.spaceName = spaceName;
    }

    public /* synthetic */ ExternalUploadVideoConfig(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) == 0 ? str8 : "");
    }
}
