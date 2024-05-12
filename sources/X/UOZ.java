package X;

import android.view.View;

/* loaded from: classes14.dex */
public final class UOZ extends AbstractViewOnClickListenerC76629U5p {
    public final /* synthetic */ AbstractC77108UOa LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UOZ(AbstractC77108UOa abstractC77108UOa) {
        super(0);
        this.LJLJJL = abstractC77108UOa;
    }

    @Override // X.AbstractViewOnClickListenerC76629U5p
    public final void LIZ(View view) {
        View.OnClickListener onClickListener;
        if (view != null && (onClickListener = this.LJLJJL.LJFF) != null) {
            onClickListener.onClick(view);
        }
    }
}
