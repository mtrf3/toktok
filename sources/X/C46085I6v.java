package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.I6v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46085I6v<T> implements InterfaceC15040iS {
    public final /* synthetic */ C46084I6u LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public C46085I6v(C46084I6u c46084I6u, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = c46084I6u;
        this.LIZIZ = z;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        int i;
        View view = this.LIZ.LJLJLLL;
        if (view != null) {
            if (this.LIZIZ) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            if (!this.LIZIZ) {
                C46084I6u c46084I6u = this.LIZ;
                WMH wmh = (WMH) c46084I6u.mParentScene;
                if (wmh != null) {
                    wmh.hide(c46084I6u);
                }
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        o.LJIJI("titleBar");
        throw null;
    }
}
