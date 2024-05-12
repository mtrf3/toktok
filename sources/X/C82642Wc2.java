package X;

import java.util.Iterator;

/* renamed from: X.Wc2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82642Wc2 implements InterfaceC133905Ni {
    public final /* synthetic */ YO7 LJLIL;

    public C82642Wc2(YO7 yo7) {
        this.LJLIL = yo7;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        Iterator<InterfaceC133905Ni> it = this.LJLIL.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, i2, f, str);
        }
    }
}
