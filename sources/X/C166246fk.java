package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.i0;
import defpackage.t1;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166246fk {
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C166266fm> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();

    public static String LIZ(C166116fX c166116fX) {
        String LJ;
        String LJ2;
        NLEModel nLEModel = c166116fX.LIZIZ;
        if (nLEModel != null) {
            Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
            while (LIZJ.hasNext()) {
                Iterator<NLETrackSlot> it = ((NLETrack) LIZJ.next()).LJIILL().iterator();
                if (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next == null || (LJ2 = C122424rG.LJ(next)) == null) {
                        return null;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(next.getUUID());
                    LIZ.append(LJ2);
                    return X1D.LIZIZ(LIZ);
                }
            }
            return null;
        }
        NLETrackSlot nLETrackSlot = c166116fX.LIZ;
        if (nLETrackSlot == null || (LJ = C122424rG.LJ(nLETrackSlot)) == null) {
            return null;
        }
        return LJ;
    }

    public static String LIZIZ(C166116fX c166116fX) {
        String LIZ = LIZ(c166116fX);
        if (LIZ == null) {
            return null;
        }
        String extra = c166116fX.LIZJ.getExtra();
        if (extra != null) {
            return i0.LJFF(LIZ, new JSONObject(extra).optString("speakerID"));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String LIZJ(C166116fX model) {
        o.LJIIIZ(model, "model");
        String LIZ = LIZ(model);
        if (LIZ == null || LIZ.length() == 0) {
            return null;
        }
        return this.LIZIZ.get(LIZ);
    }

    public final void LIZLLL(C166116fX c166116fX, String str) {
        String LIZ = LIZ(c166116fX);
        if (LIZ != null) {
            this.LIZIZ.put(LIZ, str);
        }
    }

    public final void LJ(C166116fX c166116fX, String str) {
        String LIZ = LIZ(c166116fX);
        if (LIZ != null) {
            this.LIZJ.put(LIZ, new C166266fm(str));
        }
    }
}
