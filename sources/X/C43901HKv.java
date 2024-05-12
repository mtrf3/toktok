package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.bduploader.BDNetworkSpeedTest;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.net.HTTPDNS;
import kotlin.jvm.internal.o;

/* renamed from: X.HKv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43901HKv extends QXX {
    public BDNetworkSpeedTest LJLIL;

    @Override // X.QXX
    public final void LJLJJL() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.LJLIL;
        if (bDNetworkSpeedTest != null) {
            bDNetworkSpeedTest.close();
        } else {
            o.LJIJI("mActualSpeedTest");
            throw null;
        }
    }

    @Override // X.QXX
    public final void LLLLLL() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.LJLIL;
        if (bDNetworkSpeedTest != null) {
            bDNetworkSpeedTest.stop();
        } else {
            o.LJIJI("mActualSpeedTest");
            throw null;
        }
    }

    public final void LLLLZLLIL() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.LJLIL;
        if (bDNetworkSpeedTest != null) {
            bDNetworkSpeedTest.start();
        } else {
            o.LJIJI("mActualSpeedTest");
            throw null;
        }
    }

    static {
        C43116Gw4.LIZ();
    }

    public final void LLLLZ(HL9 hl9) {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.LJLIL;
        if (bDNetworkSpeedTest != null) {
            bDNetworkSpeedTest.setListener(new C43904HKy(hl9));
        } else {
            o.LJIJI("mActualSpeedTest");
            throw null;
        }
    }

    public final void LLLLZIL(UploadAuthKeyConfig config) {
        o.LJIIIZ(config, "config");
        UploadVideoConfig uploadVideoConfig = config.videoConfig;
        if (uploadVideoConfig != null) {
            STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
            if (sTSAuthConfig != null) {
                BDNetworkSpeedTest bDNetworkSpeedTest = new BDNetworkSpeedTest();
                this.LJLIL = bDNetworkSpeedTest;
                int LIZ = C00F.LIZ(31744, 0, "enable_smart_upload_test", true);
                FFL.LJIIIZ().getClass();
                String LJIILJJIL = FFL.LJIILJJIL(31744, "intelligent_model_url", "https://sf16-va.tiktokcdn.com/obj/eden-va2/1ubzeh7nuhfps/smart_speed_test.zip", true);
                o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…tUploadModel::class.java)");
                bDNetworkSpeedTest.setIntelligentSpeedTestInfo(LIZ, LJIILJJIL);
                BDNetworkSpeedTest bDNetworkSpeedTest2 = this.LJLIL;
                if (bDNetworkSpeedTest2 != null) {
                    int LIZ2 = C00F.LIZ(31744, 0, "enable_smart_upload_protocol", true);
                    FFL.LJIIIZ().getClass();
                    String LJIILJJIL2 = FFL.LJIILJJIL(31744, "smart_protocol_model_url", "https://sf16-va.tiktokcdn.com/obj/eden-va2/1ubzeh7nuhfps/smart_speed_test.zip", true);
                    o.LJIIIIZZ(LJIILJJIL2, "getInstance().getStringV…ocolModelUrl::class.java)");
                    bDNetworkSpeedTest2.setIntelligentProtocolInfo(LIZ2, LJIILJJIL2);
                    BDNetworkSpeedTest bDNetworkSpeedTest3 = this.LJLIL;
                    if (bDNetworkSpeedTest3 != null) {
                        bDNetworkSpeedTest3.setTopAccessKey(sTSAuthConfig.accessKeyId);
                        BDNetworkSpeedTest bDNetworkSpeedTest4 = this.LJLIL;
                        if (bDNetworkSpeedTest4 != null) {
                            bDNetworkSpeedTest4.setTopSecretKey(sTSAuthConfig.secretAccessKey);
                            BDNetworkSpeedTest bDNetworkSpeedTest5 = this.LJLIL;
                            if (bDNetworkSpeedTest5 != null) {
                                bDNetworkSpeedTest5.setTopSessionToken(sTSAuthConfig.sessionToken);
                                BDNetworkSpeedTest bDNetworkSpeedTest6 = this.LJLIL;
                                if (bDNetworkSpeedTest6 != null) {
                                    bDNetworkSpeedTest6.setSpaceName(sTSAuthConfig.spaceName);
                                    BDNetworkSpeedTest bDNetworkSpeedTest7 = this.LJLIL;
                                    if (bDNetworkSpeedTest7 != null) {
                                        bDNetworkSpeedTest7.setMaxFailTime(uploadVideoConfig.maxFailTime);
                                        BDNetworkSpeedTest bDNetworkSpeedTest8 = this.LJLIL;
                                        if (bDNetworkSpeedTest8 != null) {
                                            bDNetworkSpeedTest8.setUploadDomain(uploadVideoConfig.videoHostName);
                                            BDNetworkSpeedTest bDNetworkSpeedTest9 = this.LJLIL;
                                            if (bDNetworkSpeedTest9 != null) {
                                                bDNetworkSpeedTest9.setRWTimeout(uploadVideoConfig.sliceTimeout);
                                                BDNetworkSpeedTest bDNetworkSpeedTest10 = this.LJLIL;
                                                if (bDNetworkSpeedTest10 != null) {
                                                    bDNetworkSpeedTest10.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                                                    BDNetworkSpeedTest bDNetworkSpeedTest11 = this.LJLIL;
                                                    if (bDNetworkSpeedTest11 != null) {
                                                        bDNetworkSpeedTest11.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                                                        BDNetworkSpeedTest bDNetworkSpeedTest12 = this.LJLIL;
                                                        if (bDNetworkSpeedTest12 != null) {
                                                            bDNetworkSpeedTest12.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                                                            BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                                                            UploadSettingConfig uploadSettingConfig = config.uploadSettingConfig;
                                                            if (uploadSettingConfig != null) {
                                                                BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                                                                HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                                                            }
                                                            BDNetworkSpeedTest bDNetworkSpeedTest13 = this.LJLIL;
                                                            if (bDNetworkSpeedTest13 != null) {
                                                                H75 h75 = new H75();
                                                                h75.LIZ(uploadVideoConfig);
                                                                StringBuilder LIZ3 = X1D.LIZ();
                                                                LIZ3.append(h75.LIZLLL());
                                                                LIZ3.append(C43903HKx.LIZ());
                                                                bDNetworkSpeedTest13.setServerParameter(X1D.LIZIZ(LIZ3));
                                                                BDNetworkSpeedTest bDNetworkSpeedTest14 = this.LJLIL;
                                                                if (bDNetworkSpeedTest14 != null) {
                                                                    bDNetworkSpeedTest14.setEnableHttps(uploadVideoConfig.enableHttps);
                                                                    int i = uploadVideoConfig.mainNetworkType;
                                                                    C43116Gw4.LIZIZ(i);
                                                                    int i2 = uploadVideoConfig.backupNetworkType;
                                                                    C43116Gw4.LIZIZ(i2);
                                                                    BDNetworkSpeedTest bDNetworkSpeedTest15 = this.LJLIL;
                                                                    if (bDNetworkSpeedTest15 != null) {
                                                                        bDNetworkSpeedTest15.setNetworkType(403, i);
                                                                        BDNetworkSpeedTest bDNetworkSpeedTest16 = this.LJLIL;
                                                                        if (bDNetworkSpeedTest16 != null) {
                                                                            bDNetworkSpeedTest16.setNetworkType(404, i2);
                                                                            if (uploadVideoConfig.enableQuic == 1) {
                                                                                BDNetworkSpeedTest bDNetworkSpeedTest17 = this.LJLIL;
                                                                                if (bDNetworkSpeedTest17 != null) {
                                                                                    bDNetworkSpeedTest17.setDataTransportProtocol(2);
                                                                                    return;
                                                                                } else {
                                                                                    o.LJIJI("mActualSpeedTest");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            BDNetworkSpeedTest bDNetworkSpeedTest18 = this.LJLIL;
                                                                            if (bDNetworkSpeedTest18 != null) {
                                                                                bDNetworkSpeedTest18.setDataTransportProtocol(0);
                                                                                return;
                                                                            } else {
                                                                                o.LJIJI("mActualSpeedTest");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        o.LJIJI("mActualSpeedTest");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mActualSpeedTest");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mActualSpeedTest");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mActualSpeedTest");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mActualSpeedTest");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mActualSpeedTest");
                                                    throw null;
                                                }
                                                o.LJIJI("mActualSpeedTest");
                                                throw null;
                                            }
                                            o.LJIJI("mActualSpeedTest");
                                            throw null;
                                        }
                                        o.LJIJI("mActualSpeedTest");
                                        throw null;
                                    }
                                    o.LJIJI("mActualSpeedTest");
                                    throw null;
                                }
                                o.LJIJI("mActualSpeedTest");
                                throw null;
                            }
                            o.LJIJI("mActualSpeedTest");
                            throw null;
                        }
                        o.LJIJI("mActualSpeedTest");
                        throw null;
                    }
                    o.LJIJI("mActualSpeedTest");
                    throw null;
                }
                o.LJIJI("mActualSpeedTest");
                throw null;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
