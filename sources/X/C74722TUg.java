package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TUg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74722TUg implements TUI {
    public final /* synthetic */ C74723TUh LJLIL;

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public C74722TUg(C74723TUh c74723TUh) {
        this.LJLIL = c74723TUh;
    }

    @Override // X.TUI
    public final void V(TZX provider) {
        Long l;
        long j;
        o.LJIIIZ(provider, "provider");
        C74723TUh c74723TUh = this.LJLIL;
        if (!c74723TUh.LJLIL) {
            List<AbstractC74724TUi> LIZIZ = c74723TUh.LIZIZ();
            C74723TUh c74723TUh2 = this.LJLIL;
            for (AbstractC74724TUi abstractC74724TUi : LIZIZ) {
                c74723TUh2.getClass();
                for (LinkListUser linkListUser : provider.LIZ()) {
                    if (o.LJ(abstractC74724TUi.LIZLLL(), linkListUser.linkMicId)) {
                        java.util.Map<Long, Long> map = c74723TUh2.LJLJJL;
                        User user = linkListUser.user;
                        Long l2 = null;
                        if (user != null) {
                            l = Long.valueOf(user.getId());
                        } else {
                            l = null;
                        }
                        Long l3 = (Long) ((LinkedHashMap) map).get(l);
                        if (l3 != null) {
                            j = l3.longValue();
                        } else {
                            j = 0;
                        }
                        long j2 = linkListUser.fanTicket;
                        if (j > 0 && j2 != 0 && j > j2) {
                            linkListUser.fanTicket = j;
                            java.util.Map<Long, Long> map2 = c74723TUh2.LJLJJL;
                            User user2 = linkListUser.user;
                            if (user2 != null) {
                                l2 = Long.valueOf(user2.getId());
                            }
                            C65777Prh.LIZJ(map2).remove(l2);
                        }
                        abstractC74724TUi.LJIIIIZZ(TV3.LIZ(linkListUser));
                    }
                }
            }
        }
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        Long l;
        long j;
        o.LJIIIZ(provider, "provider");
        List<AbstractC74724TUi> LIZIZ = this.LJLIL.LIZIZ();
        C74723TUh c74723TUh = this.LJLIL;
        for (AbstractC74724TUi abstractC74724TUi : LIZIZ) {
            c74723TUh.getClass();
            for (LinkPlayerInfo linkPlayerInfo : provider.LIZ()) {
                if (o.LJ(abstractC74724TUi.LIZLLL(), linkPlayerInfo.mInteractIdStr)) {
                    java.util.Map<Long, Long> map = c74723TUh.LJLJJL;
                    User user = linkPlayerInfo.mUser;
                    Long l2 = null;
                    if (user != null) {
                        l = Long.valueOf(user.getId());
                    } else {
                        l = null;
                    }
                    Long l3 = (Long) ((LinkedHashMap) map).get(l);
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    long j2 = linkPlayerInfo.mFanTicket;
                    if (j > 0 && j2 != 0 && j > j2) {
                        linkPlayerInfo.mFanTicket = j;
                        java.util.Map<Long, Long> map2 = c74723TUh.LJLJJL;
                        User user2 = linkPlayerInfo.mUser;
                        if (user2 != null) {
                            l2 = Long.valueOf(user2.getId());
                        }
                        C65777Prh.LIZJ(map2).remove(l2);
                    }
                    abstractC74724TUi.LJIIIIZZ(linkPlayerInfo);
                }
            }
        }
    }
}
