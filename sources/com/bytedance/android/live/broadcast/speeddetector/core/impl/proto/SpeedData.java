package com.bytedance.android.live.broadcast.speeddetector.core.impl.proto;

import X.C0YB;
import X.C0YC;
import X.EnumC05580Ju;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SpeedData {

    @InterfaceC65349Pkn("client_error")
    public ClientErrorData clientErrorData;

    @InterfaceC65349Pkn("config_data")
    public ConfigData configData;

    @InterfaceC65349Pkn("download_ack_data")
    public DownloadAckData downloadAckData;

    @InterfaceC65349Pkn("download_data")
    public DownloadData downloadData;

    @InterfaceC65349Pkn("init_data")
    public InitData initData;

    @InterfaceC65349Pkn("method")
    public int methodType;

    @InterfaceC65349Pkn("ping_data")
    public C0YC pingData;

    @InterfaceC65349Pkn("pong_data")
    public PongData pongData;

    @InterfaceC65349Pkn("real_time_data")
    public RealTime realTime;

    @InterfaceC65349Pkn("report_ack_data")
    public ReportAckData reportAckData;

    @InterfaceC65349Pkn("report_data")
    public ReportData reportData;

    @InterfaceC65349Pkn("seq_id")
    public int seqId;

    @InterfaceC65349Pkn("server_error")
    public ServerErrorData serverErrorData;

    @InterfaceC65349Pkn("timestemp")
    public long timeStamp;

    @InterfaceC65349Pkn("upload_ack_data")
    public UploadAckData uploadAckData;

    @InterfaceC65349Pkn("upload_data")
    public UploadData uploadData;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.initData != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(", initData=");
            LIZ.append(this.initData);
            sb.append(X1D.LIZIZ(LIZ));
        }
        if (this.configData != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", configData=");
            LIZ2.append(this.configData);
            sb.append(X1D.LIZIZ(LIZ2));
        }
        UploadData uploadData = this.uploadData;
        if (uploadData != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(", uploadData=");
            LIZ3.append(uploadData);
            sb.append(X1D.LIZIZ(LIZ3));
        }
        if (this.uploadAckData != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(", uploadAckData=");
            LIZ4.append(this.uploadAckData);
            sb.append(X1D.LIZIZ(LIZ4));
        }
        if (this.downloadData != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(", downloadData=");
            LIZ5.append(this.downloadData);
            sb.append(X1D.LIZIZ(LIZ5));
        }
        if (this.downloadAckData != null) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(", downloadAckData=");
            LIZ6.append(this.downloadAckData);
            sb.append(X1D.LIZIZ(LIZ6));
        }
        if (this.reportData != null) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(", reportData=");
            LIZ7.append(this.reportData);
            sb.append(X1D.LIZIZ(LIZ7));
        }
        if (this.reportAckData != null) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(", reportAckData=");
            LIZ8.append(this.reportAckData);
            sb.append(X1D.LIZIZ(LIZ8));
        }
        if (this.clientErrorData != null) {
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append(", clientErrorData=");
            LIZ9.append(this.clientErrorData);
            sb.append(X1D.LIZIZ(LIZ9));
        }
        if (this.serverErrorData != null) {
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append(", serverErrorData=");
            LIZ10.append(this.serverErrorData);
            sb.append(X1D.LIZIZ(LIZ10));
        }
        if (this.pongData != null) {
            StringBuilder LIZ11 = X1D.LIZ();
            LIZ11.append(", pongData=");
            LIZ11.append(this.pongData);
            sb.append(X1D.LIZIZ(LIZ11));
        }
        StringBuilder LIZ12 = X1D.LIZ();
        LIZ12.append("SpeedData(methodType=");
        LIZ12.append(this.methodType);
        LIZ12.append(", seqId=");
        LIZ12.append(this.seqId);
        LIZ12.append(", timeStamp=");
        LIZ12.append(this.timeStamp);
        LIZ12.append((Object) sb);
        LIZ12.append(')');
        return X1D.LIZIZ(LIZ12);
    }

    public SpeedData() {
        this.methodType = EnumC05580Ju.Unknown.getValue();
        this.timeStamp = System.currentTimeMillis();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpeedData(C0YB iProtoData) {
        this();
        o.LJIIIZ(iProtoData, "iProtoData");
        this.seqId = iProtoData.LIZ();
    }
}
