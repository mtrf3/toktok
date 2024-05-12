package X;

import Y.AfS66S0100000_14;
import Y.IDhS107S0100000_14;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQG implements WQH {
    public C73318Sq2 LIZ = new C73318Sq2();
    public final MutableLiveData<List<FilterBean>> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<List<EffectCategoryResponse>> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<List<OSZ<EffectCategoryResponse, List<FilterBean>>>> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<java.util.Map<String, Effect>> LJ = new MutableLiveData<>();
    public final MutableLiveData<List<FilterBean>> LJFF = new MutableLiveData<>();
    public final java.util.Map<Integer, C82268WQm> LJI = new LinkedHashMap();
    public final List<C157166Eu> LJII = new ArrayList();

    @Override // X.WPX
    public final MutableLiveData LIZ() {
        return this.LIZLLL;
    }

    @Override // X.WPX
    public final java.util.Map<Integer, C82268WQm> LIZIZ() {
        return this.LJI;
    }

    @Override // X.WPX
    public final MutableLiveData LIZJ() {
        return this.LJFF;
    }

    @Override // X.WPX
    public final MutableLiveData LIZLLL() {
        return this.LJ;
    }

    @Override // X.WPX
    public final MutableLiveData LJ() {
        return this.LIZIZ;
    }

    @Override // X.WQH
    public final void LJFF(WQW repository) {
        o.LJIIIZ(repository, "repository");
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        synchronized (this) {
            this.LIZ.dispose();
            this.LIZ.LIZLLL();
            this.LIZ = c73318Sq2;
        }
        C73454SsE LJJJ = repository.LLLZIL().LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJIII(new IDhS107S0100000_14(this, 6), false).LJJJ(C73969T1h.LIZIZ());
        AfS66S0100000_14 afS66S0100000_14 = new AfS66S0100000_14(this, 37);
        C73982T1u c73982T1u = C73982T1u.LJLIL;
        c73318Sq2.LIZ(LJJJ.LJJJLIIL(afS66S0100000_14, c73982T1u));
        c73318Sq2.LIZ(repository.LLLZL().LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJIII(new IDhS107S0100000_14(this, 7), false).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS66S0100000_14(this, 38), c73982T1u));
    }
}
