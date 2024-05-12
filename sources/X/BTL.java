package X;

import kotlin.jvm.internal.AqS22S0010000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTL extends AbstractC65781Prl implements InterfaceC88472Yns<BZI, BZI> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BTL(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final BZI invoke(BZI bzi) {
        BZI liveLog = bzi;
        o.LJIIIZ(liveLog, "liveLog");
        liveLog.LJIJJ(this.LJLIL, "show_entrance");
        liveLog.LJIJJ(this.LJLILLLLZI, "user_type");
        liveLog.LJIJJ(this.LJLJI, "subscribe_state");
        liveLog.LJJI(this.LJLJJI, "anchor_id", new AqS22S0010000_5(this.LJLJJLL, 2));
        liveLog.LJJI(this.LJLJJL, "for_anchor_id", new AqS22S0010000_5(this.LJLJJLL, 3));
        return liveLog;
    }
}
