package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;

/* loaded from: classes7.dex */
public final class FBE<T> implements Observer {
    public static final FBE<T> LJLIL = new FBE<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        HybridKitConfigTask.LJLJI = C17N.LJJJJI(i);
    }
}
