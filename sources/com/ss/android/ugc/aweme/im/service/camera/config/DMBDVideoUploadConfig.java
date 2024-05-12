package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DMBDVideoUploadConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("alive_max_fail_time")
    public final int aliveMaxFailTime;

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

    @InterfaceC65349Pkn("need_vframe")
    public final boolean needVframe;

    @InterfaceC65349Pkn("rw_timeout")
    public final int rwTimeout;

    @InterfaceC65349Pkn("slice_retry_count")
    public final int sliceRetryCount;

    @InterfaceC65349Pkn("slice_size")
    public final int sliceSize;

    @InterfaceC65349Pkn("socket_num")
    public final int socketNum;

    @InterfaceC65349Pkn("tcp_open_timeout_ms")
    public final int tcpOpenTimeout;

    @InterfaceC65349Pkn("tran_time_out")
    public final int tranTimeOut;

    /* JADX WARN: Multi-variable type inference failed */
    public DMBDVideoUploadConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, null);
    }

    public static /* synthetic */ DMBDVideoUploadConfig copy$default(DMBDVideoUploadConfig dMBDVideoUploadConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = dMBDVideoUploadConfig.sliceRetryCount;
        }
        if ((i13 & 2) != 0) {
            i2 = dMBDVideoUploadConfig.fileRetryCount;
        }
        if ((i13 & 4) != 0) {
            i3 = dMBDVideoUploadConfig.rwTimeout;
        }
        if ((i13 & 8) != 0) {
            i4 = dMBDVideoUploadConfig.sliceSize;
        }
        if ((i13 & 16) != 0) {
            i5 = dMBDVideoUploadConfig.socketNum;
        }
        if ((i13 & 32) != 0) {
            i6 = dMBDVideoUploadConfig.maxFailTimes;
        }
        if ((i13 & 64) != 0) {
            i7 = dMBDVideoUploadConfig.aliveMaxFailTime;
        }
        if ((i13 & 128) != 0) {
            i8 = dMBDVideoUploadConfig.tranTimeOut;
        }
        if ((i13 & 256) != 0) {
            i9 = dMBDVideoUploadConfig.tcpOpenTimeout;
        }
        if ((i13 & 512) != 0) {
            i10 = dMBDVideoUploadConfig.httpsEnable;
        }
        if ((i13 & 1024) != 0) {
            i11 = dMBDVideoUploadConfig.mainNetworkType;
        }
        if ((i13 & 2048) != 0) {
            i12 = dMBDVideoUploadConfig.backupNetworkType;
        }
        if ((i13 & 4096) != 0) {
            z = dMBDVideoUploadConfig.needVframe;
        }
        return dMBDVideoUploadConfig.copy(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, z);
    }

    public final DMBDVideoUploadConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z) {
        return new DMBDVideoUploadConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sliceRetryCount), Integer.valueOf(this.fileRetryCount), Integer.valueOf(this.rwTimeout), Integer.valueOf(this.sliceSize), Integer.valueOf(this.socketNum), Integer.valueOf(this.maxFailTimes), Integer.valueOf(this.aliveMaxFailTime), Integer.valueOf(this.tranTimeOut), Integer.valueOf(this.tcpOpenTimeout), Integer.valueOf(this.httpsEnable), Integer.valueOf(this.mainNetworkType), Integer.valueOf(this.backupNetworkType), Boolean.valueOf(this.needVframe)};
    }

    public final int getAliveMaxFailTime() {
        return this.aliveMaxFailTime;
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

    public final boolean getNeedVframe() {
        return this.needVframe;
    }

    public final int getRwTimeout() {
        return this.rwTimeout;
    }

    public final int getSliceRetryCount() {
        return this.sliceRetryCount;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSocketNum() {
        return this.socketNum;
    }

    public final int getTcpOpenTimeout() {
        return this.tcpOpenTimeout;
    }

    public final int getTranTimeOut() {
        return this.tranTimeOut;
    }

    public DMBDVideoUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z) {
        this.sliceRetryCount = i;
        this.fileRetryCount = i2;
        this.rwTimeout = i3;
        this.sliceSize = i4;
        this.socketNum = i5;
        this.maxFailTimes = i6;
        this.aliveMaxFailTime = i7;
        this.tranTimeOut = i8;
        this.tcpOpenTimeout = i9;
        this.httpsEnable = i10;
        this.mainNetworkType = i11;
        this.backupNetworkType = i12;
        this.needVframe = z;
    }

    public /* synthetic */ DMBDVideoUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 2 : i, (i13 & 2) != 0 ? 1 : i2, (i13 & 4) != 0 ? 40 : i3, (i13 & 8) != 0 ? 524288 : i4, (i13 & 16) == 0 ? i5 : 2, (i13 & 32) != 0 ? 30 : i6, (i13 & 64) != 0 ? 6 : i7, (i13 & 128) == 0 ? i8 : 40, (i13 & 256) != 0 ? 10000 : i9, (i13 & 512) != 0 ? 1 : i10, (i13 & 1024) != 0 ? 1 : i11, (i13 & 2048) != 0 ? 0 : i12, (i13 & 4096) == 0 ? z : true);
    }
}
