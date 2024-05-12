package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkGuestZoomEvent;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74992Tbw extends C74995Tbz {
    public static final /* synthetic */ int LJIILL = 0;

    public C74992Tbw(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.C74995Tbz
    public final void LJIIJ(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        boolean z;
        boolean z2;
        boolean z3;
        DataChannel dataChannel;
        Long l;
        User owner;
        FollowInfo followInfo;
        if (C74998Tc2.LIZIZ() != EnumC75006TcA.GUEST) {
            return;
        }
        super.LJIIJ(linkerEnlargeStatusSynContent);
        String zoomLinkMicId = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        int i = linkerEnlargeStatusSynContent.scene;
        o.LJIIIIZZ(zoomLinkMicId, "zoomLinkMicId");
        String str = null;
        if (o.LJ(zoomLinkMicId, C74995Tbz.LJII()) && i == 2) {
            C74824TYe c74824TYe = C74824TYe.LIZ;
            String guestId = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            o.LJIIIZ(guestId, "guestId");
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            hashMap.put("guest_id", guestId);
            if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                l = Long.valueOf(followInfo.getFollowStatus());
            } else {
                l = null;
            }
            hashMap.put("anchor_relationship", String.valueOf(l));
            hashMap.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
            C74824TYe.LIZJ(c74824TYe, hashMap);
            C74824TYe.LIZ(hashMap);
            C74824TYe.LJLL("livesdk_guest_screen_enlarged", hashMap);
        }
        this.LJ = i;
        if (o.LJ(zoomLinkMicId, C74995Tbz.LJII()) && this.LJ == 2) {
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(LinkGuestZoomEvent.class, new TTD(zoomLinkMicId, this.LIZJ, EnumC35745E1d.ZOOM_MAX));
            }
        } else {
            if (this.LJ == 2 && o.LJ(this.LIZJ, C74995Tbz.LJII())) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJ == 1 && o.LJ(this.LIZJ, C74995Tbz.LJII())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJ == 3 && o.LJ(this.LIZJ, C74995Tbz.LJII())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || z2 || z3) && (dataChannel = this.LIZ) != null) {
                dataChannel.qv0(LinkGuestZoomEvent.class, new TTD(zoomLinkMicId, this.LIZJ, EnumC35745E1d.ZOOM_MIN));
            }
        }
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                Layout LJ = LJ();
                if (LJ != null) {
                    str = LJ.getLayoutId();
                }
                C74995Tbz.LJIILLIIL(this, i);
                InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
                if (LJJIIJZLJL != null) {
                    ((U8H) LJJIIJZLJL).A1(str, true);
                }
                if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                    C74979Tbj.LIZ.LJI(false);
                }
            }
        } else {
            Layout LJ2 = LJ();
            if (LJ2 != null) {
                str = LJ2.getLayoutId();
            }
            C74995Tbz.LJIILJJIL(this, zoomLinkMicId, LJ(), C74995Tbz.LJIIIZ(this, zoomLinkMicId), i);
            InterfaceC75579TlP LJJIIJZLJL2 = C77412UZs.LJJIIJZLJL();
            if (LJJIIJZLJL2 != null) {
                ((U8H) LJJIIJZLJL2).A1(str, true);
            }
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj.LIZ.LJI(true);
            }
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.qv0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }

    public final void LJIIZILJ(String zoomLinkMicId, boolean z) {
        boolean z2;
        o.LJIIIZ(zoomLinkMicId, "zoomLinkMicId");
        if (zoomLinkMicId.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = null;
        if (!z2) {
            Layout LJ = LJ();
            if (LJ != null) {
                str = LJ.getLayoutId();
            }
            C74995Tbz.LJIILJJIL(this, zoomLinkMicId, LJ(), C74995Tbz.LJIIIZ(this, zoomLinkMicId), 0);
            if (z) {
                InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
                if (LJJIIJZLJL != null) {
                    ((U8H) LJJIIJZLJL).A1(str, true);
                }
                if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                    C74979Tbj.LIZ.LJI(true);
                    return;
                }
                return;
            }
            return;
        }
        Layout LJ2 = LJ();
        if (LJ2 != null) {
            str = LJ2.getLayoutId();
        }
        C74995Tbz.LJIILLIIL(this, 0);
        if (!z) {
            return;
        }
        InterfaceC75579TlP LJJIIJZLJL2 = C77412UZs.LJJIIJZLJL();
        if (LJJIIJZLJL2 != null) {
            ((U8H) LJJIIJZLJL2).A1(str, true);
        }
        if (!LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
            return;
        }
        C74979Tbj.LIZ.LJI(false);
    }
}
