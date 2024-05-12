package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.5E4, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5E4 extends TBS implements InterfaceC88473Ynt<NLETrackSlot, Float, Integer, C76800UCe> {
    public C5E4(C5E5 c5e5) {
        super(3, c5e5, C5E5.class, "loadNoCachedVideoFrames", "loadNoCachedVideoFrames(Lcom/bytedance/ies/nle/editor_jni/NLETrackSlot;FI)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(NLETrackSlot nLETrackSlot, Float f, Integer num) {
        NLETrackSlot p0 = nLETrackSlot;
        float floatValue = f.floatValue();
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        ((C5E5) this.receiver).LLFFF(p0, floatValue, intValue);
        return C76800UCe.LIZ;
    }
}
