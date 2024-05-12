package X;

import kotlin.jvm.internal.o;

/* renamed from: X.724, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass724 implements C33Q {
    public final AnonymousClass720 LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final C43I<C76800UCe> LJLJJL;

    public AnonymousClass724() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass724)) {
            return false;
        }
        AnonymousClass724 anonymousClass724 = (AnonymousClass724) obj;
        return this.LJLIL == anonymousClass724.LJLIL && this.LJLILLLLZI == anonymousClass724.LJLILLLLZI && this.LJLJI == anonymousClass724.LJLJI && this.LJLJJI == anonymousClass724.LJLJJI && o.LJ(this.LJLJJL, anonymousClass724.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJLJJI ? 1 : 0)) * 31;
        C43I<C76800UCe> c43i = this.LJLJJL;
        return i2 + (c43i == null ? 0 : c43i.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DanmakuInputVMState(panelType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", softKeyboardHeight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSoftKeyboardOpened=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isInputtingContent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", triggerCloseInputFragment=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ AnonymousClass724(int i) {
        this(AnonymousClass720.SOFT_KEYBOARD, 0, false, false, null);
    }

    public AnonymousClass724(AnonymousClass720 panelType, int i, boolean z, boolean z2, C43I<C76800UCe> c43i) {
        o.LJIIIZ(panelType, "panelType");
        this.LJLIL = panelType;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = c43i;
    }

    public static AnonymousClass724 LIZ(AnonymousClass724 anonymousClass724, AnonymousClass720 anonymousClass720, int i, boolean z, boolean z2, C43I c43i, int i2) {
        C43I c43i2 = c43i;
        boolean z3 = z2;
        boolean z4 = z;
        AnonymousClass720 panelType = anonymousClass720;
        int i3 = i;
        if ((i2 & 1) != 0) {
            panelType = anonymousClass724.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = anonymousClass724.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z4 = anonymousClass724.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z3 = anonymousClass724.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            c43i2 = anonymousClass724.LJLJJL;
        }
        anonymousClass724.getClass();
        o.LJIIIZ(panelType, "panelType");
        return new AnonymousClass724(panelType, i3, z4, z3, c43i2);
    }
}
