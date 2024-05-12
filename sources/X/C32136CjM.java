package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CjM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32136CjM {
    public User LIZ;
    public long LJII;
    public final MutableLiveData<Integer> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<C77348UXg> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<C89524ZBo> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>();
    public final MutableLiveData<C32137CjN> LJFF = new MutableLiveData<>();
    public final MutableLiveData<Long> LJI = new MutableLiveData<>();
    public final MutableLiveData<EnumC32766CtW> LJIIIIZZ = new MutableLiveData<>(EnumC32766CtW.DEFAULT);

    public static int LIZ(int i, EnumC32766CtW state) {
        o.LJIIIZ(state, "state");
        if (i == 1) {
            int i2 = C32768CtY.LIZ[state.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return R.drawable.d37;
                    }
                    throw new C162476Zf();
                }
                return R.drawable.d36;
            }
            return R.drawable.d35;
        }
        return 0;
    }
}
