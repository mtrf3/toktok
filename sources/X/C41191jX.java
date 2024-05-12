package X;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.MultiGuestStickerImageSelectedEvent;
import com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import kotlin.jvm.internal.o;

/* renamed from: X.1jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41191jX extends C1HJ {
    public final /* synthetic */ BaseMultiGuestStickerView LIZ;

    public C41191jX(BaseMultiGuestStickerView baseMultiGuestStickerView) {
        this.LIZ = baseMultiGuestStickerView;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZIZ(LiveEffect faceLiveEffect) {
        o.LJIIIZ(faceLiveEffect, "faceLiveEffect");
        C30261Gs c30261Gs = this.LIZ.LJLLI;
        if (c30261Gs != null && c30261Gs.LJFF(faceLiveEffect)) {
            C30261Gs c30261Gs2 = this.LIZ.LJLLI;
            if (c30261Gs2 != null) {
                c30261Gs2.LIZIZ(faceLiveEffect);
                return;
            }
            return;
        }
        C30261Gs c30261Gs3 = this.LIZ.LJLLI;
        if (c30261Gs3 != null) {
            c30261Gs3.LIZLLL();
        }
        C32031Nn.LIZ.LIZ(faceLiveEffect, this.LIZ.LJLJJLL, 0, false);
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZJ(String panel) {
        o.LJIIIZ(panel, "panel");
        C30261Gs c30261Gs = this.LIZ.LJLLI;
        if (c30261Gs != null) {
            String STICKER_INTERACT = C0TY.LIZJ;
            o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
            c30261Gs.LJ(this.LIZ.LJLJL, STICKER_INTERACT);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJ(ViewGroup parentView) {
        o.LJIIIZ(parentView, "parentView");
        BaseMultiGuestStickerView baseMultiGuestStickerView = this.LIZ;
        C30261Gs c30261Gs = baseMultiGuestStickerView.LJLLI;
        if (c30261Gs != null) {
            c30261Gs.LJI(parentView, baseMultiGuestStickerView.LJLJJL);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJFF(LiveEffect faceLiveEffect) {
        C30261Gs c30261Gs;
        o.LJIIIZ(faceLiveEffect, "faceLiveEffect");
        C30261Gs c30261Gs2 = this.LIZ.LJLLI;
        if (c30261Gs2 != null && c30261Gs2.LJFF(faceLiveEffect) && (c30261Gs = this.LIZ.LJLLI) != null) {
            c30261Gs.LIZLLL();
        }
        C32031Nn c32031Nn = C32031Nn.LIZ;
        C32031Nn.LIZJ = null;
        c32031Nn.LJIIJ(this.LIZ.LJLJJLL, this.LIZ.LIZLLL());
    }

    @Override // X.InterfaceC30494Bxy
    public final int LJI(String str, String str2) {
        long j;
        Long l;
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        DataChannel dataChannel = this.LIZ.LJLJJLL;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        iBroadcastService.uploadStickerImage(str, str2, j);
        DataChannel dataChannel2 = this.LIZ.LJLJJLL;
        if (dataChannel2 != null) {
            dataChannel2.qv0(MultiGuestStickerImageSelectedEvent.class, new C0TV(str, str2));
        }
        IFilterManager iFilterManager = this.LIZ.LJLILLLLZI;
        if (iFilterManager != null) {
            return iFilterManager.setCustomEffect(str, str2);
        }
        return -1;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJII(String str, String str2) {
        C32031Nn.LIZ.LJIIIIZZ(this.LIZ.LJLJJLL, str2);
    }
}
