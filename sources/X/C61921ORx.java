package X;

import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.b;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequestV2$1$deferred$1$2", f = "StoreFragment.kt", l = {330}, m = "invokeSuspend")
/* renamed from: X.ORx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61921ORx extends AbstractC65782Prm implements InterfaceC88473Ynt<Long, Boolean, InterfaceC67352kd<? super TemplateData>, Object> {
    public int LJLIL;
    public /* synthetic */ long LJLILLLLZI;
    public /* synthetic */ boolean LJLJI;
    public final /* synthetic */ StoreFragment LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ m LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61921ORx(StoreFragment storeFragment, InterfaceC70422pa interfaceC70422pa, m mVar, InterfaceC67352kd<? super C61921ORx> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = storeFragment;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        j jVar;
        java.util.Set<Map.Entry<String, j>> entrySet;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI;
            if (this.LJLJI) {
                this.LJLJJI.LJLJLJ = j;
            }
            View skeleton_page = this.LJLJJI._$_findCachedViewById(R.id.k28);
            o.LJIIIIZZ(skeleton_page, "skeleton_page");
            skeleton_page.setVisibility(0);
            C61918ORu c61918ORu = this.LJLJJI.LJLILLLLZI;
            if (c61918ORu != null) {
                str = c61918ORu.LIZLLL;
            } else {
                str = null;
            }
            C72812tR c72812tR = new C72812tR(this.LJLJJLL, null);
            this.LJLIL = 1;
            obj = OS2.LIZ("shop", "homepage_get_v2", str, c72812tR, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Response response = (Response) obj;
        m mVar = (m) response.data;
        if (mVar != null) {
            jVar = mVar.LJJIJ("homepage_data");
        } else {
            jVar = null;
        }
        if (!(jVar instanceof m)) {
            jVar = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), jVar, C65330PkU.LIZJ(C65352Pkq.LIZLLL(GetShopHomepageData.class)));
            if (!(fromJson instanceof GetShopHomepageData)) {
                fromJson = null;
            }
            GetShopHomepageData getShopHomepageData = (GetShopHomepageData) fromJson;
            if (getShopHomepageData != null) {
                m mVar2 = new m();
                if (mVar != null && (entrySet = mVar.entrySet()) != null) {
                    for (Map.Entry<String, j> entry : entrySet) {
                        m mVar3 = new m();
                        mVar3.LJJIIJ("code", new Integer(response.code));
                        j value = entry.getValue();
                        if (value != null) {
                            mVar3.LJJII("data", value);
                        }
                        String key = entry.getKey();
                        o.LJIIIIZZ(key, "it.key");
                        b.LJJIIZI(key, String.valueOf(mVar3), mVar2);
                    }
                }
                b.LJJIIZI("recommend_context", this.LJLJJI.LJLLL, mVar2);
                b.LJJIIZI("page_start_time", String.valueOf(this.LJLJJI.LJLJLJ), mVar2);
                b.LJJIIZI("shop_name", getShopHomepageData.shop.shopName, mVar2);
                mVar2.LJJIIJ("shop_status", new Integer(getShopHomepageData.shop.status));
                if (o.LJ(getShopHomepageData.shop.onHoliday, Boolean.TRUE)) {
                    b.LJJIIZI("is_on_holiday", "1", mVar2);
                }
                this.LJLJJI.vl(getShopHomepageData);
                b.LJJIIZI("trackParams", C27739Aud.LJI(this.LJLJJI.LJLIL), mVar2);
                StoreFragment storeFragment = this.LJLJJI;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = storeFragment.LJLJJLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    C79081V1x.LJJJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "_ec_start_time", new Long(storeFragment.LJLJLJ));
                }
                XKX.LIZLLL(this.LJLJJL, null, null, new C40099FoV(this.LJLJJI, getShopHomepageData, null), 3);
                return TemplateData.LJFF(String.valueOf(mVar2));
            }
        } catch (s unused) {
        }
        throw new Exception("no data");
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Long l, Boolean bool, InterfaceC67352kd<? super TemplateData> interfaceC67352kd) {
        long longValue = l.longValue();
        boolean booleanValue = bool.booleanValue();
        C61921ORx c61921ORx = new C61921ORx(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c61921ORx.LJLILLLLZI = longValue;
        c61921ORx.LJLJI = booleanValue;
        return c61921ORx.invokeSuspend(C76800UCe.LIZ);
    }
}
