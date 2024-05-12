package Y;

import X.C05490Jl;
import X.C0NB;
import X.C10V;
import X.C28557BIr;
import X.C29075Bb5;
import X.C29432Bgq;
import X.C29869Bnt;
import X.C29929Bor;
import X.C29930Bos;
import X.C29935Box;
import X.C30922CBq;
import X.C31319CQx;
import X.C65767PrX;
import X.C7N;
import X.EnumC31814CeA;
import X.InterfaceC29937Boz;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDaS216S0100000_5 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    public static final void run$6(IDaS216S0100000_5 iDaS216S0100000_5) {
        ((LiveIllegalPresenter) iDaS216S0100000_5.l0).lambda$onMessage$0();
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS216S0100000_5 iDaS216S0100000_5) {
        CoHostUserCardCell coHostUserCardCell = (CoHostUserCardCell) iDaS216S0100000_5.l0;
        SystemClock.uptimeMillis();
        coHostUserCardCell.getClass();
    }

    public static final void run$1(IDaS216S0100000_5 iDaS216S0100000_5) {
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationFragmentTag", "on go live countdown completed");
        }
        ((GamePreparationFragment) iDaS216S0100000_5.l0).wl(0L);
        ((GamePreparationFragment) iDaS216S0100000_5.l0).Hl("start_stream");
        C10V c10v = ((GamePreparationFragment) iDaS216S0100000_5.l0).LJLLL;
        if (c10v != null) {
            c10v.Ba(null, false);
        } else {
            o.LJIJI("gameBroadcastFragment");
            throw null;
        }
    }

    public static final void run$2(IDaS216S0100000_5 iDaS216S0100000_5) {
        C10V c10v = ((GamePreparationFragment) iDaS216S0100000_5.l0).LJLLL;
        if (c10v != null) {
            c10v.c6(false);
        } else {
            o.LJIJI("gameBroadcastFragment");
            throw null;
        }
    }

    public static final void run$3(IDaS216S0100000_5 iDaS216S0100000_5) {
        ((EnumC31814CeA) iDaS216S0100000_5.l0).LJLJI = false;
    }

    public static final void run$4(IDaS216S0100000_5 iDaS216S0100000_5) {
        C28557BIr.LIZ().LIZ(Long.valueOf(((C05490Jl) iDaS216S0100000_5.l0).LIZ));
    }

    public static final void run$5(IDaS216S0100000_5 iDaS216S0100000_5) {
        C29935Box c29935Box = (C29935Box) iDaS216S0100000_5.l0;
        Context context = c29935Box.LIZLLL;
        if (context != null) {
            Room room = c29935Box.LIZ;
            C29929Bor LIZLLL = C29075Bb5.LIZLLL(room, c29935Box.LJ, C29075Bb5.LIZIZ(room.getOwner()), "live_room_long_press", null);
            boolean z = false;
            LIZLLL.LJJIII = false;
            LIZLLL.LJJIIJ = false;
            Room room2 = c29935Box.LIZ;
            if (room2.liveSubOnly == 1) {
                z = true;
            }
            LIZLLL.LJJIIJZLJL = z;
            LIZLLL.LJIJI = room2.getOwner().getSecUid();
            C65767PrX copyOf = C65767PrX.copyOf((List) c29935Box.LJI.LIZ);
            o.LJIIIIZZ(copyOf, "copyOf(topRankUsers)");
            if (!copyOf.isEmpty()) {
                ((ArrayList) LIZLLL.LJJIIZI).addAll(copyOf);
            }
            C65767PrX copyOf2 = C65767PrX.copyOf((List) c29935Box.LJI.LIZIZ);
            o.LJIIIIZZ(copyOf2, "copyOf(recentlySharedUsers)");
            if (!copyOf2.isEmpty()) {
                ((ArrayList) LIZLLL.LJJIJ).addAll(copyOf2);
            }
            Object value = C7N.LJJIIJ.getValue();
            o.LJIIIIZZ(value, "<get-userManagerService>(...)");
            LIZLLL.LJJIJIL = ((IUserManageService) value).Ab0();
            C29930Bos c29930Bos = new C29930Bos(LIZLLL);
            c29935Box.LJFF = C7N.LJIJI().Je0(context, true, c29935Box.LIZ, c29930Bos, null, new C29869Bnt(c29935Box, c29930Bos));
        }
    }

    public static final void run$7(IDaS216S0100000_5 iDaS216S0100000_5) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) iDaS216S0100000_5.l0;
        C31319CQx c31319CQx = publicScreenWidget.LJLLI;
        if (c31319CQx != null) {
            c31319CQx.LJLJJL = "";
        }
        publicScreenWidget.ff0();
    }

    public static final void run$8(IDaS216S0100000_5 iDaS216S0100000_5) {
        ((C29432Bgq) iDaS216S0100000_5.l0).LJLJI = false;
    }

    public IDaS216S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
