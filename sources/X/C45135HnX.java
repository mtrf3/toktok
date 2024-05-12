package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;

/* renamed from: X.HnX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45135HnX extends NLEResourceDownloadCallback {
    public final C45137HnZ LIZ = new C45137HnZ();
    public final long LIZIZ;
    public final NLEResourceDownloadCallback LIZJ;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onNeedFetch(VecString vecString) {
        this.LIZJ.onNeedFetch(vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onProgress(float f) {
        this.LIZJ.onProgress(f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onSuccess(NLEModel nLEModel) {
        this.LIZJ.onSuccess(nLEModel);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }

    public C45135HnX(NLEResourceDownloadCallback nLEResourceDownloadCallback, Object... objArr) {
        this.LIZJ = nLEResourceDownloadCallback;
        this.LIZIZ = C45137HnZ.LIZIZ(objArr, nLEResourceDownloadCallback, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
        this.LIZJ.onFailure(str, i, str2);
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C45137HnZ c45137HnZ = this.LIZ;
            long j = this.LIZIZ;
            c45137HnZ.getClass();
            C45137HnZ.LIZ(j);
        }
    }
}
