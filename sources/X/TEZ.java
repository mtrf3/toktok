package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS96S0300000_7;

/* loaded from: classes13.dex */
public interface TEZ extends InterfaceC74286TDm, InterfaceC74300TEa {
    void LIZ(List<String> list, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LIZIZ(Effect effect);

    void LIZJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    void LJ(List list, boolean z, java.util.Map map, IFetchEffectListListener iFetchEffectListListener);

    long LJFF();

    int LJI();

    boolean LJII();

    InterfaceC74301TEb LJIIIIZZ();

    OSZ<String, String> LJIIIZ();

    void LJIIJ();

    String LJIIJJI();

    void LJIIL(boolean z);

    boolean LJIILIIL();

    Effect LJIILJJIL();

    boolean LJIILL();

    int LJIILLIIL();

    void LJIIZILJ(Effect effect);

    String LJIJ();

    long LJIJI();

    void LJIJJ(boolean z);

    int LJIJJLI();

    String LJIL();

    TNY LJJ();

    long LJJI();

    void LJJIFFI();

    boolean LJJII();

    void LJJIII(boolean z);

    java.util.Map<String, List<Integer>> LJJIIJZLJL();

    void LJJIIZ(int i);

    Effect LJJIIZI();

    void LJJIJ(String str);

    void LJJIJIIJI(long j);

    long LJJIJIIJIL();

    void LJJIJIL(long j);

    void LJJIJL(int i);

    void LJJIJLIJ(int i);

    C74385THh LJJIL();

    TI3 LJJIZ();

    void LJJJ(C74389THl c74389THl);

    void LJJJI(long j);

    long LJJJIL();

    void LJJJJ();

    void LJJJJI(Effect effect, AqS96S0300000_7 aqS96S0300000_7);

    void LJJJJIZL(C84132X0e c84132X0e);

    void LJJJJJ();

    long LJJJJJL();

    void LJJJJL(long j);

    boolean LJJJJLI();

    InterfaceC74393THp LJJJJLL();

    void LJJJJZ();

    Effect LLJJIJIIJIL();

    void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener);

    void release();
}
