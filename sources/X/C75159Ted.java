package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.model.AnchorClientList;
import com.bytedance.android.live.liveinteract.multilive.model.ChannelMessage;
import com.bytedance.android.live.liveinteract.multilive.model.GuestClientList;
import com.bytedance.android.live.liveinteract.multilive.model.LinkedUser;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.WaitUser;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableLinkmicMessageReporterSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ted, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75159Ted {
    public static final C75159Ted LIZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZIZ;
    public static long LIZJ;
    public static int LIZLLL;
    public static C73411SrX LJ;
    public static C73495Sst LJFF;
    public static final long LJI;
    public static final long LJII;
    public static boolean LJIIIIZZ;
    public static final C31657Cbd LJIIIZ;

    static {
        long j;
        TBT tbt = new TBT(C75159Ted.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
        LIZ = new C75159Ted();
        LIZJ = -1L;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        LJI = j;
        LJII = C025908h.LIZ();
        LJIIIZ = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        List<String> list;
        InterfaceC75973Trl interfaceC75973Trl;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        String str;
        List<LinkUser> list2;
        List<LinkUser> list3;
        List<LinkUser> list4;
        List<LinkUser> list5;
        int i;
        int i2;
        InterfaceC75441TjB R6;
        InterfaceC76652U6m LJZL;
        OnLineMicInfo LJII2;
        MicPositionInfo micPositionData;
        Integer valueOf;
        int intValue;
        long j;
        long j2;
        AbstractC74727TUl LIZ2;
        Long LJJIZ;
        AbstractC74727TUl LIZ3;
        LinkPlayerInfo LJJIJL;
        InterfaceC74695TTf LLIIJLIL;
        if (!EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            return;
        }
        LIZJ();
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq(null, null, null, null, null, 31, null);
        LIZ.getClass();
        reportLinkMessageReq.common = LJ();
        long j3 = LJI;
        long j4 = LJII;
        reportLinkMessageReq.mySelf = new Player(j3, j4);
        reportLinkMessageReq.channelMessage = LIZLLL(1);
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
            list = LLIIJLIL.LIZIZ();
        } else {
            list = null;
        }
        InterfaceC75441TjB R63 = C8E.LJ().R6();
        if (R63 != null) {
            interfaceC75973Trl = R63.LLIIJI();
        } else {
            interfaceC75973Trl = null;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (obj instanceof InterfaceC31805Ce1) {
            interfaceC31805Ce1 = (InterfaceC31805Ce1) obj;
        } else {
            interfaceC31805Ce1 = null;
        }
        if (interfaceC31805Ce1 != null && (LIZ3 = interfaceC31805Ce1.LIZ()) != null && (LJJIJL = C76917UGr.LJJIJL(LIZ3, j4)) != null) {
            str = LJJIJL.mInteractIdStr;
        } else {
            str = null;
        }
        arrayList.add(new WaitUser(j4, str));
        if (list != null) {
            for (String str2 : list) {
                if (interfaceC31805Ce1 != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJIZ = C76917UGr.LJJIZ(LIZ2, str2)) != null) {
                    j2 = LJJIZ.longValue();
                } else {
                    j2 = 0;
                }
                arrayList.add(new WaitUser(j2, str2));
            }
        }
        if (interfaceC75973Trl != null) {
            list2 = interfaceC75973Trl.LJJJ();
        } else {
            list2 = null;
        }
        CopyOnWriteArrayList LIZIZ2 = LIZIZ(list2);
        if (interfaceC75973Trl != null) {
            list3 = interfaceC75973Trl.K9();
        } else {
            list3 = null;
        }
        CopyOnWriteArrayList LIZIZ3 = LIZIZ(list3);
        if (interfaceC75973Trl != null) {
            list4 = interfaceC75973Trl.LJJIJIIJIL();
        } else {
            list4 = null;
        }
        CopyOnWriteArrayList LIZIZ4 = LIZIZ(list4);
        if (interfaceC75973Trl != null) {
            list5 = interfaceC75973Trl.LJJIIZI();
        } else {
            list5 = null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (list5 != null) {
            for (LinkUser linkUser : list5) {
                String linkMicId = linkUser.getLinkMicId();
                C75159Ted c75159Ted = LIZ;
                c75159Ted.getClass();
                C31657Cbd c31657Cbd = LJIIIZ;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LIZIZ;
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c31657Cbd.LIZ(c75159Ted, interfaceC74236TBoArr[0]);
                if (multiGuestDataHolder != null) {
                    i = o.LJ(multiGuestDataHolder.LIZJ(linkMicId), Boolean.FALSE);
                } else {
                    i = 0;
                }
                int i3 = i ^ 1;
                MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c31657Cbd.LIZ(c75159Ted, interfaceC74236TBoArr[0]);
                if (multiGuestDataHolder2 != null) {
                    i2 = o.LJ(multiGuestDataHolder2.LJIIJ(linkMicId), Boolean.FALSE);
                } else {
                    i2 = 0;
                }
                int i4 = i2 ^ 1;
                if (linkMicId != null && (R6 = C8E.LJ().R6()) != null && (LJZL = R6.LJZL()) != null && (LJII2 = LJZL.LJII(linkMicId)) != null && (micPositionData = LJII2.getMicPositionData()) != null && (valueOf = Integer.valueOf(micPositionData.getPosition())) != null && (intValue = valueOf.intValue()) != -1) {
                    Long userId = linkUser.getUserId();
                    if (userId != null) {
                        j = userId.longValue();
                    } else {
                        j = 0;
                    }
                    copyOnWriteArrayList.add(new LinkedUser(j, linkMicId, i3, i4, intValue));
                }
            }
        }
        if (true ^ LIZIZ4.isEmpty()) {
            Iterator it = LIZIZ4.iterator();
            while (it.hasNext()) {
                WaitUser waitUser = (WaitUser) it.next();
                Iterator it2 = LIZIZ2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((WaitUser) next).uid == waitUser.uid) {
                            if (next != null) {
                                LIZIZ2.remove(next);
                            }
                        }
                    }
                }
            }
        }
        reportLinkMessageReq.anchorClientList = new AnchorClientList(arrayList, LIZIZ2, LIZIZ3, LIZIZ4, copyOnWriteArrayList, null, 32, null);
        reportLinkMessageReq.guestClientList = null;
        C0NB.LIZIZ("MultiGuestV3ReportUtil", reportLinkMessageReq.toString());
        C65814PsI.LIZ().getClass();
        LJFF = (C73495Sst) T28.LIZLLL(((MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class)).reportLinkMsg(reportLinkMessageReq)).LJJII(C74655TRr.LJLIL, B8H.LJLIL);
    }

    public static void LIZJ() {
        if (EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            C73411SrX c73411SrX = LJ;
            if (c73411SrX == null) {
                if (LJFF == null) {
                    return;
                }
            } else {
                c73411SrX.dispose();
            }
            C73495Sst c73495Sst = LJFF;
            if (c73495Sst != null) {
                c73495Sst.dispose();
            }
            LJ = null;
            LJFF = null;
            C0NB.LIZIZ("MultiGuestV3ReportUtil", "disPose");
        }
    }

    public static LinkCommon LJ() {
        int i;
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, null, 31, null);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            i = R6.scene();
        } else {
            i = 0;
        }
        linkCommon.scene = i;
        linkCommon.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        linkCommon.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        linkCommon.extraMap = null;
        return linkCommon;
    }

    public static CopyOnWriteArrayList LIZIZ(List list) {
        long j;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LinkUser linkUser = (LinkUser) it.next();
                Long userId = linkUser.getUserId();
                if (userId != null) {
                    j = userId.longValue();
                } else {
                    j = 0;
                }
                copyOnWriteArrayList.add(new WaitUser(j, linkUser.getLinkMicId()));
            }
        }
        return copyOnWriteArrayList;
    }

    public static ChannelMessage LIZLLL(int i) {
        int i2;
        U8H LJJZZI;
        C74637TQz c74637TQz;
        long LJJJLIIL = C78886Uxe.LJJJLIIL(C8E.LJ());
        C29556Biq.LIZ().getClass();
        String strVal = C74983Tbn.LIZJ().getStrVal();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (c74637TQz = LJJZZI.LJIIL) != null) {
            i2 = c74637TQz.LJLIL;
        } else {
            i2 = 0;
        }
        return new ChannelMessage(LJJJLIIL, i, strVal, i2);
    }

    public static void LJFF(int i) {
        int i2;
        if (!EnableLinkmicMessageReporterSetting.INSTANCE.isReportV1()) {
            return;
        }
        LIZJ();
        LIZLLL = i;
        if (C74740TUy.LIZLLL().LJ()) {
            i2 = 3;
        } else if (LJIIIIZZ) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq(null, null, null, null, null, 31, null);
        LIZ.getClass();
        reportLinkMessageReq.common = LJ();
        long j = LJI;
        long j2 = LJII;
        reportLinkMessageReq.mySelf = new Player(j, j2);
        reportLinkMessageReq.channelMessage = LIZLLL(2);
        reportLinkMessageReq.anchorClientList = null;
        reportLinkMessageReq.guestClientList = new GuestClientList(j2, C78886Uxe.LJJJJLL(C8E.LJ()), i2, LIZLLL, 0, 16, null);
        C0NB.LIZIZ("MultiGuestV3ReportUtil", reportLinkMessageReq.toString());
        C65814PsI.LIZ().getClass();
        LJFF = (C73495Sst) T28.LIZLLL(((MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class)).reportLinkMsg(reportLinkMessageReq)).LJJII(C74654TRq.LJLIL, B8G.LJLIL);
    }
}
