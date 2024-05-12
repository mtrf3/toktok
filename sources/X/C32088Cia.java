package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDxS75S0000000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.boostcard.LiveBoostcardApi;
import com.bytedance.android.livesdk.dataChannel.LiveDismissMoreDialogEvent;
import com.bytedance.android.livesdk.event.LiveBoostCardFreshChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.model.message.BoostCard;
import com.bytedance.android.livesdk.model.message.GiftBoostCardMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Cia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32088Cia implements OnMessageListener, InterfaceC72822Si2 {
    public DataChannel LJLIL;
    public long LJLILLLLZI;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public GiftBoostCardMessage LJLLILLLL;
    public boolean LJLLJ;
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public String LJLL = "";
    public final ArrayList<Long> LJLLI = new ArrayList<>();
    public final ARunnableS41S0100000_5 LJLLL = new ARunnableS41S0100000_5(this, 345);
    public final Handler LJLLLL = new Handler(C16880lQ.LLJJJJ());

    public final void onDestroy() {
        C32099Cil.LJII = false;
        this.LJLJJI = 0L;
        this.LJLJJL = 0L;
        this.LJLLI.clear();
        this.LJLJI.LIZLLL();
        C32099Cil.LIZJ = false;
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = false;
        C72818Shy.LJII("live_boost_use_card", this);
        this.LJLLLL.removeCallbacks(this.LJLLL);
    }

    public final void LIZ() {
        List<BoostCard> arrayList;
        int i;
        List<BoostCard> list;
        String str;
        GiftBoostCardMessage giftBoostCardMessage = this.LJLLILLLL;
        if (giftBoostCardMessage == null || (arrayList = giftBoostCardMessage.mCards) == null) {
            arrayList = new ArrayList();
        }
        for (BoostCard boostCard : arrayList) {
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null) {
                dataChannel.kv0(BCX.class);
            }
            String valueOf = String.valueOf(boostCard.mTaskId);
            String valueOf2 = String.valueOf(boostCard.mCardId);
            String valueOf3 = String.valueOf(boostCard.mTaskSource);
            boolean isAppForeground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
            if (isAppForeground) {
                str = "inapp";
            } else if (!isAppForeground) {
                str = "outapp";
            } else {
                throw new C162476Zf();
            }
            BZI LIZ = C28787BRn.LIZ("receive_boost_card");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(valueOf, "task_id");
            LIZ.LJIJJ(valueOf2, "card_id");
            C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "user_id", valueOf3, "task_source");
            LIZ.LJIJJ(str, "event_page");
            LIZ.LJJIIJZLJL();
        }
        C73943T0h LIZ2 = C73943T0h.LIZ();
        GiftBoostCardMessage giftBoostCardMessage2 = this.LJLLILLLL;
        if (giftBoostCardMessage2 != null && (list = giftBoostCardMessage2.mCards) != null) {
            i = list.size();
        } else {
            i = 1;
        }
        LIZ2.LIZIZ(new C30185Bsz(i));
        C65814PsI.LIZ().getClass();
        ((LiveBoostcardApi) C65814PsI.LIZJ(LiveBoostcardApi.class)).boostCardAck(this.LJLILLLLZI, 1).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS75S0000000_5(1));
        this.LJLJJLL = false;
    }

    public final void LIZIZ() {
        long LIZ = this.LJLJJI - C30725C4b.LIZ();
        if (LIZ <= 0) {
            C32099Cil.LIZJ = false;
            return;
        }
        C32099Cil.LIZJ = true;
        C32099Cil.LIZLLL = this.LJLJJI;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.kv0(BCX.class);
        }
        String str = C32099Cil.LJ;
        String str2 = C32099Cil.LJI;
        String str3 = C32099Cil.LJFF;
        BZI LIZ2 = C28787BRn.LIZ("boost_card_start_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(str, "task_id");
        LIZ2.LJIJJ(str2, "card_id");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(str3, "task_source");
        LIZ2.LJJIIJZLJL();
        String str4 = this.LJLL;
        o.LJIIIZ(str4, "<set-?>");
        C32099Cil.LIZ = str4;
        if (this.LJLLJ) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null) {
                CYQ cyq = new CYQ();
                cyq.LIZIZ = 1;
                String str5 = this.LJLL;
                o.LJIIIZ(str5, "<set-?>");
                cyq.LIZ = str5;
                dataChannel2.rv0(LiveBoostCardFreshChannel.class, cyq);
            }
        } else {
            CYQ cyq2 = new CYQ();
            cyq2.LIZIZ = 1;
            String str6 = this.LJLL;
            o.LJIIIZ(str6, "<set-?>");
            cyq2.LIZ = str6;
            C73943T0h.LIZ().LIZIZ(cyq2);
        }
        this.LJLJI.LIZ(AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 375)));
        this.LJLJI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(LIZ, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 367)));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof GiftBoostCardMessage)) {
            return;
        }
        this.LJLLILLLL = (GiftBoostCardMessage) iMessage;
        if (this.LJLJJLL) {
            this.LJLLLL.removeCallbacks(this.LJLLL);
            this.LJLLLL.postDelayed(this.LJLLL, 1000L);
        } else {
            this.LJLJL = true;
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        int i;
        String str;
        String str2;
        DataChannel dataChannel;
        InterfaceC78505UrV interfaceC78505UrV;
        InterfaceC78505UrV interfaceC78505UrV2;
        String asString;
        InterfaceC78505UrV interfaceC78505UrV3;
        InterfaceC78505UrV interfaceC78505UrV4;
        InterfaceC78505UrV interfaceC78505UrV5;
        if (o.LJ("live_boost_use_card", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            int i2 = 0;
            if (interfaceC78280Uns != null && (interfaceC78505UrV5 = interfaceC78280Uns.get("boost_end_time")) != null) {
                i = interfaceC78505UrV5.asInt();
            } else {
                i = 0;
            }
            this.LJLJJI = i * 1000;
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            String str3 = "";
            if (interfaceC78280Uns2 == null || (interfaceC78505UrV4 = interfaceC78280Uns2.get("card_id")) == null || (str = interfaceC78505UrV4.asString()) == null) {
                str = "";
            }
            C32099Cil.LJI = str;
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 == null || (interfaceC78505UrV3 = interfaceC78280Uns3.get("task_id")) == null || (str2 = interfaceC78505UrV3.asString()) == null) {
                str2 = "";
            }
            C32099Cil.LJ = str2;
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns4 != null && (interfaceC78505UrV2 = interfaceC78280Uns4.get("image_path")) != null && (asString = interfaceC78505UrV2.asString()) != null) {
                str3 = asString;
            }
            this.LJLL = str3;
            InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns5 != null && (interfaceC78505UrV = interfaceC78280Uns5.get("task_source")) != null) {
                i2 = interfaceC78505UrV.asInt();
            }
            String valueOf = String.valueOf(i2);
            o.LJIIIZ(valueOf, "<set-?>");
            C32099Cil.LJFF = valueOf;
            LIZIZ();
            if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle() && (dataChannel = this.LJLIL) != null) {
                dataChannel.pv0(LiveDismissMoreDialogEvent.class);
            }
        }
    }
}
