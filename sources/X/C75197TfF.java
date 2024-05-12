package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TfF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75197TfF implements InterfaceC75222Tfe {
    public final /* synthetic */ C75198TfG LIZ;

    public C75197TfF(C75198TfG c75198TfG) {
        this.LIZ = c75198TfG;
    }

    @Override // X.InterfaceC75222Tfe
    public final boolean LIZ(LiveEffect liveEffect) {
        if (o.LJ(liveEffect.realId, "")) {
            return true;
        }
        try {
            return this.LIZ.LIZ().LIZ(liveEffect);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZIZ(LiveEffect liveEffect) {
        InterfaceC75203TfL interfaceC75203TfL;
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel;
        C0WF gv0;
        C0WF gv02;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel2 != null && (gv02 = absMultiGuestEffectViewModel2.gv0()) != null) {
            gv02.LIZLLL(C75202TfK.LIZ());
        }
        String str = "";
        if (!o.LJ(liveEffect.realId, "") && (absMultiGuestEffectViewModel = this.LIZ.LIZ) != null && (gv0 = absMultiGuestEffectViewModel.gv0()) != null) {
            gv0.LIZIZ(liveEffect, C75202TfK.LIZ());
        }
        this.LIZ.getClass();
        this.LIZ.getClass();
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel3 = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel3 != null && (liveData = (LiveData) absMultiGuestEffectViewModel3.LJLJLLL.getValue()) != null) {
            liveData.setValue(liveEffect);
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel4 = this.LIZ.LIZ;
        if (absMultiGuestEffectViewModel4 != null && (interfaceC75203TfL = absMultiGuestEffectViewModel4.LJLLJ) != null) {
            interfaceC75203TfL.LIZIZ(liveEffect);
        }
        C31014CFe.LJFF(String.valueOf(Long.valueOf(liveEffect.effectId)));
        String resourceId = liveEffect.getResourceId();
        if (resourceId != null) {
            str = resourceId;
        }
        C31014CFe.LJI(str);
    }

    @Override // X.InterfaceC75222Tfe
    public final void LIZJ(LiveEffect liveEffect) {
        LiveData liveData;
        if (this.LIZ.LIZ().LIZ(liveEffect)) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LIZ.LIZ;
            if (absMultiGuestEffectViewModel == null || (liveData = (LiveData) absMultiGuestEffectViewModel.LJLJJLL.getValue()) == null) {
                return;
            }
            liveData.setValue(liveEffect);
            return;
        }
        this.LIZ.LIZ().LIZIZ(C75202TfK.LIZ(), liveEffect, (InterfaceC08110Tn) EUR.LIZ(this.LIZ.LJFF));
    }
}
