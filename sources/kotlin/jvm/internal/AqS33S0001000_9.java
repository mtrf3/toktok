package kotlin.jvm.internal;

import X.AbstractC53958LFq;
import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C43I;
import X.C55793Lv3;
import X.C56386MBa;
import X.C57051MaF;
import X.C57052MaG;
import X.C57053MaH;
import X.C57949Moj;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8V4;
import X.InterfaceC88472Yns;
import X.LZ5;
import X.MT0;
import X.MT3;
import X.ORZ;
import android.os.SystemClock;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.base.assem.FeedSkylightMaskAssem;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class AqS33S0001000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS33S0001000_9(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        C57949Moj setState = (C57949Moj) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C57949Moj.LIZ(setState, null, null, false, new C43I(Integer.valueOf(aqS33S0001000_9.i0)), 7);
    }

    public static final Object invoke$1(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        TrendsTabState state = (TrendsTabState) obj;
        o.LJIIIZ(state, "state");
        Iterator<Object> it = state.getSubstate().getList().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int i2 = aqS33S0001000_9.i0;
        if (i2 < 0 || i2 < i || i2 >= state.getSubstate().getList().size()) {
            return Integer.valueOf(aqS33S0001000_9.i0);
        }
        return ORZ.LJLLLLLL(aqS33S0001000_9.i0, state.getSubstate().getList());
    }

    public static final Object invoke$2(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C55793Lv3.LIZ(sendLog);
        sendLog.LIZLLL("request_type", Integer.valueOf(aqS33S0001000_9.i0));
        sendLog.LIZLLL("start_click_to_now", Long.valueOf(System.currentTimeMillis() - C55793Lv3.LJIIIIZZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(FeedSkylightMaskAssem.class);
        uiContentAssem.LJIIIIZZ = new FeedSkylightMaskAssem();
        uiContentAssem.LJI = aqS33S0001000_9.i0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        C56386MBa setState = (C56386MBa) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C56386MBa.LIZ(setState, null, null, null, null, null, Integer.valueOf(aqS33S0001000_9.i0), false, 0, 0, 479);
    }

    public static final Object invoke$5(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        MT0 setState = (MT0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return MT0.LIZ(setState, null, new MT3(Integer.valueOf(aqS33S0001000_9.i0)), null, null, null, null, null, false, false, null, 2045);
    }

    public static final Object invoke$6(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        LZ5 setState = (LZ5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return LZ5.LIZ(setState, false, false, aqS33S0001000_9.i0, false, null, 27);
    }

    public static final Object invoke$7(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        AbstractC53958LFq LIZIZ;
        TopTabProtocol invoke = (TopTabProtocol) obj;
        o.LJIIIZ(invoke, "$this$invoke");
        if (invoke.LJI() == aqS33S0001000_9.i0 && (LIZIZ = invoke.LJFF().LIZIZ()) != null) {
            LIZIZ.LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS33S0001000_9 aqS33S0001000_9, Object obj) {
        C57051MaF withMeta = (C57051MaF) obj;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LJIIIIZZ = SystemClock.uptimeMillis();
        if (aqS33S0001000_9.i0 == 0) {
            if (withMeta.LJII != 1) {
                withMeta.LJII = 2;
            }
            C57052MaG c57052MaG = C57052MaG.LJLIL;
            C57051MaF c57051MaF = C57053MaH.LIZ;
            if (c57051MaF != null) {
                c57052MaG.invoke(c57051MaF);
            }
        }
        return C76800UCe.LIZ;
    }
}
