package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.bduploader.BDNetworkRouter;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.net.HTTPDNS;
import kotlin.jvm.internal.o;

/* renamed from: X.HKu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43900HKu extends QZV {
    public BDNetworkRouter LIZ;

    @Override // X.QZV
    public final void LJII() {
        BDNetworkRouter bDNetworkRouter = this.LIZ;
        if (bDNetworkRouter != null) {
            bDNetworkRouter.close();
        } else {
            o.LJIJI("mActualNetworkRouter");
            throw null;
        }
    }

    @Override // X.QZV, X.CGL
    public final void start() {
        BDNetworkRouter bDNetworkRouter = this.LIZ;
        if (bDNetworkRouter != null) {
            bDNetworkRouter.start();
        } else {
            o.LJIJI("mActualNetworkRouter");
            throw null;
        }
    }

    @Override // X.QZV, X.CGL
    public final void stop() {
        BDNetworkRouter bDNetworkRouter = this.LIZ;
        if (bDNetworkRouter != null) {
            bDNetworkRouter.stop();
        } else {
            o.LJIJI("mActualNetworkRouter");
            throw null;
        }
    }

    static {
        C43116Gw4.LIZ();
    }

    public final void LJIJI(HL8 hl8) {
        BDNetworkRouter bDNetworkRouter = this.LIZ;
        if (bDNetworkRouter != null) {
            bDNetworkRouter.setListener(new C43902HKw(hl8, this));
        } else {
            o.LJIJI("mActualNetworkRouter");
            throw null;
        }
    }

    public final void LJIJJ(int i) {
        BDNetworkRouter bDNetworkRouter = this.LIZ;
        if (bDNetworkRouter != null) {
            bDNetworkRouter.setRouteWeight(i);
        } else {
            o.LJIJI("mActualNetworkRouter");
            throw null;
        }
    }

    public final void LJIJJLI(UploadAuthKeyConfig config, int i) {
        o.LJIIIZ(config, "config");
        UploadVideoConfig uploadVideoConfig = config.videoConfig;
        if (uploadVideoConfig != null) {
            STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
            if (sTSAuthConfig != null) {
                BDNetworkRouter bDNetworkRouter = new BDNetworkRouter(i);
                this.LIZ = bDNetworkRouter;
                bDNetworkRouter.setTopAccessKey(sTSAuthConfig.accessKeyId);
                BDNetworkRouter bDNetworkRouter2 = this.LIZ;
                if (bDNetworkRouter2 != null) {
                    bDNetworkRouter2.setTopSecretKey(sTSAuthConfig.secretAccessKey);
                    BDNetworkRouter bDNetworkRouter3 = this.LIZ;
                    if (bDNetworkRouter3 != null) {
                        bDNetworkRouter3.setTopSessionToken(sTSAuthConfig.sessionToken);
                        BDNetworkRouter bDNetworkRouter4 = this.LIZ;
                        if (bDNetworkRouter4 != null) {
                            bDNetworkRouter4.setSpaceName(sTSAuthConfig.spaceName);
                            BDNetworkRouter bDNetworkRouter5 = this.LIZ;
                            if (bDNetworkRouter5 != null) {
                                bDNetworkRouter5.setMaxFailTime(uploadVideoConfig.maxFailTime);
                                BDNetworkRouter bDNetworkRouter6 = this.LIZ;
                                if (bDNetworkRouter6 != null) {
                                    bDNetworkRouter6.setUploadDomain(uploadVideoConfig.videoHostName);
                                    BDNetworkRouter bDNetworkRouter7 = this.LIZ;
                                    if (bDNetworkRouter7 != null) {
                                        bDNetworkRouter7.setRWTimeout(uploadVideoConfig.sliceTimeout);
                                        BDNetworkRouter bDNetworkRouter8 = this.LIZ;
                                        if (bDNetworkRouter8 != null) {
                                            bDNetworkRouter8.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                                            BDNetworkRouter bDNetworkRouter9 = this.LIZ;
                                            if (bDNetworkRouter9 != null) {
                                                bDNetworkRouter9.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                                                BDNetworkRouter bDNetworkRouter10 = this.LIZ;
                                                if (bDNetworkRouter10 != null) {
                                                    bDNetworkRouter10.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                                                    BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                                                    UploadSettingConfig uploadSettingConfig = config.uploadSettingConfig;
                                                    if (uploadSettingConfig != null) {
                                                        BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                                                        HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                                                    }
                                                    BDNetworkRouter bDNetworkRouter11 = this.LIZ;
                                                    if (bDNetworkRouter11 != null) {
                                                        H75 h75 = new H75();
                                                        h75.LIZ(uploadVideoConfig);
                                                        StringBuilder LIZ = X1D.LIZ();
                                                        LIZ.append(h75.LIZLLL());
                                                        LIZ.append(C43903HKx.LIZ());
                                                        bDNetworkRouter11.setServerParameter(X1D.LIZIZ(LIZ));
                                                        BDNetworkRouter bDNetworkRouter12 = this.LIZ;
                                                        if (bDNetworkRouter12 != null) {
                                                            bDNetworkRouter12.setEnableHttps(uploadVideoConfig.enableHttps);
                                                            int i2 = uploadVideoConfig.mainNetworkType;
                                                            C43116Gw4.LIZIZ(i2);
                                                            int i3 = uploadVideoConfig.backupNetworkType;
                                                            C43116Gw4.LIZIZ(i3);
                                                            BDNetworkRouter bDNetworkRouter13 = this.LIZ;
                                                            if (bDNetworkRouter13 != null) {
                                                                bDNetworkRouter13.setNetworkType(403, i2);
                                                                BDNetworkRouter bDNetworkRouter14 = this.LIZ;
                                                                if (bDNetworkRouter14 != null) {
                                                                    bDNetworkRouter14.setNetworkType(404, i3);
                                                                    if (uploadVideoConfig.enableQuic == 1) {
                                                                        BDNetworkRouter bDNetworkRouter15 = this.LIZ;
                                                                        if (bDNetworkRouter15 != null) {
                                                                            bDNetworkRouter15.setDataTransportProtocol(2);
                                                                            return;
                                                                        } else {
                                                                            o.LJIJI("mActualNetworkRouter");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    BDNetworkRouter bDNetworkRouter16 = this.LIZ;
                                                                    if (bDNetworkRouter16 != null) {
                                                                        bDNetworkRouter16.setDataTransportProtocol(0);
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("mActualNetworkRouter");
                                                                        throw null;
                                                                    }
                                                                }
                                                                o.LJIJI("mActualNetworkRouter");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mActualNetworkRouter");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mActualNetworkRouter");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mActualNetworkRouter");
                                                    throw null;
                                                }
                                                o.LJIJI("mActualNetworkRouter");
                                                throw null;
                                            }
                                            o.LJIJI("mActualNetworkRouter");
                                            throw null;
                                        }
                                        o.LJIJI("mActualNetworkRouter");
                                        throw null;
                                    }
                                    o.LJIJI("mActualNetworkRouter");
                                    throw null;
                                }
                                o.LJIJI("mActualNetworkRouter");
                                throw null;
                            }
                            o.LJIJI("mActualNetworkRouter");
                            throw null;
                        }
                        o.LJIJI("mActualNetworkRouter");
                        throw null;
                    }
                    o.LJIJI("mActualNetworkRouter");
                    throw null;
                }
                o.LJIJI("mActualNetworkRouter");
                throw null;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
