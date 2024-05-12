package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.TbS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74962TbS implements C0WD {
    public final /* synthetic */ AbsMultiGuestNewPreviewFragment LJLIL;

    public C74962TbS(AbsMultiGuestNewPreviewFragment absMultiGuestNewPreviewFragment) {
        this.LJLIL = absMultiGuestNewPreviewFragment;
    }

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        C32536Cpo<C74961TbR> iv02;
        C74961TbR c74961TbR2;
        if (z) {
            AbsMultiGuestNewPreviewViewModel Kl = this.LJLIL.Kl();
            if (Kl == null || (iv02 = Kl.iv0()) == null || (c74961TbR2 = iv02.LIZ) == null) {
                return;
            }
            c74961TbR2.LJ = liveEffect;
            return;
        }
        AbsMultiGuestNewPreviewViewModel Kl2 = this.LJLIL.Kl();
        if (Kl2 == null || (iv0 = Kl2.iv0()) == null || (c74961TbR = iv0.LIZ) == null) {
            return;
        }
        c74961TbR.LJ = new LiveEffect();
    }
}
