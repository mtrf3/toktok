package com.bytedance.android.widget;

import X.C16880lQ;
import X.C47622ImY;
import X.RunnableC47621ImX;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class DataCenter extends ViewModel {
    public LifecycleOwner LJLJI;
    public Thread LJLJJI;
    public final Map<String, Object> LJLIL = new HashMap();
    public final Map<String, NextLiveData<C47622ImY>> LJLILLLLZI = new HashMap();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((HashMap) this.LJLIL).clear();
        ((HashMap) this.LJLILLLLZI).clear();
        this.LJLJI = null;
        this.LJLJJL.removeCallbacksAndMessages(null);
    }

    public final void gv0(Object obj, String str) {
        if (this.LJLJJI == null) {
            this.LJLJJI = C16880lQ.LLJJJJ().getThread();
        }
        int i = 0;
        if (C16880lQ.LLLLIIIILLL() != this.LJLJJI) {
            this.LJLJJL.post(new RunnableC47621ImX(i, this, str, obj));
            return;
        }
        ((HashMap) this.LJLIL).put(str, obj);
        LiveData liveData = (LiveData) ((HashMap) this.LJLILLLLZI).get(str);
        if (liveData != null) {
            liveData.setValue(new C47622ImY(str, obj));
        }
    }
}
