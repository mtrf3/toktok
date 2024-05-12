package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftNotice;
import com.bytedance.android.livesdk.livesetting.gift.LiveWeeklyRankingGiftNoticeDurationLimitSetting;
import com.bytedance.android.livesdk.model.message.GiftNoticeMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cj1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32115Cj1 implements OnMessageListener, C0G {
    public IMessageManager LJLIL;
    public GiftNoticeMessage LJLILLLLZI;
    public DataChannel LJLJI;
    public long LJLJJI;
    public C73411SrX LJLJJL;

    @Override // X.C0G
    public final void LIZIZ() {
        long j;
        GiftNotice giftNotice;
        GiftNotice giftNotice2;
        Long l;
        C32003ChD.LIZIZ = true;
        HashMap hashMap = new HashMap();
        GiftNoticeMessage giftNoticeMessage = this.LJLILLLLZI;
        long j2 = 0;
        if (giftNoticeMessage != null && (giftNotice2 = giftNoticeMessage.giftNotice) != null && (l = giftNotice2.periodId) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        hashMap.put(Long.valueOf(j), Long.valueOf(C30725C4b.LIZ()));
        InterfaceC30442Bx8.h0.LIZ(hashMap);
        GiftNoticeMessage giftNoticeMessage2 = this.LJLILLLLZI;
        if (giftNoticeMessage2 != null && (giftNotice = giftNoticeMessage2.giftNotice) != null) {
            j2 = giftNotice.giftId;
        }
        C32793Ctx.LIZIZ(Long.valueOf(j2), EnumC32606Cqw.WEEKLY_RANKING_GIFT, 0);
        this.LJLJJL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(5000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(C32116Cj2.LJLIL);
    }

    @Override // X.C0G
    public final void LIZ() {
        C32793Ctx.LIZ(EnumC32853Cuv.TIME_UP, EnumC32606Cqw.WEEKLY_RANKING_GIFT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if ((X.C30725C4b.LIZ() - r8) < 604800000) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32115Cj1.LIZJ():void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        boolean z;
        Boolean bool;
        Room room;
        GiftNotice giftNotice;
        if (iMessage instanceof GiftNoticeMessage) {
            this.LJLILLLLZI = (GiftNoticeMessage) iMessage;
            if (C30725C4b.LIZ() - this.LJLJJI < LiveWeeklyRankingGiftNoticeDurationLimitSetting.INSTANCE.getValue() * 1000) {
                return;
            }
            GiftManager inst = GiftManager.inst();
            GiftNoticeMessage giftNoticeMessage = this.LJLILLLLZI;
            long j2 = 0;
            if (giftNoticeMessage != null && (giftNotice = giftNoticeMessage.giftNotice) != null) {
                j = giftNotice.giftId;
            } else {
                j = 0;
            }
            if (inst.findGiftById(j) == null) {
                UW7 uw7 = GiftManager.inst().giftRepository;
                DataChannel dataChannel = this.LJLJI;
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    j2 = room.getId();
                }
                DataChannel dataChannel2 = this.LJLJI;
                if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                uw7.LIZ(8, j2, new C32117Cj3(this), "", z);
                return;
            }
            LIZJ();
        }
    }
}
