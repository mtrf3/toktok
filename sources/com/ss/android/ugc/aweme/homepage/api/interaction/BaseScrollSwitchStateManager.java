package com.ss.android.ugc.aweme.homepage.api.interaction;

import X.C54296LSq;
import X.IOV;
import X.InterfaceC208778Hh;
import X.OSJ;
import X.OSZ;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseScrollSwitchStateManager extends ViewModel {
    public final CurrentPagerItem LJLIL = new CurrentPagerItem();
    public final MutableLiveData<List<C54296LSq>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<HashMap<Integer, CommonPageFragment>> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final MutableLiveData<Integer> LJLJLJ;
    public final MutableLiveData<Integer> LJLJLLL;
    public final MutableLiveData<OSJ<Integer, Float, Integer>> LJLL;
    public final MutableLiveData<IOV> LJLLI;
    public final NextLiveData<OSZ<String, Boolean>> LJLLILLLL;
    public final NextLiveData<String> LJLLJ;
    public final MutableLiveData<InterfaceC208778Hh> LJLLL;
    public final MutableLiveData<OSZ<Boolean, Boolean>> LJLLLL;
    public MutableLiveData<Fragment> LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public WeakReference<Fragment> LJZI;
    public final MutableLiveData<Integer> LJZL;
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData<OSJ<Integer, Float, Integer>> LLD;
    public final MutableLiveData<Boolean> LLF;
    public final MutableLiveData<OSJ<Boolean, Fragment, Boolean>> LLFF;

    public final Fragment gv0() {
        Fragment value = this.LJLLLLLL.getValue();
        if (this.LJLLLLLL.getValue() == null) {
            return null;
        }
        return value;
    }

    public final String hv0() {
        if (!this.LJLIL.isRealBridgeSet()) {
            return "";
        }
        return mv0(this.LJLIL.getValue().intValue());
    }

    public final CommonPageFragment kv0() {
        if (!this.LJLIL.isRealBridgeSet()) {
            return null;
        }
        return jv0(this.LJLIL.getValue().intValue());
    }

    public final boolean lv0() {
        Boolean value = this.LJLJL.getValue();
        o.LJI(value);
        return value.booleanValue();
    }

    public final boolean pv0() {
        OSZ<Boolean, Boolean> value = this.LJLLLL.getValue();
        if (value == null || !value.getFirst().booleanValue() || !value.getSecond().booleanValue()) {
            return false;
        }
        return true;
    }

    public BaseScrollSwitchStateManager() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData;
        this.LJLJJL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJL = mutableLiveData3;
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new NextLiveData<>();
        this.LJLLJ = new NextLiveData<>();
        new NextLiveData();
        this.LJLLL = new MutableLiveData<>();
        new MutableLiveData();
        this.LJLLLL = new MutableLiveData<>();
        this.LJLLLLLL = new MutableLiveData<>();
        this.LJZL = new MutableLiveData<>();
        this.LL = new MutableLiveData<>();
        this.LLD = new MutableLiveData<>();
        this.LLF = new MutableLiveData<>();
        this.LLFF = new MutableLiveData<>();
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        mutableLiveData2.setValue(bool);
        mutableLiveData3.setValue(bool);
    }

    public final CommonPageFragment iv0(String str) {
        return jv0(nv0(str));
    }

    public final CommonPageFragment jv0(int i) {
        if (this.LJLJI.getValue() != null) {
            HashMap<Integer, CommonPageFragment> value = this.LJLJI.getValue();
            o.LJI(value);
            if (!value.isEmpty()) {
                HashMap<Integer, CommonPageFragment> value2 = this.LJLJI.getValue();
                o.LJI(value2);
                return value2.get(Integer.valueOf(i));
            }
        }
        return null;
    }

    public final String mv0(int i) {
        Integer num;
        int intValue;
        if (this.LJLILLLLZI.getValue() == null) {
            intValue = 0;
        } else {
            List<C54296LSq> value = this.LJLILLLLZI.getValue();
            if (value != null) {
                num = Integer.valueOf(value.size());
            } else {
                num = null;
            }
            o.LJI(num);
            intValue = num.intValue();
        }
        if (i < 0 || i >= intValue) {
            return "";
        }
        List<C54296LSq> value2 = this.LJLILLLLZI.getValue();
        o.LJI(value2);
        String str = ((C54296LSq) ListProtector.get(value2, i)).LIZIZ;
        o.LJIIIIZZ(str, "mainPages.value!![index].pageName");
        return str;
    }

    public final int nv0(String str) {
        if (this.LJLILLLLZI.getValue() != null) {
            List<C54296LSq> value = this.LJLILLLLZI.getValue();
            o.LJI(value);
            int size = value.size();
            for (int i = 0; i < size; i++) {
                List<C54296LSq> value2 = this.LJLILLLLZI.getValue();
                o.LJI(value2);
                if (TextUtils.equals(str, ((C54296LSq) ListProtector.get(value2, i)).LIZIZ)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final boolean ov0(String str) {
        return TextUtils.equals(str, hv0());
    }

    public final void tv0(boolean z) {
        this.LJLJJI.setValue(Boolean.valueOf(z));
    }

    public final void uv0(InterfaceC208778Hh checker) {
        o.LJIIIZ(checker, "checker");
        this.LJLLL.setValue(checker);
    }

    public final void E50(String pageName, boolean z) {
        o.LJIIIZ(pageName, "pageName");
        this.LJLIL.setValue(nv0(pageName), z);
    }

    public final void qv0(LifecycleOwner owner, Observer<Integer> observer) {
        o.LJIIIZ(owner, "owner");
        this.LJLJLLL.observe(owner, observer);
    }

    public final void rv0(LifecycleOwner owner, Observer<Integer> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        this.LJLJLJ.observe(owner, observer);
    }

    public final void sv0(float f, int i, int i2) {
        this.LJLL.setValue(new OSJ<>(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }
}
