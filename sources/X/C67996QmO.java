package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.QmO */
/* loaded from: classes12.dex */
public final /* synthetic */ class C67996QmO implements InterfaceC67935QlP {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public /* synthetic */ C67996QmO(InterfaceC43351Gzr interfaceC43351Gzr, AqS157S0100000_7 aqS157S0100000_7) {
        this.LJLIL = interfaceC43351Gzr;
        this.LJLILLLLZI = aqS157S0100000_7;
    }

    public static /* synthetic */ void LIZJ(C67996QmO c67996QmO, Object obj) {
        c67996QmO.LIZIZ(obj, EnumC43531H6p.OUTER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        AbstractSafeParcelable abstractSafeParcelable = (AbstractSafeParcelable) this.LJLILLLLZI;
        BinderC68008Qma binderC68008Qma = new BinderC68008Qma((C67649Qgn) obj);
        C68000QmS c68000QmS = (C68000QmS) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        QH7.LJIIIIZZ(abstractSafeParcelable);
        Parcel LJLJI = c68000QmS.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC68008Qma);
        C67988QmG.LIZJ(LJLJI, abstractSafeParcelable);
        c68000QmS.LLJI(LJLJI, 2);
    }

    public final void LIZIZ(Object obj, EnumC43531H6p dispatchPath) {
        o.LJIIIZ(dispatchPath, "dispatchPath");
        ((InterfaceC43351Gzr) this.LJLIL).LIZJ(obj, dispatchPath);
    }

    public final void LIZLLL(int i, Throwable t) {
        o.LJIIIZ(t, "t");
        ((InterfaceC43351Gzr) this.LJLIL).LIZIZ(i, t);
        try {
            ((InterfaceC65784Pro) this.LJLILLLLZI).invoke();
        } catch (Exception unused) {
        }
    }

    public final void LJ(Object obj, boolean z) {
        ((InterfaceC43351Gzr) this.LJLIL).LIZ(obj, z);
        try {
            ((InterfaceC65784Pro) this.LJLILLLLZI).invoke();
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C67996QmO(Object obj, Object obj2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
    }
}
