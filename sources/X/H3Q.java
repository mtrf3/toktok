package X;

import com.ss.android.ugc.aweme.shortvideo.dm.DMUploadVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploaderListener;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H3Q implements BDVideoUploaderListener {
    public final /* synthetic */ H5G LIZ;

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onUploadVideoStage(int i, long j) {
    }

    public H3Q(H5G h5g) {
        this.LIZ = h5g;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final String getStringFromExtern(int i) {
        C43403H1r c43403H1r = this.LIZ.LJII;
        if (c43403H1r != null) {
            VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
            String LIZ = C43147GwZ.LIZ(videoPublishEditModel);
            videoPublishEditModel.metadataMap = null;
            return LIZ;
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final int videoUploadCheckNetState(int i, int i2) {
        return C48203Ivv.LJ(EF7.LIZIZ()) ? 1 : 0;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onLog(int i, int i2, String str) {
        C67996QmO c67996QmO = this.LIZ.LJIIIZ;
        if (c67996QmO != null) {
            if (str == null) {
                str = "";
            }
            c67996QmO.LIZIZ(new H3T(i, i2, str), EnumC43531H6p.OUTER);
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
        long j2;
        BDVideoInfo bDVideoInfo2 = bDVideoInfo;
        if (bDVideoInfo2 == null) {
            bDVideoInfo2 = new BDVideoInfo("", "", Long.MIN_VALUE, "info is null", "", "", "");
        }
        G0D g0d = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    bDVideoInfo2.mErrorCode = -39993L;
                    H5G h5g = this.LIZ;
                    H3U h3u = h5g.LJIILL;
                    if (h3u == null) {
                        C67996QmO c67996QmO = h5g.LJIIIZ;
                        if (c67996QmO != null) {
                            c67996QmO.LIZIZ(new H3O("DMVideoUploadTask"), EnumC43531H6p.OUTER);
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    } else {
                        h3u.LIZ(new C41767GaJ(C1JI.LJFF(bDVideoInfo2), null, 2, null));
                    }
                    this.LIZ.LJIIL().close();
                    return;
                }
                this.LIZ.LJIILJJIL(20006, new C43452H3o("upload failed"));
                XFL xfl = this.LIZ.LJI;
                if (xfl == null) {
                    return;
                }
                xfl.LIZIZ();
                return;
            }
            C67996QmO c67996QmO2 = this.LIZ.LJIIIZ;
            if (c67996QmO2 != null) {
                c67996QmO2.LIZIZ(new C41855Gbj(((float) j) / 100.0f), EnumC43531H6p.OUTER);
                return;
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        long LIZIZ = this.LIZ.LJIIJJI().LIZ().LIZIZ(TimeUnit.MILLISECONDS);
        XFL xfl2 = this.LIZ.LJI;
        if (xfl2 != null) {
            if (xfl2.LJII) {
                j2 = xfl2.LJIILL.length();
            } else {
                j2 = -1;
            }
        } else {
            j2 = 0;
        }
        C123004sC c123004sC = new C123004sC(LIZIZ, 0L, 0L, j2, 45);
        H5G h5g2 = this.LIZ;
        ((C42132GgC) h5g2.LJIILJJIL.getValue()).LIZ();
        C67996QmO c67996QmO3 = h5g2.LJIIIZ;
        if (c67996QmO3 != null) {
            C118004k8 c118004k8 = h5g2.LJIIJ;
            if (c118004k8 != null) {
                G0D g0d2 = c118004k8.LIZ;
                if (g0d2 != null) {
                    g0d2.LJLILLLLZI = bDVideoInfo2.mVideoId;
                    g0d2.LJLJI = c123004sC;
                    try {
                        g0d2.LJLJJI = (DMUploadVideoInfo) C75792yF.LIZ(bDVideoInfo2.mVideoMediaInfo, DMUploadVideoInfo.class);
                    } catch (Exception e) {
                        C36922EeM.LJFF(e);
                    }
                    g0d = g0d2;
                }
                c67996QmO3.LJ(g0d, false);
                h5g2.LJIIL().close();
                XFL xfl3 = this.LIZ.LJI;
                if (xfl3 == null) {
                    return;
                }
                xfl3.LJIJJLI = false;
                xfl3.LJIIIZ(true);
                return;
            }
            o.LJIJI("uploadResult");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
