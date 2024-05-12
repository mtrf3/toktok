package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TXp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74809TXp implements InterfaceC75414Tik<ApplyResult> {
    public final /* synthetic */ C74813TXt LJLIL;
    public final /* synthetic */ TWQ LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ApplyResult applyResult) {
        BizApplyResponseData bizApplyResponseData;
        Long l;
        Boolean bool;
        User owner;
        FollowInfo followInfo;
        int i;
        long j;
        User owner2;
        User owner3;
        PerceptionMessage perceptionMessage;
        ApplyResult value = applyResult;
        o.LJIIIZ(value, "value");
        C74813TXt c74813TXt = this.LJLIL;
        c74813TXt.LJII = false;
        BizApplyResponse bizApplyResponse = value.multiGuestRespExtra;
        Boolean bool2 = null;
        if (bizApplyResponse != null) {
            bizApplyResponseData = bizApplyResponse.responseData;
        } else {
            bizApplyResponseData = null;
        }
        GameLinkGuestPresenter gameLinkGuestPresenter = c74813TXt.LIZIZ;
        if (gameLinkGuestPresenter != null) {
            if (bizApplyResponseData != null) {
                perceptionMessage = bizApplyResponseData.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (gameLinkGuestPresenter.onInterceptPunishedMessageNew$livegamelinkmic_impl_release(perceptionMessage)) {
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("linkPermissionType = ");
        if (bizApplyResponseData != null) {
            l = Long.valueOf(bizApplyResponseData.linkTypePermission);
        } else {
            l = null;
        }
        LIZ.append(l);
        TYP.LIZ("GameLinkInteractDialogPresenter", X1D.LIZIZ(LIZ), false);
        if (bizApplyResponseData != null) {
            TTV.LIZ().LIZJ(bizApplyResponseData.linkTypePermission);
        }
        TWQ twq = this.LJLILLLLZI;
        if (twq != null) {
            bool = Boolean.valueOf(twq.LIZLLL);
        } else {
            bool = null;
        }
        long j2 = 0;
        if (C29306Beo.LJJIFFI(bool)) {
            C74813TXt c74813TXt2 = this.LJLIL;
            c74813TXt2.getClass();
            FollowPair followPair = new FollowPair();
            Room room = c74813TXt2.LIZJ;
            if (room != null && (owner3 = room.getOwner()) != null) {
                bool2 = Boolean.valueOf(owner3.isFollower);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                i = 2;
            } else {
                i = 1;
            }
            followPair.followStatus = i;
            Room room2 = c74813TXt2.LIZJ;
            if (room2 != null && (owner2 = room2.getOwner()) != null) {
                j = owner2.getId();
            } else {
                j = 0;
            }
            followPair.LIZ = j;
            followPair.LIZJ = followPair.followStatus;
            ((C29374Bfu) B83.LIZ().LIZIZ()).LJFF(followPair);
        }
        C74813TXt c74813TXt3 = this.LJLIL;
        if (c74813TXt3.LIZ == null) {
            return;
        }
        if (bizApplyResponseData != null && bizApplyResponseData.linkTypePermission == 2) {
            TVD LJI = c74813TXt3.LJI();
            if (LJI != null) {
                LJI.LJIIZILJ = 2;
                LJI.LJIJJLI = 2;
                C74740TUy.LIZLLL().LJIIJJI = 2;
            }
            if (c74813TXt3.LJ != 2) {
                String string = C15380j0.LIZLLL().getString(R.string.nep);
                o.LJIIIIZZ(string, "getContext().getString(resId)");
                C30868C9o.LJI(string);
                C74811TXr.LIZ = System.nanoTime() / 1000000;
            }
            c74813TXt3.LJ = 2;
        }
        C74740TUy.LIZLLL().LJI(1);
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        C74813TXt c74813TXt4 = this.LJLIL;
        LIZLLL.LJIIJJI = c74813TXt4.LJ;
        Room room3 = c74813TXt4.LIZJ;
        if (room3 != null && (owner = room3.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j2 = followInfo.getFollowStatus();
        }
        HashMap LIZJ = C03660Ck.LIZJ("guest_connection_type", "voice");
        LIZJ.put("weight_decay_type", String.valueOf(-1));
        LIZJ.put("anchor_relationship", String.valueOf(j2));
        if (!TextUtils.isEmpty(C78983UzD.LJLLILLLL)) {
            LIZJ.put("request_page", C78983UzD.LJLLILLLL);
        }
        TVD LIZ2 = TTV.LIZ();
        if (LIZ2 != null) {
            LIZJ.put("guest_permission", LIZ2.LIZ());
        }
        LIZJ.put("apply_connection_type", CardStruct.IStatusCode.DEFAULT);
        LIZJ.put("request_platform", "room");
        LIZJ.put("connected_guest_cnt", String.valueOf(TTV.LIZ().LJIIJJI));
        LIZJ.put("layout_setting", TWL.LJFF().getFirst());
        LIZJ.put("window_setting", TWL.LJFF().getSecond());
        BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_apply");
        LIZ3.LJIIZILJ();
        LIZ3.LJIIJJI("live_take_detail");
        LIZ3.LJJIFFI(LIZJ);
        LIZ3.LJJIIJZLJL();
        C74838TYs.LJ().LJJIIZ = false;
        InterfaceC74810TXq interfaceC74810TXq = this.LJLIL.LIZ;
        if (interfaceC74810TXq == null) {
            return;
        }
        interfaceC74810TXq.LLLLIL();
    }

    public C74809TXp(C74813TXt c74813TXt, TWQ twq) {
        this.LJLIL = c74813TXt;
        this.LJLILLLLZI = twq;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        TSX tsx;
        o.LJIIIZ(error, "error");
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL.LIZIZ;
        if (gameLinkGuestPresenter != null && (tsx = (TSX) gameLinkGuestPresenter.mView) != null) {
            tsx.onCheckPermissionFailed(new C74698TTi(th));
        }
        C74813TXt c74813TXt = this.LJLIL;
        c74813TXt.LJII = false;
        InterfaceC74810TXq interfaceC74810TXq = c74813TXt.LIZ;
        if (interfaceC74810TXq == null) {
            return;
        }
        interfaceC74810TXq.LLLLLLLZIL(th);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("guest apply failed throwable:");
        LIZ.append(th);
        TYP.LIZJ("GameLinkInteractDialogPresenter", X1D.LIZIZ(LIZ));
    }
}
