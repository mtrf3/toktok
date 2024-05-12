package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;

/* renamed from: X.HoE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45178HoE extends NLESingleResourceDownloadCallback {
    public final /* synthetic */ NLEResourceCallback LIZ;

    public C45178HoE(NLEResourceCallback nLEResourceCallback) {
        this.LIZ = nLEResourceCallback;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onProgress(int i) {
        NLEResourceCallback nLEResourceCallback = this.LIZ;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onProgress(i);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
        NLEResourceCallback nLEResourceCallback = this.LIZ;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onError(i, str2);
        }
        C45049Hm9.LJIIL("source_async_render", str, i, str2, null);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onSuccess(String str, String str2, boolean z) {
        NLEResourceCallback nLEResourceCallback = this.LIZ;
        if (nLEResourceCallback != null) {
            if (str2 == null) {
                str2 = "";
            }
            nLEResourceCallback.onSuccess(str, str2, z);
        }
    }
}
