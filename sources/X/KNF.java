package X;

import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class KNF<T> implements InterfaceC29911Fj {
    public final /* synthetic */ KN9 LJLIL;

    public KNF(KN9 kn9) {
        this.LJLIL = kn9;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer num;
        KNO kno = (KNO) obj;
        boolean z = kno instanceof KNL;
        Integer valueOf = Integer.valueOf(R.id.l6v);
        Integer valueOf2 = Integer.valueOf(R.id.jjl);
        Integer valueOf3 = Integer.valueOf(R.id.db7);
        if (z) {
            Integer num2 = ((KNL) kno).LIZ;
            if (num2 == null) {
                return;
            }
            if (num2.intValue() == 0) {
                valueOf = valueOf3;
            } else if (num2.intValue() == 1) {
                valueOf = valueOf2;
            } else if (num2.intValue() != 2) {
                return;
            }
            if (valueOf == null) {
                return;
            }
            ((ImageView) this.LJLIL.findViewById(valueOf.intValue()).findViewById(R.id.cover)).setVisibility(8);
            return;
        }
        if (!(kno instanceof KNM) || (num = ((KNM) kno).LIZ) == null) {
            return;
        }
        if (num.intValue() == 0) {
            valueOf = valueOf3;
        } else if (num.intValue() == 1) {
            valueOf = valueOf2;
        } else if (num.intValue() != 2) {
            return;
        }
        if (valueOf == null) {
            return;
        }
        ((ImageView) this.LJLIL.findViewById(valueOf.intValue()).findViewById(R.id.cover)).setVisibility(0);
    }
}
