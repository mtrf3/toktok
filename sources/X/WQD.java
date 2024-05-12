package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQD implements WPX {
    public final MutableLiveData<List<FilterBean>> LIZ;
    public final MutableLiveData<List<OSZ<EffectCategoryResponse, List<FilterBean>>>> LIZIZ;
    public final MutableLiveData<java.util.Map<String, Effect>> LIZJ;
    public final MutableLiveData<List<FilterBean>> LIZLLL;

    @Override // X.WPX
    public final java.util.Map<Integer, C82268WQm> LIZIZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.WPX
    public final MutableLiveData LIZ() {
        return this.LIZIZ;
    }

    @Override // X.WPX
    public final MutableLiveData LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.WPX
    public final MutableLiveData LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.WPX
    public final MutableLiveData LJ() {
        return this.LIZ;
    }

    public WQD(int i) {
        C61878OQg filterList = C61878OQg.INSTANCE;
        o.LJIIIZ(filterList, "filterList");
        MutableLiveData<List<FilterBean>> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        MutableLiveData<List<OSZ<EffectCategoryResponse, List<FilterBean>>>> mutableLiveData2 = new MutableLiveData<>();
        this.LIZIZ = mutableLiveData2;
        MutableLiveData<java.util.Map<String, Effect>> mutableLiveData3 = new MutableLiveData<>();
        this.LIZJ = mutableLiveData3;
        MutableLiveData<List<FilterBean>> mutableLiveData4 = new MutableLiveData<>();
        this.LIZLLL = mutableLiveData4;
        mutableLiveData.setValue(filterList);
        mutableLiveData4.setValue(filterList);
        mutableLiveData2.setValue(filterList);
        mutableLiveData3.setValue(C113554cx.LJJJLIIL());
    }
}
