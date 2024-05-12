package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public final class BJM implements InterfaceC71013Rtx {
    public static final BJM LJLIL = new BJM();
    public static final InterfaceC71013Rtx LJLILLLLZI = ((ILoggerService) CN1.LIZ(ILoggerService.class)).Mf();

    public static C28246B6s LJIJI() {
        return (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
    }

    @Override // X.InterfaceC71013Rtx
    public final String LIZJ() {
        String LIZJ;
        InterfaceC71013Rtx interfaceC71013Rtx = LJLILLLLZI;
        if (interfaceC71013Rtx == null || (LIZJ = interfaceC71013Rtx.LIZJ()) == null) {
            return "";
        }
        return LIZJ;
    }

    public static String LIZLLL() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LJ) == null) {
            return "";
        }
        return str;
    }

    public static long LJ() {
        Long l;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI != null && (l = LJIJI.LIZJ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static String LJFF() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LIZIZ) == null) {
            return "";
        }
        return str;
    }

    public static long LJI() {
        BJL bjl;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI != null && (bjl = LJIJI.LJFF) != null) {
            return bjl.LJJIJL;
        }
        return 0L;
    }

    public static String LJII() {
        BJL bjl;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI != null && (bjl = LJIJI.LJFF) != null) {
            return bjl.LJJIJLIJ;
        }
        return null;
    }

    public static String LJIIIIZZ() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LIZ) == null) {
            return "";
        }
        return str;
    }

    public static String LJIIIZ() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LIZLLL) == null) {
            return "";
        }
        return str;
    }

    public static String LJIIJ() {
        BJE bje;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bje = LJIJI.LJ) == null || (str = bje.LIZ) == null) {
            return "";
        }
        return str;
    }

    public static String LJIIJJI() {
        Room room;
        String log_pb;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (room = LJIJI.LIZIZ) == null || (log_pb = room.getLog_pb()) == null) {
            return "";
        }
        return log_pb;
    }

    public static long LJIIL() {
        BJL bjl;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI != null && (bjl = LJIJI.LJFF) != null) {
            return bjl.LJJIIZ;
        }
        return 0L;
    }

    public static String LJIILIIL() {
        BJL bjl;
        String str;
        Room room;
        String requestId;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (room = LJIJI.LIZIZ) == null || (requestId = room.getRequestId()) == null) {
            C28246B6s LJIJI2 = LJIJI();
            if (LJIJI2 == null || (bjl = LJIJI2.LJFF) == null || (str = bjl.LJII) == null) {
                return "";
            }
            return str;
        }
        return requestId;
    }

    public static long LJIILJJIL() {
        Room room;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI != null && (room = LJIJI.LIZIZ) != null) {
            return room.getId();
        }
        return 0L;
    }

    public static String LJIILL() {
        Room room;
        String roomOrientation;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (room = LJIJI.LIZIZ) == null || (roomOrientation = room.getRoomOrientation()) == null) {
            return "";
        }
        return roomOrientation;
    }

    public static String LJIILLIIL() {
        BJE bje;
        Long l;
        String l2;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bje = LJIJI.LJ) == null || (l = bje.LIZLLL) == null || (l2 = l.toString()) == null) {
            return "";
        }
        return l2;
    }

    public static String LJIIZILJ() {
        BJL bjl;
        java.util.Map<String, String> map;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (map = bjl.LJJIL) == null || (str = map.get("source")) == null) {
            return "";
        }
        return str;
    }

    public static String LJIJ() {
        BJL bjl;
        java.util.Map<String, String> map;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (map = bjl.LJJIL) == null || (str = map.get("video_id")) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC71013Rtx
    public final String LIZ() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LJIIL) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC71013Rtx
    public final String LIZIZ() {
        BJL bjl;
        String str;
        C28246B6s LJIJI = LJIJI();
        if (LJIJI == null || (bjl = LJIJI.LJFF) == null || (str = bjl.LJIILIIL) == null) {
            return "";
        }
        return str;
    }
}
