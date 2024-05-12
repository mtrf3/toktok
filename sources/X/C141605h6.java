package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141605h6 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ Integer LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141605h6(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        super(0);
        this.LJLIL = view;
        this.LJLILLLLZI = num;
        this.LJLJI = num2;
        this.LJLJJI = num3;
        this.LJLJJL = num4;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view = this.LJLIL;
            Integer num = this.LJLILLLLZI;
            Integer num2 = this.LJLJI;
            Integer num3 = this.LJLJJI;
            Integer num4 = this.LJLJJL;
            if (num != null) {
                marginLayoutParams.leftMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
            view.setLayoutParams(marginLayoutParams);
        }
        return C76800UCe.LIZ;
    }
}
