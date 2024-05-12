package Y;

import X.C31319CQx;
import X.C76800UCe;
import X.CRA;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ARunnableS4S0200100_5 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((PublicScreenService) this.l0).LJLJLJ.put(this.j2, (HistoryInfo) this.l1);
        List<C31319CQx<? extends CRA>> list = ((PublicScreenService) this.l0).LJLJI.get(this.j2);
        if (list != null) {
            HistoryInfo historyInfo = (HistoryInfo) this.l1;
            Iterator<C31319CQx<? extends CRA>> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJLJJL(historyInfo);
            }
        }
    }

    public static final void run$0(ARunnableS4S0200100_5 aRunnableS4S0200100_5) {
        boolean LIZ;
        try {
            aRunnableS4S0200100_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0200100_5 aRunnableS4S0200100_5) {
        boolean LIZ;
        try {
            ((MultiLiveInviterShareHelper) aRunnableS4S0200100_5.l0).LJII.remove(Long.valueOf(aRunnableS4S0200100_5.j2));
            ((InterfaceC88472Yns) aRunnableS4S0200100_5.l1).invoke(Long.valueOf(aRunnableS4S0200100_5.j2));
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.ARunnableS4S0200100_5) (LINE:67108871) Y.ARunnableS4S0200100_5.l1 java.lang.Object, block:B:1:0x0000 */
    public ARunnableS4S0200100_5(Object obj, MultiLiveInviterShareHelper multiLiveInviterShareHelper, long j, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns) {
        Object obj2;
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.j2 = multiLiveInviterShareHelper;
        this.l1 = obj2;
    }
}
