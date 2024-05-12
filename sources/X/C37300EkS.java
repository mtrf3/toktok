package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EkS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37300EkS extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37300EkS(long j, String str, boolean z, String str2, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("ec_biz_scene", this.LJLIL);
        sendLog.LIZLLL("bitmap_cache_key", this.LJLILLLLZI);
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLJI));
        sendLog.LIZLLL("is_success", Integer.valueOf(this.LJLJJI ? 1 : 0));
        String str = this.LJLJJL;
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("error_msg", str);
        return C76800UCe.LIZ;
    }
}
