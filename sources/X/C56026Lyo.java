package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Lyo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56026Lyo extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56026Lyo(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = z5;
        this.LJLJL = z6;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLIL));
        String str = "1";
        if (this.LJLILLLLZI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("has_market_lynx_view", obj);
        if (this.LJLJI) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("has_recommend_lynx_view", obj2);
        if (this.LJLJJI) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_market_gecko_cache", obj3);
        if (this.LJLJJL) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_market_data_cache", obj4);
        if (this.LJLJJLL) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_recommend_gecko_cache", obj5);
        if (!this.LJLJL) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_recommend_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        return C76800UCe.LIZ;
    }
}
