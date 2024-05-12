package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BZf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28987BZf extends AbstractC65781Prl implements InterfaceC88472Yns<BZI, BZI> {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28987BZf(Long l, String str, String str2, boolean z) {
        super(1);
        this.LJLIL = l;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final BZI invoke(BZI bzi) {
        String str;
        BZI liveLog = bzi;
        o.LJIIIZ(liveLog, "liveLog");
        liveLog.LJIJJ(this.LJLIL, "anchor_id");
        if (this.LJLILLLLZI) {
            str = "anchor";
        } else {
            str = "audience";
        }
        liveLog.LJIJJ(str, "user_type");
        liveLog.LJIJJ(this.LJLJI, "show_entrance");
        liveLog.LJIJJ(this.LJLJJI, "subscribe_state");
        return liveLog;
    }
}
