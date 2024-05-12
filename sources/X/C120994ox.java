package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120994ox {
    public static NLETrack LIZ(NLEModel nleModel) {
        NLETrack nLETrack;
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr tracks = nleModel.getTracks();
        o.LJIIIIZZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (o.LJ(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        return nLETrack;
    }
}
