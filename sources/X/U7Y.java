package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostLeaveChannelBugfixSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7Y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ U7T LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7Y(U7T u7t, String str, boolean z) {
        super(0);
        this.LJLIL = u7t;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean LJJJJZ;
        U67 u67;
        U7T u7t = this.LJLIL;
        if (u7t.LJIJJ) {
            C32014ChO.LJFF(U7T.LJJJJJ(355), "destroy linker is destroying .");
        } else {
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                LJJJJZ = this.LJLIL.LJJJJZ(10014, this.LJLILLLLZI, this.LJLJI);
            } else {
                LJJJJZ = this.LJLIL.LJJJJZ(10014, "leave_source_cancel_with_other", this.LJLJI);
            }
            u7t.LJIJJ = LJJJJZ;
            U7T u7t2 = this.LJLIL;
            C76683U7r c76683U7r = u7t2.LJIILJJIL;
            c76683U7r.LIZ = 0;
            c76683U7r.LIZIZ = null;
            u7t2.LJIIIZ.LJJJJJL((U77) u7t2.LJJL.getValue());
            this.LJLIL.LJIIIZ.LJI(this.LJLILLLLZI);
            U7T u7t3 = this.LJLIL;
            C76669U7d c76669U7d = u7t3.LJIIL;
            c76669U7d.getClass();
            c76669U7d.LIZJ.clear();
            Object listener = c76669U7d.LJIIL.getValue();
            o.LJIIIZ(listener, "listener");
            u7t3.LJIIIIZZ.remove(listener);
            u7t3.LJIIIZ.LJJJJJL((InterfaceC76734U9q) c76669U7d.LJIILIIL.getValue());
            c76669U7d.LIZLLL = null;
            c76669U7d.LJ = null;
            U7T u7t4 = this.LJLIL;
            U7Z u7z = u7t4.LJIIJJI;
            u7z.getClass();
            Object listener2 = u7z.LJIJ.getValue();
            o.LJIIIZ(listener2, "listener");
            u7t4.LJIIIIZZ.remove(listener2);
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                u7z.LJIJ(new ArrayList());
                u7z.LJIJJ(new ArrayList());
                u7z.LJIJJLI(new ArrayList());
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                u7z.LJIIZILJ(c61878OQg);
                u7z.LJIILLIIL(c61878OQg);
                u7z.LJIILL(c61878OQg);
                u7z.LJIILIIL(c61878OQg);
                u7z.LJIILJJIL(C113554cx.LJJJLIIL());
                u7z.LJJI(c61878OQg);
                u7z.LIZJ.LIZLLL();
            } else {
                u7z.LJIJ(new ArrayList());
                u7z.LJIJJ(new ArrayList());
                u7z.LJIJJLI(new ArrayList());
                u7z.LJIIZILJ(C61878OQg.INSTANCE);
            }
            u7z.LJIIZILJ.clear();
            u7z.LIZ = null;
            u7z.LIZIZ = false;
            if (MtCoHostLeaveChannelBugfixSetting.isEnable()) {
                U7T u7t5 = this.LJLIL;
                if (u7t5.LJFF == 4) {
                    ((U70) u7t5.LJIILLIIL.getValue()).LJJLI(this.LJLIL);
                }
            } else {
                ((U70) this.LJLIL.LJIILLIIL.getValue()).LJJLI(this.LJLIL);
            }
            if (LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().enable) {
                if (MtCoHostLeaveChannelBugfixSetting.isEnable()) {
                    U7T u7t6 = this.LJLIL;
                    if (u7t6.LJFF == 4 && (u67 = u7t6.LJIIZILJ) != null) {
                        u67.LIZIZ();
                    }
                } else {
                    U67 u672 = this.LJLIL.LJIIZILJ;
                    if (u672 != null) {
                        u672.LIZIZ();
                    }
                }
            }
            C76679U7n c76679U7n = (C76679U7n) this.LJLIL.LJJLIIIJILLIZJL.getValue();
            c76679U7n.LIZIZ.LIZLLL();
            ((CopyOnWriteArraySet) c76679U7n.LIZLLL).clear();
            U71 LJJIJIIJIL = this.LJLIL.LJJIJIIJIL();
            LJJIJIIJIL.LIZIZ.LIZLLL();
            LJJIJIIJIL.LIZLLL.clear();
            ((CopyOnWriteArraySet) LJJIJIIJIL.LJFF).clear();
            Iterator<Map.Entry<Long, InterfaceC92693kP>> it = LJJIJIIJIL.LIZJ.entrySet().iterator();
            while (it.hasNext()) {
                C29306Beo.LJJJJI(it.next().getValue());
            }
            LJJIJIIJIL.LIZJ.clear();
            U7T u7t7 = LJJIJIIJIL.LIZ;
            u7t7.getClass();
            u7t7.LJIIIIZZ.remove(LJJIJIIJIL);
            LJJIJIIJIL.LIZ.LJIIIZ.LJJJJJL(LJJIJIIJIL);
            this.LJLIL.LJII.clear();
            U7T u7t8 = this.LJLIL;
            Iterator<InterfaceC76675U7j> it2 = u7t8.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJJLL(u7t8);
            }
            this.LJLIL.LJIIIIZZ.clear();
            U7T u7t9 = this.LJLIL;
            if (!u7t9.LJIJJ) {
                u7t9.LJIILL.LIZLLL();
                if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                    this.LJLIL.LJJII();
                }
            }
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                U7T u7t10 = this.LJLIL;
                if (u7t10.LJFF == 2) {
                    C76662U6w LJJIZ = u7t10.LJJIZ();
                    LJJIZ.getClass();
                    U7V.LJIILJJIL(new AqS163S0100000_13(LJJIZ, 434));
                    U86 u86 = (U86) this.LJLIL.LJJLIIIIJ.getValue();
                    u86.getClass();
                    U7V.LJIILJJIL(new AqS163S0100000_13(u86, 436));
                    C76677U7l c76677U7l = this.LJLIL.LJJLIIIJ;
                    if (c76677U7l != null) {
                        c76677U7l.LIZ();
                    }
                    this.LJLIL.LJJLIIIJJIZ.clear();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
