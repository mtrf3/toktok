package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC36908Ee8;
import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes8.dex */
public class UploadSettingConfig extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("dns_back_type")
    public int dnsBackType;

    @InterfaceC65349Pkn("dns_main_type")
    public int dnsMainType;

    @InterfaceC65349Pkn("enable_pre_upload")
    public int enablePreUpload;

    @InterfaceC65349Pkn("pre_upload_encryption_mode")
    public int preUploadEncryptionMode;

    @InterfaceC65349Pkn("publish_close_client_watermark")
    public int publishCloseClientWatermark = 1;

    @InterfaceC65349Pkn("sw_encode_score")
    public float swEncodeScore = -1.0f;

    @InterfaceC65349Pkn("hw_encode_score")
    public float hwEncodeScore = -1.0f;

    @InterfaceC65349Pkn("dns_version")
    public int dnsVersion = -1;

    @InterfaceC65349Pkn("dns_backup_used_delay_time")
    public int dnsBackupUsedDelayTime = 2;

    @InterfaceC65349Pkn("dns_expired_time")
    public int dnsExpiredTime = 60;

    @InterfaceC65349Pkn("dns_own_server")
    public String dnsOwnServer = "";

    @InterfaceC65349Pkn("dns_google_server")
    public String dnsGoogleServer = "dns.google.com";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadSettingConfig{publishCloseClientWatermark(server)=");
        LIZ.append(this.publishCloseClientWatermark);
        LIZ.append(", enablePreUpload=");
        LIZ.append(this.enablePreUpload);
        LIZ.append(", preUploadEncryptionMode=");
        LIZ.append(this.preUploadEncryptionMode);
        LIZ.append(", swEncodeScore=");
        LIZ.append(this.swEncodeScore);
        LIZ.append(", hwEncodeScore=");
        LIZ.append(this.hwEncodeScore);
        LIZ.append(", dnsVersion=");
        LIZ.append(this.dnsVersion);
        LIZ.append(", dnsMainType=");
        LIZ.append(this.dnsMainType);
        LIZ.append(", dnsBackType=");
        LIZ.append(this.dnsBackType);
        LIZ.append(", dnsBackupUsedDelayTime=");
        LIZ.append(this.dnsBackupUsedDelayTime);
        LIZ.append(", dnsExpiredTime=");
        LIZ.append(this.dnsExpiredTime);
        LIZ.append(", dnsOwnServer='");
        Q89.LIZIZ(LIZ, this.dnsOwnServer, '\'', ", dnsGoogleServer='");
        return C77800Ug8.LIZJ(LIZ, this.dnsGoogleServer, '\'', '}', LIZ);
    }
}
