package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.XUu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84928XUu implements IFetchEffectListListener {
    public final /* synthetic */ C84929XUv LIZ;

    public C84928XUu(C84929XUv c84929XUv) {
        this.LIZ = c84929XUv;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        C84929XUv c84929XUv = this.LIZ;
        C84943XVj c84943XVj = c84929XUv.LJLJI.LIZ.LJJJJLI;
        if (c84943XVj != null) {
            c84943XVj.onFail(c84929XUv.LJLILLLLZI, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> list2 = list;
        if (list2 != null && list2.size() > 0 && ListProtector.get(list2, 0) != null) {
            C84919XUl c84919XUl = ((AbstractC84920XUm) this.LIZ.LJLJI.LIZ.LJFF().LIZ).LJII;
            if (c84919XUl != null) {
                c84919XUl.LJIIL = this.LIZ.LJLIL;
                c84919XUl.LJIILIIL = (Effect) ListProtector.get(list2, 0);
            }
            C84929XUv c84929XUv = this.LIZ;
            c84929XUv.LJLJI.LIZ((Effect) ListProtector.get(list2, 0), c84929XUv.LJLIL);
        }
    }
}
