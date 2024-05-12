package X;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.NYx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59555NYx implements C0C3 {
    public final /* synthetic */ C59556NYy LJLIL;
    public final /* synthetic */ InterfaceC59554NYw LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        LinearLayout linearLayout = this.LJLIL.LJLIL;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            View view = this.LJLIL.LJLJI;
            if (view != null) {
                o.LJI(view);
                view.setSelected(false);
            }
            if (childAt != null) {
                childAt.setSelected(true);
                this.LJLIL.LJLJI = childAt;
            }
            InterfaceC59554NYw interfaceC59554NYw = this.LJLILLLLZI;
            if (interfaceC59554NYw != null) {
                interfaceC59554NYw.onSelect(i);
                return;
            }
            return;
        }
        o.LJIJI("tabContainer");
        throw null;
    }

    public C59555NYx(C59556NYy c59556NYy, InterfaceC59554NYw interfaceC59554NYw) {
        this.LJLIL = c59556NYy;
        this.LJLILLLLZI = interfaceC59554NYw;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        C59556NYy c59556NYy = this.LJLIL;
        View view = c59556NYy.LJLILLLLZI;
        if (view != null) {
            c59556NYy.LIZ(f, i, view);
        } else {
            o.LJIJI("indicator");
            throw null;
        }
    }
}
