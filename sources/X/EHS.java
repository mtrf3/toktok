package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.web.realtimeres.model.AdLandPagePrefetchModel;
import fjb.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule$prefetchByForest$1", f = "AdLandPageRealtimeResourceModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AdLandPageRealtimeResourceModule LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ AwemeRawAd LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHS(String str, AdLandPageRealtimeResourceModule adLandPageRealtimeResourceModule, String str2, String str3, String str4, AwemeRawAd awemeRawAd, InterfaceC67352kd<? super EHS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = adLandPageRealtimeResourceModule;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = awemeRawAd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EHS(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        String str;
        C141335gf.LIZJ(obj);
        String str2 = this.LJLIL;
        if (str2 == null) {
            str2 = this.LJLILLLLZI.LIZLLL(this.LJLJI, this.LJLJJI);
        }
        JSONObject LJIJJ = AdLandPagePreloadServiceImpl.LJJI().LJIJJ(str2);
        if (LJIJJ == null || LJIJJ.length() == 0) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = LJIJJ.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = LJIJJ.optJSONObject(next);
                if (optJSONObject != null) {
                    str = optJSONObject.toString();
                } else {
                    str = null;
                }
                if (next != null && str != null) {
                    try {
                        Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, (Class<Object>) AdLandPagePrefetchModel.PrefetchModel.class);
                        if (fromJson != null) {
                            linkedHashMap.put(next, fromJson);
                        }
                    } catch (s e) {
                        C78983UzD.LJIIZILJ(e);
                    }
                }
            }
        }
        C76732zl c76732zl = new C76732zl();
        java.util.Map<String, String> LIZ = WebAdUserAgentServiceImpl.LIZIZ().LIZ(null, this.LJLJJL, this.LJLJJLL.isEnableWebGoogleLogin());
        if (linkedHashMap != null) {
            AdLandPageRealtimeResourceModule adLandPageRealtimeResourceModule = this.LJLILLLLZI;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                AdLandPagePrefetchModel.PrefetchModel prefetchModel = (AdLandPagePrefetchModel.PrefetchModel) entry.getValue();
                String str3 = prefetchModel.url;
                if (c76732zl.element < 30) {
                    java.util.Map map = prefetchModel.reqHeader;
                    if (!C65777Prh.LJII(map) || map == null) {
                        map = new LinkedHashMap();
                    }
                    adLandPageRealtimeResourceModule.getClass();
                    AdLandPageRealtimeResourceModule.LJIIIIZZ(str3, map, LIZ);
                    c76732zl.element++;
                }
                linkedHashMap2.put(key, C76800UCe.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
