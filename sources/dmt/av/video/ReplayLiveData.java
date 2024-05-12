package dmt.av.video;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ReplayLiveData<T> extends MutableLiveData<T> {
    public final ArrayList<T> mReplayValues = new ArrayList<>();

    public void clearReplayValues() {
        this.mReplayValues.clear();
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        super.setValue(t);
        this.mReplayValues.add(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        super.observe(lifecycleOwner, new Observer<T>() { // from class: X.5kp
            public boolean LJLIL;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                if (!this.LJLIL && !ReplayLiveData.this.mReplayValues.isEmpty()) {
                    for (int i = 0; i < ReplayLiveData.this.mReplayValues.size(); i++) {
                        observer.onChanged(ListProtector.get(ReplayLiveData.this.mReplayValues, i));
                    }
                } else {
                    observer.onChanged(t);
                }
                this.LJLIL = true;
            }
        });
    }
}
