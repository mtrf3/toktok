package X;

import android.util.ArrayMap;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tj3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75433Tj3 extends C31413CUn {
    public final MultiGuestGiftSwitchTargetDialog LJLJI;
    public final User LJLJJI;
    public final List<LinkListUser> LJLJJL;
    public final DataChannel LJLJJLL;
    public final boolean LJLJL;
    public final String LJLJLJ;
    public int LJLJLLL;

    public final void LJZI(LinkListUser linkListUser) {
        DataChannel dataChannel;
        Room room;
        Long valueOf;
        java.util.Map<Long, Long> map;
        o.LJIIIZ(linkListUser, "linkListUser");
        if (this.LJLJL && (dataChannel = this.LJLJJLL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (valueOf = Long.valueOf(room.getId())) != null) {
            long longValue = valueOf.longValue();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
            User user = linkListUser.user;
            if (user != null) {
                long id = user.getId();
                if (multiGuestDataHolder != null && (map = multiGuestDataHolder.LJIIZILJ) != null) {
                    ((ArrayMap) map).put(Long.valueOf(longValue), Long.valueOf(id));
                }
            }
        }
    }

    public C75433Tj3(MultiGuestGiftSwitchTargetDialog switchDialog, User user, List<LinkListUser> giftUserList, DataChannel dataChannel, boolean z, String str) {
        Long l;
        o.LJIIIZ(switchDialog, "switchDialog");
        o.LJIIIZ(giftUserList, "giftUserList");
        this.LJLJI = switchDialog;
        this.LJLJJI = user;
        this.LJLJJL = giftUserList;
        this.LJLJJLL = dataChannel;
        this.LJLJL = z;
        this.LJLJLJ = str;
        Iterator<LinkListUser> it = giftUserList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LinkListUser next = it.next();
            if (next instanceof LinkListUser) {
                User user2 = next.user;
                if (user2 != null) {
                    l = Long.valueOf(user2.getId());
                } else {
                    l = null;
                }
                User user3 = this.LJLJJI;
                if (o.LJ(l, user3 != null ? Long.valueOf(user3.getId()) : null)) {
                    if (i2 != -1) {
                        i = i2;
                    }
                }
            }
            i2++;
        }
        this.LJLJLLL = i;
    }
}
