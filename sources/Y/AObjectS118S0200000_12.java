package Y;

import X.AbstractC73672Svk;
import X.C73969T1h;
import X.C74413TIj;
import X.C78999UzT;
import X.EnumC74323TEx;
import X.I0N;
import X.IDH;
import X.InterfaceC29911Fj;
import X.InterfaceC65784Pro;
import X.THZ;
import X.TK5;
import X.TK6;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AObjectS118S0200000_12 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS118S0200000_12 aObjectS118S0200000_12, Object obj) {
        AbstractC73672Svk<THZ> Rc;
        IDH LLLF = ((I0N) aObjectS118S0200000_12.l0).LLLF();
        if (LLLF != null && (Rc = LLLF.Rc()) != null) {
            C78999UzT.LJFF(Rc.LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12((OptionListHandler) aObjectS118S0200000_12.l1, 7)), ((OptionListHandler) aObjectS118S0200000_12.l1).LJLJJL);
        }
    }

    public static final void onChanged$1(AObjectS118S0200000_12 aObjectS118S0200000_12, Object obj) {
        EnumC74323TEx enumC74323TEx;
        C74413TIj c74413TIj = (C74413TIj) obj;
        EnumC74323TEx enumC74323TEx2 = null;
        if (c74413TIj != null) {
            enumC74323TEx = c74413TIj.LIZIZ;
        } else {
            enumC74323TEx = null;
        }
        if (enumC74323TEx == EnumC74323TEx.SUCCESS) {
            ((TK5) aObjectS118S0200000_12.l0).LIZ().removeObserver(aObjectS118S0200000_12);
            ((TK6) ((TK5) aObjectS118S0200000_12.l0).LIZIZ.getValue()).LIZJ();
            ((InterfaceC65784Pro) aObjectS118S0200000_12.l1).invoke();
        } else {
            if (c74413TIj != null) {
                enumC74323TEx2 = c74413TIj.LIZIZ;
            }
            if (enumC74323TEx2 != EnumC74323TEx.ERROR || !o.LJ(((TK5) aObjectS118S0200000_12.l0).LIZ.sF().LIZJ(), Boolean.TRUE)) {
                return;
            }
            ((TK6) ((TK5) aObjectS118S0200000_12.l0).LIZIZ.getValue()).LIZ();
        }
    }

    public AObjectS118S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
