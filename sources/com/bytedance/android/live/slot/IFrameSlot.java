package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.EnumC29188Bcu;
import X.InterfaceC31687Cc7;
import X.InterfaceC31710CcU;
import X.X1D;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public interface IFrameSlot {
    InterfaceC31687Cc7 LIZ();

    Animation LIZJ();

    Animation LIZLLL();

    View LJFF(Context context);

    void LJII(String str);

    void getLocation();

    String getScheme();

    /* loaded from: classes6.dex */
    public static class SlotViewModel extends ViewModel {
        public final MutableLiveData<Pair<Boolean, String>> LJLIL = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();
        public final Map<EnumC29188Bcu, MutableLiveData<Object>> LJLJI = new ConcurrentHashMap();
        public final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>(Boolean.FALSE);

        public final void gv0(LifecycleOwner lifecycleOwner) {
            this.LJLIL.removeObservers(lifecycleOwner);
            this.LJLILLLLZI.removeObservers(lifecycleOwner);
            MutableLiveData<Pair<Boolean, String>> mutableLiveData = this.LJLIL;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(new Pair<>(bool, "visibility_reason_dispose"));
            this.LJLILLLLZI.setValue(null);
            this.LJLJJI.removeObservers(lifecycleOwner);
            this.LJLJJI.setValue(bool);
            Iterator it = ((ConcurrentHashMap) this.LJLJI).values().iterator();
            while (it.hasNext()) {
                ((LiveData) it.next()).removeObservers(lifecycleOwner);
            }
            ((ConcurrentHashMap) this.LJLJI).clear();
        }

        public static SlotViewModel hv0(InterfaceC31710CcU interfaceC31710CcU, ActivityC45651qj activityC45651qj) {
            ViewModelProvider of = ViewModelProviders.of(activityC45651qj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(interfaceC31710CcU.LLJJJJLIIL().name());
            LIZ.append(interfaceC31710CcU.hashCode());
            return (SlotViewModel) of.get(X1D.LIZIZ(LIZ), SlotViewModel.class);
        }
    }
}
