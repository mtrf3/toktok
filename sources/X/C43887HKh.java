package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoUploader;
import kotlin.jvm.internal.o;

/* renamed from: X.HKh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43887HKh extends AbstractVideoUploader {
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
        this.LIZ.setListener(new HLI(hlj));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJ(String path) {
        o.LJIIIZ(path, "path");
        this.LIZ.setPathName(path);
    }

    public final void LJI(String userReference) {
        o.LJIIIZ(userReference, "userReference");
        this.LIZ.setUserReference(userReference);
    }

    public C43887HKh(UploadVideoConfig uploadVideoConfig, EnumC43889HKj business) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        o.LJIIIZ(business, "business");
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        this.LIZ = bDVideoUploader;
        int i = C43890HKk.LIZ[business.ordinal()];
        if (i != 1) {
            if (i != 2) {
                STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig != null) {
                    str7 = sTSAuthConfig.accessKeyId;
                } else {
                    str7 = null;
                }
                bDVideoUploader.setTopAccessKey(str7);
                STSAuthConfig sTSAuthConfig2 = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig2 != null) {
                    str8 = sTSAuthConfig2.secretAccessKey;
                } else {
                    str8 = null;
                }
                bDVideoUploader.setTopSecretKey(str8);
                STSAuthConfig sTSAuthConfig3 = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig3 != null) {
                    str9 = sTSAuthConfig3.sessionToken;
                } else {
                    str9 = null;
                }
                bDVideoUploader.setTopSessionToken(str9);
                STSAuthConfig sTSAuthConfig4 = uploadVideoConfig.authorizationV2;
                bDVideoUploader.setSpaceName(sTSAuthConfig4 != null ? sTSAuthConfig4.spaceName : null);
            } else {
                STSAuthConfig sTSAuthConfig5 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig5 != null) {
                    str4 = sTSAuthConfig5.accessKeyId;
                } else {
                    str4 = null;
                }
                bDVideoUploader.setTopAccessKey(str4);
                STSAuthConfig sTSAuthConfig6 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig6 != null) {
                    str5 = sTSAuthConfig6.secretAccessKey;
                } else {
                    str5 = null;
                }
                bDVideoUploader.setTopSecretKey(str5);
                STSAuthConfig sTSAuthConfig7 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig7 != null) {
                    str6 = sTSAuthConfig7.sessionToken;
                } else {
                    str6 = null;
                }
                bDVideoUploader.setTopSessionToken(str6);
                STSAuthConfig sTSAuthConfig8 = uploadVideoConfig.testSpeedAuthorization2;
                bDVideoUploader.setSpaceName(sTSAuthConfig8 != null ? sTSAuthConfig8.spaceName : null);
            }
        } else {
            STSAuthConfig sTSAuthConfig9 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig9 != null) {
                str = sTSAuthConfig9.accessKeyId;
            } else {
                str = null;
            }
            bDVideoUploader.setTopAccessKey(str);
            STSAuthConfig sTSAuthConfig10 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig10 != null) {
                str2 = sTSAuthConfig10.secretAccessKey;
            } else {
                str2 = null;
            }
            bDVideoUploader.setTopSecretKey(str2);
            STSAuthConfig sTSAuthConfig11 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig11 != null) {
                str3 = sTSAuthConfig11.sessionToken;
            } else {
                str3 = null;
            }
            bDVideoUploader.setTopSessionToken(str3);
            STSAuthConfig sTSAuthConfig12 = uploadVideoConfig.captionAuthorization2;
            bDVideoUploader.setSpaceName(sTSAuthConfig12 != null ? sTSAuthConfig12.spaceName : null);
        }
        bDVideoUploader.setUploadDomain(uploadVideoConfig.videoHostName);
        bDVideoUploader.setNetworkType(403, ESI.LIZ());
        bDVideoUploader.setNetworkType(404, C39044FUa.LIZ());
        bDVideoUploader.setMaxFailTime(uploadVideoConfig.maxFailTime);
        bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
        bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
        bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
        bDVideoUploader.setFileRetryCount(1);
        H75 h75 = new H75();
        h75.LIZ(uploadVideoConfig);
        bDVideoUploader.setServerParameter(h75.LIZLLL());
    }
}
