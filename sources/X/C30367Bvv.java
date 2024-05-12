package X;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Bvv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30367Bvv implements InterfaceC08050Th<LiveEffect> {
    public final /* synthetic */ C30350Bve LIZ;

    public C30367Bvv(C30350Bve c30350Bve) {
        this.LIZ = c30350Bve;
    }

    @Override // X.InterfaceC08050Th
    public final void LIZIZ(int i) {
        InterfaceC30359Bvn liveParamsListener = this.LIZ.getLiveParamsListener();
        if (liveParamsListener != null) {
            liveParamsListener.LJJIFFI(i);
        }
    }

    @Override // X.InterfaceC08050Th
    public final void LIZ(float f, FilterModel filterModel) {
        InterfaceC30359Bvn liveParamsListener = this.LIZ.getLiveParamsListener();
        if (liveParamsListener != null) {
            liveParamsListener.LJIJJLI(filterModel, f);
        }
    }
}
