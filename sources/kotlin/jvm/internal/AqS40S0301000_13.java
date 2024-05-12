package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C75068TdA;
import X.C76800UCe;
import X.C78279Unr;
import X.EnumC30836C8i;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;

/* loaded from: classes14.dex */
public class AqS40S0301000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AqS40S0301000_13 aqS40S0301000_13) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.observe((LifecycleOwner) aqS40S0301000_13.l0, (Observer) aqS40S0301000_13.l1);
        ((PriorityTaskDispatcher) aqS40S0301000_13.l2).LJLJI.append(aqS40S0301000_13.i3, new C78279Unr(mutableLiveData, (Observer) aqS40S0301000_13.l1));
        ((PriorityTaskDispatcher) aqS40S0301000_13.l2).LJLILLLLZI.add(Integer.valueOf(aqS40S0301000_13.i3));
        PriorityTaskDispatcher priorityTaskDispatcher = (PriorityTaskDispatcher) aqS40S0301000_13.l2;
        if (!priorityTaskDispatcher.LJLJJL) {
            priorityTaskDispatcher.LJLJJL = true;
            priorityTaskDispatcher.gv0();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS40S0301000_13 aqS40S0301000_13) {
        Activity activity = (Activity) aqS40S0301000_13.l0;
        int i = aqS40S0301000_13.i3;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS40S0301000_13.l1;
        EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C75068TdA(i, (InterfaceC65784Pro) aqS40S0301000_13.l2, interfaceC88472Yns));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS40S0301000_13(Activity activity, Activity activity2, int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = activity;
        this.i3 = activity2;
        this.l1 = i;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS40S0301000_13(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, Observer<Integer> observer, PriorityTaskDispatcher priorityTaskDispatcher, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = observer;
        this.i3 = priorityTaskDispatcher;
    }
}
