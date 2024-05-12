package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EaN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36675EaN extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36675EaN(long j, String str, String str2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLIL));
        sendLog.LIZLLL("enter_from", this.LJLILLLLZI);
        sendLog.LIZLLL("enter_method", this.LJLJI);
        return C76800UCe.LIZ;
    }
}
