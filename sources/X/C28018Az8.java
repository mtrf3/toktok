package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Az8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28018Az8 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28018Az8(String str, long j) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", this.LJLIL);
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLILLLLZI));
        sendLog.LIZLLL("is_warm_webview", Integer.valueOf(C73702us.LIZIZ ? 1 : 0));
        sendLog.LIZLLL("do_warm_webview", Integer.valueOf(!o.LJ(this.LJLIL, "order_submit") ? 1 : 0));
        return C76800UCe.LIZ;
    }
}
