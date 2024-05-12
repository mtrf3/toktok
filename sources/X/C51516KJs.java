package X;

import X.InterfaceC63694OzC;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KJs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51516KJs<T extends InterfaceC63694OzC<T>> {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC65784Pro<T> LIZ;
    public final Class<T> LIZIZ = (Class<T>) LIZ().getClass();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35952E9c.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, (C51516KJs<InterfaceC63694OzC<Object>>) 21));

    public final T LIZ() {
        return this.LIZ.invoke();
    }

    public C51516KJs(AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZ = aqS158S0100000_8;
        new C49847JhL(0);
    }

    public final T LIZIZ(Object obj) {
        T t = (T) ((LinkedHashMap) this.LIZJ.getValue()).get(obj);
        if (t == null) {
            return LIZ();
        }
        return t;
    }

    public final InterfaceC63694OzC LIZJ(KJU union, EnumC51518KJu contextScope) {
        InterfaceC55235Lm3 LIZ;
        InterfaceC63694OzC interfaceC63694OzC;
        InterfaceC63694OzC interfaceC63694OzC2;
        InterfaceC55235Lm3 LIZ2;
        InterfaceC55251LmJ LIZLLL;
        InterfaceC55235Lm3 LIZ3;
        InterfaceC55251LmJ LIZLLL2;
        Object invoke;
        o.LJIIIZ(contextScope, "contextScope");
        o.LJIIIZ(union, "union");
        EnumC51518KJu enumC51518KJu = EnumC51518KJu.GLOBAL;
        if (contextScope == enumC51518KJu) {
            return LIZIZ(enumC51518KJu);
        }
        if (contextScope == EnumC51518KJu.EXTERNAL) {
            return ((C51520KJw) this.LIZLLL.getValue()).LIZJ;
        }
        if (union.LIZJ != null && (invoke = contextScope.getBinder().invoke(union)) != null) {
            return LIZIZ(invoke);
        }
        View view = union.LIZIZ;
        if (view != null) {
            InterfaceC55235Lm3 LJ2 = C55230Lly.LJ(view);
            int i = C51521KJx.LIZ[contextScope.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object invoke2 = contextScope.getBinder().invoke(union);
                        if (invoke2 != null) {
                            return LIZIZ(invoke2);
                        }
                    } else {
                        LifecycleOwner lifecycleOwner = union.LIZ;
                        if (lifecycleOwner == null || (LIZ3 = C51519KJv.LIZ(lifecycleOwner, contextScope)) == null || (LIZLLL2 = C55247LmF.LIZLLL(LIZ3, this.LIZIZ, "source_default_key")) == null || LIZLLL2.getSource() == null) {
                            LIZ();
                        }
                    }
                } else {
                    LifecycleOwner lifecycleOwner2 = union.LIZ;
                    if (lifecycleOwner2 == null || (LIZ2 = C51519KJv.LIZ(lifecycleOwner2, contextScope)) == null || (LIZLLL = C55247LmF.LIZLLL(LIZ2, this.LIZIZ, "source_default_key")) == null || LIZLLL.getSource() == null) {
                        LIZ();
                    }
                }
            } else {
                InterfaceC55251LmJ LIZLLL3 = C55247LmF.LIZLLL(LJ2, this.LIZIZ, "source_default_key");
                if (LIZLLL3 == null || (interfaceC63694OzC2 = (InterfaceC63694OzC) LIZLLL3.getSource()) == null) {
                    return LIZ();
                }
                return interfaceC63694OzC2;
            }
        }
        LifecycleOwner lifecycleOwner3 = union.LIZ;
        if (lifecycleOwner3 != null && (LIZ = C51519KJv.LIZ(lifecycleOwner3, contextScope)) != null) {
            if (contextScope == EnumC51518KJu.ACTIVITY || contextScope == EnumC51518KJu.FRAGMENT) {
                InterfaceC55251LmJ LIZLLL4 = C55247LmF.LIZLLL(LIZ, this.LIZIZ, "source_default_key");
                if (LIZLLL4 == null || (interfaceC63694OzC = (InterfaceC63694OzC) LIZLLL4.getSource()) == null) {
                    return LIZ();
                }
                return interfaceC63694OzC;
            }
            Object invoke3 = contextScope.getBinder().invoke(union);
            if (invoke3 != null) {
                return LIZIZ(invoke3);
            }
        }
        return LIZ();
    }
}
