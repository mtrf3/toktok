package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes16.dex */
public final class XW0 implements IFetchEffectListListener {
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LIZ;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        C84953XVt.LIZ(this.LIZ, this.LIZIZ, null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        Effect effect;
        List<Effect> list2 = list;
        AbstractC73851Syd<C84768XOq> abstractC73851Syd = this.LIZ;
        InterfaceC73573Su9<C84767XOp> interfaceC73573Su9 = this.LIZIZ;
        if (list2 != null) {
            effect = (Effect) ORZ.LJLLLL(list2);
        } else {
            effect = null;
        }
        C84953XVt.LIZ(abstractC73851Syd, interfaceC73573Su9, effect);
    }

    public XW0(AbstractC73851Syd<C84768XOq> abstractC73851Syd, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        this.LIZ = abstractC73851Syd;
        this.LIZIZ = interfaceC73573Su9;
    }
}
