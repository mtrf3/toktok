package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Br6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30068Br6 implements InterfaceC32212Cka {
    public final /* synthetic */ InterfaceC30069Br7 LIZ;
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZIZ;

    @Override // X.InterfaceC32212Cka
    public final void LIZ(LiveWidget liveWidget) {
        this.LIZIZ.mWidgetManager.unload(liveWidget);
    }

    public C30068Br6(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment, InterfaceC30069Br7 interfaceC30069Br7) {
        this.LIZIZ = portraitAudienceInteractionFragment;
        this.LIZ = interfaceC30069Br7;
    }

    @Override // X.InterfaceC32212Cka
    public final InterfaceC75487Tjv LIZIZ(int i, boolean z) {
        InterfaceC28296B8q interfaceC28296B8q;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                return null;
                            }
                            MultiGuestV3GuestReservationWidget LJII = this.LIZ.LJII((FrameLayout) this.LIZIZ.rootView.findViewById(R.id.epk));
                            this.LIZIZ.mWidgetManager.load(R.id.h3c, (Widget) LJII, false);
                            return LJII;
                        }
                        MultiGuestV3AnchorReservationWidget LIZJ = this.LIZ.LIZJ((FrameLayout) this.LIZIZ.rootView.findViewById(R.id.epk));
                        this.LIZIZ.mWidgetManager.load(R.id.h3c, (Widget) LIZJ, false);
                        return LIZJ;
                    }
                    InterfaceC30069Br7 interfaceC30069Br7 = this.LIZ;
                    this.LIZIZ.rootView.findViewById(R.id.epk);
                    MultiCoHostWidget LIZ = interfaceC30069Br7.LIZ(z);
                    this.LIZIZ.mWidgetManager.load(R.id.hql, (Widget) LIZ, false);
                    return LIZ;
                }
                InterfaceC30069Br7 interfaceC30069Br72 = this.LIZ;
                this.LIZIZ.rootView.findViewById(R.id.epk);
                interfaceC30069Br72.LJ();
                this.LIZIZ.mWidgetManager.load(R.id.hql, (Widget) null, false);
                return null;
            }
            MultiGuestV3GuestWidget LJIIIIZZ = this.LIZ.LJIIIIZZ((FrameLayout) this.LIZIZ.rootView.findViewById(R.id.epk));
            DataChannel dataChannel = this.LIZIZ.mDataChannel;
            if (dataChannel != null && (interfaceC28296B8q = (InterfaceC28296B8q) dataChannel.kv0(C28406BCw.class)) != null) {
                interfaceC28296B8q.LIZJ();
            }
            this.LIZIZ.mWidgetManager.load(R.id.h3c, (Widget) LJIIIIZZ, false);
            return LJIIIIZZ;
        }
        MultiGuestV3AnchorWidget LIZIZ = this.LIZ.LIZIZ((FrameLayout) this.LIZIZ.rootView.findViewById(R.id.epk));
        this.LIZIZ.mWidgetManager.load(R.id.h3c, (Widget) LIZIZ, false);
        return LIZIZ;
    }
}
