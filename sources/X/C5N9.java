package X;

import com.bytedance.ies.nle.editor_jni.NLEEffectMsgListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEEffectRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import kotlin.jvm.internal.o;

/* renamed from: X.5N9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N9 extends C5N3 {
    public C5NQ LJ;

    public final NLEEffectRuntimeController LJ() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEEffectRuntimeController) c5n2.LJIIJJI.getValue();
    }

    public final int LJFF() {
        int i;
        synchronized (this.LIZLLL) {
            NLEEffectRuntimeController LJ = LJ();
            if (LJ != null) {
                i = NLEMediaPublicJniJNI.NLEEffectRuntimeController_removeEffectMessageCenterCallback(LJ.LIZ, LJ);
            } else {
                i = -1;
            }
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5N9(C5N2 session) {
        super(session);
        o.LJIIIZ(session, "session");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5NQ] */
    public final int LJI(final C5NO c5no) {
        if (LJ() != null) {
            this.LJ = new NLEEffectMsgListenerWrapper() { // from class: X.5NQ
                @Override // com.bytedance.ies.nle.editor_jni.NLEEffectMsgListenerWrapper
                public final void onMessageReceived(int i, int i2, int i3, String str) {
                    c5no.LIZ(i, str);
                }
            };
            NLEEffectRuntimeController LJ = LJ();
            if (LJ != null) {
                C5NQ c5nq = this.LJ;
                return NLEMediaPublicJniJNI.NLEEffectRuntimeController_setEffectMessageCenterCallback(LJ.LIZ, LJ, NLEEffectMsgListenerWrapper.getCPtr(c5nq), c5nq);
            }
        }
        return -1;
    }
}
