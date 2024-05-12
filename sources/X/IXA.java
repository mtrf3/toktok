package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IXA extends IXH {
    public final /* synthetic */ IX7 LJJJJ;

    @Override // X.IX5
    public final void LJIIZILJ(int i) {
        Object value = IZ8.LLLLZLLLI.getValue();
        o.LJIIIIZZ(value, "<get-ENGINE_REUSE_OPT_CODEC_ADJUST_V3>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LJJJJ.LJIIJJI = i;
        }
    }

    @Override // X.IX5
    public final void LJIJ(boolean z) {
        String str;
        this.LJJJJ.LJIIL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("codec hs updated：");
        if (z) {
            str = "<hardware decode>";
        } else {
            str = "<software decode>";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IXA(IX7 ix7, ITZ itz, int i) {
        super(itz, i);
        this.LJJJJ = ix7;
    }
}
