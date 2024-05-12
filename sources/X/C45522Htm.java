package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Htm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45522Htm extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C45474Ht0 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45522Htm(C45474Ht0 c45474Ht0) {
        super(0, 3);
        this.LJLJJLL = c45474Ht0;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        C71897SJp c71897SJp = this.LJLJJLL.LJLLJ;
        if (c71897SJp == null) {
            return;
        }
        boolean z = false;
        if (c71897SJp.isChecked()) {
            z = true;
        }
        c71897SJp.setChecked(!z);
    }
}
