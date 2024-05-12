package X;

import Y.AObserverS64S0101000_14;
import Y.AObserverS82S0100000_14;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextResultModule;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.Wqb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83545Wqb {
    public final SparseArray<C83546Wqc> LIZ;
    public final TEZ LIZIZ;
    public C83562Wqs LIZJ;
    public C83562Wqs LIZLLL;
    public final InterfaceC88472Yns<Effect, Boolean> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C83562Wqs c83562Wqs) {
        C83551Wqh c83551Wqh;
        boolean LJ;
        C83551Wqh c83551Wqh2;
        EditText editText;
        C83546Wqc c83546Wqc = this.LIZ.get(c83562Wqs.LIZJ);
        int i = c83562Wqs.LIZ;
        if (i == 32) {
            InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns = this.LJ;
            if (interfaceC88472Yns != null) {
                LJ = interfaceC88472Yns.invoke(this.LIZIZ.LJIIIIZZ().LJIILL().getValue()).booleanValue();
            } else {
                LJ = ID0.LJ((Effect) this.LIZIZ.LJIIIIZZ().LJIILL().getValue());
            }
            if (!LJ || c83546Wqc == null) {
                return;
            }
            c83546Wqc.LIZLLL = this.LIZJ;
            c83546Wqc.LIZLLL(c83562Wqs.LIZIZ, c83562Wqs.LIZLLL);
            c83546Wqc.LJI = true;
            C83551Wqh c83551Wqh3 = c83546Wqc.LIZ;
            if (c83551Wqh3 != null && (editText = c83551Wqh3.LJLIL) != null && c83551Wqh3.LJLJJL != null) {
                editText.requestFocus();
                c83551Wqh3.LJLJJL.showSoftInput(c83551Wqh3.LJLIL, 0);
            }
            String str = c83562Wqs.LIZLLL;
            int i2 = c83562Wqs.LIZIZ;
            if (!TextUtils.isEmpty(str) && (c83551Wqh2 = c83546Wqc.LIZ) != null) {
                if (i2 == 0) {
                    c83551Wqh2.setText(str);
                    return;
                } else {
                    c83551Wqh2.setHintText(str);
                    return;
                }
            }
            return;
        }
        if (i == 33 && (c83551Wqh = c83546Wqc.LIZ) != null) {
            c83551Wqh.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83545Wqb(TEZ tez, SparseArray<C83546Wqc> sparseArray, ActivityC45651qj activityC45651qj, InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns, WM7 wm7) {
        ViewModelProvider of;
        this.LIZIZ = tez;
        if (activityC45651qj == null) {
            return;
        }
        this.LIZ = sparseArray;
        this.LJ = interfaceC88472Yns;
        if (wm7 != 0) {
            of = C165706es.LJIIIIZZ(wm7, null, null, 6);
            activityC45651qj = wm7;
        } else {
            of = ViewModelProviders.of(activityC45651qj);
        }
        ARTextResultModule aRTextResultModule = (ARTextResultModule) of.get(ARTextResultModule.class);
        if (aRTextResultModule.LJLIL == null) {
            aRTextResultModule.LJLIL = new MutableLiveData<>();
        }
        aRTextResultModule.LJLIL.observe(activityC45651qj, new AObserverS82S0100000_14(this, 62));
        ARTextResultModule aRTextResultModule2 = (ARTextResultModule) of.get(ARTextResultModule.class);
        if (aRTextResultModule2.LJLILLLLZI == null) {
            aRTextResultModule2.LJLILLLLZI = new MutableLiveData<>();
        }
        aRTextResultModule2.LJLILLLLZI.observe(activityC45651qj, new AObserverS64S0101000_14(3, this, 11));
    }
}
