package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.Tft, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75237Tft implements InterfaceC28989BZh {
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LIZ;

    public C75237Tft(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel) {
        this.LIZ = multiGuestSharedBgAnchorViewModel;
    }

    @Override // X.InterfaceC28989BZh
    public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
        String str;
        String str2;
        String str3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select effect, oldSticker=");
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" effect=");
        if (liveEffect2 != null) {
            str2 = liveEffect2.getResourceId();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", image has download to ");
        if (liveEffect2 != null) {
            str3 = liveEffect2.shareImagePath;
        } else {
            str3 = null;
        }
        LIZ.append(str3);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LIZ;
        multiGuestSharedBgAnchorViewModel.LJLILLLLZI = liveEffect2;
        multiGuestSharedBgAnchorViewModel.iv0(liveEffect2, null, null);
    }
}
