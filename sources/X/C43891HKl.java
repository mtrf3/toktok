package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadSettingConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.net.HTTPDNS;
import defpackage.e1;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HKl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43891HKl extends AbstractC43436H2y {
    public final InterfaceC65784Pro<BDVideoUploader> LIZ;
    public boolean LIZIZ;
    public BDVideoUploader LIZJ;

    @Override // X.AbstractC43436H2y
    public final void LIZ() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.allowMergeUpload();
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LIZIZ() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.cancelUpload();
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LIZJ() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.close();
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIL() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setPrivateVideo(true);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIILIIL() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setRetryStatesOption(1);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIJJLI() {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.start();
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    static {
        C43116Gw4.LIZ();
    }

    @Override // X.AbstractC43436H2y
    public final boolean LIZLLL() {
        return this.LIZIZ;
    }

    public C43891HKl(H5M internalUploaderCreator) {
        o.LJIIIZ(internalUploaderCreator, "internalUploaderCreator");
        this.LIZ = internalUploaderCreator;
    }

    @Override // X.AbstractC43436H2y
    public final void LJ(String str) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setContext(str);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJFF(String str) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setDiskResumeUniqueKey(str);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJI(TreeMap<String, Object> treeMap) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setEstimatedVideoInfo(treeMap);
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJII(C43435H2x c43435H2x) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setExternFileReader(new C43893HKn(c43435H2x));
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIIIZZ(C43424H2m c43424H2m) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setListener(new H3R(c43424H2m));
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIIZ(String str) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setPathName(str);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIJ(float f) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setPoster(f);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIJJI(int i) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setPreUploadEncryptionMode(i);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIILJJIL(int i) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setScenesTag(String.valueOf(i));
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIILL(int i) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setSliceSize(i);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIILLIIL(int i) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setSocketNum(i);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIIZILJ(int i) {
        if (i > 0) {
            BDVideoUploader bDVideoUploader = this.LIZJ;
            if (bDVideoUploader != null) {
                bDVideoUploader.setSpeedTestThresh(i);
            } else {
                o.LJIJI("mActualUploader");
                throw null;
            }
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIJ(int i) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setSpeedTestValue(i);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIJI(String str) {
        BDVideoUploader bDVideoUploader = this.LIZJ;
        if (bDVideoUploader != null) {
            bDVideoUploader.setTraceId(str);
        } else {
            o.LJIJI("mActualUploader");
            throw null;
        }
    }

    @Override // X.AbstractC43436H2y
    public final void LJIJJ(UploadAuthKeyConfig uploadAuthKeyConfig) {
        UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
        if (uploadVideoConfig != null) {
            STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
            if (sTSAuthConfig != null) {
                BDVideoUploader invoke = this.LIZ.invoke();
                this.LIZJ = invoke;
                if (invoke != null) {
                    invoke.setTopAccessKey(sTSAuthConfig.accessKeyId);
                    BDVideoUploader bDVideoUploader = this.LIZJ;
                    if (bDVideoUploader != null) {
                        bDVideoUploader.setTopSecretKey(sTSAuthConfig.secretAccessKey);
                        BDVideoUploader bDVideoUploader2 = this.LIZJ;
                        if (bDVideoUploader2 != null) {
                            bDVideoUploader2.setTopSessionToken(sTSAuthConfig.sessionToken);
                            BDVideoUploader bDVideoUploader3 = this.LIZJ;
                            if (bDVideoUploader3 != null) {
                                bDVideoUploader3.setSpaceName(sTSAuthConfig.spaceName);
                                if (e1.LIZ(31744, "enable_uploader_fallback", true, false)) {
                                    BDVideoUploader bDVideoUploader4 = this.LIZJ;
                                    if (bDVideoUploader4 != null) {
                                        bDVideoUploader4.setTTNetEngineFallbackOption(1);
                                    } else {
                                        o.LJIJI("mActualUploader");
                                        throw null;
                                    }
                                } else {
                                    BDVideoUploader bDVideoUploader5 = this.LIZJ;
                                    if (bDVideoUploader5 != null) {
                                        bDVideoUploader5.setTTNetEngineFallbackOption(0);
                                    } else {
                                        o.LJIJI("mActualUploader");
                                        throw null;
                                    }
                                }
                                BDVideoUploader bDVideoUploader6 = this.LIZJ;
                                if (bDVideoUploader6 != null) {
                                    bDVideoUploader6.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
                                    BDVideoUploader bDVideoUploader7 = this.LIZJ;
                                    if (bDVideoUploader7 != null) {
                                        bDVideoUploader7.setMaxFailTime(uploadVideoConfig.maxFailTime);
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append("default slice size = ");
                                        LIZ.append(uploadVideoConfig.sliceSize);
                                        H78.LIZIZ("UploadSmartSlice", X1D.LIZIZ(LIZ));
                                        BDVideoUploader bDVideoUploader8 = this.LIZJ;
                                        if (bDVideoUploader8 != null) {
                                            bDVideoUploader8.setSliceSize(uploadVideoConfig.sliceSize);
                                            BDVideoUploader bDVideoUploader9 = this.LIZJ;
                                            if (bDVideoUploader9 != null) {
                                                bDVideoUploader9.setUploadDomain(uploadVideoConfig.videoHostName);
                                                BDVideoUploader bDVideoUploader10 = this.LIZJ;
                                                if (bDVideoUploader10 != null) {
                                                    bDVideoUploader10.setRWTimeout(uploadVideoConfig.sliceTimeout);
                                                    BDVideoUploader bDVideoUploader11 = this.LIZJ;
                                                    if (bDVideoUploader11 != null) {
                                                        bDVideoUploader11.setSliceReTryCount(uploadVideoConfig.sliceRetryCount);
                                                        BDVideoUploader bDVideoUploader12 = this.LIZJ;
                                                        if (bDVideoUploader12 != null) {
                                                            bDVideoUploader12.setFileRetryCount(uploadVideoConfig.fileRetryCount);
                                                            int LIZ2 = C00F.LIZ(31744, 0, "studio_uploader_file_retry_count", true);
                                                            if (LIZ2 > 0) {
                                                                BDVideoUploader bDVideoUploader13 = this.LIZJ;
                                                                if (bDVideoUploader13 != null) {
                                                                    bDVideoUploader13.setFileRetryCount(LIZ2);
                                                                } else {
                                                                    o.LJIJI("mActualUploader");
                                                                    throw null;
                                                                }
                                                            }
                                                            BDVideoUploader bDVideoUploader14 = this.LIZJ;
                                                            if (bDVideoUploader14 != null) {
                                                                bDVideoUploader14.setSocketNum(1);
                                                                BDVideoUploader bDVideoUploader15 = this.LIZJ;
                                                                if (bDVideoUploader15 != null) {
                                                                    bDVideoUploader15.setAliveMaxFailTime(uploadVideoConfig.aliveMaxFailTime);
                                                                    BDVideoUploader bDVideoUploader16 = this.LIZJ;
                                                                    if (bDVideoUploader16 != null) {
                                                                        bDVideoUploader16.setTcpOpenTimeOutMilliSec(uploadVideoConfig.openTimeOut);
                                                                        BDVideoUploader bDVideoUploader17 = this.LIZJ;
                                                                        if (bDVideoUploader17 != null) {
                                                                            FFL.LJIIIZ().getClass();
                                                                            bDVideoUploader17.setResponseTimeOut(FFL.LJIIJ(31744, 0, "tt_uploader_response_time_out", true));
                                                                            BDVideoUploader bDVideoUploader18 = this.LIZJ;
                                                                            if (bDVideoUploader18 != null) {
                                                                                bDVideoUploader18.setEnableExternDNS(uploadVideoConfig.enableExternDNS);
                                                                                int LIZ3 = C00F.LIZ(31744, 0, "tool_upload_sdk_max_speed_thres", true);
                                                                                if (LIZ3 > 0) {
                                                                                    BDVideoUploader bDVideoUploader19 = this.LIZJ;
                                                                                    if (bDVideoUploader19 != null) {
                                                                                        bDVideoUploader19.setMaxUploadSpeedThresh(LIZ3);
                                                                                    } else {
                                                                                        o.LJIJI("mActualUploader");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                BDUploadResolver.setEnableTTNetDNS(uploadVideoConfig.enableTTNetDNS);
                                                                                UploadSettingConfig uploadSettingConfig = uploadAuthKeyConfig.uploadSettingConfig;
                                                                                if (uploadSettingConfig != null) {
                                                                                    BDUploadResolver.setDNSType(uploadSettingConfig.dnsVersion, uploadSettingConfig.dnsMainType, uploadSettingConfig.dnsBackType, uploadSettingConfig.dnsBackupUsedDelayTime, uploadSettingConfig.dnsExpiredTime);
                                                                                    HTTPDNS.setDNSServerHost(uploadSettingConfig.dnsOwnServer, uploadSettingConfig.dnsGoogleServer);
                                                                                }
                                                                                BDVideoUploader bDVideoUploader20 = this.LIZJ;
                                                                                if (bDVideoUploader20 != null) {
                                                                                    H75 h75 = new H75();
                                                                                    h75.LIZ(uploadVideoConfig);
                                                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                                                    LIZ4.append(h75.LIZLLL());
                                                                                    LIZ4.append(C43903HKx.LIZ());
                                                                                    bDVideoUploader20.setServerParameter(X1D.LIZIZ(LIZ4));
                                                                                    BDVideoUploader bDVideoUploader21 = this.LIZJ;
                                                                                    if (bDVideoUploader21 != null) {
                                                                                        bDVideoUploader21.setEnableHttps(uploadVideoConfig.enableHttps);
                                                                                        C60903NvH.LJIIJJI().getApplicationService();
                                                                                        boolean LIZLLL = C45039Hlz.LIZLLL();
                                                                                        BDVideoUploader bDVideoUploader22 = this.LIZJ;
                                                                                        if (bDVideoUploader22 != null) {
                                                                                            bDVideoUploader22.setOpenBoe(LIZLLL);
                                                                                            StringBuilder LIZ5 = X1D.LIZ();
                                                                                            LIZ5.append("BDVideoUploader enableBoe:");
                                                                                            LIZ5.append(LIZLLL);
                                                                                            H78.LIZ(X1D.LIZIZ(LIZ5));
                                                                                            int i = uploadVideoConfig.mainNetworkType;
                                                                                            C43116Gw4.LIZIZ(i);
                                                                                            int i2 = uploadVideoConfig.backupNetworkType;
                                                                                            C43116Gw4.LIZIZ(i2);
                                                                                            StringBuilder LIZ6 = X1D.LIZ();
                                                                                            LIZ6.append("mainNetworkType=");
                                                                                            LIZ6.append(i);
                                                                                            LIZ6.append(", backupNetworkType=");
                                                                                            LIZ6.append(i2);
                                                                                            H78.LIZIZ("AbstractPublishUploader", X1D.LIZIZ(LIZ6));
                                                                                            BDVideoUploader bDVideoUploader23 = this.LIZJ;
                                                                                            if (bDVideoUploader23 != null) {
                                                                                                bDVideoUploader23.setNetworkType(403, i);
                                                                                                BDVideoUploader bDVideoUploader24 = this.LIZJ;
                                                                                                if (bDVideoUploader24 != null) {
                                                                                                    bDVideoUploader24.setNetworkType(404, i2);
                                                                                                    if (uploadVideoConfig.enableQuic == 1) {
                                                                                                        BDVideoUploader bDVideoUploader25 = this.LIZJ;
                                                                                                        if (bDVideoUploader25 != null) {
                                                                                                            bDVideoUploader25.setDataTransportProtocol(2);
                                                                                                        } else {
                                                                                                            o.LJIJI("mActualUploader");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        BDVideoUploader bDVideoUploader26 = this.LIZJ;
                                                                                                        if (bDVideoUploader26 != null) {
                                                                                                            bDVideoUploader26.setDataTransportProtocol(0);
                                                                                                        } else {
                                                                                                            o.LJIJI("mActualUploader");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    if (C43161Gwn.LIZ()) {
                                                                                                        BDVideoUploader bDVideoUploader27 = this.LIZJ;
                                                                                                        if (bDVideoUploader27 != null) {
                                                                                                            bDVideoUploader27.setDiskResumeOption(1);
                                                                                                        } else {
                                                                                                            o.LJIJI("mActualUploader");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        BDVideoUploader bDVideoUploader28 = this.LIZJ;
                                                                                                        if (bDVideoUploader28 != null) {
                                                                                                            bDVideoUploader28.setDiskResumeOption(0);
                                                                                                        } else {
                                                                                                            o.LJIJI("mActualUploader");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    this.LIZIZ = true;
                                                                                                    return;
                                                                                                }
                                                                                                o.LJIJI("mActualUploader");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("mActualUploader");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("mActualUploader");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mActualUploader");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mActualUploader");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mActualUploader");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mActualUploader");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mActualUploader");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mActualUploader");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mActualUploader");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mActualUploader");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mActualUploader");
                                                    throw null;
                                                }
                                                o.LJIJI("mActualUploader");
                                                throw null;
                                            }
                                            o.LJIJI("mActualUploader");
                                            throw null;
                                        }
                                        o.LJIJI("mActualUploader");
                                        throw null;
                                    }
                                    o.LJIJI("mActualUploader");
                                    throw null;
                                }
                                o.LJIJI("mActualUploader");
                                throw null;
                            }
                            o.LJIJI("mActualUploader");
                            throw null;
                        }
                        o.LJIJI("mActualUploader");
                        throw null;
                    }
                    o.LJIJI("mActualUploader");
                    throw null;
                }
                o.LJIJI("mActualUploader");
                throw null;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
