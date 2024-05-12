package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141335gf implements InterfaceC48038ItG {
    public static final C141335gf LJLIL = new C141335gf();

    public static final C3C4 LIZ(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        return new C3C4(exception);
    }

    public static final NLETrack LIZIZ(NLEModel nLEModel) {
        NLETrack nLETrack;
        o.LJIIIZ(nLEModel, "<this>");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (o.LJ(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        return nLETrack;
    }

    public static final void LIZJ(Object obj) {
        if (!(obj instanceof C3C4)) {
        } else {
            throw ((C3C4) obj).exception;
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String response = (String) obj;
        o.LJIIIZ(response, "response");
        return new T1R(response);
    }
}
