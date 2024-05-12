package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestAnchorAvatarBgWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.VoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;

/* renamed from: X.Br7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC30069Br7 {
    MultiCoHostWidget LIZ(boolean z);

    MultiGuestV3AnchorWidget LIZIZ(FrameLayout frameLayout);

    MultiGuestV3AnchorReservationWidget LIZJ(FrameLayout frameLayout);

    VoiceChatAnchorWidget LIZLLL();

    void LJ();

    LinkControlWidget LJFF(InterfaceC32212Cka interfaceC32212Cka);

    VoiceChatWatchWidget LJI();

    MultiGuestV3GuestReservationWidget LJII(FrameLayout frameLayout);

    MultiGuestV3GuestWidget LJIIIIZZ(FrameLayout frameLayout);

    void LJIIIZ(UB9 ub9);

    MultiGuestAnchorAvatarBgWidget LJIIJ();

    VoiceChatControlWidget LJIIJJI(TX9 tx9);
}
