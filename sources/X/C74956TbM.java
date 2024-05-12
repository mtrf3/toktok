package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.TbM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74956TbM implements InterfaceC75203TfL {
    public final /* synthetic */ AbsMultiGuestNewPreviewFragment LIZ;

    @Override // X.InterfaceC75203TfL
    public final void LIZJ() {
        int i;
        LiveData liveData;
        Integer num;
        AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment = this.LIZ;
        if (absMultiGuestNewPreviewFragment.LLIIII) {
            AbsMultiGuestNewPreviewViewModel Kl = absMultiGuestNewPreviewFragment.Kl();
            if (Kl != null && (liveData = (LiveData) Kl.LJLJJLL.getValue()) != null && (num = (Integer) liveData.getValue()) != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            C75460TjU.LIZLLL(i, absMultiGuestNewPreviewFragment.Il());
            absMultiGuestNewPreviewFragment.LLIIII = false;
        }
    }

    @Override // X.InterfaceC75203TfL
    public final LiveEffect LJ() {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        AbsMultiGuestNewPreviewViewModel Kl = this.LIZ.Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            return c74961TbR.LJ;
        }
        return null;
    }

    @Override // X.InterfaceC75203TfL
    public final int LJFF() {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        AbsMultiGuestNewPreviewViewModel Kl = this.LIZ.Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            return c74961TbR.LIZLLL;
        }
        return 2;
    }

    public C74956TbM(AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment) {
        this.LIZ = absMultiGuestNewPreviewFragment;
    }

    @Override // X.InterfaceC75203TfL
    public final void LIZIZ(LiveEffect liveEffect) {
        LiveData liveData;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        AbsMultiGuestNewPreviewViewModel Kl = this.LIZ.Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            c74961TbR.LJ = liveEffect;
        }
        AbsMultiGuestNewPreviewViewModel Kl2 = this.LIZ.Kl();
        if (Kl2 == null || (liveData = (LiveData) Kl2.LJLJL.getValue()) == null) {
            return;
        }
        liveData.setValue(liveEffect);
    }

    @Override // X.InterfaceC75203TfL
    public final void LJI(int i) {
        boolean z;
        LiveData liveData;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        C32536Cpo<C74961TbR> iv02;
        C74961TbR c74961TbR2;
        AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment = this.LIZ;
        AbsMultiGuestNewPreviewViewModel Kl = absMultiGuestNewPreviewFragment.Kl();
        if (Kl != null && (iv02 = Kl.iv0()) != null && (c74961TbR2 = iv02.LIZ) != null && c74961TbR2.LIZLLL == i) {
            z = true;
        } else {
            z = false;
        }
        absMultiGuestNewPreviewFragment.LLIIII = !z;
        AbsMultiGuestNewPreviewViewModel Kl2 = this.LIZ.Kl();
        if (Kl2 != null && (iv0 = Kl2.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            c74961TbR.LIZLLL = i;
        }
        AbsMultiGuestNewPreviewViewModel Kl3 = this.LIZ.Kl();
        if (Kl3 == null || (liveData = (LiveData) Kl3.LJLJJLL.getValue()) == null) {
            return;
        }
        liveData.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer, O] */
    @Override // X.InterfaceC75203TfL
    public final void LIZLLL(int i, boolean z) {
        C32537Cpp c32537Cpp;
        AbsMultiGuestNewPreviewViewModel Kl;
        LiveData liveData;
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(z)) && (Kl = this.LIZ.Kl()) != null && (liveData = (LiveData) Kl.LJLJLLL.getValue()) != null) {
            liveData.setValue(Integer.valueOf(i));
        }
        AbsMultiGuestNewPreviewViewModel Kl2 = this.LIZ.Kl();
        if (Kl2 != null && (c32537Cpp = (C32537Cpp) Kl2.LJLJLJ.getValue()) != null) {
            c32537Cpp.LIZ = Integer.valueOf(i);
        }
    }
}
