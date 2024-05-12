package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C15070iV;
import X.C46025I4n;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class CutMultiVideoViewModel extends ViewModel implements GenericLifecycleObserver {
    public boolean LJLLILLLL;
    public int LJLLJ;
    public long LJLLL;
    public final MutableLiveData<C15070iV<Integer, Integer>> LJLIL = new MutableLiveData<>();
    public final HashMap<String, Integer> LJLILLLLZI = new HashMap<>();
    public final MutableLiveData<Long> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Long> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Float> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<VideoSegment> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<C15070iV<Integer, Integer>> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLJLLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LJLL = new MutableLiveData<>();
    public final MutableLiveData<C46025I4n> LJLLI = new MutableLiveData<>();
    public long LJLLLL = 0;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void gv0(int i, int i2) {
        this.LJLJLJ.setValue(new C15070iV<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final void hv0(float f, long j, List list) {
        int i;
        this.LJLJJI.setValue(Long.valueOf(j));
        if (this.LJLIL.getValue() != null) {
            i = this.LJLIL.getValue().LIZIZ.intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) ListProtector.get(list, i2)).isDeleted) {
                arrayList.add(ListProtector.get(list, i2));
            }
        }
        long j2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i3);
            j2 = ((float) j2) + (((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * f));
            if (j2 > j) {
                this.LJLIL.setValue(new C15070iV<>(Integer.valueOf(i), Integer.valueOf(i3)));
                return;
            }
        }
    }
}
