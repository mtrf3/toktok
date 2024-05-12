package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TNc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74536TNc implements InterfaceC74394THq {
    public final InterfaceC84497XEf LIZ;

    public C74536TNc(InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.InterfaceC74394THq
    public final void LIZIZ(Effect effect) {
        this.LIZ.LIZIZ(effect);
    }

    @Override // X.InterfaceC74394THq
    public final void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effect, "effect");
        if (this.LIZ.LJJIL(effect)) {
            if (iFetchEffectListener instanceof InterfaceC74539TNf) {
                ((InterfaceC74539TNf) iFetchEffectListener).LIZIZ();
                return;
            } else {
                if (iFetchEffectListener != null) {
                    iFetchEffectListener.onSuccess(effect);
                    return;
                }
                return;
            }
        }
        this.LIZ.LJJIIZI(effect, new C74537TNd(iFetchEffectListener));
    }

    @Override // X.InterfaceC74394THq
    public final void LIZ(List<String> effectIds, java.util.Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        o.LJIIIZ(effectIds, "effectIds");
        this.LIZ.LIZ(effectIds, map, iFetchEffectListByIdsListener);
    }

    @Override // X.InterfaceC74394THq
    public final void LIZJ(List<String> list, boolean z, java.util.Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        this.LIZ.LJ(list, z, map, new C74538TNe(iFetchEffectListListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC74394THq
    public final void LIZLLL(Effect effect, boolean z, boolean z2, boolean z3, WW5 ww5) {
        o.LJIIIZ(effect, "effect");
        if (this.LIZ.LJJIL(effect)) {
            if (ww5 instanceof InterfaceC74539TNf) {
                ((InterfaceC74539TNf) ww5).LIZIZ();
                return;
            } else {
                ww5.onSuccess(effect);
                return;
            }
        }
        this.LIZ.LIZJ(effect, z, z2, z3, ww5);
    }
}
