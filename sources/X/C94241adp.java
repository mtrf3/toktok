package X;

import kotlin.jvm.internal.o;

/* renamed from: X.adp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94241adp implements InterfaceC1556368x {
    public final /* synthetic */ C93566aSw LIZ;

    public C94241adp(C93566aSw c93566aSw) {
        this.LIZ = c93566aSw;
    }

    @Override // X.InterfaceC1556368x
    public final void LIZ(int i) {
        C93566aSw c93566aSw = this.LIZ;
        C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
        if (c94441ah3 != null) {
            c94441ah3.LJI(c93566aSw.LJLJJLL, i);
            C93566aSw c93566aSw2 = this.LIZ;
            c93566aSw2.LJLJLLL = i;
            InterfaceC139695e1 interfaceC139695e1 = c93566aSw2.LL;
            if (interfaceC139695e1 == null) {
                return;
            }
            interfaceC139695e1.LJ(i, 0, "text", null, false);
            return;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }
}
