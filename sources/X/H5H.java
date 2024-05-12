package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.im.service.camera.config.DMBDImageUploadConfig;
import com.ss.android.ugc.aweme.im.service.camera.config.DMImageUploadConfig;
import com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H5H extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public C43403H1r LJI;
    public DMImageUploadConfig LJII;
    public BDImageXUploader LJIIIIZZ;
    public DMBDImageUploadConfig LJIIIZ;
    public DMMediaModel LJIIJ;
    public BDImageXInfo LJIIJJI;
    public C118004k8 LJIIL;
    public String LJIILIIL;
    public final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 708));

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UPLOAD;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        BDImageXUploader bDImageXUploader;
        DMImageUploadConfig dMImageUploadConfig;
        o.LJIIIZ(args, "args");
        this.LJFF = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C118004k8) {
                if (next != null) {
                    this.LJIIL = (C118004k8) next;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LJI = (C43403H1r) next2;
                                ((C42132GgC) this.LJIILJJIL.getValue()).LIZIZ();
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof DMMediaAuthConfig) {
                                        if (next3 != null) {
                                            DMImageUploadConfig imageUploadConfig = ((DMMediaAuthConfig) next3).getImageUploadConfig();
                                            if (imageUploadConfig == null) {
                                                LJIIJJI(20001, new C43452H3o("authkey null"));
                                                return;
                                            }
                                            this.LJII = imageUploadConfig;
                                            this.LJIIIZ = H5J.LIZ().getImageBDConfig();
                                            C43403H1r c43403H1r = this.LJI;
                                            if (c43403H1r != null) {
                                                VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
                                                String str = videoPublishEditModel.mOutputFile;
                                                if (str == null) {
                                                    LJIIJJI(20002, new C43452H3o("file path is null"));
                                                    return;
                                                }
                                                this.LJIILIIL = str;
                                                DMMediaModel dMMediaModel = videoPublishEditModel.creativeModel.dmMediaModel;
                                                if (dMMediaModel == null) {
                                                    LJIIJJI(20003, new C43452H3o("DmMediaModel null"));
                                                    return;
                                                }
                                                this.LJIIJ = dMMediaModel;
                                                try {
                                                    bDImageXUploader = new BDImageXUploader();
                                                    bDImageXUploader.setOpenBoe(C45039Hlz.LIZLLL());
                                                    dMImageUploadConfig = this.LJII;
                                                } catch (Exception e) {
                                                    LJIIJJI(20004, e);
                                                }
                                                if (dMImageUploadConfig != null) {
                                                    bDImageXUploader.setUploadDomain(dMImageUploadConfig.getHost());
                                                    DMImageUploadConfig dMImageUploadConfig2 = this.LJII;
                                                    if (dMImageUploadConfig2 != null) {
                                                        bDImageXUploader.setTopAccessKey(dMImageUploadConfig2.getAuthToken().getAccessKeyId());
                                                        DMImageUploadConfig dMImageUploadConfig3 = this.LJII;
                                                        if (dMImageUploadConfig3 != null) {
                                                            bDImageXUploader.setTopSecretKey(dMImageUploadConfig3.getAuthToken().getSecretAccessKey());
                                                            DMImageUploadConfig dMImageUploadConfig4 = this.LJII;
                                                            if (dMImageUploadConfig4 != null) {
                                                                bDImageXUploader.setTopSessionToken(dMImageUploadConfig4.getAuthToken().getSessionToken());
                                                                DMImageUploadConfig dMImageUploadConfig5 = this.LJII;
                                                                if (dMImageUploadConfig5 != null) {
                                                                    bDImageXUploader.setServiceID(dMImageUploadConfig5.getService_id());
                                                                    DMBDImageUploadConfig dMBDImageUploadConfig = this.LJIIIZ;
                                                                    if (dMBDImageUploadConfig != null) {
                                                                        bDImageXUploader.setNetworkType(403, dMBDImageUploadConfig.getMainNetworkType());
                                                                        DMBDImageUploadConfig dMBDImageUploadConfig2 = this.LJIIIZ;
                                                                        if (dMBDImageUploadConfig2 != null) {
                                                                            bDImageXUploader.setNetworkType(404, dMBDImageUploadConfig2.getBackupNetworkType());
                                                                            DMBDImageUploadConfig dMBDImageUploadConfig3 = this.LJIIIZ;
                                                                            if (dMBDImageUploadConfig3 != null) {
                                                                                bDImageXUploader.setSocketNum(dMBDImageUploadConfig3.getSocketNum());
                                                                                DMBDImageUploadConfig dMBDImageUploadConfig4 = this.LJIIIZ;
                                                                                if (dMBDImageUploadConfig4 != null) {
                                                                                    bDImageXUploader.setFileRetryCount(dMBDImageUploadConfig4.getFileRetryCount());
                                                                                    DMBDImageUploadConfig dMBDImageUploadConfig5 = this.LJIIIZ;
                                                                                    if (dMBDImageUploadConfig5 != null) {
                                                                                        bDImageXUploader.setRWTimeout(dMBDImageUploadConfig5.getRwTimeout());
                                                                                        DMBDImageUploadConfig dMBDImageUploadConfig6 = this.LJIIIZ;
                                                                                        if (dMBDImageUploadConfig6 != null) {
                                                                                            bDImageXUploader.setMaxFailTime(dMBDImageUploadConfig6.getMaxFailTimes());
                                                                                            DMBDImageUploadConfig dMBDImageUploadConfig7 = this.LJIIIZ;
                                                                                            if (dMBDImageUploadConfig7 != null) {
                                                                                                bDImageXUploader.setEnableHttps(dMBDImageUploadConfig7.getHttpsEnable());
                                                                                                C43403H1r c43403H1r2 = this.LJI;
                                                                                                if (c43403H1r2 != null) {
                                                                                                    bDImageXUploader.setProcessActionType(c43403H1r2.LIZ.encryptType);
                                                                                                    TreeMap<String, Object> treeMap = new TreeMap<>();
                                                                                                    treeMap.put("copies", "cipher_v2");
                                                                                                    bDImageXUploader.setConfig(treeMap);
                                                                                                    this.LJIIIIZZ = bDImageXUploader;
                                                                                                    String[] strArr = new String[1];
                                                                                                    String str2 = this.LJIILIIL;
                                                                                                    if (str2 != null) {
                                                                                                        strArr[0] = str2;
                                                                                                        bDImageXUploader.setFilePath(1, strArr);
                                                                                                        C60903NvH.LJIIJJI().LJJIIJ();
                                                                                                        BDImageXUploader bDImageXUploader2 = this.LJIIIIZZ;
                                                                                                        if (bDImageXUploader2 != null) {
                                                                                                            bDImageXUploader2.start();
                                                                                                            BDImageXUploader bDImageXUploader3 = this.LJIIIIZZ;
                                                                                                            if (bDImageXUploader3 != null) {
                                                                                                                bDImageXUploader3.setListener(new H4E(this));
                                                                                                                return;
                                                                                                            } else {
                                                                                                                o.LJIJI("uploader");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }
                                                                                                        o.LJIJI("uploader");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("filePath");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("editModelContainer");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("uploadBDConfig");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("uploadBDConfig");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("uploadBDConfig");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("uploadBDConfig");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("uploadBDConfig");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("uploadBDConfig");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("uploadBDConfig");
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
                                                o.LJIJI("authConfig");
                                                throw null;
                                            }
                                            o.LJIJI("editModelContainer");
                                            throw null;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.camera.config.DMMediaAuthConfig");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.dm.DMMediaPublishResult");
    }

    public final void LJIIJJI(int i, Throwable th) {
        ((C42132GgC) this.LJIILJJIL.getValue()).LIZ();
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(i, th);
            BDImageXUploader bDImageXUploader = this.LJIIIIZZ;
            if (bDImageXUploader != null) {
                bDImageXUploader.close();
                return;
            } else {
                o.LJIJI("uploader");
                throw null;
            }
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
