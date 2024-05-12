package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122494rN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEEditor nLEEditor) {
        Object obj;
        Iterator LIZJ = C141415gn.LIZJ(nLEEditor, "nleEditor.model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            nLEEditor.LJ().removeTrack(nLETrack);
            C43045Guv.LIZLLL(new AqS152S0100000_2(nLEEditor, 151), 0L);
        }
    }

    public static NLETrack LIZIZ(NLEModel nLEModel) {
        Object obj;
        Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack == null) {
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setExtra("AudioTrackType", EnumC122254qz.DUB.name());
            nLETrack2.setEnable(true);
            nLETrack2.LJJ(false);
            nLETrack2.setStartTime(0L);
            nLETrack2.setEndTime(-2L);
            nLETrack2.LJIL(EnumC123864ta.AUDIO);
            nLEModel.addTrack(nLETrack2);
            return nLETrack2;
        }
        return nLETrack;
    }
}
