package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CompressMetaCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;

/* renamed from: X.Hmo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45090Hmo extends CompressMetaCallback {
    @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
    public final void onSuccess(VecMeta vecMeta) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutHelper  compressMeta onSuccess size = ");
        if (vecMeta != null) {
            num = Integer.valueOf(vecMeta.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.smartmovie.jni.CompressMetaCallback
    public final void onFailure(int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutHelper compressMeta onFailure code=");
        LIZ.append(i);
        LIZ.append(", msg=");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }
}
