package X;

import java.util.Iterator;

/* renamed from: X.Wc3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82643Wc3 implements InterfaceC133905Ni {
    public final /* synthetic */ YO7 LJLIL;

    public C82643Wc3(YO7 yo7) {
        this.LJLIL = yo7;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        Iterator<InterfaceC133905Ni> it = this.LJLIL.LJIIJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, i2, f, str);
        }
    }
}
