package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Hla, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45014Hla implements InterfaceC87286YNm {
    public final /* synthetic */ C45005HlR LIZ;
    public final /* synthetic */ VideoPublishEditModel LIZIZ;
    public final /* synthetic */ InterfaceC65052gv<CompileProbeResult> LIZJ;
    public final /* synthetic */ C72242sW LIZLLL;

    public C45014Hla(C45005HlR c45005HlR, VideoPublishEditModel videoPublishEditModel, C73578SuE c73578SuE, C72242sW c72242sW) {
        this.LIZ = c45005HlR;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = c73578SuE;
        this.LIZLLL = c72242sW;
    }

    @Override // X.InterfaceC87286YNm
    public final void LIZ(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d) {
        String str;
        StringBuilder sb = new StringBuilder("HWCompileProbe -> CompileProbeV2: onCompileProbe2() method is called;  result = ");
        sb.append(i);
        sb.append("; crf = ");
        sb.append(i2);
        sb.append("; videoBitrate = ");
        sb.append(f);
        sb.append(";optBitrate = ");
        sb.append(f2);
        sb.append("; encoderType = ");
        C15890jp.LIZIZ(sb, i3, "; preset = ", i4, "; maxBitrate = ");
        C15890jp.LIZIZ(sb, i5, "; encodeWidth = ", i6, ";encodeHeight = ");
        sb.append(i7);
        sb.append("; psnr = ");
        sb.append(f3);
        sb.append("; preEncodeCrf = ");
        C15890jp.LIZIZ(sb, i8, "; preGop = ", i9, "; preGpoffse = ");
        sb.append(d);
        H78.LIZ(sb.toString());
        if (i != -10000) {
            if (i != 0) {
                H78.LIZ("HWCompileProbe -> CompileProbeV2: onCompileProbe2() result != VEResult.TER_EXIT And result != VEResult.TER_OK");
                ((C73578SuE) this.LIZJ).tryOnError(new C45016Hlc(new C45031Hlr(i)));
                return;
            }
            CompileProbeConfigV2 compileProbeConfigV2 = this.LIZ.LIZJ;
            o.LJI(compileProbeConfigV2);
            C87285YNl c87285YNl = new C87285YNl(i3, i8, i5, f, f3, compileProbeConfigV2.getBitrateStrategy());
            if (C78596Usy.LJJJI(this.LIZIZ)) {
                o.LJIIIZ(this.LIZIZ, "<this>");
                str = C44654Hfm.LIZ();
            } else {
                str = null;
            }
            VEVideoEncodeSettings LIZ = new C87278YNe(2).LIZ();
            int min = Math.min(i6, i7);
            CompileProbeConfigV2 compileProbeConfigV22 = this.LIZ.LIZJ;
            o.LJI(compileProbeConfigV22);
            C45021Hlh hwAdaptiveBitrate = LIZ.getHwAdaptiveBitrate(min, c87285YNl, f2, compileProbeConfigV22.getBitrateRange(), str);
            o.LJIIIIZZ(hwAdaptiveBitrate, "Builder(VEVideoEncodeSet…eRange, compileProbeJSON)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("HWCompileProbe -> CompileProbeV2: getHwAdaptiveBitrate() method is called. min_optBitrate = ");
            LIZ2.append(hwAdaptiveBitrate.LIZ);
            LIZ2.append("; optBitrate = ");
            LIZ2.append(hwAdaptiveBitrate.LIZIZ);
            LIZ2.append("; min_optBitrate_HD = ");
            LIZ2.append(hwAdaptiveBitrate.LIZJ);
            LIZ2.append("; optBitrate_HD = ");
            LIZ2.append(hwAdaptiveBitrate.LIZLLL);
            H78.LIZ(X1D.LIZIZ(LIZ2));
            OptBitrateFromVE optBitrateFromVE = new OptBitrateFromVE(hwAdaptiveBitrate.LIZ, hwAdaptiveBitrate.LIZIZ, hwAdaptiveBitrate.LIZJ, hwAdaptiveBitrate.LIZLLL);
            InterfaceC65052gv<CompileProbeResult> interfaceC65052gv = this.LIZJ;
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            c73578SuE.onSuccess(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i, 0, null, 12, null), new CompileProbeResult.ResultData(i2, f, i3, i4, i5, i6, i7, f3, i2, i9, d, (int) (System.currentTimeMillis() - this.LIZLLL.element), f2, optBitrateFromVE), 2));
            return;
        }
        H78.LIZ("HWCompileProbe -> CompileProbeV2: onCompileProbe2() result = VEResult.TER_EXIT");
        ((C73578SuE) this.LIZJ).tryOnError(new C45016Hlc(new C45029Hlp(i)));
    }
}
