package X;

import Y.AfS4S0010000_13;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TmY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75650TmY {
    public static DataChannel LIZIZ;
    public static C73411SrX LIZLLL;
    public static C73411SrX LJ;
    public static C73411SrX LJFF;
    public static long LJII;
    public static List<? extends ImageModel> LJIIIZ;
    public static TopicPairResponse.ResponseData.Setting LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static final C75650TmY LIZ = new C75650TmY();
    public static final C73318Sq2 LIZJ = new C73318Sq2();
    public static EnumC75673Tmv LJI = EnumC75673Tmv.IDLE;
    public static final List<InterfaceC75661Tmj> LJIIIIZZ = new ArrayList();
    public static final C75655Tmd LJIILJJIL = C75655Tmd.LJLIL;
    public static final C75679Tn1 LJIILL = C75679Tn1.LJLIL;
    public static final C75638TmM LJIILLIIL = C75638TmM.LJLIL;

    public static final boolean LIZIZ() {
        if (LJI == EnumC75673Tmv.LINKING) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ() {
        if (LJI == EnumC75673Tmv.WAITING) {
            return true;
        }
        return false;
    }

    public static final void LJ() {
        LIZ.LIZLLL();
        LJI = EnumC75673Tmv.IDLE;
        LJII = 0L;
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = 0L;
        LJIIL = 0L;
        LJIILIIL = 0L;
        C8E.LIZLLL().LJZI(C75607Tlr.class, LJIILJJIL);
        C8E.LIZLLL().LJZI(C75678Tn0.class, LJIILL);
        C8E.LIZLLL().LJZI(C75677Tmz.class, LJIILLIIL);
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkerStateChannel.class, EnumC75636TmK.DISABLED);
        }
    }

    public static final void LJFF() {
        OSZ<? extends EnumC75534Tkg, Long> osz;
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        while (it.hasNext()) {
            InterfaceC75661Tmj interfaceC75661Tmj = (InterfaceC75661Tmj) it.next();
            if (LJIIJJI >= 0) {
                osz = new OSZ<>(EnumC75534Tkg.COUNTDOWN_WAITING, Long.valueOf(LJIIJJI));
            } else {
                osz = new OSZ<>(EnumC75534Tkg.TIMEOUT_WAITING, Long.valueOf(LJIILIIL));
            }
            interfaceC75661Tmj.LIZ(osz);
            interfaceC75661Tmj.LIZJ(LJIILIIL);
        }
        long j = LJIIJJI;
        if (j >= 0) {
            LJIIJJI = j - 1;
        }
        LJIILIIL++;
    }

    public final void LIZLLL() {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        LIZJ.LIZLLL();
        C73411SrX c73411SrX = LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LIZLLL = null;
        C73411SrX c73411SrX2 = LJ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        LJ = null;
        C73411SrX c73411SrX3 = LJFF;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        LJ = null;
    }

    public static void LIZ(boolean z) {
        Room room;
        long j = 0;
        if (LJII == 0) {
            return;
        }
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start cancel pair, pairId=");
        V1I.LIZJ(LIZ2, LJII, ", isPairSuccess=", z);
        C0NB.LIZIZ("TopicPairManager", X1D.LIZIZ(LIZ2));
        C65814PsI.LIZ().getClass();
        LIZJ.LIZ(C1EW.LIZ(((CoHostApi) C65814PsI.LIZJ(CoHostApi.class)).pair(EnumC75660Tmi.ACTION_CANCEL.getValue(), 0L, j, LJII, C8E.LIZLLL().LLIILZL())).LJJJLIIL(new AfS4S0010000_13(z, 0), C75653Tmb.LJLIL));
    }

    public static void LJII(EnumC75673Tmv enumC75673Tmv) {
        LJI = enumC75673Tmv;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update State = ");
        LIZ2.append(enumC75673Tmv);
        C0NB.LIZIZ("TopicPairManager", X1D.LIZIZ(LIZ2));
    }

    public static final void LJI(DataChannel dataChannel, CohostTopic topic, C75647TmV c75647TmV) {
        long j;
        Room room;
        o.LJIIIZ(topic, "topic");
        LIZIZ = dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        long j2 = topic.id;
        if (j == 0 || j2 == 0) {
            LJ();
            return;
        }
        int i = 1;
        boolean z = false;
        if (LJI.compareTo(EnumC75673Tmv.IDLE) > 0) {
            return;
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).ta0()) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oo5));
            return;
        }
        C75633TmH.LJIIIIZZ = topic.id;
        C75633TmH.LJIIIZ = topic.totalHeat;
        C75633TmH.LJ = System.currentTimeMillis();
        if (c75647TmV != null) {
            z = c75647TmV.LJLIL;
        }
        C75633TmH.LJIILJJIL = z;
        if (c75647TmV != null) {
            i = c75647TmV.LJLILLLLZI;
        }
        C75633TmH.LJIILIIL = i;
        C75642TmQ.LIZ.LJJJJLI(new Room(), EnumC75645TmT.TOPIC_LINKMIC.getValue(), null, null, null, topic, c75647TmV);
        C0NB.LIZIZ("TopicPairManager", "start topic pair");
        LJII(EnumC75673Tmv.WAITING);
        C65814PsI.LIZ().getClass();
        LIZJ.LIZ(C1EW.LIZ(((CoHostApi) C65814PsI.LIZJ(CoHostApi.class)).pair(EnumC75660Tmi.ACTION_PAIR.getValue(), j2, j, 0L, C8E.LIZLLL().LLIILZL())).LJJJLIIL(C75651TmZ.LJLIL, C75652Tma.LJLIL));
    }
}
