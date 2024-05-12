package X;

import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.shortvideo.dm.DMImageMetaInfo;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H4E implements BDImageXUploaderListener {
    public final /* synthetic */ H5H LIZ;

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    public H4E(H5H h5h) {
        this.LIZ = h5h;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        try {
            return C2NU.LIZ.LIZIZ() ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        C43403H1r c43403H1r;
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                    H5H h5h = this.LIZ;
                    C43452H3o c43452H3o = new C43452H3o("dm photo upload failed");
                    if (bDImageXInfo != null) {
                        i2 = (int) bDImageXInfo.mErrorCode;
                    } else {
                        i2 = 20006;
                    }
                    h5h.LJIIJJI(i2, c43452H3o);
                    return;
                }
                if (bDImageXInfo == null) {
                    this.LIZ.LJIIJJI(20005, new C43452H3o("Upload info is null"));
                }
                this.LIZ.LJIIJJI = bDImageXInfo;
                return;
            }
            C67996QmO c67996QmO = this.LIZ.LJFF;
            if (c67996QmO != null) {
                c67996QmO.LIZIZ(new C41855Gbj(((float) j) / 100.0f), EnumC43531H6p.OUTER);
                return;
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        H5H h5h2 = this.LIZ;
        ((C42132GgC) h5h2.LJIILJJIL.getValue()).LIZ();
        BDImageXInfo bDImageXInfo2 = h5h2.LJIIJJI;
        if (bDImageXInfo2 == null) {
            return;
        }
        DMMediaModel dMMediaModel = h5h2.LJIIJ;
        if (dMMediaModel != null) {
            long length = new File(dMMediaModel.photoFile).length();
            try {
                c43403H1r = h5h2.LJI;
            } catch (Exception e) {
                C111214Yb.LIZIZ("DMPhotoUploadTask", e);
            }
            if (c43403H1r != null) {
                if (c43403H1r.LIZ.encryptType == 1) {
                    DMEncryptedImageContent dMEncryptedImageContent = (DMEncryptedImageContent) C75792yF.LIZ(bDImageXInfo2.mEncryptionMeta, DMEncryptedImageContent.class);
                    C67996QmO c67996QmO2 = h5h2.LJFF;
                    if (c67996QmO2 != null) {
                        C118004k8 c118004k8 = h5h2.LJIIL;
                        if (c118004k8 != null) {
                            H4F h4f = c118004k8.LIZIZ;
                            if (h4f != null) {
                                h4f.LIZ = new C123004sC(0L, -1L, -1L, length, 32);
                                h4f.LIZIZ = dMEncryptedImageContent;
                            } else {
                                h4f = null;
                            }
                            c67996QmO2.LJ(h4f, false);
                        } else {
                            o.LJIJI("uploadResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                } else {
                    DMImageMetaInfo dMImageMetaInfo = (DMImageMetaInfo) C75792yF.LIZ(bDImageXInfo2.mMetaInfo, DMImageMetaInfo.class);
                    C67996QmO c67996QmO3 = h5h2.LJFF;
                    if (c67996QmO3 != null) {
                        C118004k8 c118004k82 = h5h2.LJIIL;
                        if (c118004k82 != null) {
                            H4F h4f2 = c118004k82.LIZIZ;
                            if (h4f2 != null) {
                                h4f2.LIZIZ = new DMEncryptedImageContent(dMImageMetaInfo.imageUri, null, null, new DMEncryptedImageContentExtra(dMImageMetaInfo.width, dMImageMetaInfo.height), 6, null);
                            } else {
                                h4f2 = null;
                            }
                            c67996QmO3.LJ(h4f2, false);
                        } else {
                            o.LJIJI("uploadResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
                BDImageXUploader bDImageXUploader = h5h2.LJIIIIZZ;
                if (bDImageXUploader != null) {
                    bDImageXUploader.close();
                    return;
                } else {
                    o.LJIJI("uploader");
                    throw null;
                }
            }
            o.LJIJI("editModelContainer");
            throw null;
        }
        o.LJIJI("dmMediaModel");
        throw null;
    }
}
