package X;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MZ7<T> {
    public final MutableLiveData<MZ9> LIZ = new MutableLiveData<>();
    public EnumC35471Dw3 LIZIZ;

    public MZ7() {
        C221108m2.LIZIZ(MZ8.INSTANCE);
        this.LIZIZ = EnumC35471Dw3.LATEST;
    }

    public static void LIZ(MZ7 mz7, List items, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        mz7.getClass();
        o.LJIIIZ(items, "items");
        MZ9 mz9 = new MZ9(items, z, z2);
        if (z || (mz7.LIZIZ == EnumC35471Dw3.BUFFER && C73098SmU.LJFF(C16880lQ.LLLLIIIILLL()))) {
            mz7.LIZ.setValue(new MZ9(items, z, z2));
        } else {
            mz7.LIZ.postValue(mz9);
        }
    }
}
