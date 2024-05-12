package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HZp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44285HZp implements IFetchEffectListListener {
    public final /* synthetic */ MutableLiveData<C74413TIj<OSZ<Boolean, Integer>>> LIZ;
    public final /* synthetic */ C44284HZo LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.setValue(C74413TIj.LIZLLL(EnumC74323TEx.ERROR, null));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> list2 = list;
        if (C38891fp.LJJI(list2)) {
            this.LIZ.setValue(C74413TIj.LIZLLL(EnumC74323TEx.ERROR, null));
            return;
        }
        o.LJI(list2);
        boolean z = false;
        if (ListProtector.get(list2, 0) == null) {
            this.LIZ.setValue(C74413TIj.LIZLLL(EnumC74323TEx.ERROR, null));
            return;
        }
        this.LIZIZ.LIZIZ = (Effect) ListProtector.get(list2, 0);
        C44284HZo c44284HZo = this.LIZIZ;
        c44284HZo.getClass();
        if (c44284HZo.LIZIZ != null) {
            z = true;
        }
        this.LIZ.setValue(C74413TIj.LIZLLL(EnumC74323TEx.SUCCESS, new OSZ(Boolean.valueOf(z), 2)));
        C44284HZo.LIZJ(this.LIZIZ).fetchEffect(this.LIZIZ.LIZIZ, new C44287HZr());
    }

    public C44285HZp(MutableLiveData<C74413TIj<OSZ<Boolean, Integer>>> mutableLiveData, C44284HZo c44284HZo) {
        this.LIZ = mutableLiveData;
        this.LIZIZ = c44284HZo;
    }
}
