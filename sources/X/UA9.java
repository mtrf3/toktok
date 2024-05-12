package X;

import Y.ARunnableS0S0310200_13;
import Y.ARunnableS0S1300200_13;
import Y.ARunnableS0S1310200_13;
import Y.ARunnableS0S1310300_13;
import Y.ARunnableS0S3200300_13;
import Y.ARunnableS0S3210200_13;
import Y.ARunnableS0S3300000_13;
import Y.ARunnableS0S4200300_13;
import Y.ARunnableS0S4201300_13;
import Y.ARunnableS0S4210200_13;
import Y.ARunnableS12S1200000_13;
import Y.ARunnableS1S0300200_13;
import Y.ARunnableS1S2210200_13;
import Y.ARunnableS2S1101100_13;
import Y.ARunnableS2S3100000_13;
import Y.ARunnableS49S0100000_13;
import android.os.Handler;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import com.ss.avframework.livestreamv2.core.interact.Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class UA9 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(UB8.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(UB7.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(UB6.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(UBF.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C76761UAr.LJLIL);

    public static C76762UAs LIZJ() {
        return (C76762UAs) LJ.getValue();
    }

    public static UAO LIZLLL() {
        return (UAO) LIZIZ.getValue();
    }

    public static C76786UBq LJ() {
        return (C76786UBq) LIZ.getValue();
    }

    public static C76765UAv LJFF() {
        return (C76765UAv) LIZLLL.getValue();
    }

    public static List LIZIZ(List list) {
        List<LinkLayerListUser> list2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AllListUser allListUser = ((GroupChannelUser) it.next()).allUser;
                if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                    Iterator<LinkLayerListUser> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Player player = it2.next().linkUser;
                        if (player != null) {
                            arrayList.add(Long.valueOf(player.uid));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void LJJJI(UAS uas) {
        C76765UAv LJFF = LJFF();
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(uas, 264);
        Handler LIZ2 = LJFF.LIZ();
        if (LIZ2 != null) {
            LIZ2.postDelayed(new ARunnableS49S0100000_13(aRunnableS49S0100000_13, 266), 600000L);
        }
    }

    public static void LJJIIJZLJL(U66 u66, boolean z) {
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        JSONObject LJIJI = UC0.LJIJI(u66);
        LIZJ2.LIZLLL.LIZIZ(new ARunnableS0S0310200_13(LIZJ2, u66, C31012CFc.LIZIZ(), System.currentTimeMillis(), LJIJI, z, 1));
    }

    public static void LJJIZ(U66 u66, String source) {
        o.LJIIIZ(source, "source");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(u66, LIZJ2, source, 8));
    }

    public static void LIZ(U66 u66, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("abortOtherSameLinkMicIdRecord, sequentialRecordId=");
        LIZ2.append(str);
        LIZ2.append(", linkMicIdInSequentialRecordId=");
        LIZ2.append(str2);
        U4R.LIZ("LinkLayerMonitor", X1D.LIZIZ(LIZ2));
        List<UAS> LIZLLL2 = LIZLLL().LIZLLL(u66);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZLLL2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            UAS uas = (UAS) next;
            if (o.LJ(uas.LJIIL.get(), u66) && !o.LJ(uas.LIZIZ(), str) && o.LJ(uas.LIZ(), str2)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            UAS uas2 = (UAS) it2.next();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("abortOtherSameLinkMicIdRecord, abortSequentialRecordId=");
            LIZ3.append(uas2.LIZIZ());
            LIZ3.append(", abortLinkMicIdInSequentialRecordId=");
            LIZ3.append(uas2.LIZ());
            U4R.LIZ("LinkLayerMonitor", X1D.LIZIZ(LIZ3));
            JSONObject LJIJI = UC0.LJIJI(u66);
            long LIZIZ2 = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76786UBq LJ2 = LJ();
            UC0.LJJLIIIJJI(LJIJI, uas2);
            C77119UOl.LJJIFFI(LJ2, uas2, LJIJI, "reenter_abort", UC0.LJIIZILJ(7, null, null), LIZIZ2, currentTimeMillis);
            C77119UOl.LJJ(LJ2, uas2, 2);
            LIZLLL().LJFF(uas2.LIZIZ());
        }
    }

    public static void LJIIIZ(U66 linker, String str, String str2, String str3) {
        o.LJIIIZ(linker, "linker");
        UC0.LJJLIIIIJ(new ARunnableS2S3100000_13(linker, str2, str3, str, 0));
    }

    public static void LJIJJLI(U66 linker, String str, String inviteeUserId, String inviteeRoomId) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUserId, "inviteeUserId");
        o.LJIIIZ(inviteeRoomId, "inviteeRoomId");
        UC0.LJJLIIIIJ(new ARunnableS2S3100000_13(linker, inviteeUserId, inviteeRoomId, str, 1));
    }

    public static void LJJIJLIJ(U66 linker, String str, int i, long j) {
        o.LJIIIZ(linker, "linker");
        UC0.LJJLIIIIJ(new ARunnableS2S1101100_13(linker, str, i, j, 1));
    }

    public static void LJJIL(U66 u66, List forwardingRoomList, long j, long j2) {
        o.LJIIIZ(forwardingRoomList, "forwardingRoomList");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS1S0300200_13(u66, (U66) LIZJ2, (C76762UAs) j, j2, (long) forwardingRoomList, (List<? extends Client.ForwardRoomInfo>) 6));
    }

    public static void LJIIJ(U66 linker, String str, String source, Boolean bool, String str2) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S3300000_13(linker, LIZJ2, str, source, bool, str2, 1));
    }

    public static void LJIILL(U7T linker, OSZ osz, String str, long j, long j2) {
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S1300200_13(linker, str, LIZJ2, j, j2, osz, 5));
    }

    public static /* synthetic */ void LJJIJIIJI(U66 u66, String str, String str2, int i, long j) {
        LJJIJ(u66, str, str2, i, j, false, "");
    }

    public static void LJJJ(U66 linker, String str, String source, Boolean bool, String str2) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S3300000_13(linker, LIZJ2, str, source, bool, str2, 0));
    }

    public static void LJIIIIZZ(U66 u66, String str, String applicantUserId, String applicantRoomId, String str2, long j) {
        o.LJIIIZ(applicantUserId, "applicantUserId");
        o.LJIIIZ(applicantRoomId, "applicantRoomId");
        UC0.LJJLIIIIJ(new RunnableC76751UAh(u66, applicantUserId, applicantRoomId, str2, str, j));
    }

    public static void LJIILLIIL(U7T linker, boolean z, OSZ osz, String str, long j, long j2) {
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S1310200_13(linker, LIZJ2, j, j2, osz, str, z, 2));
    }

    public static void LJJIJIIJIL(U7T linker, long j, long j2, OSZ osz, String str, String source) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new RunnableC76756UAm(linker, LIZJ2, osz, str, j, j2, source));
    }

    public static void LJIIJJI(long j, long j2, U6D linker, String remoteUserId, String str, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        UC0.LJJLIIIIJ(new ARunnableS1S2210200_13(j2, j, linker, remoteUserId, str, osz, z, 1));
    }

    public static void LJIILIIL(long j, long j2, U6D linker, String inviteeUserId, String str, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUserId, "inviteeUserId");
        UC0.LJJLIIIIJ(new ARunnableS1S2210200_13(j2, j, linker, inviteeUserId, str, osz, z, 0));
    }

    public static void LJIIZILJ(long j, long j2, U7T linker, String str, String str2, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new UAM(linker, LIZJ2, j, j2, osz, str, str2, z));
    }

    public static void LJIL(U7T linker, boolean z, OSZ osz, String str, long j, long j2, long j3) {
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S1310300_13(linker, LIZJ2, j2, j3, osz, str, z, j, 0));
    }

    public static void LJJII(U6D linker, OSZ osz, String str, long j, long j2, String leaveSource, int i) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(leaveSource, "leaveSource");
        C76762UAs LIZJ2 = LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new UAL(linker, LIZJ2, j, j2, osz, str, leaveSource, i));
    }

    public static void LJJIJ(U66 u66, String handlerUserId, String str, int i, long j, boolean z, String operatorUid) {
        o.LJIIIZ(handlerUserId, "handlerUserId");
        o.LJIIIZ(operatorUid, "operatorUid");
        UC0.LJJLIIIIJ(new RunnableC76746UAc(u66, handlerUserId, str, i, j, z, operatorUid));
    }

    public static void LJIIL(long j, long j2, long j3, U7T linker, String str, String str2, String source, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S4200300_13(j, j3, j2, linker, str2, source, str, osz, 3));
    }

    public static void LJIILJJIL(long j, long j2, long j3, U7T linker, String str, String str2, String source, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S4200300_13(j, j3, j2, linker, str2, source, str, osz, 0));
    }

    public static void LJIJI(long j, long j2, long j3, U7T linker, String str, String str2, String str3, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        UC0.LJJLIIIIJ(new ARunnableS0S3200300_13(j, j3, j2, linker, str3, str, str2, osz, 1));
    }

    public static void LJJ(long j, long j2, U7T linker, String inviterUserId, String str, String str2, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviterUserId, "inviterUserId");
        UC0.LJJLIIIIJ(new ARunnableS0S3210200_13(j2, j, linker, inviterUserId, str, str2, osz, z, 0));
    }

    public static void LJJI(long j, long j2, U7T linker, String str, String str2, String kickOutAllReason, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(kickOutAllReason, "kickOutAllReason");
        UC0.LJJLIIIIJ(new ARunnableS0S3210200_13(j2, j, linker, str, str2, kickOutAllReason, osz, z, 1));
    }

    public static void LJJIFFI(long j, long j2, U6D linker, String remoteLinkMicId, String str, String kickOutReason, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteLinkMicId, "remoteLinkMicId");
        o.LJIIIZ(kickOutReason, "kickOutReason");
        UC0.LJJLIIIIJ(new ARunnableS0S3210200_13(j2, j, linker, remoteLinkMicId, str, kickOutReason, osz, z, 2));
    }

    public static void LJJIIJ(U7F linker, List list, List list2, boolean z, OSZ osz, String str, long j, long j2) {
        o.LJIIIZ(linker, "linker");
        LJFF().LIZIZ(new UAA(list, list2, linker, j2, j, str, osz, UC0.LJIJI(linker), z, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())));
    }

    public static void LJJIJIL(int i, long j, long j2, U6D linker, String remoteUserId, String str, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        UC0.LJJLIIIIJ(new RunnableC76755UAl(i, j2, j, linker, remoteUserId, str, osz, z));
    }

    public static void LJI(long j, long j2, U6D linker, String remoteUserId, String str, String str2, String str3, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        UC0.LJJLIIIIJ(new ARunnableS0S4210200_13(j2, j, linker, remoteUserId, str, str2, str3, osz, z, 2));
    }

    public static void LJII(long j, long j2, long j3, U7T linker, String str, String str2, String str3, String source, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S4200300_13(j, j3, j2, linker, str3, str, str2, source, osz, 2));
    }

    public static void LJIJ(long j, long j2, U6D linker, String inviteeUserId, String str, String str2, String str3, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(inviteeUserId, "inviteeUserId");
        UC0.LJJLIIIIJ(new ARunnableS0S4210200_13(j2, j, linker, inviteeUserId, str, str2, str3, osz, z, 0));
    }

    public static void LJIJJ(U66 linker, String str, String str2, String str3, String str4, String str5, long j, boolean z, String operatorUid) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(operatorUid, "operatorUid");
        UC0.LJJLIIIIJ(new RunnableC76752UAi(linker, str2, str3, str4, str5, str, j, z, operatorUid));
    }

    public static void LJJIIZ(int i, long j, long j2, U6D linker, String applicantLinkMicId, String str, String str2, OSZ osz, boolean z) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(applicantLinkMicId, "applicantLinkMicId");
        UC0.LJJLIIIIJ(new RunnableC76754UAk(i, j2, j, linker, applicantLinkMicId, str, str2, osz, z));
    }

    public static void LJJIII(long j, long j2, long j3, long j4, long j5, U7T linker, String str, String leaveReason, java.util.Map groupChannelMap, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(groupChannelMap, "groupChannelMap");
        o.LJIIIZ(leaveReason, "leaveReason");
        UC0.LJJLIIIIJ(new UAW(j, j2, j5, j4, j3, linker, str, leaveReason, groupChannelMap, osz));
    }

    public static void LJJIIZI(int i, long j, long j2, long j3, U7T linker, String str, String str2, String str3, String source, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S4201300_13(i, j, j3, j2, linker, str3, source, str, str2, osz, 0));
    }

    public static void LJJIJL(int i, long j, long j2, long j3, U7T linker, String str, String str2, String str3, String source, OSZ osz) {
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S4201300_13(i, j, j3, j2, linker, str3, source, str, str2, osz, 1));
    }
}
