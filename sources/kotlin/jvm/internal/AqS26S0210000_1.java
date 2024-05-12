package kotlin.jvm.internal;

import X.AI2;
import X.AI8;
import X.AKC;
import X.AbstractC65781Prl;
import X.C109544Rq;
import X.C32I;
import X.C33P;
import X.C34B;
import X.C3L2;
import X.C3L4;
import X.C4T6;
import X.C4T8;
import X.C4TA;
import X.C76800UCe;
import X.C792239a;
import X.C82463Lm;
import X.C87933cj;
import X.C92823kc;
import X.C97373rx;
import X.C97383ry;
import X.DIL;
import X.EnumC82403Lg;
import X.EnumC82443Lk;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import X.XKX;
import Y.IDCListenerS202S0100000_1;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class AqS26S0210000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        C4T8 state = (C4T8) obj;
        o.LJIIIZ(state, "state");
        List<C97383ry> list = state.LJLJJL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C97383ry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLJI.LJFF());
        }
        Set LLJJ = ORZ.LLJJ(arrayList);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadMore: ");
        LIZ.append(list.size());
        LIZ.append(", ");
        DIL.LIZIZ((List) aqS26S0210000_1.l0, LIZ, ", ");
        LIZ.append(aqS26S0210000_1.z2);
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ));
        MessageRequestViewModel messageRequestViewModel = (MessageRequestViewModel) aqS26S0210000_1.l1;
        XKX.LIZLLL(messageRequestViewModel.LJLJJLL, null, null, new C4T6(list, messageRequestViewModel, LLJJ, (List) aqS26S0210000_1.l0, new C4TA(messageRequestViewModel, list, aqS26S0210000_1.z2), null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        C4T8 state = (C4T8) obj;
        o.LJIIIZ(state, "state");
        List LIZ = C97373rx.LIZ(state.LJLJJL, (List) aqS26S0210000_1.l0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onRefresh: ");
        DIL.LIZIZ(state.LJLJJL, LIZ2, ", ");
        LIZ2.append(((List) aqS26S0210000_1.l0).size());
        LIZ2.append(", ");
        LIZ2.append(LIZ.size());
        LIZ2.append(", ");
        LIZ2.append(aqS26S0210000_1.z2);
        C34B.LJI("MessageRequestViewModel", X1D.LIZIZ(LIZ2));
        ((MessageRequestViewModel) aqS26S0210000_1.l1).setState(new AqS167S0100000_1(LIZ, (List<VoucherInfoNew>) 163));
        ((MessageRequestViewModel) aqS26S0210000_1.l1).kv0(aqS26S0210000_1.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        AI8 it = (AI8) obj;
        o.LJIIIZ(it, "it");
        it.setTitle(((Context) aqS26S0210000_1.l0).getString(R.string.iul));
        AI2 ai2 = new AI2((Context) aqS26S0210000_1.l0);
        boolean z = aqS26S0210000_1.z2;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS26S0210000_1.l1;
        ai2.LJIILIIL(z);
        ai2.LJIILL(new IDCListenerS202S0100000_1(interfaceC88472Yns, 4));
        it.setAccessory(ai2);
        it.setInset(AKC.PADDING_32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        AI8 it = (AI8) obj;
        o.LJIIIZ(it, "it");
        it.setTitle(((Context) aqS26S0210000_1.l0).getString(R.string.jgp));
        AI2 ai2 = new AI2((Context) aqS26S0210000_1.l0);
        boolean z = aqS26S0210000_1.z2;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS26S0210000_1.l1;
        ai2.LJIILIIL(z);
        ai2.LJIILL(new IDCListenerS202S0100000_1(interfaceC88472Yns, 6));
        it.setAccessory(ai2);
        it.setInset(AKC.PADDING_32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        C33P setState = (C33P) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C33P.LIZ(setState, false, aqS26S0210000_1.z2, (List) aqS26S0210000_1.l0, (C87933cj) aqS26S0210000_1.l1, 1);
    }

    public static final Object invoke$5(AqS26S0210000_1 aqS26S0210000_1, Object obj) {
        boolean z;
        C3L4 baseSession = (C3L4) obj;
        o.LJIIIZ(baseSession, "baseSession");
        if ((aqS26S0210000_1.z2 || !(baseSession instanceof C3L2)) && C82463Lm.LIZJ(baseSession, (EnumC82443Lk) aqS26S0210000_1.l0, (EnumC82403Lg) aqS26S0210000_1.l1)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AqS26S0210000_1 aqS26S0210000_1, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C92823kc((C792239a) aqS26S0210000_1.l0, (C109544Rq) aqS26S0210000_1.l1, false, aqS26S0210000_1.z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0210000_1(C792239a c792239a, C109544Rq c109544Rq, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c792239a;
        this.l1 = c109544Rq;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0210000_1(EnumC82443Lk enumC82443Lk, EnumC82403Lg enumC82403Lg, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = enumC82443Lk;
        this.l1 = enumC82403Lg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0210000_1(Context context, InterfaceC88472Yns interfaceC88472Yns, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z2 = z;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0210000_1(MessageRequestViewModel messageRequestViewModel, List list, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.z2 = z;
        this.l1 = messageRequestViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS26S0210000_1(boolean z, boolean z2, List<? extends InterfaceC57784Mm4> list, C87933cj c87933cj) {
        super(1);
        this.$t = c87933cj;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = list;
    }
}
