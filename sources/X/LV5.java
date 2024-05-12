package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LV5 extends AbstractC65781Prl implements InterfaceC88472Yns<byte[], C76800UCe> {
    public final /* synthetic */ C68322mC LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ byte[] LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LV5(C68322mC c68322mC, C76732zl c76732zl, int i, byte[] bArr, int i2) {
        super(1);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = i;
        this.LJLJJI = bArr;
        this.LJLJJL = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(byte[] bArr) {
        int length;
        byte[] targetPage = bArr;
        o.LJIIJ(targetPage, "targetPage");
        C68322mC c68322mC = this.LJLIL;
        Integer num = (Integer) c68322mC.element;
        if (num != null) {
            length = num.intValue();
        } else {
            length = targetPage.length;
        }
        c68322mC.element = Integer.valueOf(length);
        Integer num2 = (Integer) this.LJLIL.element;
        if (num2 != null) {
            int intValue = num2.intValue();
            C76732zl c76732zl = this.LJLILLLLZI;
            int i = c76732zl.element;
            int i2 = i - this.LJLJI;
            if (intValue > i2) {
                intValue = i2;
            }
            if (intValue > 0) {
                c76732zl.element = i - intValue;
                Integer num3 = (Integer) this.LJLIL.element;
                if (num3 != null) {
                    System.arraycopy(targetPage, num3.intValue() - intValue, this.LJLJJI, (this.LJLJJL + this.LJLILLLLZI.element) - this.LJLJI, intValue);
                    this.LJLIL.element = null;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIIZILJ();
        throw null;
    }
}
