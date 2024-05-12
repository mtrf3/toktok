package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CdF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31757CdF implements A76 {
    @Override // X.A76
    public final String LIZ() {
        return "commercialize_live_ba_leads_gen";
    }

    @Override // X.A76
    public final List<EnumC30736C4m> LIZIZ() {
        return C47261Igj.LJJIJIL(EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR, EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR);
    }

    @Override // X.A76
    public final List<EnumC31730Cco> LIZJ() {
        return null;
    }

    @Override // X.A76
    public final void LJ() {
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF(Context context, EnumC31730Cco enumC31730Cco) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LIZLLL(Context context, EnumC30736C4m enumC30736C4m) {
        o.LJIIIZ(context, "context");
        if (enumC30736C4m != null) {
            int i = C31756CdE.LIZ[enumC30736C4m.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new OKK();
                    }
                } else {
                    return new OKL();
                }
            } else {
                return new OKJ();
            }
        }
        return null;
    }
}
