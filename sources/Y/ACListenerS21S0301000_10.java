package Y;

import X.C59556NYy;
import X.C62906OmU;
import X.C62907OmV;
import X.DialogInterfaceC39771hF;
import X.InterfaceC59554NYw;
import android.content.DialogInterface;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes11.dex */
public class ACListenerS21S0301000_10 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS21S0301000_10 aCListenerS21S0301000_10, View view) {
        if (!((C59556NYy) aCListenerS21S0301000_10.l0).LJLJJI) {
            return;
        }
        InterfaceC59554NYw interfaceC59554NYw = (InterfaceC59554NYw) aCListenerS21S0301000_10.l1;
        if (interfaceC59554NYw != null) {
            interfaceC59554NYw.LIZJ(aCListenerS21S0301000_10.i3);
        }
        ((ViewPager) aCListenerS21S0301000_10.l2).setCurrentItem(aCListenerS21S0301000_10.i3);
    }

    public static final void onClick$1(ACListenerS21S0301000_10 aCListenerS21S0301000_10, View view) {
        if (!((C62907OmV) aCListenerS21S0301000_10.l0).LIZIZ) {
            ((DialogInterfaceC39771hF) aCListenerS21S0301000_10.l1).dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C62907OmV) aCListenerS21S0301000_10.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C62906OmU) aCListenerS21S0301000_10.l2, aCListenerS21S0301000_10.i3);
        }
    }

    public ACListenerS21S0301000_10(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
