package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class BO6 implements Observer<List<ImageModel>> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<ImageModel> list) {
        Iterator<ImageModel> it = list.iterator();
        while (it.hasNext()) {
            C15620jO.LJFF(it.next());
        }
    }
}
