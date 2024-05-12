package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OTw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61972OTw extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61972OTw(String str, boolean z, String str2, String str3, String str4, Integer num, Integer num2, String str5) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = num;
        this.LJLJL = num2;
        this.LJLJLJ = str5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("api_path", this.LJLIL);
        sendLog.LIZLLL("success", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        String str = this.LJLJI;
        if (str != null) {
            sendLog.LIZLLL("error_msg", str);
        }
        String str2 = this.LJLJJI;
        if (str2 != null) {
            sendLog.LIZLLL("resource_path", str2);
        }
        String str3 = this.LJLJJL;
        if (str3 != null) {
            sendLog.LIZLLL("resource_type", str3);
        }
        Integer num = this.LJLJJLL;
        if (num != null) {
            sendLog.LIZLLL("resource_count", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.LJLJL;
        if (num2 != null) {
            sendLog.LIZLLL("preload_count", Integer.valueOf(num2.intValue()));
        }
        String str4 = this.LJLJLJ;
        if (str4 != null) {
            sendLog.LIZLLL("preload_type", str4);
        }
        return C76800UCe.LIZ;
    }
}
