package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KyG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53444KyG extends AbstractC65781Prl implements InterfaceC88472Yns<C53447KyJ, Float> {
    public static final C53444KyG LJLIL = new C53444KyG();

    public C53444KyG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(C53447KyJ c53447KyJ) {
        float LJIIZILJ;
        C53447KyJ sizeData = c53447KyJ;
        o.LJIIIZ(sizeData, "sizeData");
        int i = sizeData.LJLIL;
        if (i <= 0) {
            LJIIZILJ = 0.0f;
        } else {
            LJIIZILJ = i + C32151Nz.LJIIZILJ(4);
        }
        return Float.valueOf(LJIIZILJ);
    }
}
