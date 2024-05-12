package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ahj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26939Ahj extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI = "shipping_type";
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Float LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ java.util.Map<String, String> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26939Ahj(java.util.Map map, String str, int i, String str2, Float f, String str3, String str4, String str5, java.util.Map map2) {
        super(1);
        this.LJLIL = map;
        this.LJLILLLLZI = str;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = f;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
        this.LJLL = map2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.putAll(this.LJLIL);
        Object obj = this.LJLILLLLZI;
        if (obj == null) {
            obj = "";
        }
        sendLog.put("option_name", obj);
        sendLog.put("option_type", this.LJLJI);
        sendLog.put("rank", Integer.valueOf(this.LJLJJI));
        Object obj2 = this.LJLJJL;
        if (obj2 != null) {
            sendLog.put("sub_page_name", obj2);
        }
        Float f = this.LJLJJLL;
        if (f != null) {
            f.floatValue();
            sendLog.put("shipping_price", f);
        }
        Object obj3 = this.LJLJL;
        if (obj3 != null) {
            sendLog.put("shipping_currency", obj3);
        }
        Object obj4 = this.LJLJLJ;
        if (obj4 != null) {
            sendLog.put("free_shipping_condition", obj4);
        }
        Object obj5 = this.LJLJLLL;
        if (obj5 != null) {
            sendLog.put("is_next_day_delivery", obj5);
        }
        java.util.Map<? extends String, ? extends Object> map2 = this.LJLL;
        if (map2 != null) {
            sendLog.putAll(map2);
        }
        return C76800UCe.LIZ;
    }
}
