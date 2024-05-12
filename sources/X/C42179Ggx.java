package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42179Ggx extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C42175Ggt LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42179Ggx(C42175Ggt c42175Ggt) {
        super(600, 2);
        this.LJLJJLL = c42175Ggt;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        View.OnClickListener onClickListener = this.LJLJJLL.LJLJJL;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }
}
