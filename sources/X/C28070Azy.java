package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Azy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28070Azy extends AbstractC69312nn {
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> LIZ = C45243HpH.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "payment_method");
        String str = "1";
        LIZ.put("is_reactivate", "1");
        LIZ.put("pay_type", this.LJ);
        LIZ.put("previous_page", this.LIZLLL);
        if (!this.LIZJ) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("is_success", str);
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        LIZ.put("fail_reason", str2);
        String str3 = this.LJI;
        if (str3 != null) {
            LIZ.put("entrance_info", str3);
        }
        String str4 = this.LJII;
        if (str4 != null) {
            LIZ.put("source_page_type", str4);
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28070Azy(boolean z, String prePage, String payType, String str, String str2, String str3) {
        super("tiktokec_result_show");
        o.LJIIIZ(prePage, "prePage");
        o.LJIIIZ(payType, "payType");
        this.LIZJ = z;
        this.LIZLLL = prePage;
        this.LJ = payType;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
    }
}
