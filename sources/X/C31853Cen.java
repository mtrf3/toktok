package X;

import Y.ARunnableS0S1501000_5;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Cen, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31853Cen extends V1B {
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ Context LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ EnumC31856Ceq LJLJLLL;
    public final /* synthetic */ C39579Fg7 LJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C39579Fg7 c39579Fg7 = this.LJLL;
        if (c39579Fg7 != null) {
            c39579Fg7.LJIILLIIL(this.LJLJJL);
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        View view = this.LJLJJL;
        C76732zl c76732zl = this.LJLJJLL;
        Context context = this.LJLJL;
        String str2 = this.LJLJLJ;
        view.post(new ARunnableS0S1501000_5(2, context, view, this.LJLL, this.LJLJLLL, str2, c76732zl, 2));
    }

    public C31853Cen(Context context, ConstraintLayout constraintLayout, C31848Cei c31848Cei, EnumC31856Ceq enumC31856Ceq, String str, C76732zl c76732zl) {
        this.LJLJJL = constraintLayout;
        this.LJLJJLL = c76732zl;
        this.LJLJL = context;
        this.LJLJLJ = str;
        this.LJLJLLL = enumC31856Ceq;
        this.LJLL = c31848Cei;
    }
}
