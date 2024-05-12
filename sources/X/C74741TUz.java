package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;

/* renamed from: X.TUz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74741TUz extends AbstractC74724TUi {
    public long LJLILLLLZI;
    public String LJLJI;
    public LinkPlayerInfo LJLJJI;
    public long LJLJJL;
    public final TV1 LJLJJLL;

    @Override // X.V8Q
    public final void LIZJ() {
        this.LJLIL = null;
    }

    @Override // X.AbstractC74724TUi
    public final User LJ() {
        LinkPlayerInfo linkPlayerInfo = this.LJLJJI;
        if (linkPlayerInfo != null) {
            return linkPlayerInfo.mUser;
        }
        return null;
    }

    @Override // X.AbstractC74724TUi
    public final boolean LJI() {
        long j = this.LJLILLLLZI;
        if (j != 0 && j == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC74724TUi
    public final void LJII() {
        TV1 tv1 = this.LJLJJLL;
        if (tv1 != null) {
            LinkPlayerInfo LIZ = tv1.LIZ(this.LJLILLLLZI, this.LJLJI);
            if (LIZ != null) {
                LJIIIIZZ(LIZ);
            }
        }
    }

    public final void LJIIL() {
        Object obj = this.LJLIL;
        if (obj == null) {
            return;
        }
        boolean z = false;
        if (this.LJLJJI == null) {
            ((TV0) ((InterfaceC29082BbC) obj)).setVisibility(false);
            return;
        }
        ((TV0) ((InterfaceC29082BbC) obj)).setVisibility(true);
        User user = this.LJLJJI.mUser;
        if (user != null) {
            ((TV0) ((InterfaceC29082BbC) this.LJLIL)).updateUserInfo(user);
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            LJIIJJI(multiGuestDataHolder.LJJIL, this.LJLJJI.mFanTicket);
        }
        TV0 tv0 = (TV0) ((InterfaceC29082BbC) this.LJLIL);
        if (this.LJLJJI.mLinkType == 1) {
            z = true;
        }
        tv0.switchMode(z);
    }

    @Override // X.AbstractC74724TUi
    public final String LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.AbstractC74724TUi
    public final long LJFF() {
        return this.LJLILLLLZI;
    }

    @Override // X.V8Q
    public final void LIZ(InterfaceC29082BbC interfaceC29082BbC) {
        this.LJLIL = interfaceC29082BbC;
        LJIIL();
    }

    @Override // X.AbstractC74724TUi
    public final void LJIIIIZZ(LinkPlayerInfo linkPlayerInfo) {
        User user;
        LinkPlayerInfo linkPlayerInfo2 = this.LJLJJI;
        if (linkPlayerInfo2 != null) {
            linkPlayerInfo2.getClass();
            if (linkPlayerInfo != null && linkPlayerInfo.mUser != null && (user = linkPlayerInfo2.mUser) != null && user.getId() == linkPlayerInfo.mUser.getId()) {
                long j = linkPlayerInfo.mFanTicket;
                if (j > linkPlayerInfo2.mFanTicket) {
                    linkPlayerInfo2.mFanTicket = j;
                }
                linkPlayerInfo2.mInteractIdStr = linkPlayerInfo.mInteractIdStr;
                linkPlayerInfo2.mUser = linkPlayerInfo.mUser;
                long j2 = linkPlayerInfo.mModifyTime;
                if (j2 > linkPlayerInfo2.mModifyTime) {
                    linkPlayerInfo2.mModifyTime = j2;
                }
                linkPlayerInfo2.LIZ = linkPlayerInfo.LIZ;
                linkPlayerInfo2.mLinkType = linkPlayerInfo.mLinkType;
                linkPlayerInfo2.mRoleType = linkPlayerInfo.mRoleType;
                linkPlayerInfo2.paidMoney = linkPlayerInfo.paidMoney;
            }
        } else {
            this.LJLJJI = linkPlayerInfo;
        }
        LinkPlayerInfo linkPlayerInfo3 = this.LJLJJI;
        if (linkPlayerInfo3 != null) {
            this.LJLJI = linkPlayerInfo3.mInteractIdStr;
            User user2 = linkPlayerInfo3.mUser;
            if (user2 != null) {
                this.LJLILLLLZI = user2.getId();
            }
        }
        LJIIL();
    }

    @Override // X.AbstractC74724TUi
    public final void LJIIJ(long j) {
        InterfaceC29082BbC interfaceC29082BbC = (InterfaceC29082BbC) this.LJLIL;
        if (interfaceC29082BbC != null) {
            ((TV0) interfaceC29082BbC).updateTicket(j);
        }
    }

    @Override // X.AbstractC74724TUi
    public final void LJIIJJI(String str, long j) {
        if (j < this.LJLJJL) {
            return;
        }
        this.LJLJJL = j;
        if (this.LJLIL != null) {
            U35 LIZ = TQA.LIZ();
            if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && LIZ != null && LIZ.LJIIJJI()) {
                ((TV0) ((InterfaceC29082BbC) this.LJLIL)).updateTicket(str, LIZ.LJI(this.LJLILLLLZI));
            } else {
                ((TV0) ((InterfaceC29082BbC) this.LJLIL)).updateTicket(str, this.LJLJJL);
            }
        }
        if (LJI()) {
            C74740TUy.LIZLLL().LJIIIIZZ(this.LJLJJL);
        }
    }

    public C74741TUz(long j, String str, LinkPlayerInfo linkPlayerInfo, C74723TUh c74723TUh) {
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = linkPlayerInfo;
        if (linkPlayerInfo != null) {
            this.LJLJI = linkPlayerInfo.mInteractIdStr;
            User user = linkPlayerInfo.mUser;
            if (user != null) {
                this.LJLILLLLZI = user.getId();
            }
        }
        this.LJLJJLL = c74723TUh;
    }
}
