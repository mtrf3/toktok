package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ccy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31740Ccy implements InterfaceC31722Ccg {
    @Override // X.InterfaceC31722Ccg
    public final void LIZ() {
    }

    @Override // X.InterfaceC31722Ccg
    public final List<EnumC30736C4m> LIZIZ() {
        return C47261Igj.LJJIJIL(EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // X.InterfaceC31722Ccg
    public final C31735Cct LIZJ(ActivityC45651qj context, EnumC30736C4m enumC30736C4m) {
        o.LJIIIZ(context, "context");
        if (enumC30736C4m != null) {
            int i = C31741Ccz.LIZ[enumC30736C4m.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C31735Cct(EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR);
                }
            } else {
                return new C31735Cct(EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR);
            }
        }
        return null;
    }
}
