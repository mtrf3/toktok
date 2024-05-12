package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAudioConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.net.HTTPDNS;
import kotlin.jvm.internal.o;

/* renamed from: X.HKm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43892HKm extends AbstractVideoUploader {
    public final BDVideoUploader LIZ;

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZ() {
        this.LIZ.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJFF() {
        this.LIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZLLL(HLJ hlj) {
        this.LIZ.setListener(new HLG(hlj));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJ(String path) {
        o.LJIIIZ(path, "path");
        this.LIZ.setPathName(path);
    }

    public C43892HKm(UploadAuthKeyConfig config, EnumC43889HKj business) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        STSAuthConfig sTSAuthConfig;
        STSAuthConfig sTSAuthConfig2;
        STSAuthConfig sTSAuthConfig3;
        STSAuthConfig sTSAuthConfig4;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(business, "business");
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        this.LIZ = bDVideoUploader;
        UploadAudioConfig uploadAudioConfig = config.uploadAudioConfig;
        if (uploadAudioConfig != null && (sTSAuthConfig4 = uploadAudioConfig.authorization2) != null) {
            str = sTSAuthConfig4.accessKeyId;
        } else {
            str = null;
        }
        bDVideoUploader.setTopAccessKey(str);
        UploadAudioConfig uploadAudioConfig2 = config.uploadAudioConfig;
        if (uploadAudioConfig2 != null && (sTSAuthConfig3 = uploadAudioConfig2.authorization2) != null) {
            str2 = sTSAuthConfig3.secretAccessKey;
        } else {
            str2 = null;
        }
        bDVideoUploader.setTopSecretKey(str2);
        UploadAudioConfig uploadAudioConfig3 = config.uploadAudioConfig;
        if (uploadAudioConfig3 != null && (sTSAuthConfig2 = uploadAudioConfig3.authorization2) != null) {
            str3 = sTSAuthConfig2.sessionToken;
        } else {
            str3 = null;
        }
        bDVideoUploader.setTopSessionToken(str3);
        UploadAudioConfig uploadAudioConfig4 = config.uploadAudioConfig;
        if (uploadAudioConfig4 != null && (sTSAuthConfig = uploadAudioConfig4.authorization2) != null) {
            str4 = sTSAuthConfig.spaceName;
        } else {
            str4 = null;
        }
        bDVideoUploader.setSpaceName(str4);
        UploadAudioConfig uploadAudioConfig5 = config.uploadAudioConfig;
        bDVideoUploader.setUploadDomain(uploadAudioConfig5 != null ? uploadAudioConfig5.fileHostName : null);
        UploadAudioConfig uploadAudioConfig6 = config.uploadAudioConfig;
        if (uploadAudioConfig6 != null) {
            i = uploadAudioConfig6.maxFailTime;
        } else {
            i = 0;
        }
        bDVideoUploader.setMaxFailTime(i);
        bDVideoUploader.setNetworkType(403, ESI.LIZ());
        bDVideoUploader.setNetworkType(404, C39044FUa.LIZ());
        H75 h75 = new H75();
        UploadVideoConfig uploadVideoConfig = config.videoConfig;
        if (uploadVideoConfig != null) {
            bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
            bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
            bDVideoUploader.setRWTimeout(uploadVideoConfig.sliceTimeout);
            bDVideoUploader.setSliceReTryCount(uploadVideoConfig.sliceRetryCount);
            bDVideoUploader.setFileRetryCount(uploadVideoConfig.fileRetryCount);
            bDVideoUploader.setSocketNum(1);
            bDVideoUploader.setAliveMaxFailTime(uploadVideoConfig.aliveMaxFailTime);
            bDVideoUploader.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
            FFL.LJIIIZ().getClass();
            bDVideoUploader.setResponseTimeOut(FFL.LJIIJ(31744, 0, "tt_uploader_response_time_out", true));
            bDVideoUploader.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
            BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
            UploadSettingConfig uploadSettingConfig = config.uploadSettingConfig;
            if (uploadSettingConfig != null) {
                BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
            }
            H75 h752 = new H75();
            h752.LIZ(uploadVideoConfig);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(h752.LIZLLL());
            LIZ.append(C43903HKx.LIZ());
            bDVideoUploader.setServerParameter(X1D.LIZIZ(LIZ));
            bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
            h75.LIZ(uploadVideoConfig);
        }
        C60903NvH.LJIIJJI().getApplicationService();
        boolean LIZLLL = C45039Hlz.LIZLLL();
        bDVideoUploader.setOpenBoe(LIZLLL);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDVideoUploader enableBoe:");
        LIZ2.append(LIZLLL);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        bDVideoUploader.setServerParameter(h75.LIZLLL());
    }
}
