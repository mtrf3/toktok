package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.THq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC74394THq {
    void LIZ(List<String> list, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LIZIZ(Effect effect);

    void LIZJ(List<String> list, boolean z, java.util.Map<String, String> map, IFetchEffectListListener iFetchEffectListListener);

    void LIZLLL(Effect effect, boolean z, boolean z2, boolean z3, WW5 ww5);

    void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener);
}
