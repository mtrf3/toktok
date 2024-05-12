package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.android.widget.NextLiveData;
import java.util.HashMap;

/* renamed from: X.ImZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47623ImZ {
    public final DataCenter LIZ;

    public C47623ImZ(Fragment fragment) {
        DataCenter dataCenter = (DataCenter) ViewModelProviders.of(fragment).get(DataCenter.class);
        dataCenter.LJLJI = fragment;
        this.LIZ = dataCenter;
    }

    public final void LIZ(String str, Observer observer) {
        DataCenter dataCenter = this.LIZ;
        dataCenter.getClass();
        if (TextUtils.isEmpty(str) || observer == null) {
            return;
        }
        NextLiveData nextLiveData = (NextLiveData) ((HashMap) dataCenter.LJLILLLLZI).get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData();
            if (((HashMap) dataCenter.LJLIL).containsKey(str)) {
                nextLiveData.setValue(new C47622ImY(str, ((HashMap) dataCenter.LJLIL).get(str)));
            }
            ((HashMap) dataCenter.LJLILLLLZI).put(str, nextLiveData);
        }
        LifecycleOwner lifecycleOwner = dataCenter.LJLJI;
        if (lifecycleOwner == null) {
            return;
        }
        nextLiveData.observe(lifecycleOwner, observer, false);
    }
}
