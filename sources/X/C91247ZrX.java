package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.services.apm.api.IEnsure;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91247ZrX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(MutableLiveData mutableLiveData, Object obj) {
        boolean z;
        o.LJIIIZ(mutableLiveData, "<this>");
        YXW.LIZ.getClass();
        if (YXW.LJI) {
            mutableLiveData.postValue(obj);
            return;
        }
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            z = true;
        } else {
            z = false;
        }
        IEnsure iEnsure = C78983UzD.LJLLLL;
        if (iEnsure != null) {
            iEnsure.ensureTrue(z);
        }
        if (z) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }
}
