package X;

import com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy;

/* renamed from: X.Hhe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44770Hhe implements InterfaceC44780Hho {
    public static final /* synthetic */ C44770Hhe LJIILL = new C44770Hhe();
    public final /* synthetic */ InterfaceC44780Hho LJIILJJIL;

    @Override // X.InterfaceC44780Hho
    public final float syntheticVideoBitrate() {
        return this.LJIILJJIL.syntheticVideoBitrate();
    }

    @Override // X.InterfaceC44780Hho
    public final float videoBitrate() {
        return this.LJIILJJIL.videoBitrate();
    }

    @Override // X.InterfaceC44780Hho
    public final int videoBitrateCategoryIndex() {
        return this.LJIILJJIL.videoBitrateCategoryIndex();
    }

    public C44770Hhe() {
        InterfaceC44780Hho interfaceC44780Hho;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        this.LJIILJJIL = (LIZIZ == null || (interfaceC44780Hho = (InterfaceC44780Hho) LIZIZ.LJIILJJIL(BitrateByteBenchStrategy.class)) == null) ? C44771Hhf.LJIILJJIL : interfaceC44780Hho;
    }
}
