package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import kotlin.jvm.internal.AqS5S1301000_7;

/* renamed from: X.HmL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45061HmL extends C45131HnT {
    public final /* synthetic */ C45059HmJ LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ String LJII;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        this.LJFF.LJ.LJIIIIZZ = vecMeta;
    }

    @Override // X.C45131HnT
    public final void LIZ(NLEModel nLEModel, java.util.Map<String, String> map) {
        C5OG.LIZJ(new AqS5S1301000_7(this.LJFF, (C45059HmJ) nLEModel, (NLEModel) map, (java.util.Map<String, String>) this.LJI, (int) this.LJII, (String) 2));
    }

    @Override // X.C45131HnT
    public final void LIZIZ(int i, int i2, String str) {
        C45059HmJ c45059HmJ = this.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestNLEModel onTemplateFailure: code=");
        LIZ.append(i);
        LIZ.append(", msg=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        c45059HmJ.getClass();
        this.LJFF.LIZIZ(Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45061HmL(C45059HmJ c45059HmJ, int i, String str, C61878OQg c61878OQg) {
        super(c61878OQg);
        this.LJFF = c45059HmJ;
        this.LJI = i;
        this.LJII = str;
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C45059HmJ c45059HmJ = this.LJFF;
            StringBuilder LIZ = C06830Op.LIZ("requestNLEModel onFailure: code=", i, ", msg=", str2, ", extraParams=");
            LIZ.append(unorderedMapStrStr);
            X1D.LIZIZ(LIZ);
            c45059HmJ.getClass();
            this.LJFF.LIZIZ(Integer.valueOf(i), Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), str2);
            return;
        }
        C45049Hm9.LJIIL("source_preload", str, i, str2, unorderedMapStrStr);
    }
}
