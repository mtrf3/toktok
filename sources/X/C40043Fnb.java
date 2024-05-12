package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fnb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40043Fnb extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40043Fnb(String str, String str2, boolean z, boolean z2, long j, long j2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str = this.LJLIL;
        if (str != null) {
            sendLog.LIZLLL("ec_biz_scene", str);
        }
        sendLog.LIZLLL("image_url", this.LJLILLLLZI);
        sendLog.LIZLLL("is_asynchronous", Integer.valueOf(this.LJLJI ? 1 : 0));
        sendLog.LIZLLL("is_success", Integer.valueOf(this.LJLJJI ? 1 : 0));
        sendLog.LIZLLL("start_to_obtain", Long.valueOf(this.LJLJJL));
        sendLog.LIZLLL("obtain_to_finish", Long.valueOf(this.LJLJJLL));
        return C76800UCe.LIZ;
    }
}
