package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMsgQueueFetchStrategyFix;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayBlockMonitorDuration;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS68S0110000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UkU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78070UkU implements OSW {
    public final List<C78072UkW> LIZ;
    public final List<C78072UkW> LIZIZ;
    public DataChannel LIZJ;
    public final HashSet<String> LIZLLL;
    public final HashSet<String> LJ;
    public C78071UkV LJFF;

    public C78070UkU() {
        List<C78072UkW> linkedList;
        List<C78072UkW> linkedList2;
        GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
        if (giftReceiveMsgThreadSetting.getMultiThread()) {
            linkedList = Collections.synchronizedList(new LinkedList());
        } else {
            linkedList = new LinkedList<>();
        }
        this.LIZ = linkedList;
        if (giftReceiveMsgThreadSetting.getMultiThread()) {
            linkedList2 = Collections.synchronizedList(new LinkedList());
        } else {
            linkedList2 = new LinkedList<>();
        }
        this.LIZIZ = linkedList2;
        this.LIZLLL = new HashSet<>();
        this.LJ = new HashSet<>();
    }

    public final C78072UkW LIZIZ(C78106Ul4 c78106Ul4, boolean z) {
        List<C78072UkW> list;
        if (z) {
            list = this.LIZ;
        } else {
            list = this.LIZIZ;
        }
        Iterator<C78072UkW> it = list.iterator();
        while (it.hasNext()) {
            C78072UkW next = it.next();
            if (!c78106Ul4.LIZIZ.contains(next.LIZJ) && ((!c78106Ul4.LIZJ && next.LJJL != 1003) || !C78062UkM.LIZJ(next))) {
                C78072UkW c78072UkW = c78106Ul4.LIZ;
                int i = 0;
                if ((c78072UkW != null && o.LJ(next.LIZJ, c78072UkW.LIZJ) && !C78062UkM.LIZJ(next) && !C78062UkM.LIZJ(c78072UkW)) || c78106Ul4.LIZ == null) {
                    C32433Co9.LIZLLL(next, z);
                    it.remove();
                    if (this.LIZLLL.contains(next.LIZJ)) {
                        this.LIZLLL.remove(next.LIZJ);
                    }
                    if (GiftHighTrafficDropMessageSetting.INSTANCE.getSkipLowerCombo()) {
                        int i2 = next.LJIIIIZZ;
                        C78072UkW c78072UkW2 = c78106Ul4.LIZ;
                        if (c78072UkW2 != null) {
                            i = c78072UkW2.LJIIIIZZ;
                        }
                        if (i2 <= i) {
                        }
                    }
                    return next;
                }
                if (!LiveGiftMsgQueueFetchStrategyFix.INSTANCE.enable()) {
                    return null;
                }
            }
        }
        return null;
    }

    public final void LIZJ(C78072UkW c78072UkW, boolean z) {
        long j;
        long j2;
        int i;
        int i2;
        C78071UkV c78071UkV = this.LJFF;
        if (c78071UkV != null) {
            C78075UkZ c78075UkZ = c78071UkV.LJ;
            c78075UkZ.LJFF++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNewReceivedMessage latest(");
            LIZ.append(c78075UkZ.LJFF);
            LIZ.append(')');
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", X1D.LIZIZ(LIZ));
            C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue");
            if (c78075UkZ.LIZIZ) {
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue reported");
            } else if (c78075UkZ.LIZJ) {
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue monitoring");
            } else if (!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground()) {
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", "onMessageEnqueue app not in foreground");
            } else {
                c78075UkZ.LIZJ = true;
                c78075UkZ.LJ = System.currentTimeMillis();
                long value = LiveGiftTrayBlockMonitorDuration.INSTANCE.getValue();
                c78075UkZ.LJIILJJIL.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(value, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS65S0100000_13(c78075UkZ, 225)));
                List<C78072UkW> invoke = c78075UkZ.LIZ.invoke();
                c78075UkZ.LJIIJJI = C78075UkZ.LIZIZ(0, invoke);
                c78075UkZ.LJIIL = C78075UkZ.LIZIZ(1, invoke);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onMessageEnqueue start detect duration:");
                LIZ2.append(value);
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onMessageEnqueue start detect zero:");
                LIZ3.append(c78075UkZ.LJIIJJI);
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onMessageEnqueue start detect one:");
                LIZ4.append(c78075UkZ.LJIIL);
                C0NB.LIZIZ("LiveGiftTrayBlockMonitor", X1D.LIZIZ(LIZ4));
            }
        }
        c78072UkW.LJJI = C30725C4b.LIZ();
        int size = this.LIZ.size();
        int size2 = this.LIZIZ.size();
        int size3 = this.LIZ.size();
        int i3 = C32433Co9.LIZIZ.LIZIZ;
        GiftMessage giftMessage = c78072UkW.LIZ;
        if (giftMessage != null) {
            boolean LJIILLIIL = C32455CoV.LJIILLIIL();
            boolean LJIIZILJ = C32455CoV.LJIIZILJ(giftMessage);
            if (!GiftEventTrackSamplingSetting.shouldBlock(giftMessage) && (!GiftEventTrackSamplingSetting.enable() || (!LJIILLIIL && !LJIIZILJ))) {
                long LIZ5 = C30725C4b.LIZ();
                GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
                if (giftMonitorInfo != null) {
                    j = giftMonitorInfo.send_gift_req_start_ms;
                } else {
                    j = 0;
                }
                long j3 = LIZ5 - j;
                long LIZ6 = C30725C4b.LIZ();
                long j4 = c78072UkW.LJIL;
                long j5 = LIZ6 - j4;
                GiftMonitorInfo giftMonitorInfo2 = giftMessage.giftMonitorInfo;
                if (giftMonitorInfo2 != null) {
                    j2 = giftMonitorInfo2.send_gift_req_start_ms;
                } else {
                    j2 = 0;
                }
                long j6 = j4 - j2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                C32455CoV.LJI(giftMessage, jSONObject, jSONObject2);
                for (Map.Entry entry : ((LinkedHashMap) C32455CoV.LIZLLL(size, size2, size3, i3)).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject2.put("send_receive_im_dur", j6);
                jSONObject2.put("send_im_enqueue_dur", j3);
                jSONObject2.put("before_queue_dur", j5);
                ArrayList<C32665Crt> arrayList = c78072UkW.LJJIJLIJ;
                if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<C32665Crt> it = arrayList.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if ((!it.next().LJLJI) && (i = i + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                jSONObject2.put("msg_total", i);
                ArrayList<C32665Crt> arrayList2 = c78072UkW.LJJIJLIJ;
                if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator<C32665Crt> it2 = arrayList2.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (it2.next().LJLJI && (i2 = i2 + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                jSONObject2.put("interrupted_msg_total", i2);
                BZI LIZ7 = C28787BRn.LIZ("gift_msg_enqueue");
                LIZ7.LJJ(jSONObject);
                LIZ7.LJJ(jSONObject2);
                LIZ7.LJJ(jSONObject3);
                C32463Cod.LIZ(LIZ7, giftMessage);
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ7.LJIILL())) {
                    LIZ7.LJIIZILJ();
                    LIZ7.LJJIIJZLJL();
                } else {
                    LIZ7.LJJIJ();
                    LIZ7.LJI();
                    LIZ7.LJJIIZI();
                }
                if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_enqueue", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                    C0K2.LJI("ttlive_gift_msg_enqueue", jSONObject, jSONObject3, jSONObject2);
                }
            }
        }
        c78072UkW.LJJIZ.O("enqueue");
        C32464Coe.LIZ(c78072UkW, true);
        if (c78072UkW.LIZ == null) {
            C78983UzD.LJIJ(new Throwable("load gift is null"), "LynxGiftChannelPreload");
        } else if (!C78062UkM.LIZLLL(c78072UkW)) {
            C0NB.LJIIIZ("LynxGiftChannelPreload", " this is not big gift ");
        } else {
            GiftMessage giftMessage2 = c78072UkW.LIZ;
            long LIZ8 = C32394CnW.LIZ(giftMessage2.mGift, giftMessage2.colorId);
            AssetsModel LIZIZ = C32341Cmf.LIZIZ(LIZ8);
            if (LIZIZ == null) {
                C44878HjO.LIZJ(" assetsModel is null effect id is ", LIZ8, "LynxGiftChannelPreload");
            } else {
                OST.LIZ(LIZIZ, c78072UkW, 4);
            }
        }
        if (c78072UkW.LJJJJJL) {
            List<C78072UkW> selfMessageQueue = this.LIZ;
            o.LJIIIIZZ(selfMessageQueue, "selfMessageQueue");
            C78074UkY.LIZIZ(c78072UkW, selfMessageQueue, this.LJ, true, z, new AqS68S0110000_13(this, z, 5));
        } else {
            List<C78072UkW> outerMessageQueue = this.LIZIZ;
            o.LJIIIIZZ(outerMessageQueue, "outerMessageQueue");
            C78074UkY.LIZIZ(c78072UkW, outerMessageQueue, this.LIZLLL, false, z, new AqS68S0110000_13(this, z, 6));
        }
        C0NB.LJIIIZ("GiftTray", "receiveGiftMessage");
    }

    @Override // X.OSW
    public final void LIZ(long j, C78072UkW c78072UkW, int i) {
        GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
        List<C78072UkW> selfMessageQueue = this.LIZ;
        o.LJIIIIZZ(selfMessageQueue, "selfMessageQueue");
        if (giftReceiveMsgThreadSetting.getMultiThread()) {
            synchronized (selfMessageQueue) {
                List<C78072UkW> selfMessageQueue2 = this.LIZ;
                o.LJIIIIZZ(selfMessageQueue2, "selfMessageQueue");
                for (C78072UkW c78072UkW2 : selfMessageQueue2) {
                    if (o.LJ(c78072UkW2, c78072UkW) || c78072UkW2.LJJJJIZL == j) {
                        c78072UkW2.LJJL = i;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("update success ");
                        LIZ.append(i);
                        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
                    }
                }
            }
        } else {
            List<C78072UkW> selfMessageQueue3 = this.LIZ;
            o.LJIIIIZZ(selfMessageQueue3, "selfMessageQueue");
            for (C78072UkW c78072UkW3 : selfMessageQueue3) {
                if (o.LJ(c78072UkW3, c78072UkW) || c78072UkW3.LJJJJIZL == j) {
                    c78072UkW3.LJJL = i;
                    QZP.LIZJ("update success ", i, "LynxGiftChannelPreload");
                }
            }
        }
        GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting2 = GiftReceiveMsgThreadSetting.INSTANCE;
        List<C78072UkW> outerMessageQueue = this.LIZIZ;
        o.LJIIIIZZ(outerMessageQueue, "outerMessageQueue");
        if (giftReceiveMsgThreadSetting2.getMultiThread()) {
            synchronized (outerMessageQueue) {
                List<C78072UkW> outerMessageQueue2 = this.LIZIZ;
                o.LJIIIIZZ(outerMessageQueue2, "outerMessageQueue");
                for (C78072UkW c78072UkW4 : outerMessageQueue2) {
                    if (o.LJ(c78072UkW4, c78072UkW) || c78072UkW4.LJJJJIZL == j) {
                        c78072UkW4.LJJL = i;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("update success ");
                        LIZ2.append(i);
                        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ2));
                    }
                }
            }
        } else {
            List<C78072UkW> outerMessageQueue3 = this.LIZIZ;
            o.LJIIIIZZ(outerMessageQueue3, "outerMessageQueue");
            for (C78072UkW c78072UkW5 : outerMessageQueue3) {
                if (o.LJ(c78072UkW5, c78072UkW) || c78072UkW5.LJJJJIZL == j) {
                    c78072UkW5.LJJL = i;
                    QZP.LIZJ("update success ", i, "LynxGiftChannelPreload");
                }
            }
        }
        C78071UkV c78071UkV = this.LJFF;
        if (c78071UkV != null) {
            c78071UkV.LIZ();
        }
    }
}
