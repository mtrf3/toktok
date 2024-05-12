package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AqS9S1210000_13;

/* renamed from: X.TgS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75272TgS implements C0WQ {
    public final /* synthetic */ MultiGuestSharedBgGuestViewModel LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.C0WQ
    public final void onFail() {
        C74987Tbr.LIZJ("guest_shared_bg", "apply shared bg, fetchUpdatedEffect fail");
        this.LIZ.setState(C75274TgU.LJLIL);
        this.LIZ.LJLILLLLZI = null;
    }

    @Override // X.C0WQ
    public final void LIZ(LiveEffect liveEffect) {
        if (!TextUtils.isEmpty(liveEffect.shareImagePath)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("apply shared bg, use cache image success, shareImagePath = ");
            LIZ.append(liveEffect.shareImagePath);
            C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ));
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.LIZ;
            multiGuestSharedBgGuestViewModel.setState(new AqS9S1210000_13(multiGuestSharedBgGuestViewModel, liveEffect, this.LIZJ, this.LIZIZ, 0));
            this.LIZ.LJLILLLLZI = null;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("download image ");
        LIZ2.append(liveEffect);
        LIZ2.append(".shareImageUrl");
        C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ2));
        C75283Tgd.LIZIZ(liveEffect.shareImageId, liveEffect.shareImageUrl, new C75278TgY(this.LIZ, liveEffect, this.LIZJ, this.LIZIZ));
    }

    public C75272TgS(MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel, boolean z, String str) {
        this.LIZ = multiGuestSharedBgGuestViewModel;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
