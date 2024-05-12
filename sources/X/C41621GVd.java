package X;

import Y.ARunnableS43S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.GVd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41621GVd implements Observer<Boolean> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        MutableLiveData<Boolean> mutableLiveData;
        if (!o.LJ(bool, Boolean.TRUE) && GUH.LJIILJJIL() <= 0) {
            C41634GVq c41634GVq = C41620GVc.LIZ;
            if (c41634GVq != null) {
                c41634GVq.LIZIZ.postDelayed(new ARunnableS43S0100000_7(c41634GVq, 135), 1000L);
            }
            C41634GVq c41634GVq2 = C41620GVc.LIZ;
            if (c41634GVq2 != null && (mutableLiveData = c41634GVq2.LJJIJIL) != null) {
                mutableLiveData.removeObserver(this);
            }
        }
    }
}
