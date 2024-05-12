package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JMy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49052JMy implements C33Q {
    public final C43I<View> LJLIL;
    public final C43I<Integer> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<C76800UCe> LJLJJI;
    public final C43I<Integer> LJLJJL;
    public final JGN LJLJJLL;

    public C49052JMy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49052JMy)) {
            return false;
        }
        C49052JMy c49052JMy = (C49052JMy) obj;
        return o.LJ(this.LJLIL, c49052JMy.LJLIL) && o.LJ(this.LJLILLLLZI, c49052JMy.LJLILLLLZI) && o.LJ(this.LJLJI, c49052JMy.LJLJI) && o.LJ(this.LJLJJI, c49052JMy.LJLJJI) && o.LJ(this.LJLJJL, c49052JMy.LJLJJL) && o.LJ(this.LJLJJLL, c49052JMy.LJLJJLL);
    }

    public final int hashCode() {
        C43I<View> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Integer> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C76800UCe> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<Integer> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        JGN jgn = this.LJLJJLL;
        return hashCode5 + (jgn != null ? jgn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchVideoViewState(clickEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", playStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", attachedToWindow=");
        LIZ.append(this.LJLJI);
        LIZ.append(", detachedFromWindow=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", switchSubtitlesLanguages=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", addSubtitlesLanguages=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C49052JMy(int i) {
        this(null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49052JMy(C43I<? extends View> c43i, C43I<Integer> c43i2, C43I<C76800UCe> c43i3, C43I<C76800UCe> c43i4, C43I<Integer> c43i5, JGN jgn) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = jgn;
    }

    public static C49052JMy LIZ(C49052JMy c49052JMy, C43I c43i, C43I c43i2, C43I c43i3, JGN jgn, int i) {
        C43I<C76800UCe> c43i4;
        JGN jgn2 = jgn;
        C43I c43i5 = c43i3;
        C43I c43i6 = c43i;
        C43I c43i7 = c43i2;
        if ((i & 1) != 0) {
            c43i6 = c49052JMy.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i7 = c49052JMy.LJLILLLLZI;
        }
        C43I<C76800UCe> c43i8 = null;
        if ((i & 4) != 0) {
            c43i4 = c49052JMy.LJLJI;
        } else {
            c43i4 = null;
        }
        if ((i & 8) != 0) {
            c43i8 = c49052JMy.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i5 = c49052JMy.LJLJJL;
        }
        if ((i & 32) != 0) {
            jgn2 = c49052JMy.LJLJJLL;
        }
        c49052JMy.getClass();
        return new C49052JMy(c43i6, c43i7, c43i4, c43i8, c43i5, jgn2);
    }
}
