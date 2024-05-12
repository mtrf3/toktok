package X;

import Y.ARunnableS17S0101000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.SendGiftSuccessEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLikeScoreCompensationEvent;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchSeiBattleIdUpdateChannel;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Twq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76288Twq extends AbstractC31497CXt<InterfaceC76359Txz> {
    public Room LJLIL;
    public int LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJLLL;
    public Handler LJLL;
    public int LJLILLLLZI = 1;
    public final C278417k<Long, Integer> LJLJL = new C278417k<>(2);
    public int LJLJLJ = -1;
    public final C76292Twu LJLLI = new C76292Twu(this);
    public final AqS195S0100000_13 LJLLILLLL = new AqS195S0100000_13(this, 1);
    public final ARunnableS49S0100000_13 LJLLJ = new ARunnableS49S0100000_13(this, 12);

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0194, code lost:
    
        if (r9 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL() {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76288Twq.LJJJJJL():void");
    }

    public static boolean LJJJJL() {
        if (C8E.LIZLLL().LJIILJJIL().size() > 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        IMessageManager iMessageManager;
        C8E.LIZLLL().LJZI(C75728Tno.class, this.LJLLILLLL);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJLLI);
        }
        Handler handler = this.LJLL;
        if (handler != null) {
            handler.removeCallbacks(this.LJLLJ);
        }
        this.LJLJLLL = true;
        super.detachView();
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC76359Txz interfaceC76359Txz) {
        Room room;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        super.attachView((C76288Twq) interfaceC76359Txz);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            room = new Room();
        }
        this.LJLIL = room;
        this.LJLL = new Handler(C16880lQ.LLJJJJ());
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager2 = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJLLI);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJLLI);
        }
        int i = 3;
        if (C8E.LIZLLL().LJIL().size() < 3) {
            i = 1;
        }
        this.LJLILLLLZI = i;
        C8E.LIZLLL().LJJJZ(C75728Tno.class, this.LJLLILLLL);
        DataChannel dataChannel4 = this.dataChannel;
        dataChannel4.lv0((LifecycleOwner) this.mView, SendGiftSuccessEvent.class, new AqS179S0100000_13(this, 55));
        dataChannel4.lv0((LifecycleOwner) this.mView, BattleIsCurrentWinChannel.class, new AqS179S0100000_13(this, 56));
        dataChannel4.lv0((LifecycleOwner) this.mView, BattleLikeScoreCompensationEvent.class, new AqS179S0100000_13(this, 57));
        this.dataChannel.lv0((LifecycleOwner) this.mView, MatchSeiBattleIdUpdateChannel.class, new AqS179S0100000_13(this, 58));
    }

    public final void LJJJJI(int i) {
        if (this.mView == 0 || getLifeLifecycleOwner() == null) {
            return;
        }
        QZP.LIZJ("checkBattleInfo, type = ", i, "MultiMatchAudiencePrese");
        int i2 = this.LJLJJLL;
        if (i2 == 0) {
            return;
        }
        this.LJLJJLL = i2 - 1;
        C15610jN.LIZJ(new ARunnableS17S0101000_13(i, this, 0), LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryDuration() * 2000);
    }

    public final void LJJJJIZL(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request Compensate isNotEmpty ");
        java.util.Map<String, List<C76338Txe>> map = C76271TwZ.LJJIII;
        LIZ.append(!map.isEmpty());
        LIZ.append(" scene = ");
        LIZ.append(i);
        C0NB.LIZIZ("MatchCompensate", X1D.LIZIZ(LIZ));
        if (!map.isEmpty()) {
            MultiMatchApi multiMatchApi = (MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class);
            C76280Twi c76280Twi = C76265TwT.LIZ;
            C1EW.LIZ(multiMatchApi.recentContribution(c76280Twi.LIZJ(), c76280Twi.LIZIZ())).LJJJLIIL(new C76289Twr(this), C76340Txg.LJLIL);
        }
    }

    public final void LJJJJJ(long j) {
        Room room;
        if (!LiveMatchAudienceIdentifyOptSettings.INSTANCE.isSeiFallBackEnable()) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            room = new Room();
        }
        ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).getInfo(room.getId(), B5G.LIZIZ().LJFF, j, room.getOwnerUserId()).LIZJ(autoDisposeWithTransformer())).LIZJ(new AfS65S0100000_13(this, 19), new AfS65S0100000_13(this, 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJLI(List<BattleTeamUser> list, boolean z) {
        long j;
        if ((this.mView instanceof MultiMatchAudienceWidget) && list != null) {
            for (BattleTeamUser battleTeamUser : list) {
                T t = this.mView;
                o.LJII(t, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget");
                MatchBaseWidget matchBaseWidget = (MatchBaseWidget) t;
                Long l = battleTeamUser.userId;
                long j2 = 0;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                ViewOnClickListenerC76430Tz8 LJLZ = matchBaseWidget.LJLZ(j);
                if (LJLZ != null) {
                    Long l2 = battleTeamUser.score;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    }
                    LJLZ.LJLLLL(j2, z);
                }
            }
        }
    }
}
