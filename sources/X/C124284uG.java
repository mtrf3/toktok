package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124284uG extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrackSlot, Boolean> {
    public static final C124284uG LJLIL = new C124284uG();

    public C124284uG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrackSlot nLETrackSlot) {
        EnumC123874tb enumC123874tb;
        boolean z;
        NLEResourceNode LIZIZ;
        NLETrackSlot slot = nLETrackSlot;
        o.LJIIIZ(slot, "slot");
        NLESegment LJI = slot.LJI();
        if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
            enumC123874tb = LIZIZ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
