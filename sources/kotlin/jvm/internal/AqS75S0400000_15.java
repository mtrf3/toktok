package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C76800UCe;
import X.CN0;
import X.InterfaceC65784Pro;
import X.X1D;
import X.YRW;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.mutilinstance.DelegateCore;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import java.util.Set;

/* loaded from: classes16.dex */
public class AqS75S0400000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        Set<OnMessageListener> set = (Set) this.l0;
        IMessage iMessage = (IMessage) this.l1;
        YRW yrw = (YRW) this.l2;
        List list = (List) this.l3;
        for (OnMessageListener onMessageListener : set) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            onMessageListener.onMessage(iMessage);
            if (SystemClock.elapsedRealtime() - elapsedRealtime >= yrw.LJI) {
                list.add(C16880lQ.LJLLJ(onMessageListener.getClass()));
                if (CN0.LIZ) {
                    MessageMonitor LIZJ = yrw.LIZ.LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("a message has timeout!!! ");
                    LIZ.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    LIZ.append("ms, method: ");
                    LIZ.append(iMessage.getMethodName());
                    LIZ.append(", from: ");
                    LIZ.append(onMessageListener.getClass());
                    LIZJ.log("MessageDispatchDelegate", X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public static final Object invoke$0(AqS75S0400000_15 aqS75S0400000_15) {
        IPitayaCore realCore$pitayacore_release = ((DelegateCore) aqS75S0400000_15.l0).getRealCore$pitayacore_release();
        if (realCore$pitayacore_release != null) {
            realCore$pitayacore_release.cleanStorage((Context) aqS75S0400000_15.l1, (List) aqS75S0400000_15.l2, (PTYNormalCallback) aqS75S0400000_15.l3);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS75S0400000_15 aqS75S0400000_15) {
        aqS75S0400000_15.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S0400000_15(DelegateCore delegateCore, Context context, List list, PTYNormalCallback pTYNormalCallback, int i) {
        super(0);
        this.$t = i;
        this.l0 = delegateCore;
        this.l1 = context;
        this.l2 = list;
        this.l3 = pTYNormalCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS75S0400000_15(Set set, Set<OnMessageListener> set2, IMessage iMessage, YRW yrw, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = set;
        this.l1 = set2;
        this.l2 = iMessage;
        this.l3 = yrw;
    }
}
