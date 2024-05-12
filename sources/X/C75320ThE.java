package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import kotlin.jvm.internal.o;

/* renamed from: X.ThE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75320ThE implements TUI {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C75318ThC LJLILLLLZI;

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    @Override // X.TUI
    public final void V(TZX provider) {
        o.LJIIIZ(provider, "provider");
        LinkListUser linkListUser = (LinkListUser) provider.LJII(this.LJLIL);
        if (linkListUser == null) {
            return;
        }
        long j = linkListUser.fanTicket;
        User user = linkListUser.user;
        if (user == null) {
            return;
        }
        AbstractC75323ThH.LJIILJJIL(this.LJLILLLLZI.LJI(), Long.valueOf(j));
        MutableLiveData<C75330ThO> LJFF = this.LJLILLLLZI.LJFF();
        long id = user.getId();
        String str = this.LJLIL;
        String LIZ = C05170If.LIZ(user);
        o.LJIIIIZZ(LIZ, "getDisplayName(userInfo)");
        AbstractC75323ThH.LJIILJJIL(LJFF, new C75330ThO(id, str, LIZ));
        AbstractC75323ThH.LJIILJJIL(this.LJLILLLLZI.LJ(), user.getAvatarThumb());
    }

    public C75320ThE(String str, C75318ThC c75318ThC) {
        this.LJLIL = str;
        this.LJLILLLLZI = c75318ThC;
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        User user;
        String str;
        o.LJIIIZ(provider, "provider");
        LinkPlayerInfo LJII = provider.LJII(this.LJLIL);
        if (LJII == null || (user = LJII.mUser) == null) {
            return;
        }
        long j = LJII.mFanTicket;
        MultiLiveGuestInfoList source = provider.getSource();
        if (source != null && (str = source.fanTicketIconUrl) != null) {
            AbstractC75323ThH.LJIILJJIL(this.LJLILLLLZI.LJII(), str);
        }
        AbstractC75323ThH.LJIILJJIL(this.LJLILLLLZI.LJI(), Long.valueOf(j));
        MutableLiveData<C75330ThO> LJFF = this.LJLILLLLZI.LJFF();
        long id = user.getId();
        String str2 = this.LJLIL;
        String LIZ = C05170If.LIZ(user);
        o.LJIIIIZZ(LIZ, "getDisplayName(userInfo)");
        AbstractC75323ThH.LJIILJJIL(LJFF, new C75330ThO(id, str2, LIZ));
        AbstractC75323ThH.LJIILJJIL(this.LJLILLLLZI.LJ(), user.getAvatarThumb());
    }
}
