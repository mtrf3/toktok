package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.GiftHistoryNumChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CPp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31285CPp implements InterfaceC31286CPq, OnMessageListener {
    public DataChannel LJLIL;
    public IMessageManager LJLILLLLZI;
    public int LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public C73318Sq2 LJLJJLL = new C73318Sq2();
    public final ArrayList<GiftMessage> LJLJL = new ArrayList<>();
    public CopyOnWriteArrayList<InterfaceC31288CPs> LJLJLJ = new CopyOnWriteArrayList<>();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C31287CPr.LJLIL);

    @Override // X.InterfaceC31286CPq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC31286CPq
    public final void LIZLLL() {
        IMessageManager iMessageManager;
        this.LJLJJL = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopGiftMessageCount() countingGiftMessage = ");
        LIZ.append(this.LJLJI);
        LIZ.append(",lastTimeCountingGiftMessage = ");
        LIZ.append(this.LJLJJI);
        C0NB.LJIIIZ("GiftHistoryManager", X1D.LIZIZ(LIZ));
        if (System.currentTimeMillis() - this.LJLJJI > 18000000 && this.LJLJI >= 3 && (iMessageManager = this.LJLILLLLZI) != null) {
            long LJII = LJII();
            int i = this.LJLJI;
            String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.lw, i, Integer.valueOf(i));
            o.LJIIIIZZ(LJIIIIZZ, "getQuantityString(\n     …age\n                    )");
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lns);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_giftrecords_capsule_button)");
            iMessageManager.insertMessage(new C4H(LJII, LJIIIIZZ, LJIILJJIL), true);
            this.LJLJJI = System.currentTimeMillis();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_gift_notice_show");
            LIZ2.LJIJJ(this.LJLJLLL.getValue(), "anchor_id");
            LIZ2.LJIJJ("screen_share", "live_type");
            LIZ2.LJIJJ(Long.valueOf(LJII()), "room_id");
            LIZ2.LJJIIJZLJL();
        }
        this.LJLJI = 0;
    }

    @Override // X.InterfaceC31286CPq
    public final void LJFF() {
        this.LJLJI = 0;
        this.LJLJJL = true;
    }

    public static final long LJII() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    @Override // X.InterfaceC31286CPq
    public final void release() {
        C0NB.LJIIIZ("GiftHistoryManager", "release()");
        C73318Sq2 c73318Sq2 = this.LJLJJLL;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJJLL = null;
        CopyOnWriteArrayList<InterfaceC31288CPs> copyOnWriteArrayList = this.LJLJLJ;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.LJLJLJ = null;
        IMessageManager iMessageManager = this.LJLILLLLZI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLILLLLZI = null;
        this.LJLIL = null;
    }

    @Override // X.InterfaceC31286CPq
    public final List<GiftMessage> LIZ() {
        return this.LJLJL;
    }

    public C31285CPp(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // X.InterfaceC31286CPq
    public final void LIZJ(InterfaceC31288CPs listener) {
        o.LJIIIZ(listener, "listener");
        CopyOnWriteArrayList<InterfaceC31288CPs> copyOnWriteArrayList = this.LJLJLJ;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(listener);
        }
    }

    @Override // X.InterfaceC31286CPq
    public final void LJ(InterfaceC31288CPs listener) {
        CopyOnWriteArrayList<InterfaceC31288CPs> copyOnWriteArrayList;
        o.LJIIIZ(listener, "listener");
        CopyOnWriteArrayList<InterfaceC31288CPs> copyOnWriteArrayList2 = this.LJLJLJ;
        if ((copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.contains(listener)) && (copyOnWriteArrayList = this.LJLJLJ) != null) {
            copyOnWriteArrayList.add(listener);
        }
    }

    @Override // X.InterfaceC31286CPq
    public final void LJI(IMessageManager iMessageManager) {
        if (iMessageManager == null) {
            C0NB.LJIIIZ("GiftHistoryManager", "initMessageListener() manager is null");
            return;
        }
        if (o.LJ(this.LJLILLLLZI, iMessageManager)) {
            C0NB.LJIIIZ("GiftHistoryManager", "initMessageListener() messageManager equal manager");
            return;
        }
        IMessageManager iMessageManager2 = this.LJLILLLLZI;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(this);
        }
        this.LJLILLLLZI = iMessageManager;
        iMessageManager.addMessageListener(EnumC31509CYf.GIFT.getIntType(), this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initMessageListener() success roomId = ");
        LIZ.append(LJII());
        C0NB.LJIIIZ("GiftHistoryManager", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof GiftMessage)) {
            return;
        }
        GiftMessage giftMessage = (GiftMessage) iMessage;
        Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(giftMessage.giftId);
        if ((findGiftById != null || (findGiftById = giftMessage.mGift) != null) && ((findGiftById.combo && giftMessage.repeatEnd == 0) || findGiftById.type == 11)) {
            return;
        }
        if (this.LJLJJL) {
            this.LJLJI++;
        }
        this.LJLJL.add(iMessage);
        CopyOnWriteArrayList<InterfaceC31288CPs> copyOnWriteArrayList = this.LJLJLJ;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC31288CPs> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ(iMessage);
            }
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(GiftHistoryNumChannel.class, Integer.valueOf(this.LJLJL.size()));
        }
    }
}
