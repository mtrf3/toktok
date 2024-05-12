package Y;

import X.C53710L6c;
import X.InterfaceC53712L6e;
import X.L6Y;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* loaded from: classes10.dex */
public class ARunnableS6S1300000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final void run$0(ARunnableS6S1300000_9 aRunnableS6S1300000_9) {
        boolean LIZ;
        try {
            ((MutableLiveData) aRunnableS6S1300000_9.l1).removeObservers((LifecycleOwner) aRunnableS6S1300000_9.l2);
            if (!((MutableLiveData) aRunnableS6S1300000_9.l1).hasObservers()) {
                ((L6Y) aRunnableS6S1300000_9.l3).L().remove(aRunnableS6S1300000_9.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1300000_9 aRunnableS6S1300000_9) {
        boolean LIZ;
        try {
            ((MutableLiveData) aRunnableS6S1300000_9.l1).observe((LifecycleOwner) aRunnableS6S1300000_9.l2, new AObserverS51S1100000_9((InterfaceC53712L6e) aRunnableS6S1300000_9.l3, aRunnableS6S1300000_9.s0, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S1300000_9(Object obj, MutableLiveData<C53710L6c> mutableLiveData, LifecycleOwner lifecycleOwner, InterfaceC53712L6e interfaceC53712L6e, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = mutableLiveData;
        this.l3 = lifecycleOwner;
        this.s0 = interfaceC53712L6e;
    }
}
