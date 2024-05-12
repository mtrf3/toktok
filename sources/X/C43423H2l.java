package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import defpackage.e1;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H2l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43423H2l extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public H2P LJI;
    public H2N LJII;
    public XFL LJIIIIZZ;
    public C43403H1r LJIIIZ;
    public C43404H1s LJIIJ;
    public VideoCreation LJIIJJI;
    public C43397H1l LJIIL;
    public C58672Rz LJIILIIL;
    public H5I LJIILJJIL;
    public boolean LJIILL;
    public AbstractC43436H2y LJIJI;
    public H30 LJIL;
    public boolean LJJ;
    public H3U LJJI;
    public final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(H0C.LJLIL);
    public final long LJIIZILJ = -1;
    public final long LJIJ = -1;
    public final C62822Ol8 LJIJJ = C221108m2.LIZIZ(H3M.LJLIL);
    public final C62822Ol8 LJIJJLI = C221108m2.LIZIZ(C43359Gzz.LJLIL);

    public final void LJIIZILJ() {
        AbstractC43436H2y abstractC43436H2y;
        this.LJIILL = true;
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43350Gzq(LJIILJJIL(), this.LJIILL));
            if (LJIILJJIL() > 0 && (abstractC43436H2y = this.LJIJI) != null && abstractC43436H2y.LIZLLL()) {
                AbstractC43436H2y abstractC43436H2y2 = this.LJIJI;
                if (abstractC43436H2y2 != null) {
                    abstractC43436H2y2.LIZ();
                    return;
                } else {
                    o.LJIJI("uploader");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public final void LJIIJJI() {
        AbstractC43436H2y abstractC43436H2y = this.LJIJI;
        if (abstractC43436H2y != null) {
            abstractC43436H2y.LIZJ();
            ((Keva) H31.LIZ.getValue()).erase("upload_param_key");
            H30 h30 = this.LJIL;
            if (h30 != null) {
                C73411SrX c73411SrX = h30.LIZJ;
                if (c73411SrX != null && !c73411SrX.isDisposed()) {
                    C73411SrX c73411SrX2 = h30.LIZJ;
                    if (c73411SrX2 != null) {
                        c73411SrX2.dispose();
                    }
                    h30.LIZJ = null;
                    return;
                }
                return;
            }
            o.LJIJI("timeoutMonitor");
            throw null;
        }
        o.LJIJI("uploader");
        throw null;
    }

    public final void LJIILIIL() {
        XFL xfl = this.LJIIIIZZ;
        if (xfl == null) {
            return;
        }
        C43403H1r c43403H1r = this.LJIIIZ;
        if (c43403H1r != null) {
            File file = new File(c43403H1r.LIZ.mParallelUploadOutputFile);
            AbstractC43436H2y abstractC43436H2y = this.LJIJI;
            if (abstractC43436H2y != null) {
                abstractC43436H2y.LJII(new C43435H2x(this, xfl, file));
                return;
            } else {
                o.LJIJI("uploader");
                throw null;
            }
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    public final int LJIILJJIL() {
        return ((Number) this.LJIILLIIL.getValue()).intValue();
    }

    public final H32 LJIILL() {
        return (H32) this.LJIJJ.getValue();
    }

    public final void LJIJ() {
        UploadVideoConfig uploadVideoConfig;
        UploadAuthKeyConfig uploadAuthKeyConfig;
        C43403H1r c43403H1r = this.LJIIIZ;
        if (c43403H1r != null) {
            VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
            VideoCreation videoCreation = this.LJIIJJI;
            if (videoCreation != null) {
                if ((videoCreation instanceof UploadAuthKeyConfig) && (uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation) != null) {
                    uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                } else {
                    uploadVideoConfig = null;
                }
                AbstractC43436H2y abstractC43436H2y = this.LJIJI;
                if (abstractC43436H2y != null) {
                    abstractC43436H2y.LJIIIIZZ(new C43424H2m(this, videoPublishEditModel, uploadVideoConfig));
                    return;
                } else {
                    o.LJIJI("uploader");
                    throw null;
                }
            }
            o.LJIJI("authKey");
            throw null;
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    public final void LJIJI() {
        boolean z;
        XFL xfl;
        C43403H1r c43403H1r = this.LJIIIZ;
        if (c43403H1r != null) {
            VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
            C78949Uyf.LJIIJJI(videoPublishEditModel, "WaveUploadVideoTask");
            VideoCreation videoCreation = this.LJIIJJI;
            if (videoCreation != null) {
                UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation;
                float f = videoPublishEditModel.mVideoCoverStartTm;
                String creationId = videoPublishEditModel.getCreationId();
                o.LJIIIIZZ(creationId, "editModel.creationId");
                UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
                o.LJIIIIZZ(uploadSpeedInfo, "editModel.uploadSpeedInfo");
                if (videoPublishEditModel.isPrivate == 1) {
                    z = true;
                } else {
                    z = false;
                }
                LJII().LJI();
                AbstractC43436H2y LIZ = HKE.LIZ();
                this.LJIJI = LIZ;
                LIZ.LJIJJ(uploadAuthKeyConfig);
                AbstractC43436H2y abstractC43436H2y = this.LJIJI;
                if (abstractC43436H2y != null) {
                    abstractC43436H2y.LJIILJJIL(H7R.LJI(videoPublishEditModel));
                    H5I h5i = this.LJIILJJIL;
                    if (h5i != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("WaitUploadParamsTask: upload set info: ");
                        LIZ2.append(h5i);
                        H78.LIZ(X1D.LIZIZ(LIZ2));
                        AbstractC43436H2y abstractC43436H2y2 = this.LJIJI;
                        if (abstractC43436H2y2 != null) {
                            abstractC43436H2y2.LJI(h5i.LIZ());
                            H31.LIZIZ(h5i);
                        } else {
                            o.LJIJI("uploader");
                            throw null;
                        }
                    }
                    if (z && e1.LIZ(31744, "studio_enable_private_video_encryption", true, false)) {
                        AbstractC43436H2y abstractC43436H2y3 = this.LJIJI;
                        if (abstractC43436H2y3 != null) {
                            abstractC43436H2y3.LJIIL();
                        } else {
                            o.LJIJI("uploader");
                            throw null;
                        }
                    }
                    if (e1.LIZ(31744, "tool_upload_retry_state_switch", true, false)) {
                        AbstractC43436H2y abstractC43436H2y4 = this.LJIJI;
                        if (abstractC43436H2y4 != null) {
                            abstractC43436H2y4.LJIILIIL();
                        } else {
                            o.LJIJI("uploader");
                            throw null;
                        }
                    }
                    String probeContext = uploadSpeedInfo.getProbeContext();
                    if (!TextUtils.isEmpty(probeContext)) {
                        int LIZ3 = C00F.LIZ(31744, 800, "upload_speed_test_threshold", true);
                        C67996QmO c67996QmO = this.LJFF;
                        if (c67996QmO != null) {
                            C67996QmO.LIZJ(c67996QmO, new C43390H1e(LIZ3, probeContext, uploadSpeedInfo.getSpeed()));
                            AbstractC43436H2y abstractC43436H2y5 = this.LJIJI;
                            if (abstractC43436H2y5 != null) {
                                abstractC43436H2y5.LJ(probeContext);
                                AbstractC43436H2y abstractC43436H2y6 = this.LJIJI;
                                if (abstractC43436H2y6 != null) {
                                    abstractC43436H2y6.LJIJ((int) uploadSpeedInfo.getSpeed());
                                    if (LIZ3 > 0) {
                                        AbstractC43436H2y abstractC43436H2y7 = this.LJIJI;
                                        if (abstractC43436H2y7 != null) {
                                            abstractC43436H2y7.LJIIZILJ(LIZ3);
                                        } else {
                                            o.LJIJI("uploader");
                                            throw null;
                                        }
                                    }
                                    if (C60903NvH.LJIIJJI().getPublishService().LJJIJ().LIZ().LIZJ()) {
                                        uploadSpeedInfo.setProbeContext("");
                                    }
                                } else {
                                    o.LJIJI("uploader");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("uploader");
                                throw null;
                            }
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    }
                    AbstractC43436H2y abstractC43436H2y8 = this.LJIJI;
                    if (abstractC43436H2y8 != null) {
                        SettingsManager.LIZLLL().getClass();
                        abstractC43436H2y8.LJIILLIIL(Math.max(1, SettingsManager.LJ("studio_uploader_socket_num", 1)));
                        C58672Rz c58672Rz = this.LJIILIIL;
                        if (c58672Rz != null) {
                            List<C43394H1i> list = c58672Rz.LIZ;
                            if (list != null && !list.isEmpty()) {
                                int i = ((C43394H1i) ListProtector.get(list, 0)).LJLIL * 1024;
                                C67996QmO c67996QmO2 = this.LJFF;
                                if (c67996QmO2 != null) {
                                    C67996QmO.LIZJ(c67996QmO2, new C43395H1j(i));
                                    AbstractC43436H2y abstractC43436H2y9 = this.LJIJI;
                                    if (abstractC43436H2y9 != null) {
                                        abstractC43436H2y9.LJIILL(i);
                                    } else {
                                        o.LJIJI("uploader");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("nodeCallback");
                                    throw null;
                                }
                            }
                            if (LJIILJJIL() > 0 && (xfl = this.LJIIIIZZ) != null) {
                                xfl.LJIIIZ = new C43437H2z(this);
                            }
                            AbstractC43436H2y abstractC43436H2y10 = this.LJIJI;
                            if (abstractC43436H2y10 != null) {
                                abstractC43436H2y10.LJIIJ(f);
                                AbstractC43436H2y abstractC43436H2y11 = this.LJIJI;
                                if (abstractC43436H2y11 != null) {
                                    abstractC43436H2y11.LJIJI(creationId);
                                    if (C43161Gwn.LIZ()) {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("setDiskResumeUniqueKey: ");
                                        LIZ4.append(creationId);
                                        String msg = X1D.LIZIZ(LIZ4);
                                        o.LJIIIZ(msg, "msg");
                                        AbstractC43436H2y abstractC43436H2y12 = this.LJIJI;
                                        if (abstractC43436H2y12 != null) {
                                            abstractC43436H2y12.LJFF(creationId);
                                            return;
                                        } else {
                                            o.LJIJI("uploader");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                o.LJIJI("uploader");
                                throw null;
                            }
                            o.LJIJI("uploader");
                            throw null;
                        }
                        o.LJIJI("smartSliceConfig");
                        throw null;
                    }
                    o.LJIJI("uploader");
                    throw null;
                }
                o.LJIJI("uploader");
                throw null;
            }
            o.LJIJI("authKey");
            throw null;
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final int LJIIIIZZ() {
        LJII().LJFF().getClass();
        new C42388GkK();
        return C42388GkK.LIZJ();
    }

    public final void LJIIL() {
        if (LJIILJJIL() > 0) {
            C67996QmO c67996QmO = this.LJFF;
            if (c67996QmO != null) {
                C67996QmO.LIZJ(c67996QmO, new H0B(LJIILJJIL(), this.LJIILL));
                AbstractC43436H2y abstractC43436H2y = this.LJIJI;
                if (abstractC43436H2y != null) {
                    abstractC43436H2y.LJIIJJI(LJIILJJIL());
                    if (this.LJIILL) {
                        AbstractC43436H2y abstractC43436H2y2 = this.LJIJI;
                        if (abstractC43436H2y2 != null) {
                            abstractC43436H2y2.LIZ();
                            return;
                        } else {
                            o.LJIJI("uploader");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("uploader");
                throw null;
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UPLOAD;
    }

    public final void LJIILLIIL(C41767GaJ c41767GaJ) {
        boolean z;
        int LJII = C42991Gu3.LJII(c41767GaJ);
        C43379H0t.LIZLLL(LJII);
        H2N h2n = this.LJII;
        boolean z2 = false;
        if (h2n != null) {
            boolean z3 = true;
            int LIZ = C00F.LIZ(31744, 0, "studio_publish_failure_auto_retry_count", true);
            if (LIZ > 0 && h2n.LIZIZ < LIZ && e1.LIZ(31744, "studio_enable_upload_failure_auto_retry", true, false) && (!e1.LIZ(31744, "studio_retry_in_weak_network_only", true, false) || NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork())) {
                z = true;
                h2n.LIZIZ++;
            } else {
                z = false;
                C41859Gbn LIZIZ = C1I0.LIZIZ();
                StringBuilder LJ = C7MY.LJ("no need to retry, retryCount: ", LIZ, ", auto retry switch: ");
                FFL.LJIIIZ().getClass();
                LJ.append(FFL.LJ(31744, "studio_enable_upload_failure_auto_retry", true, false));
                LJ.append("networkType: ");
                if (e1.LIZ(31744, "studio_retry_in_weak_network_only", true, false)) {
                    z3 = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork();
                }
                LJ.append(z3);
                LJ.append(", publisherOptContext: ");
                LJ.append(h2n);
                LIZIZ.LIZJ("publish_flow_optimization", X1D.LIZIZ(LJ));
            }
            z2 = z;
        }
        if (z2) {
            H2P h2p = this.LJI;
            if (h2p != null) {
                h2p.LIZ();
            }
            C67996QmO c67996QmO = this.LJFF;
            if (c67996QmO != null) {
                C67996QmO.LIZJ(c67996QmO, new H2O());
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        } else {
            C67996QmO c67996QmO2 = this.LJFF;
            if (c67996QmO2 != null) {
                c67996QmO2.LIZLLL(LJII, c41767GaJ);
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        LJIIJJI();
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        super.LIZ(cause, c87623YaB);
        if (cause instanceof C42984Gtw) {
            XFL xfl = this.LJIIIIZZ;
            if (xfl != null) {
                xfl.LJIIIZ(false);
            }
        } else {
            C43403H1r c43403H1r = this.LJIIIZ;
            if (c43403H1r != null) {
                C43157Gwj.LJII(c43403H1r.LIZ, this.LJJ);
                XFL xfl2 = this.LJIIIIZZ;
                if (xfl2 != null) {
                    xfl2.LJIJJLI = false;
                    xfl2.LIZIZ();
                }
            } else {
                o.LJIJI("editModelContainer");
                throw null;
            }
        }
        H30 h30 = this.LJIL;
        if (h30 != null) {
            C73411SrX c73411SrX = h30.LIZJ;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                C73411SrX c73411SrX2 = h30.LIZJ;
                if (c73411SrX2 != null) {
                    c73411SrX2.dispose();
                }
                h30.LIZJ = null;
            }
            this.LJJI = c87623YaB;
            return true;
        }
        o.LJIJI("timeoutMonitor");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        o.LJIIIZ(args, "args");
        C42074GfG.LIZ();
        this.LJFF = c67996QmO;
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof ERL) {
                if (next != null) {
                    this.LJIIJJI = ((ERL) next).LJLIL;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LJIIIZ = (C43403H1r) next2;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43404H1s) {
                                        if (next3 != null) {
                                            this.LJIIJ = (C43404H1s) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJIIL = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof C58672Rz) {
                                                                if (next5 != null) {
                                                                    this.LJIILIIL = (C58672Rz) next5;
                                                                    Iterator<Object> it6 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (it6.hasNext()) {
                                                                            obj = it6.next();
                                                                            if (obj == null || (obj instanceof H5I)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            obj = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    this.LJIILJJIL = (H5I) obj;
                                                                    Iterator<Object> it7 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (it7.hasNext()) {
                                                                            obj2 = it7.next();
                                                                            if (obj2 == null || (obj2 instanceof H2N)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            obj2 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!(obj2 instanceof H2N)) {
                                                                        obj2 = null;
                                                                    }
                                                                    this.LJII = (H2N) obj2;
                                                                    Iterator<Object> it8 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (it8.hasNext()) {
                                                                            obj3 = it8.next();
                                                                            if (obj3 == null || (obj3 instanceof H2P)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            obj3 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!(obj3 instanceof H2P)) {
                                                                        obj3 = null;
                                                                    }
                                                                    this.LJI = (H2P) obj3;
                                                                    int LJIIIIZZ = LJIIIIZZ();
                                                                    C67996QmO c67996QmO2 = this.LJFF;
                                                                    if (c67996QmO2 != null) {
                                                                        this.LJIL = new H30(c67996QmO2, LJIIIIZZ);
                                                                        Iterator<Object> it9 = args.LIZ.iterator();
                                                                        while (true) {
                                                                            if (it9.hasNext()) {
                                                                                obj4 = it9.next();
                                                                                if (obj4 instanceof AbstractC42364Gjw) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                obj4 = null;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!(obj4 instanceof AbstractC42364Gjw)) {
                                                                            obj4 = null;
                                                                        }
                                                                        AbstractC42364Gjw abstractC42364Gjw = (AbstractC42364Gjw) obj4;
                                                                        if (abstractC42364Gjw != null && (abstractC42364Gjw instanceof C42363Gjv)) {
                                                                            VideoCreation videoCreation = new VideoCreation();
                                                                            videoCreation.setMaterialId(((C42363Gjv) abstractC42364Gjw).LIZ);
                                                                            C43336Gzc c43336Gzc = new C43336Gzc(0L, 0L, 0L, 0L, 0L, 63);
                                                                            C67996QmO c67996QmO3 = this.LJFF;
                                                                            if (c67996QmO3 != null) {
                                                                                c67996QmO3.LJ(new C43335Gzb(videoCreation, c43336Gzc), false);
                                                                                LJIIJJI();
                                                                                return;
                                                                            } else {
                                                                                o.LJIJI("nodeCallback");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        C43404H1s c43404H1s = this.LJIIJ;
                                                                        if (c43404H1s != null) {
                                                                            boolean LIZIZ = c43404H1s.LIZ.LIZIZ();
                                                                            C43403H1r c43403H1r = this.LJIIIZ;
                                                                            if (c43403H1r != null) {
                                                                                if (C43157Gwj.LJIIIZ(c43403H1r.LIZ, LIZIZ, false)) {
                                                                                    this.LJJ = true;
                                                                                    this.LJIILL = true;
                                                                                } else {
                                                                                    C43403H1r c43403H1r2 = this.LJIIIZ;
                                                                                    if (c43403H1r2 != null) {
                                                                                        if (GU7.LJIIIIZZ(c43403H1r2.LIZ)) {
                                                                                            this.LJJ = true;
                                                                                            Iterator<Object> it10 = args.LIZ.iterator();
                                                                                            while (true) {
                                                                                                if (!it10.hasNext()) {
                                                                                                    break;
                                                                                                }
                                                                                                Object next6 = it10.next();
                                                                                                if (next6 instanceof C43458H3u) {
                                                                                                    if (next6 != null) {
                                                                                                        ((C43458H3u) next6).LIZJ(new AqS157S0100000_7(this, 594));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                                                                        }
                                                                                        Iterator<Object> it11 = args.LIZ.iterator();
                                                                                        while (true) {
                                                                                            if (it11.hasNext()) {
                                                                                                obj5 = it11.next();
                                                                                                if (obj5 == null || (obj5 instanceof XFL)) {
                                                                                                    break;
                                                                                                }
                                                                                            } else {
                                                                                                obj5 = null;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        XFL xfl = (XFL) obj5;
                                                                                        this.LJIIIIZZ = xfl;
                                                                                        if (xfl != null) {
                                                                                            try {
                                                                                                xfl.LJI();
                                                                                            } catch (C41819Gb9 e) {
                                                                                                LJIILLIIL(new C41767GaJ(C43339Gzf.LIZ(e.getErrorCode()), e));
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        Iterator<Object> it12 = args.LIZ.iterator();
                                                                                        while (true) {
                                                                                            if (!it12.hasNext()) {
                                                                                                break;
                                                                                            }
                                                                                            Object next7 = it12.next();
                                                                                            if (next7 instanceof C43458H3u) {
                                                                                                if (next7 != null) {
                                                                                                    ((C43458H3u) next7).LIZJ(new AqS157S0100000_7(this, 595));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                                                                    }
                                                                                    o.LJIJI("editModelContainer");
                                                                                    throw null;
                                                                                }
                                                                                try {
                                                                                    C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
                                                                                    C41775GaR.LIZJ(H1T.UPLOAD);
                                                                                } catch (C43466H4c e2) {
                                                                                    LJIILLIIL(new C41767GaJ(C43339Gzf.LIZ(e2.getErrorCode()), e2));
                                                                                }
                                                                                try {
                                                                                    LJIJI();
                                                                                    LJIJ();
                                                                                    if (C43401H1p.LIZ()) {
                                                                                        AbstractC43436H2y abstractC43436H2y = this.LJIJI;
                                                                                        if (abstractC43436H2y != null) {
                                                                                            C43403H1r c43403H1r3 = this.LJIIIZ;
                                                                                            if (c43403H1r3 != null) {
                                                                                                String outputFile = c43403H1r3.LIZ.getOutputFile();
                                                                                                o.LJIIIIZZ(outputFile, "editModelContainer.editModel.outputFile");
                                                                                                abstractC43436H2y.LJIIIZ(outputFile);
                                                                                            } else {
                                                                                                o.LJIJI("editModelContainer");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            o.LJIJI("uploader");
                                                                                            throw null;
                                                                                        }
                                                                                    } else if (this.LJJ) {
                                                                                        AbstractC43436H2y abstractC43436H2y2 = this.LJIJI;
                                                                                        if (abstractC43436H2y2 != null) {
                                                                                            C43403H1r c43403H1r4 = this.LJIIIZ;
                                                                                            if (c43403H1r4 != null) {
                                                                                                String synthesisFilePath = c43403H1r4.LIZ.getSynthesisFilePath();
                                                                                                o.LJIIIIZZ(synthesisFilePath, "editModelContainer.editModel.synthesisFilePath");
                                                                                                abstractC43436H2y2.LJIIIZ(synthesisFilePath);
                                                                                            } else {
                                                                                                o.LJIJI("editModelContainer");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            o.LJIJI("uploader");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        LJIILIIL();
                                                                                    }
                                                                                    LJIIL();
                                                                                    C67996QmO c67996QmO4 = this.LJFF;
                                                                                    if (c67996QmO4 != null) {
                                                                                        int LJIILJJIL = LJIILJJIL();
                                                                                        VideoCreation videoCreation2 = this.LJIIJJI;
                                                                                        if (videoCreation2 != null) {
                                                                                            String videoCreation3 = videoCreation2.toString();
                                                                                            o.LJIIIIZZ(videoCreation3, "authKey.toString()");
                                                                                            C67996QmO.LIZJ(c67996QmO4, new C43392H1g(LJIILJJIL, videoCreation3));
                                                                                            AbstractC43436H2y abstractC43436H2y3 = this.LJIJI;
                                                                                            if (abstractC43436H2y3 != null) {
                                                                                                abstractC43436H2y3.LJIJJLI();
                                                                                                return;
                                                                                            } else {
                                                                                                o.LJIJI("uploader");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        o.LJIJI("authKey");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("nodeCallback");
                                                                                    throw null;
                                                                                } catch (Exception e3) {
                                                                                    LJIILLIIL(new C41767GaJ(C43339Gzf.LIZ(-39997), e3));
                                                                                    return;
                                                                                }
                                                                            }
                                                                            o.LJIJI("editModelContainer");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("publishModelContainer");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("nodeCallback");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.SmartSliceConfig");
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
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
    }
}
