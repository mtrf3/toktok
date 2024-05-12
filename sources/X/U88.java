package X;

import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelUser;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class U88 extends AbstractC65781Prl implements InterfaceC88472Yns<GroupChannelUser, CharSequence> {
    public static final U88 LJLIL = new U88();

    public U88() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(GroupChannelUser groupChannelUser) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        GroupChannelUser groupChannelUser2 = groupChannelUser;
        o.LJIIIZ(groupChannelUser2, "groupChannelUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[GroupChannelUser: channelId=");
        LIZ.append(groupChannelUser2.channelId);
        LIZ.append(" status=");
        LIZ.append(groupChannelUser2.status);
        LIZ.append(" type=");
        LIZ.append(groupChannelUser2.type);
        LIZ.append(" joinTime=");
        LIZ.append(groupChannelUser2.joinTime);
        LIZ.append(" linkedTime=");
        LIZ.append(groupChannelUser2.linkedTime);
        LIZ.append(" ownerUser=");
        GroupPlayer groupPlayer = groupChannelUser2.ownerUser;
        String str6 = null;
        if (groupPlayer != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[GroupPlayer: channelId=");
            LIZ2.append(groupPlayer.channelId);
            LIZ2.append(" user=");
            Player player = groupPlayer.user;
            if (player != null) {
                str5 = C78248UnM.LJIILLIIL(player);
            } else {
                str5 = null;
            }
            str = q.LIZIZ(LIZ2, str5, ']', LIZ2);
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" allUser=");
        AllListUser allListUser = groupChannelUser2.allUser;
        if (allListUser != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[AllListUser: linkedList=");
            List<LinkLayerListUser> list = allListUser.linkedList;
            if (list != null) {
                str2 = ORZ.LLD(list, ",", null, null, C76769UAz.LJLIL, 30);
            } else {
                str2 = null;
            }
            LIZ3.append(str2);
            LIZ3.append(" appliedList=");
            List<LinkLayerListUser> list2 = allListUser.appliedList;
            if (list2 != null) {
                str3 = ORZ.LLD(list2, ",", null, null, UB0.LJLIL, 30);
            } else {
                str3 = null;
            }
            LIZ3.append(str3);
            LIZ3.append(" invitedList=");
            List<LinkLayerListUser> list3 = allListUser.invitedList;
            if (list3 != null) {
                str4 = ORZ.LLD(list3, ",", null, null, UB1.LJLIL, 30);
            } else {
                str4 = null;
            }
            LIZ3.append(str4);
            LIZ3.append(" readyList=");
            List<LinkLayerListUser> list4 = allListUser.readyList;
            if (list4 != null) {
                str6 = ORZ.LLD(list4, ",", null, null, UB2.LJLIL, 30);
            }
            str6 = q.LIZIZ(LIZ3, str6, ']', LIZ3);
        }
        return q.LIZIZ(LIZ, str6, ']', LIZ);
    }
}
