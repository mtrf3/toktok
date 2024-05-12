package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EaR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36679EaR extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36679EaR(int i, Integer num, String str, String str2, String str3, List list) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = list;
        this.LJLJJL = num;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = this.LJLIL;
        if (str != null) {
            sendLog.LIZLLL("enter_from", str);
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            sendLog.LIZLLL("author_id", str2);
        }
        String str3 = this.LJLJI;
        if (str3 != null) {
            sendLog.LIZLLL("group_id", str3);
        }
        sendLog.LIZLLL("product_ids", ORZ.LLD(this.LJLJJI, ",", null, null, null, 62));
        Integer num = this.LJLJJL;
        if (num != null) {
            num.intValue();
            sendLog.LIZLLL("req_type", num);
        }
        sendLog.LIZLLL(WM7.SCENE_SERVICE, Integer.valueOf(this.LJLJJLL));
        return C76800UCe.LIZ;
    }
}
