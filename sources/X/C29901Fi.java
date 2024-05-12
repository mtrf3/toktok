package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;

/* renamed from: X.1Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29901Fi<T> extends LiveEvent<T> {
    public void LJI(T t) {
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(t);
        }
    }

    public void LJII(T t) {
        C0I2.LIZ();
        MutableLiveData<T> mutableLiveData = this.LIZ;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(t);
        }
    }
}
