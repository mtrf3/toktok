package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lc5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54617Lc5 implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<C54619Lc7> LJLJI;
    public final C43I<C54615Lc3> LJLJJI;

    public C54617Lc5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54617Lc5)) {
            return false;
        }
        C54617Lc5 c54617Lc5 = (C54617Lc5) obj;
        return o.LJ(this.LJLIL, c54617Lc5.LJLIL) && this.LJLILLLLZI == c54617Lc5.LJLILLLLZI && o.LJ(this.LJLJI, c54617Lc5.LJLJI) && o.LJ(this.LJLJJI, c54617Lc5.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        C43I<C76800UCe> c43i = this.LJLIL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLJJI.hashCode() + C40328FsC.LIZIZ(this.LJLJI, (i + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedSkylightContainerState(refreshSkylight=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showSkylightViews=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listDisplayState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", bubbleDisplayState=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public /* synthetic */ C54617Lc5(int i) {
        this(null, new C43I(new C54619Lc7(false, false, false, false, null, 31)), new C43I(new C54615Lc3(0)), false);
    }

    public C54617Lc5(C43I c43i, C43I listDisplayState, C43I bubbleDisplayState, boolean z) {
        o.LJIIIZ(listDisplayState, "listDisplayState");
        o.LJIIIZ(bubbleDisplayState, "bubbleDisplayState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = listDisplayState;
        this.LJLJJI = bubbleDisplayState;
    }

    public static C54617Lc5 LIZ(C54617Lc5 c54617Lc5, C43I c43i, boolean z, C43I listDisplayState, C43I bubbleDisplayState, int i) {
        if ((i & 1) != 0) {
            c43i = c54617Lc5.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c54617Lc5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            listDisplayState = c54617Lc5.LJLJI;
        }
        if ((i & 8) != 0) {
            bubbleDisplayState = c54617Lc5.LJLJJI;
        }
        c54617Lc5.getClass();
        o.LJIIIZ(listDisplayState, "listDisplayState");
        o.LJIIIZ(bubbleDisplayState, "bubbleDisplayState");
        return new C54617Lc5(c43i, listDisplayState, bubbleDisplayState, z);
    }
}
