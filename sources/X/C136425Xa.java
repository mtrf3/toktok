package X;

import android.view.KeyEvent;
import java.util.Stack;

/* renamed from: X.5Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136425Xa {
    public final InterfaceC45540Hu4 LIZ;
    public final Stack<InterfaceC65784Pro<C76800UCe>> LIZIZ = new Stack<>();
    public final C136435Xb LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.5Xb, X.5HC] */
    public C136425Xa(InterfaceC45540Hu4 interfaceC45540Hu4) {
        this.LIZ = interfaceC45540Hu4;
        ?? r0 = new C5HC() { // from class: X.5Xb
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4 && !C136425Xa.this.LIZIZ.isEmpty()) {
                    C136425Xa.this.LIZIZ.pop().invoke();
                    return true;
                }
                return false;
            }
        };
        this.LIZJ = r0;
        interfaceC45540Hu4.registerActivityOnKeyDownListener(r0);
    }
}
