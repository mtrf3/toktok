package X;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Bvu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30366Bvu implements InterfaceC08050Th<LiveEffect> {
    public final /* synthetic */ C30351Bvf LIZ;

    public C30366Bvu(C30351Bvf c30351Bvf) {
        this.LIZ = c30351Bvf;
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
