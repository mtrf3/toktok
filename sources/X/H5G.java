package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.im.service.camera.config.DMBDVideoUploadConfig;
import com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig;
import com.ss.android.ugc.aweme.im.service.camera.config.DMVideoUploadConfig;
import com.ss.bduploader.BDVideoUploader;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5G extends AbstractC43455H3r {
    public H5I LJFF;
    public XFL LJI;
    public C43403H1r LJII;
    public DMVideoUploadConfig LJIIIIZZ;
    public C67996QmO LJIIIZ;
    public C118004k8 LJIIJ;
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(H5L.LJLIL);
    public final DMBDVideoUploadConfig LJIIL = H5J.LIZ().getVideoBDConfig();
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(H3P.LJLIL);
    public final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 715));
    public H3U LJIILL;

    public final H32 LJIIJJI() {
        return (H32) this.LJIILIIL.getValue();
    }

    public final BDVideoUploader LJIIL() {
        return (BDVideoUploader) this.LJIIJJI.getValue();
    }

    public final void LJIILIIL() {
        BDVideoUploader LJIIL = LJIIL();
        DMVideoUploadConfig dMVideoUploadConfig = this.LJIIIIZZ;
        if (dMVideoUploadConfig != null) {
            LJIIL.setUploadDomain(dMVideoUploadConfig.getHost());
            DMVideoUploadConfig dMVideoUploadConfig2 = this.LJIIIIZZ;
            if (dMVideoUploadConfig2 != null) {
                LJIIL.setTopAccessKey(dMVideoUploadConfig2.getAuthToken().getAccessKeyId());
                DMVideoUploadConfig dMVideoUploadConfig3 = this.LJIIIIZZ;
                if (dMVideoUploadConfig3 != null) {
                    LJIIL.setTopSecretKey(dMVideoUploadConfig3.getAuthToken().getSecretAccessKey());
                    DMVideoUploadConfig dMVideoUploadConfig4 = this.LJIIIIZZ;
                    if (dMVideoUploadConfig4 != null) {
                        LJIIL.setTopSessionToken(dMVideoUploadConfig4.getAuthToken().getSessionToken());
                        DMVideoUploadConfig dMVideoUploadConfig5 = this.LJIIIIZZ;
                        if (dMVideoUploadConfig5 != null) {
                            LJIIL.setSpaceName(dMVideoUploadConfig5.getSpaceName());
                            LJIIL.setEnableLogCallBack(true);
                            LJIIL.setMaxFailTime(this.LJIIL.getMaxFailTimes());
                            LJIIL.setSliceSize(this.LJIIL.getSliceSize());
                            LJIIL.setSliceReTryCount(this.LJIIL.getSliceRetryCount());
                            LJIIL.setRWTimeout(this.LJIIL.getRwTimeout());
                            LJIIL.setFileRetryCount(this.LJIIL.getFileRetryCount());
                            LJIIL.setSocketNum(this.LJIIL.getSocketNum());
                            LJIIL.setAliveMaxFailTime(this.LJIIL.getAliveMaxFailTime());
                            LJIIL.setTcpOpenTimeOutMilliSec(this.LJIIL.getTcpOpenTimeout());
                            LJIIL.setEnableHttps(this.LJIIL.getHttpsEnable());
                            LJIIL.setTranTimeOutUnit(this.LJIIL.getTranTimeOut());
                            LJIIL.setPrivateVideo(true);
                            H5I h5i = this.LJFF;
                            if (h5i != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("WaitUploadParamsTask: upload set info: ");
                                LIZ.append(h5i);
                                H78.LIZ(X1D.LIZIZ(LIZ));
                                LJIIL.setEstimatedVideoInfo(h5i.LIZ());
                                H31.LIZIZ(h5i);
                            }
                            LJIIL.setNetworkType(403, this.LJIIL.getMainNetworkType());
                            LJIIL.setNetworkType(404, this.LJIIL.getBackupNetworkType());
                            C60903NvH.LJIIJJI().getApplicationService();
                            LJIIL.setOpenBoe(C45039Hlz.LIZLLL());
                            return;
                        }
                        o.LJIJI("authConfig");
                        throw null;
                    }
                    o.LJIJI("authConfig");
                    throw null;
                }
                o.LJIJI("authConfig");
                throw null;
            }
            o.LJIJI("authConfig");
            throw null;
        }
        o.LJIJI("authConfig");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UPLOAD;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        if (cause instanceof C42984Gtw) {
            XFL xfl = this.LJI;
            if (xfl != null) {
                xfl.LJIIIZ(false);
            }
        } else {
            XFL xfl2 = this.LJI;
            if (xfl2 != null) {
                xfl2.LJIJJLI = false;
                xfl2.LIZIZ();
            }
        }
        this.LJIILL = c87623YaB;
        super.LIZ(cause, c87623YaB);
        return false;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        Object obj2;
        o.LJIIIZ(args, "args");
        this.LJIIIZ = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj == null || (obj instanceof XFL)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.LJI = (XFL) obj;
        Iterator<Object> it2 = args.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof DMMediaAuthConfig) {
                if (next != null) {
                    DMVideoUploadConfig videoUploadConfig = ((DMMediaAuthConfig) next).getVideoUploadConfig();
                    if (videoUploadConfig == null) {
                        return;
                    }
                    this.LJIIIIZZ = videoUploadConfig;
                    Iterator<Object> it3 = args.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LJII = (C43403H1r) next2;
                                Iterator<Object> it4 = args.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C43404H1s) {
                                        if (next3 != null) {
                                            Iterator<Object> it5 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it5.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        Iterator<Object> it6 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof C118004k8) {
                                                                if (next5 != null) {
                                                                    this.LJIIJ = (C118004k8) next5;
                                                                    Iterator<Object> it7 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (it7.hasNext()) {
                                                                            obj2 = it7.next();
                                                                            if (obj2 == null || (obj2 instanceof H5I)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            obj2 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    this.LJFF = (H5I) obj2;
                                                                    ((C42132GgC) this.LJIILJJIL.getValue()).LIZIZ();
                                                                    C43403H1r c43403H1r = this.LJII;
                                                                    if (c43403H1r != null) {
                                                                        DMMediaModel dMMediaModel = c43403H1r.LIZ.creativeModel.dmMediaModel;
                                                                        try {
                                                                            LJIILIIL();
                                                                            LJIIL().setListener(new H3Q(this));
                                                                            if (dMMediaModel != null && dMMediaModel.isSynthesised) {
                                                                                BDVideoUploader LJIIL = LJIIL();
                                                                                C43403H1r c43403H1r2 = this.LJII;
                                                                                if (c43403H1r2 != null) {
                                                                                    LJIIL.setPathName(c43403H1r2.LIZ.getOutputFile());
                                                                                } else {
                                                                                    o.LJIJI("editModelContainer");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                XFL xfl = this.LJI;
                                                                                if (xfl != null) {
                                                                                    C43403H1r c43403H1r3 = this.LJII;
                                                                                    if (c43403H1r3 != null) {
                                                                                        LJIIL().setExternFileReader(new H33(this, xfl, new File(c43403H1r3.LIZ.mParallelUploadOutputFile)));
                                                                                    } else {
                                                                                        o.LJIJI("editModelContainer");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                            }
                                                                            LJIIL().start();
                                                                            return;
                                                                        } catch (Exception e) {
                                                                            LJIILJJIL(20004, e);
                                                                            return;
                                                                        }
                                                                    }
                                                                    o.LJIJI("editModelContainer");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.dm.DMMediaPublishResult");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig");
    }

    public final void LJIILJJIL(int i, Throwable th) {
        ((C42132GgC) this.LJIILJJIL.getValue()).LIZ();
        C67996QmO c67996QmO = this.LJIIIZ;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(i, th);
            LJIIL().close();
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}
