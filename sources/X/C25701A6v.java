package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A6v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25701A6v implements A76 {
    @Override // X.A76
    public final String LIZ() {
        return "live_paid_series";
    }

    @Override // X.A76
    public final List<EnumC30736C4m> LIZIZ() {
        return C47261Igj.LJJIJIL(EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // X.A76
    public final List<EnumC31730Cco> LIZJ() {
        return C47261Igj.LJJIJIL(EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE, EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR);
    }

    @Override // X.A76
    public final void LJ() {
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LIZLLL(Context context, EnumC30736C4m enumC30736C4m) {
        o.LJIIIZ(context, "context");
        if (enumC30736C4m != null) {
            int i = C25702A6w.LIZ[enumC30736C4m.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C25699A6t();
                    }
                } else {
                    return new C25705A6z();
                }
            } else {
                return new C25696A6q();
            }
        }
        return null;
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF(Context context, EnumC31730Cco enumC31730Cco) {
        o.LJIIIZ(context, "context");
        if (A53.LIZ() && enumC31730Cco != null) {
            int i = C25702A6w.LIZIZ[enumC31730Cco.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C25693A6n();
                }
            } else {
                return new C25692A6m();
            }
        }
        return null;
    }
}
