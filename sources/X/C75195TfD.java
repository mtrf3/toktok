package X;

import Y.AfS65S0100000_13;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* renamed from: X.TfD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75195TfD implements InterfaceC08120To {
    public final /* synthetic */ C75198TfG LJLIL;

    @Override // X.InterfaceC08120To
    public final void Wj() {
        LiveData liveData;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLIL.LIZ;
        if (absMultiGuestEffectViewModel == null || (liveData = (LiveData) absMultiGuestEffectViewModel.LJLLILLLL.getValue()) == null) {
            return;
        }
        liveData.setValue(Boolean.TRUE);
    }

    public C75195TfD(C75198TfG c75198TfG) {
        this.LJLIL = c75198TfG;
    }

    @Override // X.InterfaceC08120To
    public final void L0(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse != null) {
            C75198TfG c75198TfG = this.LJLIL;
            c75198TfG.getClass();
            c75198TfG.LIZIZ.LIZ(AbstractC73672Svk.LJJIIZ(effectChannelResponse.getAllCategoryEffects()).LJJIJL(C44384HbQ.LJLJJI).LJJLIL().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS65S0100000_13(c75198TfG, 101), new InterfaceC64592gB() { // from class: X.9Xc
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        th.printStackTrace();
                    }
                }
            }));
        }
    }
}
