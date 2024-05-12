package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EaQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36678EaQ extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ List<String> LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ Long LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ Long LJLL;
    public final /* synthetic */ int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36678EaQ(int i, int i2, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, List list) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = num;
        this.LJLJJLL = list;
        this.LJLJL = num2;
        this.LJLJLJ = l;
        this.LJLJLLL = str4;
        this.LJLL = l2;
        this.LJLLI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        sendLog.LIZLLL("type", Integer.valueOf(this.LJLIL));
        String str = this.LJLILLLLZI;
        if (str != null) {
            sendLog.LIZLLL("enter_from", str);
        }
        String str2 = this.LJLJI;
        if (str2 != null) {
            sendLog.LIZLLL("author_id", str2);
        }
        String str3 = this.LJLJJI;
        if (str3 != null) {
            sendLog.LIZLLL("group_id", str3);
        }
        Integer num = this.LJLJJL;
        if (num != null) {
            num.intValue();
            sendLog.LIZLLL("req_type", num);
        }
        sendLog.LIZLLL("product_ids", ORZ.LLD(this.LJLJJLL, ",", null, null, null, 62));
        Integer num2 = this.LJLJJL;
        if (num2 != null) {
            num2.intValue();
            sendLog.LIZLLL("req_type", num2);
        }
        Integer num3 = this.LJLJL;
        if (num3 != null) {
            sendLog.LIZLLL("error_code", Integer.valueOf(num3.intValue()));
        }
        Long l = this.LJLJLJ;
        if (l != null) {
            sendLog.LIZLLL("duration", Long.valueOf(l.longValue()));
        }
        String str4 = this.LJLJLLL;
        if (str4 != null) {
            sendLog.LIZLLL("log_id", str4);
        }
        Long l2 = this.LJLL;
        if (l2 != null) {
            sendLog.LIZLLL("click_duration", Long.valueOf(l2.longValue()));
        }
        sendLog.LIZLLL(WM7.SCENE_SERVICE, Integer.valueOf(this.LJLLI));
        return C76800UCe.LIZ;
    }
}
