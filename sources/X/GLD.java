package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.b1;
import fjb.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editpost.EditPostPublishScene$initDownloadVideoManager$1", f = "EditPostPublishScene.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C41051G9f LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLD(C41051G9f c41051G9f, String str, InterfaceC67352kd<? super GLD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c41051G9f;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLD(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        VideoUrlModel videoPlayAddr;
        List<String> urlList;
        String str;
        SimVideoUrlModel simVideoUrlModel;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        C141335gf.LIZJ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJZ;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editPostModel = creativeModel.editPostModel) == null || (videoPlayAddr = editPostModel.getVideoPlayAddr()) == null || (urlList = videoPlayAddr.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
            return C76800UCe.LIZ;
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            String savePath = C44432HcC.LJIILLIIL(str2);
            StringBuilder LIZ = X1D.LIZ();
            String fileName = b1.LIZIZ(this.LJLILLLLZI, LIZ, ".mp4", LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(savePath);
            String str3 = File.separator;
            String LJFF = JBR.LJFF(LIZ2, str3, fileName, LIZ2);
            boolean LIZIZ = C44687HgJ.LIZIZ(LJFF);
            String aid = this.LJLILLLLZI;
            o.LJIIIZ(aid, "aid");
            Keva keva = GMQ.LJI;
            boolean z = keva.getBoolean(aid, false);
            C41859Gbn LIZIZ2 = C1I0.LIZIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("fullPath: ");
            LIZ3.append(LJFF);
            LIZ3.append(" , fileExist: ");
            LIZ3.append(LIZIZ);
            LIZ3.append(",  hasDownload: ");
            LIZ3.append(z);
            LIZIZ2.LIZJ("EditPostPublishScene", X1D.LIZIZ(LIZ3));
            if (LIZIZ) {
                if (z) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLIL.LJZ;
                    if (videoPublishEditModel2 != null) {
                        C44432HcC.LJII(videoPublishEditModel2, LJFF);
                    }
                    this.LJLIL.LLIIJI = true;
                    return C76800UCe.LIZ;
                }
                C16880lQ.LLLZZIL(new File(LJFF));
            } else if (z) {
                String aid2 = this.LJLILLLLZI;
                o.LJIIIZ(aid2, "aid");
                keva.storeBoolean(aid2, false);
            }
            C41051G9f c41051G9f = this.LJLIL;
            String aid3 = this.LJLILLLLZI;
            GMQ.LIZIZ = new C41068G9w(c41051G9f, aid3, LJFF);
            GMQ.LIZLLL = new AqS173S0100000_7(c41051G9f, 7);
            GMQ.LIZJ = new AqS157S0100000_7(c41051G9f, 14);
            VideoPublishEditModel videoPublishEditModel3 = c41051G9f.LJZ;
            if (videoPublishEditModel3 != null && (creativeModel2 = videoPublishEditModel3.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null) {
                simVideoUrlModel = editPostModel2.getVideoCacheModel();
            } else {
                simVideoUrlModel = null;
            }
            o.LJIIIZ(aid3, "aid");
            o.LJIIIZ(savePath, "savePath");
            o.LJIIIZ(fileName, "fileName");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(savePath);
            LIZ4.append(str3);
            LIZ4.append(fileName);
            String LIZIZ3 = X1D.LIZIZ(LIZ4);
            C34K c34k = new C34K();
            if (simVideoUrlModel != null) {
                C46728IVo.LJI(simVideoUrlModel, LIZIZ3, false, new GLE(c34k, str, savePath, fileName));
            } else {
                GMQ.LIZ(str, savePath, fileName);
            }
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
