package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ck1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32177Ck1 implements A76, InterfaceC27538ArO {
    @Override // X.A76
    public final String LIZ() {
        return "ecommerce_shop_influencer";
    }

    @Override // X.A76
    public final List<EnumC30736C4m> LIZIZ() {
        return C47261Igj.LJJIJIL(EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR, EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR);
    }

    @Override // X.A76
    public final List<EnumC31730Cco> LIZJ() {
        return C47261Igj.LJJIJIL(EnumC31730Cco.SLOT_LIVE_FREE_FRAME, EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR);
    }

    @Override // X.A76
    public final void LJ() {
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "live";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LIZLLL(Context context, EnumC30736C4m slotID) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(slotID, "slotID");
        int i = C31733Ccr.LIZIZ[slotID.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new C71219RxH(context);
        }
        return new C71226RxO(context);
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF(Context context, EnumC31730Cco slotID) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(slotID, "slotID");
        int i = C31733Ccr.LIZ[slotID.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            C71176Rwa c71176Rwa = new C71176Rwa(context);
            c71176Rwa.LJLJJL = this;
            return c71176Rwa;
        }
        return new C71255Rxr(context);
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
