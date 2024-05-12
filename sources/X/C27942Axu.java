package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Axu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27942Axu extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ OSZ<String, Object>[] LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27942Axu(int i, String str, String str2, String str3, boolean z, OSZ[] oszArr) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = oszArr;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZIZ("error_code", Integer.valueOf(this.LJLIL));
        sendLog.LIZIZ("is_success", Boolean.valueOf(this.LJLILLLLZI));
        sendLog.LIZIZ("path", this.LJLJI);
        sendLog.LIZIZ("error_msg", this.LJLJJI);
        sendLog.LIZIZ("log_id", this.LJLJJL);
        for (OSZ<String, Object> osz : this.LJLJJLL) {
            sendLog.LIZIZ(osz.getFirst(), osz.getSecond());
        }
        return C76800UCe.LIZ;
    }
}
