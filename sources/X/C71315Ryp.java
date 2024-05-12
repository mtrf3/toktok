package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71315Ryp extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C34K LJLJL;
    public final /* synthetic */ C76732zl LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71315Ryp(long j, String str, String str2, String str3, String str4, String str5, C34K c34k, C76732zl c76732zl) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = c34k;
        this.LJLJLJ = c76732zl;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", Long.valueOf(this.LJLIL));
        linkedHashMap.put("enter_from_merge", this.LJLILLLLZI);
        linkedHashMap.put("enter_method", this.LJLJI);
        linkedHashMap.put("has_stream_data", Integer.valueOf(!ujb.o.LJJJJJL(this.LJLJJI) ? 1 : 0));
        linkedHashMap.put("has_owner", Integer.valueOf(!ujb.o.LJJJJJL(this.LJLJJL) ? 1 : 0));
        String str = this.LJLJJLL;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("player_tag", str);
        linkedHashMap.put("reuse_player", Integer.valueOf(this.LJLJL.element ? 1 : 0));
        linkedHashMap.put("reuse_player_error_code", Integer.valueOf(this.LJLJLJ.element));
        C27943Axv.LIZ(sendLog, linkedHashMap);
        return C76800UCe.LIZ;
    }
}
