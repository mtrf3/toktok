package Y;

import X.AnonymousClass629;
import X.C173376rF;
import X.C41855Gbj;
import X.C43237Gy1;
import X.C43344Gzk;
import X.C43753HFd;
import X.C44423Hc3;
import X.C47261Igj;
import X.C73098SmU;
import X.C76800UCe;
import X.EnumC43531H6p;
import X.EnumC43650HBe;
import X.H7R;
import X.InterfaceC43351Gzr;
import X.InterfaceC43755HFf;
import X.OSZ;
import X.V16;
import X.X1D;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS14S0310000_7 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS14S0310000_7 aCallableS14S0310000_7) {
        C43344Gzk c43344Gzk = (C43344Gzk) aCallableS14S0310000_7.l0;
        synchronized (c43344Gzk.LJIIIZ) {
            if (c43344Gzk.LJII) {
                c43344Gzk.LJIIIZ.wait();
            }
        }
        if (!((C43344Gzk) aCallableS14S0310000_7.l0).LJIILIIL) {
            VideoPublishEditModel videoPublishEditModel = ((C43344Gzk) aCallableS14S0310000_7.l0).LJIIJJI;
            if (videoPublishEditModel != null) {
                File LJIIJJI = V16.LJIIJJI(videoPublishEditModel, EnumC43650HBe.SAVE_TO_LOCAL, "watermarks");
                C43344Gzk c43344Gzk2 = (C43344Gzk) aCallableS14S0310000_7.l0;
                String path = LJIIJJI.getPath();
                o.LJIIIIZZ(path, "waterMarkDir.path");
                List list = (List) aCallableS14S0310000_7.l1;
                c43344Gzk2.getClass();
                ArrayList arrayList = new ArrayList();
                String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
                long currentTimeMillis = System.currentTimeMillis();
                int size = list.size();
                VideoPublishEditModel videoPublishEditModel2 = c43344Gzk2.LJIIJJI;
                if (videoPublishEditModel2 != null) {
                    C43237Gy1.LIZ(size, 0, H7R.LJI(videoPublishEditModel2));
                    int size2 = list.size();
                    int i = 0;
                    VideoPublishEditModel videoPublishEditModel3 = c43344Gzk2.LJIIJJI;
                    if (videoPublishEditModel3 != null) {
                        C43237Gy1.LIZJ(size2, 0, H7R.LJI(videoPublishEditModel3), currentTimeMillis, LIZ);
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                String str = (String) obj;
                                StringBuilder LIZ2 = X1D.LIZ();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("watermark");
                                LIZ3.append(System.currentTimeMillis());
                                LIZ2.append(C173376rF.LJI(X1D.LIZIZ(LIZ3)));
                                LIZ2.append('_');
                                LIZ2.append(i);
                                LIZ2.append(".jpeg");
                                String watermarkFilePath = new File(path, X1D.LIZIZ(LIZ2)).getAbsolutePath();
                                C44423Hc3 LJ = C73098SmU.LJ();
                                if (LJ != null) {
                                    IWaterMarkService LIZ4 = WaterMarkServiceImpl.LIZ();
                                    o.LJIIIIZZ(watermarkFilePath, "watermarkFilePath");
                                    LIZ4.addWaterMarkToImage(LJ, str, watermarkFilePath);
                                }
                                o.LJIIIIZZ(watermarkFilePath, "watermarkFilePath");
                                arrayList.add(watermarkFilePath);
                                i = i2;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        int size3 = list.size();
                        VideoPublishEditModel videoPublishEditModel4 = c43344Gzk2.LJIIJJI;
                        if (videoPublishEditModel4 != null) {
                            C43237Gy1.LIZIZ(size3, 0, H7R.LJI(videoPublishEditModel4), currentTimeMillis, LIZ);
                            VideoPublishEditModel videoPublishEditModel5 = c43344Gzk2.LJIIJJI;
                            if (videoPublishEditModel5 != null) {
                                AVUploadSaveModel saveModel = videoPublishEditModel5.getSaveModel();
                                if (saveModel != null) {
                                    saveModel.setImageModeLocalPaths(arrayList);
                                }
                                InterfaceC43351Gzr interfaceC43351Gzr = ((C43344Gzk) aCallableS14S0310000_7.l0).LJIIL;
                                if (interfaceC43351Gzr == null) {
                                    o.LJIJI("nodeCallback");
                                    throw null;
                                }
                                interfaceC43351Gzr.LIZJ(new C41855Gbj(1.0f), EnumC43531H6p.OUTER);
                                ((C43344Gzk) aCallableS14S0310000_7.l0).LJIIIIZZ = true;
                                ((C43344Gzk) aCallableS14S0310000_7.l0).LJIILJJIL((SynthetiseResult) aCallableS14S0310000_7.l2, aCallableS14S0310000_7.z3);
                            } else {
                                o.LJIJI("editModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("editModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("editModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("editModel");
                    throw null;
                }
            } else {
                o.LJIJI("editModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS14S0310000_7 aCallableS14S0310000_7) {
        int intValue = ((Number) ((OSZ) aCallableS14S0310000_7.l0).getFirst()).intValue();
        if (intValue != -1) {
            C43753HFd.LJ(aCallableS14S0310000_7.l1, (InterfaceC43755HFf) aCallableS14S0310000_7.l2, aCallableS14S0310000_7.z3, intValue, (String) ((OSZ) aCallableS14S0310000_7.l0).getSecond(), false);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS14S0310000_7(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}
