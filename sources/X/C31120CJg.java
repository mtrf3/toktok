package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.CJg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31120CJg {
    public static final IInteractService LIZ;
    public static final IGameLinkMicService LIZIZ;

    static {
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IInteractService.class);
        o.LJIIIIZZ(LIZ2, "getService(IInteractService::class.java)");
        LIZ = (IInteractService) LIZ2;
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IGameLinkMicService.class);
        o.LJIIIIZZ(LIZ3, "getService(IGameLinkMicService::class.java)");
        LIZIZ = (IGameLinkMicService) LIZ3;
    }

    public static long LIZ() {
        return LIZ.eq();
    }

    public static String LIZIZ() {
        String connectionType = LIZ.getConnectionType();
        o.LJIIIIZZ(connectionType, "interactService.connectionType");
        return connectionType;
    }

    public static EnumC31121CJh LJ() {
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            return EnumC31121CJh.LINE_UP;
        }
        if (o.LJ(LIZIZ(), "manual_pk")) {
            return EnumC31121CJh.LINK_MIC_PK;
        }
        if (LIZLLL((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) > 0) {
            return EnumC31121CJh.LINK_MIC_GUEST;
        }
        if (LIZ.OB()) {
            return EnumC31121CJh.LINK_MIC_ANCHOR;
        }
        return EnumC31121CJh.NORMAL_VIDEO;
    }

    public static java.util.Map LJFF() {
        return LIZ.L00();
    }

    public static String LJI() {
        if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            return "program_live";
        }
        if (CN1.LIZ(IMicRoomService.class) != null && ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            return "video_anchor_order";
        }
        IInteractService iInteractService = LIZ;
        if (iInteractService.Qe0()) {
            return "video_anchor_pk";
        }
        if (iInteractService.OB()) {
            return "video_anchor_connect";
        }
        if (iInteractService.ta0()) {
            return "video_anchor_guest_connect";
        }
        return "normal_video_live";
    }

    public static boolean LJIIIIZZ() {
        return LIZ.yA();
    }

    public static boolean LJIIIZ() {
        return LIZ.Qe0();
    }

    public static boolean LJIIJ() {
        return LIZ.Wy();
    }

    public static long LJIIJJI() {
        return LIZ.hV();
    }

    public static int LIZLLL(Room room) {
        LiveMode liveMode;
        Long l = null;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.LIVE_STUDIO) {
            IGameLinkMicService iGameLinkMicService = LIZIZ;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            return iGameLinkMicService.Yh0(String.valueOf(l));
        }
        return LIZ.Yu0();
    }

    public static String LJII(User user) {
        String Ng = LIZ.Ng(user);
        o.LJIIIIZZ(Ng, "interactService.getUserRole(currentUserOpt)");
        return Ng;
    }

    public static int LIZJ(User user, Room room) {
        LiveMode liveMode;
        Long l = null;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.LIVE_STUDIO) {
            IGameLinkMicService iGameLinkMicService = LIZIZ;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            return iGameLinkMicService.US(user, String.valueOf(l));
        }
        return LIZ.Wd(user);
    }
}
