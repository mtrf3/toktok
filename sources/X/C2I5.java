package X;

import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* renamed from: X.2I5, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I5 extends TBS implements InterfaceC88472Yns<ViewParent, ViewParent> {
    public static final C2I5 LJLIL = new C2I5();

    public C2I5() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final ViewParent invoke(ViewParent viewParent) {
        ViewParent p1 = viewParent;
        o.LJIIIZ(p1, "p1");
        return p1.getParent();
    }
}
