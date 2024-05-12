package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.VecString;
import kotlin.jvm.internal.AqS157S0100000_7;

/* renamed from: X.HnU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45132HnU extends NLEResourceDownloadCallback {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onNeedFetch(VecString vecString) {
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onProgress(float f) {
    }

    public C45132HnU(AqS157S0100000_7 aqS157S0100000_7) {
        this.LIZ = aqS157S0100000_7;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onSuccess(NLEModel nLEModel) {
        this.LIZ.invoke();
    }
}
