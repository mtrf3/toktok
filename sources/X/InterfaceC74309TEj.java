package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.List;

/* renamed from: X.TEj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC74309TEj {
    LiveData LIZIZ(String str, boolean z, boolean z2, boolean z3);

    LiveData LIZJ(boolean z, boolean z2, String str, int i, int i2, int i3, java.util.Map map);

    List<TJT> LIZLLL(String str);

    List<EffectCategoryModel> LJ();

    LiveData<C74413TIj<RecommendSearchWordsResponse>> LJFF();

    LiveData<C74413TIj<SearchEffectResponseV2>> LJI();

    void LJII(List<? extends Effect> list);

    MutableLiveData LJIIIIZZ();

    java.util.Map<String, Effect> LJIIIZ();

    MutableLiveData LJIIJ(String str, java.util.Map map, boolean z, boolean z2);

    MutableLiveData LJIIJJI();

    void LJIIL(List<? extends Effect> list);
}
