package X;

import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.TfX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75215TfX extends C4VB {
    public static final /* synthetic */ int LJLILLLLZI = 0;

    public C75215TfX(ViewPager viewPager) {
        super(viewPager);
    }

    @Override // X.C4VB, X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
        if (c78856UxA != null) {
            C75210TfS.LIZIZ(c78856UxA);
        }
    }

    @Override // X.C4VB, X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
        this.LJLIL.setCurrentItem(tab.LJ);
        C75210TfS.LIZ(tab);
    }
}
