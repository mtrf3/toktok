package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133045Ka implements C5KY {
    public final List<InterfaceC133065Kc> LIZ = new ArrayList();

    @Override // X.C5KY
    public final C122104qk LIZ(NLEEditor empty, InterfaceC133095Kf param) {
        InterfaceC133065Kc interfaceC133065Kc;
        C122104qk LIZ;
        o.LJIIIZ(empty, "empty");
        o.LJIIIZ(param, "param");
        Iterator<InterfaceC133065Kc> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC133065Kc = it.next();
                if (interfaceC133065Kc.LIZIZ(param) != null) {
                    break;
                }
            } else {
                interfaceC133065Kc = null;
                break;
            }
        }
        InterfaceC133065Kc interfaceC133065Kc2 = interfaceC133065Kc;
        if (interfaceC133065Kc2 != null && (LIZ = interfaceC133065Kc2.LIZ(empty, param)) != null) {
            return LIZ;
        }
        return new InterfaceC133065Kc() { // from class: X.5Kb
            @Override // X.InterfaceC133065Kc
            public final C5KG LIZIZ(InterfaceC133095Kf params) {
                o.LJIIIZ(params, "params");
                String[] videoPaths = params.getVideoPaths();
                if (videoPaths == null) {
                    videoPaths = new String[0];
                }
                C5KD c5kd = new C5KD(videoPaths);
                c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
                c5kd.LIZLLL = params.getAudioPaths();
                return c5kd;
            }

            @Override // X.InterfaceC133065Kc
            public final C122104qk LIZ(NLEEditor empty2, InterfaceC133095Kf params) {
                o.LJIIIZ(empty2, "empty");
                o.LJIIIZ(params, "params");
                C5KD c5kd = new C5KD(params.getVideoPaths());
                c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
                c5kd.LIZLLL = params.getAudioPaths();
                return C5K8.LIZ(c5kd, empty2);
            }
        }.LIZ(empty, param);
    }
}
