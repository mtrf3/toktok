package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.XUn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84921XUn implements IFetchEffectListListener {
    public final /* synthetic */ C84922XUo LIZ;

    public C84921XUn(C84922XUo c84922XUo) {
        this.LIZ = c84922XUo;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        C84923XUp c84923XUp = this.LIZ.LJLILLLLZI.LJFF.LJFF;
        if (c84923XUp != null) {
            c84923XUp.LJ(new C84767XOp());
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> list2 = list;
        if (list2 != null && list2.size() > 0 && ListProtector.get(list2, 0) != null) {
            C84922XUo c84922XUo = this.LIZ;
            C84923XUp c84923XUp = c84922XUo.LJLILLLLZI;
            C84919XUl c84919XUl = ((AbstractC84920XUm) c84923XUp.LJFF.LJFF(c84923XUp.LIZ, c84922XUo.LJLIL).LIZ).LJII;
            if (c84919XUl != null) {
                c84919XUl.LJIIL = this.LIZ.LJLIL;
                c84919XUl.LJIILIIL = (Effect) ListProtector.get(list2, 0);
            }
            C84922XUo c84922XUo2 = this.LIZ;
            c84922XUo2.LJLILLLLZI.LIZ((Effect) ListProtector.get(list2, 0), c84922XUo2.LJLIL);
        }
    }
}
