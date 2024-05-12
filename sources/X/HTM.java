package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTM implements InterfaceC133145Kk {
    public final /* synthetic */ MyMediaModel LIZ;
    public final /* synthetic */ HTN LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC67352kd<String> LJ;

    @Override // X.InterfaceC133145Kk
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC133145Kk
    public final void LJFF(String inputPath, String outputPath) {
        String str;
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        if (this.LIZ != null) {
            MyMediaModel myMediaModel = this.LIZ;
            str = new VESize(myMediaModel.width, myMediaModel.height).toString();
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (mediaModel != null) …eight).toString() else \"\"");
        HTN htn = this.LIZIZ;
        C44108HSu.LJFF(htn.LIZIZ, this.LIZJ, outputPath, "video", this.LIZLLL, "video_compress", System.currentTimeMillis() - htn.LJIIL, str);
        InterfaceC67352kd<String> interfaceC67352kd = this.LJ;
        C3C5.m7constructorimpl(outputPath);
        interfaceC67352kd.resumeWith(outputPath);
    }

    @Override // X.InterfaceC133145Kk
    public final void LIZ(String str, String str2, String str3) {
        String str4;
        String str5;
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        MyMediaModel myMediaModel = this.LIZ;
        if (myMediaModel != null) {
            str4 = C44694HgQ.LJIIL(myMediaModel);
        } else {
            str4 = this.LIZJ;
        }
        if (this.LIZ != null) {
            MyMediaModel myMediaModel2 = this.LIZ;
            str5 = new VESize(myMediaModel2.width, myMediaModel2.height).toString();
        } else {
            str5 = "";
        }
        o.LJIIIIZZ(str5, "if (mediaModel != null) …eight).toString() else \"\"");
        HTN htn = this.LIZIZ;
        C44108HSu.LIZJ(htn.LIZIZ, str4, "video", HTE.VIDEO_COMPRESS_TASK_ERROR, this.LIZLLL, System.currentTimeMillis() - htn.LJIIL, str5);
        InterfaceC67352kd<String> interfaceC67352kd = this.LJ;
        C3C5.m7constructorimpl(str4);
        interfaceC67352kd.resumeWith(str4);
    }

    public HTM(HTN htn, MyMediaModel myMediaModel, String str, String str2, C84654XKg c84654XKg) {
        this.LIZ = myMediaModel;
        this.LIZIZ = htn;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = c84654XKg;
    }
}
