package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KKw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51546KKw extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51546KKw(int i, int i2, long j, String str) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = i2;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("page_name", "mall");
        sendLog.LIZLLL("if_success", Integer.valueOf(this.LJLIL));
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLILLLLZI));
        sendLog.LIZLLL("request_type", Integer.valueOf(this.LJLJI));
        sendLog.LIZLLL("api_path", "api/v1/mall/tool_panel/get");
        sendLog.LIZLLL("fail_reason", this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
