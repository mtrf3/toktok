package X;

import Y.ARunnableS16S0300000_5;
import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAudienceRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* renamed from: X.Bzk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30604Bzk<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ GamePartnershipService LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ Room LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C30605Bzl, C76800UCe> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C30604Bzk(long j, GamePartnershipService gamePartnershipService, Context context, Room room, DataChannel dataChannel, InterfaceC88472Yns<? super C30605Bzl, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = j;
        this.LJLILLLLZI = gamePartnershipService;
        this.LJLJI = context;
        this.LJLJJI = room;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        AudienceRoomInfoResponse.DropsInfo dropsInfo;
        OSZ osz = (OSZ) obj;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        PartnershipRefactoringSwitchAudienceRoom audienceRoom = GameLivePartnershipApiOptSetting.INSTANCE.getAudienceRoom();
        AudienceRoomInfoResponse.ResponseData responseData = (AudienceRoomInfoResponse.ResponseData) osz.getFirst();
        AudienceRoomInfoResponse.PartnershipInfo partnershipInfo = null;
        if (responseData != null) {
            dropsInfo = responseData.dropsInfo;
        } else {
            dropsInfo = null;
        }
        if (audienceRoom.drops && dropsInfo != null) {
            C30451BxH c30451BxH = (C30451BxH) this.LJLILLLLZI.LJLJI.getValue();
            String url = dropsInfo.giftIcon;
            c30451BxH.getClass();
            o.LJIIIZ(url, "url");
            c30451BxH.LJFF = url;
            String str = dropsInfo.promotingDropsId;
            if (dropsInfo.rewardCount > 0) {
                InterfaceC30442Bx8.LJJLIIIJLJLI.LIZJ(Boolean.TRUE);
            }
            ((C30451BxH) this.LJLILLLLZI.LJLJI.getValue()).LIZ(this.LJLJI, str, this.LJLJJI, this.LJLJJL, "enter");
        }
        AudienceRoomInfoResponse.ResponseData responseData2 = (AudienceRoomInfoResponse.ResponseData) osz.getFirst();
        if (responseData2 != null) {
            partnershipInfo = responseData2.partnershipInfo;
        }
        if (audienceRoom.partnershipEntrance && partnershipInfo != null) {
            GamePartnershipService gamePartnershipService = this.LJLILLLLZI;
            long id = this.LJLJJI.getId();
            Object second = osz.getSecond();
            o.LJIIIIZZ(second, "it.second");
            GamePartnershipService.LJFF(gamePartnershipService, id, (C28467BFf) second, null, (AudienceRoomInfoResponse.ResponseData) osz.getFirst(), 4);
            this.LJLJJLL.invoke(this.LJLILLLLZI.LIZ());
            GamePartnershipService gamePartnershipService2 = this.LJLILLLLZI;
            Context context = this.LJLJI;
            Room room = this.LJLJJI;
            gamePartnershipService2.getClass();
            C38995FSd.LIZIZ().submit(new ARunnableS16S0300000_5(gamePartnershipService2, room, context, 12));
        }
        C30588BzU.LJII(true, (AudienceRoomInfoResponse.ResponseData) osz.getFirst(), this.LJLJJL, currentTimeMillis, null, 16);
    }
}
