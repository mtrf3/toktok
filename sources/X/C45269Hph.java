package X;

import android.view.View;

/* renamed from: X.Hph, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45269Hph extends AbstractViewOnClickListenerC55470Lpq {
    public final /* synthetic */ C45270Hpi LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<View, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ View LJLJJLL;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        if (this.LJLJJI.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        View view2 = this.LJLJJI.LJLILLLLZI;
        if (view2 != null && view2.getVisibility() == 0) {
            return;
        }
        this.LJLJJL.invoke(this.LJLJJLL, Integer.valueOf(this.LJLJJI.getAbsoluteAdapterPosition()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45269Hph(C45270Hpi c45270Hpi, InterfaceC88471Ynr<? super View, ? super Integer, C76800UCe> interfaceC88471Ynr, View view) {
        this.LJLJJI = c45270Hpi;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = view;
    }
}
