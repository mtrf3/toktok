package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9F extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9F(int i, int i2, long j, long j2, String str, boolean z, boolean z2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = z2;
        this.LJLJJLL = str;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZJ("duration", Long.valueOf(this.LJLIL - this.LJLILLLLZI));
        sendLog.LIZJ("has_first_screen_data", Integer.valueOf(this.LJLJI ? 1 : 0));
        sendLog.LIZJ("is_preload", Integer.valueOf(this.LJLJJI));
        sendLog.LIZJ("is_gecko_cache", Integer.valueOf(this.LJLJJL ? 1 : 0));
        String str = this.LJLJJLL;
        if (str == null) {
            str = "not found";
        }
        sendLog.LIZJ("brick_schema", str);
        sendLog.LIZJ("brick_name", Integer.valueOf(this.LJLJL));
        return C76800UCe.LIZ;
    }
}
