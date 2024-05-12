package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Lz5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56043Lz5 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56043Lz5(String str, String str2, long j, boolean z, boolean z2, java.util.Map<String, String> map) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = map;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        Object obj;
        C27943Axv sendLog = c27943Axv;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("previous_page", str);
        String str3 = this.LJLIL;
        if (str3 != null) {
            str2 = str3;
        }
        sendLog.LIZLLL("open_from", str2);
        sendLog.LIZLLL("stage", this.LJLILLLLZI);
        sendLog.LIZLLL("duration", Long.valueOf(this.LJLJI));
        String str4 = "1";
        if (this.LJLJJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_success", obj);
        if (!this.LJLJJL) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("has_failed", str4);
        java.util.Map<String, String> map = this.LJLJJLL;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sendLog.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        C56045Lz7.LIZ.getClass();
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }
}
