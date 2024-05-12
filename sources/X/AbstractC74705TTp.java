package X;

import Y.AfS22S1200000_13;
import Y.AfS65S0100000_13;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.api.GameLinkApi;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TTp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC74705TTp implements InterfaceC74665TSb, OnMessageListener {
    public static final ArrayList<Integer> LJLLILLLL = C47261Igj.LJII(19, 20, 21);
    public final Room LJLIL;
    public final long LJLILLLLZI;
    public final TTR LJLJI;
    public final IMessageManager LJLJJI;
    public final LifecycleOwner LJLJJL;
    public boolean LJLJJLL;
    public C73495Sst LJLJL;
    public final TRF LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;

    public final List<InterfaceC74708TTs> LJFF() {
        return (List) this.LJLL.getValue();
    }

    @Override // X.InterfaceC74665TSb
    public final void init() {
        if (this.LJLJJLL) {
            C0NB.LJIIIZ("LinkUserInfoCenter", "init before");
            return;
        }
        IMessageManager iMessageManager = this.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        this.LJLJI.e3(this.LJLJLJ);
        this.LJLJJLL = true;
        LIZJ("enter_room", null);
    }

    public void release() {
        C73495Sst c73495Sst = this.LJLJL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        IMessageManager iMessageManager = this.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        this.LJLJI.X3(this.LJLJLJ);
        LJFF().clear();
        ((HashMap) this.LJLJLLL.getValue()).clear();
        ((C74710TTu) this).LJII().LJII(true);
        C74838TYs.LJ().LJJ = 0;
        TTV.LIZ().LJIIJJI = 0;
        ((java.util.Map) TWL.LJII.getValue()).clear();
    }

    @Override // X.InterfaceC74665TSb
    public final boolean isInit() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC74665TSb
    public final String LIZIZ(long j) {
        return (String) ((HashMap) this.LJLJLLL.getValue()).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC74665TSb
    public final void LIZLLL(InterfaceC74708TTs listener) {
        o.LJIIIZ(listener, "listener");
        LJFF().add(listener);
    }

    @Override // X.InterfaceC74665TSb
    public final void LJ(InterfaceC74708TTs listener) {
        o.LJIIIZ(listener, "listener");
        LJFF().remove(listener);
    }

    public final void LJI(int i) {
        Iterator<InterfaceC74708TTs> it = LJFF().iterator();
        while (it.hasNext()) {
            it.next().LJJIL(((C74710TTu) this).LJII(), this.LJLLI);
        }
        if (this.LJLLI) {
            this.LJLLI = false;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LinkMessage linkMessage;
        boolean z;
        long j;
        if ((iMessage instanceof LinkMessage) && (linkMessage = (LinkMessage) iMessage) != null && LJLLILLLL.contains(Integer.valueOf(linkMessage.messageType)) && linkMessage.LIZJ() == EnumC74706TTq.AUDIENCE_LINKMIC) {
            C74710TTu c74710TTu = (C74710TTu) this;
            c74710TTu.LJII().LJII(false);
            c74710TTu.LJIIIZ().LJI(linkMessage);
            C74838TYs LJ = C74838TYs.LJ();
            if (C60903NvH.LJIILLIIL(c74710TTu.LJIIIZ()) > 0) {
                z = true;
            } else {
                z = false;
            }
            LJ.LJIIIIZZ(z);
            C74838TYs.LJ().LJJ = C60903NvH.LJIILLIIL(c74710TTu.LJIIIZ());
            TTV.LIZ().LJIIJJI = C60903NvH.LJIILLIIL(c74710TTu.LJIIIZ());
            for (LinkListUser linkListUser : c74710TTu.LJIIIZ().LIZLLL()) {
                TYR tyr = TS8.LIZ;
                User user = linkListUser.user;
                if (user != null) {
                    j = user.getId();
                } else {
                    j = 0;
                }
                tyr.LJ(j, linkListUser.linkMicId);
                if (linkListUser.roleType == 1) {
                    C74838TYs.LJ().LJIILIIL = linkListUser.linkMicId;
                }
            }
            c74710TTu.LJIIJ(false);
            C28733BPl.LJIILIIL().getClass();
            C0NE.LIZ("LinkUserInfoCenter", "guest and audience handleListChangeMessage");
            c74710TTu.LJIIIIZZ().LIZ(linkMessage);
            c74710TTu.LJIIJJI(2);
        }
    }

    @Override // X.InterfaceC74665TSb
    public final void LIZJ(String str, InterfaceC88472Yns<? super InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns) {
        AbstractC73638SvC listByType;
        if (this.LJLILLLLZI == -1 || this.LJLJL != null) {
            return;
        }
        listByType = ((GameLinkApi) TTL.LIZ(GameLinkApi.class, "get().getService(GameLinkApi::class.java)")).getListByType(this.LJLIL.getId(), this.LJLIL.getOwnerUserId(), this.LJLILLLLZI, C47261Igj.LJJIJIIJI(1, 2).toString(), 0, 12);
        this.LJLJL = (C73495Sst) T28.LIZLLL(listByType).LJJII(new AfS22S1200000_13((Object) this, (AbstractC74705TTp) interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe>) str, (String) 0), new AfS65S0100000_13(this, 1));
    }

    public AbstractC74705TTp(Room room, long j, TTR linkManager, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(linkManager, "linkManager");
        this.LJLIL = room;
        this.LJLILLLLZI = j;
        this.LJLJI = linkManager;
        this.LJLJJI = iMessageManager;
        this.LJLJJL = lifecycleOwner;
        this.LJLJLJ = new TRF(this);
        this.LJLJLLL = C221108m2.LIZIZ(TRH.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C74707TTr.LJLIL);
        this.LJLLI = true;
    }
}
