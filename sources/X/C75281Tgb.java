package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS102S0300000_13;

/* renamed from: X.Tgb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75281Tgb implements C0K7 {
    public final /* synthetic */ LiveEffect LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LJLJI;
    public final /* synthetic */ Context LJLJJI;

    public C75281Tgb(LiveEffect liveEffect, DataChannel dataChannel, MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context) {
        this.LJLIL = liveEffect;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = multiGuestSharedBgAnchorViewModel;
        this.LJLJJI = context;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog, click use btn");
        liveDialog.dismiss();
        if (!TextUtils.isEmpty(this.LJLIL.shareImagePath)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show quick apply dialog, use cache image success, shareImagePath = ");
            LIZ.append(this.LJLIL.shareImagePath);
            C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
            ((IEffectService) CN1.LIZ(IEffectService.class)).removeSoloBgEffect(this.LJLILLLLZI);
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LJLJI;
            multiGuestSharedBgAnchorViewModel.iv0(this.LJLIL, new AqS102S0300000_13(multiGuestSharedBgAnchorViewModel, this.LJLJJI, this.LJLILLLLZI, 3), new AqS102S0300000_13(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, 4));
        } else {
            C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog, start download image");
            LiveEffect liveEffect = this.LJLIL;
            C75283Tgd.LIZIZ(liveEffect.shareImageId, liveEffect.shareImageUrl, new C75280Tga(liveEffect, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        }
        C75285Tgf.LJ("grid_shared_panel_used", "confirm");
    }
}
