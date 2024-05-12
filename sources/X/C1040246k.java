package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.46k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1040246k {
    public static final /* synthetic */ int LIZJ = 0;
    public C100333wj LIZ;
    public C100323wi LIZIZ;

    public final void LIZJ(boolean z) {
        int i;
        C119354mJ c119354mJ;
        C100323wi c100323wi = this.LIZIZ;
        if (c100323wi != null) {
            C119354mJ c119354mJ2 = c100323wi.LIZ;
            if (c119354mJ2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                c119354mJ2.setVisibility(i);
            }
            if (!z || (c119354mJ = c100323wi.LIZ) == null) {
                return;
            }
            c119354mJ.setActive(true);
        }
    }

    public final InterfaceC100393wp LIZ(C53691L5j c53691L5j, LifecycleOwner owner, String str, String str2, boolean z, InterfaceC88472Yns<? super EnumC53695L5n, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(owner, "owner");
        if (!C78840Uwu.LJIL() || this.LIZ == null || c53691L5j == null) {
            return null;
        }
        L6F l6f = L6F.LIZIZ;
        C212068Ty c212068Ty = new C212068Ty(L61.STORY, c53691L5j, owner, EnumC53719L6l.DM);
        c212068Ty.LJ = str;
        c212068Ty.LJFF = str2;
        c212068Ty.LJIIIZ = false;
        if (interfaceC88472Yns != null) {
            c212068Ty.LJII = interfaceC88472Yns;
        }
        if (interfaceC65784Pro != null) {
            c212068Ty.LJIIJ = interfaceC65784Pro;
        }
        return l6f.LIZ.LIZIZ(c212068Ty);
    }

    public static /* synthetic */ InterfaceC100393wp LIZIZ(C1040246k c1040246k, C53691L5j c53691L5j, LifecycleOwner lifecycleOwner, String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, int i) {
        boolean z2 = z;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        if ((i & 16) != 0) {
            z2 = true;
        }
        InterfaceC65784Pro interfaceC65784Pro2 = null;
        if ((i & 32) != 0) {
            interfaceC88472Yns2 = null;
        }
        if ((i & 64) == 0) {
            interfaceC65784Pro2 = interfaceC65784Pro;
        }
        return c1040246k.LIZ(c53691L5j, lifecycleOwner, str, "head", z2, interfaceC88472Yns2, interfaceC65784Pro2);
    }
}
