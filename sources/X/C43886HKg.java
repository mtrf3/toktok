package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAudioConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadMusicStripAudioConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoUploader;
import kotlin.jvm.internal.o;

/* renamed from: X.HKg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43886HKg extends AbstractVideoUploader {
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
        this.LIZ.setListener(new HLH(hlj));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJ(String path) {
        o.LJIIIZ(path, "path");
        this.LIZ.setPathName(path);
    }

    public C43886HKg(UploadAuthKeyConfig config, EnumC43889HKj business) {
        String str;
        String str2;
        String str3;
        String str4;
        STSAuthConfig sTSAuthConfig;
        STSAuthConfig sTSAuthConfig2;
        STSAuthConfig sTSAuthConfig3;
        STSAuthConfig sTSAuthConfig4;
        String str5;
        String str6;
        String str7;
        String str8;
        STSAuthConfig sTSAuthConfig5;
        STSAuthConfig sTSAuthConfig6;
        STSAuthConfig sTSAuthConfig7;
        STSAuthConfig sTSAuthConfig8;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(business, "business");
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        this.LIZ = bDVideoUploader;
        int i = C43888HKi.LIZ[business.ordinal()];
        if (i != 1) {
            if (i == 2) {
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig = config.uploadMusicStripAudioConfig;
                if (uploadMusicStripAudioConfig != null && (sTSAuthConfig8 = uploadMusicStripAudioConfig.authorization2) != null) {
                    str5 = sTSAuthConfig8.accessKeyId;
                } else {
                    str5 = null;
                }
                bDVideoUploader.setTopAccessKey(str5);
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig2 = config.uploadMusicStripAudioConfig;
                if (uploadMusicStripAudioConfig2 != null && (sTSAuthConfig7 = uploadMusicStripAudioConfig2.authorization2) != null) {
                    str6 = sTSAuthConfig7.secretAccessKey;
                } else {
                    str6 = null;
                }
                bDVideoUploader.setTopSecretKey(str6);
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig3 = config.uploadMusicStripAudioConfig;
                if (uploadMusicStripAudioConfig3 != null && (sTSAuthConfig6 = uploadMusicStripAudioConfig3.authorization2) != null) {
                    str7 = sTSAuthConfig6.sessionToken;
                } else {
                    str7 = null;
                }
                bDVideoUploader.setTopSessionToken(str7);
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig4 = config.uploadMusicStripAudioConfig;
                if (uploadMusicStripAudioConfig4 != null && (sTSAuthConfig5 = uploadMusicStripAudioConfig4.authorization2) != null) {
                    str8 = sTSAuthConfig5.spaceName;
                } else {
                    str8 = null;
                }
                bDVideoUploader.setSpaceName(str8);
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig5 = config.uploadMusicStripAudioConfig;
                bDVideoUploader.setUploadDomain(uploadMusicStripAudioConfig5 != null ? uploadMusicStripAudioConfig5.fileHostName : null);
                UploadMusicStripAudioConfig uploadMusicStripAudioConfig6 = config.uploadMusicStripAudioConfig;
                bDVideoUploader.setMaxFailTime(uploadMusicStripAudioConfig6 != null ? uploadMusicStripAudioConfig6.maxFailTime : 0);
            }
        } else {
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
            bDVideoUploader.setMaxFailTime(uploadAudioConfig6 != null ? uploadAudioConfig6.maxFailTime : 0);
        }
        bDVideoUploader.setNetworkType(403, ESI.LIZ());
        bDVideoUploader.setNetworkType(404, C39044FUa.LIZ());
        bDVideoUploader.setFileRetryCount(1);
        H75 h75 = new H75();
        UploadVideoConfig uploadVideoConfig = config.videoConfig;
        if (uploadVideoConfig != null) {
            bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
            bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
            bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
            h75.LIZ(uploadVideoConfig);
        }
        bDVideoUploader.setServerParameter(h75.LIZLLL());
    }
}
