package com.ss.android.ugc.tiktok.tpsc.base;

import X.AbstractC73672Svk;
import X.C38333F2r;
import X.C73969T1h;
import X.SKL;
import X.SLI;
import X.T16;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BasePrivacySettingViewModel extends ViewModel {
    public final List<SKL> LJLIL = new ArrayList();
    public Integer LJLILLLLZI;
    public final MutableLiveData<Integer> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;

    public void hv0(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
    }

    public abstract AbstractC73672Svk<? extends BaseResponse> jv0(int i);

    public final SKL kv0() {
        Object obj;
        ArrayList arrayList = (ArrayList) this.LJLIL;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            obj = listIterator.previous();
            WeakReference<Object> weakReference = ((SKL) obj).LIZ;
            if (weakReference != null && weakReference.get() != null) {
                break;
            }
        }
        return (SKL) obj;
    }

    public BasePrivacySettingViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(-1);
        this.LJLJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LJLJJI = mutableLiveData2;
    }

    public void lv0(int i) {
        Integer value = this.LJLJI.getValue();
        if (value == null || value.intValue() != i) {
            jv0(i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new SLI(this, i));
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = this.LJLJI.getValue();
            }
            this.LJLJJI.postValue(Boolean.TRUE);
            this.LJLJI.postValue(Integer.valueOf(i));
        }
    }

    public final void mv0(SKL toastHolder) {
        o.LJIIIZ(toastHolder, "toastHolder");
        ((ArrayList) this.LJLIL).add(toastHolder);
    }

    public void gv0(int i, Throwable e) {
        C38333F2r c38333F2r;
        String errorMsg;
        o.LJIIIZ(e, "e");
        if (!(e instanceof C38333F2r) || (c38333F2r = (C38333F2r) e) == null || (errorMsg = c38333F2r.getErrorMsg()) == null || errorMsg.length() == 0) {
            SKL kv0 = kv0();
            if (kv0 != null) {
                kv0.LIZ(R.string.gqr);
                return;
            }
            return;
        }
        SKL kv02 = kv0();
        if (kv02 == null) {
            return;
        }
        kv02.LIZIZ(errorMsg);
    }
}
