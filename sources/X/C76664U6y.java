package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* renamed from: X.U6y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76664U6y<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C76662U6w LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public C76664U6y(String str, boolean z, C76662U6w c76662U6w, long j, long j2, long j3) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = c76662U6w;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        LinkUser linkUser;
        long j;
        long j2;
        long j3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Trigger timeout linkmicId = ");
        LIZ.append(this.LJLIL);
        U4R.LIZLLL("NoFirstFrameTimeoutManager", X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI) {
            Iterator<LinkUser> it = this.LJLJI.LIZ.LJIIJJI.LJJIIZI().iterator();
            while (true) {
                if (it.hasNext()) {
                    linkUser = it.next();
                    Long userId = linkUser.getUserId();
                    long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                    if (userId != null && userId.longValue() == currentUserId) {
                        break;
                    }
                } else {
                    linkUser = null;
                    break;
                }
            }
            LinkUser linkUser2 = linkUser;
            if (linkUser2 != null) {
                C76662U6w c76662U6w = this.LJLJI;
                String str = this.LJLIL;
                U7T u7t = c76662U6w.LIZ;
                u7t.LJJIII.LJIIJ(str, u7t, true, -1L, -1L, "");
                U7T u7t2 = c76662U6w.LIZ;
                Long roomId = linkUser2.getRoomId();
                if (roomId != null) {
                    j = roomId.longValue();
                } else {
                    j = 0;
                }
                Long userId2 = linkUser2.getUserId();
                if (userId2 != null) {
                    j2 = userId2.longValue();
                } else {
                    j2 = 0;
                }
                Long channelId = linkUser2.getChannelId();
                if (channelId != null) {
                    j3 = channelId.longValue();
                } else {
                    j3 = 0;
                }
                u7t2.LLZZJLIL(new C76684U7s(j, j2, j3, new BizLeaveJoinGroupParams(), "kick_out_if_no_first_frame_came"), null, 0L, false, null);
                return;
            }
            return;
        }
        U7T u7t3 = this.LJLJI.LIZ;
        u7t3.LJJIII.LJIIJ(this.LJLIL, u7t3, true, -1L, -1L, "");
        this.LJLJI.LIZ.LLZZJLIL(new C76684U7s(this.LJLJJI, this.LJLJJL, this.LJLJJLL, new BizLeaveJoinGroupParams(), "kick_out_if_no_first_frame_came"), null, 0L, false, null);
    }
}
