package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51525KKb extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51525KKb(int i, long j) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("page_name", "mall");
        sendLog.LIZLLL("if_back_up", Integer.valueOf(this.LJLIL));
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
