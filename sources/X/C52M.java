package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.52M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52M {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52N.LJLIL);

    public static boolean LIZ(NLEModel nLEModel) {
        Object obj;
        Iterator LIZJ = t1.LIZJ(nLEModel, "model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                NLETrack it = (NLETrack) obj;
                o.LJIIIIZZ(it, "it");
                if (C124574uj.LJJIJIL(it)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null && !((Boolean) LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }
}
