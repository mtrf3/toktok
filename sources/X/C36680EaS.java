package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EaS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36680EaS extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36680EaS(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = z;
        this.LJLJL = str6;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL(WM7.SCENE_SERVICE, this.LJLIL);
        String str = this.LJLILLLLZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("gecko_channel", str);
        sendLog.LIZLLL("access_key", this.LJLJI);
        String str3 = this.LJLJJI;
        if (str3 == null) {
            str3 = "";
        }
        sendLog.LIZLLL("host", str3);
        sendLog.LIZLLL("context", this.LJLJJL);
        sendLog.LIZLLL("is_success", Integer.valueOf(this.LJLJJLL ? 1 : 0));
        String str4 = this.LJLJL;
        if (str4 != null) {
            str2 = str4;
        }
        sendLog.LIZLLL("error_msg", str2);
        return C76800UCe.LIZ;
    }
}
