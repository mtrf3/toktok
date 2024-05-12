package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I44 extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C46009I3x LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I44(C46009I3x c46009I3x) {
        super(0, 3);
        this.LJLJJLL = c46009I3x;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        this.LJLJJLL.getUiActions().LJLIL.invoke();
    }
}
