package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Ho6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45170Ho6 extends QXX {
    public final /* synthetic */ Meta LJLIL;
    public final /* synthetic */ C45171Ho7 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ CommonRequestCallback LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    @Override // X.QXX
    public final void LLLIILIL(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate compressImage: path = ");
        String LIZLLL = this.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        LIZ.append(LIZLLL);
        LIZ.append(", progress = ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // X.QXX
    public final void LLLL(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        String LJJJJZ = ujb.o.LJJJJZ(outputPath, "//", "/", false);
        this.LJLILLLLZI.LIZIZ().LIZJ(this.LJLJI, LJJJJZ);
        if (!o.LJ(LJJJJZ, this.LJLJJI)) {
            CommonRequestCallback commonRequestCallback = this.LJLJJL;
            if (commonRequestCallback != null) {
                commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "path of compressed video != dst resizePath", new UnorderedMapStrStr());
            }
        } else if (!C44687HgJ.LIZIZ(this.LJLJJI)) {
            CommonRequestCallback commonRequestCallback2 = this.LJLJJL;
            if (commonRequestCallback2 != null) {
                commonRequestCallback2.onFailure(1013, C45049Hm9.LJFF(this.LJLIL), new UnorderedMapStrStr());
            }
        } else {
            CommonRequestCallback commonRequestCallback3 = this.LJLJJL;
            if (commonRequestCallback3 != null) {
                commonRequestCallback3.onSuccess(LJJJJZ);
            }
        }
        C45171Ho7 c45171Ho7 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate compressMeta: video.compress cost=");
        LIZ.append(System.currentTimeMillis() - this.LJLJJLL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c45171Ho7.getClass();
        C45171Ho7.LIZLLL(LIZIZ);
    }

    @Override // X.QXX
    public final void LLJLLL(String str, String str2, String str3) {
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        super.LLJLLL(str, str2, str3);
        CommonRequestCallback commonRequestCallback = this.LJLJJL;
        if (commonRequestCallback != null) {
            commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), i0.LJFF("compress video failure, errorInfo = ", str3), new UnorderedMapStrStr());
        }
    }

    public C45170Ho6(Meta meta, C45171Ho7 c45171Ho7, String str, String str2, CommonRequestCallback commonRequestCallback, long j) {
        this.LJLIL = meta;
        this.LJLILLLLZI = c45171Ho7;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = commonRequestCallback;
        this.LJLJJLL = j;
    }
}
