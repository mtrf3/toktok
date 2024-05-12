package X;

import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.aTt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93625aTt<T> extends WeakReference<T> {
    public final /* synthetic */ StateViewModel LIZ;

    @Override // java.lang.ref.Reference
    public final T get() {
        T t = (T) super.get();
        if (t == null || !((ArrayList) this.LIZ.LJLIL).contains(t)) {
            return null;
        }
        ((ArrayList) this.LIZ.LJLIL).remove(t);
        return t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93625aTt(StateViewModel stateViewModel, AbstractC65781Prl abstractC65781Prl) {
        super(abstractC65781Prl);
        this.LIZ = stateViewModel;
    }
}
