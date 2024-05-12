package X;

import Y.ACallableS84S0200000_7;
import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.vesdk.VEUtils;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43761HFl extends AbstractC43762HFm {
    public final List<HFP> LIZLLL;
    public final VideoPublishEditModel LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_upload";
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return HFQ.LIZLLL(this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel] */
    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        ?? r0 = this.LJ.extractFramesModel;
        c68322mC.element = r0;
        if (r0 == 0) {
            ?? extractFramesModel = new ExtractFramesModel("extract_upload");
            c68322mC.element = extractFramesModel;
            String str = this.LIZIZ.LIZIZ;
            o.LJIIIIZZ(str, "photoPathGenerator.currentDir");
            extractFramesModel.setExtractFramesDir(str);
            this.LJ.extractFramesModel = (ExtractFramesModel) c68322mC.element;
        }
        if (((ExtractFramesModel) c68322mC.element).getExtractFramesDir().length() == 0) {
            ExtractFramesModel extractFramesModel2 = (ExtractFramesModel) c68322mC.element;
            String str2 = this.LIZIZ.LIZIZ;
            o.LJIIIIZZ(str2, "photoPathGenerator.currentDir");
            extractFramesModel2.setExtractFramesDir(str2);
        }
        C10K.LIZJ(new ACallableS84S0200000_7(this, c68322mC, 17)).LIZLLL(new AgS110S0200000_7((HGD) hgq, this, 17));
    }

    public final void LJI(List<HFV> list, HashSet<String> hashSet) {
        String frameDir = this.LIZIZ.LIZIZ;
        o.LJIIIIZZ(frameDir, "frameDir");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(frameDir, separator, false)) {
            frameDir = i0.LJFF(frameDir, separator);
        }
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            HFV hfv = (HFV) it.next();
            String str = hfv.LIZJ;
            int[] LIZ = HFT.LIZ(hfv.LIZ, hfv.LIZIZ);
            int i2 = C54846Lfm.LJLJJI[0];
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(i);
            LIZ2.append("_gsv_extract_frame");
            VEUtils.saveVideoFrames(str, LIZ, i2, -1, false, frameDir, X1D.LIZIZ(LIZ2), 1);
            i++;
        }
        String extractFramesDir = this.LJ.extractFramesModel.getExtractFramesDir();
        String separator2 = File.separator;
        o.LJIIIIZZ(separator2, "separator");
        if (!ujb.o.LJJJJ(extractFramesDir, separator2, false)) {
            extractFramesDir = i0.LJFF(extractFramesDir, separator2);
        }
        File[] listFiles = new File(frameDir).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(extractFramesDir);
            LIZ3.append(file.getName());
            String LIZIZ = X1D.LIZIZ(LIZ3);
            C39579Fg7.LIZLLL(file.getAbsolutePath(), LIZIZ);
            C39579Fg7.LJIL(file.getAbsolutePath());
            hashSet.add(LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43761HFl(CreativeInfo creativeInfo, List<HFP> list, VideoPublishEditModel videoPublishEditModel) {
        super(creativeInfo);
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        this.LIZLLL = list;
        this.LJ = videoPublishEditModel;
    }
}
