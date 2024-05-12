package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166176fd extends AbstractC65781Prl implements InterfaceC88472Yns<C166116fX, C166236fj> {
    public static final C166176fd LJLIL = new C166176fd();

    public C166176fd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C166236fj invoke(C166116fX c166116fX) {
        NLEResourceNode LIZIZ;
        String str;
        NLESegment LJI;
        NLEResourceNode LIZIZ2;
        C166116fX item = c166116fX;
        o.LJIIIZ(item, "item");
        NLEModel nLEModel = item.LIZIZ;
        boolean z = true;
        String str2 = null;
        if (nLEModel != null) {
            C166236fj c166236fj = new C166236fj();
            Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
            while (LIZJ.hasNext()) {
                Iterator<NLETrackSlot> it = ((NLETrack) LIZJ.next()).LJIILL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next != null && (LJI = next.LJI()) != null && (LIZIZ2 = LJI.LIZIZ()) != null) {
                        str = LIZIZ2.LIZJ();
                    } else {
                        str = null;
                    }
                    if (TEVideoUtils.nativeCheckAudioFile(str) == 0) {
                        c166236fj.LIZ = true;
                        return c166236fj;
                    }
                }
            }
            return c166236fj;
        }
        if (item.LIZ != null) {
            C166236fj c166236fj2 = new C166236fj();
            NLESegment LJI2 = item.LIZ.LJI();
            if (LJI2 != null && (LIZIZ = LJI2.LIZIZ()) != null) {
                str2 = LIZIZ.LIZJ();
            }
            if (TEVideoUtils.nativeCheckAudioFile(str2) != 0) {
                z = false;
            }
            c166236fj2.LIZ = z;
            return c166236fj2;
        }
        return new C166236fj();
    }
}
