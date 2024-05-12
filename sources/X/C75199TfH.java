package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.TfH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75199TfH implements InterfaceC08110Tn {
    public final /* synthetic */ C75198TfG LIZ;

    @Override // X.InterfaceC08110Tn
    public final void LIZ() {
    }

    public C75199TfH(C75198TfG c75198TfG) {
        this.LIZ = c75198TfG;
    }

    @Override // X.InterfaceC08110Tn
    public final void LIZLLL(LiveEffect liveEffect) {
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel == null || (liveData = (LiveData) absMultiGuestEffectViewModel.LJLJLJ.getValue()) == null) {
            return;
        }
        liveData.setValue(liveEffect);
    }

    @Override // X.InterfaceC08110Tn
    public final void LIZIZ(LiveEffect liveEffect, String str) {
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel == null || (liveData = (LiveData) absMultiGuestEffectViewModel.LJLJL.getValue()) == null) {
            return;
        }
        liveData.setValue(liveEffect);
    }

    @Override // X.InterfaceC08110Tn
    public final void LIZJ(LiveEffect liveEffect, String str) {
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel == null || (liveData = (LiveData) absMultiGuestEffectViewModel.LJLJJLL.getValue()) == null) {
            return;
        }
        liveData.setValue(liveEffect);
    }
}
