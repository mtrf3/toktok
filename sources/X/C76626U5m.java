package X;

import android.view.View;

/* renamed from: X.U5m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76626U5m extends AbstractViewOnClickListenerC76629U5p {
    public final /* synthetic */ C76624U5k LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76626U5m(C76624U5k c76624U5k) {
        super(0);
        this.LJLJJL = c76624U5k;
    }

    @Override // X.AbstractViewOnClickListenerC76629U5p
    public final void LIZ(View view) {
        View.OnClickListener onClickListener = this.LJLJJL.LJLJLJ;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
