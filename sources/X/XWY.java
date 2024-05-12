package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public abstract class XWY extends XWR<C84934XVa> {
    @Override // X.XWR
    public final C8HS LIZIZ() {
        XX7 xx7 = new XX7(this.LJIIIIZZ, EnumC84975XWp.COLLECT_MUSIC);
        xx7.LJLLJ = this.LJIIJ;
        return xx7;
    }

    @Override // X.XWR
    public void LJFF() {
        super.LJFF();
    }

    public XWY(Context context, View view, XYV xyv, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i) {
        super(context, view, xyv, R.string.iqj, interfaceC191547fS, c72h, i, 0);
        this.LIZ.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.LIZIZ.getLayoutParams()).topMargin = (int) KL2.LIZJ(this.LIZIZ.getContext(), 10.0f);
        this.LIZIZ.setOverScrollMode(2);
    }
}
