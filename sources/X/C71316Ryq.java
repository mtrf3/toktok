package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71316Ryq extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C34K LJLJLJ;
    public final /* synthetic */ C76732zl LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71316Ryq(long j, String str, String str2, String str3, String str4, String str5, String str6, C34K c34k, C76732zl c76732zl) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
        this.LJLJLJ = c34k;
        this.LJLJLLL = c76732zl;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", Long.valueOf(this.LJLIL));
        linkedHashMap.put("room_ids", this.LJLILLLLZI);
        linkedHashMap.put("enter_from_merge", this.LJLJI);
        linkedHashMap.put("enter_method", this.LJLJJI);
        linkedHashMap.put("has_stream_data", Integer.valueOf(!ujb.o.LJJJJJL(this.LJLJJL) ? 1 : 0));
        linkedHashMap.put("has_owner", Integer.valueOf(!ujb.o.LJJJJJL(this.LJLJJLL) ? 1 : 0));
        linkedHashMap.put("player_tag", this.LJLJL);
        linkedHashMap.put("reuse_player", Integer.valueOf(this.LJLJLJ.element ? 1 : 0));
        linkedHashMap.put("reuse_player_error_code", Integer.valueOf(this.LJLJLLL.element));
        C27943Axv.LIZ(sendLog, linkedHashMap);
        return C76800UCe.LIZ;
    }
}
