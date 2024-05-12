package androidx.viewpager2.adapter;

import X.C16880lQ;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class AdapterStateViewModel extends ViewModel {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>(-1);

    public final void gv0(int i) {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(i, this, 15);
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            iDRunnableS6S0101000.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(iDRunnableS6S0101000);
        }
    }
}
