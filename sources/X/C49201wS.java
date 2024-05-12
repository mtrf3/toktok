package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49201wS extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ AbstractC11740d8 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ QZV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49201wS(AbstractC11740d8 abstractC11740d8, long j, long j2, QZV qzv) {
        super(1);
        this.LJLIL = abstractC11740d8;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = qzv;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        InterfaceC43021mU onDrawWithContent = interfaceC43021mU;
        o.LJIIIZ(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.LJJLIIIIJ();
        C14720hw.LJII(onDrawWithContent, this.LJLIL, this.LJLILLLLZI, this.LJLJI, 0.0f, this.LJLJJI, 104);
        return C76800UCe.LIZ;
    }
}
