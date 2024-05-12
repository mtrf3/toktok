package X;

import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import kotlin.jvm.internal.o;

/* renamed from: X.HsP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45437HsP implements InterfaceC84051Wyl, C5KT {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    @Override // X.C5KT
    public void LJI(C5KU c5ku) {
    }

    @Override // X.C5KT
    public void onProgress(float f) {
    }

    public /* synthetic */ C45437HsP(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.C5KT
    public void LJ(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleVideo onCancel: inputPath = ");
        LIZ.append(inputPath);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        this.LJLIL.invoke(inputPath);
    }

    @Override // X.C5KT
    public void LJFF(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleVideo onSuccess: inputPath = ");
        LIZ.append(inputPath);
        LIZ.append(", outputPath = ");
        LIZ.append(outputPath);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        this.LJLIL.invoke(inputPath);
    }

    @Override // X.C5KT
    public void LIZ(String str, String str2, String str3) {
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleVideo onError: inputPath = ");
        LIZ.append(str);
        LIZ.append(", errorInfo = ");
        LIZ.append(str3);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        this.LJLIL.invoke(str);
    }

    @Override // X.InterfaceC84051Wyl
    public void LIZIZ(int i, String reallyVideoPath, String reallyAudioPath) {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            o.LJIIIIZZ(reallyVideoPath, "reallyVideoPath");
            o.LJIIIIZZ(reallyAudioPath, "reallyAudioPath");
            interfaceC88472Yns.invoke(new RecorderConcatResult(i, reallyVideoPath, reallyAudioPath));
        }
    }
}
