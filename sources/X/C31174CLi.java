package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.CLi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31174CLi implements InterfaceC62096OYq {
    public final /* synthetic */ CLZ LJLIL;
    public final /* synthetic */ CompletionBlock<InterfaceC31175CLj> LJLILLLLZI;
    public final /* synthetic */ EnumC37844EtE LJLJI;

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
        AbstractC31179CLn.LJII(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public C31174CLi(CLZ clz, C37356ElM c37356ElM, EnumC37844EtE enumC37844EtE) {
        this.LJLIL = clz;
        this.LJLILLLLZI = c37356ElM;
        this.LJLJI = enumC37844EtE;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        C0NB.LIZ("share success");
        this.LJLIL.getClass();
        InterfaceC31175CLj interfaceC31175CLj = (InterfaceC31175CLj) ED5.LIZJ(InterfaceC31175CLj.class, null);
        interfaceC31175CLj.setShareType(shareType);
        if (o.LJ(platform, "subscribe_invite")) {
            str = "message";
        } else {
            str = platform;
        }
        interfaceC31175CLj.setSharePlatfrom(str);
        CLZ clz = this.LJLIL;
        CompletionBlock<InterfaceC31175CLj> completionBlock = this.LJLILLLLZI;
        EnumC37844EtE type = this.LJLJI;
        clz.getClass();
        o.LJIIIZ(completionBlock, "<this>");
        o.LJIIIZ(type, "type");
        interfaceC31175CLj.setCode(1);
        interfaceC31175CLj.setMsg("");
        if (type == EnumC37844EtE.WEB) {
            completionBlock.onRawSuccess(interfaceC31175CLj);
        } else {
            completionBlock.onSuccess(interfaceC31175CLj, "");
        }
        CLZ clz2 = this.LJLIL;
        if (o.LJ(platform, "subscribe_invite")) {
            platform = "message";
        }
        clz2.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_share");
        if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
        }
        if (C74838TYs.LJ().LJJ > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_guest_connection");
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ.LJIJJ(Boolean.FALSE, "is_create_group_chat");
        LIZ.LJIJJ(platform, "share_platform");
        LIZ.LJIJJ("anchor", "user_type");
        if (C15380j0.LJIILLIIL()) {
            str3 = "portrait";
        } else {
            str3 = "landscape";
        }
        LIZ.LJIJJ(str3, "room_orientation");
        C78895Uxn.LIZIZ(LIZ, "anchor", "initiator", 1, "share_num");
        LIZ.LJIJJ("subscription_invitee_list", "event_page");
        LIZ.LJIJJ(shareType, "share_type");
        LIZ.LJIJJ(platform, "platform");
        LIZ.LJJIFFI(BJB.LIZ());
        LIZ.LJJIIJZLJL();
    }
}
