package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9A<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ Fragment LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;

    public R9A(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = fragment;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.FALSE, this.LIZ, this.LIZIZ.q9(), false, null, 16);
        R98 r98 = new R98(c73516StE, this.LIZIZ, this.LIZ, this.LJ, this.LJFF);
        this.LIZIZ.bi(r98);
        String str = this.LIZ;
        if (o.LJ(str, "phone")) {
            Context requireContext = this.LIZJ.requireContext();
            o.LJIIIIZZ(requireContext, "fragment.requireContext()");
            R99.LIZ(requireContext, this.LIZLLL, this.LJ, EnumC69116RAq.LOGIN.getValue(), 3, r98).LJIIIZ();
        } else {
            if (o.LJ(str, "email")) {
                Context requireContext2 = this.LIZJ.requireContext();
                o.LJIIIIZZ(requireContext2, "fragment.requireContext()");
                R99.LIZ(requireContext2, this.LIZLLL, this.LJ, EnumC69116RAq.LOGIN.getValue(), 2, r98).LJIIIZ();
                return;
            }
            this.LIZIZ.r9().LJIIZILJ(this.LJFF, this.LJ, r98);
        }
    }
}
