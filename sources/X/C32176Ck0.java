package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ck0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32176Ck0 implements A76, InterfaceC27538ArO {
    @Override // X.A76
    public final String LIZ() {
        return "ecommerce_shop";
    }

    @Override // X.A76
    public final List<EnumC31730Cco> LIZJ() {
        return C47261Igj.LJJIJIL(EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE, EnumC31730Cco.SLOT_LIVE_WATCHER_L3_POP);
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

    @Override // X.A76
    public final List<EnumC30736C4m> LIZIZ() {
        EnumC30736C4m enumC30736C4m;
        int LIZIZ = C71126Rvm.LIZIZ();
        if (LIZIZ != 2 && LIZIZ != 3) {
            enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
        } else {
            enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_L2_TOOLBAR;
        }
        return C47261Igj.LJJIJIL(enumC30736C4m);
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
        int i = C31732Ccq.LIZIZ[slotID.ordinal()];
        if (i != 1 && i != 2) {
            return null;
        }
        return new C71188Rwm(context);
    }

    @Override // X.A76
    public final InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF(Context context, EnumC31730Cco slotID) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(slotID, "slotID");
        int i = C31732Ccq.LIZ[slotID.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new C71172RwW(context, false, false);
        }
        C32178Ck2 c32178Ck2 = new C32178Ck2(context);
        Iterator it = ((ArrayList) c32178Ck2.LJLJI).iterator();
        while (it.hasNext()) {
            ((AbstractC32179Ck3) it.next()).LJLJJL = this;
        }
        return c32178Ck2;
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
