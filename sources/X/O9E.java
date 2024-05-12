package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9E extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9E(long j, long j2, int i) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("duration", Long.valueOf(this.LJLIL - this.LJLILLLLZI));
        sendLog.LIZJ("brick_name", Integer.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
