package X;

import X.C1023940d;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.42Q, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C42Q<T extends C1023940d, V extends View> extends AbstractC1036945d<T> {
    public final ViewGroup LIZIZ;
    public final int LIZJ;
    public V LIZLLL;

    @Override // X.AbstractC1036945d
    public void LIZJ(T nextTask) {
        o.LJIIIZ(nextTask, "nextTask");
        this.LIZIZ.removeAllViews();
        this.LIZLLL = null;
    }

    @Override // X.AbstractC1036945d
    public final void LJI(T t) {
        this.LIZLLL = (V) C17N.LJJIIZ(this.LIZJ, this.LIZIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42Q(C41X templateId, ViewGroup viewGroup, int i) {
        super(templateId);
        o.LJIIIZ(templateId, "templateId");
        this.LIZIZ = viewGroup;
        this.LIZJ = i;
    }
}
