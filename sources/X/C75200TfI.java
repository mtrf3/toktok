package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment;

/* renamed from: X.TfI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75200TfI implements C0K4 {
    public final /* synthetic */ MultiGuestGuestPropsPageFragment LIZ;

    public C75200TfI(MultiGuestGuestPropsPageFragment multiGuestGuestPropsPageFragment) {
        this.LIZ = multiGuestGuestPropsPageFragment;
    }

    @Override // X.C0K4
    public final void LIZIZ() {
        C75198TfG c75198TfG;
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LIZ.LJLJI;
        if (absMultiGuestEffectViewModel != null && (c75198TfG = (C75198TfG) absMultiGuestEffectViewModel.LJLJJL.getValue()) != null) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = c75198TfG.LIZ;
            if (absMultiGuestEffectViewModel2 != null && (liveData = (LiveData) absMultiGuestEffectViewModel2.LJLLI.getValue()) != null) {
                liveData.setValue(Boolean.TRUE);
            }
            c75198TfG.LIZ().LIZJ(C75202TfK.LIZ(), c75198TfG.LJ);
        }
    }
}
