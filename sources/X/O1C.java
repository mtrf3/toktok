package X;

import Y.ACallableS34S1100000_7;
import Y.AgS85S0101000_2;
import android.widget.Toast;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class O1C implements InterfaceC61118Nyk {
    public final /* synthetic */ O1B LIZ;

    public O1C(O1B o1b) {
        this.LIZ = o1b;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr.length > 0 && iArr[0] == 0) {
            O1B o1b = this.LIZ;
            C10K.LIZJ(new ACallableS34S1100000_7(o1b.LJLIL, o1b.LJLILLLLZI, 4)).LJ(new AgS85S0101000_2(0, o1b.LJLIL, 0), C10K.LJIIIIZZ, null);
        } else {
            C16880lQ.LLZILL(Toast.makeText(this.LIZ.LJLIL, R.string.scl, 1));
        }
    }
}
