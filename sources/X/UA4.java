package X;

import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;

/* loaded from: classes14.dex */
public final class UA4 implements Runnable {
    public final /* synthetic */ List<Long> LJLIL;
    public final /* synthetic */ U66 LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ GroupChannelAllUser LJLJLJ;

    public UA4(List<Long> list, U66 u66, JSONObject jSONObject, long j, long j2, long j3, long j4, GroupChannelAllUser groupChannelAllUser) {
        this.LJLIL = list;
        this.LJLILLLLZI = u66;
        this.LJLJI = jSONObject;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = j4;
        this.LJLJLJ = groupChannelAllUser;
    }

    public final void LIZ() {
        List<GroupChannelUser> list;
        List<LinkLayerListUser> list2;
        Long l;
        Long l2;
        List<Long> list3 = this.LJLIL;
        if (list3 != null) {
            U66 u66 = this.LJLILLLLZI;
            JSONObject jSONObject = this.LJLJI;
            long j = this.LJLJJI;
            long j2 = this.LJLJJL;
            long j3 = this.LJLJJLL;
            long j4 = this.LJLJL;
            GroupChannelAllUser groupChannelAllUser = this.LJLJLJ;
            Iterator<Long> it = list3.iterator();
            while (it.hasNext()) {
                UAS LIZJ = UA9.LIZLLL().LIZJ(u66, String.valueOf(it.next().longValue()), null);
                if (LIZJ != null) {
                    C76786UBq LJ = UA9.LJ();
                    UC0.LJJLIIIJJI(jSONObject, LIZJ);
                    JSONObject LJIIZILJ = UC0.LJIIZILJ(4, 0L, "");
                    LJIIZILJ.put("msg_id", j3);
                    LJIIZILJ.put("group_channel_id", j4);
                    ArrayList arrayList = new ArrayList();
                    if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
                        for (GroupChannelUser groupChannelUser : list) {
                            AllListUser allListUser = groupChannelUser.allUser;
                            if (allListUser != null && (list2 = allListUser.linkedList) != null) {
                                for (LinkLayerListUser linkLayerListUser : list2) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    Player player = linkLayerListUser.linkUser;
                                    if (player != null) {
                                        l = Long.valueOf(player.uid);
                                    } else {
                                        l = null;
                                    }
                                    linkedHashMap.put("uid", String.valueOf(l));
                                    Player player2 = linkLayerListUser.linkUser;
                                    if (player2 != null) {
                                        l2 = Long.valueOf(player2.roomId);
                                    } else {
                                        l2 = null;
                                    }
                                    linkedHashMap.put("rid", String.valueOf(l2));
                                    linkedHashMap.put("cid", String.valueOf(groupChannelUser.channelId));
                                    linkedHashMap.put("lid", linkLayerListUser.linkMicId);
                                    linkedHashMap.put("s", String.valueOf(groupChannelUser.status));
                                    arrayList.add(linkedHashMap);
                                }
                            }
                        }
                    }
                    LJIIZILJ.put("users", C46104I7o.LJJJJZ(arrayList));
                    C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "p2p_group_message", LJIIZILJ, j, j2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
