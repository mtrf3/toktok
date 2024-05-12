package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.HHd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43805HHd extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrackSlot, Boolean> {
    public static final C43805HHd LJLIL = new C43805HHd();

    public C43805HHd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrackSlot nLETrackSlot) {
        boolean z;
        NLETrackSlot slot = nLETrackSlot;
        o.LJIIIZ(slot, "slot");
        String extra = slot.getExtra("library_id");
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
