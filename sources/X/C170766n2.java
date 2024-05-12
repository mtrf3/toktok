package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C170766n2 {
    public Context LIZ;
    public C57D LIZIZ;
    public C5CH LIZJ;
    public InterfaceC170946nK LIZLLL;
    public InterfaceC170896nF LJ;
    public InterfaceC170936nJ LJI;
    public InterfaceC170916nH LJII;
    public InterfaceC170926nI LJFF = new C1XY();
    public InterfaceC1283852c LJIIIIZZ = new InterfaceC1283852c() { // from class: X.55q
        @Override // X.InterfaceC1283852c
        public final void LIZ(View view, EnumC1284052e variant) {
            Object LIZ;
            o.LJIIIZ(variant, "variant");
            if (view != null) {
                try {
                    LIZ = Boolean.valueOf(view.performHapticFeedback(0, 2));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    C131935Ft.LIZLLL("HapticFeedback", m10exceptionOrNullimpl.getMessage());
                }
                Boolean bool = Boolean.FALSE;
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = bool;
                }
                ((Boolean) LIZ).booleanValue();
            }
        }
    };
}
