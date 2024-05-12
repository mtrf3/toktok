package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ArL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27535ArL extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27535ArL(long j, String str, String str2, String str3) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLIL));
        String str = this.LJLILLLLZI;
        if (str != null) {
            sendLog.LIZLLL("quit_type", str);
        }
        String str2 = this.LJLJI;
        if (str2 != null) {
            sendLog.LIZLLL("entrance_form", str2);
        }
        String str3 = this.LJLJJI;
        if (str3 != null) {
            sendLog.LIZLLL("group_id", str3);
        }
        return C76800UCe.LIZ;
    }
}
