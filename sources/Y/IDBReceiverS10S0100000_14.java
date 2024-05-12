package Y;

import X.C16880lQ;
import X.C1DH;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C48012Isq;
import X.C48189Ivh;
import X.C48651J7n;
import X.C79349VCf;
import X.C79375VDf;
import X.C80024Vau;
import X.C84740XNo;
import X.C84741XNp;
import X.C84763XOl;
import X.EnumC48190Ivi;
import X.EnumC79517VIr;
import X.InterfaceC80022Vas;
import X.OJM;
import X.VD6;
import X.VKB;
import X.VKC;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import com.ss.android.videoshop.context.LifeCycleObserver;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public class IDBReceiverS10S0100000_14 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                return;
            case 1:
                onReceive$1(this, context, intent);
                return;
            case 2:
                onReceive$2(this, context, intent);
                return;
            case 3:
                onReceive$3(this, context, intent);
                return;
            case 4:
                onReceive$4(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$3() {
        if (((C84741XNp) this.l0).LJFF.LIZJ()) {
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                ((C84741XNp) this.l0).LIZIZ.LIZIZ(new C48651J7n("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
            } else {
                C1DH.LJJIJIIJI(new ARunnableS50S0100000_14((C84741XNp) this.l0, 215));
            }
        }
    }

    public final void LIZ$2(Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                VKB vkb = (VKB) this.l0;
                vkb.LIZIZ = C48012Isq.LIZIZ(vkb.LIZ);
                OJM<VKC> ojm = ((VKB) this.l0).LIZJ;
                if (ojm != null) {
                    Iterator<VKC> it = ojm.iterator();
                    while (it.hasNext()) {
                        VKC next = it.next();
                        if (next != null) {
                            next.LIZ();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public IDBReceiverS10S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$0(Context context, Intent intent) {
        EnumC48190Ivi LJ = C48189Ivh.LJ(context);
        EnumC79517VIr enumC79517VIr = (EnumC79517VIr) this.l0;
        if (enumC79517VIr.networkType != LJ) {
            enumC79517VIr.networkType = LJ;
            if (enumC79517VIr.currentVideoContext != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onNetWorkChanged networkType:");
                LIZ.append(LJ);
                X1D.LIZIZ(LIZ);
                ((EnumC79517VIr) this.l0).currentVideoContext.notifyEvent(new C79375VDf());
                Iterator<Map.Entry<Lifecycle, LifeCycleObserver>> it = ((EnumC79517VIr) this.l0).currentVideoContext.lifeCycleVideoHandlerMap.entrySet().iterator();
                while (it.hasNext()) {
                    LifeCycleObserver value = it.next().getValue();
                    if (value != null) {
                        value.onNetWorkChanged(LJ, ((EnumC79517VIr) this.l0).currentVideoContext, context, intent);
                    }
                }
            }
        }
    }

    public final void LIZ$1(Context context, Intent intent) {
        Map<String, VD6> map;
        if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (!LiveStrategyManager.isNetworkAvailable(context)) {
            if (DnsOptimizer.LJFF().LJIILL) {
                ((LiveStrategyManager) this.l0).mHandler.removeMessages(1024);
                ((LiveStrategyManager) this.l0).mHandler.post(new ARunnableS20S0000000_14(6));
                return;
            }
            return;
        }
        if (DnsOptimizer.LJFF().LJIILL) {
            ((LiveStrategyManager) this.l0).mHandler.removeMessages(1024);
            ((LiveStrategyManager) this.l0).mHandler.post(new ARunnableS50S0100000_14(this, 131));
        }
        C79349VCf c79349VCf = LiveStrategyManager.mLiveIOEngine;
        if (c79349VCf != null && (map = c79349VCf.LIZLLL) != null && !((ArrayMap) map).isEmpty()) {
            ((ArrayMap) c79349VCf.LIZLLL).clear();
        }
    }

    public static final void onReceive$0(IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS10S0100000_14.LIZ$0(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS10S0100000_14.LIZ$0(context, intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS10S0100000_14.LIZ$1(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS10S0100000_14.LIZ$1(context, intent);
        }
    }

    public static final void onReceive$2(IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS10S0100000_14.LIZ$2(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS10S0100000_14.LIZ$2(intent);
        }
    }

    public static final void onReceive$3(IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS10S0100000_14.LIZ$3();
        } else {
            C38523F9z.LIZ();
            iDBReceiverS10S0100000_14.LIZ$3();
        }
    }

    public static final void onReceive$4(IDBReceiverS10S0100000_14 iDBReceiverS10S0100000_14, Context context, Intent intent) {
        InterfaceC80022Vas interfaceC80022Vas;
        InterfaceC80022Vas interfaceC80022Vas2;
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C80024Vau c80024Vau = ((C84740XNo) ((AqS164S0100000_14) iDBReceiverS10S0100000_14.l0).l0).LJLIL;
            if (c80024Vau != null && (interfaceC80022Vas2 = c80024Vau.LJLJJL) != null) {
                interfaceC80022Vas2.LIZIZ(new C48651J7n("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                return;
            }
            return;
        }
        C38523F9z.LIZ();
        C80024Vau c80024Vau2 = ((C84740XNo) ((AqS164S0100000_14) iDBReceiverS10S0100000_14.l0).l0).LJLIL;
        if (c80024Vau2 == null || (interfaceC80022Vas = c80024Vau2.LJLJJL) == null) {
            return;
        }
        interfaceC80022Vas.LIZIZ(new C48651J7n("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
    }
}
