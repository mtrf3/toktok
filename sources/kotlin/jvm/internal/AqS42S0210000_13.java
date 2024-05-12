package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B5G;
import X.B83;
import X.C15610jN;
import X.C29374Bfu;
import X.C31012CFc;
import X.C32014ChO;
import X.C76279Twh;
import X.C76662U6w;
import X.C76684U7s;
import X.C76800UCe;
import X.CR6;
import X.EnumC76319TxL;
import X.InterfaceC65784Pro;
import X.InterfaceC76675U7j;
import X.ORY;
import X.U4R;
import X.U7T;
import X.U7V;
import X.UA3;
import X.UC0;
import X.X1D;
import Y.ARunnableS12S0210000_13;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPermitAllowSourceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkLeaveWhenIdleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRechargePushMoreBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCohostP2PgroupchangeImTimestampCheckSetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;
import webcast.im.P2PGroupChangeContent;

/* loaded from: classes14.dex */
public class AqS42S0210000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS42S0210000_13 aqS42S0210000_13) {
        ((C76279Twh) aqS42S0210000_13.l0).LJJIIJ((EnumC76319TxL) aqS42S0210000_13.l1, null, aqS42S0210000_13.z2);
        B5G.LIZIZ().LJJJJL = ((EnumC76319TxL) aqS42S0210000_13.l1).getValue();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS42S0210000_13 aqS42S0210000_13) {
        List<GroupChannelUser> list;
        int i;
        List<LinkLayerListUser> list2;
        long j;
        Long l;
        List<GroupChannelUser> list3;
        Long l2;
        GroupChannelAllUser groupChannelAllUser;
        List<GroupChannelUser> list4;
        List<GroupChannelUser> list5;
        List<LinkLayerListUser> list6;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleP2PGroupChangeMessage dealing messageId=");
        LIZ.append(((CR6) ((IMessage) aqS42S0210000_13.l0)).getMessageId());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        Integer num = null;
        if (MtCohostP2PgroupchangeImTimestampCheckSetting.INSTANCE.getValue() && aqS42S0210000_13.z2) {
            long j2 = ((BaseMessage) ((IMessage) aqS42S0210000_13.l0)).baseMessage.createTime;
            U7T u7t = (U7T) aqS42S0210000_13.l1;
            if (j2 <= u7t.LJJLIIIJL) {
                U4R.LIZLLL("Linker", "current p2pGroupChangeMessage smaller than recent p2p group change message");
                ((U7T) aqS42S0210000_13.l1).LLLZLL("recharge_message_filter", null);
                return C76800UCe.LIZ;
            }
            u7t.LJJLIIIJL = j2;
        }
        IMessage iMessage = (IMessage) aqS42S0210000_13.l0;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
        P2PGroupChangeContent p2PGroupChangeContent = linkLayerMessage.p2pGroupChangeContent;
        if (p2PGroupChangeContent != null) {
            U7T linker = (U7T) aqS42S0210000_13.l1;
            boolean z = aqS42S0210000_13.z2;
            if (ORY.LJJIJIIJIL(linkLayerMessage.source, LinkMicPermitAllowSourceSetting.getValue())) {
                String LJJJJJ = U7T.LJJJJJ(6123);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("handleP2PGroupChangeMessage message.source is:");
                LIZ2.append(linkLayerMessage.source);
                LIZ2.append(", just return");
                C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ2));
            } else {
                GroupChannelAllUser groupChannelAllUser2 = p2PGroupChangeContent.groupUser;
                if (groupChannelAllUser2 != null && (list = groupChannelAllUser2.user) != null) {
                    long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                    linker.getClass();
                    Iterator<GroupChannelUser> it = list.iterator();
                    loop3: while (true) {
                        if (it.hasNext()) {
                            GroupChannelUser next = it.next();
                            AllListUser allListUser = next.allUser;
                            if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                                Iterator<LinkLayerListUser> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    Player player = it2.next().linkUser;
                                    if (player != null && player.uid == currentUserId) {
                                        i = next.status;
                                        break loop3;
                                    }
                                }
                            }
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    num = Integer.valueOf(i);
                }
                if (linker.LJIILJJIL.LIZ == 0 && num != null && num.intValue() == 3 && LinkMicSdkLeaveWhenIdleSetting.INSTANCE.getValue()) {
                    GroupChannelAllUser groupChannelAllUser3 = p2PGroupChangeContent.groupUser;
                    if (groupChannelAllUser3 != null) {
                        linker.LLZZJLIL(new C76684U7s(linker.LJIL, linker.LJIILIIL, linker.LJI, new BizLeaveJoinGroupParams(), "leave_with_finish_receive_linked"), Long.valueOf(groupChannelAllUser3.groupChannelId), 0L, true, null);
                    }
                }
            }
            GroupChannelAllUser groupChannelAllUser4 = p2PGroupChangeContent.groupUser;
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            long messageId = linkLayerMessage.getMessageId();
            GroupChannelAllUser groupChannelAllUser5 = p2PGroupChangeContent.groupUser;
            if (groupChannelAllUser5 != null) {
                j = groupChannelAllUser5.groupChannelId;
            } else {
                j = 0;
            }
            o.LJIIIZ(linker, "linker");
            UC0.LJJLIIIIJ(new UA3(linker, groupChannelAllUser4, LIZIZ, currentTimeMillis, messageId, j));
            Iterator<InterfaceC76675U7j> it3 = linker.LJIIIIZZ.iterator();
            while (it3.hasNext()) {
                InterfaceC76675U7j next2 = it3.next();
                GroupChannelAllUser groupChannelAllUser6 = p2PGroupChangeContent.groupUser;
                linkLayerMessage.getMessageId();
                next2.LJIIIIZZ(linker, groupChannelAllUser6, linkLayerMessage.baseMessage.createTime);
            }
            if (MtCoHostRechargePushMoreBugfixSetting.isEnable()) {
                if (linker.LJIIJJI.LJJIJIIJI() != null) {
                    Long LJJIJIIJI = linker.LJIIJJI.LJJIJIIJI();
                    GroupChannelAllUser groupChannelAllUser7 = p2PGroupChangeContent.groupUser;
                    if (groupChannelAllUser7 != null) {
                        l2 = Long.valueOf(groupChannelAllUser7.groupChannelId);
                    } else {
                        l2 = null;
                    }
                    if (o.LJ(LJJIJIIJI, l2) && (groupChannelAllUser = p2PGroupChangeContent.groupUser) != null && (list4 = groupChannelAllUser.user) != null) {
                        int i2 = 0;
                        for (GroupChannelUser groupChannelUser : list4) {
                            AllListUser allListUser2 = groupChannelUser.allUser;
                            if (allListUser2 != null && (list6 = allListUser2.linkedList) != null) {
                                Iterator<LinkLayerListUser> it4 = list6.iterator();
                                while (it4.hasNext()) {
                                    Player player2 = it4.next().linkUser;
                                    if (player2 != null && player2.uid == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                                        i2 = groupChannelUser.status;
                                    }
                                }
                            }
                        }
                        if (i2 == 3) {
                            C76662U6w LJJIZ = linker.LJJIZ();
                            LJJIZ.getClass();
                            U7V.LJIILJJIL(new AqS163S0100000_13(LJJIZ, 435));
                            GroupChannelAllUser groupChannelAllUser8 = p2PGroupChangeContent.groupUser;
                            if (groupChannelAllUser8 != null && (list5 = groupChannelAllUser8.user) != null) {
                                linker.LJJIJ(p2PGroupChangeContent.groupExtInfo, groupChannelAllUser8.groupChannelId, list5, linkLayerMessage.baseMessage.createTime);
                            }
                        }
                    }
                }
            } else if (linker.LJIIJJI.LJJIJIIJI() != null) {
                Long LJJIJIIJI2 = linker.LJIIJJI.LJJIJIIJI();
                GroupChannelAllUser groupChannelAllUser9 = p2PGroupChangeContent.groupUser;
                if (groupChannelAllUser9 != null) {
                    l = Long.valueOf(groupChannelAllUser9.groupChannelId);
                } else {
                    l = null;
                }
                if (o.LJ(LJJIJIIJI2, l)) {
                    C76662U6w LJJIZ2 = linker.LJJIZ();
                    LJJIZ2.getClass();
                    U7V.LJIILJJIL(new AqS163S0100000_13(LJJIZ2, 435));
                    GroupChannelAllUser groupChannelAllUser10 = p2PGroupChangeContent.groupUser;
                    if (groupChannelAllUser10 != null && (list3 = groupChannelAllUser10.user) != null) {
                        linker.LJJIJ(p2PGroupChangeContent.groupExtInfo, groupChannelAllUser10.groupChannelId, list3, linkLayerMessage.baseMessage.createTime);
                    }
                }
            }
            C15610jN.LIZ().post(new ARunnableS12S0210000_13(linker, iMessage, z, 1));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S0210000_13(C76279Twh c76279Twh, EnumC76319TxL enumC76319TxL, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76279Twh;
        this.l1 = enumC76319TxL;
        this.z2 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S0210000_13(U7T u7t, LinkLayerMessage linkLayerMessage, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = linkLayerMessage;
        this.z2 = z;
        this.l1 = u7t;
    }
}
