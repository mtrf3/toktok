package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.router.ECMallRouterInterceptor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.HashMap;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.router.ECMallRouterInterceptor$goToMallTab$3", f = "ECMallRouterInterceptor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Lwn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55901Lwn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ boolean LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55901Lwn(C34K c34k, String str, String str2, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, String str3, String str4, String str5, String str6, boolean z, InterfaceC67352kd<? super C55901Lwn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c34k;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLJLJ = str5;
        this.LJLJLLL = str6;
        this.LJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55901Lwn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        String str2;
        C141335gf.LIZJ(obj);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        if (this.LJLIL.element) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String str3 = this.LJLILLLLZI;
        String str4 = this.LJLJI;
        String str5 = this.LJLJJI.element;
        String str6 = this.LJLJJL.element;
        String str7 = this.LJLJJLL;
        String str8 = this.LJLJL;
        String str9 = this.LJLJLJ;
        String str10 = this.LJLJLLL;
        boolean z = this.LJLL;
        c56092Lzs.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", str);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("deeplink_type", str3);
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("top_product_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("error_info", str5);
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("position_type", str6);
        if (str7 == null) {
            str7 = "";
        }
        hashMap.put("previous_page", str7);
        if (str8 == null) {
            str8 = "";
        }
        hashMap.put("schema", str8);
        if (str9 == null) {
            str9 = "";
        }
        hashMap.put("creative_id", str9);
        if (str10 == null) {
            str10 = "";
        }
        hashMap.put("campaign_id", str10);
        hashMap.put("has_landing_deeplink", Integer.valueOf(z ? 1 : 0));
        hashMap.put("enter_from", C56092Lzs.LIZLLL());
        C56092Lzs.LIZ(hashMap);
        java.util.Map<String, ? extends Object> map = ECMallRouterInterceptor.LJLJI;
        if (map != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj2 = ((LinkedHashMap) map).get("init_time");
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                j = CastLongProtector.parseLong(str2);
            } else {
                j = 0;
            }
            hashMap.put("duration", Long.valueOf(currentTimeMillis - j));
            hashMap.putAll(map);
        }
        C56092Lzs.LJIILJJIL("rd_tiktokec_mall_home_route", hashMap);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
