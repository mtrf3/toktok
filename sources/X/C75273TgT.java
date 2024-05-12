package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AqS54S1200000_13;

/* renamed from: X.TgT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75273TgT implements C0WQ {
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.C0WQ
    public final void onFail() {
        this.LIZ.setState(C75275TgV.LJLIL);
    }

    @Override // X.C0WQ
    public final void LIZ(LiveEffect liveEffect) {
        if (!TextUtils.isEmpty(liveEffect.shareImagePath)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("anchor resumeSharedBg, use cache image success, shareImagePath = ");
            LIZ.append(liveEffect.shareImagePath);
            C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ));
            C75286Tgg c75286Tgg = this.LIZ.LJLJI;
            if (c75286Tgg != null) {
                c75286Tgg.LIZJ();
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
            multiGuestSharedBgAnchorViewModel.LJLJI = new C75286Tgg(liveEffect, true);
            multiGuestSharedBgAnchorViewModel.LJLILLLLZI = liveEffect;
            multiGuestSharedBgAnchorViewModel.setState(new AqS54S1200000_13(multiGuestSharedBgAnchorViewModel, liveEffect, this.LIZIZ, 3));
            return;
        }
        C75283Tgd.LIZIZ(liveEffect.shareImageId, liveEffect.shareImageUrl, new C75279TgZ(this.LIZ, liveEffect, this.LIZIZ));
    }

    public C75273TgT(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, String str) {
        this.LIZ = multiGuestSharedBgAnchorViewModel;
        this.LIZIZ = str;
    }
}
