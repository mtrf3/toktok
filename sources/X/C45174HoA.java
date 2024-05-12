package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HoA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45174HoA extends NLEResourceManager {
    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final String fetchResource(String str, NLEResourceCallback nLEResourceCallback) {
        if (str == null) {
            return null;
        }
        C45161Hnx.LIZIZ(null);
        C45154Hnq c45154Hnq = C45154Hnq.LIZJ;
        C45178HoE c45178HoE = new C45178HoE(nLEResourceCallback);
        c45154Hnq.getClass();
        C45155Hnr LIZJ = C45154Hnq.LIZJ();
        LIZJ.getClass();
        C45177HoD c45177HoD = new C45177HoD(c45178HoE, new Object[0]);
        SmartMovie smartMovie = LIZJ.LIZ;
        if (smartMovie != null) {
            String execId = SmartMovieJniJNI.SmartMovie_fetchDavinciUrs(smartMovie.LIZ, smartMovie, str, NLESingleResourceDownloadCallback.getCPtr(c45178HoE), c45178HoE);
            HashMap<String, Long> LIZ = LIZJ.LIZ();
            o.LJFF(execId, "execId");
            LIZ.put(execId, Long.valueOf(c45177HoD.LIZIZ));
            return execId;
        }
        o.LJIJI("smartMovie");
        throw null;
    }
}
