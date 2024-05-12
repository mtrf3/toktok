package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DMBDImageUploadConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("backup_network_type")
    public final int backupNetworkType;

    @InterfaceC65349Pkn("file_retry_count")
    public final int fileRetryCount;

    @InterfaceC65349Pkn("https_enable")
    public final int httpsEnable;

    @InterfaceC65349Pkn("main_network_type")
    public final int mainNetworkType;

    @InterfaceC65349Pkn("max_fail_times")
    public final int maxFailTimes;

    @InterfaceC65349Pkn("rw_timeout")
    public final int rwTimeout;

    @InterfaceC65349Pkn("socket_num")
    public final int socketNum;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DMBDImageUploadConfig() {
        /*
            r10 = this;
            r1 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 0
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.camera.config.DMBDImageUploadConfig.<init>():void");
    }

    public static /* synthetic */ DMBDImageUploadConfig copy$default(DMBDImageUploadConfig dMBDImageUploadConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = dMBDImageUploadConfig.fileRetryCount;
        }
        if ((i8 & 2) != 0) {
            i2 = dMBDImageUploadConfig.rwTimeout;
        }
        if ((i8 & 4) != 0) {
            i3 = dMBDImageUploadConfig.httpsEnable;
        }
        if ((i8 & 8) != 0) {
            i4 = dMBDImageUploadConfig.socketNum;
        }
        if ((i8 & 16) != 0) {
            i5 = dMBDImageUploadConfig.maxFailTimes;
        }
        if ((i8 & 32) != 0) {
            i6 = dMBDImageUploadConfig.mainNetworkType;
        }
        if ((i8 & 64) != 0) {
            i7 = dMBDImageUploadConfig.backupNetworkType;
        }
        return dMBDImageUploadConfig.copy(i, i2, i3, i4, i5, i6, i7);
    }

    public final DMBDImageUploadConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new DMBDImageUploadConfig(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.fileRetryCount), Integer.valueOf(this.rwTimeout), Integer.valueOf(this.httpsEnable), Integer.valueOf(this.socketNum), Integer.valueOf(this.maxFailTimes), Integer.valueOf(this.mainNetworkType), Integer.valueOf(this.backupNetworkType)};
    }

    public final int getBackupNetworkType() {
        return this.backupNetworkType;
    }

    public final int getFileRetryCount() {
        return this.fileRetryCount;
    }

    public final int getHttpsEnable() {
        return this.httpsEnable;
    }

    public final int getMainNetworkType() {
        return this.mainNetworkType;
    }

    public final int getMaxFailTimes() {
        return this.maxFailTimes;
    }

    public final int getRwTimeout() {
        return this.rwTimeout;
    }

    public final int getSocketNum() {
        return this.socketNum;
    }

    public DMBDImageUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.fileRetryCount = i;
        this.rwTimeout = i2;
        this.httpsEnable = i3;
        this.socketNum = i4;
        this.maxFailTimes = i5;
        this.mainNetworkType = i6;
        this.backupNetworkType = i7;
    }

    public /* synthetic */ DMBDImageUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 2 : i, (i8 & 2) != 0 ? 10 : i2, (i8 & 4) != 0 ? 1 : i3, (i8 & 8) == 0 ? i4 : 2, (i8 & 16) != 0 ? 5 : i5, (i8 & 32) != 0 ? 1 : i6, (i8 & 64) != 0 ? -1 : i7);
    }
}
