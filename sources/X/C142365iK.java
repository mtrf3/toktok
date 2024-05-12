package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5iK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142365iK extends AbstractC65781Prl implements InterfaceC88471Ynr<C142385iM, int[], C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ H2Z LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142365iK(boolean z, VideoPublishEditModel videoPublishEditModel, H2Z h2z) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = h2z;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C142385iM c142385iM, int[] iArr) {
        String outputFile;
        String localTempPath;
        C142385iM result = c142385iM;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(iArr, "<anonymous parameter 1>");
        if (this.LJLIL) {
            outputFile = this.LJLILLLLZI.getLocalTempPath();
        } else {
            outputFile = this.LJLILLLLZI.getOutputFile();
        }
        if (this.LJLIL) {
            String fileName = new File(outputFile).getName();
            InterfaceC43072GvM LJ = C62850Ola.LJ();
            CreativeInfo creativeInfo = this.LJLILLLLZI.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
            EnumC43650HBe enumC43650HBe = EnumC43650HBe.EFFECT_WATERMARK;
            o.LJIIIIZZ(fileName, "fileName");
            localTempPath = LJ.LJIIZILJ(creativeInfo, enumC43650HBe, fileName, false).getAbsolutePath();
        } else {
            localTempPath = this.LJLILLLLZI.getLocalTempPath();
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(outputFile);
        if (videoFileInfo != null) {
            int i = videoFileInfo.duration;
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(videoFileInfo.width), Integer.valueOf(videoFileInfo.height));
            H2Z h2z = this.LJLJI;
            VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
            h2z.getClass();
            InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
            CreativeInfo creativeInfo2 = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo2, "model.creativeInfo");
            C133765Mu c133765Mu = new C133765Mu(pathService.LJ(creativeInfo2, EnumC43650HBe.EFFECT_WATERMARK, "add_effect_watermark", true), null, null, null, 62);
            c133765Mu.LLJILJIL(false);
            c133765Mu.LLILLJJLI(2);
            C5KD c5kd = new C5KD(new String[]{outputFile});
            c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
            C122034qd LJI = c133765Mu.LJI();
            if (LJI != null) {
                C5KA.LIZ(c5kd, LJI.LJIIJ);
                C121514pn c121514pn = new C121514pn(0);
                c121514pn.LJIIJJI = ((C142375iL) ORZ.LJLLJ(result.LJLIL)).LJLILLLLZI;
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
                Iterator it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                }
                c121514pn.LJIIL = (String[]) arrayList.toArray(new String[0]);
                c121514pn.LIZJ = 0L;
                c121514pn.LIZLLL = i;
                c133765Mu.LJI().LJIIIIZZ().LJIJI(c121514pn);
                c133765Mu.LJJLIIIIJ(-16777216);
                this.LJLJI.getClass();
                c133765Mu.LLF(localTempPath, null, C44526Hdi.LIZ(((Number) ListProtector.get(LJJIJIIJI, 0)).intValue(), ((Number) ListProtector.get(LJJIJIIJI, 1)).intValue()), new C43431H2t(this.LJLJI, c133765Mu, this.LJLIL, this.LJLILLLLZI, localTempPath));
                this.LJLJI.getClass();
                return C76800UCe.LIZ;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("video file info not available. path=", outputFile, ", exist=");
        LIZIZ.append(new File(outputFile).exists());
        LIZIZ.append(", length=");
        LIZIZ.append(new File(outputFile).length());
        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }
}
