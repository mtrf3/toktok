package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;

/* renamed from: X.HnW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45134HnW extends NLEModelRequestProgressCallback {
    public final C45137HnZ LIZ = new C45137HnZ();
    public final long LIZIZ;
    public final NLEModelRequestProgressCallback LIZJ;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        this.LIZJ.onCompressDone(vecMeta);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
        this.LIZJ.onCompressProgress(f);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
        this.LIZJ.onFetchProgress(f);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
        this.LIZJ.onNeedFetch(vecStr);
    }

    public C45134HnW(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, Object... objArr) {
        this.LIZJ = nLEModelRequestProgressCallback;
        this.LIZIZ = C45137HnZ.LIZIZ(objArr, nLEModelRequestProgressCallback, this);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZJ.onResponse(nLEModel, unorderedMapStrStr);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZJ.onSuccess(nLEModel, unorderedMapStrStr);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZJ.onFailure(str, i, str2, unorderedMapStrStr);
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C45137HnZ c45137HnZ = this.LIZ;
            long j = this.LIZIZ;
            c45137HnZ.getClass();
            C45137HnZ.LIZ(j);
        }
    }
}
