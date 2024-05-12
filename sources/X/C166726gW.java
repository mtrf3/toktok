package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model.StsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6gW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166726gW {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C166266fm> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, StsAssetModel> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, StsResponse> LIZLLL = new ConcurrentHashMap<>();

    public static String LIZIZ(NLEModel nLEModel) {
        Iterator it = ((ArrayList) C122794rr.LIZLLL(nLEModel)).iterator();
        String str = "";
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = ((NLETrack) it.next()).LJIILLIIL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                NLESegmentAudio LIZLLL2 = C62850Ola.LIZLLL(next, "slot");
                String LIZJ2 = next.LJI().LIZIZ().LIZJ();
                long startTime = next.getStartTime();
                long endTime = next.getEndTime();
                long LJIILIIL = LIZLLL2.LJIILIIL();
                long LJIIL = LIZLLL2.LJIIL();
                String uuid = next.getUUID();
                float LJIILJJIL = LIZLLL2.LJIILJJIL();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(uuid);
                LIZ3.append(LIZJ2);
                LIZ3.append(startTime);
                LIZ3.append(endTime);
                LIZ3.append(LJIILIIL);
                LIZ3.append(LJIIL);
                LIZ3.append(LJIILJJIL);
                LIZ2.append(X1D.LIZIZ(LIZ3));
                str = X1D.LIZIZ(LIZ2);
            }
        }
        String res = C173376rF.LJI(str);
        o.LJIIIIZZ(res, "res");
        return res;
    }

    public static String LIZJ(String speechCacheKey) {
        o.LJIIIZ(speechCacheKey, "speechCacheKey");
        String str = LIZ.get(speechCacheKey);
        if (str != null && C1B6.LIZIZ(str)) {
            return str;
        }
        return null;
    }

    public static String LIZ(String modelCacheKey, String templateId) {
        o.LJIIIZ(modelCacheKey, "modelCacheKey");
        o.LJIIIZ(templateId, "templateId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(modelCacheKey);
        LIZ2.append(templateId);
        return X1D.LIZIZ(LIZ2);
    }
}
