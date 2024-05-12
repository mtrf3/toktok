package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.setting.EnableCalculateOcrToClientDurationSwitcher;
import com.bytedance.android.livesdk.model.message.GameOCRPingMessage;
import com.bytedance.android.livesdk.model.message.HighlightFragmentReadyMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1NX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NX implements OnMessageListener {
    public static final List<String> LJLJJLL = new ArrayList();
    public final ActivityC45651qj LJLIL;
    public final DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public IMessageManager LJLJJI;
    public long LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(final IMessage iMessage) {
        long j;
        DataChannel dataChannel;
        if (iMessage instanceof HighlightFragmentReadyMessage) {
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handle HighlightFragmentReadyMessage. message -> ");
                LIZ.append(iMessage);
                C0NB.LJIIIZ("GameBroadcastMessageStationWidget", X1D.LIZIZ(LIZ));
            }
            GameLiveFragment gameLiveFragment = ((HighlightFragmentReadyMessage) iMessage).gameLiveFragment;
            if (gameLiveFragment != null) {
                ArrayList arrayList = (ArrayList) LJLJJLL;
                if (arrayList.contains(gameLiveFragment.fragmentIdStr)) {
                    String str = gameLiveFragment.fragmentIdStr;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("fragment_id", str);
                    linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    C0K2.LJII(-2, O5Y.LJJL("ttlive_highlight_to_draft_monitor"), linkedHashMap);
                    ((IGameService) CN1.LIZ(IGameService.class)).uu(this.LJLIL, gameLiveFragment);
                    arrayList.remove(gameLiveFragment.fragmentIdStr);
                    return;
                }
                return;
            }
            return;
        }
        if (iMessage instanceof MemberMessage) {
            if (!((BaseMessage) iMessage).isCurrentRoom(this.LJLJJL) || (dataChannel = this.LJLILLLLZI) == null) {
                return;
            }
            dataChannel.rv0(MemberMessageChannel.class, iMessage);
            return;
        }
        if (!(iMessage instanceof GameOCRPingMessage)) {
            return;
        }
        GameOCRPingMessage gameOCRPingMessage = (GameOCRPingMessage) iMessage;
        if (!gameOCRPingMessage.isCurrentRoom(this.LJLJJL)) {
            return;
        }
        C19700py.LIZ.getClass();
        List<Long> rttList = C19700py.LJI;
        o.LJIIIIZZ(rttList, "rttList");
        Long l = (Long) ORZ.LLFII(rttList);
        if (l != null) {
            l.longValue();
        }
        synchronized (C31035CFz.LIZ) {
            if (EnableCalculateOcrToClientDurationSwitcher.INSTANCE.isEnable()) {
                C31034CFy c31034CFy = C31035CFz.LIZIZ;
                c31034CFy.LIZ = gameOCRPingMessage;
                c31034CFy.LIZIZ = false;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                Long l2 = (Long) dataChannelGlobal.mv0(ServerAndClientTimeGapGlobalChannel.class);
                long j2 = -1;
                if (l2 != null) {
                    j = l2.longValue();
                } else {
                    j = -1;
                }
                Long l3 = (Long) dataChannelGlobal.mv0(GameCreateInfoRttGlobalChannel.class);
                if (l3 != null) {
                    j2 = l3.longValue();
                }
                long currentTimeMillis = System.currentTimeMillis();
                c31034CFy.LIZJ = (currentTimeMillis - gameOCRPingMessage.pingTimestamp) + j;
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("markLatestNotReportPingInfo(). rtt=");
                    LIZ2.append(j2);
                    LIZ2.append(", gap=");
                    LIZ2.append(j);
                    LIZ2.append(", pingTimestamp=");
                    LIZ2.append(gameOCRPingMessage.pingTimestamp);
                    LIZ2.append(", currentTimestamp=");
                    LIZ2.append(currentTimeMillis);
                    LIZ2.append(", duration=");
                    LIZ2.append(c31034CFy.LIZJ);
                    C0NB.LJIIIZ("GamePingCollectCenter", X1D.LIZIZ(LIZ2));
                }
            }
        }
        final double d = gameOCRPingMessage.confidence;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("GameOCRPingMessage: ping=");
            LIZ3.append(gameOCRPingMessage.pingValue);
            LIZ3.append(", isGame=");
            LIZ3.append(gameOCRPingMessage.isGame);
            LIZ3.append(", gameFusionLabel=");
            LIZ3.append(gameOCRPingMessage.gameFusionLabel);
            LIZ3.append(",confidence=");
            LIZ3.append(gameOCRPingMessage.confidence);
            C0NB.LJIIIZ("GameBroadcastMessageStationWidget", X1D.LIZIZ(LIZ3));
        }
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.1NW
            /* JADX WARN: Removed duplicated region for block: B:118:0x024e  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x02a4  */
            @Override // X.InterfaceC64592gB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 996
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1NW.accept(java.lang.Object):void");
            }
        });
    }

    public C1NX(ActivityC45651qj activityC45651qj, DataChannel dataChannel) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = dataChannel;
    }
}
