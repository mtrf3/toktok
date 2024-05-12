package X;

import Y.IDRunnableS7S0101000_24;

/* renamed from: X.ZhC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90606ZhC extends AbstractC12270dz {
    public final /* synthetic */ C90106ZXy LJFF;

    @Override // X.AbstractC12270dz
    public final void LIZIZ(int i) {
        this.LJFF.LIZJ.LJIIJ.post(new IDRunnableS7S0101000_24(i, this, 1));
    }

    @Override // X.AbstractC12270dz
    public final void LIZJ(int i) {
        this.LJFF.LIZJ.LJIIJ.post(new IDRunnableS7S0101000_24(i, this, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90606ZhC(C90106ZXy c90106ZXy, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.LJFF = c90106ZXy;
    }
}
