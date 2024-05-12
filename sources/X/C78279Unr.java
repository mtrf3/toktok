package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.Unr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78279Unr {
    public final MutableLiveData<Integer> LIZ;
    public final Observer<Integer> LIZIZ;

    public C78279Unr(MutableLiveData<Integer> mutableLiveData, Observer<Integer> observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZ = mutableLiveData;
        this.LIZIZ = observer;
    }
}
