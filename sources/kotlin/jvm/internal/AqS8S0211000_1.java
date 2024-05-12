package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16970lZ;
import X.C1DH;
import X.C57082Lw;
import X.C76800UCe;
import X.C99893w1;
import X.C99933w5;
import X.C99963w8;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS8S0211000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AqS8S0211000_1 aqS8S0211000_1) {
        if (aqS8S0211000_1.i3 == ((List) aqS8S0211000_1.l0).size() - 1) {
            C99893w1 c99893w1 = (C99893w1) aqS8S0211000_1.l1;
            boolean z = aqS8S0211000_1.z2;
            c99893w1.getClass();
            C99933w5 c99933w5 = new C99933w5(true, z, c99893w1.LIZ.getDisableLocateMsgWhenEnter());
            C57082Lw.LIZ.LIZJ("#UPDATE_SUG_EVENT").setValue(c99933w5);
            if (c99933w5.LJLIL || !c99933w5.LJLILLLLZI) {
                ChatRoomViewModel chatRoomViewModel = c99893w1.LIZIZ;
                C99963w8 event = C99963w8.LIZ;
                chatRoomViewModel.getClass();
                o.LJIIIZ(event, "event");
                chatRoomViewModel.LJLLLL.onNext(event);
            }
        } else {
            final C99893w1 c99893w12 = (C99893w1) aqS8S0211000_1.l1;
            final List list = (List) aqS8S0211000_1.l0;
            final int i = aqS8S0211000_1.i3;
            final boolean z2 = aqS8S0211000_1.z2;
            C1DH.LJJIJIIJIL(20L, new Runnable() { // from class: X.3w4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        c99893w12.LIZIZ(i + 1, z2, list);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S0211000_1 aqS8S0211000_1) {
        View LIZJ = C16970lZ.LIZJ(aqS8S0211000_1.i3, (Activity) aqS8S0211000_1.l0, (ViewGroup) aqS8S0211000_1.l1, aqS8S0211000_1.z2);
        o.LJIIIIZZ(LIZJ, "inflate(context, layoutId, container, attach)");
        return LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0211000_1(int i, C99893w1 c99893w1, List list, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l0 = list;
        this.l1 = c99893w1;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0211000_1(int i, Activity activity, ViewGroup viewGroup, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i3 = i;
        this.l1 = viewGroup;
        this.z2 = z;
    }
}
