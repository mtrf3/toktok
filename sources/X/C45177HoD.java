package X;

import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;

/* renamed from: X.HoD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45177HoD extends NLESingleResourceDownloadCallback {
    public final C45137HnZ LIZ = new C45137HnZ();
    public final long LIZIZ;
    public final NLESingleResourceDownloadCallback LIZJ;

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onProgress(int i) {
        this.LIZJ.onProgress(i);
    }

    public C45177HoD(C45178HoE c45178HoE, Object... objArr) {
        this.LIZJ = c45178HoE;
        this.LIZIZ = C45137HnZ.LIZIZ(objArr, c45178HoE, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
        this.LIZJ.onFailure(str, i, str2);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onSuccess(String str, String str2, boolean z) {
        this.LIZJ.onSuccess(str, str2, z);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }
}
