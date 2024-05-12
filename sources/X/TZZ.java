package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZZ implements InterfaceC75414Tik<PermitResult> {
    public final /* synthetic */ C74846TZa LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitResult value) {
        int i;
        LinkPlayerInfo linkPlayerInfo;
        Room room;
        String str;
        SubscribeInfo subscribeInfo;
        AbstractC74727TUl LIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        o.LJIIIZ(value, "value");
        this.LJLIL.LJLJJI.remove(this.LJLILLLLZI);
        int i2 = this.LJLJI;
        if (i2 == 2) {
            C74987Tbr.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator reject apply from guest succ");
            C74846TZa c74846TZa = this.LJLIL;
            long j = this.LJLJJI;
            MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = c74846TZa.LJLJL;
            if (multiGuestAsGuestModeratorManageDialog != null) {
                multiGuestAsGuestModeratorManageDialog.LJJIJIIJIL(j);
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        C74987Tbr.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator permit apply from guest succ");
        C74846TZa c74846TZa2 = this.LJLIL;
        long j2 = this.LJLJJI;
        String str2 = this.LJLILLLLZI;
        c74846TZa2.getClass();
        C74987Tbr.LIZ("MultiGuestAsGuestModeratorPresenter", "moderator permit apply from guest succ");
        TS8.LIZ.LJ(j2, str2);
        InterfaceC74853TZh LJJJJI = c74846TZa2.LJJJJI();
        if (LJJJJI != null) {
            LJJJJI.LJIIIZ(j2, "guest_apply_anchor");
        }
        C31657Cbd c31657Cbd = c74846TZa2.LJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C74846TZa.LJLLL;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c31657Cbd.LIZ(c74846TZa2, interfaceC74236TBoArr[1]);
        int i3 = -1;
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettings2 = multiGuestDataHolder.LJIIJ) != null) {
            i = multiLiveAnchorPanelSettings2.layoutType;
        } else {
            i = -1;
        }
        MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c74846TZa2.LJLL.LIZ(c74846TZa2, interfaceC74236TBoArr[1]);
        if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettings = multiGuestDataHolder2.LJIIJ) != null) {
            i3 = multiLiveAnchorPanelSettings.fixMicNumAction;
        }
        EnumC74778TWk LIZJ = CL8.LIZJ(i, i3);
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog2 = c74846TZa2.LJLJL;
        if (multiGuestAsGuestModeratorManageDialog2 != null) {
            multiGuestAsGuestModeratorManageDialog2.LJJIJ(j2);
        }
        boolean LJ = o.LJ(String.valueOf(j2), c74846TZa2.LJLILLLLZI.kv0(C74966TbW.class));
        List LIZIZ = C74896TaO.LIZIZ(j2);
        InterfaceC74853TZh LJJJJI2 = c74846TZa2.LJJJJI();
        Boolean bool = null;
        if (LJJJJI2 != null && (LIZ = LJJJJI2.LIZ()) != null) {
            linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIL(j2);
        } else {
            linkPlayerInfo = null;
        }
        String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
        if (linkPlayerInfo == null || (room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class)) == null) {
            str = "";
        } else {
            User owner = room.getOwner();
            if (owner != null) {
                bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
            }
            if (C29306Beo.LJIL(bool)) {
                str = "-1";
            } else {
                User user = linkPlayerInfo.mUser;
                if (user != null && (subscribeInfo = user.getSubscribeInfo()) != null && subscribeInfo.isSubscribedToCurrentAnchor()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
            }
        }
        Gson gson = C09650Zl.LIZJ;
        C75017TcL.LJI(j2, LIZJ, LJ, str2, LJJJLL, str, GsonProtectorUtils.toJson(gson, C74896TaO.LIZJ(j2)), GsonProtectorUtils.toJson(gson, LIZIZ), LIZIZ.size(), C74947TbD.LJIIJ(linkPlayerInfo), -1L, -1, -1, null);
        if (LJ) {
            C74830TYk.LIZLLL.add(Long.valueOf(j2));
        }
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        if (TV3.LJI(LJ2)) {
            C28847BTv.LIZJ();
        } else {
            C30868C9o.LIZJ(R.string.n9c);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        int errorCode;
        InterfaceC74853TZh LJJJJI;
        o.LJIIIZ(error, "error");
        this.LJLIL.LJLJJI.remove(this.LJLILLLLZI);
        int i = this.LJLJI;
        if (i == 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("moderator reject apply from guest fail, throwable=");
            LIZ.append(th);
            C74987Tbr.LIZ("MultiGuestAsGuestModeratorPresenter", X1D.LIZIZ(LIZ));
            C74846TZa c74846TZa = this.LJLIL;
            long j = this.LJLJJI;
            MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = c74846TZa.LJLJL;
            if (multiGuestAsGuestModeratorManageDialog != null) {
                multiGuestAsGuestModeratorManageDialog.LJJIJIIJI(j, th);
            }
            BPP.LIZJ(((InterfaceC31336CRo) this.LJLIL.mView).getContext(), th);
            return;
        }
        if (i != 1) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("moderator permit apply from guest fail, throwable=");
        LIZ2.append(th);
        C74987Tbr.LIZ("MultiGuestAsGuestModeratorPresenter", X1D.LIZIZ(LIZ2));
        C74846TZa c74846TZa2 = this.LJLIL;
        long j2 = this.LJLJJI;
        c74846TZa2.getClass();
        if ((th instanceof C29401Dk) && (((errorCode = ((C276516r) th).getErrorCode()) == 4004026 || errorCode == 4004029) && (LJJJJI = c74846TZa2.LJJJJI()) != null)) {
            TRT.LIZ(LJJJJI, "fetch_on_moderator_permit_failed", 1002, null, null, 12);
        }
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog2 = c74846TZa2.LJLJL;
        if (multiGuestAsGuestModeratorManageDialog2 != null) {
            multiGuestAsGuestModeratorManageDialog2.LJIIZILJ(j2, th);
        }
        BPP.LIZLLL(((InterfaceC31336CRo) this.LJLIL.mView).getContext(), th, R.string.su9);
    }

    public TZZ(C74846TZa c74846TZa, String str, int i, long j) {
        this.LJLIL = c74846TZa;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
    }
}
