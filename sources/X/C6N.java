package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class C6N extends C0YE {
    public final /* synthetic */ View.OnClickListener LJLJI;

    @Override // X.C0YE
    public final void LIZ(View view) {
        this.LJLJI.onClick(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6N(long j, View.OnClickListener onClickListener) {
        super(j);
        this.LJLJI = onClickListener;
    }
}
