package X;

import Y.AObserverS69S0200000_5;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJ4 {
    public static final MutableLiveData<User> LIZ = new MutableLiveData<>();

    public static final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super User, C76800UCe> onChanged) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(onChanged, "onChanged");
        MutableLiveData<User> mutableLiveData = LIZ;
        mutableLiveData.observe(lifecycleOwner, new AObserverS69S0200000_5((Object) mutableLiveData.getValue(), (User) onChanged, (InterfaceC88472Yns<? super User, C76800UCe>) 40));
    }
}
