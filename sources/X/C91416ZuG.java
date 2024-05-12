package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuG, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91416ZuG implements InterfaceC91195Zqh {
    public final /* synthetic */ TTDspFragmentV2 LIZ;

    public C91416ZuG(TTDspFragmentV2 tTDspFragmentV2) {
        this.LIZ = tTDspFragmentV2;
    }

    @Override // X.InterfaceC91195Zqh
    public final void LIZ(EnumC91191Zqd tabType, TuxTextView tuxTextView, EnumC91190Zqc scene) {
        o.LJIIIZ(tabType, "tabType");
        o.LJIIIZ(scene, "scene");
        int i = C91224ZrA.LIZ[tabType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            TTDspFragmentV2 tTDspFragmentV2 = this.LIZ;
            LPU Jl = tTDspFragmentV2.Jl();
            if (Jl != null) {
                Jl.setCurrentItem(1, false);
            }
            tTDspFragmentV2.Ml("Daily Mix V2");
            return;
        }
        TTDspFragmentV2 tTDspFragmentV22 = this.LIZ;
        LPU Jl2 = tTDspFragmentV22.Jl();
        if (Jl2 != null) {
            Jl2.setCurrentItem(0, false);
        }
        tTDspFragmentV22.Ml("LIBRARY V2");
    }
}
