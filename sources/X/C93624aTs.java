package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.aTs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93624aTs<S> {
    public final MutableLiveData<S> LIZ;

    public C93624aTs() {
        this.LIZ = new MutableLiveData<>();
    }

    public C93624aTs(Object obj) {
        this();
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            this.LIZ.setValue(obj);
        } else {
            this.LIZ.postValue(obj);
        }
    }
}
