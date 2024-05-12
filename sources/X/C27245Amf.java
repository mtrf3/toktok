package X;

import java.util.LinkedHashMap;

/* renamed from: X.Amf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27245Amf extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ C27241Amb LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL = null;
    public final /* synthetic */ String LJLJJLL = null;
    public final /* synthetic */ String LJLJL = null;
    public final /* synthetic */ String LJLJLJ = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27245Amf(C27241Amb c27241Amb, boolean z, String str, long j) {
        super(1);
        this.LJLIL = c27241Amb;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        long j;
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "shipping_address");
        Object obj = ((LinkedHashMap) this.LJLIL.LIZ).get("previous_page");
        if (obj == null) {
            obj = "";
        }
        c27943Axv2.LIZLLL("previous_page", obj);
        c27943Axv2.LIZLLL("is_success", Boolean.valueOf(this.LJLILLLLZI));
        String str = this.LJLJI;
        if (str != null) {
            c27943Axv2.LIZLLL("fail_reason", str);
        }
        C27241Amb c27241Amb = this.LJLIL;
        if (c27241Amb.LIZLLL) {
            j = 0;
        } else {
            j = c27241Amb.LIZJ;
        }
        c27943Axv2.LIZLLL("api_duration", Long.valueOf(j));
        c27943Axv2.LIZLLL("duration", Long.valueOf(this.LJLJJI));
        String str2 = this.LJLJJL;
        if (str2 != null) {
            c27943Axv2.LIZLLL("entrance_info", str2);
        }
        String str3 = this.LJLJJLL;
        if (str3 != null) {
            c27943Axv2.LIZLLL("entrance_form", str3);
        }
        String str4 = this.LJLJL;
        if (str4 != null) {
            c27943Axv2.LIZLLL("source_page_type", str4);
        }
        String str5 = this.LJLJLJ;
        if (str5 != null) {
            c27943Axv2.LIZLLL("order_id", str5);
        }
        return C76800UCe.LIZ;
    }
}
