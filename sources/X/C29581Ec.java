package X;

import Y.IDCListenerS135S0100000;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29581Ec extends C0G1 {
    public final StickerEffectViewModel LJIILJJIL;
    public final C0WF LJIILL;

    @Override // X.C0G1
    public final void LIZJ() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJIILJJIL), null, null, new C539829y(this, null), 3);
    }

    @Override // X.C0G1
    public final void LJFF(C32001Nk c32001Nk, boolean z, String panel, IDqS416S0100000 iDqS416S0100000) {
        LiveEffect liveEffect;
        List<LiveEffect> LIZ;
        o.LJIIIZ(panel, "panel");
        super.LJFF(c32001Nk, z, panel, iDqS416S0100000);
        C40771ir c40771ir = this.LJIIIIZZ;
        C0WF c0wf = this.LJIILL;
        if (c0wf != null && (LIZ = c0wf.LIZ(panel)) != null) {
            liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        } else {
            liveEffect = null;
        }
        c40771ir.LLJJJ(liveEffect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29581Ec(ViewGroup parent, RecyclerView.RecycledViewPool viewPool, C0WF c0wf, StickerEffectViewModel viewModel, DataChannel dataChannel) {
        super(parent, dataChannel, viewModel, viewPool);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(viewPool, "viewPool");
        this.LJIILJJIL = viewModel;
        this.LJIILL = c0wf;
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 12), this.LJII);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C539729x(this, null), 3);
    }
}
