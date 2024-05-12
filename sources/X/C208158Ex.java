package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208158Ex implements AKX {
    public final AKW LJLIL;
    public int LJLILLLLZI;
    public InterfaceC88472Yns<? super FrameLayout, C76800UCe> LJLJI;
    public int LJLJJI;
    public InterfaceC88472Yns<? super FrameLayout, C76800UCe> LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public View.OnClickListener LJLJLJ;
    public View LJLJLLL;

    public C208158Ex() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208158Ex)) {
            return false;
        }
        C208158Ex c208158Ex = (C208158Ex) obj;
        return o.LJ(this.LJLIL, c208158Ex.LJLIL) && this.LJLILLLLZI == c208158Ex.LJLILLLLZI && o.LJ(this.LJLJI, c208158Ex.LJLJI) && this.LJLJJI == c208158Ex.LJLJJI && o.LJ(this.LJLJJL, c208158Ex.LJLJJL) && o.LJ(this.LJLJJLL, c208158Ex.LJLJJLL) && this.LJLJL == c208158Ex.LJLJL && o.LJ(this.LJLJLJ, c208158Ex.LJLJLJ) && o.LJ(this.LJLJLLL, c208158Ex.LJLJLLL);
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns = this.LJLJI;
        int hashCode2 = (((hashCode + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31) + this.LJLJJI) * 31;
        InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns2 = this.LJLJJL;
        int hashCode3 = (hashCode2 + (interfaceC88472Yns2 == null ? 0 : interfaceC88472Yns2.hashCode())) * 31;
        String str = this.LJLJJLL;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.LJLJL) * 31;
        View.OnClickListener onClickListener = this.LJLJLJ;
        int hashCode5 = (hashCode4 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View view = this.LJLJLLL;
        return hashCode5 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxBottomToastBundle(baseBundle=");
        LIZ.append(this.LJLIL);
        LIZ.append(", startVariant=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", startSlot=");
        LIZ.append(this.LJLJI);
        LIZ.append(", endVariant=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", endSlot=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", endMessage=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", bottomMargin=");
        LIZ.append(this.LJLJL);
        LIZ.append(", onClickListener=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", dispatchViewGroup=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AKX
    public final AKW LLLJIL() {
        return this.LJLIL;
    }

    public /* synthetic */ C208158Ex(int i) {
        this(new AKW(null), 3, null, 0, null, null, C7MY.LIZIZ(36), null, null);
    }

    public C208158Ex(AKW baseBundle, int i, InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns, int i2, InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns2, String str, int i3, View.OnClickListener onClickListener, View view) {
        o.LJIIIZ(baseBundle, "baseBundle");
        this.LJLIL = baseBundle;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = i2;
        this.LJLJJL = interfaceC88472Yns2;
        this.LJLJJLL = str;
        this.LJLJL = i3;
        this.LJLJLJ = onClickListener;
        this.LJLJLLL = view;
    }
}
