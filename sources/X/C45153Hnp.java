package X;

import com.bytedance.ies.smartmovie.jni.CompressMetaCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;

/* renamed from: X.Hnp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45153Hnp extends CompressMetaCallback {
    public final C45137HnZ LIZ = new C45137HnZ();
    public final long LIZIZ;
    public final CompressMetaCallback LIZJ;

    @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
    public final void onSuccess(VecMeta vecMeta) {
        this.LIZJ.onSuccess(vecMeta);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }

    public C45153Hnp(CompressMetaCallback compressMetaCallback, Object... objArr) {
        this.LIZJ = compressMetaCallback;
        this.LIZIZ = C45137HnZ.LIZIZ(objArr, compressMetaCallback, this);
    }

    @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
    public final void onFailure(int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZJ.onFailure(i, str, unorderedMapStrStr);
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }
}
