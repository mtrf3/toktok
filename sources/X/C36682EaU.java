package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EaU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36682EaU extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36682EaU(int i, long j, boolean z, boolean z2, String str) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLIL));
        sendLog.LIZLLL("is_prefetch_enabled", Integer.valueOf(this.LJLILLLLZI ? 1 : 0));
        sendLog.LIZLLL("use_cache", Integer.valueOf(this.LJLJI ? 1 : 0));
        String str = this.LJLJJI;
        if (str != null) {
            sendLog.LIZLLL("enter_from", str);
        }
        sendLog.LIZLLL(WM7.SCENE_SERVICE, Integer.valueOf(this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
