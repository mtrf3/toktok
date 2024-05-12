package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.C31697CcH;
import X.C71178Rwc;
import X.EnumC29188Bcu;
import X.InterfaceC31687Cc7;
import X.InterfaceC31694CcE;
import X.InterfaceC31710CcU;
import X.X1D;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
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
public interface IIconSlot {
    InterfaceC31687Cc7 LIZ();

    Animator.AnimatorListener LIZIZ();

    void getScheme();

    /* loaded from: classes6.dex */
    public static class SlotViewModel extends ViewModel {
        public String LLD;
        public String LLF;
        public String LLFF;
        public Integer LLFFF;
        public InterfaceC31694CcE LLFII;
        public C71178Rwc LLFZ;
        public Animator LLI;
        public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJLJI = new MutableLiveData<>();
        public final MutableLiveData<String> LJLJJI = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
        public final MutableLiveData<String> LJLJJLL = new MutableLiveData<>();
        public final MutableLiveData<Drawable> LJLJL = new MutableLiveData<>();
        public final MutableLiveData<Drawable> LJLJLJ = new MutableLiveData<>();
        public final MutableLiveData<Drawable> LJLJLLL = new MutableLiveData<>();
        public final MutableLiveData<Drawable> LJLL = new MutableLiveData<>();
        public final MutableLiveData<String> LJLLI = new MutableLiveData<>();
        public final MutableLiveData<String> LJLLILLLL = new MutableLiveData<>();
        public final MutableLiveData<String> LJLLJ = new MutableLiveData<>();
        public final MutableLiveData<C31697CcH> LJLLL = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJLLLL = new MutableLiveData<>();
        public final Map<EnumC29188Bcu, MutableLiveData<Object>> LJLLLLLL = new ConcurrentHashMap();
        public final MutableLiveData<Boolean> LJLZ = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJZ = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJZI = new MutableLiveData<>();
        public final MutableLiveData<Boolean> LJZL = new MutableLiveData<>();
        public long LL = 0;
        public Boolean LLIFFJFJJ = Boolean.FALSE;
        public float LLII = 1.0f;

        public final void gv0(LifecycleOwner lifecycleOwner) {
            this.LJLIL.removeObservers(lifecycleOwner);
            this.LJLILLLLZI.removeObservers(lifecycleOwner);
            this.LJLJJI.removeObservers(lifecycleOwner);
            this.LJLJJL.removeObservers(lifecycleOwner);
            this.LJLJJLL.removeObservers(lifecycleOwner);
            this.LJLJL.removeObservers(lifecycleOwner);
            this.LJLL.removeObservers(lifecycleOwner);
            this.LJLLI.removeObservers(lifecycleOwner);
            this.LJLLILLLL.removeObservers(lifecycleOwner);
            this.LJLLJ.removeObservers(lifecycleOwner);
            this.LJLJLLL.removeObservers(lifecycleOwner);
            this.LJLLLL.removeObservers(lifecycleOwner);
            this.LJLJLJ.removeObservers(lifecycleOwner);
            this.LJLZ.removeObservers(lifecycleOwner);
            this.LJZ.removeObservers(lifecycleOwner);
            this.LJZI.removeObservers(lifecycleOwner);
            this.LJZL.removeObservers(lifecycleOwner);
            Iterator it = ((ConcurrentHashMap) this.LJLLLLLL).values().iterator();
            while (it.hasNext()) {
                ((LiveData) it.next()).removeObservers(lifecycleOwner);
            }
            this.LL = 0L;
            this.LLF = null;
            this.LLD = null;
            this.LLFII = null;
            this.LLFZ = null;
            MutableLiveData<Boolean> mutableLiveData = this.LJLILLLLZI;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            this.LJLJJI.setValue(null);
            this.LJLJJL.setValue(bool);
            this.LJLJJLL.setValue(null);
            this.LJLJL.setValue(null);
            this.LJLL.setValue(null);
            this.LJLLI.setValue(null);
            this.LJLLILLLL.setValue(null);
            this.LJLLJ.setValue(null);
            this.LJLLLL.setValue(bool);
            this.LJLJLLL.setValue(null);
            this.LJLIL.setValue(bool);
            this.LJLJLJ.setValue(null);
            this.LJLZ.setValue(bool);
            ((ConcurrentHashMap) this.LJLLLLLL).clear();
            Animator animator = this.LLI;
            if (animator != null && animator.isRunning()) {
                this.LLI.cancel();
            }
            this.LLI = null;
            this.LJZ.setValue(null);
            this.LJZI.setValue(null);
            this.LJZL.setValue(null);
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
