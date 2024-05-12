package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C05040Hs;
import X.C109544Rq;
import X.C111344Yo;
import X.C113554cx;
import X.C16880lQ;
import X.C2K0;
import X.C76800UCe;
import X.C7C3;
import X.C85323Wm;
import X.InterfaceC111364Yq;
import X.InterfaceC65784Pro;
import X.InterfaceC89653fV;
import X.OSZ;
import X.X1D;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS56S1200000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public final String invoke$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("try find ability for ");
        LIZ.append((Class) this.l1);
        LIZ.append(", ");
        LIZ.append(C16880lQ.LJLLILLLL((Class) this.l1));
        LIZ.append(", tag ");
        LIZ.append(this.s0);
        LIZ.append(", result > ");
        LIZ.append((C2K0) this.l2);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS56S1200000_1 aqS56S1200000_1) {
        Bundle arguments = ((Fragment) aqS56S1200000_1.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS56S1200000_1.s0);
        }
        if (!(obj instanceof Aweme) || obj == null) {
            return aqS56S1200000_1.l2;
        }
        return obj;
    }

    public static final Object invoke$2(AqS56S1200000_1 aqS56S1200000_1) {
        Bundle arguments = ((Fragment) aqS56S1200000_1.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS56S1200000_1.s0);
        }
        if (!(obj instanceof Integer) || obj == null) {
            return aqS56S1200000_1.l2;
        }
        return obj;
    }

    public static final Object invoke$3(AqS56S1200000_1 aqS56S1200000_1) {
        AssemViewModel assemViewModel = (AssemViewModel) aqS56S1200000_1.l1;
        C7C3 c7c3 = assemViewModel.hierarchyDataStore;
        if (c7c3 != null) {
            o.LJI(c7c3);
            return c7c3.LIZ((Class) aqS56S1200000_1.l2, aqS56S1200000_1.s0);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HierarchyData has not inject to ");
        LIZ.append(assemViewModel);
        LIZ.append(", you can't get hierarchyData");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final Object invoke$4(AqS56S1200000_1 aqS56S1200000_1) {
        InterfaceC111364Yq assistedFactory = (InterfaceC111364Yq) aqS56S1200000_1.l1;
        ActivityC45651qj owner = (ActivityC45651qj) aqS56S1200000_1.l2;
        String str = aqS56S1200000_1.s0;
        o.LJIIIZ(assistedFactory, "assistedFactory");
        o.LJIIIZ(owner, "owner");
        return new C111344Yo(null, owner, assistedFactory, null, str);
    }

    public static final Object invoke$5(AqS56S1200000_1 aqS56S1200000_1) {
        String str;
        String str2 = aqS56S1200000_1.s0;
        C109544Rq c109544Rq = (C109544Rq) aqS56S1200000_1.l1;
        C85323Wm LIZJ = C05040Hs.LIZJ(str2, "type", "onEventV3");
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("message_type", str2);
        String str3 = null;
        if (c109544Rq != null) {
            str3 = Integer.valueOf(c109544Rq.getConversationType()).toString();
        }
        oszArr[1] = new OSZ("chat_type", str3);
        if (c109544Rq == null || (str = c109544Rq.getConversationId()) == null) {
            str = "";
        }
        oszArr[2] = new OSZ("conversation_id", str);
        LIZJ.LIZIZ("load_retry_click", C113554cx.LJJL(oszArr));
        ((InterfaceC65784Pro) aqS56S1200000_1.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS56S1200000_1 aqS56S1200000_1) {
        List list = (List) aqS56S1200000_1.l1;
        String str = aqS56S1200000_1.s0;
        UrlModel urlModel = (UrlModel) aqS56S1200000_1.l2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC89653fV interfaceC89653fV = (InterfaceC89653fV) ((Reference) it.next()).get();
            if (interfaceC89653fV != null) {
                interfaceC89653fV.LJ(str, urlModel);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1200000_1(C2K0 c2k0, Class cls, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = cls;
        this.s0 = str;
        this.l2 = c2k0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1200000_1(InterfaceC111364Yq interfaceC111364Yq, ActivityC45651qj activityC45651qj, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC111364Yq;
        this.l2 = activityC45651qj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1200000_1(Fragment fragment, String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS56S1200000_1(AssemViewModel assemViewModel, AssemViewModel<Object> assemViewModel2, Class<Object> cls, String str) {
        super(0);
        this.$t = str;
        this.l1 = assemViewModel;
        this.l2 = assemViewModel2;
        this.s0 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS56S1200000_1(String str, String str2, C109544Rq c109544Rq, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c109544Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS56S1200000_1(List list, List<? extends WeakReference<InterfaceC89653fV>> list2, String str, UrlModel urlModel) {
        super(0);
        this.$t = urlModel;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
    }
}
