package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;

/* renamed from: X.Hn5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45107Hn5 extends C45131HnT {
    public final /* synthetic */ XJL<NLEModel> LJFF;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45107Hn5(XKS xks, C61878OQg c61878OQg) {
        super(c61878OQg);
        this.LJFF = xks;
    }

    @Override // X.C45131HnT, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        XJL<NLEModel> xjl = this.LJFF;
        C3C5.m7constructorimpl(nLEModel);
        xjl.resumeWith(nLEModel);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        XJL<NLEModel> xjl = this.LJFF;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }
}
